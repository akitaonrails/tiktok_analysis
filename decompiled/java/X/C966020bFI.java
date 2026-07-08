package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.BizConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreConstantKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicConfig;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicTaskCallback;
import com.bytedance.android.livesdk.livesetting.LinkRustCohostCancelStateFix;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixLinkedState;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkFixStopRtcAfterCancel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicCohostJoinChannelCallback;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966020bFI implements InterfaceC965240bE2, InterfaceC938940aXc {
    public final Room LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public volatile long LIZLLL;
    public final String LJ;
    public volatile long LJFF;
    public volatile long LJI;
    public int LJII;
    public volatile int LJIIIIZZ;
    public volatile C914780Zue LJIIIZ;
    public volatile C914780Zue LJIIJ;
    public volatile C914780Zue LJIIJJI;
    public Function0<LayoutInfo> LJIIL;
    public Function0<BizConfig> LJIILIIL;
    public String LJIILJJIL;
    public volatile int LJIILL;
    public volatile List<SeiRegion> LJIILLIIL;
    public InterfaceC965990bFF LJIIZILJ;
    public final CopyOnWriteArrayList<InterfaceC968220bIq> LJIJ;
    public boolean LJIJI;
    public final C965270bE5 LJIJJ;
    public C967790bI9 LJIJJLI;
    public C965980bFE LJIL;
    public C965350bED LJJ;
    public final C966050bFL LJJI;
    public final C967770bI7 LJJIFFI;
    public volatile C967370bHT LJJII;
    public final C964730bDD LJJIII;
    public final long LJJIIJ;
    public volatile LinkMicConfig LJJIIJZLJL;
    public volatile int LJJIIZ;
    public final ConcurrentHashSet<InterfaceC420801kM> LJJIIZI;
    public final C11NJ LJJIJ;
    public final C01GW LJJIJIIJI;

    public final Set<Long> LIZLLL() {
        List<LinkUser> listKh = Kh();
        ArrayList arrayList = new ArrayList();
        Iterator<LinkUser> it2 = listKh.iterator();
        while (it2.hasNext()) {
            Long l = it2.next().userId;
            if (l != null) {
                arrayList.add(l);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }

    public final C966920bGk LJ() {
        return (C966920bGk) this.LJJIJIIJI.getValue();
    }

    public final RtcUserInfo LJFF() {
        C967570bHn c967570bHn = new C967570bHn();
        c967570bHn.LJ = this.LIZLLL;
        c967570bHn.LIZLLL = this.LIZIZ;
        c967570bHn.LIZJ = this.LJIILJJIL;
        c967570bHn.LIZ = this.LIZ.getId();
        c967570bHn.LIZIZ = this.LJJIIJ;
        int i = this.LIZJ;
        if (i == 2 || i == 0) {
            c967570bHn.LJFF = this.LJFF;
            getClass();
        }
        long j = c967570bHn.LIZ;
        long j2 = c967570bHn.LIZIZ;
        String str = c967570bHn.LIZJ;
        if (str == null) {
            str = "";
        }
        return new RtcUserInfo(j, j2, str, c967570bHn.LIZLLL, c967570bHn.LJ, c967570bHn.LJFF, "");
    }

    public final boolean LJII() {
        if (this.LIZIZ) {
            return true;
        }
        return LJIILIIL() ? C954950axR.LIZIZ(this.LJIIIZ.LIZIZ) || C954950axR.LIZJ(this.LJIIIZ.LIZ) : LinkMicFixLinkedState.INSTANCE.isEnable() ? LinkMicState.Companion.isJoiningOrJoinedOrLinked(this.LJIIIIZZ) : LinkMicState.Companion.isJoiningOrJoinedOrLinkedOrFinish(this.LJIIIIZZ);
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZIZ) {
            return true;
        }
        if (!LJIILIIL()) {
            return LinkMicFixLinkedState.INSTANCE.isEnable() ? LinkMicState.Companion.isJoiningOrJoinedOrLinked(this.LJIIIIZZ) : LinkMicState.Companion.isJoiningOrJoinedOrLinkedOrFinish(this.LJIIIIZZ);
        }
        EnumC969200bKQ enumC969200bKQ = this.LJIIIZ.LIZ;
        return LinkCoreConstantKt.isConnecting(enumC969200bKQ) || C954950axR.LIZJ(enumC969200bKQ);
    }

    @Override // X.InterfaceC965240bE2
    public final long LJIIJJI() {
        return this.LIZ.netMode;
    }

    @Override // X.InterfaceC965240bE2
    public final boolean LJIILIIL() {
        return this.LIZJ == 0;
    }

    @InterfaceC1294060jmO
    public final void LJIILLIIL() {
        if (this.LIZJ == 2) {
            int i = this.LJIIIIZZ;
            boolean zLIZJ = LJIILIIL() ? C954950axR.LIZJ(this.LJIIIZ.LIZ) : LinkMicState.Companion.isFrameLinked(i);
            C965350bED c965350bED = this.LJJ;
            String str = this.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try reset state ");
            sbLIZ.append(i);
            C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
            if (LinkRustCohostCancelStateFix.INSTANCE.enable() && this.LJFF > 0 && zLIZJ) {
                return;
            }
            if (!(!LIZ(false).isEmpty()) && !(!LIZ(false).isEmpty())) {
                LJIJI(0);
                return;
            }
            if (LinkMicSdkFixStopRtcAfterCancel.INSTANCE.getValue()) {
                LJIJI(1);
            }
            LJIJI(2);
        }
    }

    @Override // X.InterfaceC965240bE2
    @InterfaceC1294060jmO
    public final LayoutInfo LJJIIJZLJL() {
        LayoutInfo layoutInfoInvoke;
        Function0<LayoutInfo> function0 = this.LJIIL;
        return (function0 == null || (layoutInfoInvoke = function0.invoke()) == null) ? new LayoutInfo("", null, null, 0, false, new C966650bGJ()) : layoutInfoInvoke;
    }

    @Override // X.InterfaceC965240bE2
    public final long LJJIJ() {
        long j = this.LJI;
        return (j == -1 || j == 0) ? this.LIZLLL : j;
    }

    @Override // X.InterfaceC965240bE2
    public final String LJJIJIIJI() {
        String str = this.LJIILJJIL;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC965240bE2
    public final boolean Zf() {
        BizConfig bizConfigInvoke;
        C945380ai0 c945380ai0;
        Function0<Boolean> function0;
        Function0<BizConfig> function02 = this.LJIILIIL;
        if (function02 == null || (bizConfigInvoke = function02.invoke()) == null || (c945380ai0 = bizConfigInvoke.businessConfig) == null || (function0 = c945380ai0.LIZLLL) == null) {
            return false;
        }
        return function0.invoke().booleanValue();
    }

    @Override // X.InterfaceC965240bE2
    public final Long getGroupChannelId() {
        return Long.valueOf(this.LJFF);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZLLL) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZ.getId());
    }

    @Override // X.InterfaceC965240bE2
    public final boolean LJJII() {
        return LJIILIIL() ? this.LJIILL == 2 : this.LIZJ == 2;
    }

    @Override // X.InterfaceC965240bE2
    public final boolean A0() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC965240bE2
    public final Room LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC965240bE2
    public final C914780Zue LJJIIJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC965240bE2
    public final C965270bE5 LJJIIZ() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC965240bE2
    public final boolean LJJIIZI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC965240bE2
    public final int LLJLLIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC965240bE2
    public final long getChannelId() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC965240bE2
    public final int getScene() {
        return this.LIZJ;
    }

    public static long LJIIL(String str) {
        if (str != null) {
            try {
                return CastLongProtector.parseLong(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 0L;
            }
        }
        return 0L;
    }

    public static LinkLayerMessage LJIILJJIL(C2231741CWm c2231741CWm) {
        byte[] bArr = c2231741CWm.LJ;
        if (bArr != null) {
            return (LinkLayerMessage) C966250bFf.LIZ(bArr, LinkLayerMessage.class);
        }
        return null;
    }

    public static EnumC969120bKI LJIILL(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return EnumC969120bKI.PermitTypeOneClickMicro;
            }
            if (num.intValue() == 2) {
                return EnumC969120bKI.PermitTypeOneClickCapsule;
            }
        }
        return EnumC969120bKI.PermitTypeUnknown;
    }

    public final void LIZJ(boolean z) {
        if (this.LJIILIIL == null) {
            return;
        }
        if (this.LJJIIJZLJL != null) {
            LJ().LJJIFFI(z);
            return;
        }
        C967600bHq c967600bHq = new C967600bHq(this, z);
        C969310bKb c969310bKb = C969310bKb.LIZLLL;
        C969310bKb.LIZLLL.LIZ(new RunnableC966310bFl(c967600bHq));
    }

    public final void LJIJI(int i) {
        if (LJIILIIL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("don't update linkState ");
            sbLIZ.append(i);
            sbLIZ.append(" for phase 2.");
            C20441214yg.LIZIZ("RustLinker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LJIIIIZZ != i) {
            this.LJIIIIZZ = i;
            InterfaceC965990bFF interfaceC965990bFF = this.LJIIZILJ;
            if (interfaceC965990bFF != null) {
                LIZIZ(interfaceC965990bFF, false, new C966900bGi(this, i));
            }
        }
    }

    public final void LJIJJLI(Map<String, MicPositionContentInfo> map) {
        C1CX9 c1cx9;
        C1CX9 c1cx92;
        C967370bHT c967370bHT = this.LJJII;
        if (c967370bHT != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (((MicPositionContentInfo) entry.getValue()).contentType != 3 && ((MicPositionContentInfo) entry.getValue()).contentType != 2) {
                    arrayList.add(new C968340bJ2((String) entry.getKey(), ((MicPositionContentInfo) entry.getValue()).position));
                } else {
                    long j = ((MicPositionContentInfo) entry.getValue()).position;
                    entry.getKey();
                    String str = (String) entry.getKey();
                    int i = ((MicPositionContentInfo) entry.getValue()).contentType;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                c1cx92 = C1CX9.Undefined;
                            } else {
                                c1cx92 = C1CX9.LiveStudioStreamLandscape;
                            }
                        } else {
                            c1cx92 = C1CX9.LiveStudioStreamPortrait;
                        }
                    } else {
                        c1cx92 = C1CX9.Stream;
                    }
                    arrayList2.add(new C968980bK4(j, str, c1cx92));
                }
            }
            c967370bHT.LJI.LIZLLL(arrayList);
            c967370bHT.LJII.LIZLLL(arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
            Object key = entry2.getKey();
            long j2 = ((MicPositionContentInfo) entry2.getValue()).position;
            int i2 = ((MicPositionContentInfo) entry2.getValue()).contentType;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        c1cx9 = C1CX9.Undefined;
                    } else {
                        c1cx9 = C1CX9.LiveStudioStreamLandscape;
                    }
                } else {
                    c1cx9 = C1CX9.LiveStudioStreamPortrait;
                }
            } else {
                c1cx9 = C1CX9.Stream;
            }
            linkedHashMap.put(key, new C968380bJ6(j2, c1cx9));
        }
        LJ().LJIIZILJ(linkedHashMap);
    }

    @Override // X.InterfaceC938940aXc
    public final void LJLI(InterfaceC968220bIq interfaceC968220bIq) {
        if (this.LJIJ.contains(interfaceC968220bIq)) {
            return;
        }
        C1AZW.LIZIZ(this.LJJ, this.LJ, "[registerStateChangedListener]", null, null);
        this.LJIJ.add(interfaceC968220bIq);
    }

    @Override // X.InterfaceC938940aXc
    public final void LJLLLL(InterfaceC968220bIq interfaceC968220bIq) {
        C1AZW.LIZIZ(this.LJJ, this.LJ, "[unRegisterStateChangedListener]", null, null);
        this.LJIJ.remove(interfaceC968220bIq);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C966020bFI.class, cls)) {
            return false;
        }
        C966020bFI c966020bFI = (C966020bFI) obj;
        if (this.LIZLLL == c966020bFI.LIZLLL && this.LIZJ == c966020bFI.LIZJ && this.LIZ.getId() == c966020bFI.LIZ.getId()) {
            return true;
        }
        return false;
    }

    public final void LJIIJ(C966100bFQ c966100bFQ, Function0 function0) {
        c966100bFQ.LLILZIL = new C966080bFO(function0, this, c966100bFQ);
        this.LJJIIZI.add(c966100bFQ);
        this.LJJIJ.LIZ(c966100bFQ);
    }

    public final void LJIIZILJ(C914780Zue c914780Zue, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCrossStateModel source:");
        sbLIZ.append(str);
        sbLIZ.append(", crossLinkStateModel:");
        sbLIZ.append(c914780Zue);
        sbLIZ.append(", oldCrossLinkStateModel:");
        sbLIZ.append(this.LJIIJJI);
        C20441214yg.LIZIZ("RustLinker", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIJJI = c914780Zue;
    }

    public final void LJIJ(C914780Zue c914780Zue, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateInnerLinkStateModel source:");
        sbLIZ.append(str);
        sbLIZ.append(", innerLinkStateModel:");
        sbLIZ.append(c914780Zue);
        sbLIZ.append(", oldInnerLinkStateModel:");
        sbLIZ.append(this.LJIIJ);
        C20441214yg.LIZIZ("RustLinker", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIJ = c914780Zue;
    }

    public final void LJIJJ(C914780Zue c914780Zue, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLinkStateModel source:");
        sbLIZ.append(str);
        sbLIZ.append(", linkStateModel:");
        sbLIZ.append(c914780Zue);
        sbLIZ.append(", oldLinkStateModel:");
        sbLIZ.append(this.LJIIIZ);
        C20441214yg.LIZIZ("RustLinker", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIZ = c914780Zue;
    }

    @Override // X.InterfaceC938940aXc
    public final void LLIL(int i, Object obj) {
        C965350bED c965350bED = this.LJJ;
        String str = this.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[changeState] ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(obj);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C965900bF6.LIZ(new C966130bFT(this, i, obj));
    }

    public static void LIZIZ(final InterfaceC965990bFF interfaceC965990bFF, boolean z, final Function1 function1) {
        if (!z) {
            C500260Jjc.LJJLIIIJILLIZJL(new C966720bGQ(function1, interfaceC965990bFF));
        } else {
            C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new Runnable() { // from class: X.0bFV
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("RustLinker@e1b8.callbackOnUi$2");
                    try {
                        function1.invoke(interfaceC965990bFF);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("RustLinker@e1b8.callbackOnUi$2");
                }
            });
        }
    }

    public final void LJI(C966210bFb c966210bFb, LinkMicTaskCallback linkMicTaskCallback, int i) {
        C965350bED c965350bED = this.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleAdvanceJoinRtcChannel task: ");
        sbLIZ.append(c966210bFb);
        sbLIZ.append(", linkerMode: ");
        sbLIZ.append(i);
        C1AZW.LIZIZ(c965350bED, "RustLinker", C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966040bFK c966040bFK = new C966040bFK(this, c966210bFb, i, linkMicTaskCallback);
        if (LinkMicCohostJoinChannelCallback.INSTANCE.enable() && c966210bFb.LIZ == EnumC972970bQV.PreJoinRtcChannel) {
            c966040bFK.invoke();
            return;
        }
        InterfaceC965990bFF interfaceC965990bFF = this.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            LIZIZ(interfaceC965990bFF, false, new C966330bFn(i, c966040bFK));
        } else {
            C965900bF6.LIZ(c966040bFK);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0bI7] */
    public C966020bFI(Room room, final boolean z, final int i, long j) {
        String str;
        C964730bDD c964730bDD;
        this.LIZ = room;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (i == 0) {
            str = "Union";
        } else if (i == 4) {
            str = " Multi";
        } else {
            str = "Cross";
        }
        sbLIZ.append(str);
        sbLIZ.append("Linker[Biz]");
        this.LJ = C2188811AlT.LIZIZ(sbLIZ);
        this.LJI = this.LIZLLL;
        this.LJIIIZ = C954950axR.LIZ();
        this.LJIIJ = C954950axR.LIZ();
        this.LJIIJJI = C954950axR.LIZ();
        this.LJIILLIIL = new ArrayList();
        this.LJIJ = new CopyOnWriteArrayList<>();
        this.LJIJJ = new C965270bE5();
        this.LJJI = new C966050bFL(this.LJJ);
        final C966880bGg c966880bGg = new C966880bGg(this);
        this.LJJIFFI = new C967130bH5(i, z, c966880bGg) { // from class: X.0bI7
            {
                this.LJ = z;
            }
        };
        if (i == 4) {
            c964730bDD = null;
        } else {
            c964730bDD = new C964730bDD();
        }
        this.LJJIII = c964730bDD;
        this.LJJIIJ = UserService.getInstance().user().getCurrentUserId();
        this.LJJIIZI = new ConcurrentHashSet<>();
        this.LJJIJ = new C11NJ();
        this.LJJIJIIJI = C452501pT.LIZIZ(new C966680bGM(this));
    }

    public static C967180bHA LJIIIZ(C966020bFI c966020bFI, long j, long j2, long j3, String str, int i) {
        String str2 = str;
        String str3 = "";
        if ((i & 8) != 0) {
            str2 = "";
        }
        if ((i & 32) == 0) {
            str3 = null;
        }
        c966020bFI.getClass();
        return new C967180bHA(j, j3, j2, str2, 0L, 0L, false, true, false, false, C1CXJ.Normal, 0L, 0L, 0L, 0L, C1CX5.Good, C1CXK.Normal, "", 0L, str3, C1CXI.Unknown);
    }
}
