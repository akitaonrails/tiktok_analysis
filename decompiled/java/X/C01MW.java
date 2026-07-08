package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01MW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.download.MusicDiskLruCache$cacheMusicFile$1", f = "MusicDiskLruCache.kt", l = {}, m = "invokeSuspend")
public final class C01MW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Keva LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01MW(Keva keva, String str, String str2, InterfaceC1364105Vn<? super C01MW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = keva;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01MW(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MusicDiskLruCache@763.cacheMusicFile$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.storeString(this.LLILLJJLI, this.LLILLL);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJFF("ReuseCreationMusicUrlHook", "save to local failed");
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDiskLruCache@763.cacheMusicFile$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
