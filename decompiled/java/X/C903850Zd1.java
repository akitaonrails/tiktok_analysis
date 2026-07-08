package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0Zd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903850Zd1 implements C0ZPB, InterfaceC1575850r6t {
    public final C19EG LL;
    public final LifecycleOwner LLILLJJLI;
    public final EnumC1615506Uf LLILLL;
    public final EnumC1606080rte LLILZ;
    public InterfaceC903910Zd7 LLIZ;
    public LifecycleObserver LLJ;
    public String LLILZIL = "";
    public List<C903890Zd5> LLILZLL = new ArrayList();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 48));

    public final C0ZP6 LJ() {
        return (C0ZP6) this.LLIZLLLIL.getValue();
    }

    public final List<String> LJFF() {
        List<C903890Zd5> list = this.LLILZLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C903890Zd5> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        return arrayList;
    }

    public final void LJII() {
        for (String str : LJFF()) {
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            if (lifecycleOwner != null) {
                C1605650rsx.LIZIZ.LJI(lifecycleOwner, this.LLILLL, str, null, this);
            }
        }
    }

    @Override // X.C0ZPB
    public final void release() {
        LifecycleObserver lifecycleObserver;
        Lifecycle lifecycle;
        LJII();
        C0ZP6 c0zp6LJ = LJ();
        if (c0zp6LJ != null) {
            c0zp6LJ.hS0(this.LLILZIL);
        }
        this.LLILZIL = "";
        ((ArrayList) this.LLILZLL).clear();
        this.LLIZ = null;
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        if (!((Boolean) C104600aS.LIZ.getValue()).booleanValue() || (lifecycleObserver = this.LLJ) == null) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(lifecycleObserver);
        }
        this.LLJ = null;
    }

    public static int LIZLLL(final List list) {
        Map mapLIZ = C08SO.LIZ(new C08SN<C903890Zd5, Integer>() { // from class: X.0Zd2
            @Override // X.C08SN
            public final Iterator<C903890Zd5> LIZ() {
                return list.iterator();
            }

            @Override // X.C08SN
            public final Integer LIZIZ(C903890Zd5 c903890Zd5) {
                return Integer.valueOf(c903890Zd5.LIZIZ);
            }
        });
        Integer num = (Integer) mapLIZ.get(1);
        if (num != null && num.intValue() > 0) {
            return 1;
        }
        Integer num2 = (Integer) mapLIZ.get(2);
        if (num2 != null && num2.intValue() > 0) {
            return 2;
        }
        return 0;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        String uid;
        C0Y8T c0y8tLIZ;
        List<Long> memberIds;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        User user = c888460YtI.LIZ;
        if (user != null && (uid = user.getUid()) != null && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILZIL)) != null && (memberIds = c0y8tLIZ.getMemberIds()) != null && memberIds.contains(C2095008Iq.LJIILIIL(uid)) && (lifecycleOwner = this.LLILLJJLI) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C903870Zd3(this, null), 3);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUnBlockUserEvent(C486890J7n c486890J7n) {
        String uid;
        C0Y8T c0y8tLIZ;
        List<Long> memberIds;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        User user = c486890J7n.LIZ;
        if (user != null && (uid = user.getUid()) != null && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILZIL)) != null && (memberIds = c0y8tLIZ.getMemberIds()) != null && memberIds.contains(C2095008Iq.LJIILIIL(uid)) && (lifecycleOwner = this.LLILLJJLI) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C903880Zd4(this, null), 3);
        }
    }

    @Override // X.C0ZPB
    public final void LIZIZ(String str, List<String> list) {
        if (!Intrinsics.LJFF(this.LLILZIL, str)) {
            C0ZP6 c0zp6LJ = LJ();
            if (c0zp6LJ != null) {
                c0zp6LJ.hS0(str);
                return;
            }
            return;
        }
        InterfaceC903910Zd7 interfaceC903910Zd7 = this.LLIZ;
        if (interfaceC903910Zd7 != null) {
            LIZJ(str, list, interfaceC903910Zd7, false);
        }
    }

    @Override // X.C0ZPB
    public final int LIZ(String str, List<String> list, InterfaceC903910Zd7 interfaceC903910Zd7) {
        return LIZJ(str, list, interfaceC903910Zd7, true);
    }

    public final void LJI(int i, String str, String str2) {
        C0ZP6 c0zp6LJ;
        C2135908Yj c2135908YjVl1;
        Integer numValueOf;
        C0ZP6 c0zp6LJ2 = LJ();
        if ((c0zp6LJ2 == null || (c2135908YjVl1 = c0zp6LJ2.vl1(str)) == null || (numValueOf = Integer.valueOf(c2135908YjVl1.LIZ)) == null || numValueOf.intValue() != i) && (c0zp6LJ = LJ()) != null) {
            c0zp6LJ.Je1(i, str, false);
        }
        InterfaceC903910Zd7 interfaceC903910Zd7 = this.LLIZ;
        if (interfaceC903910Zd7 != null) {
            interfaceC903910Zd7.LJIIIZ(i, this.LLILZIL, str2);
        }
    }

    public C903850Zd1(C19EG c19eg, LifecycleOwner lifecycleOwner, EnumC1615506Uf enumC1615506Uf, EnumC1606080rte enumC1606080rte) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = enumC1615506Uf;
        this.LLILZ = enumC1606080rte;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public final int LIZJ(String str, List<String> list, InterfaceC903910Zd7 interfaceC903910Zd7, boolean z) {
        Lifecycle.State currentState;
        boolean z2;
        LifecycleOwner lifecycleOwner;
        C0ZP6 c0zp6LJ;
        boolean zLJFF;
        C2135908Yj c2135908YjVl1;
        String uid;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            currentState = lifecycle.getCurrentState();
        } else {
            currentState = null;
        }
        if (currentState == Lifecycle.State.DESTROYED) {
            release();
            return -1;
        }
        boolean zLJIIIZ = C0ZFW.LIZ.LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str));
        ?? arrayList = C13BV.INSTANCE;
        if (zLJIIIZ) {
            User userLIZ = C10EU.LIZ();
            if (userLIZ == null || (uid = userLIZ.getUid()) == null) {
                uid = "";
            }
            arrayList = new ArrayList();
            for (String str2 : list) {
                String str3 = str2;
                if (!Intrinsics.LJFF(str3, uid)) {
                    C01GW c01gw = C1605690rt1.LIZ;
                    if (C1605690rt1.LIZJ(EnumC1615506Uf.STORY, str3) > 0) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        if (!(!Intrinsics.LJFF(this.LLILZIL, str))) {
            List<String> listLJFF = LJFF();
            if (arrayList.size() != ((ArrayList) listLJFF).size()) {
                zLJFF = false;
            } else {
                zLJFF = Intrinsics.LJFF(C13LP.LJLLJ(arrayList), C13LP.LJLLJ(listLJFF));
            }
            z2 = !zLJFF;
            if (!z2) {
                C0ZP6 c0zp6LJ2 = LJ();
                if (c0zp6LJ2 == null || (c2135908YjVl1 = c0zp6LJ2.vl1(str)) == null) {
                    return -1;
                }
                return c2135908YjVl1.LIZ;
            }
        } else {
            z2 = false;
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZ.name());
            sbLIZ.append("-bindUser");
            LJI(0, str, C2188811AlT.LIZIZ(sbLIZ));
            release();
            return -1;
        }
        if (z2 && z && (c0zp6LJ = LJ()) != null) {
            c0zp6LJ.Ni0(str);
        }
        LJII();
        this.LLIZ = interfaceC903910Zd7;
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str4 : arrayList) {
            C01GW c01gw2 = C1605690rt1.LIZ;
            arrayList2.add(new C903890Zd5(str4, C1605690rt1.LIZJ(EnumC1615506Uf.STORY, str4)));
            LifecycleOwner lifecycleOwner3 = this.LLILLJJLI;
            if (lifecycleOwner3 != null) {
                C1605650rsx.LIZIZ.LJI(lifecycleOwner3, this.LLILLL, null, str4, this);
            }
        }
        int iLIZLLL = LIZLLL(arrayList2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLILZ.name());
        sbLIZ2.append("-bindUser");
        LJI(iLIZLLL, str, C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILZLL = arrayList2;
        this.LLILZIL = str;
        C0ZP6 c0zp6LJ3 = LJ();
        if (c0zp6LJ3 != null) {
            c0zp6LJ3.fh1(str, this);
        }
        if (((Boolean) C104600aS.LIZ.getValue()).booleanValue() && (lifecycleOwner = this.LLILLJJLI) != null) {
            LifecycleObserver lifecycleObserver = this.LLJ;
            if (lifecycleObserver != null) {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleObserver);
            }
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.avatar.group.GroupChatSocialStatusListenerImpl$observeLifecycleOwner$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner4, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this.LL.release();
                    }
                }
            };
            this.LLILLJJLI.getLifecycle().addObserver(lifecycleEventObserver);
            this.LLJ = lifecycleEventObserver;
        }
        return iLIZLLL;
    }

    @Override // X.InterfaceC1575850r6t
    public final void Wn(String str, int i, Integer num, EnumC1576350r7h enumC1576350r7h) {
        Object next;
        if (str == null) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C903890Zd5) next).LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C903890Zd5 c903890Zd5 = (C903890Zd5) next;
        if (c903890Zd5 == null) {
            return;
        }
        C903890Zd5 c903890Zd52 = new C903890Zd5(c903890Zd5.LIZ, i);
        ((ArrayList) this.LLILZLL).remove(c903890Zd5);
        ((ArrayList) this.LLILZLL).add(c903890Zd52);
        LJI(LIZLLL(this.LLILZLL), this.LLILZIL, "onUserStatusChanged");
    }
}
