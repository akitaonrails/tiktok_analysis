package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.07zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2045607zq {
    public final Function0<Long> LIZ;
    public final Function2<Runnable, Long, Unit> LIZIZ;
    public final Function1<Runnable, Unit> LIZJ;
    public final Function1<List<String>, Unit> LIZLLL;
    public final Map<String, Long> LJ;
    public Runnable LJFF;

    public final void LIZ() {
        synchronized (this) {
            try {
                ((LinkedHashMap) this.LJ).clear();
                Runnable runnable = this.LJFF;
                if (runnable != null) {
                    this.LIZJ.invoke(runnable);
                }
                this.LJFF = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.07zp, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZIZ() {
        Runnable runnable = this.LJFF;
        if (runnable != null) {
            this.LIZJ.invoke(runnable);
        }
        this.LJFF = null;
        Long l = (Long) C13LP.LJJLL(((LinkedHashMap) this.LJ).values());
        if (l != null) {
            long jLongValue = l.longValue() - this.LIZ.invoke().longValue();
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            final C259800zU c259800zU = new C259800zU();
            ?? r2 = new Runnable() { // from class: X.07zp
                public final void LIZ() {
                    C2045607zq c2045607zq = this.LL;
                    Runnable runnable2 = c259800zU.element;
                    if (runnable2 == null) {
                        runnable2 = null;
                    }
                    synchronized (c2045607zq) {
                        try {
                            if (c2045607zq.LJFF != runnable2) {
                                return;
                            }
                            c2045607zq.LJFF = null;
                            long jLongValue2 = c2045607zq.LIZ.invoke().longValue();
                            Map<String, Long> map = c2045607zq.LJ;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                                if (((Number) entry.getValue()).longValue() <= jLongValue2) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            List<String> listLJLLJ = C13LP.LJLLJ(linkedHashMap.keySet());
                            Iterator<String> it2 = listLJLLJ.iterator();
                            while (it2.hasNext()) {
                                c2045607zq.LJ.remove(it2.next());
                            }
                            if (!listLJLLJ.isEmpty()) {
                                c2045607zq.LIZLLL.invoke(listLJLLJ);
                            }
                            synchronized (c2045607zq) {
                                try {
                                    c2045607zq.LIZIZ();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PrivacyDataRefreshScheduler@d312.scheduleNextLocked$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PrivacyDataRefreshScheduler@d312.scheduleNextLocked$1");
                }
            };
            c259800zU.element = r2;
            this.LJFF = r2;
            this.LIZIZ.invoke(r2, Long.valueOf(jLongValue));
        }
    }

    public C2045607zq(Function1 function1) {
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(1477);
        AnonymousClass0208 anonymousClass0208 = AnonymousClass0208.get$arr$(79);
        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LIZ = aFwS187S0000000_2;
        this.LIZIZ = anonymousClass0208;
        this.LIZJ = aFwS231S0000000_3;
        this.LIZLLL = function1;
        this.LJ = new LinkedHashMap();
    }
}
