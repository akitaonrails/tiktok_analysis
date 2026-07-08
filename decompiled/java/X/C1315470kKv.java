package X;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.text.UIText;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.ui.image.FlattenUIImage;
import com.lynx.tasm.ui.image.UIImage;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS298S0300000_20;

/* JADX INFO: renamed from: X.0kKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315470kKv {
    public static final C1315470kKv LIZ = new C1315470kKv();
    public static final int LIZIZ = 6;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(1));

    public static int LIZ(Drawable drawable) {
        boolean z;
        if (drawable == null) {
            return 0;
        }
        C1315480kKw c1315480kKw = new C1315480kKw();
        C1314460kJI c1314460kJI = new C1314460kJI(drawable);
        synchronized (c1315480kKw) {
            try {
                c1314460kJI.LIZ(c1315480kKw);
                z = c1315480kKw.LIZ;
                c1315480kKw.LIZ = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return (!z ? 1 : 0) ^ 1;
    }

    public static boolean LIZJ(LynxBaseUI lynxBaseUI) {
        String str;
        int iIntValue;
        int iIntValue2;
        CharSequence text;
        try {
            if (lynxBaseUI instanceof UIText) {
                ActionModeCallbackC1315180kKS actionModeCallbackC1315180kKS = (ActionModeCallbackC1315180kKS) ((UIText) lynxBaseUI).mView;
                if (actionModeCallbackC1315180kKS == null || (text = actionModeCallbackC1315180kKS.getText()) == null || text.length() <= 0) {
                    return false;
                }
            } else if (lynxBaseUI instanceof FlattenUIText) {
                CharSequence charSequenceLJJIJ = ((FlattenUIText) lynxBaseUI).LJJIJ();
                if (charSequenceLJJIJ == null || charSequenceLJJIJ.length() <= 0) {
                    return false;
                }
            } else if (lynxBaseUI instanceof UIImage) {
                if (((UIImage) lynxBaseUI).mView != 0 && !TextUtils.isEmpty(((C1315710kLJ) ((UIImage) lynxBaseUI).mView).getSrc())) {
                    try {
                        Field declaredField = ((UIImage) lynxBaseUI).mView.getClass().getDeclaredField("mSourceImageHeight");
                        Field declaredField2 = ((UIImage) lynxBaseUI).mView.getClass().getDeclaredField("mSourceImageWidth");
                        declaredField.setAccessible(true);
                        declaredField2.setAccessible(true);
                        iIntValue2 = ((Integer) declaredField.get(((UIImage) lynxBaseUI).mView)).intValue();
                        try {
                            iIntValue = ((Integer) declaredField2.get(((UIImage) lynxBaseUI).mView)).intValue();
                            try {
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                th = th;
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            iIntValue = 0;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        iIntValue = 0;
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 <= 0 || iIntValue <= 0) {
                        return false;
                    }
                } else {
                    C1315470kKv c1315470kKv = LIZ;
                    BackgroundDrawable backgroundDrawable = (BackgroundDrawable) ((UIImage) lynxBaseUI).mLynxBackground.LIZIZ;
                    c1315470kKv.getClass();
                    if (LIZ(backgroundDrawable) != 1) {
                        return false;
                    }
                }
            } else if (lynxBaseUI instanceof FlattenUIImage) {
                try {
                    Field declaredField3 = FlattenUIImage.class.getDeclaredField("mSources");
                    declaredField3.setAccessible(true);
                    str = (String) declaredField3.get(lynxBaseUI);
                    try {
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th4) {
                        th = th4;
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C1315470kKv c1315470kKv2 = LIZ;
                    Drawable imageDrawable = ((FlattenUIImage) lynxBaseUI).getImageDrawable();
                    c1315470kKv2.getClass();
                    if (LIZ(imageDrawable) != 1) {
                        return false;
                    }
                } else {
                    C1315470kKv c1315470kKv3 = LIZ;
                    BackgroundDrawable backgroundDrawable2 = (BackgroundDrawable) ((FlattenUIImage) lynxBaseUI).mLynxBackground.LIZIZ;
                    c1315470kKv3.getClass();
                    if (LIZ(backgroundDrawable2) != 1) {
                        return false;
                    }
                }
            } else if (lynxBaseUI instanceof LynxUI) {
                T t = ((LynxUI) lynxBaseUI).mView;
                if (t instanceof ImageView) {
                    C1315470kKv c1315470kKv4 = LIZ;
                    Drawable drawable = ((ImageView) t).getDrawable();
                    c1315470kKv4.getClass();
                    if (LIZ(drawable) != 1) {
                        return false;
                    }
                } else if (t instanceof TextView) {
                    if (((TextView) ((LynxUI) lynxBaseUI).mView).getText().length() <= 0) {
                        return false;
                    }
                } else if (t instanceof TextureView) {
                    SurfaceTexture surfaceTexture = ((TextureView) t).getSurfaceTexture();
                    if (surfaceTexture == null || surfaceTexture.getTimestamp() == 0) {
                        return false;
                    }
                } else if (((LynxUI) lynxBaseUI).mView.getBackground() != null) {
                    C1315470kKv c1315470kKv5 = LIZ;
                    Drawable background = ((LynxUI) lynxBaseUI).mView.getBackground();
                    c1315470kKv5.getClass();
                    if (LIZ(background) != 1) {
                        return false;
                    }
                } else if (((LynxUI) lynxBaseUI).mView.getMeasuredWidth() <= 0 || ((LynxUI) lynxBaseUI).mView.getMeasuredHeight() <= 0) {
                    return false;
                }
            } else if (lynxBaseUI instanceof LynxFlattenUI) {
                if (((LynxFlattenUI) lynxBaseUI).mLynxBackground != null) {
                    C1315470kKv c1315470kKv6 = LIZ;
                    BackgroundDrawable backgroundDrawable3 = (BackgroundDrawable) ((LynxFlattenUI) lynxBaseUI).mLynxBackground.LIZIZ;
                    c1315470kKv6.getClass();
                    if (LIZ(backgroundDrawable3) != 1) {
                        return false;
                    }
                } else if (((LynxFlattenUI) lynxBaseUI).getWidth() <= 0 || ((LynxFlattenUI) lynxBaseUI).getHeight() <= 0) {
                    return false;
                }
            } else if (lynxBaseUI.getWidth() <= 0 || lynxBaseUI.getHeight() <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            Object c098200Yq = new C098200Yq(th6);
            C189200o6.m2constructorimpl(c098200Yq);
            Object obj = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = obj;
            }
            return ((Boolean) c098200Yq).booleanValue();
        }
    }

    public static Rect LJFF(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    public static boolean LJI(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            if (((LynxUI) lynxBaseUI).mView.getVisibility() == 0 && r5.getAlpha() >= 0.05d && r5.getScaleX() >= 0.01d && r5.getScaleY() >= 0.01d) {
                return false;
            }
        } else {
            if (!(lynxBaseUI instanceof LynxFlattenUI) || lynxBaseUI.getAlpha() < 0.05d) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final double LIZLLL(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI == null || i > LIZIZ) {
            return 0.0d;
        }
        if (lynxBaseUI.getChildren().isEmpty()) {
            LIZ.getClass();
            if (LJI(lynxBaseUI) || !LIZJ(lynxBaseUI)) {
                return 0.0d;
            }
            return 1.0d / Math.pow(2.0d, ((double) i) - 1.0d);
        }
        Iterator<LynxBaseUI> it2 = lynxBaseUI.getChildren().iterator();
        boolean z = false;
        double d = 0.0d;
        while (it2.hasNext()) {
            double dLIZLLL = LIZLLL(it2.next(), i + 1);
            if (dLIZLLL > 0.0d) {
                d += dLIZLLL;
                z = true;
            }
        }
        if (!z) {
            LIZ.getClass();
            if (LJI(lynxBaseUI) || !LIZJ(lynxBaseUI)) {
                return d;
            }
        }
        return d + (1.0d / Math.pow(2.0d, ((double) i) - 1.0d));
    }

    public static void LJ(View view, Rect rect, Set set, AwS298S0300000_20 awS298S0300000_20) {
        if (view.getVisibility() == 0 && !set.contains(view)) {
            set.add(view);
            if (view instanceof LynxView) {
                Rect rectLJFF = LJFF(view);
                if (Rect.intersects(rect, rectLJFF) || rect.contains(rectLJFF)) {
                    awS298S0300000_20.invoke(view, rectLJFF);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    LJ(viewGroup.getChildAt(i), rect, set, awS298S0300000_20);
                }
            }
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                LJ((View) parent, rect, set, awS298S0300000_20);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021a A[Catch: all -> 0x0287, TryCatch #3 {all -> 0x0287, blocks: (B:80:0x01e1, B:83:0x01fb, B:85:0x0215, B:86:0x021a, B:88:0x0234, B:90:0x024c, B:92:0x0266), top: B:123:0x01e1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1317790kOf r17, com.lynx.tasm.behavior.ui.LynxBaseUI r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315470kKv.LIZIZ(X.0kOf, com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, int, int, int, int):void");
    }
}
