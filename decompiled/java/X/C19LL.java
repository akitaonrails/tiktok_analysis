package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.19LL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LL extends Property {
    public final int $t;

    @Override // android.util.Property
    public final Object get(Object obj) {
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
            case 6:
                return get$6(this, obj);
            case 7:
                return get$7(this, obj);
            case 8:
                return get$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return get$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return get$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return get$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return get$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return get$13(this, obj);
            case 14:
                return get$14(this, obj);
            case 15:
                return get$15(this, obj);
            case 16:
                return get$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return get$17(this, obj);
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
            case 6:
                set$6(this, obj, obj2);
                break;
            case 7:
                set$7(this, obj, obj2);
                break;
            case 8:
                set$8(this, obj, obj2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                set$9(this, obj, obj2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                set$10(this, obj, obj2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                set$11(this, obj, obj2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                set$12(this, obj, obj2);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                set$13(this, obj, obj2);
                break;
            case 14:
                set$14(this, obj, obj2);
                break;
            case 15:
                set$15(this, obj, obj2);
                break;
            case 16:
                set$16(this, obj, obj2);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                set$17(this, obj, obj2);
                break;
            default:
                super.set(obj, obj2);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C19LL(java.lang.Class r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            switch(r4) {
                case 0: goto L34;
                case 1: goto L30;
                case 2: goto L2c;
                case 3: goto L2c;
                case 4: goto L30;
                case 5: goto L28;
                case 6: goto L24;
                case 7: goto L20;
                case 8: goto L1c;
                case 9: goto L18;
                case 10: goto L14;
                case 11: goto L10;
                case 12: goto L10;
                case 13: goto L14;
                case 14: goto Lc;
                case 15: goto L5;
                case 16: goto L10;
                case 17: goto L14;
                default: goto L5;
            }
        L5:
            r0 = r2
            java.lang.String r1 = "backgroundColor"
        L8:
            r0.<init>(r3, r1)
            return
        Lc:
            r0 = r2
            java.lang.String r1 = "alpha"
            goto L8
        L10:
            r0 = r2
            java.lang.String r1 = "translationAlpha"
            goto L8
        L14:
            r0 = r2
            java.lang.String r1 = "clipBounds"
            goto L8
        L18:
            r0 = r2
            java.lang.String r1 = "matrix"
            goto L8
        L1c:
            r0 = r2
            java.lang.String r1 = "center_bounds"
            goto L8
        L20:
            r0 = r2
            java.lang.String r1 = ""
            goto L8
        L24:
            r0 = r2
            java.lang.String r1 = "drawable_alpha"
            goto L8
        L28:
            r0 = r2
            java.lang.String r1 = "position"
            goto L8
        L2c:
            r0 = r2
            java.lang.String r1 = "bottomRight"
            goto L8
        L30:
            r0 = r2
            java.lang.String r1 = "topLeft"
            goto L8
        L34:
            r0 = r2
            java.lang.String r1 = "thumbPos"
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19LL.<init>(java.lang.Class, int):void");
    }

    public static final Object get$0(C19LL c19ll, Object obj) {
        return Float.valueOf(((C21411718qp) obj).LLJJL);
    }

    public static final /* bridge */ /* synthetic */ Object get$1(C19LL c19ll, Object obj) {
        return null;
    }

    public static final Object get$10(C19LL c19ll, Object obj) {
        return ((View) obj).getClipBounds();
    }

    public static final Object get$11(C19LL c19ll, Object obj) {
        return Float.valueOf(C214696190k.LIZ.LIZLLL((View) obj));
    }

    public static final Object get$12(C19LL c19ll, Object obj) {
        return Float.valueOf(C21461818yu.LIZ.LIZIZ((View) obj));
    }

    public static final Object get$13(C19LL c19ll, Object obj) {
        return ((View) obj).getClipBounds();
    }

    public static final Object get$14(C19LL c19ll, Object obj) {
        View view = (View) obj;
        if (view != null) {
            return Float.valueOf(view.getAlpha());
        }
        return null;
    }

    public static final Object get$15(C19LL c19ll, Object obj) {
        int color;
        ColorDrawable colorDrawable;
        Drawable background = ((View) obj).getBackground();
        if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null) {
            color = colorDrawable.getColor();
        } else {
            color = -1;
        }
        return Integer.valueOf(color);
    }

    public static final Object get$16(C19LL c19ll, Object obj) {
        return Float.valueOf(C21461118yn.LIZ.LIZIZ((View) obj));
    }

    public static final Object get$17(C19LL c19ll, Object obj) {
        return ((View) obj).getClipBounds();
    }

    public static final /* bridge */ /* synthetic */ Object get$2(C19LL c19ll, Object obj) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object get$3(C19LL c19ll, Object obj) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object get$4(C19LL c19ll, Object obj) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object get$5(C19LL c19ll, Object obj) {
        return null;
    }

    public static final Object get$6(C19LL c19ll, Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public static final /* bridge */ /* synthetic */ Object get$7(C19LL c19ll, Object obj) {
        return null;
    }

    public static final Object get$8(C19LL c19ll, Object obj) {
        View view = (View) obj;
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static final /* bridge */ /* synthetic */ Object get$9(C19LL c19ll, Object obj) {
        return null;
    }

    public static final void set$0(C19LL c19ll, Object obj, Object obj2) {
        ((C21411718qp) obj).setThumbPosition(((Float) obj2).floatValue());
    }

    public static final void set$1(C19LL c19ll, Object obj, Object obj2) {
        C21460018yc c21460018yc = (C21460018yc) obj;
        PointF pointF = (PointF) obj2;
        c21460018yc.getClass();
        c21460018yc.LIZ = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        c21460018yc.LIZIZ = iRound;
        int i = c21460018yc.LJFF + 1;
        c21460018yc.LJFF = i;
        if (i == c21460018yc.LJI) {
            C21461118yn.LIZ(c21460018yc.LJ, c21460018yc.LIZ, iRound, c21460018yc.LIZJ, c21460018yc.LIZLLL);
            c21460018yc.LJFF = 0;
            c21460018yc.LJI = 0;
        }
    }

    public static final void set$10(C19LL c19ll, Object obj, Object obj2) {
        ((View) obj).setClipBounds((Rect) obj2);
    }

    public static final void set$11(C19LL c19ll, Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        C214696190k.LIZ.LIZ((View) obj, fFloatValue);
    }

    public static final void set$12(C19LL c19ll, Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        C21461818yu.LIZ.LIZJ((View) obj, fFloatValue);
    }

    public static final void set$13(C19LL c19ll, Object obj, Object obj2) {
        ((View) obj).setClipBounds((Rect) obj2);
    }

    public static final void set$14(C19LL c19ll, Object obj, Object obj2) {
        View view = (View) obj;
        Number number = (Number) obj2;
        if (number != null && view != null) {
            C786410Ut5.T4(view, number.floatValue());
        }
    }

    public static final void set$15(C19LL c19ll, Object obj, Object obj2) {
        ((View) obj).setBackgroundColor(((Number) obj2).intValue());
    }

    public static final void set$16(C19LL c19ll, Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        C21461118yn.LIZ.LIZJ((View) obj, fFloatValue);
    }

    public static final void set$17(C19LL c19ll, Object obj, Object obj2) {
        ((View) obj).setClipBounds((Rect) obj2);
    }

    public static final void set$2(C19LL c19ll, Object obj, Object obj2) {
        C21460018yc c21460018yc = (C21460018yc) obj;
        PointF pointF = (PointF) obj2;
        c21460018yc.getClass();
        c21460018yc.LIZJ = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        c21460018yc.LIZLLL = iRound;
        int i = c21460018yc.LJI + 1;
        c21460018yc.LJI = i;
        if (c21460018yc.LJFF == i) {
            C21461118yn.LIZ(c21460018yc.LJ, c21460018yc.LIZ, c21460018yc.LIZIZ, c21460018yc.LIZJ, iRound);
            c21460018yc.LJFF = 0;
            c21460018yc.LJI = 0;
        }
    }

    public static final void set$3(C19LL c19ll, Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        C21461118yn.LIZ(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
    }

    public static final void set$4(C19LL c19ll, Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        C21461118yn.LIZ(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
    }

    public static final void set$5(C19LL c19ll, Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int iRound = Math.round(pointF.x);
        int iRound2 = Math.round(pointF.y);
        C21461118yn.LIZ(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
    }

    public static final void set$6(C19LL c19ll, Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }

    public static final void set$7(C19LL c19ll, Object obj, Object obj2) {
        ((C191E) obj).LIZIZ(((Float) obj2).floatValue());
    }

    public static final void set$8(C19LL c19ll, Object obj, Object obj2) {
        Rect rect = (Rect) obj2;
        C214696190k.LIZ.LIZJ((View) obj, rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final void set$9(C19LL c19ll, Object obj, Object obj2) {
        C214696190k.LIZ.LJFF((View) obj, (Matrix) obj2);
    }
}
