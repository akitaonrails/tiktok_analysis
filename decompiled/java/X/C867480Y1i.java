package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Y1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867480Y1i {
    public final C0YEM LIZ;
    public final InterfaceC867490Y1j LIZIZ;

    public C867480Y1i(final C0YEM c0yem) {
        InterfaceC867490Y1j interfaceC867490Y1j = new InterfaceC867490Y1j(c0yem) { // from class: X.0Y1g
            public final C0YEM LIZ;
            public final C0Y5R LIZIZ;

            @Override // X.InterfaceC867490Y1j
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC867490Y1j
            public final void getMembers() {
            }

            @Override // X.InterfaceC867490Y1j
            public final void LJ() {
                this.LIZIZ.getProxy().LJIILIIL("ProcessConversationInfoUseCase");
            }

            {
                this.LIZ = c0yem;
                this.LIZIZ = c0yem.LJIIZILJ().LIZIZ();
            }

            @Override // X.InterfaceC867490Y1j
            public final C0Y8T LIZ(String str) {
                if (str == null) {
                    if (!this.LIZ.LJIIIZ().LIZIZ) {
                        return null;
                    }
                    "conversationId should not be null".toString();
                    throw new IllegalStateException("conversationId should not be null");
                }
                return this.LIZIZ.LIZIZ().LJIIJJI().LIZ(str, true);
            }

            @Override // X.InterfaceC867490Y1j
            public final boolean LIZLLL(C0Y8T c0y8t) {
                return this.LIZIZ.LIZIZ().LJIIJJI().LJJIJL(2, c0y8t);
            }

            @Override // X.InterfaceC867490Y1j
            public final void LJFF(boolean z) {
                this.LIZIZ.getProxy().LIZJ("ProcessConversationInfoUseCase", z);
            }

            @Override // X.InterfaceC867490Y1j
            public final boolean LJJZZI(C0Y8T c0y8t) {
                return this.LIZIZ.LIZIZ().LJIIJJI().LJJJJJL(c0y8t, true);
            }

            @Override // X.InterfaceC867490Y1j
            public final void LIZJ(int i, String str, List list) {
                if (str == null) {
                    if (!this.LIZ.LJIIIZ().LIZIZ) {
                        return;
                    }
                    "conversationId should not be null".toString();
                    throw new IllegalStateException("conversationId should not be null");
                }
                this.LIZIZ.LIZIZ().LJIILIIL().LIZJ(i, str, list);
            }
        };
        this.LIZ = c0yem;
        this.LIZIZ = interfaceC867490Y1j;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C867500Y1k LIZ(X.C867480Y1i r21, int r22, com.bytedance.im.core.proto.ConversationInfoV2 r23, java.lang.Boolean r24, java.lang.String r25, boolean r26, int r27) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C867480Y1i.LIZ(X.0Y1i, int, com.bytedance.im.core.proto.ConversationInfoV2, java.lang.Boolean, java.lang.String, boolean, int):X.0Y1k");
    }
}
