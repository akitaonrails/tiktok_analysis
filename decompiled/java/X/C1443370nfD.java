package X;

import com.bytedance.keva.Keva;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoReEditVm;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS105S1200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0nfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoReEditVm$checkAndDownloadEditPostVideo$1", f = "PcsVideoReEditVm.kt", l = {}, m = "invokeSuspend")
public final class C1443370nfD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ PcsVideoReEditVm LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ Function1<DownloadInfo, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1443370nfD(VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0, PcsVideoReEditVm pcsVideoReEditVm, Function1<? super Boolean, Unit> function1, Function1<? super DownloadInfo, Unit> function12, InterfaceC1364105Vn<? super C1443370nfD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = function0;
        this.LLILLL = pcsVideoReEditVm;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1443370nfD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        VideoUrlModel videoPlayAddr;
        List<String> urlList;
        final String str;
        String strLIZIZ;
        SimVideoUrlModel videoCacheModel;
        CreativeModel creativeModel2;
        EditPostModel editPostModel2;
        C1C7U.LIZ("PcsVideoReEditVm@1ba7.checkAndDownloadEditPostVideo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoPublishEditModel videoPublishEditModel = this.LL;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null && (videoPlayAddr = editPostModel.getVideoPlayAddr()) != null && (urlList = videoPlayAddr.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
            InterfaceC489200JGk interfaceC489200JGk = this.LLILLL.getState().LLILLL;
            if (interfaceC489200JGk != null && (strLIZIZ = interfaceC489200JGk.LIZIZ()) != null) {
                C1443310nf7 c1443310nf7 = C1443310nf7.LIZIZ;
                final String strLJII = c1443310nf7.LJII(strLIZIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C08HM.LIZJ(strLIZIZ));
                sbLIZ.append(".mp4");
                final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJII);
                String str2 = File.separator;
                sbLIZ2.append(str2);
                sbLIZ2.append(strLIZIZ2);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
                boolean zLIZJ = C2286708xd.LIZJ(strLIZIZ3);
                C1445760nj4.LIZ.getClass();
                Keva keva = C1445760nj4.LJI;
                boolean z = keva.getBoolean(strLIZIZ, false);
                if (zLIZJ) {
                    if (z) {
                        c1443310nf7.LIZJ(this.LL, strLIZIZ3);
                        this.LLILZ.invoke(true);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PcsVideoReEditVm@1ba7.checkAndDownloadEditPostVideo$1");
                        return unit;
                    }
                    new C0VSJ(strLIZIZ3).delete();
                } else if (z) {
                    keva.storeBoolean(strLIZIZ, false);
                }
                VideoPublishEditModel videoPublishEditModel2 = this.LL;
                Function1<Boolean, Unit> function1 = this.LLILZ;
                Function1<DownloadInfo, Unit> function12 = this.LLILZIL;
                Function0<Unit> function0 = this.LLILLJJLI;
                C1445760nj4.LIZJ = new AwS105S1200000_22(videoPublishEditModel2, strLIZIZ3, function1, 7);
                C1445760nj4.LJ = new AwS601S0100000_22(function12, (Function1<? super Map<Integer, String>, Unit>) 788);
                C1445760nj4.LIZLLL = new AwS566S0100000_22(function0, (Function0<Boolean>) 1007);
                if (videoPublishEditModel2 != null && (creativeModel2 = videoPublishEditModel2.creativeModel) != null && (editPostModel2 = creativeModel2.editPostModel) != null) {
                    videoCacheModel = editPostModel2.getVideoCacheModel();
                } else {
                    videoCacheModel = null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLJII);
                sbLIZ3.append(str2);
                sbLIZ3.append(strLIZIZ2);
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ3);
                final C013C c013c = new C013C();
                if (videoCacheModel != null) {
                    C1483340ohg.LJIIL(videoCacheModel, strLIZIZ4, false, false, new InterfaceC1475840oVa() { // from class: X.0nfE
                        @Override // X.InterfaceC1475840oVa
                        public final /* synthetic */ void LIZ(long j, long j2) {
                        }

                        @Override // X.InterfaceC1475840oVa
                        public final void LIZIZ(int i) {
                            C1445760nj4 c1445760nj4 = C1445760nj4.LIZ;
                            String str3 = str;
                            String str4 = strLJII;
                            String str5 = strLIZIZ2;
                            c1445760nj4.getClass();
                            C1445760nj4.LIZ(str3, str4, str5);
                        }

                        @Override // X.InterfaceC1475840oVa
                        public final void onCopyComplete(boolean z2, int i, String str3) {
                            Function1<? super Boolean, Unit> function13;
                            if (z2) {
                                if (!c013c.element && (function13 = C1445760nj4.LIZJ) != null) {
                                    function13.invoke(Boolean.TRUE);
                                }
                                c013c.element = true;
                                return;
                            }
                            C1445760nj4 c1445760nj4 = C1445760nj4.LIZ;
                            String str4 = str;
                            String str5 = strLJII;
                            String str6 = strLIZIZ2;
                            c1445760nj4.getClass();
                            C1445760nj4.LIZ(str4, str5, str6);
                        }
                    });
                } else {
                    C1445760nj4.LIZ(str, strLJII, strLIZIZ2);
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PcsVideoReEditVm@1ba7.checkAndDownloadEditPostVideo$1");
                return unit2;
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("PcsVideoReEditVm@1ba7.checkAndDownloadEditPostVideo$1");
            return unit3;
        }
        this.LLILLJJLI.invoke();
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoReEditVm@1ba7.checkAndDownloadEditPostVideo$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
