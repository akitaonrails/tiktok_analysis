package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.experiment.ChatListRevampConfig;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881600YiE implements InterfaceC882100Yj2 {
    public final C1517705wt LL = new C1517705wt(C13LQ.LJLIIL(new InterfaceC1517505wr[]{C1517305wp.LIZ, C1517405wq.LIZ}));
    public final String LLILLJJLI = "ChatListReadStatusUpdater";
    public final String LLILLL = "read_status_updater";
    public final C01GW LLILZ = C452501pT.LIZIZ(new C881510Yi5(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C881660YiK());
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C881640YiI());
    public final boolean LLIZ = true;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C881650YiJ());
    public final C01GW LLJ = C452501pT.LIZIZ(new C881670YiL());

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU LJIILL(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, AbstractC1491605sg abstractC1491605sg, C1490405sU c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILLIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, Collection<? extends InterfaceC1491305sd> collection2, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIZILJ(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return (C884710YnF) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLIZLLLIL.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJLI() {
        return (CopyOnWriteArrayList) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJLI().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
        C0YJN.LIZ = ((long) C871090YFf.LIZ().readReceiptPollingTimeInterval) * 1000;
        C0YJN.LIZJ = C871090YFf.LIZ().batchRequestFirstPageSize;
        C0YJN.LIZIZ = C871090YFf.LIZ().batRequestCommonPageSize;
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJIJJ(C879540Yeu c879540Yeu) {
        C0Y8T c0y8t;
        long createdAt;
        T t = c879540Yeu.LIZJ;
        if (t instanceof C0Y8T) {
            c0y8t = (C0Y8T) t;
        } else {
            c0y8t = null;
        }
        if (c0y8t == null) {
            return false;
        }
        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
        if (lastShowMessage != null) {
            createdAt = lastShowMessage.getCreatedAt();
        } else {
            createdAt = 0;
        }
        if (!c0y8t.isSingleChat() && (!c0y8t.isGroupChat() || !C881730YiR.LIZ || createdAt + ((ActivityStatusConfig) C1E8F.LIZIZ.getValue()).groupSentMessagePreviewThreshold <= System.currentTimeMillis() || !C1727806pg.LIZ.LIZ("group_chat_operation_enable_read_status", c0y8t.getConversationId(), C461720I8s.LIZIZ(), false))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
        InterfaceC881630YiH interfaceC881630YiH = (InterfaceC881630YiH) this.LLILZLL.getValue();
        if (interfaceC881630YiH != null) {
            interfaceC881630YiH.LJ(new C878990Ye1(this, interfaceC879010Ye3), interfaceC879010Ye3.toString());
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        InterfaceC881630YiH interfaceC881630YiH = (InterfaceC881630YiH) this.LLILZLL.getValue();
        if (interfaceC881630YiH != null) {
            interfaceC881630YiH.LJI(interfaceC879010Ye3.toString());
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJLI().addAll(list);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    @Override // X.InterfaceC882100Yj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1490405sU<?> LJIIIIZZ(X.InterfaceC879010Ye3 r11, X.C879540Yeu<?> r12, X.AbstractC1491605sg<?> r13, X.C1490405sU<?> r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C881600YiE.LJIIIIZZ(X.0Ye3, X.0Yeu, X.05sg, X.05sU):X.05sU");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        AnonymousClass0617 anonymousClass0617;
        String conversationId;
        C0Y8T c0y8t;
        Object obj;
        C881720YiQ c881720YiQ;
        C869590Y9l lastShowMessage;
        EnumC881770YiV enumC881770YiV;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            if (LJIJJ((C879540Yeu) obj2)) {
                arrayList.add(obj2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (true) {
            C869590Y9l lastShowMessage2 = null;
            if (!it2.hasNext()) {
                break;
            }
            C879540Yeu c879540Yeu = (C879540Yeu) it2.next();
            InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
            if ((interfaceC1491305sd instanceof AnonymousClass0617) && (anonymousClass0617 = (AnonymousClass0617) interfaceC1491305sd) != null && (conversationId = anonymousClass0617.getConversationId()) != null) {
                T t = c879540Yeu.LIZJ;
                if (t instanceof C0Y8T) {
                    c0y8t = (C0Y8T) t;
                } else {
                    c0y8t = null;
                }
                C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C881680YiM.LIZ);
                if (c1490405sU != null) {
                    obj = c1490405sU.LIZIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof C881720YiQ) {
                    c881720YiQ = (C881720YiQ) obj;
                } else {
                    c881720YiQ = null;
                }
                if (c0y8t != null && (lastShowMessage = c0y8t.getLastShowMessage()) != null && !lastShowMessage.isRecalled() && lastShowMessage.getMsgType() != 1 && lastShowMessage.getMsgType() != 1031 && C0ZDX.LJJJJIZL(lastShowMessage)) {
                    if (c881720YiQ != null) {
                        enumC881770YiV = c881720YiQ.LIZ;
                    } else {
                        enumC881770YiV = null;
                    }
                    if (enumC881770YiV != EnumC881770YiV.ALL_SEEN) {
                        IIMMsgUtilService iIMMsgUtilService = (IIMMsgUtilService) PluggableExtentionKt.pluggableSpiForReal(IIMMsgUtilService.class);
                        if (iIMMsgUtilService != null) {
                            if (c0y8t != null) {
                                lastShowMessage2 = c0y8t.getLastShowMessage();
                            }
                            if (!Intrinsics.LJFF(iIMMsgUtilService.LJIIIIZZ(lastShowMessage2), Boolean.TRUE)) {
                            }
                        }
                        linkedHashSet.add(conversationId);
                    }
                }
            }
        }
        if (((ChatListRevampConfig) C309150C9x.LIZIZ.getValue()).enableReadStatusFromDataSourceCheck && !z) {
            linkedHashSet.removeAll((Set) this.LLJ.getValue());
        }
        if (!linkedHashSet.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncChatListReadStatus size=");
            sbLIZ.append(linkedHashSet.size());
            sbLIZ.append(", page=");
            sbLIZ.append(interfaceC879010Ye3);
            C2188811AlT.LIZIZ(sbLIZ);
            C309160C9y.LIZ();
            InterfaceC881630YiH interfaceC881630YiH = (InterfaceC881630YiH) this.LLILZLL.getValue();
            if (interfaceC881630YiH != null) {
                interfaceC881630YiH.LIZJ(null, false, C13LP.LLIIII(linkedHashSet));
            }
        }
        ((Set) this.LLJ.getValue()).addAll(linkedHashSet);
    }
}
