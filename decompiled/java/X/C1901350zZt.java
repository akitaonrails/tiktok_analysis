package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0zZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901350zZt {
    public static final C1901350zZt LIZ = new C1901350zZt();
    public static boolean LIZIZ = true;
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static volatile AtomicInteger LJ = new AtomicInteger(0);

    public static boolean LIZJ() {
        return LJ.get() == 1;
    }

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
    public static void LIZIZ() {
        long jMax;
        if (LIZJ()) {
            EnumC1901360zZu.LLILZIL.LIZJ();
            EnumC1901360zZu.LLJJJIL.LJI(LIZIZ ? 1 : 0);
            if (LJ.compareAndSet(1, 2)) {
                C2241008qG c2241008qG = new C2241008qG();
                for (EnumC1901360zZu enumC1901360zZu : EnumC1901360zZu.values()) {
                    int i = enumC1901360zZu.LLILLJJLI;
                    if (i == 0) {
                        String str = enumC1901360zZu.LL;
                        synchronized (enumC1901360zZu) {
                            C1901400zZy c1901400zZy = enumC1901360zZu.LLILLL;
                            jMax = Math.max(0L, c1901400zZy.LIZIZ - c1901400zZy.LIZ);
                        }
                        c2241008qG.LIZJ(Long.valueOf(jMax), str);
                    } else if (i == 1) {
                        c2241008qG.LIZIZ(Integer.valueOf(enumC1901360zZu.LJFF()), enumC1901360zZu.LL);
                    }
                }
                String str2 = C0NBD.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                c2241008qG.LIZLLL("inbox_session_id", str2);
                C20684815ws.LJIJ("follower_enter_perf", c2241008qG.LJ());
                LIZIZ = false;
                LJ.set(0);
            }
        }
    }

    public static void LIZ(int i, int i2) {
        if (!LJ.compareAndSet(0, 1)) {
            return;
        }
        EnumC1901360zZu.LLILZIL.start();
        EnumC1901360zZu.LLILZLL.start();
        EnumC1901360zZu.LLJJ.start();
        EnumC1901360zZu.LLJJI.start();
        EnumC1901360zZu.LLJJIJI.start();
        EnumC1901360zZu.LLJJIJIL.LJI(i);
        EnumC1901360zZu.LLJJJJ.LJI(i2);
        EnumC1901360zZu.LLIZLLLIL.start();
        EnumC1901360zZu.LLJILJIL.start();
        EnumC1901360zZu.LLJI.start();
    }
}
