package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0lff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366770lff implements InterfaceC866830XzV {
    public final ConcurrentHashMap<String, C0Y8T> LL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, IMUser> LLILLJJLI = new ConcurrentHashMap<>();

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLJLI(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLL(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJZZI(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLI(String str, List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLILLLLZI(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLL(C1711306n1 c1711306n1) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LLIIII(int i, String str) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LLIILZL(int i, String str, List list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final int LLLIIII() {
        return 0;
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
    public final void LLLIZZ(Map<String, C0Y8T> map) {
    }

    public final void LIZLLL(C0Y8T c0y8t) {
        if (c0y8t != null && c0y8t.getConversationId() != null && c0y8t.isGroupChat()) {
            this.LL.put(c0y8t.getConversationId(), c0y8t);
        }
    }

    public final Object LJ(List list) {
        if (list != null && !list.isEmpty()) {
            List<C0Y8T> listLJIJJ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIJJ(list);
            for (C0Y8T c0y8t : listLJIJJ) {
                this.LL.put(c0y8t.getConversationId(), c0y8t);
            }
            return listLJIJJ;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJJJJL(C0Y8T c0y8t) {
        LIZLLL(c0y8t);
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLIIIJ(C0Y8T c0y8t) {
        if (c0y8t != null && c0y8t.getConversationId() != null) {
            this.LL.remove(c0y8t.getConversationId());
        }
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJZI(C0Y8T c0y8t) {
        LIZLLL(c0y8t);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List<java.lang.String> r6, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1366810lfj
            if (r0 == 0) goto L67
            r3 = r7
            X.0lfj r3 = (X.C1366810lfj) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L46
            if (r0 != r1) goto L6d
            X.C155000ia.LIZIZ(r4)
        L22:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L28
            X.13BV r4 = X.C13BV.INSTANCE
        L28:
            java.util.Iterator r3 = r4.iterator()
        L2c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.im.common.model.BaseContact r2 = (com.ss.android.ugc.aweme.im.common.model.BaseContact) r2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser> r1 = r5.LLILLJJLI
            java.lang.String r0 = r2.getUid()
            if (r0 != 0) goto L42
            java.lang.String r0 = ""
        L42:
            r1.put(r0, r2)
            goto L2c
        L46:
            X.C155000ia.LIZIZ(r4)
            if (r6 == 0) goto L75
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L75
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r0 = r0.LJ()
            r3.LLILLL = r1
            java.lang.Object r4 = r0.LJIIIIZZ(r6, r3)
            if (r4 != r2) goto L22
            return r2
        L67:
            X.0lfj r3 = new X.0lfj
            r3.<init>(r5, r7)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L75:
            X.13BV r4 = X.C13BV.INSTANCE
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366770lff.LJFF(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLJI(int i, C0Y8T c0y8t) {
        LIZLLL(c0y8t);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r14, java.util.List<com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo> r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366770lff.LIZJ(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0lff] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<java.lang.String> r8, boolean r9, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r10, X.InterfaceC1364105Vn<? super java.util.List<X.C0Y8T>> r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366770lff.LIZ(java.util.List, boolean, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0lff] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<java.lang.String> r8, boolean r9, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r10, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366770lff.LIZIZ(java.util.List, boolean, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
