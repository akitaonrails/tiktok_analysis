package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425070nBh {
    public static final List<Float> LIZ;
    public static final List<Float> LIZIZ;
    public static final SecureRandom LIZJ;

    static {
        Float fValueOf = Float.valueOf(1.3333334f);
        Float fValueOf2 = Float.valueOf(1.7777778f);
        LIZ = C1697810uHb.LJIIJJI(fValueOf, fValueOf2, fValueOf, fValueOf);
        LIZIZ = C1697810uHb.LJIIJJI(fValueOf2, fValueOf, fValueOf, fValueOf);
        LIZJ = new SecureRandom();
    }

    public static void LIZ(TuxSkeletonLayout tuxSkeletonLayout, boolean z, List list) {
        float fFloatValue = ((Number) LIZIZ(-1, tuxSkeletonLayout.getContext(), list).getFirst()).floatValue();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        do {
            arrayList.add(LIZIZ(i2, tuxSkeletonLayout.getContext(), list).getSecond());
            i2++;
        } while (i2 < 6);
        float fLIZ = C0JAI.LIZ(12.0f, tuxSkeletonLayout.getContext());
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(tuxSkeletonLayout.findViewById(R.id.nlx));
            arrayList2.add(tuxSkeletonLayout.findViewById(R.id.nly));
            arrayList2.add(tuxSkeletonLayout.findViewById(R.id.nlz));
            arrayList2.add(tuxSkeletonLayout.findViewById(R.id.nm0));
            arrayList2.add(tuxSkeletonLayout.findViewById(R.id.nm1));
            arrayList2.add(tuxSkeletonLayout.findViewById(R.id.nm2));
            ArrayList<C20627315nb> arrayList3 = new ArrayList();
            arrayList3.add(tuxSkeletonLayout.findViewById(R.id.nmz));
            arrayList3.add(tuxSkeletonLayout.findViewById(R.id.nn0));
            arrayList3.add(tuxSkeletonLayout.findViewById(R.id.nn1));
            arrayList3.add(tuxSkeletonLayout.findViewById(R.id.nn2));
            arrayList3.add(tuxSkeletonLayout.findViewById(R.id.nn3));
            arrayList3.add(tuxSkeletonLayout.findViewById(R.id.nn4));
            ArrayList<C20627315nb> arrayList4 = new ArrayList();
            arrayList4.add(tuxSkeletonLayout.findViewById(R.id.nm4));
            arrayList4.add(tuxSkeletonLayout.findViewById(R.id.nm5));
            arrayList4.add(tuxSkeletonLayout.findViewById(R.id.nm6));
            arrayList4.add(tuxSkeletonLayout.findViewById(R.id.nm7));
            arrayList4.add(tuxSkeletonLayout.findViewById(R.id.nm8));
            arrayList4.add(tuxSkeletonLayout.findViewById(R.id.nm9));
            for (Object obj : arrayList2) {
                int i3 = i + 1;
                if (i >= 0) {
                    C20627315nb c20627315nb = (C20627315nb) obj;
                    ViewGroup.LayoutParams layoutParams = c20627315nb.getLayoutParams();
                    int iFloatValue = (int) ((Number) ListProtector.get(arrayList, i)).floatValue();
                    layoutParams.height = iFloatValue;
                    c20627315nb.setSkeletonHeight(iFloatValue);
                    C786410Ut5.T6(c20627315nb, layoutParams);
                    c20627315nb.setRadius(fLIZ);
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            for (C20627315nb c20627315nb2 : arrayList3) {
                ViewGroup.LayoutParams layoutParams2 = c20627315nb2.getLayoutParams();
                int i4 = (int) (((double) fFloatValue) * 0.9d);
                layoutParams2.width = i4;
                c20627315nb2.setSkeletonWidth(i4);
                C786410Ut5.T6(c20627315nb2, layoutParams2);
            }
            for (C20627315nb c20627315nb3 : arrayList4) {
                ViewGroup.LayoutParams layoutParams3 = c20627315nb3.getLayoutParams();
                int i5 = (int) (((double) fFloatValue) * 0.5d);
                layoutParams3.width = i5;
                c20627315nb3.setSkeletonWidth(i5);
                C786410Ut5.T6(c20627315nb3, layoutParams3);
            }
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(tuxSkeletonLayout.findViewById(R.id.nlr));
        arrayList5.add(tuxSkeletonLayout.findViewById(R.id.nls));
        arrayList5.add(tuxSkeletonLayout.findViewById(R.id.nlt));
        arrayList5.add(tuxSkeletonLayout.findViewById(R.id.nlu));
        arrayList5.add(tuxSkeletonLayout.findViewById(R.id.nlv));
        arrayList5.add(tuxSkeletonLayout.findViewById(R.id.nlw));
        for (Object obj2 : arrayList5) {
            int i6 = i + 1;
            if (i >= 0) {
                C20627315nb c20627315nb4 = (C20627315nb) obj2;
                ViewGroup.LayoutParams layoutParams4 = c20627315nb4.getLayoutParams();
                float fFloatValue2 = ((Number) ListProtector.get(arrayList, i)).floatValue();
                if (((Boolean) C0BOK.LIZ.getValue()).booleanValue()) {
                    fFloatValue2 += C0JAI.LIZ(44.0f, tuxSkeletonLayout.getContext());
                }
                int i7 = (int) fFloatValue2;
                layoutParams4.height = i7;
                c20627315nb4.setSkeletonHeight(i7);
                C786410Ut5.T6(c20627315nb4, layoutParams4);
                c20627315nb4.setRadius(fLIZ);
                i = i6;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static Pair LIZIZ(int i, Context context, List list) {
        float fFloatValue;
        float f = 2;
        float screenWidth = ((ScreenUtils.getScreenWidth(context) - (C11VU.LIZ(12.0f) * f)) - C11VU.LIZ(8.0f)) / f;
        if (i < list.size() && i >= 0) {
            fFloatValue = ((Number) ListProtector.get(list, i)).floatValue();
        } else {
            fFloatValue = 1.7777778f;
        }
        return new Pair(Float.valueOf(screenWidth), Float.valueOf(fFloatValue * screenWidth));
    }
}
