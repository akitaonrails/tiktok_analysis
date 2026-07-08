package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import com.ss.android.ugc.aweme.services.optimization.IRequestMusicPreloadService;
import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver$startShoot$6", f = "BottomPublishObserver.kt", l = {}, m = "invokeSuspend")
public final class C859240XnG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BottomPublishObserver LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859240XnG(BottomPublishObserver bottomPublishObserver, String str, InterfaceC1364105Vn<? super C859240XnG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bottomPublishObserver;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859240XnG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomPublishObserver@8f34.startShoot$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((IRequestMusicPreloadService) ServiceManager.get().getService(IRequestMusicPreloadService.class)).preDownloadMusic(this.LL.LLILLJJLI, null, new IServiceMusicResDownListener() { // from class: X.0XnH
            @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
            public final void onFailed() {
            }

            @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
            public final void onSuccess(MusicModel musicModel, String str) {
            }

            @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
            public final Map<String, Object> getMusicRecommendExtra() {
                return C0XED.LJ(C526890KlT.LIZIZ);
            }
        }, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomPublishObserver@8f34.startShoot$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
