package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05w8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1513005w8 implements InterfaceC882100Yj2 {
    public volatile boolean LLJIJIL;
    public final C1491005sa LL = C1491005sa.LIZ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1513505wD());
    public final String LLILLL = "ChatListBirthdayInfoUpdater";
    public final String LLILZ = "birthday_info_updater";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1513405wC(this));
    public final boolean LLILZLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1513305wB());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1513705wF());
    public final C01GW LLJ = C452501pT.LIZIZ(new C1513205wA());
    public final C01GW LLJI = C452501pT.LIZIZ(new C054Q());
    public final C879040Ye6 LLJILJIL = new C879040Ye6(new AwS546S0100000_2(this, 979));

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
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        return null;
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
        return (C884710YnF) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (C881500Yi4.LJ() != null) {
            AbstractC883730Ylf.LJJIFFI(Collections.singletonList(this.LLJILJIL));
        }
        this.LLJIJIL = false;
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLIZ.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJ() {
        return (CopyOnWriteArrayList) this.LLILLJJLI.getValue();
    }

    public final boolean LJIJJLI() {
        return !this.LLJIJIL || ((InterfaceC1513805wG) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJJ();
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (C881500Yi4.LJ() != null) {
            AbstractC883730Ylf.LJJI(Collections.singletonList(this.LLJILJIL));
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJ().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJ().addAll(list);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(boolean r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C058L
            if (r0 == 0) goto L9e
            r4 = r8
            X.058L r4 = (X.C058L) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L4d
            if (r0 != r2) goto La5
            boolean r7 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r0 = r1.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6.LLJIJIL = r0
            if (r7 != 0) goto L4a
            X.0Yi4 r0 = X.AbstractC883730Ylf.LJIIIIZZ
            r0.getClass()
            X.0Ylf r2 = X.C881500Yi4.LJ()
            if (r2 == 0) goto L4a
            kotlin.jvm.internal.AwS546S0100000_2 r1 = new kotlin.jvm.internal.AwS546S0100000_2
            r0 = 1240(0x4d8, float:1.738E-42)
            r1.<init>(r2, r0)
            r0 = 0
            X.C1729806q0.LIZIZ(r1, r0)
        L4a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4d:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "trigger fetch isFromEnterChatList="
            r1.append(r0)
            r1.append(r7)
            X.C2188811AlT.LIZIZ(r1)
            X.C309160C9y.LIZ()
            boolean r0 = r6.LLJIJIL
            if (r0 == 0) goto L69
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L69:
            X.01GW r0 = r6.LLIZLLLIL
            java.lang.Object r3 = r0.getValue()
            X.05wE r3 = (X.InterfaceC1513605wE) r3
            r4.LL = r7
            r4.LLILZ = r2
            X.0I0B r0 = X.C0I0B.LJFF
            X.0I8r r0 = r0.LIZ()
            X.0mXo r0 = (X.C1400340mXo) r0
            java.lang.String r2 = r0.getCurUserId()
            if (r2 != 0) goto L85
            java.lang.String r2 = ""
        L85:
            X.05h5 r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi r0 = X.C1419705h5.LIZ()
            if (r0 == 0) goto L9b
            long r0 = r0.LIZIZ()
        L94:
            java.lang.Object r1 = r3.LJJJLIIL(r0, r2, r4)
            if (r1 != r5) goto L24
            return r5
        L9b:
            r0 = 0
            goto L94
        L9e:
            X.058L r4 = new X.058L
            r4.<init>(r6, r8)
            goto L12
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1513005w8.LJIL(boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        long jCurrentTimeMillis3;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        Object obj;
        IMUser iMUser;
        if (!collection.isEmpty() && !((PrivacySettingsFeature) this.LLJ.getValue()).LJI() && LJIJJLI()) {
            InterfaceC1513605wE interfaceC1513605wE = (InterfaceC1513605wE) this.LLIZLLLIL.getValue();
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            if (!interfaceC1513605wE.LJIILL(curUserId)) {
                InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) this.LLJI.getValue();
                IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                if (iMHostApi != null) {
                    jCurrentTimeMillis2 = iMHostApi.LIZIZ();
                } else {
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                }
                if (!interfaceC1411705fn.LIZIZ(jCurrentTimeMillis2, "")) {
                    ArrayList arrayList = new ArrayList();
                    for (C879540Yeu<?> c879540Yeu : collection) {
                        if (arrayList.size() >= 25) {
                            break;
                        }
                        if (Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
                            C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
                            if (c1490405sU != null) {
                                obj = c1490405sU.LIZIZ;
                            } else {
                                obj = null;
                            }
                            if ((obj instanceof IMUser) && (iMUser = (IMUser) obj) != null) {
                                int followStatus = iMUser.getFollowStatus();
                                boolean zIsBlocked = iMUser.isBlocked();
                                boolean zIsBlock = iMUser.isBlock();
                                List<Integer> canMessageFollowStatusList = iMUser.getCanMessageFollowStatusList();
                                int shareStatus = iMUser.getShareStatus();
                                if (followStatus == 2 && !zIsBlocked && !zIsBlock && ((canMessageFollowStatusList != null && (!canMessageFollowStatusList.isEmpty())) || shareStatus == 1)) {
                                    String uid = iMUser.getUid();
                                    if (uid != null) {
                                        arrayList.add(uid);
                                    }
                                }
                            }
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("birthdayInfo targetUidList size=");
                    sbLIZ.append(arrayList.size());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C309160C9y.LIZ();
                    ((InterfaceC1513605wE) this.LLIZLLLIL.getValue()).LJJIII(arrayList);
                    InterfaceC1411705fn interfaceC1411705fn2 = (InterfaceC1411705fn) this.LLJI.getValue();
                    IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                    if (iMHostApi2 != null) {
                        jCurrentTimeMillis3 = iMHostApi2.LIZIZ();
                    } else {
                        jCurrentTimeMillis3 = System.currentTimeMillis();
                    }
                    if (interfaceC1411705fn2.LIZIZ(jCurrentTimeMillis3, "")) {
                        this.LLJIJIL = true;
                        return;
                    }
                    IChatListEngine.LIZ.getClass();
                    if (!C884160YmM.LIZ().LJIIIZ().isEmpty()) {
                        InterfaceC1411705fn interfaceC1411705fn3 = (InterfaceC1411705fn) this.LLJI.getValue();
                        IMHostApi iMHostApi3 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                        if (iMHostApi3 != null) {
                            jCurrentTimeMillis4 = iMHostApi3.LIZIZ();
                        } else {
                            jCurrentTimeMillis4 = System.currentTimeMillis();
                        }
                        IMHostApi iMHostApi4 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                        if (iMHostApi4 != null) {
                            jCurrentTimeMillis5 = iMHostApi4.LIZIZ();
                        } else {
                            jCurrentTimeMillis5 = System.currentTimeMillis();
                        }
                        interfaceC1411705fn3.LIZLLL(jCurrentTimeMillis4, jCurrentTimeMillis5, "");
                        C1729806q0.LIZ(interfaceC879010Ye3, new C058K(this, null));
                        return;
                    }
                    return;
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("birthdayInfo filter wrapperList size=");
        sbLIZ2.append(collection.size());
        sbLIZ2.append(" isDMOff=");
        sbLIZ2.append(((PrivacySettingsFeature) this.LLJ.getValue()).LJI());
        sbLIZ2.append(" passProcessorFrequencyControl=");
        sbLIZ2.append(LJIJJLI());
        sbLIZ2.append(" meetFetchFrequencyControl=");
        InterfaceC1513605wE interfaceC1513605wE2 = (InterfaceC1513605wE) this.LLIZLLLIL.getValue();
        String curUserId2 = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId2 == null) {
            curUserId2 = "";
        }
        sbLIZ2.append(interfaceC1513605wE2.LJIILL(curUserId2));
        sbLIZ2.append(" fetchDebounceFrequencyControl.isExit=");
        InterfaceC1411705fn interfaceC1411705fn4 = (InterfaceC1411705fn) this.LLJI.getValue();
        IMHostApi iMHostApi5 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
        if (iMHostApi5 != null) {
            jCurrentTimeMillis = iMHostApi5.LIZIZ();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        sbLIZ2.append(interfaceC1411705fn4.LIZIZ(jCurrentTimeMillis, ""));
        C2188811AlT.LIZIZ(sbLIZ2);
        C309160C9y.LIZ();
    }
}
