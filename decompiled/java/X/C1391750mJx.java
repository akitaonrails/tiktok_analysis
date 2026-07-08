package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0mJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391750mJx extends Drawable {
    public final C1391730mJv LIZ;
    public final Path LIZIZ = new Path();
    public final Path LIZJ = new Path();
    public final Path LIZLLL = new Path();
    public final Paint LJ = new Paint();
    public final Paint LJFF;
    public final int LJI;
    public final C1391760mJy LJII;
    public final Map<Integer, List<List<C1391760mJy>>> LJIIIIZZ;
    public final Rect LJIIIZ;
    public final Rect LJIIJ;
    public C19751612Pq LJIIJJI;
    public C19751612Pq LJIIL;
    public final List<List<C1391760mJy>> LJIILIIL;
    public final List<List<C1391760mJy>> LJIILJJIL;
    public final List<List<C1391760mJy>> LJIILL;
    public final List<List<C1391760mJy>> LJIILLIIL;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    public C1391750mJx(C1391730mJv c1391730mJv) {
        this.LIZ = c1391730mJv;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        this.LJFF = paint;
        this.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LJII = new C1391760mJy(C418440Gaw.LIZIZ(Float.valueOf(-19.0f)), 0.0f);
        this.LJIIIIZZ = new LinkedHashMap();
        this.LJIIIZ = new Rect(0, 0, 0, 0);
        this.LJIIJ = new Rect(0, 0, 0, 0);
        Double dValueOf = Double.valueOf(-6.71d);
        this.LJIILIIL = C1697810uHb.LJIIJJI(C1697810uHb.LJIIJJI(new C1391760mJy(0.0f, C418440Gaw.LIZIZ(dValueOf)), new C1391760mJy(0.0f, C418440Gaw.LIZIZ(Double.valueOf(-9.88d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(1.31d)), C418440Gaw.LIZIZ(Double.valueOf(-12.45d)))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(2.46d)), C418440Gaw.LIZIZ(Double.valueOf(-14.71d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(4.29d)), C418440Gaw.LIZIZ(Double.valueOf(-16.54d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(6.55d)), C418440Gaw.LIZIZ(Double.valueOf(-17.69d)))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(9.12d)), C418440Gaw.LIZIZ(-19)), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(12.48d)), C418440Gaw.LIZIZ(-19)), new C1391760mJy(C418440Gaw.LIZIZ(19), C418440Gaw.LIZIZ(-19))));
        Double dValueOf2 = Double.valueOf(-1.03d);
        Double dValueOf3 = Double.valueOf(-1.95d);
        float fLIZIZ = C418440Gaw.LIZIZ(dValueOf3);
        Double dValueOf4 = Double.valueOf(-1.3d);
        Double dValueOf5 = Double.valueOf(-3.04d);
        C1391760mJy[] c1391760mJyArr = {new C1391760mJy(C418440Gaw.LIZIZ(dValueOf2), 0.0f), new C1391760mJy(fLIZIZ, C418440Gaw.LIZIZ(dValueOf4)), new C1391760mJy(C418440Gaw.LIZIZ(dValueOf5), C418440Gaw.LIZIZ(Double.valueOf(-2.8d)))};
        C1391760mJy[] c1391760mJyArr2 = {new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-4.66d)), C418440Gaw.LIZIZ(Double.valueOf(-5.15d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-6.67d)), C418440Gaw.LIZIZ(-8)), new C1391760mJy(C418440Gaw.LIZIZ(-10), C418440Gaw.LIZIZ(-8))};
        C1391760mJy[] c1391760mJyArr3 = {new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-16.72d)), C418440Gaw.LIZIZ(-8)), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-19.38d)), C418440Gaw.LIZIZ(-8)), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-21.95d)), C418440Gaw.LIZIZ(Double.valueOf(-9.3d)))};
        float fLIZIZ2 = C418440Gaw.LIZIZ(Double.valueOf(-27.19d));
        Double dValueOf6 = Double.valueOf(-14.55d);
        C1391760mJy[] c1391760mJyArr4 = {new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-24.21d)), C418440Gaw.LIZIZ(Double.valueOf(-10.46d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-26.04d)), C418440Gaw.LIZIZ(Double.valueOf(-12.29d))), new C1391760mJy(fLIZIZ2, C418440Gaw.LIZIZ(dValueOf6))};
        Double dValueOf7 = Double.valueOf(-28.5d);
        float fLIZIZ3 = C418440Gaw.LIZIZ(dValueOf7);
        Double dValueOf8 = Double.valueOf(-17.12d);
        float fLIZIZ4 = C418440Gaw.LIZIZ(dValueOf7);
        Double dValueOf9 = Double.valueOf(-20.48d);
        float fLIZIZ5 = C418440Gaw.LIZIZ(dValueOf7);
        Double dValueOf10 = Double.valueOf(-27.2d);
        this.LJIILJJIL = C1697810uHb.LJIIJJI(C1697810uHb.LJIIJJI(c1391760mJyArr), C1697810uHb.LJIIJJI(c1391760mJyArr2), C1697810uHb.LJIIJJI(c1391760mJyArr3), C1697810uHb.LJIIJJI(c1391760mJyArr4), C1697810uHb.LJIIJJI(new C1391760mJy(fLIZIZ3, C418440Gaw.LIZIZ(dValueOf8)), new C1391760mJy(fLIZIZ4, C418440Gaw.LIZIZ(dValueOf9)), new C1391760mJy(fLIZIZ5, C418440Gaw.LIZIZ(dValueOf10))), Collections.singletonList(new C1391760mJy(0.0f, C418440Gaw.LIZIZ(dValueOf10))));
        this.LJIILL = C1697810uHb.LJIIJJI(C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(dValueOf2), 0.0f), new C1391760mJy(C418440Gaw.LIZIZ(dValueOf3), C418440Gaw.LIZIZ(dValueOf4)), new C1391760mJy(C418440Gaw.LIZIZ(dValueOf5), C418440Gaw.LIZIZ(Double.valueOf(-2.86d)))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-4.66d)), C418440Gaw.LIZIZ(Double.valueOf(-5.15d))), new C1391760mJy(C418440Gaw.LIZIZ(dValueOf), C418440Gaw.LIZIZ(Double.valueOf(-7.49d))), new C1391760mJy(C418440Gaw.LIZIZ(-10), C418440Gaw.LIZIZ(-8))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-10.54d)), C418440Gaw.LIZIZ(Double.valueOf(-8.08d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-12.69d)), C418440Gaw.LIZIZ(Double.valueOf(-8.5d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-13.95d)), C418440Gaw.LIZIZ(Double.valueOf(-9.31d)))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-16.52d)), C418440Gaw.LIZIZ(Double.valueOf(-10.97d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-17.54d)), C418440Gaw.LIZIZ(Double.valueOf(-12.29d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-18.69d)), C418440Gaw.LIZIZ(dValueOf6))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(-20), C418440Gaw.LIZIZ(dValueOf8)), new C1391760mJy(C418440Gaw.LIZIZ(-20), C418440Gaw.LIZIZ(dValueOf9)), new C1391760mJy(C418440Gaw.LIZIZ(-20), C418440Gaw.LIZIZ(dValueOf10))), Collections.singletonList(new C1391760mJy(0.0f, C418440Gaw.LIZIZ(dValueOf10))));
        this.LJIILLIIL = C1697810uHb.LJIIJJI(C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-0.45d)), 0.0f), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-1.19d)), C418440Gaw.LIZIZ(Double.valueOf(-0.86d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-2.08d)), C418440Gaw.LIZIZ(Double.valueOf(-2.17d)))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-3.13d)), C418440Gaw.LIZIZ(Double.valueOf(-3.72d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-4.37d)), C418440Gaw.LIZIZ(Double.valueOf(-5.89d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-5.5d)), C418440Gaw.LIZIZ(-8))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-6.11d)), C418440Gaw.LIZIZ(Double.valueOf(-9.14d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-6.69d)), C418440Gaw.LIZIZ(Double.valueOf(-10.28d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-7.18d)), C418440Gaw.LIZIZ(Double.valueOf(-11.28d)))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-7.95d)), C418440Gaw.LIZIZ(Double.valueOf(-12.83d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-8.52d)), C418440Gaw.LIZIZ(Double.valueOf(-14.07d))), new C1391760mJy(C418440Gaw.LIZIZ(Double.valueOf(-8.69d)), C418440Gaw.LIZIZ(dValueOf6))), C1697810uHb.LJIIJJI(new C1391760mJy(C418440Gaw.LIZIZ(-10), C418440Gaw.LIZIZ(dValueOf8)), new C1391760mJy(C418440Gaw.LIZIZ(-10), C418440Gaw.LIZIZ(dValueOf9)), new C1391760mJy(C418440Gaw.LIZIZ(-10), C418440Gaw.LIZIZ(dValueOf10))), Collections.singletonList(new C1391760mJy(0.0f, C418440Gaw.LIZIZ(dValueOf10))));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1391750mJx.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJ.setColorFilter(colorFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List, java.util.List<java.util.List<X.0mJy>>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final List<List<C1391760mJy>> LIZIZ(int i, boolean z) {
        boolean z2;
        List<List<C1391760mJy>> arrayList;
        if (z) {
            if (this.LJIIIIZZ.containsKey(Integer.valueOf(i))) {
                return (List) ((LinkedHashMap) this.LJIIIIZZ).get(Integer.valueOf(i));
            }
        } else {
            int i2 = -i;
            if (this.LJIIIIZZ.containsKey(Integer.valueOf(i2))) {
                return (List) ((LinkedHashMap) this.LJIIIIZZ).get(Integer.valueOf(i2));
            }
        }
        if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29))) {
            arrayList = this.LJIILJJIL;
        } else {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            if (i <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29)) && iLIZIZ <= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29))) {
                    arrayList = this.LJIILJJIL;
                } else if (i == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))) {
                    arrayList = this.LJIILL;
                } else {
                    arrayList = new ArrayList<>();
                    int i3 = 0;
                    do {
                        ArrayList arrayList2 = new ArrayList();
                        int size = ((List) ListProtector.get(this.LJIILJJIL, i3)).size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList2.add(new C1391760mJy(((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILL, i3), i4)).LIZ + (((((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILJJIL, i3), i4)).LIZ - ((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILL, i3), i4)).LIZ) / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))) * (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)))), ((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILL, i3), i4)).LIZIZ + (((((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILJJIL, i3), i4)).LIZIZ - ((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILL, i3), i4)).LIZIZ) / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))) * (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))))));
                        }
                        arrayList.add(arrayList2);
                        i3++;
                    } while (i3 < 6);
                }
            } else if (i < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) || i >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) || i == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) {
                arrayList = this.LJIILLIIL;
            } else {
                arrayList = new ArrayList<>();
                int i5 = 0;
                do {
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = ((List) ListProtector.get(this.LJIILLIIL, i5)).size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        arrayList3.add(new C1391760mJy(((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILLIIL, i5), i6)).LIZ + (((((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILL, i5), i6)).LIZ - ((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILLIIL, i5), i6)).LIZ) / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) * (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)))), ((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILLIIL, i5), i6)).LIZIZ + (((((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILL, i5), i6)).LIZIZ - ((C1391760mJy) ListProtector.get((List) ListProtector.get(this.LJIILLIIL, i5), i6)).LIZIZ) / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) * (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))))));
                    }
                    arrayList.add(arrayList3);
                    i5++;
                } while (i5 < 6);
            }
        }
        if (z) {
            this.LJIIIIZZ.put(Integer.valueOf(i), (List<List<C1391760mJy>>) arrayList);
            return arrayList;
        }
        ArrayList arrayList4 = new ArrayList();
        for (List<C1391760mJy> list : arrayList) {
            ArrayList arrayList5 = new ArrayList();
            for (C1391760mJy c1391760mJy : list) {
                arrayList5.add(new C1391760mJy(-c1391760mJy.LIZ, c1391760mJy.LIZIZ));
            }
            arrayList4.add(arrayList5);
        }
        this.LJIIIIZZ.put(Integer.valueOf(-i), arrayList4);
        return arrayList4;
    }

    public static void LIZ(Path path, C1391760mJy c1391760mJy, List list, EnumC1235690iGF enumC1235690iGF) {
        if (enumC1235690iGF == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            List list2 = (List) it2.next();
            int size = list2.size();
            if (size != 1) {
                if (size != 3) {
                    return;
                }
                int i = C1235710iGH.LIZ[enumC1235690iGF.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                path.cubicTo(c1391760mJy.LIZ - ((C1391760mJy) ListProtector.get(list2, 0)).LIZ, c1391760mJy.LIZIZ - ((C1391760mJy) ListProtector.get(list2, 0)).LIZIZ, c1391760mJy.LIZ - ((C1391760mJy) ListProtector.get(list2, 1)).LIZ, c1391760mJy.LIZIZ - ((C1391760mJy) ListProtector.get(list2, 1)).LIZIZ, c1391760mJy.LIZ - ((C1391760mJy) ListProtector.get(list2, 2)).LIZ, c1391760mJy.LIZIZ - ((C1391760mJy) ListProtector.get(list2, 2)).LIZIZ);
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            path.cubicTo(c1391760mJy.LIZ - ((C1391760mJy) ListProtector.get(list2, 0)).LIZIZ, c1391760mJy.LIZIZ + ((C1391760mJy) ListProtector.get(list2, 0)).LIZ, c1391760mJy.LIZ - ((C1391760mJy) ListProtector.get(list2, 1)).LIZIZ, c1391760mJy.LIZIZ + ((C1391760mJy) ListProtector.get(list2, 1)).LIZ, c1391760mJy.LIZ - ((C1391760mJy) ListProtector.get(list2, 2)).LIZIZ, c1391760mJy.LIZIZ + ((C1391760mJy) ListProtector.get(list2, 2)).LIZ);
                        }
                    } else {
                        path.cubicTo(c1391760mJy.LIZ + ((C1391760mJy) ListProtector.get(list2, 0)).LIZ, c1391760mJy.LIZIZ + ((C1391760mJy) ListProtector.get(list2, 0)).LIZIZ, c1391760mJy.LIZ + ((C1391760mJy) ListProtector.get(list2, 1)).LIZ, c1391760mJy.LIZIZ + ((C1391760mJy) ListProtector.get(list2, 1)).LIZIZ, c1391760mJy.LIZ + ((C1391760mJy) ListProtector.get(list2, 2)).LIZ, c1391760mJy.LIZIZ + ((C1391760mJy) ListProtector.get(list2, 2)).LIZIZ);
                    }
                } else {
                    path.cubicTo(c1391760mJy.LIZ + ((C1391760mJy) ListProtector.get(list2, 0)).LIZIZ, c1391760mJy.LIZIZ - ((C1391760mJy) ListProtector.get(list2, 0)).LIZ, c1391760mJy.LIZ + ((C1391760mJy) ListProtector.get(list2, 1)).LIZIZ, c1391760mJy.LIZIZ - ((C1391760mJy) ListProtector.get(list2, 1)).LIZ, c1391760mJy.LIZ + ((C1391760mJy) ListProtector.get(list2, 2)).LIZIZ, c1391760mJy.LIZIZ - ((C1391760mJy) ListProtector.get(list2, 2)).LIZ);
                }
            } else {
                LIZJ(path, c1391760mJy, (C1391760mJy) ListProtector.get(list2, 0), enumC1235690iGF);
            }
        }
    }

    public static C1391760mJy LIZJ(Path path, C1391760mJy c1391760mJy, C1391760mJy c1391760mJy2, EnumC1235690iGF enumC1235690iGF) {
        C1391760mJy c1391760mJy3;
        int i = C1235710iGH.LIZ[enumC1235690iGF.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        c1391760mJy3 = new C1391760mJy(c1391760mJy.LIZ - c1391760mJy2.LIZ, c1391760mJy.LIZIZ - c1391760mJy2.LIZIZ);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1391760mJy3 = new C1391760mJy(c1391760mJy.LIZ - c1391760mJy2.LIZIZ, c1391760mJy.LIZIZ + c1391760mJy2.LIZ);
                }
            } else {
                c1391760mJy3 = new C1391760mJy(c1391760mJy.LIZ + c1391760mJy2.LIZ, c1391760mJy.LIZIZ + c1391760mJy2.LIZIZ);
            }
        } else {
            c1391760mJy3 = new C1391760mJy(c1391760mJy.LIZ + c1391760mJy2.LIZIZ, c1391760mJy.LIZIZ - c1391760mJy2.LIZ);
        }
        path.lineTo(c1391760mJy3.LIZ, c1391760mJy3.LIZIZ);
        return c1391760mJy3;
    }
}
