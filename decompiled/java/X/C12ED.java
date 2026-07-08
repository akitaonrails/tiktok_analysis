package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.12ED, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12ED {
    public final LifecycleOwner LIZ;
    public final C12EF LIZIZ;
    public final C2252321DDq LIZJ;
    public final C2252321DDq LIZLLL;
    public int LJ;
    public boolean LJFF;

    public static Object LIZ() {
        IExternalService iExternalService;
        IAVDraftService iAVDraftServiceDraftService;
        int iQueryDraftCount = 0;
        try {
            iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (iExternalService == null || (iAVDraftServiceDraftService = iExternalService.draftService()) == null) {
            return C2286608xc.LJ(0);
        }
        iQueryDraftCount = iAVDraftServiceDraftService.queryDraftCount(new C0M4M(false, false, EnumC562220M3g.NORMAL, (C562260M3k) null, 27));
        return C2286608xc.LJ(iQueryDraftCount);
    }

    public final void LIZJ() {
        C12E8 c12e8 = new C12E8(false, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048573);
        this.LJ = 0;
        this.LIZJ.setValue(c12e8);
    }

    public C12ED(AwemeListFragmentImpl awemeListFragmentImpl) {
        C12EF c12ef = new C12EF() { // from class: X.0itf
            public int LIZ;
            public int LIZIZ;
            public List<C12E8> LIZJ;
            public long LIZLLL;
            public int LJ;
            public int LJFF;
            public int LJI;
            public int LJII;

            @Override // X.C12EF
            public final void LJII() {
                this.LJI = 0;
                this.LJII = 0;
            }

            @Override // X.C12EF
            public final void LJIIJ() {
                this.LJI = 0;
                this.LJII = 0;
            }

            @Override // X.C12EF
            public final void clearCache() {
                this.LIZJ = null;
                this.LIZLLL = 0L;
                this.LJII = 0;
                this.LJI = 0;
            }

            @Override // X.C12EF
            public final void LIZJ() {
                this.LJI++;
            }

            @Override // X.C12EF
            public final void LIZLLL() {
                this.LJII++;
            }

            @Override // X.C12EF
            public final boolean LIZ() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<C12E8> list = this.LIZJ;
                return list != null && (list.isEmpty() ^ true) && this.LIZLLL > jCurrentTimeMillis;
            }

            @Override // X.C12EF
            public final int LIZIZ() {
                return this.LJ;
            }

            @Override // X.C12EF
            public final int LJ() {
                return this.LJFF;
            }

            @Override // X.C12EF
            public final int LJFF() {
                return this.LJI;
            }

            @Override // X.C12EF
            public final int LJI() {
                return this.LJII;
            }

            @Override // X.C12EF
            public final List<C12E8> LJIIJJI() {
                return this.LIZJ;
            }

            @Override // X.C12EF
            public final int LJIILIIL() {
                return this.LIZ;
            }

            @Override // X.C12EF
            public final int LJIILL() {
                return this.LIZIZ;
            }

            @Override // X.C12EF
            public final void LJIIIIZZ(int i) {
                this.LIZIZ = i;
            }

            @Override // X.C12EF
            public final void LJIIL(int i) {
                this.LIZ = i;
            }

            @Override // X.C12EF
            public final void LJIIIZ(long j, List list) {
                this.LIZJ = list;
                this.LIZLLL = j;
            }

            @Override // X.C12EF
            public final void LJIILJJIL(int i, int i2) {
                this.LJ = i2;
                this.LJFF = i;
            }
        };
        this.LIZ = awemeListFragmentImpl;
        this.LIZIZ = c12ef;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = c2252321DDqLIZ;
        this.LJ = -1;
    }

    public final void LIZLLL(C12EH c12eh) {
        C948503nH.LJ(this.LIZ, C23271099x.INSTANCE, new C12EE(c12eh, this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.gson.n] */
    /* JADX WARN: Type inference failed for: r2v34, types: [X.12EF] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C12EH r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12ED.LIZIZ(X.12EH, X.05Vn):java.lang.Object");
    }

    public final Object LJ(C12EH c12eh, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        List<C12E8> listLJIIJJI = this.LIZIZ.LJIIJJI();
        if (listLJIIJJI != null && !listLJIIJJI.isEmpty()) {
            int i = this.LJ + 1;
            if (i < listLJIIJJI.size()) {
                C12E8 c12e8 = (C12E8) C13LP.LJJJLZIJ(i, listLJIIJJI);
                if (c12e8 == null) {
                    return Unit.LIZ;
                }
                if (C1533950q1J.LJ(c12e8.LIZJ)) {
                    this.LJ = i;
                    this.LIZJ.setValue(c12e8);
                    if (c12eh == C12EH.PULL_TO_REFRESH || c12eh == C12EH.VISIBILITY_CHANGE) {
                        C12E7.LIZ.getClass();
                        C12E7.LJFF(c12e8, true, false);
                    }
                }
                return Unit.LIZ;
            }
            Object objLIZIZ = LIZIZ(c12eh, interfaceC1364105Vn);
            if (objLIZIZ == C099R.LJFF()) {
                return objLIZIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
