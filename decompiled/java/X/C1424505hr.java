package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl$preload$job$1", f = "LyricEffectPreloadServiceImpl.kt", l = {131}, m = "invokeSuspend")
public final class C1424505hr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LyricEffectPreloadServiceImpl LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424505hr(LyricEffectPreloadServiceImpl lyricEffectPreloadServiceImpl, String str, String str2, String str3, InterfaceC1364105Vn<? super C1424505hr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = lyricEffectPreloadServiceImpl;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1424505hr c1424505hr = new C1424505hr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1424505hr.LLILLJJLI = obj;
        return c1424505hr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LyricEffectPreloadServiceImpl@4bee.preload$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILLL.LJFF.set(true);
                LyricEffectPreloadServiceImpl lyricEffectPreloadServiceImpl = this.LLILLL;
                String str = this.LLILZIL;
                String str2 = this.LLILZLL;
                String str3 = this.LLILZ;
                this.LL = 1;
                if (lyricEffectPreloadServiceImpl.LJII(str, str2, str3, this) == objLJFF) {
                    C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.preload$job$1");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str4 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1426005i6.LIZJ(C1398350mUb.LIZIZ, "Anchor.Preload.LyricEffect.Stage", "FAIL key=" + str4 + " cls=" + thM5exceptionOrNullimpl.getClass().getSimpleName() + " msg=" + thM5exceptionOrNullimpl.getMessage());
        }
        this.LLILLL.LJ.remove(this.LLILZ);
        this.LLILLL.LJFF.set(!r0.LJ.isEmpty());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.preload$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
