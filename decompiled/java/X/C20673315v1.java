package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15v1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20673315v1 {
    public static final C20673315v1 LIZ = new C20673315v1();

    public static Bitmap LIZJ(C20673315v1 c20673315v1, View view, float f, Bitmap.Config config, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            config = Bitmap.Config.RGB_565;
        }
        c20673315v1.getClass();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (measuredWidth * f), (int) (measuredHeight * f), config);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(f, f);
            view.draw(canvas);
            return bitmapCreateBitmap;
        }
        return null;
    }

    public static C21647019ng LIZ(String str, Context context, View view, C0HU6 c0hu6, C20673415v2 c20673415v2, final Function1 function1, final Function1 function12) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        Float f5;
        Float f6;
        ArrayList arrayList = new ArrayList();
        Float f7 = c20673415v2.LIZ;
        if (f7 != null && (f6 = c20673415v2.LIZIZ) != null && !Intrinsics.LJ(f7, f6)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_x");
            arrayList.add(new C19746412Nq(C2188811AlT.LIZIZ(sbLIZ), new C082N(c20673415v2.LIZ.floatValue(), c20673415v2.LIZIZ.floatValue())));
        }
        Float f8 = c20673415v2.LIZJ;
        if (f8 != null && (f5 = c20673415v2.LIZLLL) != null && !Intrinsics.LJ(f8, f5)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_y");
            arrayList.add(new C19746412Nq(C2188811AlT.LIZIZ(sbLIZ2), new C0HV5(c20673415v2.LIZJ.floatValue(), c20673415v2.LIZLLL.floatValue())));
        }
        Float f9 = c20673415v2.LJ;
        if (f9 != null && (f4 = c20673415v2.LJFF) != null && !Intrinsics.LJ(f9, f4)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("_alpha");
            arrayList.add(new C19746412Nq(C2188811AlT.LIZIZ(sbLIZ3), new C0HUY(c20673415v2.LJ.floatValue(), c20673415v2.LJFF.floatValue())));
        }
        Float f10 = c20673415v2.LJI;
        if (f10 != null && (f3 = c20673415v2.LJII) != null && !Intrinsics.LJ(f10, f3)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append("_scaleX");
            arrayList.add(new C19746412Nq(C2188811AlT.LIZIZ(sbLIZ4), new C0HIW(c20673415v2.LJI.floatValue(), c20673415v2.LJII.floatValue())));
        }
        Float f11 = c20673415v2.LJIIIIZZ;
        if (f11 != null && (f2 = c20673415v2.LJIIIZ) != null && !Intrinsics.LJ(f11, f2)) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append("_scaleY");
            arrayList.add(new C19746412Nq(C2188811AlT.LIZIZ(sbLIZ5), new C0HIX(c20673415v2.LJIIIIZZ.floatValue(), c20673415v2.LJIIIZ.floatValue())));
        }
        Float f12 = c20673415v2.LJIIJ;
        if (f12 != null && (f = c20673415v2.LJIIJJI) != null && !Intrinsics.LJ(f12, f)) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(str);
            sbLIZ6.append("_rotation");
            arrayList.add(new C19746412Nq(C2188811AlT.LIZIZ(sbLIZ6), new C1880107Xz(c20673415v2.LJIIJ.floatValue(), c20673415v2.LJIIJJI.floatValue())));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        final C21647019ng c21647019ng = new C21647019ng(context, view, new C19746312Np(EnumC19746112Nn.SPRING, c0hu6, arrayList), false);
        c21647019ng.LIZJ(((C19746412Nq) C13LP.LJJJJZI(arrayList)).LIZ, new InterfaceC21641019mi() { // from class: X.0HXj
            @Override // X.InterfaceC21641019mi
            public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                Function1<C21647019ng, Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(c21647019ng);
                }
            }

            @Override // X.InterfaceC21641019mi
            public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                Function1<InterfaceC1844880y6o, Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(interfaceC1844880y6o);
                }
            }
        });
        return c21647019ng;
    }
}
