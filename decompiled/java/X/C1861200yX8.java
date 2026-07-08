package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yX8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861200yX8 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static String LIZIZ;
    public static InterfaceC1602960roc LIZJ;
    public static String LIZLLL;

    public static void LIZIZ(String str) {
        if (AbstractC19994813Le.Default.nextInt(100) < ((Number) C0AXW.LIZ.getValue()).intValue() && LIZ.compareAndSet(false, true)) {
            LIZIZ = str;
            InterfaceC1602960roc interfaceC1602960roc = LIZJ;
            if (interfaceC1602960roc != null) {
                interfaceC1602960roc.start();
            }
        }
    }

    public static void LIZ(String str, String str2, String str3, int i) {
        String str4;
        InterfaceC1602960roc interfaceC1602960roc;
        InterfaceC1602960roc interfaceC1602960roc2;
        InterfaceC1602960roc interfaceC1602960roc3;
        String str5;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((((Boolean) C287270BNt.LIZ.getValue()).booleanValue() && str != null && (str5 = LIZIZ) != null && !Intrinsics.LJFF(str5, str)) || !LIZ.compareAndSet(true, false)) {
            return;
        }
        if (str2 != null && (interfaceC1602960roc3 = LIZJ) != null) {
            interfaceC1602960roc3.LIZ("extra1", str2);
        }
        if (str3 != null && (interfaceC1602960roc2 = LIZJ) != null) {
            interfaceC1602960roc2.LIZ("extra2", str3);
        }
        if (C289490BWh.LIZ() && (str4 = LIZLLL) != null && (interfaceC1602960roc = LIZJ) != null) {
            interfaceC1602960roc.LIZ("extra3", str4);
        }
        if (!Intrinsics.LJFF(LIZIZ, str)) {
            return;
        }
        InterfaceC1602960roc interfaceC1602960roc4 = LIZJ;
        if (interfaceC1602960roc4 != null) {
            interfaceC1602960roc4.stop();
        }
        LIZIZ = null;
        if (!C289490BWh.LIZ()) {
            return;
        }
        LIZLLL = null;
    }
}
