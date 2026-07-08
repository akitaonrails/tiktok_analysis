package X;

import Y.ALAdapterS6S0400000_32;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.190z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214711190z {
    public final Map<String, C191C> LIZ;
    public final AbstractC214710190y LIZIZ;
    public int LIZJ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public boolean LIZLLL = true;

    public C214711190z(Map<String, C191C> map, AbstractC214710190y abstractC214710190y) {
        this.LIZ = map;
        this.LIZIZ = abstractC214710190y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(View view, View view2, Runnable runnable, C1447920nmY c1447920nmY, AnonymousClass1912 anonymousClass1912, Runnable runnable2) {
        ArrayList<AnonymousClass1914> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Set<String> setKeySet = this.LIZ.keySet();
        C830490Whz c830490Whz = new C830490Whz();
        for (String str : setKeySet) {
            View viewLIZIZ = C21465618zW.LIZIZ(view, true, str);
            if (viewLIZIZ == null) {
                int i = AnonymousClass1911.LIZ[anonymousClass1912.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        runnable2.run();
                        return;
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cant find ");
                    sbLIZ.append(str);
                    sbLIZ.append(" View");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            c830490Whz.put(str, viewLIZIZ);
        }
        for (C801600VcU c801600VcU : (ArrayList) C21465618zW.LJ(c830490Whz)) {
            C191C c191c = this.LIZ.get(c801600VcU.LIZ);
            View view3 = (View) c801600VcU.LIZIZ;
            View viewLIZIZ2 = C21465618zW.LIZIZ(view2, false, (String) c801600VcU.LIZ);
            if (viewLIZIZ2 == null) {
                int i2 = AnonymousClass1911.LIZ[anonymousClass1912.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        runnable2.run();
                        return;
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cant find ");
                    sbLIZ2.append((String) c801600VcU.LIZ);
                    sbLIZ2.append(" View");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            arrayList.add(new AnonymousClass1914(view3, viewLIZIZ2, c191c));
            arrayList2.add(view3);
        }
        ArrayList arrayList3 = new ArrayList();
        for (AnonymousClass1914 anonymousClass1914 : arrayList) {
            C191C c191c2 = anonymousClass1914.LIZJ;
            View view4 = anonymousClass1914.LIZ;
            c191c2.LIZ(view4, anonymousClass1914.LIZIZ, view4);
            C21465618zW.LIZLLL(anonymousClass1914.LIZ, (ViewGroup) view);
            arrayList3.add(anonymousClass1914.LIZJ.LIZLLL(false));
            C786410Ut5.LJLLLLLL(4, anonymousClass1914.LIZIZ);
        }
        ArrayList arrayList4 = new ArrayList();
        C21465618zW.LIZ(view, view, arrayList4);
        List<View> list = C21465618zW.LJFF(arrayList4).LIZ;
        list.removeAll(arrayList2);
        if (this.LIZIZ != null) {
            ArrayList<Animator> arrayList5 = new ArrayList();
            for (View view5 : list) {
                AbstractC214710190y abstractC214710190yClone = this.LIZIZ.clone();
                abstractC214710190yClone.LLILLL = this.LIZJ;
                abstractC214710190yClone.LIZ(view5, (ViewGroup) view);
                arrayList5.add(abstractC214710190yClone.LIZLLL(false));
            }
            Iterator it2 = arrayList5.iterator();
            long jMin = Long.MAX_VALUE;
            while (it2.hasNext()) {
                jMin = Math.min(jMin, ((Animator) it2.next()).getStartDelay());
            }
            for (Animator animator : arrayList5) {
                animator.setStartDelay(animator.getStartDelay() - jMin);
            }
            arrayList3.addAll(arrayList5);
        }
        if (view.getBackground() != null) {
            C214706190u c214706190u = new C214706190u();
            c214706190u.LL = view;
            c214706190u.LLILLJJLI = (ViewGroup) view;
            arrayList3.add(c214706190u.LIZLLL(false));
        }
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList3);
        animatorSet.setDuration(this.LIZJ);
        animatorSet.addListener(new ALAdapterS6S0400000_32(view2, arrayList, runnable, this, 1));
        animatorSet.start();
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.1913
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                animatorSet.end();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(View view, View view2, Runnable runnable, C1447920nmY c1447920nmY, AnonymousClass1912 anonymousClass1912, Runnable runnable2) {
        Set<String> setKeySet = this.LIZ.keySet();
        C830490Whz c830490Whz = new C830490Whz();
        for (String str : setKeySet) {
            View viewLIZIZ = C21465618zW.LIZIZ(view2, true, str);
            if (viewLIZIZ == null) {
                int i = AnonymousClass1911.LIZ[anonymousClass1912.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        runnable2.run();
                        return;
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cant find ");
                    sbLIZ.append(str);
                    sbLIZ.append(" View");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            c830490Whz.put(str, viewLIZIZ);
        }
        List<C801600VcU<String, View>> listLJ = C21465618zW.LJ(c830490Whz);
        ArrayList<AnonymousClass1914> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < ((ArrayList) listLJ).size(); i2++) {
            String str2 = (String) ((C801600VcU) ListProtector.get(listLJ, i2)).LIZ;
            C191C c191c = this.LIZ.get(str2);
            View viewLIZIZ2 = C21465618zW.LIZIZ(view, true, str2);
            View view3 = (View) ((C801600VcU) ListProtector.get(listLJ, i2)).LIZIZ;
            if (viewLIZIZ2 == null) {
                int i3 = AnonymousClass1911.LIZ[anonymousClass1912.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        runnable2.run();
                        return;
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cant find ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(" View");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            arrayList.add(new AnonymousClass1914(viewLIZIZ2, view3, c191c));
            arrayList2.add(view3);
        }
        ArrayList arrayList3 = new ArrayList();
        for (AnonymousClass1914 anonymousClass1914 : arrayList) {
            C191C c191c2 = anonymousClass1914.LIZJ;
            View view4 = anonymousClass1914.LIZ;
            View view5 = anonymousClass1914.LIZIZ;
            c191c2.LIZ(view4, view5, view5);
            C21465618zW.LIZLLL(anonymousClass1914.LIZIZ, (ViewGroup) view2);
            arrayList3.add(anonymousClass1914.LIZJ.LIZLLL(true));
            C786410Ut5.LJLLLLLL(4, anonymousClass1914.LIZ);
        }
        ArrayList arrayList4 = new ArrayList();
        C21465618zW.LIZ(view2, view2, arrayList4);
        List<View> list = C21465618zW.LJFF(arrayList4).LIZ;
        list.removeAll(arrayList2);
        if (this.LIZIZ != null) {
            ArrayList<Animator> arrayList5 = new ArrayList();
            for (View view6 : list) {
                AbstractC214710190y abstractC214710190yClone = this.LIZIZ.clone();
                abstractC214710190yClone.LLILLL = this.LIZJ;
                abstractC214710190yClone.LIZ(view6, (ViewGroup) view2);
                arrayList5.add(abstractC214710190yClone.LIZLLL(true));
            }
            Iterator it2 = arrayList5.iterator();
            long jMin = Long.MAX_VALUE;
            while (it2.hasNext()) {
                jMin = Math.min(jMin, ((Animator) it2.next()).getStartDelay());
            }
            for (Animator animator : arrayList5) {
                animator.setStartDelay(animator.getStartDelay() - jMin);
            }
            arrayList3.addAll(arrayList5);
        }
        if (view2.getBackground() != null) {
            C214706190u c214706190u = new C214706190u();
            c214706190u.LL = view2;
            c214706190u.LLILLJJLI = (ViewGroup) view2;
            arrayList3.add(c214706190u.LIZLLL(true));
        }
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList3);
        animatorSet.setDuration(this.LIZJ);
        animatorSet.addListener(new ALAdapterS6S0400000_32(view2, arrayList, runnable, this, 0));
        animatorSet.start();
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.1910
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                animatorSet.end();
            }
        });
    }
}
