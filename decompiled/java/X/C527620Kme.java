package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.performance.AutoMusicDiskCacheOpt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIMusicPreRequestCacheManager$setDiskCache$1", f = "AIMusicPreRequestCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C527620Kme extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MusicModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527620Kme(MusicModel musicModel, InterfaceC1364105Vn<? super C527620Kme> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C527620Kme c527620Kme = new C527620Kme(this.LLILLJJLI, interfaceC1364105Vn);
        c527620Kme.LL = obj;
        return c527620Kme;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AIMusicPreRequestCacheManager@c436.setDiskCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MusicModel musicModel = this.LLILLJJLI;
        try {
            C533510Kw9.LIZ.getClass();
            long j = C533510Kw9.LIZJ().getLong("auto_music_disk_last_cache_time", 0L);
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            C01GW c01gw = AutoMusicDiskCacheOpt.LIZIZ;
            boolean z2 = true;
            if (jCurrentTimeMillis > ((AutoMusicDiskCacheOpt.AutoMusicDiskCacheConfig) c01gw.getValue()).cacheExpiredTimeMs) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("autoMusicDiskCache setDiskCache enable: ");
            if (!z) {
                z2 = false;
            }
            sbLIZ.append(z2);
            sbLIZ.append(", musicId: ");
            sbLIZ.append(musicModel.getMusicId());
            sbLIZ.append(" lastCacheUsed:");
            sbLIZ.append(j);
            sbLIZ.append(", expirationTimeMs: ");
            sbLIZ.append(((AutoMusicDiskCacheOpt.AutoMusicDiskCacheConfig) c01gw.getValue()).cacheExpiredTimeMs);
            C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                Keva kevaLIZJ = C533510Kw9.LIZJ();
                C1227904rF.LIZ.getClass();
                kevaLIZJ.storeString("auto_music_disk_cache_data", C1227904rF.LJI(musicModel));
                C533510Kw9.LIZJ().storeLong("auto_music_disk_last_cache_time", System.currentTimeMillis());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIMusicPreRequestCacheManager@c436.setDiskCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
