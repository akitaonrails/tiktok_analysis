package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS26S2200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0niU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editpost.EditPostPublishScene$initDownloadVideoManager$1", f = "EditPostPublishScene.kt", l = {}, m = "invokeSuspend")
public final class C1445400niU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1445410niV LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445400niU(C1445410niV c1445410niV, String str, InterfaceC1364105Vn<? super C1445400niU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1445410niV;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1445400niU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        VideoUrlModel videoPlayAddr;
        List<String> urlList;
        String str;
        SimVideoUrlModel videoCacheModel;
        CreativeModel creativeModel2;
        EditPostModel editPostModel2;
        C1C7U.LIZ("EditPostPublishScene@f667.initDownloadVideoManager$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoPublishEditModel videoPublishEditModel = this.LL.LLJLLL;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null && (videoPlayAddr = editPostModel.getVideoPlayAddr()) != null && (urlList = videoPlayAddr.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
            String str2 = this.LLILLJJLI;
            if (str2 != null) {
                String strLJIIIIZZ = C1443230nez.LJIIIIZZ(str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C08HM.LIZJ(this.LLILLJJLI));
                sbLIZ.append(".mp4");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJIIIIZZ);
                sbLIZ2.append(File.separator);
                sbLIZ2.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                boolean zLIZJ = C2286708xd.LIZJ(strLIZIZ2);
                C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
                String str3 = this.LLILLJJLI;
                Keva keva = C1445750nj3.LJII;
                boolean z = keva.getBoolean(str3, false);
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fullPath: ");
                sbLIZ3.append(strLIZIZ2);
                sbLIZ3.append(" , fileExist: ");
                sbLIZ3.append(zLIZJ);
                sbLIZ3.append(",  hasDownload: ");
                sbLIZ3.append(z);
                c1437510nVlLJJLIIIJ.LIZ("EditPostPublishScene", C2188811AlT.LIZIZ(sbLIZ3));
                if (zLIZJ) {
                    if (z) {
                        VideoPublishEditModel videoPublishEditModel2 = this.LL.LLJLLL;
                        if (videoPublishEditModel2 != null) {
                            C1443230nez.LJ(videoPublishEditModel2, strLIZIZ2);
                        }
                        this.LL.LLLJ = true;
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("EditPostPublishScene@f667.initDownloadVideoManager$1");
                        return unit;
                    }
                    new C0VSJ(strLIZIZ2).delete();
                } else if (z) {
                    keva.storeBoolean(this.LLILLJJLI, false);
                }
                C1445410niV c1445410niV = this.LL;
                C1445750nj3.LIZJ = new AwS26S2200000_22(c1445410niV, this.LLILLJJLI, strLIZIZ2, 1);
                C1445750nj3.LJ = new AwS601S0100000_22(c1445410niV, 838);
                C1445750nj3.LIZLLL = new AwS566S0100000_22(c1445410niV, 1037);
                VideoPublishEditModel videoPublishEditModel3 = c1445410niV.LLJLLL;
                if (videoPublishEditModel3 != null && (creativeModel2 = videoPublishEditModel3.creativeModel) != null && (editPostModel2 = creativeModel2.editPostModel) != null) {
                    videoCacheModel = editPostModel2.getVideoCacheModel();
                } else {
                    videoCacheModel = null;
                }
                C1445750nj3.LIZIZ(videoCacheModel, str, strLJIIIIZZ, strLIZIZ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EditPostPublishScene@f667.initDownloadVideoManager$1");
                return unit2;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EditPostPublishScene@f667.initDownloadVideoManager$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
