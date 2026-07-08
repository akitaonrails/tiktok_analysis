package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0qII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1544480qII<Input> {
    public final InterfaceC1063710dmr LIZ;
    public final Input LIZIZ;

    public abstract EnumC1063300dmC LIZ();

    public abstract InterfaceC1544510qIL<Input> LIZIZ();

    public abstract Input LIZLLL(int i, String str);

    public final void LIZJ(final InterfaceC1543380qGW interfaceC1543380qGW) {
        try {
            Map<String, ? extends Object> mapLIZIZ = LIZIZ().LIZIZ(this.LIZ.getClass(), this.LIZIZ);
            if (mapLIZIZ == null) {
                interfaceC1543380qGW.LIZIZ(LIZLLL(-2000, "processor.transformPlatformDataToMap failed"));
            } else {
                this.LIZ.realHandle(mapLIZIZ, new InterfaceC801410VcB() { // from class: X.0qIJ
                    @Override // X.InterfaceC801410VcB
                    public final void LIZ(Map<String, ? extends Object> map) {
                        Integer num;
                        Object obj = map.get("code");
                        if ((obj instanceof Integer) && (num = (Integer) obj) != null && num.intValue() != 1) {
                            InterfaceC1543380qGW interfaceC1543380qGW2 = interfaceC1543380qGW;
                            InterfaceC1544510qIL interfaceC1544510qILLIZIZ = this.LIZIZ();
                            this.LIZ.getClass();
                            interfaceC1543380qGW2.LIZIZ(interfaceC1544510qILLIZIZ.LIZ(map));
                            return;
                        }
                        InterfaceC1543380qGW interfaceC1543380qGW3 = interfaceC1543380qGW;
                        InterfaceC1544510qIL interfaceC1544510qILLIZIZ2 = this.LIZIZ();
                        this.LIZ.getClass();
                        interfaceC1543380qGW3.LIZIZ(interfaceC1544510qILLIZIZ2.LIZ(map));
                    }
                }, LIZ());
            }
        } catch (C1549540qQS e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1543380qGW.LIZIZ(LIZLLL(-2001, e.toString()));
        } catch (C1549560qQU e2) {
            TryCatchGuardChecker.doCheck(e2);
            interfaceC1543380qGW.LIZIZ(LIZLLL(-3, e2.toString()));
        } catch (C1549570qQV e3) {
            TryCatchGuardChecker.doCheck(e3);
            interfaceC1543380qGW.LIZIZ(LIZLLL(-5, e3.toString()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC1543380qGW.LIZIZ(LIZLLL(C386801es.DEFAULT, C0VY5.LIZ(th)));
        }
    }

    public AbstractC1544480qII(InterfaceC1063710dmr interfaceC1063710dmr, Input input) {
        this.LIZ = interfaceC1063710dmr;
        this.LIZIZ = input;
    }
}
