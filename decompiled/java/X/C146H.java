package X;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.146H, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C146H implements InterfaceC799860VZg {
    public static boolean LIZJ;
    public final C146G<C146F> LIZ;
    public final Map<InterfaceC800080Va2, C146F> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());

    public C146H(AnonymousClass1465 anonymousClass1465) {
        this.LIZ = anonymousClass1465;
    }

    @Override // X.InterfaceC799860VZg
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        HashSet<String> hashSetLIZ;
        C146F c146fRemove = this.LIZIZ.remove(interfaceC800080Va2);
        if (c146fRemove == null) {
            return;
        }
        C146G<C146F> c146g = this.LIZ;
        if (c146g != null) {
            c146g.LIZIZ(c146fRemove);
        }
        if (LIZJ && (hashSetLIZ = C1940607iu.LIZ()) != null && hashSetLIZ.contains(c146fRemove.LIZIZ)) {
            C1BYE.LIZ(c146fRemove.LIZIZ);
        }
        if (C1218304ph.LIZ()) {
            C146K.LIZ(new C146J(c146fRemove.LIZIZ));
        }
    }

    @Override // X.InterfaceC799860VZg
    public final void LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        String strLIZIZ;
        String strLIZIZ2;
        HashSet<String> hashSetLIZ;
        C146F c146f = new C146F();
        this.LIZIZ.put(interfaceC800080Va2, c146f);
        boolean z = interfaceC800080Va2 instanceof C0CCZ;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("task_");
            sbLIZ.append(interfaceC800080Va2.key());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (interfaceC800080Va2 instanceof InterfaceC800130Va7) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("request_");
            sbLIZ2.append(interfaceC800080Va2.key());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (interfaceC800080Va2 instanceof InterfaceC799850VZf) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("inflate_");
            sbLIZ3.append(interfaceC800080Va2.key());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("lego_component_");
            sbLIZ4.append(interfaceC800080Va2.key());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("main_");
            sbLIZ5.append(strLIZIZ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
        } else {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("bg_");
            sbLIZ6.append(strLIZIZ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
        }
        c146f.LIZIZ = strLIZIZ2;
        if (z) {
            EnumC799870VZh enumC799870VZhType = ((C0CCZ) interfaceC800080Va2).type();
            c146f.LIZ = enumC799870VZhType;
            if (enumC799870VZhType == EnumC799870VZh.BOOT_FINISH) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("boot_finish_");
                sbLIZ7.append(strLIZIZ);
                c146f.LIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
            }
            if (c146f.LIZ == EnumC799870VZh.IDLE) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("idle_");
                sbLIZ8.append(strLIZIZ);
                c146f.LIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
            }
            if (LIZJ && (hashSetLIZ = C1940607iu.LIZ()) != null && hashSetLIZ.contains(c146f.LIZIZ)) {
                C1BYE.LIZIZ(c146f.LIZIZ);
            }
            if (C0CFK.LIZ) {
                C146K.LIZ++;
            }
            if (C1218304ph.LIZ()) {
                C146K.LIZ(new C146I(c146f.LIZIZ));
            }
        }
        C146G<C146F> c146g = this.LIZ;
        if (c146g != null) {
            c146g.LIZ(c146f);
        }
    }

    @Override // X.InterfaceC799860VZg
    public final void LIZJ(InterfaceC800080Va2 interfaceC800080Va2) {
        C146G<C146F> c146g = this.LIZ;
        if (c146g != null) {
            c146g.onCommit();
        }
    }
}
