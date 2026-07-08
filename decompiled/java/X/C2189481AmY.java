package X;

import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: X.1AmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189481AmY extends Property {
    public final int $t;

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        switch (this.$t) {
            case 0:
                return get$0(this, obj);
            case 1:
                return get$1(this, obj);
            case 2:
                return get$2(this, obj);
            case 3:
                return get$3(this, obj);
            case 4:
                return get$4(this, obj);
            case 5:
                return get$5(this, obj);
            default:
                return super.get(obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                set$0(this, obj, obj2);
                break;
            case 1:
                set$1(this, obj, obj2);
                break;
            case 2:
                set$2(this, obj, obj2);
                break;
            case 3:
                set$3(this, obj, obj2);
                break;
            case 4:
                set$4(this, obj, obj2);
                break;
            case 5:
                set$5(this, obj, obj2);
                break;
            default:
                super.set(obj, obj2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2189481AmY(int i) {
        super(float[].class, "nonTranslations");
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2189481AmY(Class cls, int i) {
        super(cls, "translations");
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object get$0(C2189481AmY c2189481AmY, Object obj) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object get$1(C2189481AmY c2189481AmY, Object obj) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object get$2(C2189481AmY c2189481AmY, Object obj) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object get$3(C2189481AmY c2189481AmY, Object obj) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object get$4(C2189481AmY c2189481AmY, Object obj) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object get$5(C2189481AmY c2189481AmY, Object obj) {
        return null;
    }

    public static final void set$0(C2189481AmY c2189481AmY, Object obj, Object obj2) {
        C21570719bN c21570719bN = (C21570719bN) obj;
        float[] fArr = (float[]) obj2;
        System.arraycopy(fArr, 0, c21570719bN.LJ, 0, fArr.length);
        c21570719bN.LIZ();
    }

    public static final void set$1(C2189481AmY c2189481AmY, Object obj, Object obj2) {
        C21570719bN c21570719bN = (C21570719bN) obj;
        PointF pointF = (PointF) obj2;
        c21570719bN.getClass();
        c21570719bN.LJFF = pointF.x;
        c21570719bN.LJI = pointF.y;
        c21570719bN.LIZ();
    }

    public static final void set$2(C2189481AmY c2189481AmY, Object obj, Object obj2) {
        C21572119bb c21572119bb = (C21572119bb) obj;
        float[] fArr = (float[]) obj2;
        if (fArr != null && c21572119bb != null) {
            System.arraycopy(fArr, 0, c21572119bb.LJ, 0, fArr.length);
            c21572119bb.LIZ();
        }
    }

    public static final void set$3(C2189481AmY c2189481AmY, Object obj, Object obj2) {
        C21572119bb c21572119bb = (C21572119bb) obj;
        PointF pointF = (PointF) obj2;
        if (pointF != null && c21572119bb != null) {
            c21572119bb.LJFF = pointF.x;
            c21572119bb.LJI = pointF.y;
            c21572119bb.LIZ();
        }
    }

    public static final void set$4(C2189481AmY c2189481AmY, Object obj, Object obj2) {
        C21570919bP c21570919bP = (C21570919bP) obj;
        float[] fArr = (float[]) obj2;
        System.arraycopy(fArr, 0, c21570919bP.LJ, 0, fArr.length);
        c21570919bP.LIZ();
    }

    public static final void set$5(C2189481AmY c2189481AmY, Object obj, Object obj2) {
        C21570919bP c21570919bP = (C21570919bP) obj;
        PointF pointF = (PointF) obj2;
        c21570919bP.getClass();
        c21570919bP.LJFF = pointF.x;
        c21570919bP.LJI = pointF.y;
        c21570919bP.LIZ();
    }
}
