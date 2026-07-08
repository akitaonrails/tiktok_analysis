package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967170bH9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C967140bH6 LL;
    public final /* synthetic */ List<LinkUser> LLILLJJLI;
    public final /* synthetic */ InterfaceC967450bHb LLILLL;
    public final /* synthetic */ List<LinkUser> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967170bH9(C967140bH6 c967140bH6, List<LinkUser> list, InterfaceC967450bHb interfaceC967450bHb, List<LinkUser> list2) {
        super(0);
        this.LL = c967140bH6;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC967450bHb;
        this.LLILZ = list2;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0bHJ, java.lang.Runnable] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C967140bH6 c967140bH6 = this.LL;
        final List<LinkUser> list = this.LLILLJJLI;
        c967140bH6.getClass();
        if (!C954920axO.LIZ(c967140bH6.LJI, list)) {
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
            sbLIZ.append("_UserManager_");
            sbLIZ.append(75);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mLinkedList updated need post change listener. value = ");
            sbLIZ2.append(list);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1azw.getClass();
            C1AZW.LIZ(strLIZIZ, strLIZIZ2, null, null);
            List<LinkUser> list2 = c967140bH6.LJI;
            c967140bH6.LJI = list;
            for (LinkUser linkUser : list) {
                Iterator<LinkUser> it2 = c967140bH6.LJII.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    LinkUser next = it2.next();
                    if (Intrinsics.LJFF(next.userId, linkUser.userId)) {
                        if (next != null) {
                            c967140bH6.LJII.remove(next);
                            C500260Jjc.LJJLIIIJILLIZJL(new C967440bHa(c967140bH6, linkUser));
                        }
                    }
                }
                Iterator<LinkUser> it3 = c967140bH6.LJIIIIZZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        LinkUser next2 = it3.next();
                        if (Intrinsics.LJFF(next2.userId, linkUser.userId)) {
                            if (next2 != null) {
                                c967140bH6.LJIIIIZZ.remove(next2);
                            }
                        }
                    }
                }
            }
            Iterator<InterfaceC967450bHb> it4 = c967140bH6.LJIILL.iterator();
            while (it4.hasNext()) {
                it4.next().LJIILLIIL(list2, list);
            }
            if (SettingsManager.INSTANCE.getIntValue("linkcore_user_manager_list_leak_fix", 0) > 0) {
                RunnableC967270bHJ runnableC967270bHJ = c967140bH6.LJIILLIIL;
                if (runnableC967270bHJ != null) {
                    C473410IhP.LJ(runnableC967270bHJ);
                }
                ?? r0 = new Runnable() { // from class: X.0bHJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("UserManager@3b07.mLinkedList$runnable$1");
                        try {
                            Iterator<InterfaceC967450bHb> it5 = c967140bH6.LJIILL.iterator();
                            while (it5.hasNext()) {
                                it5.next().LJIIL();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("UserManager@3b07.mLinkedList$runnable$1");
                    }
                };
                c967140bH6.LJIILLIIL = r0;
                C473410IhP.LIZIZ(r0);
            } else {
                C473410IhP.LIZIZ(new Runnable() { // from class: X.0bHG
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("UserManager@3b07.mLinkedList$5");
                        try {
                            Iterator<InterfaceC967450bHb> it5 = c967140bH6.LJIILL.iterator();
                            while (it5.hasNext()) {
                                it5.next().LJIIL();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("UserManager@3b07.mLinkedList$5");
                    }
                });
            }
        }
        InterfaceC967450bHb interfaceC967450bHb = this.LLILLL;
        if (interfaceC967450bHb != null) {
            interfaceC967450bHb.LJJL();
        }
        CopyOnWriteArrayList<InterfaceC967450bHb> copyOnWriteArrayList = this.LL.LJIILL;
        List<LinkUser> list3 = this.LLILZ;
        List<LinkUser> list4 = this.LLILLJJLI;
        Iterator<InterfaceC967450bHb> it5 = copyOnWriteArrayList.iterator();
        while (it5.hasNext()) {
            it5.next().LJJJJZ(list3, list4);
        }
        return Unit.LIZ;
    }
}
