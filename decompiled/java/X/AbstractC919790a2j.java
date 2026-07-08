package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.api.ZoomedPositionsUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.model.message.EnlargePositionStatusSynContent;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC919790a2j {
    public static final C919810a2l LJIIJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIL;
    public static final int LJIILIIL;
    public static final long LJIILJJIL;
    public static final String LJIILL;
    public static final String LJIILLIIL;
    public static final String LJIIZILJ;
    public static final int LJIJ;
    public static final String LJIJI;
    public final DataChannel LIZ;
    public Layout LIZIZ;
    public String LIZJ;
    public Layout LIZLLL;
    public String LJ;
    public Integer LJFF;
    public int LJII;
    public final Map<String, Boolean> LJI = new LinkedHashMap();
    public final List<PosIdentity> LJIIIIZZ = new CopyOnWriteArrayList();
    public final C304201Fw LJIIIZ = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C919800a2k());

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0a2l] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC919790a2j.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LJIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LJIIJJI = new Object() { // from class: X.0a2l
        };
        LJIILIIL = -1;
        LJIILJJIL = -1L;
        LJIILL = "";
        LJIILLIIL = "zoomed_linkmic_id";
        LJIIZILJ = "zoomed_position";
        LJIJ = 1;
        LJIJI = "ZoomModel";
    }

    public abstract void LJIILJJIL();

    public abstract void LJIILL(int i);

    public abstract void LJIJ();

    public abstract void LJJI(EnlargePositionStatusSynContent enlargePositionStatusSynContent);

    public abstract void LJJII(int i, InterfaceC937900aVw interfaceC937900aVw);

    public abstract AbstractC19486711Lt LJJIIJZLJL(int i, boolean z);

    public abstract void LJJIJ(String str, int i, InterfaceC937900aVw interfaceC937900aVw, Boolean bool);

    public static Room LJIJI() {
        return (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
    }

    public final void LIZJ() {
        if (this.LJ != null) {
            LJIJJ(null);
        }
        if (this.LJFF != null) {
            LJIJJLI(null);
        }
        this.LIZIZ = null;
        this.LIZLLL = null;
    }

    public final Layout LJII() {
        if (this.LIZIZ == null) {
            this.LIZIZ = LIZLLL();
        }
        return this.LIZIZ;
    }

    public final List<PosIdentity> LJIIIIZZ() {
        String str;
        String strLLJIJIL;
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zLIZJ = C930540aK4.LIZJ();
        c918060Zzw.getClass();
        if (C918060Zzw.LIZ(zLIZJ)) {
            return this.LJIIIIZZ;
        }
        Integer num = this.LJFF;
        str = "";
        if (num == null) {
            if (!C500260Jjc.LJJIIZ(this.LJ)) {
                return new ArrayList();
            }
            PosIdentity[] posIdentityArr = new PosIdentity[1];
            PosIdentity posIdentity = new PosIdentity();
            posIdentity.type = 1;
            String str2 = this.LJ;
            posIdentity.value = str2 != null ? str2 : "";
            posIdentityArr[0] = posIdentity;
            return C1697810uHb.LJIILJJIL(posIdentityArr);
        }
        int iIntValue = num.intValue();
        PosIdentity[] posIdentityArr2 = new PosIdentity[1];
        PosIdentity posIdentity2 = new PosIdentity();
        posIdentity2.type = 2;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (strLLJIJIL = interfaceC954180awCLLJLL.LLJIJIL(iIntValue)) != null) {
            str = strLLJIJIL;
        }
        posIdentity2.value = str;
        posIdentityArr2[0] = posIdentity2;
        return C1697810uHb.LJIILJJIL(posIdentityArr2);
    }

    public static String LJIILIIL() {
        String strLIZLLL = C01HE.LIZLLL(UserService.getInstance().user().getCurrentUserId());
        return strLIZLLL == null ? "" : strLIZLLL;
    }

    public final Layout LIZLLL() {
        String businessType;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        EnumC918990a1R enumC918990a1RLIZ;
        Layout layoutLJFF;
        InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
        if (interfaceC937900aVwLIZ != null && (layoutLJFF = interfaceC937900aVwLIZ.LJFF()) != null) {
            return layoutLJFF;
        }
        InterfaceC937900aVw interfaceC937900aVwLIZ2 = C920280a3W.LIZ();
        if (interfaceC937900aVwLIZ2 == null) {
            return null;
        }
        C304201Fw c304201Fw = this.LJIIIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIIL;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c304201Fw.LIZ();
        if (multiGuestDataHolder == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) == null || (enumC918990a1RLIZ = C923170a8B.LIZ(multiLiveAnchorPanelSettingsLIZIZ)) == null || (businessType = enumC918990a1RLIZ.getBusinessType()) == null) {
            businessType = "";
        }
        return interfaceC937900aVwLIZ2.LJJLIIIJJIZ(businessType);
    }

    public void LJ() {
        LJIJ();
        ((LinkedHashMap) this.LJI).clear();
        ((C11NJ) this.LJIIJ.getValue()).LJ();
    }

    public boolean LJIIIZ() {
        return C500260Jjc.LJJIIZ(LJJIJIL()) || LJJIJL() != null;
    }

    public String LJJIJIL() {
        return this.LJ;
    }

    public Integer LJJIJL() {
        return this.LJFF;
    }

    public AbstractC919790a2j(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final boolean LJIIJ(String str) {
        return Intrinsics.LJFF(((LinkedHashMap) this.LJI).get(str), Boolean.TRUE);
    }

    public final void LJIJJ(String str) {
        this.LJ = str;
        String str2 = LJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sZoomedLinkMicId update ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ != null) {
                interfaceC924740aAiLIZ.LIZIZ("enlarge_grid");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                interfaceC941720ac6LIZIZ.LJIL(C01EL.END, "enlarge_grid");
                return;
            }
            return;
        }
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ2 = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ2 != null) {
            interfaceC924740aAiLIZ2.LIZ("enlarge_grid");
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ2 != null) {
            interfaceC941720ac6LIZIZ2.LJIL(C01EL.START, "enlarge_grid");
        }
        LJIJJLI(null);
    }

    public final void LJIJJLI(Integer num) {
        this.LJFF = num;
        String str = LJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sZoomedPosition update ");
        sbLIZ.append(num);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (num != null) {
            LJIJJ(null);
        }
    }

    public final void LJIL(InterfaceC919760a2g interfaceC919760a2g) {
        Long lValueOf;
        String string;
        HashMap map = new HashMap();
        Room roomLJIJI = LJIJI();
        if (roomLJIJI != null) {
            lValueOf = Long.valueOf(roomLJIJI.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        map.put(Scene.SCENE_SERVICE, "6");
        map.put("channel_id", C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ()));
        Room roomLJIJI2 = LJIJI();
        if (roomLJIJI2 == null || (string = Long.valueOf(roomLJIJI2.getOwnerUserId()).toString()) == null) {
            string = "";
        }
        map.put("anchor_id", string);
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).zoom(map).LJIILIIL(new C0UO0()), (C11NJ) this.LJIIJ.getValue(), new AfS184S0100000_15(interfaceC919760a2g, 181), new AfS184S0100000_15(interfaceC919760a2g, 182), null, null, 56);
    }

    public void LJJ(List<PosIdentity> list) {
        if (!Intrinsics.LJFF(list, LJIIIIZZ())) {
            List<PosIdentity> listLJIIIIZZ = LJIIIIZZ();
            listLJIIIIZZ.clear();
            listLJIIIIZZ.addAll(list);
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(ZoomedPositionsUpdateEvent.class, list);
            }
        }
        if (LJIIIIZZ().isEmpty()) {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ != null) {
                interfaceC924740aAiLIZ.LIZIZ("enlarge_grid");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                interfaceC941720ac6LIZIZ.LJIL(C01EL.END, "enlarge_grid");
                return;
            }
            return;
        }
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ2 = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ2 != null) {
            interfaceC924740aAiLIZ2.LIZ("enlarge_grid");
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ2 == null) {
            return;
        }
        interfaceC941720ac6LIZIZ2.LJIL(C01EL.START, "enlarge_grid");
    }

    public void LJJIFFI(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
        C1143300frE.LJIIJJI().LJII(LJIJI, C2097608Jq.LJIIJ(new Pair("action", "zoomFromLinkScreenChangeMessage"), new Pair("linkerEnlargeStatusSynContent", linkerEnlargeStatusSynContent.toString())));
    }

    public final int LIZ(String str, boolean z) {
        C01FV c01fvLJ = C01HE.LJ();
        if (c01fvLJ == null) {
            c01fvLJ = C01FV.AUDIENCE;
        }
        int i = C01FZ.LIZ[c01fvLJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    if (!C923330a8R.LJIIIZ()) {
                        return 0;
                    }
                    return LIZIZ(str, false);
                }
                throw new C1954807lC();
            }
            C923330a8R c923330a8R2 = C923330a8R.LIZ;
            if (C923330a8R.LJIIIZ()) {
                return LIZIZ(str, true);
            }
            return 4;
        }
        if (z) {
            if (LJIIIZ() && Intrinsics.LJFF(this.LJ, str)) {
                return 3;
            }
            if (LJIIJJI(Boolean.FALSE, str)) {
                return 1;
            }
            return 2;
        }
        return 5;
    }

    public final int LIZIZ(String str, boolean z) {
        if (LJIIIZ() && Intrinsics.LJFF(this.LJ, str)) {
            if (Intrinsics.LJFF(str, LJIILIIL()) && z) {
                return 4;
            }
            if (Intrinsics.LJFF(str, LJIILIIL()) && !z) {
                return 0;
            }
            return 3;
        }
        if (!LJIIJJI(Boolean.FALSE, str)) {
            return 2;
        }
        return 0;
    }

    public boolean LJIIJJI(Boolean bool, String str) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Long lValueOf = Long.valueOf(C01HE.LJI(str));
        c930480aJy.getClass();
        if (!C930480aJy.LJIJJ(lValueOf) && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public int LJIILLIIL(InterfaceC937900aVw interfaceC937900aVw, String str) {
        Map<String, OnLineMicInfo> mapLIZ;
        OnLineMicInfo onLineMicInfo;
        MicPositionInfo micPositionInfo;
        InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
        if (interfaceC937900aVwLIZ != null && (mapLIZ = interfaceC937900aVwLIZ.LIZ()) != null && (onLineMicInfo = mapLIZ.get(str)) != null && (micPositionInfo = onLineMicInfo.micPositionData) != null) {
            return micPositionInfo.position;
        }
        return LJIILIIL;
    }

    public final void LJJIII(String str, boolean z) {
        boolean z2;
        String str2;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str3 = null;
        if (!z2) {
            Layout layoutLJII = LJII();
            if (layoutLJII != null) {
                str3 = layoutLJII.layoutId;
            }
            LJJIIZI(this, str, LJII(), LJIILLIIL(C920280a3W.LIZ(), str), z ? 1 : 0, null, Boolean.valueOf(z), 16);
            InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
            if (interfaceC937900aVwLIZ != null) {
                interfaceC937900aVwLIZ.LJJJJIZL(str3, false, false, true, false, new C916150Zwr());
            }
            C917290Zyh.LIZ.LJIIJ(true);
            return;
        }
        Layout layoutLJII2 = LJII();
        if (layoutLJII2 != null) {
            str2 = layoutLJII2.layoutId;
        } else {
            str2 = null;
        }
        LJJIJIIJIL(this, 0, null, 6);
        InterfaceC937900aVw interfaceC937900aVwLIZ2 = C920280a3W.LIZ();
        if (interfaceC937900aVwLIZ2 != null) {
            interfaceC937900aVwLIZ2.LJJJJIZL(str2, false, false, true, false, new C916150Zwr());
        }
        C917290Zyh.LIZ.LJIIJ(false);
    }

    public final void LJJIIJ(int i, InterfaceC937900aVw interfaceC937900aVw) {
        int i2;
        if (i <= 0) {
            C20441214yg.LJIIIZ(LJIJI, "zoomLocallyForModel positionToBeZoomed should be larger than zero.");
            return;
        }
        Integer num = this.LJFF;
        if (num != null && num.intValue() == i) {
            return;
        }
        if (LJII() == null) {
            C20441214yg.LJIIIZ(LJIJI, "zoomLocallyForModel currentLayout is null");
            return;
        }
        Layout layoutLJII = LJII();
        if (layoutLJII != null) {
            String str = layoutLJII.zoomLayoutId;
            if (str != null && str.length() != 0) {
                Layout layoutLJII2 = LJII();
                if (layoutLJII2 != null) {
                    int i3 = layoutLJII2.micCount;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (i4 == i) {
                            i2 = i3 - 1;
                        } else if (i4 < i) {
                            i2 = i4;
                        } else {
                            i2 = i4 - 1;
                        }
                        linkedHashMap.put(Integer.valueOf(i4), Integer.valueOf(i2));
                    }
                    LJIJJLI(Integer.valueOf(i));
                    interfaceC937900aVw.LLD(layoutLJII2.zoomLayoutId, linkedHashMap);
                    interfaceC937900aVw.LJJJJIZL(layoutLJII2.layoutId, false, false, true, false, new C916150Zwr());
                    return;
                }
                return;
            }
        }
        C20441214yg.LJIIIZ(LJIJI, "zoomLocallyForModel zoomLayoutId is null");
    }

    public final String LJJIIZ(Boolean bool, String str) {
        Layout layoutLJII;
        Layout layoutLJII2 = LJII();
        if ((layoutLJII2 == null || layoutLJII2.zoomLayoutId == null) && ((layoutLJII = LJII()) == null || layoutLJII.anchorZoomLayoutId == null)) {
            Layout layoutLJII3 = LJII();
            if (layoutLJII3 == null) {
                return null;
            }
            return layoutLJII3.layoutId;
        }
        if (LJIIIZ()) {
            if (LJIIJJI(bool, str)) {
                Layout layoutLJII4 = LJII();
                if (layoutLJII4 == null) {
                    return null;
                }
                return layoutLJII4.anchorZoomLayoutId;
            }
            Layout layoutLJII5 = LJII();
            if (layoutLJII5 == null) {
                return null;
            }
            return layoutLJII5.zoomLayoutId;
        }
        if (LJIIJJI(bool, str)) {
            Layout layoutLJII6 = LJII();
            if (layoutLJII6 == null) {
                return null;
            }
            return layoutLJII6.anchorZoomLayoutId;
        }
        Layout layoutLJII7 = LJII();
        if (layoutLJII7 == null) {
            return null;
        }
        return layoutLJII7.zoomLayoutId;
    }

    public static Map LJFF(int i, long j, String str, boolean z) {
        String string;
        Long lValueOf;
        int i2;
        HashMap map = new HashMap();
        Room roomLJIJI = LJIJI();
        if (roomLJIJI == null || (string = Long.valueOf(roomLJIJI.getOwnerUserId()).toString()) == null) {
            string = "";
        }
        map.put("anchor_id", string);
        map.put("guest_user_id", String.valueOf(C01HE.LJI(str)));
        Room roomLJIJI2 = LJIJI();
        if (roomLJIJI2 != null) {
            lValueOf = Long.valueOf(roomLJIJI2.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        map.put(Scene.SCENE_SERVICE, String.valueOf(i));
        map.put("channel_id", C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ()));
        if (z) {
            i2 = LJIJ;
        } else {
            i2 = 0;
        }
        map.put("is_reject_enlarge_screen", String.valueOf(i2));
        map.put("linkmic_id", str);
        if (j > 0) {
            map.put("operate_user_id", String.valueOf(j));
        }
        return map;
    }

    public static void LJJIJIIJIL(AbstractC919790a2j abstractC919790a2j, int i, InterfaceC937900aVw interfaceC937900aVw, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC937900aVw = C920280a3W.LIZ();
        }
        abstractC919790a2j.LJII = i;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.LLD(null, C2097608Jq.LJ());
            C2097608Jq.LJ();
            interfaceC937900aVw.LJJLJLI();
        }
        abstractC919790a2j.LJIJ();
    }

    public final Map LJJIJIIJI(int i, Boolean bool, String str, Map map) {
        boolean zLJIIJJI;
        int i2 = LJIILIIL;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), str)) {
                    MicPositionInfo micPositionInfo = ((OnLineMicInfo) entry.getValue()).micPositionData;
                    if (micPositionInfo != null) {
                        i2 = micPositionInfo.position;
                    } else {
                        i2 = LJIILIIL;
                    }
                }
            }
        }
        if (i2 != LJIILIIL && i != 0) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                zLJIIJJI = true;
            } else {
                zLJIIJJI = LJIIJJI(Boolean.FALSE, str);
            }
            return C1195804m4.LIZ(i2, i, i - 1, zLJIIJJI);
        }
        return C2097608Jq.LJ();
    }

    public static void LJJIIZI(AbstractC919790a2j abstractC919790a2j, String str, Layout layout, int i, int i2, InterfaceC937900aVw interfaceC937900aVw, Boolean bool, int i3) {
        if ((i3 & 16) != 0) {
            interfaceC937900aVw = C920280a3W.LIZ();
        }
        if ((i3 & 32) != 0) {
            bool = Boolean.FALSE;
        }
        if (!abstractC919790a2j.LJIIIZ() || abstractC919790a2j.LJII() == null) {
            abstractC919790a2j.LIZIZ = layout;
            abstractC919790a2j.LIZLLL = layout;
        }
        abstractC919790a2j.LJIJJ(str);
        if (i2 != 0) {
            abstractC919790a2j.LJII = i2;
        }
        abstractC919790a2j.LJJIJ(str, i, interfaceC937900aVw, bool);
    }
}
