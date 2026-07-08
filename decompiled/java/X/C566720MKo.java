package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.story.celebration.CelebrationRenderedVideo;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.repo.CelebrationMaterialRepo$downloadRenderVideo$2", f = "CelebrationMaterialRepo.kt", l = {348}, m = "invokeSuspend")
public final class C566720MKo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ CelebrationRenderedVideo LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566720MKo(int i, CelebrationRenderedVideo celebrationRenderedVideo, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = celebrationRenderedVideo;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C566720MKo(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        List listSingletonList;
        Object objLIZ = obj;
        C1C7U.LIZ("CelebrationMaterialRepo@27f7.downloadRenderVideo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            CelebrationRenderedVideo celebrationRenderedVideo = this.LLILLJJLI;
            String str3 = "";
            if (celebrationRenderedVideo != null && (str = celebrationRenderedVideo.videoUrl) != null && str.length() != 0) {
                C0MLB c0mlbLIZJ = C0MLC.LIZ.LIZJ(this.LLILLL);
                CelebrationRenderedVideo celebrationRenderedVideo2 = this.LLILLJJLI;
                c0mlbLIZJ.LJI = celebrationRenderedVideo2;
                C568030MPp c568030MPp = C568030MPp.LIZ;
                int i2 = c0mlbLIZJ.LIZ;
                c568030MPp.getClass();
                Keva kevaLJII = C568030MPp.LJII(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                if (celebrationRenderedVideo2 == null) {
                    kevaLJII.erase(String.valueOf(i2));
                } else {
                    String strValueOf = String.valueOf(i2);
                    C1227904rF.LIZ.getClass();
                    kevaLJII.storeString(strValueOf, C1227904rF.LJI(celebrationRenderedVideo2));
                }
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sb = new StringBuilder("CeleMaterialKeva, storeRenderVideoInfo for celebrationType: ");
                sb.append(i2);
                sb.append(", videoId: ");
                if (celebrationRenderedVideo2 != null) {
                    str2 = celebrationRenderedVideo2.videoId;
                } else {
                    str2 = null;
                }
                sb.append(str2);
                C201955140j.LIZJ(c554890LpX, sb.toString());
                C566620MKe c566620MKe = C566620MKe.LIZ;
                int i3 = this.LLILLL;
                String str4 = this.LLILLJJLI.videoId;
                c566620MKe.getClass();
                String strLIZJ = C566620MKe.LIZJ(i3, str4);
                C0VSJ c0vsj = new C0VSJ(strLIZJ);
                if (c0vsj.exists() && c0vsj.length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CeleMaterialRepo, downloadRenderVideo: file already exists, videoId=");
                    sbLIZ.append(this.LLILLJJLI.videoId);
                    C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadRenderVideo$2");
                    return strLIZJ;
                }
                String parent = c0vsj.getParent();
                if (parent != null) {
                    str3 = parent;
                }
                ForwardMediaDownloader.DownloadConfig downloadConfig = new ForwardMediaDownloader.DownloadConfig(str3, c0vsj.getName(), strLIZJ, true, -1L, false);
                final CelebrationRenderedVideo celebrationRenderedVideo3 = this.LLILLJJLI;
                this.LL = 1;
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                String str5 = celebrationRenderedVideo3.videoUrl;
                if (str5 == null || (listSingletonList = Collections.singletonList(str5)) == null) {
                    listSingletonList = C13BV.INSTANCE;
                }
                ForwardVideo forwardVideo = new ForwardVideo(listSingletonList, null, 0, 0, 0, null, null, null, false, null, null, null, 0, null, 16382, null);
                String str6 = celebrationRenderedVideo3.videoId;
                str6.toString();
                ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LIZJ().download(new ForwardMedia(str6, 0, null, null, null, forwardVideo, 0.0f, null, null, null, 0L, 0, null, false, null, downloadConfig.cacheDir, downloadConfig.fileName, downloadConfig.filePath, false, null, null, null, null, null, null, 33325022, null).video, downloadConfig, null, true, new ForwardMediaDownloader.DownloadListener() { // from class: X.0MKn
                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                    public final void onFileHeaderInfoReady(boolean z) {
                    }

                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                    public final void onSuccess(String str7) {
                        Object c098200Yq;
                        C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("CeleMaterialRepo, downloadRenderVideo success: videoId=");
                        sbLIZ2.append(celebrationRenderedVideo3.videoId);
                        C201955140j.LIZJ(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
                        InterfaceC1364105Vn<String> interfaceC1364105Vn = c23260099m;
                        try {
                            C189200o6.m2constructorimpl(str7);
                            interfaceC1364105Vn.resumeWith(str7);
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            C554890LpX c554890LpX3 = C554890LpX.LIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("resume error ");
                            sbLIZ3.append(thM5exceptionOrNullimpl);
                            C201955140j.LJII(c554890LpX3, C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                    public final void onError(int i4, String str7, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
                        Object c098200Yq;
                        C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("CeleMaterialRepo, downloadRenderVideo failed: videoId=");
                        sbLIZ2.append(celebrationRenderedVideo3.videoId);
                        sbLIZ2.append(", code=");
                        sbLIZ2.append(i4);
                        sbLIZ2.append(", msg=");
                        sbLIZ2.append(str7);
                        C201955140j.LJII(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
                        InterfaceC1364105Vn<String> interfaceC1364105Vn = c23260099m;
                        try {
                            C189200o6.m2constructorimpl("");
                            interfaceC1364105Vn.resumeWith("");
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            C554890LpX c554890LpX3 = C554890LpX.LIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("resume error ");
                            sbLIZ3.append(thM5exceptionOrNullimpl);
                            C201955140j.LJII(c554890LpX3, C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                });
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadRenderVideo$2");
                    return objLJFF;
                }
            } else {
                C201955140j.LJIJI(C554890LpX.LIZIZ, "CeleMaterialRepo, downloadRenderVideo failed: invalid renderVideo");
                C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadRenderVideo$2");
                return "";
            }
        }
        C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadRenderVideo$2");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
