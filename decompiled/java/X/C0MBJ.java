package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.SaveDraftByPath$saveVideoCoverAsync$2", f = "SaveDraftByPath.kt", l = {}, m = "invokeSuspend")
public final class C0MBJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C05XL<Unit>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MBJ(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C0MBJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MBJ c0mbj = new C0MBJ(this.LLILLJJLI, interfaceC1364105Vn);
        c0mbj.LL = obj;
        return c0mbj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZJ;
        C1C7U.LIZ("SaveDraftByPath@46c6.saveVideoCoverAsync$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C099F c099fLIZIZ = C090F.LIZIZ();
        MultiEditVideoStatusRecordData multiEditVideoRecordData = this.LLILLJJLI.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null) {
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
            if (TextUtils.isEmpty(multiEditVideoRecordData.coverImagePath)) {
                if (C0MBI.LIZ()) {
                    C0MH8.LIZ.getClass();
                    strLIZJ = C0MH8.LJI(videoPublishEditModel, -2);
                } else {
                    strLIZJ = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
                }
                multiEditVideoRecordData.coverImagePath = strLIZJ;
            }
            int videoCoverStartTm = (int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
            C1457050o1H c1457050o1H = new C1456230nzx(videoPublishEditModel).LIZ;
            c1457050o1H.LJFF = videoCoverStartTm;
            c1457050o1H.LJIILL = 0;
            c1457050o1H.LIZIZ = multiEditVideoRecordData.coverImagePath;
            c1457050o1H.LIZJ = new C0MBV() { // from class: X.0MBL
                @Override // X.C0MBV
                public final void LIZLLL() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C0MBE.LIZIZ);
                    sbLIZ.append(" -> genVideoPublishEditModel -> saveVideoCoverAsync success");
                    C201955140j.LIZIZ("CoverAsyncExtractMethodCallExp", C2188811AlT.LIZIZ(sbLIZ));
                    c099fLIZIZ.LJIIZILJ(Unit.LIZ);
                }
            };
            c1457050o1H.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0MBK
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C0MBE.LIZIZ);
                    sbLIZ.append(" -> genVideoPublishEditModel -> saveVideoCoverAsync failed: code=");
                    sbLIZ.append(i);
                    sbLIZ.append(", msg=");
                    sbLIZ.append(str);
                    C201955140j.LJFF("CoverAsyncExtractMethodCallExp", C2188811AlT.LIZIZ(sbLIZ));
                    C05XL<Unit> c05xl = c099fLIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Failed to extract cover asynchronously: code=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", msg=");
                    sbLIZ2.append(str);
                    c05xl.LJJJJJ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
                }
            };
            C2286608xc.LJ(C1457060o1I.LIZIZ(c1457050o1H));
        } else {
            Boolean.valueOf(c099fLIZIZ.LJJLIIIJILLIZJL(Unit.LIZ));
        }
        C1C7U.LIZIZ("SaveDraftByPath@46c6.saveVideoCoverAsync$2");
        return c099fLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C05XL<Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
