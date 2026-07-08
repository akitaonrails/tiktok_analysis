package X;

import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0YTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874730YTf implements InterfaceC459970I1z {
    public final InterfaceC876950Yaj LIZ;
    public final C0YTZ LIZIZ;

    @Override // X.InterfaceC459970I1z
    public final C874730YTf LIZ() {
        this.LIZIZ.LJIJJ = true;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x0010, B:8:0x0014, B:9:0x0019, B:11:0x0023, B:13:0x0029, B:15:0x0033, B:19:0x003f, B:21:0x0046, B:16:0x0036), top: B:26:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r6 = this;
            X.0YTZ r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L55
            android.util.SparseArray<java.lang.Object> r1 = r0.LJIILL     // Catch: java.lang.Exception -> L55
            if (r1 == 0) goto L36
            r0 = 511(0x1ff, float:7.16E-43)
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Exception -> L55
            boolean r0 = r2 instanceof java.util.Map     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L36
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L36
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L55
            r1.<init>(r2)     // Catch: java.lang.Exception -> L55
        L19:
            java.lang.Class<com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics> r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)     // Catch: java.lang.Exception -> L55
            com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics r0 = (com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics) r0     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L54
            java.util.Map r0 = r0.LIZ(r1)     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L54
            android.util.SparseArray r5 = X.C901060ZWm.LJ(r0)     // Catch: java.lang.Exception -> L55
            X.0YTZ r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L55
            android.util.SparseArray<java.lang.Object> r4 = r0.LJIILL     // Catch: java.lang.Exception -> L55
            if (r4 != 0) goto L3d
            r0.LJIILL = r5     // Catch: java.lang.Exception -> L55
            goto L3c
        L36:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L55
            r1.<init>()     // Catch: java.lang.Exception -> L55
            goto L19
        L3c:
            return
        L3d:
            if (r5 == 0) goto L64
            int r3 = r5.size()     // Catch: java.lang.Exception -> L55
            r2 = 0
        L44:
            if (r2 >= r3) goto L64
            int r1 = r5.keyAt(r2)     // Catch: java.lang.Exception -> L55
            java.lang.Object r0 = r5.valueAt(r2)     // Catch: java.lang.Exception -> L55
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L55
            int r2 = r2 + 1
            goto L44
        L54:
            return
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0YjW r0 = X.C882400YjW.LIZ
            r0.getClass()
            X.C882400YjW.LIZLLL()
            X.C882690Yjz.LJI()
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C874730YTf.LIZLLL():void");
    }

    public final void LJ() {
        if (!C455040Hss.LIZ()) {
            LIZLLL();
        }
        C0YTZ c0ytz = this.LIZIZ;
        c0ytz.getClass();
        if (C455040Hss.LIZ()) {
            c0ytz.LJIIIZ(null);
            return;
        }
        c0ytz.LJIJJLI.LIZIZ();
        c0ytz.LIZLLL();
        c0ytz.LIZIZ.LIZLLL(c0ytz);
    }

    public final C874730YTf LIZIZ(BaseContent baseContent) {
        if (baseContent == null) {
            return this;
        }
        ((ArrayList) this.LIZIZ.LJI).add(baseContent);
        return this;
    }

    public final C874730YTf LIZJ(BaseTemplate baseTemplate) {
        ((ArrayList) this.LIZIZ.LJII).add(baseTemplate);
        return this;
    }

    public final void LJFF(C0YTK c0ytk) {
        if (!C455040Hss.LIZ()) {
            LIZLLL();
        }
        C0YTZ c0ytz = this.LIZIZ;
        c0ytz.getClass();
        if (C455040Hss.LIZ()) {
            c0ytz.LJIIIZ(c0ytk);
            return;
        }
        c0ytz.LJIJJLI.LIZIZ();
        c0ytz.LIZLLL();
        c0ytz.LJIIZILJ = c0ytk;
        c0ytz.LIZIZ.LIZLLL(c0ytz);
    }

    public C874730YTf(InterfaceC874840YTq interfaceC874840YTq, InterfaceC874680YTa interfaceC874680YTa, InterfaceC876950Yaj interfaceC876950Yaj) {
        this.LIZ = interfaceC876950Yaj;
        this.LIZIZ = new C0YTZ(C0YTZ.LJJI.incrementAndGet(), interfaceC874840YTq, interfaceC874680YTa, interfaceC876950Yaj);
    }
}
