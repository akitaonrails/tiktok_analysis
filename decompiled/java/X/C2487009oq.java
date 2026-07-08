package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.MagicI2InfoModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.ui.MagicApplyHandler$saveMagicBitmap$3", f = "MagicApplyHandler.kt", l = {}, m = "invokeSuspend")
public final class C2487009oq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2487009oq(VideoPublishEditModel videoPublishEditModel, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2487009oq(this.LLILLL, this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("MagicApplyHandler@7aa1.saveMagicBitmap$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = this.LL;
        if (str2 != null && str2.length() != 0 && (str = this.LLILLJJLI) != null && str.length() != 0) {
            C559380Lwm c559380Lwm = C559380Lwm.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key: ");
            sbLIZ.append(this.LL);
            sbLIZ.append(", value: ");
            sbLIZ.append(this.LLILLJJLI);
            C201955140j.LIZLLL(c559380Lwm, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLL.creativeModel.editorProAIGCInfoModel.magicI2IInfoModelMap.put(this.LL, new MagicI2InfoModel(this.LLILLJJLI));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MagicApplyHandler@7aa1.saveMagicBitmap$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
