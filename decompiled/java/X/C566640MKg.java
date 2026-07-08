package X;

import Y.AObjectS527S0100000_8;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$downloadSelectDataList$1", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
public final class C566640MKg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<OnThisDayTiktokMediaModel> LL;
    public final /* synthetic */ Function2<Long, Long, Unit> LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C566640MKg(List<OnThisDayTiktokMediaModel> list, Function2<? super Long, ? super Long, Unit> function2, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C566640MKg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = function2;
        this.LLILLL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C566640MKg(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.downloadSelectDataList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList<OnThisDayTiktokMediaModel> arrayList = new ArrayList();
        ArrayList<OnThisDayTiktokMediaModel> arrayList2 = new ArrayList();
        for (OnThisDayTiktokMediaModel onThisDayTiktokMediaModel : this.LL) {
            if (onThisDayTiktokMediaModel.forwardMedia != null) {
                if (onThisDayTiktokMediaModel.LJIIJ()) {
                    arrayList.add(onThisDayTiktokMediaModel);
                } else {
                    arrayList2.add(onThisDayTiktokMediaModel);
                }
            }
        }
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadSelectDataList: start download. imageList size: ");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(", videoList size: ");
        sbLIZ.append(arrayList2.size());
        C201955140j.LIZLLL(c201967140v, "ForwardEnvironment", C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            this.LLILLJJLI.invoke(C2286608xc.LJFF(0L), C2286608xc.LJFF(0L));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.downloadSelectDataList$1");
            return unit;
        }
        C566680MKk c566680MKk = new C566680MKk(arrayList.size() + arrayList2.size(), new AObjectS527S0100000_8(this.LLILLJJLI, 0));
        final CreativeInfo creativeInfo = this.LLILLL;
        for (final OnThisDayTiktokMediaModel onThisDayTiktokMediaModel2 : arrayList) {
            C0MKJ c0mkj = C0MKJ.LIZ;
            final AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c566680MKk, 1);
            c0mkj.getClass();
            final ForwardMedia forwardMedia = onThisDayTiktokMediaModel2.forwardMedia;
            if (forwardMedia == null) {
                awS552S0100000_8.invoke();
            } else {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final List<ForwardMediaDownloader.DownloadConfig> listLJII = C0MKJ.LJII(forwardMedia);
                ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJFF().downloadPhotoModeResource(forwardMedia, listLJII, false, new ForwardImageDownloader.ImageDownloadListener() { // from class: X.0MKm
                    public boolean LIZ;

                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader.ImageDownloadListener
                    public final void onFileHeaderInfoReady(boolean z) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader.ImageDownloadListener
                    public final void onSuccess(List<String> list) {
                        boolean z;
                        synchronized (this) {
                            try {
                                if (this.LIZ) {
                                    z = true;
                                } else {
                                    this.LIZ = true;
                                    z = false;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (z) {
                            return;
                        }
                        List listLLIILII = C13LP.LLIILII(list, listLJII);
                        CreativeInfo creativeInfo2 = creativeInfo;
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLLIILII, 10));
                        for (Pair pair : (ArrayList) listLLIILII) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo2, EnumC20228214Cy.CONCAT, null, false, 12));
                            sbLIZ2.append(((ForwardMediaDownloader.DownloadConfig) pair.getSecond()).fileName);
                            ?? LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            if (!C2471909mP.LIZJ((String) pair.getFirst(), LIZIZ)) {
                                LIZIZ = pair.getFirst();
                            }
                            arrayList3.add(LIZIZ);
                        }
                        String str = (String) C13LP.LJJJLZIJ(0, arrayList3);
                        onThisDayTiktokMediaModel2.LJIILL(str);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str, options);
                        OnThisDayTiktokMediaModel onThisDayTiktokMediaModel3 = onThisDayTiktokMediaModel2;
                        onThisDayTiktokMediaModel3.width = options.outWidth;
                        onThisDayTiktokMediaModel3.height = options.outHeight;
                        C201967140v c201967140v2 = C201967140v.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("downloadSelectDataList: download image finish. id: ");
                        sbLIZ3.append(((MediaModel) onThisDayTiktokMediaModel2).id);
                        sbLIZ3.append(", fileLocalUriPath: ");
                        sbLIZ3.append(onThisDayTiktokMediaModel2.LJFF());
                        C201955140j.LIZLLL(c201967140v2, "ForwardEnvironment", C2188811AlT.LIZIZ(sbLIZ3));
                        awS552S0100000_8.invoke();
                        C0ML7 c0ml7 = C0ML7.LIZ;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        c0ml7.getClass();
                        C0ML7.LJIIJJI(0, 0, 1, jCurrentTimeMillis2, "view_all", "");
                    }

                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader.ImageDownloadListener
                    public final void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
                        boolean z;
                        synchronized (this) {
                            try {
                                z = true;
                                if (!this.LIZ) {
                                    this.LIZ = true;
                                    z = false;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (z) {
                            return;
                        }
                        C201967140v c201967140v2 = C201967140v.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("downloadSelectDataList: download image failed. id: ");
                        sbLIZ2.append(((MediaModel) onThisDayTiktokMediaModel2).id);
                        sbLIZ2.append(", code: ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", msg: ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", exception: ");
                        sbLIZ2.append(C201955140j.LJIIJJI(exc));
                        C201955140j.LIZLLL(c201967140v2, "ForwardEnvironment", C2188811AlT.LIZIZ(sbLIZ2));
                        awS552S0100000_8.invoke();
                        C0ML7 c0ml7 = C0ML7.LIZ;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("url: ");
                        sbLIZ3.append(C0MKZ.LIZ(forwardMedia));
                        sbLIZ3.append(", code: ");
                        sbLIZ3.append(i);
                        sbLIZ3.append(", msg: ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(".\nexception: ");
                        sbLIZ3.append(C201955140j.LJIIJJI(exc));
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        c0ml7.getClass();
                        C0ML7.LJIIJJI(1, 0, 1, jCurrentTimeMillis2, "view_all", strLIZIZ);
                    }
                });
            }
        }
        final CreativeInfo creativeInfo2 = this.LLILLL;
        for (final OnThisDayTiktokMediaModel onThisDayTiktokMediaModel3 : arrayList2) {
            C0MKJ c0mkj2 = C0MKJ.LIZ;
            final AwS552S0100000_8 awS552S0100000_82 = new AwS552S0100000_8(c566680MKk, 2);
            c0mkj2.getClass();
            final ForwardMedia forwardMedia2 = onThisDayTiktokMediaModel3.forwardMedia;
            if (forwardMedia2 == null) {
                awS552S0100000_82.invoke();
            } else {
                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                final ForwardMediaDownloader.DownloadConfig downloadConfigLJI = C0MKJ.LJI(forwardMedia2);
                ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LIZJ().download(forwardMedia2.video, downloadConfigLJI, null, ((Boolean) C0BDT.LIZ.getValue()).booleanValue(), new ForwardMediaDownloader.DownloadListener() { // from class: X.0MKl
                    public boolean LIZ;

                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                    public final void onFileHeaderInfoReady(boolean z) {
                    }

                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                    public final void onSuccess(String str) {
                        boolean z;
                        synchronized (this) {
                            try {
                                z = true;
                                if (!this.LIZ) {
                                    this.LIZ = true;
                                    z = false;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (z) {
                            return;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo2, EnumC20228214Cy.CONCAT, null, false, 12));
                        sbLIZ2.append(downloadConfigLJI.fileName);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        if (C2471909mP.LIZJ(str, strLIZIZ)) {
                            str = strLIZIZ;
                        }
                        onThisDayTiktokMediaModel3.LJIILL(str);
                        C201967140v c201967140v2 = C201967140v.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("downloadSelectDataList: download video finish. id: ");
                        sbLIZ3.append(((MediaModel) onThisDayTiktokMediaModel3).id);
                        sbLIZ3.append(", fileLocalUriPath: ");
                        sbLIZ3.append(onThisDayTiktokMediaModel3.LJFF());
                        C201955140j.LIZLLL(c201967140v2, "ForwardEnvironment", C2188811AlT.LIZIZ(sbLIZ3));
                        awS552S0100000_82.invoke();
                        C0ML7 c0ml7 = C0ML7.LIZ;
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                        c0ml7.getClass();
                        C0ML7.LJIIJJI(0, 1, 0, jCurrentTimeMillis3, "view_all", "");
                    }

                    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                    public final void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
                        boolean z;
                        synchronized (this) {
                            try {
                                z = true;
                                if (!this.LIZ) {
                                    this.LIZ = true;
                                    z = false;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (z) {
                            return;
                        }
                        C201967140v c201967140v2 = C201967140v.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("downloadSelectDataList: download video failed. id: ");
                        sbLIZ2.append(((MediaModel) onThisDayTiktokMediaModel3).id);
                        sbLIZ2.append(", code: ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", msg: ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", exception: ");
                        sbLIZ2.append(C201955140j.LJIIJJI(exc));
                        C201955140j.LIZLLL(c201967140v2, "ForwardEnvironment", C2188811AlT.LIZIZ(sbLIZ2));
                        awS552S0100000_82.invoke();
                        C0ML7 c0ml7 = C0ML7.LIZ;
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("url: ");
                        sbLIZ3.append(C0MKZ.LIZJ(forwardMedia2));
                        sbLIZ3.append(", code: ");
                        sbLIZ3.append(i);
                        sbLIZ3.append(", msg: ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(".\nexception: ");
                        sbLIZ3.append(C201955140j.LJIIJJI(exc));
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        c0ml7.getClass();
                        C0ML7.LJIIJJI(1, 1, 0, jCurrentTimeMillis3, "view_all", strLIZIZ);
                    }
                });
            }
        }
        try {
            c566680MKk.await();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.downloadSelectDataList$1");
        return unit2;
    }
}
