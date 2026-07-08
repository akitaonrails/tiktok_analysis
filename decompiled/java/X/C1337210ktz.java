package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0ktz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1337210ktz extends C19JH<C1337100kto> {
    public String LLLZI;
    public ImageView.ScaleType LLLZIIL;
    public boolean LLLZIL;
    public int LLLZL;
    public float LLLZLL;
    public float LLLZLZ;
    public boolean LLLZZ;

    @Override // X.C19JH
    public final View LIZ() {
        C1337100kto c1337100kto = new C1337100kto(this.LL);
        c1337100kto.LLJJ = this;
        return c1337100kto;
    }

    @Override // X.C19JH
    public final void LJIIJJI() {
        super.LJIIJJI();
        HandlerHook.viewPost(this.LLILZ, new Runnable() { // from class: X.0kts
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UGImageWidget@7cf6.onAttachedToWindow$1");
                try {
                    Drawable drawable = ((C1337100kto) this.LL.LLILZ).getDrawable();
                    if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                        ((AnimatedImageDrawable) drawable).start();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UGImageWidget@7cf6.onAttachedToWindow$1");
            }
        });
    }

    @Override // X.C19JH
    public final void LJIIL() {
        super.LJIIL();
        Drawable drawable = ((ImageView) this.LLILZ).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).stop();
    }

    @Override // X.C19JH
    public void LJIIZILJ() {
        Drawable drawable;
        super.LJIIZILJ();
        this.LLLZZ = false;
        if (!TextUtils.isEmpty(this.LLLZI)) {
            ((C1337100kto) this.LLILZ).setImageDrawable(null);
            if (this.LLLZI.startsWith("local://")) {
                try {
                    String strReplace = this.LLLZI.replace("local://", "");
                    if (TextUtils.equals(null, "raw")) {
                        ((C1337100kto) this.LLILZ).setImageResource(C790800V0k.LIZ(this.LL, strReplace, "raw"));
                    } else {
                        ((C1337100kto) this.LLILZ).setImageResource(C790800V0k.LIZ(this.LL, strReplace, "drawable"));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } else if (this.LLLZI.startsWith(e3.g)) {
                try {
                    ((C1337100kto) this.LLILZ).setImageResource(CastIntegerProtector.parseInt(this.LLLZI.substring(1)));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (this.LLLZLL > 0.0f) {
                C1015690cXP c1015690cXP = this.LLLLLJIL;
                if (c1015690cXP != null) {
                    c1015690cXP.LIZIZ();
                }
                C1015570cXD.LIZ().LIZJ.LIZ(this.LLIZ, this.LLLZI, new C1337160ktu(this));
            } else {
                C1015690cXP c1015690cXP2 = this.LLLLLJIL;
                if (c1015690cXP2 != null) {
                    c1015690cXP2.LIZIZ();
                }
                InterfaceC1337220ku0 interfaceC1337220ku0 = C1015570cXD.LIZ().LIZJ;
                C1015650cXL c1015650cXL = this.LLIZ;
                String str = this.LLLZI;
                T t = this.LLILZ;
                interfaceC1337220ku0.LIZIZ(c1015650cXL, str, (ImageView) t, t.getWidth(), this.LLILZ.getHeight(), new InterfaceC1015950cXp() { // from class: X.0ktv
                    @Override // X.InterfaceC1015950cXp
                    public final void LIZ(Bitmap bitmap) {
                        if (bitmap == null) {
                            C1337210ktz c1337210ktz = this.LIZ;
                            C1015690cXP c1015690cXP3 = c1337210ktz.LLLLLJIL;
                            if (c1015690cXP3 != null) {
                                c1015690cXP3.LIZ(c1337210ktz);
                                return;
                            }
                            return;
                        }
                        C1337210ktz c1337210ktz2 = this.LIZ;
                        C1015690cXP c1015690cXP4 = c1337210ktz2.LLLLLJIL;
                        if (c1015690cXP4 == null) {
                            return;
                        }
                        c1015690cXP4.LIZJ(c1337210ktz2);
                    }
                });
                if (this.LLLZIL || this.LLLZLZ > 0.0f) {
                    C1015570cXD.LIZ().LIZJ.LIZ(this.LLIZ, this.LLLZI, new C1337150ktt(this));
                }
            }
            if (this.LLLZZ && C1015570cXD.LIZ().LJ && C1100060ejU.LIZLLL(this.LL) && (drawable = ((ImageView) this.LLILZ).getDrawable()) != null) {
                drawable.setAutoMirrored(true);
            }
        }
        ((C1337100kto) this.LLILZ).setScaleType(this.LLLZIIL);
        ((C1337100kto) this.LLILZ).setBorderColor(this.LLLFFI);
        ((C1337100kto) this.LLILZ).setCornerRadius(this.LLJLIL);
        ((C1337100kto) this.LLILZ).setBorderWidth(this.LLLFF);
        int i = this.LLLZL;
        if (i != -1) {
            ((ImageView) this.LLILZ).setColorFilter(i);
        }
        if (this.LLLZZ && C1015570cXD.LIZ().LJ && C1100060ejU.LIZLLL(this.LL)) {
            T t2 = this.LLILZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(t2);
            t2.setScaleX(-1.0f);
        }
    }

    public C1337210ktz(Context context) {
        super(context);
        this.LLLZIIL = ImageView.ScaleType.FIT_XY;
        this.LLLZL = -1;
        this.LLLZLL = -1.0f;
        this.LLLZLZ = -1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // X.C19JH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJ(java.lang.String r4, java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337210ktz.LJIJ(java.lang.String, java.lang.String):void");
    }
}
