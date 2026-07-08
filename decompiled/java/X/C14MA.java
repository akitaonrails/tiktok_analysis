package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.14MA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14MA {
    public static C14MA LJII;
    public WeakHashMap<Context, C1119470fEn<ColorStateList>> LIZ;
    public C830530Wi3<String, InterfaceC20247314Kh> LIZIZ;
    public C1119470fEn<String> LIZJ;
    public final WeakHashMap<Context, C20066713fN<WeakReference<Drawable.ConstantState>>> LIZLLL = new WeakHashMap<>(0);
    public TypedValue LJ;
    public C14MD LJFF;
    public static final PorterDuff.Mode LJI = PorterDuff.Mode.SRC_IN;
    public static final C20248614Ku LJIIIIZZ = new C603820NmG<Integer, PorterDuffColorFilter>() { // from class: X.14Ku
    };

    public static synchronized C14MA LIZLLL() {
        if (LJII == null) {
            C14MA c14ma = new C14MA();
            LJII = c14ma;
            LJIIIZ(c14ma);
        }
        return LJII;
    }

    public static void LJIIIZ(C14MA c14ma) {
        if (Build.VERSION.SDK_INT < 24) {
            c14ma.LIZ("vector", new InterfaceC20247314Kh() { // from class: X.14MC
                @Override // X.InterfaceC20247314Kh
                public final Drawable LIZ(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                    try {
                        Resources resources = context.getResources();
                        C19LH c19lh = new C19LH();
                        c19lh.inflate(resources, xmlPullParser, attributeSet, theme);
                        return c19lh;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            });
            c14ma.LIZ("animated-vector", new InterfaceC20247314Kh() { // from class: X.14MB
                @Override // X.InterfaceC20247314Kh
                public final Drawable LIZ(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                    try {
                        Resources resources = context.getResources();
                        C19SV c19sv = new C19SV(context);
                        c19sv.inflate(resources, xmlPullParser, attributeSet, theme);
                        return c19sv;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            });
            c14ma.LIZ("animated-selector", new InterfaceC20247314Kh() { // from class: X.14Ki
                @Override // X.InterfaceC20247314Kh
                public final Drawable LIZ(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                    try {
                        return C19SN.LJI(context, theme, context.getResources(), attributeSet, xmlPullParser);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            });
            c14ma.LIZ("drawable", new InterfaceC20247314Kh() { // from class: X.14Kf
                @Override // X.InterfaceC20247314Kh
                public final Drawable LIZ(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                    String classAttribute = attributeSet.getClassAttribute();
                    if (classAttribute != null) {
                        try {
                            Drawable drawable = (Drawable) C20247114Kf.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            C20247214Kg.LIZJ(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                            return drawable;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return null;
                        }
                    }
                    return null;
                }
            });
        }
    }

    public final synchronized void LJIIJ(Context context) {
        C20066713fN<WeakReference<Drawable.ConstantState>> c20066713fN = this.LIZLLL.get(context);
        if (c20066713fN != null) {
            c20066713fN.LIZIZ();
        }
    }

    public final synchronized void LJIIJJI(C14ME c14me) {
        this.LJFF = c14me;
    }

    public static synchronized PorterDuffColorFilter LJII(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterLIZJ;
        C20248614Ku c20248614Ku = LJIIIIZZ;
        c20248614Ku.getClass();
        int i2 = (i + 31) * 31;
        porterDuffColorFilterLIZJ = c20248614Ku.LIZJ(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilterLIZJ == null) {
            porterDuffColorFilterLIZJ = new PorterDuffColorFilter(i, mode);
            c20248614Ku.getClass();
            c20248614Ku.LIZLLL(Integer.valueOf(i2 + mode.hashCode()), porterDuffColorFilterLIZJ);
        }
        return porterDuffColorFilterLIZJ;
    }

    public final void LIZ(String str, InterfaceC20247314Kh interfaceC20247314Kh) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C830530Wi3<>();
        }
        this.LIZIZ.put(str, interfaceC20247314Kh);
    }

    public final Drawable LIZJ(int i, Context context) {
        LayerDrawable layerDrawableLIZJ;
        if (this.LJ == null) {
            this.LJ = new TypedValue();
        }
        TypedValue typedValue = this.LJ;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableLJ = LJ(j, context);
        if (drawableLJ != null) {
            return drawableLJ;
        }
        if (this.LJFF != null) {
            if (i == R.drawable.a1n) {
                layerDrawableLIZJ = new LayerDrawable(new Drawable[]{LJFF(context, R.drawable.a1m), LJFF(context, 2130969130)});
            } else {
                if (i == R.drawable.a2l) {
                    layerDrawableLIZJ = C14ME.LIZJ(this, context, R.dimen.dl);
                } else if (i == R.drawable.a2k) {
                    layerDrawableLIZJ = C14ME.LIZJ(this, context, R.dimen.dm);
                } else if (i == R.drawable.a2m) {
                    layerDrawableLIZJ = C14ME.LIZJ(this, context, R.dimen.dn);
                } else {
                    return null;
                }
                if (layerDrawableLIZJ != null) {
                }
                return layerDrawableLIZJ;
            }
            layerDrawableLIZJ.setChangingConfigurations(typedValue.changingConfigurations);
            LIZIZ(context, j, layerDrawableLIZJ);
            return layerDrawableLIZJ;
        }
        return null;
    }

    public final synchronized Drawable LJ(long j, Context context) {
        C20066713fN<WeakReference<Drawable.ConstantState>> c20066713fN = this.LIZLLL.get(context);
        if (c20066713fN == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceLJ = c20066713fN.LJ(j);
        if (weakReferenceLJ != null) {
            Drawable.ConstantState constantState = weakReferenceLJ.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c20066713fN.LJIIJ(j);
        }
        return null;
    }

    public final synchronized Drawable LJFF(Context context, int i) {
        return LJI(context, i, false);
    }

    public final synchronized ColorStateList LJIIIIZZ(int i, Context context) {
        ColorStateList colorStateListLIZLLL;
        C1119470fEn<ColorStateList> c1119470fEn;
        WeakHashMap<Context, C1119470fEn<ColorStateList>> weakHashMap = this.LIZ;
        ColorStateList colorStateListLIZLLL2 = null;
        if (weakHashMap != null && (c1119470fEn = weakHashMap.get(context)) != null) {
            colorStateListLIZLLL = c1119470fEn.LIZLLL(i);
        } else {
            colorStateListLIZLLL = null;
        }
        if (colorStateListLIZLLL == null) {
            C14MD c14md = this.LJFF;
            if (c14md != null) {
                colorStateListLIZLLL2 = ((C14ME) c14md).LIZLLL(i, context);
            }
            if (colorStateListLIZLLL2 != null) {
                if (this.LIZ == null) {
                    this.LIZ = new WeakHashMap<>();
                }
                C1119470fEn<ColorStateList> c1119470fEn2 = this.LIZ.get(context);
                if (c1119470fEn2 == null) {
                    c1119470fEn2 = new C1119470fEn<>();
                    this.LIZ.put(context, c1119470fEn2);
                }
                c1119470fEn2.LIZ(i, colorStateListLIZLLL2);
            }
            colorStateListLIZLLL = colorStateListLIZLLL2;
        }
        return colorStateListLIZLLL;
    }

    public final synchronized void LIZIZ(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C20066713fN<WeakReference<Drawable.ConstantState>> c20066713fN = this.LIZLLL.get(context);
            if (c20066713fN == null) {
                c20066713fN = new C20066713fN<>();
                this.LIZLLL.put(context, c20066713fN);
            }
            c20066713fN.LJIIIZ(j, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a A[Catch: all -> 0x016d, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000d, B:9:0x0013, B:12:0x0021, B:16:0x0032, B:18:0x0036, B:19:0x003d, B:21:0x0056, B:23:0x005a, B:25:0x0066, B:26:0x006e, B:31:0x007a, B:33:0x008d, B:35:0x0097, B:36:0x00a0, B:37:0x00a7, B:39:0x00a9, B:41:0x00ae, B:44:0x00b7, B:46:0x00bd, B:48:0x00c3, B:50:0x00c9, B:54:0x00d9, B:56:0x00dd, B:58:0x00e2, B:62:0x00f9, B:79:0x0141, B:76:0x013a, B:80:0x0168, B:15:0x002b), top: B:87:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable LJI(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14MA.LJI(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(int r7, android.content.Context r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            X.14MD r2 = r6.LJFF
            r1 = 0
            if (r2 == 0) goto L2e
            X.14ME r2 = (X.C14ME) r2
            android.graphics.PorterDuff$Mode r4 = X.C14MG.LIZIZ
            int[] r0 = r2.LIZ
            boolean r0 = X.C14ME.LIZ(r7, r0)
            r3 = -1
            if (r0 == 0) goto L2f
            r5 = 2131102656(0x7f060bc0, float:1.7817756E38)
        L15:
            r0 = 1
            r2 = -1
            if (r0 == 0) goto L2e
        L19:
            android.graphics.drawable.Drawable r1 = r9.mutate()
            int r0 = X.C14MF.LIZIZ(r5, r8)
            android.graphics.PorterDuffColorFilter r0 = X.C14MG.LIZJ(r0, r4)
            r1.setColorFilter(r0)
            if (r2 == r3) goto L2d
            r1.setAlpha(r2)
        L2d:
            r1 = 1
        L2e:
            return r1
        L2f:
            int[] r0 = r2.LIZJ
            boolean r0 = X.C14ME.LIZ(r7, r0)
            if (r0 == 0) goto L3b
            r5 = 2131102654(0x7f060bbe, float:1.7817752E38)
            goto L15
        L3b:
            int[] r0 = r2.LIZLLL
            boolean r0 = X.C14ME.LIZ(r7, r0)
            if (r0 == 0) goto L4a
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
        L45:
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r2 = -1
            goto L19
        L4a:
            r0 = 2130969150(0x7f04023e, float:1.7546974E38)
            if (r7 != r0) goto L5a
            r0 = 1109603123(0x42233333, float:40.8)
            int r2 = java.lang.Math.round(r0)
            r5 = 16842800(0x1010030, float:2.3693693E-38)
            goto L19
        L5a:
            r0 = 2130969132(0x7f04022c, float:1.7546937E38)
            if (r7 != r0) goto L2e
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14MA.LJIIL(int, android.content.Context, android.graphics.drawable.Drawable):boolean");
    }
}
