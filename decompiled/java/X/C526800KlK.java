package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.IRequestMusicPreloadService;
import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIMusicPreRequestCacheManager$useCacheAndClearOpt$1", f = "AIMusicPreRequestCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C526800KlK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WeakReference<C19EG> LL;
    public final /* synthetic */ Long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526800KlK(WeakReference<C19EG> weakReference, Long l, InterfaceC1364105Vn<? super C526800KlK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = weakReference;
        this.LLILLJJLI = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526800KlK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIMusicPreRequestCacheManager@c436.useCacheAndClearOpt$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG c19eg = this.LL.get();
        if (c19eg != null) {
            ((IRequestMusicPreloadService) ServiceManager.get().getService(IRequestMusicPreloadService.class)).preDownloadMusic(c19eg, null, new IServiceMusicResDownListener() { // from class: X.0KlL
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
            }, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("useCacheAndClearOpt musicId:");
            sbLIZ.append(this.LLILLJJLI);
            C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIMusicPreRequestCacheManager@c436.useCacheAndClearOpt$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
