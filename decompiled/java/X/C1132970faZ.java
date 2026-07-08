package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0faZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132970faZ {
    public static final ConcurrentHashMap<EnumC1133020fae, InterfaceC1133090fal> LIZ = new ConcurrentHashMap<>();

    public static InterfaceC1133090fal LIZ(EnumC1133020fae enumC1133020fae) {
        return LIZ.get(enumC1133020fae);
    }

    public static void LIZIZ(EnumC1133020fae enumC1133020fae) {
        InterfaceC1133090fal interfaceC1133090falRemove = LIZ.remove(enumC1133020fae);
        if (interfaceC1133090falRemove != null) {
            interfaceC1133090falRemove.LJIIZILJ();
            interfaceC1133090falRemove.release();
        }
    }

    public static void LIZJ(EnumC1133020fae enumC1133020fae, InterfaceC1133090fal interfaceC1133090fal) throws Exception {
        if (enumC1133020fae == null) {
            return;
        }
        if (interfaceC1133090fal == null) {
            LIZ.remove(enumC1133020fae);
            return;
        }
        InterfaceC1133090fal interfaceC1133090falPutIfAbsent = LIZ.putIfAbsent(enumC1133020fae, interfaceC1133090fal);
        if (interfaceC1133090falPutIfAbsent != null && !Intrinsics.LJFF(interfaceC1133090falPutIfAbsent, interfaceC1133090fal)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GiftType ");
            sbLIZ.append(enumC1133020fae);
            sbLIZ.append(" already has been set, or you should call release firstly.");
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
