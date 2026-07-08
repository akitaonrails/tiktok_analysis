package X;

import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0NQH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NQH {
    public static final /* synthetic */ C0NQH LIZ = new C0NQH();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0NQG] */
    public static C0NQG LIZ(C0NQH c0nqh, final C0XVH c0xvh, final Function1 function1, final Function2 function2, int i) {
        final AbstractC2238408pq abstractC2238408pq;
        if ((i & 1) != 0) {
            c0xvh = C0XVH.CUSTOMIZE_HOOK;
        }
        if ((i & 2) != 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            abstractC2238408pq = C2107308Nj.LIZ;
        } else {
            abstractC2238408pq = null;
        }
        if ((i & 4) != 0) {
            function1 = AFwS240S0000000_9.get$arr$(49);
        }
        c0nqh.getClass();
        return new AfterLoginHook(c0xvh, abstractC2238408pq, function1, function2) { // from class: X.0NQG
            public final C0XVH LIZIZ;
            public final AbstractC2252651DEx LIZJ;
            public final /* synthetic */ Function1<C0XVI, Boolean> LIZLLL;
            public final /* synthetic */ Function2<C0XVI, InterfaceC1364105Vn<? super Unit>, Object> LJ;

            @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
            public final boolean LIZIZ() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
            public final C0XVH LIZJ() {
                return this.LIZIZ;
            }

            @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
            public final AbstractC2252651DEx LJJJLL() {
                return this.LIZJ;
            }

            @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
            public final boolean LJ(C0XVI c0xvi) {
                return this.LIZLLL.invoke(c0xvi).booleanValue();
            }

            @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
            public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                Object objInvoke = this.LJ.invoke(c0xvi, interfaceC1364105Vn);
                if (objInvoke == C099R.LJFF()) {
                    return objInvoke;
                }
                return Unit.LIZ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZLLL = function1;
                this.LJ = function2;
                this.LIZIZ = c0xvh;
                this.LIZJ = abstractC2238408pq;
            }
        };
    }
}
