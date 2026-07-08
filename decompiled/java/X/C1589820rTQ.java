package X;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0rTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589820rTQ implements InterfaceC1589850rTT {
    public static final C1589820rTQ LIZ = new C1589820rTQ();
    public static final AtomicLong LIZIZ = new AtomicLong(0);

    @Override // X.InterfaceC1589850rTT
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1589850rTT
    public final void LJ() {
    }

    @Override // X.InterfaceC1589850rTT
    public final void LJFF(C1589790rTN c1589790rTN) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // X.InterfaceC1589850rTT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1589790rTN r8) throws org.json.JSONException {
        /*
            r7 = this;
            java.lang.String r1 = r8.LIZ
            java.lang.String r0 = "homepage_explore"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicLong r0 = X.C1589820rTQ.LIZIZ
            r5 = 0
            long r1 = r0.getAndSet(r5)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L40
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L40
            r1 = 3001(0xbb9, double:1.4827E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L40
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L2a:
            java.lang.String r0 = "page_determine_selected"
            java.lang.String r1 = "explore_top_tab"
            java.lang.String r2 = "slide"
            r3 = 0
            r5 = 8
            X.C1600620rkq.LIZ(r0, r1, r2, r3, r4, r5)
            X.15WT r2 = X.C15WT.LIZIZ
            java.lang.String r1 = "slide"
            java.lang.String r0 = "explore_top_tab"
            r2.LJIIJ(r1, r0)
            return
        L40:
            r4 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1589820rTQ.LIZ(X.0rTN):void");
    }

    @Override // X.InterfaceC1589850rTT
    public final void LIZIZ(C1589790rTN c1589790rTN) throws JSONException {
        if (!((Boolean) C282330B4t.LIZ.getValue()).booleanValue() || !Intrinsics.LJFF(c1589790rTN.LIZ, "homepage_explore")) {
            return;
        }
        LIZIZ.compareAndSet(0L, System.currentTimeMillis());
        C1600620rkq.LIZ("page_scroll_start", "explore_top_tab", "slide", null, null, 24);
        C15WT.LIZIZ.LJIIJ("slide", "explore_top_tab");
    }

    @Override // X.InterfaceC1589850rTT
    public final void LIZJ(C1589860rTU c1589860rTU) throws JSONException {
        String str;
        int i = C1589830rTR.LIZ[c1589860rTU.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "explore_bottom_tab";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "explore_top_tab";
        }
        if (c1589860rTU.LIZ == EnumC1589840rTS.TOP_TAB) {
            LIZIZ.set(System.currentTimeMillis());
        }
        C1600620rkq.LIZ("touch_down", str, "touch", null, null, 24);
        C15WT.LIZIZ.LJIIJ("touch", str);
    }
}
