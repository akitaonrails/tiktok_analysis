package X;

import Y.ARunnableS103S0100000_3;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.provider.impl.GScope;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558520qew {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.AbstractC738140SxQ r9) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1558520qew.LIZLLL(X.0SxQ):void");
    }

    public static final void LJIIIZ(Function0 function0) {
        if (!((Boolean) C07FG.LJII.getValue()).booleanValue() && C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    interfaceC723720SaA.log("Ability", (String) function0.invoke());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final InterfaceC665370Q7z LJIIL(AbstractC738140SxQ abstractC738140SxQ) {
        if (C725080ScM.LJIJI) {
            return abstractC738140SxQ.getVAssemScope();
        }
        C1558420qem.LIZJ(abstractC738140SxQ);
        return abstractC738140SxQ;
    }

    public static final InterfaceC665370Q7z LJIILIIL(InterfaceC713360RyY interfaceC713360RyY) {
        return ((ScopeViewModel) new ViewModelProvider(interfaceC713360RyY.LLIIIILZ()).get(ScopeViewModel.class)).vQ2("assem_logic_scope");
    }

    public static final <T extends InterfaceC494301wD> T LIZJ(InterfaceC665370Q7z interfaceC665370Q7z, Class<? extends T> cls) {
        try {
            return (T) LIZ(interfaceC665370Q7z, cls, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String strLIZJ = C1554600qYc.LIZJ(interfaceC665370Q7z, cls);
            LJIIIZ(new C0H67(interfaceC665370Q7z, cls, strLIZJ));
            throw new Exception(strLIZJ, th);
        }
    }

    public static final InterfaceC665370Q7z LJ(LifecycleOwner lifecycleOwner, Class cls) throws IllegalAccessException {
        if (!C1562540qlQ.LIZJ) {
            if (Intrinsics.LJFF(cls, GScope.class)) {
                return GScope.LL;
            }
            C1561890qkN c1561890qkN = C1561890qkN.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                if (arrayList.size() > 0) {
                    Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEventBegin(c1561890qkN);
                    }
                }
                if (C725480Sd0.LIZ(c1561890qkN)) {
                    C725430Scv.LIZ(new C1558550qez(c1561890qkN, "default", SystemClock.elapsedRealtimeNanos()));
                }
            }
            for (Object objLIZLLL = lifecycleOwner; objLIZLLL != null; objLIZLLL = C1554600qYc.LIZLLL(objLIZLLL)) {
                for (Class<?> superclass = objLIZLLL.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    if (C13LP.LJJJJ(cls, C1554600qYc.LIZIZ(superclass))) {
                        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1554600qYc.LIZ(objLIZLLL);
                        C1561890qkN c1561890qkN2 = C1561890qkN.LIZ;
                        if (!C725450Scx.LIZJ) {
                            return interfaceC665370Q7zLIZ;
                        }
                        ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                        if (arrayList2.size() > 0) {
                            Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                it3.next().onEventEnd(c1561890qkN2);
                            }
                        }
                        if (!C725480Sd0.LIZ(c1561890qkN2)) {
                            return interfaceC665370Q7zLIZ;
                        }
                        C725430Scv.LIZ(new C723470SZl(c1561890qkN2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())));
                        return interfaceC665370Q7zLIZ;
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can not find scope define for lifecycleOwner! ");
            sbLIZ.append(lifecycleOwner);
            throw new IllegalAccessException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!Intrinsics.LJFF(cls, GScope.class) && cls != null) {
            for (Object objLIZLLL2 = lifecycleOwner; objLIZLLL2 != null; objLIZLLL2 = C1554600qYc.LIZLLL(objLIZLLL2)) {
                if ((objLIZLLL2 instanceof C0QSJ) && ((C0QSJ) objLIZLLL2).getScopes().contains(cls)) {
                    return C1554600qYc.LIZ(objLIZLLL2);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("can not find scope define for lifecycleOwner! ");
            sbLIZ2.append(lifecycleOwner);
            throw new IllegalAccessException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return GScope.LL;
    }

    public static final String LJFF(Class<? extends InterfaceC494301wD> cls, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ability-tag-");
        sbLIZ.append(cls.getName());
        sbLIZ.append('-');
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final <T extends InterfaceC494301wD> T LIZ(InterfaceC665370Q7z interfaceC665370Q7z, Class<? extends T> cls, String str) {
        String str2;
        InterfaceC494301wD interfaceC494301wDProvideAbility;
        C1554630qYf c1554630qYf;
        InterfaceC1554640qYg interfaceC1554640qYg;
        Object ability;
        C0QSJ c0qsj;
        C1561850qkJ c1561850qkJ = C1561850qkJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC665370Q7z.hashCode());
        sbLIZ.append(C786410Ut5.u3().getName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c1561850qkJ);
                }
            }
            if (C725480Sd0.LIZ(c1561850qkJ)) {
                C725430Scv.LIZ(new C723510SZp(c1561850qkJ, strLIZIZ, SystemClock.elapsedRealtimeNanos()));
            }
        }
        T t = null;
        if (((ArrayList) C1562540qlQ.LIZ.getValue()).contains(cls)) {
            Iterator<Object> it3 = new C1957407lc(new C1566320qrW(interfaceC665370Q7z, null)).iterator();
            while (true) {
                C2152008bu c2152008bu = (C2152008bu) it3;
                if (c2152008bu.hasNext()) {
                    Object host = ((InterfaceC665370Q7z) c2152008bu.next()).getHost();
                    if (host != null && (host instanceof C0QSJ) && (c0qsj = (C0QSJ) host) != null && (ability = c0qsj.getAbility(cls)) != null) {
                        break;
                    }
                } else {
                    ability = null;
                    break;
                }
            }
            T t2 = (T) ability;
            if (t2 != null) {
                return t2;
            }
        }
        String strLJFF = LJFF(cls, str);
        if (strLJFF == null) {
            str2 = "source_default_key";
        } else {
            str2 = strLJFF;
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, str2, C1554630qYf.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (c1554630qYf = (C1554630qYf) interfaceC1555100qZQLIZIZ.getSource()) != null && (interfaceC1554640qYg = c1554630qYf.LL) != null) {
            interfaceC494301wDProvideAbility = interfaceC1554640qYg.provideAbility(cls.getCanonicalName());
        } else {
            interfaceC494301wDProvideAbility = null;
        }
        if (interfaceC494301wDProvideAbility instanceof InterfaceC494301wD) {
            t = (T) interfaceC494301wDProvideAbility;
        }
        C1561850qkJ c1561850qkJ2 = C1561850qkJ.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(interfaceC665370Q7z.hashCode());
        sbLIZ2.append(C786410Ut5.u3().getName());
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    it4.next().onEventEnd(c1561850qkJ2);
                }
            }
            if (C725480Sd0.LIZ(c1561850qkJ2)) {
                C725430Scv.LIZ(new C1558580qf2(c1561850qkJ2, strLIZIZ2, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), cls, t, interfaceC665370Q7z));
            }
        }
        LJIIIZ(new C1520205xI(t, cls, strLJFF));
        if (t == null) {
            LJIIIZ(new C1555610qaF(interfaceC665370Q7z, cls));
        }
        return t;
    }

    public static final Object LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z, C19719912Dl c19719912Dl, C19719912Dl c19719912Dl2) {
        Object ability;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z, C09R7.LIZ(c19719912Dl));
        if (c0qsjLIZJ == null || (ability = c0qsjLIZJ.getAbility(C09R7.LIZ(c19719912Dl2))) == null) {
            return null;
        }
        return ability;
    }

    public static final void LJIIJJI(InterfaceC665370Q7z interfaceC665370Q7z, Class<? extends InterfaceC494301wD> cls, String str) {
        LJIIIZ(new C1196540hF6(interfaceC665370Q7z, cls));
        String strLJFF = LJFF(cls, str);
        if (strLJFF == null) {
            strLJFF = "source_default_key";
        }
        C1554960qZC.LIZLLL(interfaceC665370Q7z, C1554630qYf.class, strLJFF);
    }

    public static final void LJIIJ(LifecycleOwner lifecycleOwner, Class<Object> cls, Class<? extends InterfaceC494301wD> cls2, String str) throws IllegalAccessException {
        InterfaceC665370Q7z interfaceC665370Q7zLJ = LJ(lifecycleOwner, cls);
        if (interfaceC665370Q7zLJ != null) {
            LJIIJJI(interfaceC665370Q7zLJ, cls2, str);
        }
    }

    public static final void LJII(InterfaceC665370Q7z interfaceC665370Q7z, final InterfaceC494301wD interfaceC494301wD, final Class<? extends InterfaceC494301wD> cls, String str, LifecycleOwner lifecycleOwner) {
        InterfaceC1554640qYg interfaceC1554640qYg = new InterfaceC1554640qYg() { // from class: X.0RUl
            @Override // X.InterfaceC1554640qYg
            public final InterfaceC494301wD provideAbility(String str2) {
                if (Intrinsics.LJFF(cls.getCanonicalName(), str2)) {
                    return interfaceC494301wD;
                }
                throw new UnsupportedOperationException();
            }
        };
        LJIIIZ(new C1202620hOu(interfaceC665370Q7z, cls));
        C1554630qYf c1554630qYf = new C1554630qYf(interfaceC1554640qYg);
        String strLJFF = LJFF(cls, str);
        if (strLJFF == null) {
            strLJFF = "source_default_key";
        }
        C1554960qZC.LIZ(interfaceC665370Q7z, c1554630qYf, C1554630qYf.class, strLJFF);
        if (lifecycleOwner != null) {
            C629000Olm c629000Olm = new C629000Olm(lifecycleOwner, interfaceC665370Q7z, cls);
            if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                c629000Olm.invoke();
            } else {
                C786410Ut5.LJJZZIII((Handler) C1554600qYc.LIZ.getValue(), new ARunnableS103S0100000_3((Object) c629000Olm, 88));
            }
        }
    }

    public static final void LJI(LifecycleOwner lifecycleOwner, Class<Object> cls, InterfaceC494301wD interfaceC494301wD, Class<? extends InterfaceC494301wD> cls2, LifecycleOwner lifecycleOwner2, String str) {
        InterfaceC665370Q7z interfaceC665370Q7zLJ = LJ(lifecycleOwner, cls);
        if (interfaceC665370Q7zLJ != null) {
            LJII(interfaceC665370Q7zLJ, interfaceC494301wD, cls2, str, lifecycleOwner2);
        }
    }
}
