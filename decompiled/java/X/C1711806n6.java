package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06n6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1711806n6 implements InterfaceC882100Yj2 {
    public final String LL = "ChatListChatLabelUpdater";
    public final String LLILLJJLI = "chat_label_updater";
    public final C1517705wt LLILLL = new C1517705wt(C13LQ.LJLIIL(new InterfaceC1517505wr[]{C1517305wp.LIZ, C1517405wq.LIZ}));
    public final C884710YnF LLILZ = new C884710YnF("ChatListChatLabelUpdater", false, false, true, false, true, false, Collections.singleton(C13LE.LIZ(C1711806n6.class)), Collections.singleton(C13LE.LIZ(C881430Yhx.class)), 86);
    public final boolean LLILZIL = true;
    public final List<AbstractC1491605sg<?>> LLILZLL = Collections.singletonList(C1712306nB.LIZ);
    public final CopyOnWriteArrayList<InterfaceC1482905rH> LLIZ = new CopyOnWriteArrayList<>();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(969));

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
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
    public final void init() {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        C2296808zG.LIZJ((InterfaceC497601wk) this.LLIZLLLIL.getValue(), null);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        this.LLIZ.clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return this.LLILZLL;
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJLI() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJLI().addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C885380YoK LJIJJ(X.C0Y8T r12, X.InterfaceC879010Ye3 r13) {
        /*
            X.06g9 r0 = com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService r4 = X.C1668706g9.LIZIZ
            r11 = 0
            if (r4 == 0) goto L9b
            X.06gH r2 = r4.LIZIZ()
        Le:
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r3 = r0.LJ()
            java.lang.String r0 = r12.getConversationId()
            long r0 = X.C0YNP.LJII(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = r3.LJIJI(r0)
            X.0YoK r5 = new X.0YoK
            java.lang.Class<com.ss.android.ugc.aweme.im.saas.host.api.im.inbox.IIMInboxService> r6 = com.ss.android.ugc.aweme.im.saas.host.api.im.inbox.IIMInboxService.class
            r7 = 0
            r10 = 14
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.im.saas.host.api.im.inbox.IIMInboxService r0 = (com.ss.android.ugc.aweme.im.saas.host.api.im.inbox.IIMInboxService) r0
            if (r0 == 0) goto L42
            X.05RV r6 = r0.LIZJ()
            if (r6 != 0) goto L44
        L42:
            X.05RV r6 = X.C05RV.PERSONAL_INBOX
        L44:
            boolean r0 = r13 instanceof X.C878950Ydx
            if (r0 == 0) goto L56
            X.0Ydx r13 = (X.C878950Ydx) r13
            if (r13 == 0) goto L56
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r0 = r13.LLILLL
            if (r0 == 0) goto L56
            java.lang.String r7 = r0.getSerializedName()
            if (r7 != 0) goto L58
        L56:
            java.lang.String r7 = ""
        L58:
            java.util.Set r8 = r12.getConversationTags()
            if (r8 != 0) goto L60
            X.08CX r8 = X.C08CX.INSTANCE
        L60:
            X.0Y8Y r0 = r12.getCoreInfo()
            if (r0 == 0) goto L6c
            java.util.Map r9 = r0.getExt()
            if (r9 != 0) goto L70
        L6c:
            java.util.Map r9 = X.C2097608Jq.LJ()
        L70:
            if (r2 == 0) goto L78
            java.util.Map r10 = r2.LIZLLL(r1)
            if (r10 != 0) goto L7c
        L78:
            java.util.Map r10 = X.C2097608Jq.LJ()
        L7c:
            if (r4 == 0) goto L93
            X.06nD r1 = r4.LJFF()
            if (r1 == 0) goto L93
            X.0613 r0 = X.InterfaceC1712506nD.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = X.AnonymousClass0613.LIZ()
            java.util.Map r11 = r1.LJIIJ(r0)
            if (r11 != 0) goto L97
        L93:
            java.util.Map r11 = X.C2097608Jq.LJ()
        L97:
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L9b:
            r2 = r11
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1711806n6.LJIJJ(X.0Y8T, X.0Ye3):X.0YoK");
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
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object, java.util.List] */
    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        C0Y8T c0y8t;
        InterfaceC1712206nA interfaceC1712206nALJIILL;
        ?? LIZIZ;
        C1712306nB c1712306nB = C1712306nB.LIZ;
        if (!Intrinsics.LJFF(abstractC1491605sg, c1712306nB) || !Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
            return null;
        }
        T t = c879540Yeu.LIZJ;
        if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
            return null;
        }
        C885380YoK c885380YoKLJIJJ = LJIJJ(c0y8t, interfaceC879010Ye3);
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService == null || (interfaceC1712206nALJIILL = iIMBusinessChatService.LJIILL()) == null || (LIZIZ = interfaceC1712206nALJIILL.LIZIZ(c885380YoKLJIJJ, false)) == 0) {
            return null;
        }
        if (c1490405sU == null) {
            return new C1490405sU<>(c1712306nB, LIZIZ);
        }
        c1490405sU.LIZIZ = LIZIZ;
        return c1490405sU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        C0Y8T c0y8t;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            C879540Yeu c879540Yeu = (C879540Yeu) it2.next();
            if (Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE) && c879540Yeu.LIZLLL.get(C1712306nB.LIZ) == null) {
                T t = c879540Yeu.LIZJ;
                if ((t instanceof C0Y8T) && (c0y8t = (C0Y8T) t) != null) {
                    arrayList.add(new Pair(c879540Yeu.LIZIZ, LJIJJ(c0y8t, interfaceC879010Ye3)));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLIZLLLIL.getValue(), null, null, new C1711906n7(this, interfaceC879010Ye3, arrayList, null), 3);
    }
}
