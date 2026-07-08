package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.16G1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16G1 extends ViewGroup.MarginLayoutParams {
    public C16BC LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public final Rect LJIILLIIL;
    public Object LJIIZILJ;

    public C16G1(C16G1 c16g1) {
        super((ViewGroup.MarginLayoutParams) c16g1);
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
    }

    public final boolean LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return this.LJIILJJIL;
        }
        return this.LJIILIIL;
    }

    public final void LIZIZ(C16BC c16bc) {
        C16BC c16bc2 = this.LIZ;
        if (c16bc2 != c16bc) {
            if (c16bc2 != null) {
                c16bc2.onDetachedFromLayoutParams();
            }
            this.LIZ = c16bc;
            this.LJIIZILJ = null;
            this.LIZIZ = true;
            if (c16bc != null) {
                c16bc.onAttachedToLayoutParams(this);
            }
        }
    }

    public C16G1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
    }

    public C16G1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16G1(Context context, AttributeSet attributeSet) {
        C16BC c16bcNewInstance;
        super(context, attributeSet);
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout_Layout);
        this.LIZJ = typedArrayObtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.LJFF = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_Layout_layout_anchor, -1);
        this.LIZLLL = typedArrayObtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.LJ = typedArrayObtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_keyline, -1);
        this.LJI = typedArrayObtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.LJII = typedArrayObtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.CoordinatorLayout_Layout_layout_behavior);
        this.LIZIZ = zHasValue;
        if (zHasValue) {
            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.CoordinatorLayout_Layout_layout_behavior);
            String str = C16G0.LLJJJ;
            if (TextUtils.isEmpty(strXd)) {
                c16bcNewInstance = null;
            } else {
                if (strXd.startsWith(e3.d)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(context.getPackageName());
                    sbLIZ.append(strXd);
                    strXd = C2188811AlT.LIZIZ(sbLIZ);
                } else if (strXd.indexOf(46) < 0) {
                    String str2 = C16G0.LLJJJ;
                    if (!TextUtils.isEmpty(str2)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append('.');
                        sbLIZ2.append(strXd);
                        strXd = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                try {
                    ThreadLocal<Map<String, Constructor<C16BC>>> threadLocal = C16G0.LLJJJJ;
                    Map<String, Constructor<C16BC>> map = threadLocal.get();
                    if (map == null) {
                        map = new HashMap<>();
                        threadLocal.set(map);
                    }
                    Constructor<C16BC> constructor = map.get(strXd);
                    if (constructor == null) {
                        constructor = Class.forName(strXd, false, context.getClassLoader()).getConstructor(C16G0.LLJJJIL);
                        constructor.setAccessible(true);
                        map.put(strXd, constructor);
                    }
                    c16bcNewInstance = constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Could not inflate Behavior subclass ");
                    sbLIZ3.append(strXd);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), e);
                }
            }
            this.LIZ = c16bcNewInstance;
        }
        typedArrayObtainStyledAttributes.recycle();
        C16BC c16bc = this.LIZ;
        if (c16bc != null) {
            c16bc.onAttachedToLayoutParams(this);
        }
    }

    public C16G1(int i, int i2) {
        super(i, i2);
        this.LJ = -1;
        this.LJFF = -1;
        this.LJIILLIIL = new Rect();
    }
}
