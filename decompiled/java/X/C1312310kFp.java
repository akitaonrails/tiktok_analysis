package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS25S1100000_20;
import Y.ARunnableS7S0102000_20;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.lynx.serval.svg.SVGRender;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import j27.s;

/* JADX INFO: renamed from: X.0kFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312310kFp extends C1311970kFH {
    public final int LJIIJ;
    public volatile String LJIIJJI;
    public volatile String LJIIL;
    public volatile boolean LJIILIIL;
    public volatile boolean LJIILJJIL;
    public volatile boolean LJIILL;
    public volatile Drawable LJIILLIIL;
    public volatile SVGRender LJIIZILJ;
    public final C1290350jgP LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public volatile boolean LJIJJLI;
    public boolean LJIL;

    @Override // X.C1311970kFH
    public final void LIZLLL() {
        this.LJIJJLI = true;
        this.LJIIZILJ = null;
        this.LJIJ.LIZ();
    }

    public final void LJII() {
        s sVar = this.LIZLLL.LIZJ;
        if (sVar == null || sVar.LLIZ == null || !this.LJIL) {
            return;
        }
        C1289960jfm c1289960jfm = new C1289960jfm(this.LJIIJ, "load");
        c1289960jfm.LIZIZ(Integer.valueOf(this.LJIJJ), "height");
        c1289960jfm.LIZIZ(Integer.valueOf(this.LJIJI), "width");
        sVar.LLIZ.LIZIZ(c1289960jfm);
    }

    public final void LJIIIIZZ() {
        if (this.LJIILIIL) {
            LJIIIZ();
        } else if (TextUtils.isEmpty(this.LJIIL)) {
            this.LJIILL = false;
        } else {
            C1301610jyZ.LJ().execute(new ARunnableS120S0100000_20(this, 209));
        }
    }

    public final void LJIIIZ() {
        if (TextUtils.isEmpty(this.LJIIL)) {
            this.LJIILL = false;
            return;
        }
        C1301610jyZ.LJ().execute(new ARunnableS7S0102000_20(this.LJIJI, this, this.LJIJJ, 1));
    }

    public final void LJIIJ() {
        if (this.LJIILL) {
            return;
        }
        Rect rect = this.LIZ;
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (iWidth <= 0 || iHeight <= 0) {
            return;
        }
        this.LJIJI = iWidth;
        this.LJIJJ = iHeight;
        this.LJIILJJIL = false;
        if (TextUtils.isEmpty(this.LJIIL) && TextUtils.isEmpty(this.LJIIJJI)) {
            this.LJIILLIIL = null;
            LIZJ(0);
            return;
        }
        this.LJIILL = true;
        if (TextUtils.isEmpty(this.LJIIJJI)) {
            if (TextUtils.isEmpty(this.LJIIL)) {
                this.LJIILL = false;
                return;
            } else {
                LJIIIIZZ();
                return;
            }
        }
        if (!this.LJIIJJI.startsWith("data:image/svg+xml;base64")) {
            this.LJIJ.LIZJ(this.LJIIJJI, new C1312320kFq(this));
        } else {
            C1301610jyZ.LJ().execute(new ARunnableS25S1100000_20(this, this.LJIIJJI, 8));
        }
    }

    @Override // X.C1311970kFH
    public final void LJ(Canvas canvas) {
        super.LJ(canvas);
        Rect rect = this.LIZ;
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (iWidth > 0 && iHeight > 0 && (iWidth != this.LJIJI || iHeight != this.LJIJJ || this.LJIILJJIL)) {
            this.LJIILJJIL = true;
            LJIIJ();
        }
        if (this.LJIILLIIL != null) {
            this.LJIILLIIL.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    @Override // X.C1311970kFH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.lynx.tasm.behavior.ui.PropBundle r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.String r1 = "src"
            boolean r0 = r7.contains(r1)
            r5 = 0
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L99
            com.lynx.react.bridge.JavaOnlyMap r0 = r7.LIZ
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r0 = r6.LJIIJJI
            boolean r0 = LJIIJJI(r1, r0)
            if (r0 == 0) goto L99
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L23
            r1 = r5
        L23:
            r6.LJIIJJI = r1
            r2 = 1
        L26:
            java.lang.String r1 = "content"
            boolean r0 = r7.contains(r1)
            if (r0 == 0) goto L46
            com.lynx.react.bridge.JavaOnlyMap r0 = r7.LIZ
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r0 = r6.LJIIL
            boolean r0 = LJIIJJI(r1, r0)
            if (r0 == 0) goto L46
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L43
            r5 = r1
        L43:
            r6.LJIIL = r5
            r2 = 1
        L46:
            com.lynx.react.bridge.ReadableMap r0 = r7.getProps()
            java.lang.String r1 = "enable-serval-svg"
            boolean r0 = r0.hasKey(r1)
            if (r0 == 0) goto L77
            com.lynx.react.bridge.ReadableMap r0 = r7.getProps()
            boolean r1 = r0.getBoolean(r1, r4)
            boolean r0 = r6.LJIILIIL
            if (r1 == r0) goto L77
            r6.LJIILIIL = r1
            boolean r0 = r6.LJIILIIL
            if (r0 == 0) goto L76
            com.lynx.serval.svg.SVGRender r0 = r6.LJIIZILJ
            if (r0 != 0) goto L76
            java.util.concurrent.Executor r2 = X.C1301610jyZ.LJ()
            Y.ARunnableS120S0100000_20 r1 = new Y.ARunnableS120S0100000_20
            r0 = 47
            r1.<init>(r6, r0)
            r2.execute(r1)
        L76:
            r2 = 1
        L77:
            com.lynx.react.bridge.ReadableArray r0 = r7.getEventHandlers()
            if (r0 == 0) goto L91
            com.lynx.react.bridge.ReadableArray r0 = r7.getEventHandlers()
            java.util.Map r1 = X.C1299120juY.LIZ(r0)
            java.lang.String r0 = "load"
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L91
            r6.LJIL = r3
        L91:
            if (r2 == 0) goto L98
            r6.LJIILJJIL = r3
            r6.LJIIJ()
        L98:
            return
        L99:
            r2 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1312310kFp.LJI(com.lynx.tasm.behavior.ui.PropBundle):void");
    }

    public C1312310kFp(PlatformRendererContext platformRendererContext, int i) {
        super(platformRendererContext, i);
        this.LJIJI = -1;
        this.LJIJJ = -1;
        this.LJIIJ = i;
        this.LJIJ = new C1290350jgP(this.LIZLLL.LIZJ);
    }

    public static boolean LJIIJJI(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            if (str2 == null) {
                return false;
            }
            return true;
        }
        return !str.equals(str2);
    }
}
