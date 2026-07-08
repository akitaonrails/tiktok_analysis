package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05vZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1509505vZ {
    public static final boolean LIZ(C869590Y9l c869590Y9l) {
        String conversationId;
        Map<String, String> ext;
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        String str = null;
        if (c869590Y9l != null) {
            conversationId = c869590Y9l.getConversationId();
        } else {
            conversationId = null;
        }
        C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(conversationId);
        if (c0y8tLIZ != null) {
            return C882340YjQ.LJ(c0y8tLIZ);
        }
        if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
            str = ext.get("stranger");
        }
        return Intrinsics.LJFF(str, C461720I8s.LIZIZ());
    }
}
