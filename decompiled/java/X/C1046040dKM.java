package X;

import Y.AfS138S0000000_16;
import Y.AkS478S0100000_16;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0dKM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046040dKM {
    public static final C1046040dKM LJ = new C1046040dKM();
    public final C1046060dKO LIZ = new C1046060dKO();
    public final C11NJ LIZIZ = new C11NJ();
    public C1045610dJf LIZJ;
    public boolean LIZLLL;

    public final void LIZIZ() {
        this.LIZLLL = false;
        C1046060dKO c1046060dKO = this.LIZ;
        c1046060dKO.LJ = null;
        c1046060dKO.LJFF = false;
        c1046060dKO.LIZ.clear();
        c1046060dKO.LIZIZ.clear();
        c1046060dKO.LIZJ.clear();
        c1046060dKO.LIZLLL.clear();
        C1045810dJz.LIZIZ.LIZ.clear();
        this.LIZIZ.LJ();
    }

    public final void LIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        this.LIZIZ.LIZ(C11NZ.LJJJJLI(200L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS478S0100000_16(this, 2)).LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0dKN
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C1046110dKT c1046110dKT = (C1046110dKT) obj;
                float fLIZ = 0.0f;
                if (c1046110dKT.LIZJ) {
                    long j = c1046110dKT.LIZ;
                    Context context = C1045820dK0.LIZLLL.LIZJ.get();
                    if (context != null) {
                        C1046070dKP c1046070dKP = c1046110dKT.LIZLLL;
                        ArrayList<C1046070dKP> arrayListLIZ = C1046080dKQ.LIZ(c1046070dKP.LIZIZ(new C1046070dKP(0, 0, C0KWF.LIZIZ(context), C0KWF.LIZ(context), c1046070dKP.LJ)), c1046110dKT.LJ);
                        SystemClock.currentThreadTimeMillis();
                        HashSet hashSet = new HashSet();
                        HashSet hashSet2 = new HashSet();
                        for (C1046070dKP c1046070dKP2 : arrayListLIZ) {
                            hashSet.add(Integer.valueOf(c1046070dKP2.LIZ));
                            hashSet.add(Integer.valueOf(c1046070dKP2.LIZJ));
                            hashSet2.add(Integer.valueOf(c1046070dKP2.LIZIZ));
                            hashSet2.add(Integer.valueOf(c1046070dKP2.LIZLLL));
                        }
                        ArrayList arrayList = new ArrayList(hashSet);
                        ArrayList arrayList2 = new ArrayList(hashSet2);
                        Collections.sort(arrayList);
                        Collections.sort(arrayList2);
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i >= arrayList.size() - 1) {
                                break;
                            }
                            int i3 = 0;
                            for (int i4 = 1; i3 < arrayList2.size() - i4; i4 = 1) {
                                int i5 = i + 1;
                                int iIntValue = ((Integer) ListProtector.get(arrayList, i5)).intValue() - ((Integer) ListProtector.get(arrayList, i)).intValue();
                                int i6 = i3 + 1;
                                int iIntValue2 = ((Integer) ListProtector.get(arrayList2, i6)).intValue() - ((Integer) ListProtector.get(arrayList2, i3)).intValue();
                                boolean z = false;
                                for (C1046070dKP c1046070dKP3 : arrayListLIZ) {
                                    if (c1046070dKP3.LIZ <= ((Integer) ListProtector.get(arrayList, i)).intValue() && c1046070dKP3.LIZJ >= ((Integer) ListProtector.get(arrayList, i5)).intValue() && c1046070dKP3.LIZLLL >= ((Integer) ListProtector.get(arrayList2, i6)).intValue() && c1046070dKP3.LIZIZ <= ((Integer) ListProtector.get(arrayList2, i3)).intValue()) {
                                        z = true;
                                    }
                                }
                                if (z) {
                                    i2 += iIntValue * iIntValue2;
                                }
                                i3 = i6;
                            }
                            i++;
                        }
                        fLIZ = (r12.LIZ() - i2) / c1046110dKT.LIZLLL.LIZ();
                    }
                    return new C1045840dK2(j, c1046110dKT.LIZIZ, fLIZ);
                }
                return new C1045840dK2(c1046110dKT.LIZ, c1046110dKT.LIZIZ, 0.0f);
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS138S0000000_16(16), new AfS138S0000000_16(17)));
    }

    public final void LIZJ(View view, C1046110dKT c1046110dKT) {
        EnumC1046120dKU enumC1046120dKU;
        C1046070dKP c1046070dKP;
        if (!C1045580dJc.LIZ(view)) {
            return;
        }
        C1046060dKO c1046060dKO = this.LIZ;
        if (c1046060dKO.LIZJ.contains(view)) {
            enumC1046120dKU = EnumC1046120dKU.PARENT_VIEW;
        } else if (c1046060dKO.LJFF) {
            enumC1046120dKU = EnumC1046120dKU.OBSTRUCTION_VIEW;
        } else {
            enumC1046120dKU = EnumC1046120dKU.UNDERLYING_VIEW;
        }
        if (enumC1046120dKU == EnumC1046120dKU.UNDERLYING_VIEW) {
            return;
        }
        boolean z = true;
        int i = 0;
        if (this.LIZ.LIZ.containsKey(view)) {
            this.LIZ.LJFF = true;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            c1046110dKT.LIZLLL = new C1046070dKP(i2, iArr[1], view.getWidth() + i2, view.getHeight() + iArr[1], String.valueOf(view.getId()));
            return;
        }
        EnumC1046120dKU enumC1046120dKU2 = EnumC1046120dKU.PARENT_VIEW;
        if (enumC1046120dKU != enumC1046120dKU2) {
            if (!this.LIZ.LIZIZ.containsKey(view)) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                int i3 = iArr2[0];
                c1046070dKP = new C1046070dKP(i3, iArr2[1], view.getWidth() + i3, iArr2[1] + view.getHeight(), String.valueOf(view.getId()));
                c1046110dKT.LJ.add(c1046070dKP);
            } else {
                c1046070dKP = new C1046070dKP(0, 0, 0, 0, "");
            }
            C1046070dKP c1046070dKP2 = c1046110dKT.LIZLLL;
            if (c1046070dKP2 != null && c1046070dKP.LIZIZ(c1046070dKP2).LIZ() == 0 && (view instanceof ViewGroup) && ((ViewGroup) view).getClipChildren()) {
                return;
            }
        }
        if (enumC1046120dKU != enumC1046120dKU2) {
            z = false;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (z) {
            HashMap map = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((ArrayList) map.get(it2.next())).iterator();
                while (it3.hasNext()) {
                    LIZJ((View) it3.next(), c1046110dKT);
                }
            }
            return;
        }
        while (i < viewGroup.getChildCount()) {
            LIZJ(viewGroup.getChildAt(i), c1046110dKT);
            i++;
        }
    }
}
