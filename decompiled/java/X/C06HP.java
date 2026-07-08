package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.06HP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06HP {
    public static final ConcurrentHashMap<String, InterfaceC332260D0u<C06HR>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, C06HR c06hr) {
        InterfaceC332260D0u<C06HR> interfaceC332260D0uPutIfAbsent;
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WheeDriveTrafficDisplayState setCardState conversationId=");
        sbLIZ.append(str);
        sbLIZ.append(", state=");
        sbLIZ.append(c06hr);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ConcurrentHashMap<String, InterfaceC332260D0u<C06HR>> concurrentHashMap = LIZ;
        InterfaceC332260D0u<C06HR> interfaceC332260D0uLIZ = concurrentHashMap.get(str);
        if (interfaceC332260D0uLIZ == null && (interfaceC332260D0uPutIfAbsent = concurrentHashMap.putIfAbsent(str, (interfaceC332260D0uLIZ = C1BNE.LIZ(C06HR.UNDECIDED)))) != null) {
            interfaceC332260D0uLIZ = interfaceC332260D0uPutIfAbsent;
        }
        interfaceC332260D0uLIZ.setValue(c06hr);
    }
}
