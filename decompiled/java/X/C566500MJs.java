package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeDefaultMusicModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.router.UploadActionInterceptor;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.router.UploadActionInterceptor$buildExtraParams$2$musicFetchJob$1$1", f = "UploadActionInterceptor.kt", l = {548}, m = "invokeSuspend")
public final class C566500MJs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PhotoModeDefaultMusicModel>, Object> {
    public int LL;
    public final /* synthetic */ UploadActionInterceptor LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566500MJs(UploadActionInterceptor uploadActionInterceptor, Context context, String str, InterfaceC1364105Vn<? super C566500MJs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = uploadActionInterceptor;
        this.LLILLL = context;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C566500MJs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadActionInterceptor@7bd5.buildExtraParams$2$musicFetchJob$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final UploadActionInterceptor uploadActionInterceptor = this.LLILLJJLI;
            Context context = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            uploadActionInterceptor.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            final long jNanoTime = System.nanoTime();
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJ(context, str, new InterfaceC20498115It() { // from class: X.0MJt
                @Override // X.InterfaceC20498115It
                public final void onFailed(Exception exc) {
                    C2344809Gs.LJI(exc);
                    InterfaceC1364105Vn<PhotoModeDefaultMusicModel> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                }

                @Override // X.InterfaceC20498115It
                public final void onSuccess(MusicModel musicModel, String str2) {
                    uploadActionInterceptor.getClass();
                    System.nanoTime();
                    if (str2 != null && musicModel != null) {
                        InterfaceC1364105Vn<PhotoModeDefaultMusicModel> interfaceC1364105Vn = c23260099m;
                        PhotoModeDefaultMusicModel photoModeDefaultMusicModel = new PhotoModeDefaultMusicModel(musicModel, str2);
                        C189200o6.m2constructorimpl(photoModeDefaultMusicModel);
                        interfaceC1364105Vn.resumeWith(photoModeDefaultMusicModel);
                        return;
                    }
                    InterfaceC1364105Vn<PhotoModeDefaultMusicModel> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn2.resumeWith(null);
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UploadActionInterceptor@7bd5.buildExtraParams$2$musicFetchJob$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UploadActionInterceptor@7bd5.buildExtraParams$2$musicFetchJob$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PhotoModeDefaultMusicModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
