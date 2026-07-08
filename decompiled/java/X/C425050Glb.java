package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Glb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425050Glb {
    public static int LIZ;
    public static int LIZIZ;

    public static void LIZLLL(Context context) {
        int i;
        if (context == null) {
            return;
        }
        if (LIZIZ > 0 && LIZ > 0) {
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = 0;
        if (displayMetrics != null) {
            i = displayMetrics.heightPixels;
        } else {
            i = 0;
        }
        LIZIZ = i;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        if (displayMetrics2 != null) {
            i2 = displayMetrics2.widthPixels;
        }
        LIZ = i2;
    }

    public static Pair LIZ(int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5 = (int) (((i2 * i3) * 1.0f) / i);
            if (i5 >= i4) {
                i4 = i5;
            } else {
                i3 = (int) (((i * i4) * 1.0f) / i2);
            }
            return new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return new Pair(0, 0);
    }

    public static Pair LIZIZ(int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5 = (int) (((i2 * i3) * 1.0f) / i);
            if (i5 > i4) {
                i3 = (int) (((i * i4) * 1.0f) / i2);
            } else {
                i4 = i5;
            }
            return new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return new Pair(0, 0);
    }

    public static Pair LIZJ(int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            return new Pair(Integer.valueOf(i3), Integer.valueOf((int) (((i2 * i3) * 1.0f) / i)));
        }
        return new Pair(0, 0);
    }

    public static void LJ(Context context, View view, int i, int i2, int i3) {
        int width;
        int height;
        Pair pairLIZIZ;
        View view2;
        View view3;
        if (view == null) {
            return;
        }
        LIZLLL(context);
        if (view.getWidth() > 0) {
            Object parent = view.getParent();
            if ((parent instanceof ViewGroup) && (view3 = (View) parent) != null) {
                width = view3.getWidth();
            } else {
                width = LIZ;
            }
        } else {
            width = LIZ;
        }
        LIZLLL(context);
        if (view.getHeight() > 0) {
            Object parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup) && (view2 = (View) parent2) != null) {
                height = view2.getHeight();
            } else {
                height = LIZ;
            }
        } else {
            height = LIZIZ;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        double d = ((double) LIZ) / ((double) LIZIZ);
                        if (d <= 0.5d) {
                            double d2 = ((double) i) / ((double) i2);
                            double d3 = ((double) width) / ((double) height);
                            if (d2 >= d3 && d2 <= 0.625d && d3 <= 0.625d && d2 >= 0.4699999988079071d) {
                                if (i > 0 && i2 > 0) {
                                    width = (i * height) / i2;
                                } else {
                                    width = height;
                                }
                            } else if (i > 0 && i2 > 0) {
                                height = (i2 * width) / i;
                            } else {
                                height = width;
                            }
                            pairLIZIZ = new Pair(Integer.valueOf(width), Integer.valueOf(height));
                        } else if (d >= 0.6666666666666666d) {
                            if (((double) i) / ((double) i2) > 1.0d) {
                                if (i > 0 && i2 > 0) {
                                    height = (i2 * width) / i;
                                } else {
                                    height = width;
                                }
                            } else if (i > 0 && i2 > 0) {
                                width = (i * height) / i2;
                            } else {
                                width = height;
                            }
                            pairLIZIZ = new Pair(Integer.valueOf(width), Integer.valueOf(height));
                        } else {
                            double d4 = ((double) i) / ((double) i2);
                            double d5 = ((double) width) / ((double) height);
                            if (d4 >= d5 && d4 <= 0.5625d && d5 <= 0.5625d && d4 >= 0.4699999988079071d) {
                                if (i > 0 && i2 > 0) {
                                    width = (i * height) / i2;
                                } else {
                                    width = height;
                                }
                            } else if (i > 0 && i2 > 0) {
                                height = (i2 * width) / i;
                            } else {
                                height = width;
                            }
                            pairLIZIZ = new Pair(Integer.valueOf(width), Integer.valueOf(height));
                        }
                    } else if (width > 0 && height > 0) {
                        pairLIZIZ = new Pair(Integer.valueOf((int) (((i * height) * 1.0f) / i2)), Integer.valueOf(height));
                    } else {
                        pairLIZIZ = new Pair(0, 0);
                    }
                } else {
                    pairLIZIZ = LIZJ(i, i2, width, height);
                }
            } else {
                pairLIZIZ = LIZ(i, i2, width, height);
            }
        } else {
            pairLIZIZ = LIZIZ(i, i2, width, height);
        }
        int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZIZ.getSecond()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.width == iIntValue && marginLayoutParams.height == iIntValue2) {
            return;
        }
        marginLayoutParams.width = iIntValue;
        marginLayoutParams.height = iIntValue2;
        C786410Ut5.W5(view, marginLayoutParams);
        C786410Ut5.Ab(view, 0.0f);
    }
}
