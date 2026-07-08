package com.bytedance.android.live.liveinteract.multiguestv3.main.common;

import X.AbstractC924260a9w;
import X.C01EL;
import X.C01GW;
import X.C098200Yq;
import X.C11NZ;
import X.C1276840jKc;
import X.C1701940uOG;
import X.C189200o6;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C916490ZxP;
import X.C917750ZzR;
import X.C920350a3d;
import X.C924580aAS;
import X.C924790aAn;
import X.C924810aAp;
import X.C930540aK4;
import X.C941700ac4;
import X.EnumC918970a1P;
import X.InterfaceC923870a9J;
import X.InterfaceC923890a9L;
import X.InterfaceC924740aAi;
import X.InterfaceC941720ac6;
import X.InterfaceC948500an2;
import Y.AfS184S0100000_15;
import android.util.ArrayMap;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLayoutTypeDestroyChannelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMockFanticketUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPreviewClientLockOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPreviewPanelOptimizeConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiliveGuestLinkmicRouteApplySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiliveGuestLinkmicRouteReplySetting;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.AnchorLayoutSetting;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "MULTI_GUEST_DATA_HOLDER")
public class MultiGuestDataHolder extends AbstractC924260a9w {
    public static final /* synthetic */ int LJJLIIIJL = 0;
    public boolean LIZ;
    public String LJIIIIZZ;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public volatile MultiLiveAnchorPanelSettings LJIJI;
    public volatile AnchorLayoutSetting LJIJJ;
    public int LJJIFFI;
    public boolean LJJIII;
    public List<LinkPlayerInfo> LJJJ;
    public int LJJJI;
    public int LJJJIL;
    public EnumC918970a1P LJJJJ;
    public EnumC918970a1P LJJJJI;
    public boolean LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public volatile Avatar LJJJJLL;
    public volatile InterfaceC923890a9L LJJJJZ;
    public final ReentrantLock LJJJJZI;
    public int LJJJLIIL;
    public int LJJJLL;
    public String LJJJLZIJ;
    public long LJJJZ;
    public Long LJJL;
    public String LJJLI;
    public int LJJLIIIIJ;
    public ViewGroup.LayoutParams LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public boolean LJJLIIIJJI;
    public final C01GW LJJLIIIJJIZ;
    public final Map<Long, Boolean> LIZIZ = new LinkedHashMap();
    public boolean LIZJ = true;
    public boolean LIZLLL = true;
    public String LJ = "";
    public String LJFF = "";
    public long LJI = System.currentTimeMillis();
    public long LJII = System.currentTimeMillis();
    public boolean LJIIIZ = true;
    public volatile boolean LJIIJ = true;
    public boolean LJIIJJI = true;
    public boolean LJIIL = true;
    public final MutableLiveData<Integer> LJIJ = new MutableLiveData<>(null);
    public final Map<Integer, String> LJIJJLI = new ConcurrentHashMap();
    public final Set<Long> LJIL = new HashSet();
    public final MutableLiveData<MultiLiveAnchorPanelSettings> LJJ = new MutableLiveData<>(null);
    public final MutableLiveData<AnchorLayoutSetting> LJJI = new MutableLiveData<>(null);
    public String LJJII = "";
    public final Map<String, Boolean> LJJIIJ = new ConcurrentHashMap();
    public final Map<String, Integer> LJJIIJZLJL = new ConcurrentHashMap();
    public final Map<Long, Long> LJJIIZ = new ArrayMap();
    public final C01GW LJJIIZI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(65));
    public final Map<String, Long> LJJIJ = new ConcurrentHashMap();
    public final C01GW LJJIJIIJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(66));
    public final Map<String, Integer> LJJIJIIJIL = new ConcurrentHashMap();
    public final Map<String, Integer> LJJIJIL = new ConcurrentHashMap();
    public final Map<String, Integer> LJJIJL = new ConcurrentHashMap();
    public boolean LJJIJLIJ = true;
    public final Map<String, Integer> LJJIL = new ConcurrentHashMap();
    public final Map<String, Integer> LJJIZ = new ConcurrentHashMap();

    public final void LIZ() {
        this.LJJJLIIL = 2;
        this.LJJJLL = 2;
        this.LJJLIIIIJ = 2;
        C924790aAn.LIZLLL().LJIIL = 2;
        LJJIIZI(false);
    }

    public final MultiLiveAnchorPanelSettings LIZIZ() {
        return this.LIZLLL ? C924810aAp.LJ().LJJIII : this.LJIJI;
    }

    public final C924580aAS LJFF() {
        return (C924580aAS) this.LJJIJIIJI.getValue();
    }

    public final String LJII() {
        MultiGuestMockFanticketUrlSetting multiGuestMockFanticketUrlSetting = MultiGuestMockFanticketUrlSetting.INSTANCE;
        return multiGuestMockFanticketUrlSetting.isEnable() ? multiGuestMockFanticketUrlSetting.getMockedIconUrl() : this.LJJJLZIJ;
    }

    public final String LJIILIIL() {
        return this.LJJJJJ == -1 ? "panel_Golive" : "panel_plus";
    }

    public final String LJIILJJIL() {
        int i = this.LJJLIIIIJ;
        return i != 1 ? i != 2 ? i != 3 ? "no_permission" : "video" : "audio" : "video";
    }

    public MultiGuestDataHolder() {
        EnumC918970a1P enumC918970a1P = EnumC918970a1P.NORMAL;
        this.LJJJJ = enumC918970a1P;
        this.LJJJJI = enumC918970a1P;
        this.LJJJJJ = -1;
        this.LJJJJZI = new ReentrantLock();
        this.LJJJLL = -1;
        this.LJJLIIIIJ = -1;
        this.LJJLIIIJJIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(67));
    }

    public final int LIZJ(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LJJIZ).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final Boolean LIZLLL(String str) {
        boolean zBooleanValue;
        if (str == null) {
            return Boolean.FALSE;
        }
        Boolean bool = (Boolean) ((Map) this.LJJIIZI.getValue()).get(str);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final int LJ(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LJJIL).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long LJI(String str) {
        if (str == null) {
            return 0L;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAvatarState key=");
        sbLIZ.append(str);
        sbLIZ.append(" map=");
        sbLIZ.append(this.LJJIJ);
        C20441214yg.LIZIZ("avatarStateMap", C2188811AlT.LIZIZ(sbLIZ));
        Long l = (Long) ((ConcurrentHashMap) this.LJJIJ).get(str);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final int LJIIIIZZ(String str) {
        boolean z;
        LJJIIJZLJL(str);
        C924790aAn c924790aAnLIZLLL = C924790aAn.LIZLLL();
        int i = this.LJJJLIIL;
        c924790aAnLIZLLL.LJIIL = i;
        if (i != 2) {
            z = true;
        } else {
            z = false;
        }
        LJJIIZI(z);
        return C924790aAn.LIZLLL().LJIIL;
    }

    public final int LJIIIZ(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LJJIJIL).get(str)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int LJIIJ(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LJJIJL).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int LJIIJJI(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LJJIJIIJIL).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final InterfaceC923890a9L LJIIL(Function0<? extends InterfaceC923890a9L> function0) {
        InterfaceC923870a9J interfaceC923870a9J;
        ReentrantLock reentrantLock;
        InterfaceC923870a9J interfaceC923870a9J2;
        Object c098200Yq;
        InterfaceC923870a9J interfaceC923870a9J3;
        InterfaceC923890a9L interfaceC923890a9L = this.LJJJJZ;
        InterfaceC923890a9L interfaceC923890a9L2 = null;
        if (interfaceC923890a9L instanceof InterfaceC923870a9J) {
            interfaceC923870a9J = (InterfaceC923870a9J) interfaceC923890a9L;
        } else {
            interfaceC923870a9J = null;
        }
        if (interfaceC923870a9J != null && !interfaceC923870a9J.LJFF()) {
            return this.LJJJJZ;
        }
        if (MultiGuestPreviewClientLockOptSetting.INSTANCE.isEnable()) {
            InterfaceC923890a9L interfaceC923890a9LInvoke = function0.invoke();
            reentrantLock = this.LJJJJZI;
            reentrantLock.lock();
            try {
                InterfaceC923890a9L interfaceC923890a9L3 = this.LJJJJZ;
                if (interfaceC923890a9L3 == null || ((interfaceC923890a9L3 instanceof InterfaceC923870a9J) && (interfaceC923870a9J3 = (InterfaceC923870a9J) interfaceC923890a9L3) != null && interfaceC923870a9J3.LJFF())) {
                    LJJIIJ(interfaceC923890a9LInvoke);
                } else {
                    if (interfaceC923890a9LInvoke != null && interfaceC923890a9LInvoke != interfaceC923890a9L3) {
                        interfaceC923890a9L2 = interfaceC923890a9LInvoke;
                    }
                    interfaceC923890a9LInvoke = interfaceC923890a9L3;
                }
                reentrantLock.unlock();
                if (interfaceC923890a9L2 == null) {
                    return interfaceC923890a9LInvoke;
                }
                try {
                    interfaceC923890a9L2.release(CertProviderManagerKt.findCert("bpea-linkmic_guestpre_releaselivevideoclient", 1476788483));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
                return interfaceC923890a9LInvoke;
            } finally {
            }
        }
        reentrantLock = this.LJJJJZI;
        reentrantLock.lock();
        try {
            InterfaceC923890a9L interfaceC923890a9L4 = this.LJJJJZ;
            if (interfaceC923890a9L4 == null || ((interfaceC923890a9L4 instanceof InterfaceC923870a9J) && (interfaceC923870a9J2 = (InterfaceC923870a9J) interfaceC923890a9L4) != null && interfaceC923870a9J2.LJFF())) {
                InterfaceC923890a9L interfaceC923890a9LInvoke2 = function0.invoke();
                LJJIIJ(interfaceC923890a9LInvoke2);
                interfaceC923890a9L4 = interfaceC923890a9LInvoke2;
            }
            reentrantLock.unlock();
            return interfaceC923890a9L4;
        } finally {
        }
    }

    public final int LJIILL(String str) {
        Integer num = (Integer) ((ConcurrentHashMap) this.LJJIIJZLJL).get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final Boolean LJIILLIIL(String str) {
        if (str == null) {
            return Boolean.FALSE;
        }
        return (Boolean) ((ConcurrentHashMap) this.LJJIIJ).get(str);
    }

    public void LJIIZILJ(boolean z) {
        C20441214yg.LIZIZ("MultiGuestDataHolder", "onLinkMicDisconnect");
        this.LJIIIZ = true;
        if (z && !MultiGuestPreviewPanelOptimizeConfigSetting.INSTANCE.enableVideoAudioMemory()) {
            LJJIIZI(true);
        }
        ((ConcurrentHashMap) this.LJJIIJ).clear();
        ((Map) this.LJJIIZI.getValue()).clear();
        ((ConcurrentHashMap) this.LJJIJIIJIL).clear();
        ((ConcurrentHashMap) this.LJJIJ).clear();
        this.LJJJI = 0;
        this.LJJJJL = false;
        this.LJJJJLI = false;
        LJJIIJ(null);
        this.LJJLIIIJ = null;
        LJJI(null);
    }

    public void LJIL(String str) {
        LJIIZILJ(true);
        this.LJIIIIZZ = null;
        ((HashSet) this.LJIL).clear();
        LJJIII(0);
        LJJIFFI(EnumC918970a1P.NORMAL);
        C924810aAp.LJ().LJJIIZ = 2;
        this.LJIILIIL = 0;
        this.LJJJJL = false;
        this.LJJJJLI = false;
        LJJIIJ(null);
        this.LJJLIIIJ = null;
        this.LJJIII = false;
        this.LJJLIIIJILLIZJL = null;
        this.LJJLIIIJJI = false;
        if (!Intrinsics.LJFF(str, "destroy_channel")) {
            ((Map) this.LJJLIIIJJIZ.getValue()).clear();
        }
        this.LJJJLZIJ = null;
        LJJI(null);
        C20441214yg.LIZIZ("MultiGuestDataHolder", "clean all");
        ((ArrayMap) this.LJJIIZ).clear();
    }

    public final void LJJ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        long j;
        boolean z = !Intrinsics.LJFF(this.LJJ.getValue(), multiLiveAnchorPanelSettings);
        this.LJIJI = multiLiveAnchorPanelSettings;
        if (this.LIZLLL) {
            C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettings;
        }
        if (z) {
            this.LJJ.setValue(this.LJIJI);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dataHolder anchorPanelSettings  update revenueShare:");
        Long lValueOf = null;
        if (multiLiveAnchorPanelSettings != null) {
            numValueOf = Integer.valueOf(multiLiveAnchorPanelSettings.LIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" applierSortSetting:");
        if (multiLiveAnchorPanelSettings != null) {
            numValueOf2 = Integer.valueOf(multiLiveAnchorPanelSettings.applierSortSetting);
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(" applierSortGiftScoreThreshold:");
        if (multiLiveAnchorPanelSettings != null) {
            lValueOf = Long.valueOf(multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold);
        }
        sbLIZ.append(lValueOf);
        C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LIZJ) {
            return;
        }
        if (multiLiveAnchorPanelSettings != null) {
            i = multiLiveAnchorPanelSettings.applierSortSetting;
        } else {
            i = 0;
        }
        if (i > 0) {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ != null) {
                interfaceC924740aAiLIZ.LIZ("gift_priority_link");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                interfaceC941720ac6LIZIZ.LJIL(C01EL.START, "gift_priority_link");
            }
        } else {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ2 = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ2 != null) {
                interfaceC924740aAiLIZ2.LIZIZ("gift_priority_link");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ2 != null) {
                interfaceC941720ac6LIZIZ2.LJIL(C01EL.END, "gift_priority_link");
            }
        }
        if (multiLiveAnchorPanelSettings != null) {
            j = multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold;
        } else {
            j = 0;
        }
        if (j > 0) {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ3 = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ3 != null) {
                interfaceC924740aAiLIZ3.LIZ("gift_threshold_link");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ3 = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ3 != null) {
                interfaceC941720ac6LIZIZ3.LJIL(C01EL.START, "gift_threshold_link");
                return;
            }
            return;
        }
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ4 = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ4 != null) {
            interfaceC924740aAiLIZ4.LIZIZ("gift_threshold_link");
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ4 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ4 == null) {
            return;
        }
        interfaceC941720ac6LIZIZ4.LJIL(C01EL.END, "gift_threshold_link");
    }

    public final void LJJI(Avatar avatar) {
        if (avatar != null) {
            C924580aAS c924580aASLJFF = LJFF();
            c924580aASLJFF.LIZLLL = true;
            if (c924580aASLJFF.LJ == null) {
                c924580aASLJFF.LJ = Long.valueOf(System.currentTimeMillis());
            }
        } else {
            C924580aAS c924580aASLJFF2 = LJFF();
            c924580aASLJFF2.LIZLLL = false;
            Long l = c924580aASLJFF2.LJ;
            if (l != null) {
                c924580aASLJFF2.LJFF += System.currentTimeMillis() - l.longValue();
                c924580aASLJFF2.LJ = null;
            }
        }
        this.LJJJJLL = avatar;
    }

    public final void LJJIFFI(EnumC918970a1P enumC918970a1P) {
        LiveSdkMultiGuestLayoutTypeDestroyChannelSetting.INSTANCE.isEnable();
        this.LJJJJI = enumC918970a1P;
        C924810aAp.LJ().LJJJJI = enumC918970a1P.getStrVal();
        C11NZ.LJJJJZ(1).LJJI(2L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS184S0100000_15(this, 26));
    }

    public final void LJJII(long j) {
        int iLIZLLL = C916490ZxP.LIZLLL(j);
        this.LJJJLL = iLIZLLL;
        this.LJJJZ = j;
        if (iLIZLLL != -1 && iLIZLLL != 0) {
            this.LJJLIIIIJ = iLIZLLL;
        }
    }

    public final void LJJIII(int i) {
        this.LJJIFFI = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update linkedGuestNum:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MultiGuestDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        C924810aAp.LJ().LJIIL(i);
    }

    public final void LJJIIJ(InterfaceC923890a9L interfaceC923890a9L) {
        ReentrantLock reentrantLock = this.LJJJJZI;
        reentrantLock.lock();
        try {
            this.LJJJJZ = interfaceC923890a9L;
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJJIIJZLJL(String str) {
        if (this.LJJJLIIL != 0) {
            return;
        }
        if (Intrinsics.LJFF(str, "apply")) {
            int value = MultiliveGuestLinkmicRouteApplySetting.INSTANCE.getValue();
            if (value != 1) {
                if (value == 2) {
                    this.LJJJLIIL = 2;
                }
            } else {
                this.LJJJLIIL = 1;
            }
        } else if (Intrinsics.LJFF(str, "reply")) {
            int value2 = MultiliveGuestLinkmicRouteReplySetting.INSTANCE.getValue();
            if (value2 != 1) {
                if (value2 == 2) {
                    this.LJJJLIIL = 2;
                }
            } else {
                this.LJJJLIIL = 1;
            }
        }
        this.LJJJLIIL = 2;
    }

    public final void LJJIIZ(boolean z) {
        this.LJIILL = z;
        if (z) {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJJJLZIJ = 2;
        } else {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJJJLZIJ = 1;
        }
    }

    public final void LJJIIZI(boolean z) {
        int i;
        boolean z2 = this.LJIIJ;
        this.LJIIJ = z;
        if (z2 != z && MultiGuestPreviewPanelOptimizeConfigSetting.INSTANCE.enableVideoAudioMemory() && !C930540aK4.LIZJ()) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            this.LJJJLIIL = i;
            C924790aAn.LIZLLL().LJIIL = this.LJJJLIIL;
        }
    }

    public final void LJIJ(String str, boolean z) {
        ((Map) this.LJJIIZI.getValue()).put(str, Boolean.valueOf(z));
    }

    public final void LJIJI(int i, String str) {
        if (str == null) {
            return;
        }
        ((ConcurrentHashMap) this.LJJIZ).put(str, Integer.valueOf(i));
    }

    public final void LJIJJ(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("putAvatarState key=");
        sbLIZ.append(str);
        sbLIZ.append(" value=");
        sbLIZ.append(j);
        sbLIZ.append(" original_map=");
        sbLIZ.append(this.LJJIJ);
        C20441214yg.LIZIZ("avatarStateMap", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            return;
        }
        ((ConcurrentHashMap) this.LJJIJ).put(str, Long.valueOf(j));
    }

    public final void LJIJJLI(String str, boolean z) {
        ((ConcurrentHashMap) this.LJJIIJ).put(str, Boolean.valueOf(z));
    }
}
