package X;

import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i16, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226300i16 extends AbstractC1226410i1H {
    public final C1225510hzp LLILZIL;
    public final C1226290i15 LLILZLL;
    public final C01GW LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List, java.util.List<? extends X.0hx4>] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List<X.0hx4>] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.AbstractC1223800hx4> LJIJJLI(java.util.List<? extends X.AbstractC1223800hx4> r11) {
        /*
            r10 = this;
            X.01GW r0 = r10.LLIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r11.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C1224840hyk
            if (r0 == 0) goto L17
            r3.add(r1)
            goto L17
        L29:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.0i15 r0 = r10.LLILZLL
            java.util.List r5 = X.C13LP.LJLLLL(r0, r3)
            java.util.Iterator r9 = r5.iterator()
            r8 = 0
        L39:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r4 = r9.next()
            int r7 = r8 + 1
            r3 = 0
            if (r8 < 0) goto L97
            X.0hyk r4 = (X.C1224840hyk) r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.LLJI
            java.lang.String r6 = "contact"
            java.lang.Object r1 = r0.get(r6)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r1
            if (r1 == 0) goto L95
            java.lang.String r2 = r1.getInitialLetter()
        L5e:
            java.lang.String r0 = ""
            if (r2 != 0) goto L63
            r2 = r0
        L63:
            if (r8 <= 0) goto L85
            int r0 = r8 + (-1)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r0)
            X.0hyk r0 = (X.C1224840hyk) r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.LLJI
            java.lang.Object r1 = r0.get(r6)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r1
            if (r1 == 0) goto L93
            java.lang.String r0 = r1.getInitialLetter()
        L7f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L8e
        L85:
            X.0hx3 r1 = new X.0hx3
            r0 = 6
            r1.<init>(r2, r3, r0)
            r11.add(r1)
        L8e:
            r11.add(r4)
            r8 = r7
            goto L39
        L93:
            r0 = r3
            goto L7f
        L95:
            r2 = r3
            goto L5e
        L97:
            X.C1697810uHb.LJIJI()
            throw r3
        L9b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226300i16.LJIJJLI(java.util.List):java.util.List");
    }

    public C1226300i16(AbstractC1225770i0F abstractC1225770i0F, C1225510hzp c1225510hzp) {
        super(EnumC1226540i1U.TAB_KEY_SELECT_A_GROUP, abstractC1225770i0F, c1225510hzp);
        this.LLILZIL = c1225510hzp;
        this.LLILZLL = C1226290i15.LL;
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3335));
    }
}
