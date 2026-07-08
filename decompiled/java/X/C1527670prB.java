package X;

import android.content.Context;
import android.util.Log;
import com.bytedance.sync.v4.presistence.AppDatabaseV4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS151S0400000_23;
import kotlin.jvm.internal.AwS172S1100000_23;
import kotlin.jvm.internal.AwS267S0300000_23;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS71S0100100_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0prB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527670prB implements InterfaceC1525900poK {
    public final Context LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1527710prF(this));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1527800prO(this));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1527770prL(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1527790prN(this));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1527780prM(this));
    public final C01GW LLIZ = C452501pT.LIZIZ(new C2110108Ol(this));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C2110208Om(this));

    @Override // X.InterfaceC1525900poK
    public final void LIZLLL() {
        LJI(new AwS567S0100000_23(this, 132));
    }

    @Override // X.InterfaceC1525900poK
    public final void LJ() {
        LJI(new AwS567S0100000_23(this, 131));
    }

    @Override // X.InterfaceC1525900poK
    public final void LJJLJ() {
        LJI(new AwS567S0100000_23(this, 130));
    }

    public final InterfaceC1527700prE LJJZ() {
        return (InterfaceC1527700prE) this.LLILZ.getValue();
    }

    public final AppDatabaseV4 LJLIL() {
        return (AppDatabaseV4) this.LLILLJJLI.getValue();
    }

    public final InterfaceC1527640pr8 LJLILLLLZI() {
        return (InterfaceC1527640pr8) this.LLILZIL.getValue();
    }

    public final InterfaceC1527720prG LJLJI() {
        return (InterfaceC1527720prG) this.LLILLL.getValue();
    }

    public C1527670prB(Context context) {
        this.LL = context;
    }

    public final <T> T LJI(Function0<? extends T> function0) {
        try {
            ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config().getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[DBServiceImplV4] ");
            sbLIZ.append("mConfiguration enableMultiProcess: ");
            boolean z = false;
            sbLIZ.append(false);
            sbLIZ.append(", mProcessLock lock ok : ");
            if (((C2099808Km) this.LLIZLLLIL.getValue()).LIZIZ != null) {
                z = true;
            }
            sbLIZ.append(z);
            C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            T tInvoke = function0.invoke();
            try {
                ((C2099808Km) this.LLIZLLLIL.getValue()).LIZ();
                return tInvoke;
            } catch (Throwable th) {
                return tInvoke;
            }
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[DBServiceImplV4] ");
                sbLIZ2.append("databaseOpHandle error: ");
                sbLIZ2.append(th2);
                C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    ((C2099808Km) this.LLIZLLLIL.getValue()).LIZ();
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } catch (Throwable th32) {
                try {
                    ((C2099808Km) this.LLIZLLLIL.getValue()).LIZ();
                    throw th32;
                } finally {
                    TryCatchGuardChecker.doCheck(th32);
                }
            }
        }
    }

    @Override // X.InterfaceC1525900poK
    public final void LJIIJJI(C0WYY c0wyy) {
        LJI(new AwS424S0200000_23(this, c0wyy, 13));
    }

    @Override // X.InterfaceC1525900poK
    public final void LJIILIIL(long j) {
        LJI(new C1527680prC(this, j));
    }

    @Override // X.InterfaceC1525900poK
    public final List<C801490VcJ> LJIILJJIL(List<String> list) {
        List<C801490VcJ> list2 = (List) LJI(new AwS424S0200000_23(this, (C1527670prB) list, (List<? extends C0WYV>) 17));
        if (list2 == null) {
            return new ArrayList();
        }
        return list2;
    }

    @Override // X.InterfaceC1525900poK
    public final boolean LJIJI(List<? extends C0WYW> list) {
        Boolean bool = (Boolean) LJI(new AwS424S0200000_23(this, (C1527670prB) list, (List<? extends C0WYV>) 15));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.InterfaceC1525900poK
    public final boolean LJJI(String str) {
        Boolean bool = (Boolean) LJI(new AwS172S1100000_23(this, str, 10));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.InterfaceC1525900poK
    public final List<C801490VcJ> LJJII(C1526010poV c1526010poV) {
        List<C801490VcJ> list = (List) LJI(new C1526210pop(this, c1526010poV));
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC1525900poK
    public final C801490VcJ LJJIII(long j) {
        return (C801490VcJ) LJI(new AwS71S0100100_23(this, j, 0));
    }

    @Override // X.InterfaceC1525900poK
    public final void LJJIJIL(ArrayList<C0WYV> arrayList) {
        LJI(new AwS424S0200000_23(this, (C1527670prB) arrayList, (ArrayList<C0WYV>) 16));
    }

    @Override // X.InterfaceC1525900poK
    public final List LJJJ(String str) {
        Object objLJI = LJI(new C1527760prK(this, str));
        if (objLJI != null) {
            return C19719512Dh.LIZIZ(objLJI);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.bytedance.sync.v4.presistence.table.UploadItemV4>");
    }

    @Override // X.InterfaceC1525900poK
    public final List LJJJI(int i) {
        List list = (List) LJI(new C1527750prJ(this, i));
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC1525900poK
    public final void LJJL(List list) {
        LJI(new AwS424S0200000_23(this, (C1527670prB) list, (List<? extends C0WYV>) 19));
    }

    @Override // X.InterfaceC1525900poK
    public final void LJJLIIIJ(C801520VcM c801520VcM) {
        LJI(new AwS424S0200000_23(this, c801520VcM, 18));
    }

    @Override // X.InterfaceC1525900poK
    public final void LJJLJLI(List<? extends C0WYV> list) {
        LJI(new AwS424S0200000_23(this, (C1527670prB) list, (List<? extends C0WYV>) 14));
    }

    @Override // X.InterfaceC1525900poK
    public final void LIZJ(long j, long j2) {
        LJI(new C1527820prQ(this, j, j2));
    }

    @Override // X.InterfaceC1525900poK
    public final C0WYY LJIIIZ(long j, String str) {
        C0WYY c0wyy = (C0WYY) LJI(new C1527810prP(this, str, j));
        if (c0wyy == null) {
            return new C0WYY();
        }
        return c0wyy;
    }

    @Override // X.InterfaceC1525900poK
    public final void LJJIFFI(ArrayList<C0WYW> arrayList, C801490VcJ c801490VcJ) {
        LJI(new AwS267S0300000_23(this, (C1527670prB) arrayList, (ArrayList<C0WYW>) c801490VcJ, (C801490VcJ) 1));
    }

    @Override // X.InterfaceC1525900poK
    public final List LJJIJ(EnumC1527250pqV enumC1527250pqV, String str) {
        List list = (List) LJI(new C1527730prH(this, enumC1527250pqV, str));
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC1525900poK
    public final boolean LJJIL(C0WYY c0wyy, List<? extends C0WYW> list) {
        Boolean bool = (Boolean) LJI(new AwS267S0300000_23(this, (C1527670prB) c0wyy, (C0WYY) list, (List<? extends C0WYW>) 2));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.InterfaceC1525900poK
    public final List LJJJJI(int i, long j, long j2) {
        List list = (List) LJI(new C1527630pr7(this, j, i, j2));
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC1525900poK
    public final List LJJJJLL(EnumC1527250pqV enumC1527250pqV, String str, String str2) {
        List list = (List) LJI(new C1527740prI(this, enumC1527250pqV, str, str2));
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC1525900poK
    public final boolean LJJJJZI(List<? extends C801520VcM> list, C801490VcJ c801490VcJ, List<? extends C801520VcM> list2) {
        Boolean bool = (Boolean) LJI(new AwS151S0400000_23(this, c801490VcJ, list, list2, 1));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.InterfaceC1525900poK
    public final void LJJZZIII(List<C801490VcJ> list, List<String> list2, List<? extends C801550VcP> list3) {
        LJI(new AwS151S0400000_23(this, (C1527670prB) list3, (List<? extends C801550VcP>) list, (List<C801490VcJ>) list2, (List<String>) 0));
    }

    @Override // X.InterfaceC1525900poK
    public final List LJJJZ(Set set, EnumC1527270pqX enumC1527270pqX, int i, long j) {
        List list = (List) LJI(new C1527660prA(this, set, enumC1527270pqX, i, j));
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC1525900poK
    public final List<C0WYV> LJLIIIL(EnumC1525890poJ enumC1525890poJ, long j, String str, int i) {
        boolean z;
        try {
            List list = (List) LJI(new C1526200poo(enumC1525890poJ, this, j, str));
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (i2 >= i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1527890prX.LIZIZ(Intrinsics.LJIIJJI(Log.getStackTraceString(th), "[DBServiceImplV4] "));
            C1526300poy.LIZLLL(Intrinsics.LJIIJJI(Log.getStackTraceString(th), "deleteLimitHistorySyncLog failed, error: "), th);
            return C13BV.INSTANCE;
        }
    }
}
