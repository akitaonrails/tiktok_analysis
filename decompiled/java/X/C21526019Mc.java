package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.19Mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21526019Mc {
    public final String LIZ;
    public final EnumC21526219Me LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public String LJ;
    public boolean LJFF;
    public int LJI;

    public static int LIZ(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public final float LIZIZ() {
        switch (C21526119Md.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.LIZJ;
            case 4:
                return this.LIZLLL;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.LJFF ? 1.0f : 0.0f;
            case 7:
                return this.LIZLLL;
            default:
                return Float.NaN;
        }
    }

    public final int LIZLLL() {
        int i = C21526119Md.LIZ[this.LIZIZ.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    public final void LIZJ(float[] fArr) {
        float f;
        switch (C21526119Md.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 2:
                int i = this.LJI;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 3:
                fArr[0] = this.LIZJ;
                return;
            case 4:
                fArr[0] = this.LIZLLL;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                if (this.LJFF) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 7:
                fArr[0] = this.LIZLLL;
                return;
            default:
                return;
        }
    }

    public final void LJII(Object obj) {
        switch (C21526119Md.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 2:
                this.LJI = ((Integer) obj).intValue();
                break;
            case 3:
                this.LIZJ = ((Integer) obj).intValue();
                break;
            case 4:
                this.LIZLLL = ((Float) obj).floatValue();
                break;
            case 5:
                this.LJ = (String) obj;
                break;
            case 6:
                this.LJFF = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.LIZLLL = ((Float) obj).floatValue();
                break;
        }
    }

    public C21526019Mc(C21526019Mc c21526019Mc, Object obj) {
        this.LIZ = c21526019Mc.LIZ;
        this.LIZIZ = c21526019Mc.LIZIZ;
        LJII(obj);
    }

    public static void LJFF(View view, HashMap<String, C21526019Mc> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C21526019Mc c21526019Mc = map.get(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                switch (C21526119Md.LIZ[c21526019Mc.LIZIZ.ordinal()]) {
                    case 1:
                        cls.getMethod(strLIZIZ, Integer.TYPE).invoke(view, Integer.valueOf(c21526019Mc.LJI));
                        break;
                    case 2:
                        Method method = cls.getMethod(strLIZIZ, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c21526019Mc.LJI);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(strLIZIZ, Integer.TYPE).invoke(view, Integer.valueOf(c21526019Mc.LIZJ));
                        break;
                    case 4:
                        cls.getMethod(strLIZIZ, Float.TYPE).invoke(view, Float.valueOf(c21526019Mc.LIZLLL));
                        break;
                    case 5:
                        cls.getMethod(strLIZIZ, CharSequence.class).invoke(view, c21526019Mc.LJ);
                        break;
                    case 6:
                        cls.getMethod(strLIZIZ, Boolean.TYPE).invoke(view, Boolean.valueOf(c21526019Mc.LJFF));
                        break;
                    case 7:
                        cls.getMethod(strLIZIZ, Float.TYPE).invoke(view, Float.valueOf(c21526019Mc.LIZLLL));
                        break;
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:466:0x0349
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void LJI(android.view.View r13, float[] r14) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21526019Mc.LJI(android.view.View, float[]):void");
    }

    public C21526019Mc(String str, EnumC21526219Me enumC21526219Me, Object obj) {
        this.LIZ = str;
        this.LIZIZ = enumC21526219Me;
        LJII(obj);
    }

    public static void LJ(Context context, XmlPullParser xmlPullParser, HashMap<String, C21526019Mc> map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String strXd = null;
        Object objXd = null;
        EnumC21526219Me enumC21526219Me = null;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.CustomAttribute_attributeName) {
                strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                if (strXd != null && strXd.length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(Character.toUpperCase(strXd.charAt(0)));
                    sbLIZ.append(strXd.substring(1));
                    strXd = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else if (index == R$styleable.CustomAttribute_customBoolean) {
                objXd = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC21526219Me = EnumC21526219Me.BOOLEAN_TYPE;
            } else if (index == R$styleable.CustomAttribute_customColorValue) {
                enumC21526219Me = EnumC21526219Me.COLOR_TYPE;
                objXd = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
            } else if (index == R$styleable.CustomAttribute_customColorDrawableValue) {
                enumC21526219Me = EnumC21526219Me.COLOR_DRAWABLE_TYPE;
                objXd = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
            } else if (index == R$styleable.CustomAttribute_customPixelDimension) {
                enumC21526219Me = EnumC21526219Me.DIMENSION_TYPE;
                objXd = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
            } else if (index == R$styleable.CustomAttribute_customDimension) {
                enumC21526219Me = EnumC21526219Me.DIMENSION_TYPE;
                objXd = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
            } else if (index == R$styleable.CustomAttribute_customFloatValue) {
                enumC21526219Me = EnumC21526219Me.FLOAT_TYPE;
                objXd = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
            } else if (index == R$styleable.CustomAttribute_customIntegerValue) {
                enumC21526219Me = EnumC21526219Me.INT_TYPE;
                objXd = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
            } else if (index == R$styleable.CustomAttribute_customStringValue) {
                enumC21526219Me = EnumC21526219Me.STRING_TYPE;
                objXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
            }
        }
        if (strXd != null && objXd != null) {
            map.put(strXd, new C21526019Mc(strXd, enumC21526219Me, objXd));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
