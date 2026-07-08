package X;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0kXL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323170kXL extends FrameLayout {
    public C1295960jpS LL;
    public TextView LLILLJJLI;
    public final NumberFormat LLILLL;
    public C1287400jbe LLILZ;
    public TextureViewSurfaceTextureListenerC1284890jXb LLILZIL;
    public ImageView LLILZLL;
    public C1323180kXM LLIZ;

    public static C1287390jbd LIZ() {
        C1287390jbd c1287390jbd = new C1287390jbd(0.0f, 0.0f, (List) null, (List) null, 0, 0, 0, 0, 0, 0.0f, 0.0f, 4095);
        Float fValueOf = Float.valueOf(1.0f);
        c1287390jbd.LIZ = 1.0f;
        Float fValueOf2 = Float.valueOf(0.0f);
        c1287390jbd.LIZIZ = 0.0f;
        c1287390jbd.LIZJ = -0.03f;
        c1287390jbd.LIZLLL = C1697810uHb.LJIIJJI(fValueOf2, fValueOf2);
        c1287390jbd.LJ = C1697810uHb.LJIIJJI(fValueOf, fValueOf);
        c1287390jbd.LJFF = Color.rgb(75, 183, 219);
        c1287390jbd.LJI = Color.rgb(0, 0, 0);
        c1287390jbd.LJII = Color.rgb(32, 154, 93);
        c1287390jbd.LJIIIIZZ = Color.rgb(0, 0, 0);
        c1287390jbd.LJIIIZ = Color.rgb(0, 0, 0);
        c1287390jbd.LJIIJ = 1.0f;
        c1287390jbd.LJIIJJI = 0.5f;
        return c1287390jbd;
    }

    public final void LIZLLL() {
        if (this.LLIZ.LIZ) {
            C1295960jpS c1295960jpS = this.LL;
            if (c1295960jpS == null || c1295960jpS.isAnimating()) {
                return;
            }
            c1295960jpS.playAnimation();
            return;
        }
        if (((Boolean) C0AXM.LIZ.getValue()).booleanValue()) {
            return;
        }
        try {
            C1287400jbe c1287400jbe = this.LLILZ;
            if (c1287400jbe != null) {
                c1287400jbe.LIZJ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJ() {
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setText(this.LLILLL.format(((double) 0) / ((double) 100)));
        }
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        if (this.LLIZ.LIZ || ((Boolean) C0AXM.LIZ.getValue()).booleanValue()) {
            return;
        }
        try {
            C1287400jbe c1287400jbe = this.LLILZ;
            if (c1287400jbe != null) {
                c1287400jbe.onPause();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private final void setupTakoOutline(View view) {
        view.setOutlineProvider(new C663220Pzs(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        view.setClipToOutline(true);
    }

    public final void setProgress(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setText(this.LLILLL.format(((double) i) / ((double) 100)));
        }
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null && !c1295960jpS.isAnimating()) {
            c1295960jpS.playAnimation();
        }
    }

    public C1323170kXL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = NumberFormat.getPercentInstance(Locale.ENGLISH);
        this.LLIZ = new C1323180kXM(0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0048
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZIZ(int r4, android.content.Context r5) throws java.lang.Throwable {
        /*
            android.content.res.Resources r0 = r5.getResources()     // Catch: java.lang.Exception -> L50
            java.io.InputStream r5 = r0.openRawResource(r4)     // Catch: java.lang.Exception -> L50
            r4 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L40
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L40
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.internal.AwS592S0100000_13 r1 = new kotlin.jvm.internal.AwS592S0100000_13     // Catch: java.lang.Throwable -> L2d
            r0 = 76
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L2d
            X.C08KC.LIZ(r3, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            X.C2107108Nh.LIZ(r3, r4)     // Catch: java.lang.Throwable -> L40
            X.C2107108Nh.LIZ(r5, r4)     // Catch: java.lang.Exception -> L50
            return r0
        L2d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L34
            throw r1     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            goto L36
        L34:
            r0 = move-exception
            r1 = r4
        L36:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r0 = move-exception
            goto L36
        L3c:
            X.C2107108Nh.LIZ(r3, r1)     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L48
            throw r1     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            r4 = r1
            goto L49
        L48:
            r0 = move-exception
        L49:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L48
            X.C2107108Nh.LIZ(r5, r4)     // Catch: java.lang.Exception -> L50
            throw r0     // Catch: java.lang.Exception -> L50
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1323170kXL.LIZIZ(int, android.content.Context):java.lang.String");
    }

    public final void LIZJ(boolean z, C1323180kXM c1323180kXM) throws Throwable {
        C1323180kXM c1323180kXM2;
        String str;
        if (z) {
            c1323180kXM2 = c1323180kXM;
        } else {
            c1323180kXM2 = new C1323180kXM(0);
        }
        this.LLIZ = c1323180kXM2;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        if (z) {
            FrameLayout.inflate(getContext(), R.layout.fro, this);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            setBackground(c384050F3z.LIZ(getContext()));
            this.LLILZIL = (TextureViewSurfaceTextureListenerC1284890jXb) findViewById(R.id.x_h);
            this.LLILZ = (C1287400jbe) findViewById(R.id.x_5);
            ImageView imageView = (ImageView) findViewById(R.id.x_9);
            this.LLILZLL = imageView;
            if (c1323180kXM.LIZ) {
                if (imageView != null) {
                    imageView.setImageResource(c1323180kXM.LIZIZ);
                }
                View view = this.LLILZLL;
                if (view != null) {
                    setupTakoOutline(view);
                }
                ImageView imageView2 = this.LLILZLL;
                if (imageView2 != null) {
                    C339190DRl.LIZLLL(imageView2);
                }
                C1287400jbe c1287400jbe = this.LLILZ;
                if (c1287400jbe != null) {
                    C339190DRl.LIZIZ(c1287400jbe);
                }
                TextureViewSurfaceTextureListenerC1284890jXb textureViewSurfaceTextureListenerC1284890jXb = this.LLILZIL;
                if (textureViewSurfaceTextureListenerC1284890jXb != null) {
                    C339190DRl.LIZIZ(textureViewSurfaceTextureListenerC1284890jXb);
                }
            } else {
                if (imageView != null) {
                    C339190DRl.LIZIZ(imageView);
                }
                String strLIZIZ = LIZIZ(R.raw.tako_hexagon_vert, getContext());
                String strLIZIZ2 = LIZIZ(R.raw.tako_mesh_compressed, getContext());
                if (((Boolean) C0AXM.LIZ.getValue()).booleanValue()) {
                    TextureViewSurfaceTextureListenerC1284890jXb textureViewSurfaceTextureListenerC1284890jXb2 = this.LLILZIL;
                    if (textureViewSurfaceTextureListenerC1284890jXb2 != null) {
                        C339190DRl.LIZLLL(textureViewSurfaceTextureListenerC1284890jXb2);
                    }
                    C1287400jbe c1287400jbe2 = this.LLILZ;
                    if (c1287400jbe2 != null) {
                        C339190DRl.LIZIZ(c1287400jbe2);
                    }
                    TextureViewSurfaceTextureListenerC1284890jXb textureViewSurfaceTextureListenerC1284890jXb3 = this.LLILZIL;
                    if (textureViewSurfaceTextureListenerC1284890jXb3 != null) {
                        textureViewSurfaceTextureListenerC1284890jXb3.LIZ(strLIZIZ, strLIZIZ2, LIZ());
                        setupTakoOutline(textureViewSurfaceTextureListenerC1284890jXb3);
                    }
                } else {
                    C1287400jbe c1287400jbe3 = this.LLILZ;
                    if (c1287400jbe3 != null) {
                        C339190DRl.LIZLLL(c1287400jbe3);
                    }
                    TextureViewSurfaceTextureListenerC1284890jXb textureViewSurfaceTextureListenerC1284890jXb4 = this.LLILZIL;
                    if (textureViewSurfaceTextureListenerC1284890jXb4 != null) {
                        C339190DRl.LIZIZ(textureViewSurfaceTextureListenerC1284890jXb4);
                    }
                    C1287400jbe c1287400jbe4 = this.LLILZ;
                    if (c1287400jbe4 != null) {
                        c1287400jbe4.LIZIZ(strLIZIZ, strLIZIZ2, true, LIZ());
                        setupTakoOutline(c1287400jbe4);
                    }
                }
            }
        } else {
            FrameLayout.inflate(getContext(), R.layout.frn, this);
        }
        this.LL = (C1295960jpS) findViewById(R.id.kdd);
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null) {
            if (z) {
                c1295960jpS.setAnimation(R.raw.tux_lottie_common_tako_generatingimage_loading);
            } else {
                if (C07IF.LIZ()) {
                    ViewGroup.LayoutParams layoutParams = c1295960jpS.getLayoutParams();
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180));
                    C786410Ut5.s6(c1295960jpS, layoutParams);
                    str = "tako_ttl_loading_tux_lottie_new.json";
                } else {
                    str = "tako_ttl_loading_tux_lottie.json";
                }
                c1295960jpS.setAnimation(str);
            }
            c1295960jpS.setRepeatCount(-1);
            c1295960jpS.setRepeatMode(1);
        }
        this.LLILLJJLI = (TextView) findViewById(R.id.kde);
    }
}
