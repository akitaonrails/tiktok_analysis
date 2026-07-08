package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicSyncUpdateLocalLinkedList;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.GroupChannelUser;

/* JADX INFO: renamed from: X.0bH6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967140bH6 implements InterfaceC958070b2T {
    public final C11NJ LIZ = new C11NJ();
    public volatile Map<Long, ? extends List<GroupChannelUser>> LIZIZ = C2097608Jq.LJ();
    public final ConcurrentHashMap<Long, Long> LIZJ = new ConcurrentHashMap<>();
    public volatile List<LinkUser> LIZLLL = new ArrayList();
    public final Map<String, Long> LJ = new ConcurrentHashMap();
    public volatile List<LinkUser> LJFF = new ArrayList();
    public volatile List<LinkUser> LJI = new ArrayList();
    public final CopyOnWriteArrayList<LinkUser> LJII = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<LinkUser> LJIIIIZZ;
    public volatile C13BV LJIIIZ;
    public volatile C13BV LJIIJ;
    public volatile C13BV LJIIJJI;
    public volatile List<LinkUser> LJIIL;
    public volatile List<LinkUser> LJIILIIL;
    public final String LJIILJJIL;
    public final CopyOnWriteArrayList<InterfaceC967450bHb> LJIILL;
    public RunnableC967270bHJ LJIILLIIL;

    @Override // X.InterfaceC958070b2T
    public final void LJJJIL() {
    }

    @Override // X.InterfaceC958070b2T
    public final void LJJJJIZL() {
    }

    @Override // X.InterfaceC958070b2T
    public final Long LJJJJLI() {
        return null;
    }

    static {
        new Object() { // from class: X.0bIz
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r6.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r8 = this;
            java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r0 = r8.LJIIL
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r0 = r8.LJIILIIL
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r1.iterator()
        L17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r4 = r5.next()
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r4 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r4
            java.util.Iterator r3 = r7.iterator()
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.String r1 = r0.linkMicId
            java.lang.String r0 = r4.linkMicId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L27
            if (r2 == 0) goto L44
            r6.add(r2)
            goto L17
        L44:
            r6.add(r4)
            goto L17
        L48:
            java.util.concurrent.CopyOnWriteArrayList<X.0bHb> r0 = r8.LJIILL
            java.util.Iterator r1 = r0.iterator()
        L4e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.next()
            X.0bHb r0 = (X.InterfaceC967450bHb) r0
            r0.LJJJLL(r6)
            goto L4e
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C967140bH6.LIZ():void");
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJIIIZ() {
        Long l;
        LinkUser next;
        List<LinkUser> list = this.LJIILIIL;
        if (list == null || list.isEmpty()) {
            return this.LJIIL;
        }
        ArrayList arrayList = new ArrayList();
        for (LinkUser linkUser : new ArrayList(this.LJIIL)) {
            Iterator<LinkUser> it2 = this.LJIILIIL.iterator();
            while (true) {
                l = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.linkMicId, linkUser.linkMicId)) {
                    break;
                }
            }
            LinkUser linkUser2 = next;
            if (linkUser2 != null) {
                l = linkUser2.userId;
            }
            Long l2 = l;
            arrayList.add(new LinkUser(linkUser.roomId, l2, linkUser.channelId, linkUser.linkMicId, linkUser.position, linkUser.extra, false, true, false, false, linkUser.appVersion, linkUser.channelOwnerJoinTime, linkUser.channelOwnerLinkedTime, linkUser.ownerUid, linkUser.ownerRoomId, linkUser.ownerChannelId, null, 0L, null, linkUser.linkUserType, 0, null, null));
        }
        return arrayList;
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJJJJLL() {
        C13BV c13bv = this.LJIIIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c13bv) {
            Long l = ((LinkUser) obj).userId;
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            if (l == null || l.longValue() != currentUserId) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJJJJZI() {
        return new ArrayList();
    }

    public C967140bH6() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LJIIIIZZ = new CopyOnWriteArrayList<>();
        this.LJIIIZ = c13bv;
        this.LJIIJ = c13bv;
        this.LJIIJJI = c13bv;
        this.LJIIL = c13bv;
        this.LJIILIIL = c13bv;
        this.LJIILJJIL = "";
        this.LJIILL = new CopyOnWriteArrayList<>();
    }

    @Override // X.InterfaceC920370a3f
    public final int LJJIL() {
        return LIZLLL().size();
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> Kh() {
        return this.LJFF;
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LIZLLL() {
        return this.LJI;
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJJJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC920370a3f
    public final C13BV LJJJI() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC958070b2T
    public final String LJJJJI() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC958070b2T
    public final List<LinkUser> LJJJJJL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJJJJL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC920370a3f
    public final C13BV LJJJLL() {
        return this.LJIIJ;
    }

    public final void LIZIZ(List<LinkUser> list) {
        if (C954920axO.LIZ(this.LJIIL, list)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveUsersListFromSei updated value = ");
        sbLIZ.append(list);
        C969080bKE.LIZIZ("UserManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIL = list;
        C473410IhP.LIZIZ(new Runnable() { // from class: X.0bHH
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UserManager@3b07.liveUsersListFromSei$1");
                try {
                    C967140bH6 c967140bH6 = this.LL;
                    Iterator<InterfaceC967450bHb> it2 = c967140bH6.LJIILL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJJJJZI(c967140bH6.LJIIL);
                    }
                    this.LL.LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UserManager@3b07.liveUsersListFromSei$1");
            }
        });
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJIIJ(String str) {
        LinkUser next;
        Iterator<LinkUser> it2 = LJIIIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.linkMicId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    @Override // X.InterfaceC958070b2T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.InterfaceC940430aa1 r10) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C967140bH6.LJIL(X.0aa1):void");
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJJIFFI(String str) {
        Object next;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZLLL);
        arrayList.addAll(this.LJFF);
        arrayList.addAll(this.LJI);
        arrayList.addAll(this.LJIIIZ);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LinkUser) next).linkMicId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (LinkUser) next;
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJJIJL(long j) {
        Object next;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZLLL);
        arrayList.addAll(this.LJFF);
        arrayList.addAll(this.LJI);
        arrayList.addAll(this.LJIIIZ);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Long l = ((LinkUser) next).userId;
                if (l != null && l.longValue() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (LinkUser) next;
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJJIZ(String str) {
        LinkUser next;
        Iterator<LinkUser> it2 = LJIIIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.linkMicId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJJJJ(long j) {
        LinkUser next;
        Iterator<LinkUser> it2 = LJIIIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Long l = next.userId;
                if (l != null && l.longValue() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @Override // X.InterfaceC958070b2T
    public final void LJJJJZ(List<LinkUser> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLocalLinkedListForAudience linkedList:");
        sbLIZ.append(list);
        C969080bKE.LIZIZ("UserManager", C2188811AlT.LIZIZ(sbLIZ));
        if (!C954920axO.LIZ(this.LJIILIIL, list)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("liveUsersListFromGroupIM updated value = ");
            sbLIZ2.append(list);
            C969080bKE.LIZIZ("UserManager", C2188811AlT.LIZIZ(sbLIZ2));
            this.LJIILIIL = list;
            C473410IhP.LIZIZ(new Runnable() { // from class: X.0bHV
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UserManager@3b07.liveUsersListFromGroupIM$1");
                    try {
                        this.LL.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UserManager@3b07.liveUsersListFromGroupIM$1");
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0090, code lost:
    
        continue;
     */
    @Override // X.InterfaceC958070b2T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJJJLIIL(long r10) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C967140bH6.LJJJLIIL(long):long");
    }

    @Override // X.InterfaceC958070b2T
    public final void LJJJJJ(List list, InterfaceC967450bHb interfaceC967450bHb) {
        ArrayList arrayList = new ArrayList(this.LJI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
        sbLIZ.append("_UserManager_");
        sbLIZ.append(1241);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateLocalLinkedList old linkedList:");
        sbLIZ2.append(arrayList);
        sbLIZ2.append(", new linkedList:");
        sbLIZ2.append(list);
        C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        C500260Jjc.LJJLIIIJILLIZJL(new C967360bHS(this, arrayList, list));
        final C967170bH9 c967170bH9 = new C967170bH9(this, list, interfaceC967450bHb, arrayList);
        if (!LinkMicSyncUpdateLocalLinkedList.isEnable()) {
            C19487311Lz.LIZ(new C11IW(C11NZ.LJLJJLL(0, TimeUnit.SECONDS).LJL(C1701940uOG.LIZIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0bHz
                @Override // X.InterfaceC781210Ukh
                public final /* synthetic */ void run() {
                    c967170bH9.invoke();
                }
            }).LJJIJIIJI(new C09JN() { // from class: X.0bDe
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("UserManager@3b07.updateLocalLinkedList$2");
                    try {
                        new RunnableC964990bDd("UserManager", (Throwable) obj).run();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1CC2.LIZ("LinkMicSdkLogger Error", th);
                    }
                    C1C7U.LIZIZ("UserManager@3b07.updateLocalLinkedList$2");
                }
            })).LJIILL(), this.LIZ, null, null, 30);
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new C968250bIt(c967170bH9));
        }
    }
}
