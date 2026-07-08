package Y;

import X.C1041860dDc;
import X.C1045580dJc;
import X.C1045610dJf;
import X.C1045820dK0;
import X.C1046040dKM;
import X.C1046060dKO;
import X.C1046110dKT;
import X.C1053040dVe;
import X.C1072640e1G;
import X.C1075580e60;
import X.C1075950e6b;
import X.C11NZ;
import X.EnumC1074240e3q;
import X.InterfaceC1487280oo2;
import android.view.View;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public class AkS478S0100000_16 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public AkS478S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS478S0100000_16 akS478S0100000_16, Object obj) {
        C1075950e6b.LIZJ();
        ((SocialRecRequestViewModel) akS478S0100000_16.l0).setState(AFwS252S0000000_16.get$arr$(425));
        C1072640e1G c1072640e1G = C1072640e1G.LIZ;
        EnumC1074240e3q enumC1074240e3q = EnumC1074240e3q.NEW_VERSION;
        c1072640e1G.getClass();
        return C1072640e1G.LIZJ(enumC1074240e3q);
    }

    public static final Object apply$1(AkS478S0100000_16 akS478S0100000_16, Object obj) {
        Throwable th = (Throwable) obj;
        Function1<Throwable, Boolean> function1 = ((C1075580e60) akS478S0100000_16.l0).LL;
        if (function1 == null || function1.invoke(th).booleanValue()) {
            C1075580e60 c1075580e60 = (C1075580e60) akS478S0100000_16.l0;
            int i = c1075580e60.LLILZ + 1;
            c1075580e60.LLILZ = i;
            if (i <= c1075580e60.LLILLJJLI) {
                return C11NZ.LJLJJLL(c1075580e60.LLILLL, TimeUnit.MILLISECONDS);
            }
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$2(AkS478S0100000_16 akS478S0100000_16, Object obj) {
        C1046040dKM c1046040dKM = (C1046040dKM) akS478S0100000_16.l0;
        C1046060dKO c1046060dKO = c1046040dKM.LIZ;
        String str = null;
        c1046060dKO.LJ = null;
        c1046060dKO.LJFF = false;
        c1046060dKO.LIZ.clear();
        c1046060dKO.LIZIZ.clear();
        c1046060dKO.LIZJ.clear();
        c1046060dKO.LIZLLL.clear();
        C1046060dKO c1046060dKO2 = c1046040dKM.LIZ;
        c1046060dKO2.getClass();
        C1045820dK0 c1045820dK0 = C1045820dK0.LIZLLL;
        if (c1045820dK0 != null) {
            for (C1045610dJf c1045610dJf : c1045820dK0.LIZIZ) {
                View view = c1045610dJf.LIZIZ.get();
                if (view == null) {
                    break;
                }
                String str2 = c1045610dJf.LJI;
                if (c1045610dJf.LIZLLL && !c1045610dJf.LJ && view.hasWindowFocus() && view.hasWindowFocus()) {
                    HashSet hashSet = new HashSet();
                    View view2 = view;
                    while (C1045580dJc.LIZ(view2)) {
                        hashSet.add(view2);
                        Object parent = view2.getParent();
                        if (!(parent instanceof View) || (view2 = (View) parent) == null) {
                            c1046060dKO2.LIZJ.addAll(hashSet);
                            c1046060dKO2.LIZ.put(view, str2);
                            c1046060dKO2.LIZLLL.add(str2);
                            for (WeakReference<View> weakReference : c1045610dJf.LIZJ) {
                                if (weakReference.get() != null) {
                                    c1046060dKO2.LIZIZ.put(weakReference.get(), str2);
                                }
                            }
                            c1046060dKO2.LJ = c1045610dJf;
                        }
                    }
                }
            }
        }
        C1045610dJf c1045610dJf2 = c1046040dKM.LIZ.LJ;
        c1046040dKM.LIZJ = c1045610dJf2;
        if (c1045610dJf2 != null && c1045610dJf2.LIZLLL && !c1045610dJf2.LJ && c1045610dJf2.LIZIZ.get() != null) {
            C1046110dKT c1046110dKT = new C1046110dKT(System.nanoTime(), c1046040dKM.LIZJ.LJI);
            View rootView = c1046040dKM.LIZJ.LIZIZ.get().getRootView();
            c1046110dKT.LIZJ = true;
            c1046040dKM.LIZJ(rootView, c1046110dKT);
            return c1046110dKT;
        }
        long jNanoTime = System.nanoTime();
        C1045610dJf c1045610dJf3 = c1046040dKM.LIZJ;
        if (c1045610dJf3 != null) {
            str = c1045610dJf3.LJI;
        }
        return new C1046110dKT(jNanoTime, str);
    }

    public static final Object apply$3(AkS478S0100000_16 akS478S0100000_16, Object obj) {
        return new C1053040dVe(((C1041860dDc) akS478S0100000_16.l0).LIZ, (MultiTranslationResult) obj);
    }
}
