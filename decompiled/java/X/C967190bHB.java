package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixUpdateLocalLinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967190bHB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C967130bH5 LL;
    public final /* synthetic */ List<LinkUser> LLILLJJLI;
    public final /* synthetic */ InterfaceC967450bHb LLILLL;
    public final /* synthetic */ List<LinkUser> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967190bHB(C967130bH5 c967130bH5, List<LinkUser> list, InterfaceC967450bHb interfaceC967450bHb, List<LinkUser> list2) {
        super(0);
        this.LL = c967130bH5;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC967450bHb;
        this.LLILZ = list2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (LinkMicFixUpdateLocalLinkedList.INSTANCE.isEnable()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            String str = this.LL.LIZJ;
            StringBuilder sb = new StringBuilder("setCacheList[");
            sb.append(jCurrentTimeMillis);
            sb.append("]: list=");
            List<LinkUser> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            Iterator<LinkUser> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().linkMicId;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            sb.append(arrayList);
            sb.append(", isUpdating:");
            sb.append(this.LL.LJIIIIZZ.LIZ.get());
            C20441214yg.LIZIZ(str, sb.toString());
            LIZLLL(this.LLILLJJLI);
            InterfaceC966930bGl interfaceC966930bGl = this.LL.LIZLLL;
            if (interfaceC966930bGl != null) {
                List<LinkUser> list2 = this.LLILLJJLI;
                ArrayList arrayList2 = new ArrayList();
                Iterator<LinkUser> it3 = list2.iterator();
                while (it3.hasNext()) {
                    String str3 = it3.next().linkMicId;
                    if (str3 != null) {
                        arrayList2.add(str3);
                    }
                }
                final C967130bH5 c967130bH5 = this.LL;
                final InterfaceC967450bHb interfaceC967450bHb = this.LLILLL;
                final List<LinkUser> list3 = this.LLILZ;
                final List<LinkUser> list4 = this.LLILLJJLI;
                interfaceC966930bGl.LJZI(new InterfaceC967450bHb() { // from class: X.0bHD
                    @Override // X.InterfaceC967500bHg
                    public final void LJIIL() {
                    }

                    @Override // X.InterfaceC967500bHg
                    public final void LJIILJJIL(int i, C967130bH5 c967130bH52) {
                    }

                    @Override // X.InterfaceC967500bHg
                    public final void LJIILLIIL(List<LinkUser> list5, List<LinkUser> list6) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJIIJ(List<LinkUser> list5, List<LinkUser> list6) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJJJZ(List<LinkUser> list5, List<LinkUser> list6) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJJJZI(List<LinkUser> list5) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJJLL(List<LinkUser> list5) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJJLZIJ(LinkUser linkUser) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJL() {
                        String str4 = c967130bH5.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateLocalLinkedListWithPositions finish, ");
                        sbLIZ.append(jCurrentTimeMillis);
                        C20441214yg.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ));
                        LIZ(true);
                        InterfaceC967450bHb interfaceC967450bHb2 = interfaceC967450bHb;
                        if (interfaceC967450bHb2 != null) {
                            interfaceC967450bHb2.LJJL();
                        }
                        C176600m4.LIZJ(new C967330bHP(c967130bH5, list3, list4));
                    }
                }, arrayList2);
            }
        } else {
            InterfaceC966930bGl interfaceC966930bGl2 = this.LL.LIZLLL;
            if (interfaceC966930bGl2 != null) {
                List<LinkUser> list5 = this.LLILLJJLI;
                ArrayList arrayList3 = new ArrayList();
                Iterator<LinkUser> it4 = list5.iterator();
                while (it4.hasNext()) {
                    String str4 = it4.next().linkMicId;
                    if (str4 != null) {
                        arrayList3.add(str4);
                    }
                }
                interfaceC966930bGl2.LJZI(this.LLILLL, arrayList3);
            }
            CopyOnWriteArrayList<InterfaceC967450bHb> copyOnWriteArrayList = this.LL.LJIJJLI;
            List<LinkUser> list6 = this.LLILZ;
            List<LinkUser> list7 = this.LLILLJJLI;
            Iterator<InterfaceC967450bHb> it5 = copyOnWriteArrayList.iterator();
            while (it5.hasNext()) {
                it5.next().LJJJJZ(list6, list7);
            }
        }
        return Unit.LIZ;
    }
}
