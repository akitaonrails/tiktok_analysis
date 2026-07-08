package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextEffectExtra;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11UK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UK extends C11UL {
    public InnerEffectTextLayoutConfig LL;
    public Set<C2280608we> LLILLJJLI;
    public final EffectTextEffectExtra LLILLL;

    public C11UK() {
        throw null;
    }

    @Override // X.C11UL
    public final boolean LIZIZ() {
        EffectTextEffectExtra effectTextEffectExtra = this.LLILLL;
        return effectTextEffectExtra.ifStandard || effectTextEffectExtra.LIZ || super.LIZIZ();
    }

    public final int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C11UJ
            if (r0 == 0) goto L4d
            r6 = r8
            X.11UJ r6 = (X.C11UJ) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L53
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L4b
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r7.LIZIZ()
            if (r0 != 0) goto L4b
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r7.effect
            r6.LLILLL = r4
            X.1DFB r2 = X.C0PEM.LIZJ
            X.08nT r1 = new X.08nT
            r0 = 0
            r1.<init>(r3, r0)
            java.lang.Object r1 = X.C23250099c.LJI(r6, r2, r1)
            if (r1 != r5) goto L22
            return r5
        L4b:
            r4 = 0
            goto L2a
        L4d:
            X.11UJ r6 = new X.11UJ
            r6.<init>(r7, r8)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11UK.LIZJ(X.05Vn):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11UK) {
            return Intrinsics.LJFF(((C11UL) obj).effect.getEffectId(), this.effect.getEffectId());
        }
        return false;
    }

    public C11UK(Effect effect, EffectTextEffectExtra effectTextEffectExtra) {
        HashSet hashSet = new HashSet();
        super(effect);
        this.LL = null;
        this.LLILLJJLI = hashSet;
        this.LLILLL = effectTextEffectExtra;
    }
}
