package X;

import Y.AComparatorS49S0000000_30;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPI;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193081AsM implements InterfaceC1259690isx {
    public static WeakReference<C2193081AsM> LJIIIZ;
    public static C2193061AsK LJIIJ;
    public static C2193061AsK LJIIJJI;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC2193001AsE LIZJ;
    public final C2193091AsN LIZLLL;
    public boolean LJ;
    public final C2252321DDq LJFF;
    public final C2193071AsL LJI;
    public final C1D1B LJII;
    public static final C2193011AsF LJIIIIZZ = new C2193011AsF();
    public static final Map<String, Set<String>> LJIIL = new LinkedHashMap();
    public static List<? extends Aweme> LJIILIIL = new ArrayList();

    @Override // X.InterfaceC1259690isx
    public final void LIZJ(String str) {
    }

    @Override // X.InterfaceC1259690isx
    public final void destroy() {
        C1548820qPI.LJIIIIZZ("searchCSIRefreshBannerDataEvent", this.LIZLLL);
        C19720112Dn.LIZ.getClass();
        ((LinkedHashMap) C19720112Dn.LIZIZ).clear();
    }

    @Override // X.InterfaceC1259690isx
    public final InterfaceC346201Wa<C19720512Dr> LIZ() {
        return this.LJII;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0foN, X.1AsN] */
    public C2193081AsM(AwemeListFragmentImpl awemeListFragmentImpl) {
        C19721012Dw c19721012Dw = new C19721012Dw();
        this.LIZIZ = awemeListFragmentImpl;
        this.LIZJ = c19721012Dw;
        ?? r1 = new InterfaceC1141530foN() { // from class: X.1AsN
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                String string;
                EnumC2193121AsQ enumC2193121AsQ;
                C2193061AsK c2193061AsK;
                C19720512Dr c19720512Dr;
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd != null && (string = interfaceC1107590evd.getString("action")) != null) {
                    for (EnumC2193101AsO enumC2193101AsO : EnumC2193101AsO.values()) {
                        if (Intrinsics.LJFF(enumC2193101AsO.LL, string)) {
                            int iOrdinal = enumC2193101AsO.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    enumC2193121AsQ = EnumC2193121AsQ.FLAG;
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                enumC2193121AsQ = EnumC2193121AsQ.DISLIKE;
                            }
                            if (enumC2193121AsQ != null && (c2193061AsK = (C2193061AsK) this.LL.LJFF.getValue()) != null && (c19720512Dr = c2193061AsK.LIZ) != null) {
                                this.LL.LJI(c19720512Dr, enumC2193121AsQ, null);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        };
        this.LIZLLL = r1;
        LJIIIZ = new WeakReference<>(this);
        C1548820qPI.LIZLLL("searchCSIRefreshBannerDataEvent", r1);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LJFF = c2252321DDqLIZ;
        this.LJI = new C2193071AsL();
        this.LJII = new C1D1B(new C861640Xr8(new C01U9(null), c2252321DDqLIZ), 0);
    }

    @Override // X.InterfaceC1259690isx
    public final void LIZIZ(List<? extends Aweme> list) {
        List<? extends Aweme> listLJLLLL;
        Long lValueOf;
        Aweme aweme;
        if (list == null || (listLJLLLL = C13LP.LJLLLL(new AComparatorS49S0000000_30(8), list)) == null) {
            listLJLLLL = C13BV.INSTANCE;
        }
        LJIILIIL = listLJLLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preProcessUserRecentPosted: ");
        Aweme aweme2 = (Aweme) C13LP.LJJJLL(LJIILIIL);
        if (aweme2 != null) {
            lValueOf = Long.valueOf(aweme2.getCreateTime());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LJ && (aweme = (Aweme) C13LP.LJJJLL(LJIILIIL)) != null) {
            if ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - aweme.getCreateTime() < ((Number) C18113077n.LIZ.getValue()).intValue() * 24 * 60 * 60) {
                this.LJ = true;
                LJII(EnumC2193151AsT.INIT);
            }
        }
    }

    @Override // X.InterfaceC1259690isx
    public final void LJII(EnumC2193151AsT enumC2193151AsT) {
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!((Boolean) C07BL.LIZ.getValue()).booleanValue()) {
            if (!this.LJ) {
                return;
            }
            C2193071AsL c2193071AsL = this.LJI;
            int iLIZJ = c2193071AsL.LJFF.LIZJ();
            long j = c2193071AsL.LJFF.LIZ.getLong(C1260490iuF.LJ("photo_mode_banner_show_timestamp"), -1L);
            Keva keva = c2193071AsL.LIZ;
            boolean z = C2193071AsL.LJI;
            Pair pair = new Pair(Integer.valueOf(iLIZJ + keva.getInt(C1952307kn.LIZ("close_times"), 0)), Long.valueOf(Math.max(j, c2193071AsL.LIZ.getLong(C1952307kn.LIZ("last_close_timestamp"), -1L))));
            if (!c2193071AsL.LJ && !((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAccuratePrivateAccount() && !((AccountUserService) C0XQ7.LJFF()).LIZ() && !Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) {
                if (!((Boolean) C07BM.LIZ.getValue()).booleanValue()) {
                    pair = new Pair(Integer.valueOf(c2193071AsL.LIZ.getInt(C1952307kn.LIZ("close_times"), 0)), Long.valueOf(c2193071AsL.LIZ.getLong(C1952307kn.LIZ("last_close_timestamp"), System.currentTimeMillis())));
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                long jLongValue = ((Number) pair.getSecond()).longValue();
                if (iIntValue <= C07BN.LIZ() && (num = (Integer) C13LP.LJJJLZIJ(iIntValue, (List) C00JA.LIZIZ.getValue())) != null) {
                    if (Math.max(0L, System.currentTimeMillis() - jLongValue) / ((long) 86400000) >= num.intValue()) {
                        C948503nH.LJ(this.LIZIZ, C23271099x.INSTANCE, new C2193051AsJ(this, enumC2193151AsT, jCurrentTimeMillis, null));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.LJFF.setValue(null);
    }

    public final Object LIZLLL(C2159008d2 c2159008d2, InterfaceC1364105Vn<? super C2193041AsI> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2192991AsD(c2159008d2, this, null));
    }

    @Override // X.InterfaceC1259690isx
    public final void LJI(C19720512Dr c19720512Dr, EnumC2193121AsQ enumC2193121AsQ, String str) {
        String str2;
        if (enumC2193121AsQ == EnumC2193121AsQ.SHOW) {
            for (C12E4 c12e4 : C12E5.LIZ) {
                if (Intrinsics.LJFF(c19720512Dr.LJIIZILJ, c12e4.LJFF()) && (str2 = c19720512Dr.LJ) != null) {
                    Map<String, Set<String>> map = LJIIL;
                    String strLJFF = c12e4.LJFF();
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    Object linkedHashSet = linkedHashMap.get(strLJFF);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(strLJFF, linkedHashSet);
                    }
                    Set set = (Set) linkedHashSet;
                    if (!set.contains(str2)) {
                        set.add(str2);
                        c12e4.LIZJ();
                    }
                }
            }
        } else {
            for (C12E4 c12e42 : C12E5.LIZ) {
                if (Intrinsics.LJFF(c19720512Dr.LJIIZILJ, c12e42.LJFF())) {
                    c12e42.LIZJ();
                }
            }
        }
        SearchCSIProfilerBannerAPI searchCSIProfilerBannerAPI = SearchCSIProfilerBannerAPI.LIZIZ;
        String str3 = c19720512Dr.LJ;
        String str4 = c19720512Dr.LJIIZILJ;
        Integer num = c19720512Dr.LJIIJ;
        String str5 = c19720512Dr.LJIILL;
        searchCSIProfilerBannerAPI.getClass();
        SearchCSIProfilerBannerAPI.LIZ(str3, enumC2193121AsQ, str, str4, num, str5, "v2", "banner");
        switch (C2193111AsP.LIZ[enumC2193121AsQ.ordinal()]) {
            case 1:
                C2193061AsK c2193061AsK = (C2193061AsK) this.LJFF.getValue();
                if (c2193061AsK != null && Intrinsics.LJFF(c2193061AsK.LIZ.LJ, c19720512Dr.LJ)) {
                    ConcurrentHashSet<Integer> concurrentHashSet = C2193061AsK.LJFF;
                    int iHashCode = c19720512Dr.hashCode();
                    ConcurrentHashSet<Integer> concurrentHashSet2 = C2193061AsK.LJFF;
                    if (concurrentHashSet2.contains(Integer.valueOf(iHashCode))) {
                        return;
                    }
                    c2193061AsK.LIZIZ = true;
                    concurrentHashSet2.add(Integer.valueOf(c2193061AsK.LIZ.hashCode()));
                    C19720112Dn c19720112Dn = C19720112Dn.LIZ;
                    EnumC19720912Dv enumC19720912Dv = EnumC19720912Dv.SHOW;
                    c19720112Dn.getClass();
                    C19720112Dn.LIZJ(c19720512Dr, enumC19720912Dv, null);
                    return;
                }
                return;
            case 2:
                C2193061AsK c2193061AsK2 = (C2193061AsK) this.LJFF.getValue();
                if (c2193061AsK2 != null && Intrinsics.LJFF(c2193061AsK2.LIZ.LJ, c19720512Dr.LJ)) {
                    LJIIJ = c2193061AsK2;
                    C2193071AsL c2193071AsL = this.LJI;
                    if (C2193071AsL.LJI) {
                        c2193071AsL.LJFF.LJFF(0);
                        c2193071AsL.LJFF.LIZ.storeLong(C1260490iuF.LJ("photo_mode_banner_show_timestamp"), -1L);
                    } else {
                        c2193071AsL.LIZ.storeInt(C1952307kn.LIZ("close_times"), 0);
                    }
                    C19720112Dn c19720112Dn2 = C19720112Dn.LIZ;
                    EnumC19720912Dv enumC19720912Dv2 = EnumC19720912Dv.CLICK;
                    c19720112Dn2.getClass();
                    C19720112Dn.LIZJ(c19720512Dr, enumC19720912Dv2, null);
                    return;
                }
                return;
            case 3:
                long jCurrentTimeMillis = System.currentTimeMillis();
                C2193061AsK c2193061AsK3 = (C2193061AsK) this.LJFF.getValue();
                if (c2193061AsK3 != null && Intrinsics.LJFF(c2193061AsK3.LIZ.LJ, c19720512Dr.LJ)) {
                    c2193061AsK3.LIZLLL = true;
                    C2193061AsK.LJII.add(Integer.valueOf(c2193061AsK3.LIZ.hashCode()));
                    C19720112Dn c19720112Dn3 = C19720112Dn.LIZ;
                    EnumC19720912Dv enumC19720912Dv3 = EnumC19720912Dv.CLOSE;
                    c19720112Dn3.getClass();
                    C19720112Dn.LIZJ(c19720512Dr, enumC19720912Dv3, null);
                    this.LJFF.setValue(null);
                    C2193071AsL c2193071AsL2 = this.LJI;
                    if (C2193071AsL.LJI) {
                        C1260490iuF.LJII(c2193071AsL2.LJFF);
                        C1260490iuF c1260490iuF = c2193071AsL2.LJFF;
                        c1260490iuF.LJFF(c1260490iuF.LIZJ() + 1);
                    } else {
                        c2193071AsL2.LIZ.storeLong(C1952307kn.LIZ("last_close_timestamp"), System.currentTimeMillis());
                        c2193071AsL2.LIZ.storeInt(C1952307kn.LIZ("close_times"), c2193071AsL2.LIZ.getInt(C1952307kn.LIZ("close_times"), 0) + 1);
                    }
                    if (this.LJI.LIZ.getInt(C1952307kn.LIZ("close_times"), 0) >= C07BN.LIZ()) {
                        new C1619430sFB().LJIILJJIL();
                    }
                    this.LIZJ.LIZIZ("close", "v2", System.currentTimeMillis() - jCurrentTimeMillis, c19720512Dr);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
            case 6:
                C948503nH.LJ(this.LIZIZ, C23271099x.INSTANCE, new C2193031AsH(this, c19720512Dr, null));
                return;
            default:
                throw new C1954807lC();
        }
    }
}
