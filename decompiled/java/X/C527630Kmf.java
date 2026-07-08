package X;

import com.ss.android.ugc.aweme.setting.performance.AutoMusicDiskCacheOpt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIMusicPreRequestCacheManager$markCacheUsed$1", f = "AIMusicPreRequestCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C527630Kmf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C527630Kmf(InterfaceC1364105Vn<? super C527630Kmf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C527630Kmf(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIMusicPreRequestCacheManager@c436.markCacheUsed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((AutoMusicDiskCacheOpt.AutoMusicDiskCacheConfig) AutoMusicDiskCacheOpt.LIZIZ.getValue()).cleanCacheWhenUsed) {
            C533510Kw9.LIZ.getClass();
            C533510Kw9.LIZJ().clear();
        } else {
            C533510Kw9.LIZ.getClass();
            C533510Kw9.LIZJ().storeLong("auto_music_disk_last_cache_time", 0L);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIMusicPreRequestCacheManager@c436.markCacheUsed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C527630Kmf(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
