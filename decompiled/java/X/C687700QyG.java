package X;

import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0QyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687700QyG {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJI(Fragment fragment) {
        InterfaceC737790Swr interfaceC737790Swr;
        if ((fragment instanceof InterfaceC737790Swr) && (interfaceC737790Swr = (InterfaceC737790Swr) fragment) != null) {
            interfaceC737790Swr.pQ(C1558360qeg.LJFF(fragment, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJII(C19EG c19eg) {
        InterfaceC737790Swr interfaceC737790Swr;
        if ((c19eg instanceof InterfaceC737790Swr) && (interfaceC737790Swr = (InterfaceC737790Swr) c19eg) != null) {
            interfaceC737790Swr.pQ(C1558360qeg.LJI(c19eg, null));
        }
    }

    public static final void LJIIIIZZ(InterfaceC713360RyY interfaceC713360RyY) {
        InterfaceC737790Swr interfaceC737790Swr;
        if ((interfaceC713360RyY instanceof InterfaceC737790Swr) && (interfaceC737790Swr = (InterfaceC737790Swr) interfaceC713360RyY) != null) {
            interfaceC737790Swr.pQ(C1558420qem.LIZIZ(interfaceC713360RyY));
        }
    }

    public static final InterfaceC665370Q7z LJIIIZ(Object obj) throws IllegalAccessException {
        Context context;
        C19EG c19egLJ;
        if ((obj instanceof Context) && (context = (Context) obj) != null && (c19egLJ = C737910Sx3.LJ(context)) != null) {
            return C1558360qeg.LJI(c19egLJ, null);
        }
        if (obj instanceof Fragment) {
            return C1558360qeg.LJFF((Fragment) obj, null);
        }
        if (obj instanceof AbstractC738140SxQ) {
            return ((AbstractC738140SxQ) obj).getVAssemScope();
        }
        if (obj instanceof InterfaceC713360RyY) {
            return C1558420qem.LIZIZ((InterfaceC713360RyY) obj);
        }
        if (obj instanceof View) {
            return C1558360qeg.LJ((View) obj, null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Communication not support for this type. Is it one of FragmentActivity/Fragment/Assem/VScopeble? ");
        sbLIZ.append(obj);
        throw new IllegalAccessException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZ(Object obj, Class<Object>[] clsArr) {
        if (!C725080ScM.LIZ) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = LJIIIZ(obj);
        for (Class<Object> cls : clsArr) {
            if (LIZJ(interfaceC665370Q7zLJIIIZ, cls) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(obj);
                sbLIZ.append(" is not under the require scope of ");
                sbLIZ.append(cls.getName());
                sbLIZ.append(", please check your node hierarchy.\nIf your scope is optional, you can add the scope to the option scope:\n@ParentScope(optionScope = [OptionScope::class])");
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA != null) {
                            int i = C2187451AjH.LIZ;
                            interfaceC723720SaA.log("communication", strLIZIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                C786410Ut5.LJJZZIII((Handler) C1554600qYc.LIZ.getValue(), new ARunnableS110S0100000_10(new IllegalArgumentException(strLIZIZ) { // from class: X.0QyH
                }, 201));
            }
        }
    }

    public static final C0QSJ LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z, Class<Object>[] clsArr) {
        String strLJJLIIIJ;
        C0QSJ c0qsj;
        List<Class<Object>> scopes;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = interfaceC665370Q7z;
        Object[] objArrCopyOf = Arrays.copyOf(clsArr, clsArr.length);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ2 = interfaceC665370Q7zLJIIIIZZ;
        while (true) {
            GScope gScope = GScope.LL;
            if (!Intrinsics.LJFF(interfaceC665370Q7zLJIIIIZZ2, gScope)) {
                Object host = interfaceC665370Q7zLJIIIIZZ2.getHost();
                if (host == null && !Intrinsics.LJFF(interfaceC665370Q7zLJIIIIZZ2, gScope)) {
                    return new C0QSJ() { // from class: X.06Vg
                        @Override // X.C0QSJ
                        public final void bindAbility(Object obj, Class<?> cls) {
                        }

                        @Override // X.C0QSJ
                        public final Object getAbility(Class<?> cls) {
                            return null;
                        }

                        @Override // X.C0QSJ
                        public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
                        }

                        @Override // X.C0QSJ
                        public final void unbindAbility(Object obj, Class<?> cls) {
                        }

                        @Override // X.C0QSJ
                        public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
                        }

                        @Override // X.C0QSJ
                        public final List<Class<Object>> getScopes() {
                            return C13BV.INSTANCE;
                        }
                    };
                }
                if (host instanceof C0QSJ) {
                    C0QSJ c0qsj2 = (C0QSJ) host;
                    Iterator<Class<Object>> it2 = c0qsj2.getScopes().iterator();
                    while (it2.hasNext()) {
                        if (C13LQ.LJJIJIIJI(it2.next(), objArrCopyOf) >= 0) {
                            return c0qsj2;
                        }
                    }
                }
                if ((host instanceof InterfaceC687720QyI) && ((InterfaceC687720QyI) host).Pk()) {
                    interfaceC665370Q7zLJIIIIZZ2 = GScope.LL;
                } else {
                    interfaceC665370Q7zLJIIIIZZ2 = interfaceC665370Q7zLJIIIIZZ2.getTree().LJIIIIZZ();
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can not find ScopeDefine object for ");
                sbLIZ.append(interfaceC665370Q7zLJIIIIZZ);
                sbLIZ.append(", its host is ");
                sbLIZ.append(interfaceC665370Q7zLJIIIIZZ.getHost());
                sbLIZ.append(", and target scope is ");
                sbLIZ.append(C13LP.LJJLIIIJ(C13LQ.LJJLL(objArrCopyOf), null, e3.e, e3.f, 0, null, AFwS231S0000000_3.get$arr$(270), 25));
                sbLIZ.append(", scope tree is: ");
                ArrayList arrayList = new ArrayList();
                while (!Intrinsics.LJFF(interfaceC665370Q7zLJIIIIZZ, GScope.LL)) {
                    Object host2 = interfaceC665370Q7zLJIIIIZZ.getHost();
                    boolean z = host2 instanceof C0QSJ;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    if (!z || (c0qsj = (C0QSJ) host2) == null || (scopes = c0qsj.getScopes()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(scopes, null, e3.e, e3.f, 0, null, AFwS231S0000000_3.get$arr$(270), 25)) == null) {
                        strLJJLIIIJ = "";
                    }
                    arrayList.add(new C443120HZe(host2, boolValueOf, strLJJLIIIJ));
                    interfaceC665370Q7zLJIIIIZZ = interfaceC665370Q7zLJIIIIZZ.getTree().LJIIIIZZ();
                }
                sbLIZ.append(C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AnonymousClass0207.get$arr$(163), 31));
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static final C0QSJ LIZJ(InterfaceC665370Q7z interfaceC665370Q7z, Class<Object>... clsArr) {
        while (!Intrinsics.LJFF(interfaceC665370Q7z, GScope.LL)) {
            Object host = interfaceC665370Q7z.getHost();
            if (host instanceof C0QSJ) {
                C0QSJ c0qsj = (C0QSJ) host;
                Iterator<Class<Object>> it2 = c0qsj.getScopes().iterator();
                while (it2.hasNext()) {
                    if (C13LQ.LJJIJIIJI(it2.next(), clsArr) >= 0) {
                        return c0qsj;
                    }
                }
            }
            if ((host instanceof InterfaceC687720QyI) && ((InterfaceC687720QyI) host).Pk()) {
                interfaceC665370Q7z = GScope.LL;
            } else {
                interfaceC665370Q7z = interfaceC665370Q7z.getTree().LJIIIIZZ();
            }
        }
        return null;
    }

    public static final C0QSJ LIZLLL(InterfaceC665370Q7z interfaceC665370Q7z, Class<Object>[] clsArr) {
        return LIZJ(interfaceC665370Q7z, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public static final void LJ(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The ability of ");
        sbLIZ.append(cls);
        sbLIZ.append(" is null but require not null. Maybe the provider is not provide yet or the provider have been recycled. Please check it.");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        throw new IllegalArgumentException(strLIZIZ) { // from class: X.06od
        };
    }

    public static final void LJFF(C0QSJ c0qsj, List<? extends InterfaceC687730QyJ> list, Object obj, Class<?> cls) {
        if (list == null || ((ArrayList) list).isEmpty() || !C19719512Dh.LJI(list)) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC687730QyJ) it2.next()).LIZ(obj, cls)) {
                it2.remove();
            }
        }
    }
}
