package X;

import Y.ARunnableS108S0100000_8;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MIL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MIL extends C09AY implements Function1<Effect, Unit> {
    public final /* synthetic */ Effect LL;
    public final /* synthetic */ C0MIQ LLILLJJLI;
    public final /* synthetic */ C0MJE LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MIL(Effect effect, C0MIQ c0miq, C0MJE c0mje, boolean z, String str, String str2, boolean z2, boolean z3, String str3, String str4) {
        super(1);
        this.LL = effect;
        this.LLILLJJLI = c0miq;
        this.LLILLL = c0mje;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Effect effect) {
        NavigationScene navigationSceneLIZ;
        C19A3 c19a3;
        Effect effect2 = effect;
        Effect effect3 = this.LL;
        if (effect3 != null) {
            C0MIQ c0miq = this.LLILLJJLI;
            C0MJE c0mje = this.LLILLL;
            boolean z = this.LLILZ;
            String effect_id = this.LLILZIL;
            boolean z2 = this.LLILZLL;
            boolean z3 = this.LLIZ;
            String str = this.LLIZLLLIL;
            String str2 = this.LLJ;
            C0MIK c0mik = c0miq.LIZIZ;
            Boolean boolValueOf = Boolean.valueOf(z2);
            c0mik.LJIILL = effect2;
            c0mik.LJIJ = effect3;
            c0mik.LJIJJ = boolValueOf;
            c0mik.LJIJJLI = z3;
            c0mik.LJIL = str;
            c0mik.LJIIL = z;
            if (c0mje != null) {
                c0mik.LJIIZILJ = c0mje;
            }
            if (str2 != null) {
                c0mik.LJIILIIL = str2;
            }
            c0mik.LJIILLIIL = C0MIP.SCANNING;
            if (effect_id == null) {
                effect_id = effect3.getEffect_id();
            }
            c0mik.LJIIJJI = effect_id;
            c0mik.LJII.LJIJJ(effect3, false);
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c0mik.LJFF);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C23250099c.LIZLLL(lifecycleScope, abstractC2238408pq, null, new C0LH0(c0mik, effect2, null), 2);
            if (!c0mik.LIZLLL.Ue() && (c19a3 = c0mik.LJJ) != null) {
                C12WG.LIZLLL(c19a3, new ARunnableS108S0100000_8(c0mik, 24), 200L);
            }
            C19A3 c19a32 = c0mik.LJJI;
            if (c19a32 != null && (navigationSceneLIZ = C1447800nmM.LIZ(c19a32)) != null) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c0mik.LJFF), abstractC2238408pq, null, new C0MIM(c0mik, navigationSceneLIZ, z, effect3, null), 2);
            }
            C566110MIf.LIZ.getClass();
            C566110MIf.LJ("load_effect_package", true);
        }
        return Unit.LIZ;
    }
}
