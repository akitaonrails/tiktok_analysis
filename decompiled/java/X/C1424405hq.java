package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl$preloadAllPanelEffects$1", f = "LyricEffectPreloadServiceImpl.kt", l = {228}, m = "invokeSuspend")
public final class C1424405hq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LyricEffectPreloadServiceImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424405hq(LyricEffectPreloadServiceImpl lyricEffectPreloadServiceImpl, InterfaceC1364105Vn<? super C1424405hq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = lyricEffectPreloadServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1424405hq c1424405hq = new C1424405hq(this.LLILLL, interfaceC1364105Vn);
        c1424405hq.LLILLJJLI = obj;
        return c1424405hq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LyricEffectPreloadServiceImpl@4bee.preloadAllPanelEffects$1");
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
                LyricEffectPreloadServiceImpl lyricEffectPreloadServiceImpl = this.LLILLL;
                this.LL = 1;
                if (lyricEffectPreloadServiceImpl.LJIIIIZZ(this) == objLJFF) {
                    C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.preloadAllPanelEffects$1");
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
        LyricEffectPreloadServiceImpl lyricEffectPreloadServiceImpl2 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FAIL cls=");
            sbLIZ.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
            sbLIZ.append(" msg=");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C1426005i6.LIZJ(c1398350mUb, "Anchor.Preload.LyricEffect.PanelAll", C2188811AlT.LIZIZ(sbLIZ));
            lyricEffectPreloadServiceImpl2.LJIIIIZZ.set(false);
        }
        this.LLILLL.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.preloadAllPanelEffects$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
