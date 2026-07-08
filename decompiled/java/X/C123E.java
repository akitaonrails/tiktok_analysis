package X;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.123E, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C123E {
    public abstract String LIZIZ(int i, String str);

    public static Bitmap LIZJ(View view, ViewGroup viewGroup) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Application application = C123O.LIZ;
            if (application == null) {
                application = null;
            }
            bitmapCreateBitmap.setDensity(application.getResources().getDisplayMetrics().densityDpi);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            view.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 1073741824));
            view.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
            C842150X1x.LIZIZ(canvas, view);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            if (C123O.LIZIZ() != null) {
                C123O.LIZIZ().LIZIZ(e);
            }
            return null;
        }
    }

    public final C15O7 LIZ(final C196925122x c196925122x, final View view, String str, int i, int i2, final int i3, final int i4) {
        final int i5 = i2;
        final int i6 = i;
        if (c196925122x != null && view != null && !TextUtils.isEmpty(str)) {
            final String strLIZIZ = LIZIZ(((ViewGroup) view).indexOfChild(c196925122x), str);
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            try {
                if (c0vsj.exists()) {
                    if (c0vsj.isDirectory()) {
                        C2286708xd.LJIIZILJ(strLIZIZ);
                    } else {
                        c0vsj.delete();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C2286708xd.LJIIIIZZ(strLIZIZ, true);
            if (i6 == 0) {
                i6 = C123O.LIZJ().LIZ;
            }
            if (i5 == 0) {
                i5 = C123O.LIZJ().LIZIZ;
            }
            return C15O7.LIZIZ(new Callable() { // from class: X.123F
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bitmap bitmapLIZJ;
                    C123E c123e = this.LL;
                    View view2 = view;
                    View view3 = c196925122x;
                    String str2 = strLIZIZ;
                    c123e.getClass();
                    C1C7U.LIZ("StickerCompiler@8ed9.saveBgTask$1L");
                    C201955140j.LIZ("StickerCompiler -> saveBgTask -> task running");
                    ViewGroup viewGroup = (ViewGroup) view2;
                    if (!(view3 instanceof C196925122x)) {
                        C196950123w c196950123w = new C196950123w(C123E.LIZJ(view3, viewGroup), Integer.valueOf(viewGroup.indexOfChild(view3)));
                        C1C7U.LIZIZ("StickerCompiler@8ed9.saveBgTask$1L");
                        return c196950123w;
                    }
                    if (C0FVW.LIZ((C196925122x) view3)) {
                        bitmapLIZJ = C123E.LIZJ(view3, viewGroup);
                    } else {
                        Function1 function1 = new Function1() { // from class: X.123G
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                View view4 = (View) obj;
                                try {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view4.getMeasuredWidth(), view4.getHeight(), Bitmap.Config.ARGB_8888);
                                    Application application = C123O.LIZ;
                                    if (application == null) {
                                        application = null;
                                    }
                                    bitmapCreateBitmap.setDensity(application.getResources().getDisplayMetrics().densityDpi);
                                    if (view4.getDrawingCacheBackgroundColor() != 0) {
                                        bitmapCreateBitmap.eraseColor(view4.getDrawingCacheBackgroundColor());
                                    }
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.translate(-view4.getScrollX(), -view4.getScrollY());
                                    C842150X1x.LIZIZ(canvas, view4);
                                    return bitmapCreateBitmap;
                                } catch (OutOfMemoryError e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    if (C123O.LIZIZ() != null) {
                                        C123O.LIZIZ().LIZIZ(e2);
                                    }
                                    return null;
                                }
                            }
                        };
                        int childCount = viewGroup.getChildCount();
                        View[] viewArr = new View[childCount];
                        int childCount2 = viewGroup.getChildCount();
                        while (true) {
                            childCount2--;
                            if (childCount2 < 0) {
                                break;
                            }
                            if (viewGroup.getChildAt(childCount2) != view3) {
                                viewArr[childCount2] = viewGroup.getChildAt(childCount2);
                                C786410Ut5.LJJLIL(childCount2, viewGroup);
                            }
                        }
                        int visibility = view3.getVisibility();
                        if (visibility != 0) {
                            C786410Ut5.LJLLLLLL(0, view3);
                        }
                        view3.invalidate();
                        viewGroup.invalidate();
                        Object objInvoke = function1.invoke(viewGroup);
                        if (visibility != 0) {
                            C786410Ut5.LJLLLLLL(visibility, view3);
                        }
                        for (int i7 = 0; i7 < childCount; i7++) {
                            View view4 = viewArr[i7];
                            if (view4 != null) {
                                viewGroup.addView(view4, i7);
                            }
                        }
                        bitmapLIZJ = (Bitmap) objInvoke;
                    }
                    C196950123w c196950123w2 = new C196950123w(bitmapLIZJ, Integer.valueOf(CastIntegerProtector.parseInt(str2.substring(str2.lastIndexOf("_") + 1, str2.lastIndexOf(e3.d)))));
                    C1C7U.LIZIZ("StickerCompiler@8ed9.saveBgTask$1L");
                    return c196950123w2;
                }
            }, C15O7.LJIIIIZZ, null).LJIIZILJ(new InterfaceC2385309Wh() { // from class: X.123H
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C384910F7h c384910F7h;
                    int i7 = i6;
                    int i8 = i5;
                    int i9 = i3;
                    int i10 = i4;
                    String str2 = strLIZIZ;
                    View view2 = c196925122x;
                    C1C7U.LIZ("StickerCompiler@8ed9.saveBgTask$2L");
                    Bitmap bitmapLIZ = C1441060nbU.LIZ(((C196950123w) c15o7.LJIIL()).LIZ, i7, i8, i9, i10);
                    if (C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, bitmapLIZ, new C0VSJ(str2))) {
                        c384910F7h = new C384910F7h(str2, ((C196950123w) c15o7.LJIIL()).LIZIZ.intValue(), view2.hashCode());
                    } else {
                        c384910F7h = null;
                    }
                    C2475009mu.LJ(((C196950123w) c15o7.LJIIL()).LIZ);
                    C2475009mu.LJ(bitmapLIZ);
                    C1C7U.LIZIZ("StickerCompiler@8ed9.saveBgTask$2L");
                    return c384910F7h;
                }
            }, C15O7.LJI);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stickerView = ");
        sbLIZ.append(c196925122x);
        sbLIZ.append(", stickerLayout = ");
        sbLIZ.append(view);
        sbLIZ.append("draftDir = ");
        sbLIZ.append(str);
        return C15O7.LJIIIZ(new NullPointerException(C2188811AlT.LIZIZ(sbLIZ)));
    }
}
