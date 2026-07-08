package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0vOD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740350vOD extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ C238400w2 LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ C259800zU<String> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740350vOD(C259800zU<String> c259800zU, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, C259800zU<String> c259800zU4, C259800zU<String> c259800zU5, C259800zU<String> c259800zU6, C259800zU<String> c259800zU7, boolean z, boolean z2, C238400w2 c238400w2, boolean z3, C259800zU<String> c259800zU8) {
        super(2);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
        this.LLILLL = c259800zU3;
        this.LLILZ = c259800zU4;
        this.LLILZIL = c259800zU5;
        this.LLILZLL = c259800zU6;
        this.LLIZ = c259800zU7;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = c238400w2;
        this.LLJIJIL = z3;
        this.LLJILJIL = c259800zU8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        final boolean zBooleanValue = bool.booleanValue();
        final String str2 = str;
        final C259800zU<String> c259800zU = this.LL;
        final C259800zU<String> c259800zU2 = this.LLILLJJLI;
        final C259800zU<String> c259800zU3 = this.LLILLL;
        final C259800zU<String> c259800zU4 = this.LLILZ;
        final C259800zU<String> c259800zU5 = this.LLILZIL;
        final C259800zU<String> c259800zU6 = this.LLILZLL;
        final C259800zU<String> c259800zU7 = this.LLIZ;
        final boolean z = this.LLIZLLLIL;
        final boolean z2 = this.LLJ;
        final C238400w2 c238400w2 = this.LLJI;
        final boolean z3 = this.LLJIJIL;
        final C259800zU<String> c259800zU8 = this.LLJILJIL;
        try {
            if (C1740380vOG.LIZ()) {
                try {
                    C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0vOE
                        /* JADX WARN: Multi-variable type inference failed */
                        public final void LIZ() {
                            C1740320vOA c1740320vOA = C1740320vOA.LIZ;
                            String str3 = (String) c259800zU.element;
                            String str4 = (String) c259800zU2.element;
                            String str5 = (String) c259800zU3.element;
                            String str6 = (String) c259800zU4.element;
                            String str7 = (String) c259800zU5.element;
                            String str8 = (String) c259800zU6.element;
                            String str9 = (String) c259800zU7.element;
                            boolean z4 = zBooleanValue;
                            String str10 = str2;
                            boolean z5 = z;
                            boolean z6 = z2;
                            long j = c238400w2.element;
                            boolean z7 = z3;
                            String str11 = (String) c259800zU8.element;
                            c1740320vOA.getClass();
                            C1740320vOA.LIZ(str3, str4, str5, str6, str7, str8, str9, z4, str10, z5, z6, j, z7, str11);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("EcUgShopTabPopupManager@ada3.openPopupSchema$track$1$invoke$$inlined$runOnWorkerThreadImmediate$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("EcUgShopTabPopupManager@ada3.openPopupSchema$track$1$invoke$$inlined$runOnWorkerThreadImmediate$1");
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } else {
                C1740320vOA c1740320vOA = C1740320vOA.LIZ;
                String str3 = c259800zU.element;
                String str4 = c259800zU2.element;
                String str5 = c259800zU3.element;
                String str6 = c259800zU4.element;
                String str7 = c259800zU5.element;
                String str8 = c259800zU6.element;
                String str9 = c259800zU7.element;
                long j = c238400w2.element;
                String str10 = c259800zU8.element;
                c1740320vOA.getClass();
                C1740320vOA.LIZ(str3, str4, str5, str6, str7, str8, str9, zBooleanValue, str2, z, z2, j, z3, str10);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return Unit.LIZ;
    }
}
