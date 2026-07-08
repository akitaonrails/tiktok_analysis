package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookAsyncUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookAsyncUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchDetailParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateActiveContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateActiveContentResponse;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookActiveContentFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookNonMultiGuestEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: renamed from: X.14pX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20384514pX extends AbstractC20384214pU {
    public List<Playbook> LJIILLIIL;
    public List<Playbook> LJIIZILJ;
    public List<Playbook> LJIJ;
    public final CopyOnWriteArraySet<InterfaceC20387114px> LJIJI;
    public final ConcurrentHashMap<String, String> LJIJJ;
    public C20425514w9 LJIJJLI;
    public long LJIL;
    public final C098J<Integer, List<Playbook>> LJJ;
    public final Map<Integer, EnumC20429214wk> LJJI;
    public boolean LJJIFFI;
    public int LJJII;
    public final CopyOnWriteArraySet<InterfaceC20365114mP> LJJIII;
    public final Map<Integer, C1776490wKV> LJJIIJ;
    public C19487111Lx LJJIIJZLJL;
    public C19487111Lx LJJIIZ;

    @Override // X.AbstractC20384214pU, X.InterfaceC20377114oL
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.AbstractC20384214pU
    public final String LJIJJ() {
        return "PlaybookAnchorModel";
    }

    public static InterfaceC954180awC LJJIZ() {
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (C500260Jjc.LJJJI(interfaceC954180awCLJIIIZ != null ? Boolean.valueOf(interfaceC954180awCLJIIIZ.LJLJLJ()) : null)) {
                return C915980Zwa.LJII().LJIIIZ();
            }
        }
        return C915980Zwa.LJIIIIZZ().LLJLL();
    }

    @Override // X.AbstractC20384214pU
    public final void LJJIIZI() {
        Playbook playbook;
        String strLIZIZ;
        Playbook playbook2;
        ActivePlaybook activePlaybook = this.LJIIIZ;
        if (activePlaybook != null && (playbook = activePlaybook.playbook) != null && (strLIZIZ = PlaybookUtilKt.LIZIZ(playbook)) != null) {
            ActivePlaybook activePlaybook2 = this.LJIIIZ;
            if (C500260Jjc.LJJIJIIJIL((activePlaybook2 == null || (playbook2 = activePlaybook2.playbook) == null) ? null : Boolean.valueOf(playbook2.isMyCreation))) {
                LJJIJIIJIL(strLIZIZ, "endIM");
            }
        }
        LJJIII(null, "endIM", false, true);
    }

    public final int LJJIJLIJ() {
        return C20385714pj.LIZJ(this.LJJII).getFirst().intValue();
    }

    public final int LJJIL() {
        return C20385714pj.LIZJ(this.LJJII).getSecond().intValue();
    }

    @Override // X.AbstractC20384214pU
    public final void LJIILIIL() {
        super.LJIILIIL();
        this.LJJIII.clear();
        this.LJIJI.clear();
        C403501hZ.LIZ(new C20389014qG(this));
    }

    @Override // X.AbstractC20384214pU, X.InterfaceC20377114oL
    public final void LJ(C20379114of c20379114of) {
        String strLIZIZ = PlaybookUtilKt.LIZIZ(c20379114of.LIZ);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        ConcurrentHashMap<String, C20377014oK> concurrentHashMap = this.LJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C20377014oK> entry : concurrentHashMap.entrySet()) {
            C20377014oK value = entry.getValue();
            if (value.LJIIJ && !Intrinsics.LJFF(PlaybookUtilKt.LIZIZ(value.LJFF.LIZ), strLIZIZ)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (C20377014oK c20377014oK : linkedHashMap.values()) {
            c20377014oK.getClass();
            C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", "clearDecoration");
            c20377014oK.LIZLLL.LJI();
            c20377014oK.LIZLLL(false);
        }
    }

    @Override // X.AbstractC20384214pU, X.InterfaceC20377114oL
    public final String LJI(String str) {
        return this.LJIJJ.get(str);
    }

    @Override // X.AbstractC20384214pU
    public final void LJIIJJI(String str) {
        long jLongValue;
        long jLongValue2;
        long jLJIJI = PlaybookUtilKt.LJIJI(str);
        Long lLJJLIL = C500260Jjc.LJJLIL(a0.LJJLIIJ('_', str, CardStruct.IStatusCode.DEFAULT));
        if (lLJJLIL != null) {
            jLongValue = lLJJLIL.longValue();
        } else {
            jLongValue = 0;
        }
        Set<String> setKeySet = this.LJIJJ.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str2 = (String) obj;
            if (PlaybookUtilKt.LJIJI(str2) == jLJIJI) {
                Long lLJJLIL2 = C500260Jjc.LJJLIL(a0.LJJLIIJ('_', str2, CardStruct.IStatusCode.DEFAULT));
                if (lLJJLIL2 != null) {
                    jLongValue2 = lLJJLIL2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                if (jLongValue2 != jLongValue) {
                    arrayList.add(obj);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LJIJJ.remove(it2.next());
        }
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorModel"), "clearFlowStrByOtherOriginalContentId, contentKey=" + str + ", size=" + arrayList.size(), null, null);
        arrayList.size();
    }

    @Override // X.AbstractC20384214pU
    public final void LJIIL(long j) {
        Set<String> setKeySet = this.LJIJJ.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (PlaybookUtilKt.LJIJI((String) obj) == j) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LJIJJ.remove(it2.next());
        }
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorModel"), "clearFlowStrByPlaybookId, playbookId=" + j + ", size=" + arrayList.size(), null, null);
        arrayList.size();
    }

    @Override // X.AbstractC20384214pU
    public final C11KQ LJIILL(PlaybookFetchDetailParams playbookFetchDetailParams) {
        boolean z;
        Long lValueOf;
        Playbook playbook;
        PlaybookContent playbookContent;
        Playbook playbook2;
        PlaybookContent playbookContent2;
        Playbook playbook3;
        ActivePlaybook activePlaybook = this.LJIIIZ;
        if (activePlaybook != null && (playbook3 = activePlaybook.playbook) != null && playbookFetchDetailParams.playbookId == playbook3.playbookId) {
            z = true;
        } else {
            z = false;
        }
        if (z && activePlaybook != null && activePlaybook.playStatus == 1) {
            if (activePlaybook != null && (playbook2 = activePlaybook.playbook) != null && (playbookContent2 = playbook2.content) != null) {
                lValueOf = Long.valueOf(playbookContent2.playbookContentId);
            } else {
                lValueOf = null;
            }
            long j = 0;
            if (MultiGuestPlaybookActiveContentFixSetting.INSTANCE.enable() && lValueOf != null && lValueOf.longValue() != 0) {
                C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorModel"), "fetchDetail use activeParams", null, null);
                PlaybookFetchDetailParams playbookFetchDetailParams2 = new PlaybookFetchDetailParams();
                playbookFetchDetailParams2.playbookId = playbookFetchDetailParams.playbookId;
                ActivePlaybook activePlaybook2 = this.LJIIIZ;
                if (activePlaybook2 != null && (playbook = activePlaybook2.playbook) != null && (playbookContent = playbook.content) != null) {
                    j = playbookContent.playbookContentId;
                }
                playbookFetchDetailParams2.playbookContentId = j;
                playbookFetchDetailParams2.scene = playbookFetchDetailParams.scene;
                playbookFetchDetailParams2.businessType = playbookFetchDetailParams.businessType;
                return super.LJIILL(playbookFetchDetailParams2);
            }
        }
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorModel"), "fetchDetail use originParams", null, null);
        return super.LJIILL(playbookFetchDetailParams);
    }

    @Override // X.AbstractC20384214pU
    public final boolean LJJII(long j) {
        Playbook playbook;
        ActivePlaybook activePlaybook = this.LJIIIZ;
        boolean z = false;
        if (activePlaybook != null && (playbook = activePlaybook.playbook) != null && j == playbook.playbookId) {
            z = true;
        }
        return !z;
    }

    public final void LJJIJIL(String str) {
        String strLIZ = C01EI.LIZ(0, "PlaybookAnchorModel");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearPlaybookList, source=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LJJJJIZL(str, null);
        LJJJIL(str, null);
        LJJJJJ(this, null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[PHI: r4
      0x006c: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v6 java.lang.String) binds: [B:31:0x0069, B:17:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20384514pX.LJJJ(java.lang.String):void");
    }

    public final void LJJJI(Playbook playbook) {
        List<Integer> list;
        List<PlaybookTagAggregation> list2;
        Boolean boolValueOf;
        boolean z;
        Object obj;
        Object obj2;
        boolean z2;
        this.LJIL = System.currentTimeMillis();
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        long j = playbook.playbookId;
        PlaybookContent playbookContent = playbook.content;
        Boolean boolValueOf2 = null;
        if (playbookContent != null) {
            list = playbookContent.tagTypes;
            list2 = playbookContent.tagAggregations;
        } else {
            list = null;
            list2 = null;
        }
        Integer numValueOf = Integer.valueOf(playbook.playbookType);
        Boolean boolValueOf3 = Boolean.valueOf(playbook.isMyCreation);
        PlaybookContent playbookContent2 = playbook.content;
        if (playbookContent2 != null) {
            boolValueOf = Boolean.valueOf(playbookContent2.supportAutomation);
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        Integer numValueOf2 = Integer.valueOf(playbook.automationUserSetting);
        PlaybookContent playbookContent3 = playbook.content;
        if (playbookContent3 != null) {
            boolValueOf2 = Boolean.valueOf(playbookContent3.supportAutomation);
        }
        boolean zLJIJJLI = PlaybookUtilKt.LJIJJLI(C500260Jjc.LJJJI(boolValueOf2), numValueOf2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C978360bZC.LIZ(linkedHashMap);
        C978360bZC.LIZIZ(Long.valueOf(j), linkedHashMap);
        linkedHashMap.put("playbook_id", String.valueOf(j));
        linkedHashMap.put("from", C978360bZC.LJIIIZ);
        if (C978360bZC.LJIIJ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = "1";
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_auto_apply", obj);
        linkedHashMap.put("auto_apply_type", C978360bZC.LJIIJ);
        if (C978360bZC.LJIIJ.length() > 0) {
            if (C978360bZC.LJIIL.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                linkedHashMap.put("panel_page", "auto_apply");
            } else {
                linkedHashMap.put("panel_page", C978360bZC.LJIIL);
            }
            if (C978360bZC.LJIIJJI.length() > 0) {
                linkedHashMap.put("panel_entrance", C978360bZC.LJIIJJI);
            }
        }
        if (list != null && (!list.isEmpty())) {
            linkedHashMap.put("recommend_label_list", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        }
        if (PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && list2 != null && !list2.isEmpty()) {
            linkedHashMap.put("recommend_label_vertical_list", C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(0), 30));
        }
        linkedHashMap.put("playbook_create_type", C978360bZC.LJJIJIIJI(boolValueOf3, numValueOf));
        if (zLJJJI && PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_auto_step_supported", obj2);
        if (!zLJIJJLI || !PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_auto_step", str);
        C978360bZC.LJI.put(Long.valueOf(j), C978360bZC.LJFF().LIZ);
        C978360bZC.LJJIIZI("livesdk_multi_anchor_playbook_apply", linkedHashMap);
    }

    public final void LJJJJ(C1158290gFP c1158290gFP) {
        String strLIZ = C01EI.LIZ(629, "PlaybookAnchorModel");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateIsLoadingOnlyRecommendPlaybookListValue localParams=");
        sbLIZ.append(c1158290gFP);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        Iterator<InterfaceC20387114px> it2 = this.LJIJI.iterator();
        while (it2.hasNext()) {
            it2.next().LJI(c1158290gFP);
        }
    }

    public C20384514pX(DataChannel dataChannel, WeakReference<Context> weakReference) {
        super(dataChannel, weakReference);
        this.LJIJI = new CopyOnWriteArraySet<>();
        this.LJIJJ = new ConcurrentHashMap<>();
        this.LJJ = new C098J<>();
        this.LJJI = new LinkedHashMap();
        this.LJJIII = new CopyOnWriteArraySet<>();
        this.LJJIIJ = new LinkedHashMap();
        C403501hZ.LIZ(new C20378514oZ(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    @Override // X.AbstractC20384214pU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(webcast.data.multi_guest_play.Playbook r18, X.EnumC466501rj r19) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20384514pX.LJJIJIIJI(webcast.data.multi_guest_play.Playbook, X.01rj):void");
    }

    public final void LJJIJIIJIL(String str, String str2) {
        String strLIZ = C01EI.LIZ(255, "PlaybookAnchorModel");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearLocalCacheFlowStr, contentKey=");
        sbLIZ.append(str);
        sbLIZ.append(", source=");
        sbLIZ.append(str2);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LJIJJ.remove(str);
    }

    public final C1158290gFP LJJIJL(int i, boolean z) {
        int iIntValue = C20385714pj.LIZJ(i).getFirst().intValue();
        Map<Integer, C1776490wKV> map = this.LJJIIJ;
        Integer first = C20385714pj.LIZJ(i).getFirst();
        int iIntValue2 = C20385714pj.LIZJ(i).getSecond().intValue();
        EnumC20429214wk enumC20429214wk = (EnumC20429214wk) ((LinkedHashMap) this.LJJI).get(Integer.valueOf(i));
        if (enumC20429214wk == null) {
            enumC20429214wk = EnumC20429214wk.INIT;
        }
        map.put(first, new C1776490wKV(iIntValue, iIntValue2, enumC20429214wk));
        return new C1158290gFP(z, this.LJJIIJ, this.LJJIFFI);
    }

    public final void LJJJIL(String str, List list) {
        String strLIZ = C01EI.LIZ(548, "PlaybookAnchorModel");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFavoritePlaybook, source=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LJIIZILJ = list;
        Iterator<InterfaceC20387114px> it2 = this.LJIJI.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(this.LJIIZILJ);
        }
    }

    public final void LJJJJI(String str, String str2) {
        String strLIZ = C01EI.LIZ(250, "PlaybookAnchorModel");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLocalFlowStr, contentKey=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LJIJJ.put(str, str2);
    }

    public final void LJJJJIZL(String str, List list) {
        String strLIZ = C01EI.LIZ(535, "PlaybookAnchorModel");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMyPlaybook, source=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LJIILLIIL = list;
        Iterator<InterfaceC20387114px> it2 = this.LJIJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(this.LJIILLIIL);
        }
    }

    public static void LJJJJJ(C20384514pX c20384514pX, List list, String str) {
        int iLJJIJLIJ = c20384514pX.LJJIJLIJ();
        c20384514pX.getClass();
        String strLIZ = C01EI.LIZ(553, "PlaybookAnchorModel");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRecommendPlaybook, source=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        c20384514pX.LJIJ = list;
        Iterator<InterfaceC20387114px> it2 = c20384514pX.LJIJI.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(iLJJIJLIJ, c20384514pX.LJIJ);
        }
    }

    @Override // X.AbstractC20384214pU, X.InterfaceC20377114oL
    public final void LIZ(int i, long j, List list) {
        long j2;
        C20359414lU c20359414lU;
        C1868480yis c1868480yis;
        int i2;
        String strLIZ;
        String strLIZ2;
        String string;
        String string2;
        String strValueOf;
        Playbook playbook;
        for (InterfaceC20365114mP interfaceC20365114mP : this.LJJIII) {
            if (list != null && list.size() >= (i2 = i + 1) && i >= 0) {
                C20359414lU c20359414lU2 = (C20359414lU) ListProtector.get(list, i);
                int i3 = i - 1;
                String strValueOf2 = "";
                if (i3 < 0) {
                    strLIZ = "";
                } else {
                    strLIZ = C20362914m3.LIZ((C20359414lU) ListProtector.get(list, i3));
                }
                if (i2 >= list.size()) {
                    strLIZ2 = "";
                } else {
                    strLIZ2 = C20362914m3.LIZ((C20359414lU) ListProtector.get(list, i2));
                }
                String str = c20359414lU2.LIZIZ;
                if (str == null) {
                    str = "";
                }
                Long lValueOf = Long.valueOf(j);
                String str2 = c20359414lU2.LIZLLL;
                if (str2 == null) {
                    str2 = "";
                }
                String strLJIJI = C497740JfY.LJIJI(2131855273);
                String strLJIJI2 = C497740JfY.LJIJI(2131855274);
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i2);
                String str3 = c20359414lU2.LIZIZ;
                if (str3 == null) {
                    str3 = "";
                }
                objArr[1] = str3;
                String strJ4 = C786410Ut5.j4(strLJIJI2, Arrays.copyOf(objArr, 2));
                ActivePlaybook activePlaybook = this.LJIIIZ;
                if (activePlaybook == null || (playbook = activePlaybook.playbook) == null || (string = Long.valueOf(playbook.playbookId).toString()) == null) {
                    string = "";
                }
                ActivePlaybook activePlaybook2 = this.LJIIIZ;
                if (activePlaybook2 == null || (string2 = Long.valueOf(activePlaybook2.playId).toString()) == null) {
                    string2 = "";
                }
                String strLIZ3 = C20362914m3.LIZ(c20359414lU2);
                if (i3 < 0) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(i3 + 1);
                }
                if (i2 < list.size()) {
                    strValueOf2 = String.valueOf(i2 + 1);
                }
                c1868480yis = new C1868480yis(str, i2, lValueOf, str2, strLJIJI, strJ4, new C1868490yit(string, string2, strLIZ3, strLIZ, strLIZ2, strValueOf, strValueOf2));
            } else {
                c1868480yis = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlaybookRunningStepSwitch playbookStepBizData = ");
            sbLIZ.append(c1868480yis);
            C20441214yg.LIZIZ("PlaybookAnchorModel", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC20365114mP.LIZ();
        }
        if (PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
            PlaybookUpdateActiveContentParams playbookUpdateActiveContentParams = new PlaybookUpdateActiveContentParams();
            playbookUpdateActiveContentParams.roomId = AbstractC20384214pU.LJIJI();
            ActivePlaybook activePlaybook3 = this.LJIIIZ;
            long j3 = 0;
            if (activePlaybook3 != null) {
                j2 = activePlaybook3.playId;
            } else {
                j2 = 0;
            }
            playbookUpdateActiveContentParams.playId = j2;
            playbookUpdateActiveContentParams.updateType = 2;
            if (i == -1) {
                j3 = -1;
            } else if (list != null && (c20359414lU = (C20359414lU) C13LP.LJJJLZIJ(i, list)) != null) {
                j3 = c20359414lU.LIZ;
            }
            playbookUpdateActiveContentParams.currentStateId = j3;
            C19487111Lx c19487111Lx = this.LJJIIZ;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            C480460Ism.LIZ().getClass();
            this.LJJIIZ = (C19487111Lx) new C11QI(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).updateActiveContent(playbookUpdateActiveContentParams), "PlaybookAnchorModel", "notifyServerRunningStep").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.00Sg
                @Override // X.C09JN
                public final void accept(Object obj) {
                    PlaybookUpdateActiveContentResponse.ResponseData responseData;
                    ActivePlaybook activePlaybook4;
                    C1C7U.LIZ("PlaybookAnchorModel@281.notifyServerRunningStep$1");
                    C470590Icr c470590Icr = (C470590Icr) obj;
                    C930480aJy.LIZ.getClass();
                    if (C930480aJy.LJJIFFI(c470590Icr) && (responseData = (PlaybookUpdateActiveContentResponse.ResponseData) c470590Icr.data) != null && (activePlaybook4 = responseData.activePlaybook) != null) {
                        this.LL.LJJIII(activePlaybook4, "notifyServerRunningStep", false, true);
                    }
                    C1C7U.LIZIZ("PlaybookAnchorModel@281.notifyServerRunningStep$1");
                }
            }))).LJIILL().LJIIZILJ();
            C20379114of c20379114ofLJIJ = LJIJ();
            if (c20379114ofLJIJ != null) {
                LJIIJ(c20379114ofLJIJ);
            }
        }
    }

    @Override // X.AbstractC20384214pU, X.InterfaceC20377114oL
    public final void LIZLLL(C20379114of c20379114of, boolean z, boolean z2) {
        Boolean boolValueOf;
        boolean z3;
        String str;
        PlaybookContent playbookContent;
        String str2;
        String str3;
        Playbook playbook;
        long j;
        super.LIZLLL(c20379114of, z, z2);
        Playbook playbook2 = c20379114of.LIZ;
        PlaybookContent playbookContent2 = playbook2.content;
        if (playbookContent2 != null) {
            boolValueOf = Boolean.valueOf(playbookContent2.needAsyncUpdate);
        } else {
            boolValueOf = null;
        }
        long j2 = 0;
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C19487111Lx c19487111Lx = this.LJJIIJZLJL;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            C480460Ism.LIZ().getClass();
            IPlaybookApi iPlaybookApi = (IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class);
            PlaybookAsyncUpdateParams playbookAsyncUpdateParams = new PlaybookAsyncUpdateParams();
            playbookAsyncUpdateParams.playbookId = playbook2.playbookId;
            PlaybookContent playbookContent3 = playbook2.content;
            if (playbookContent3 != null) {
                j = playbookContent3.playbookContentId;
            } else {
                j = 0;
            }
            playbookAsyncUpdateParams.playbookContentId = j;
            this.LJJIIJZLJL = (C19487111Lx) new C11QI(C01NB.LIZ(C01NB.LIZIZ(iPlaybookApi.asyncUpdate(playbookAsyncUpdateParams), "PlaybookAnchorModel", "asyncUpdate").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.00du
                @Override // X.C09JN
                public final void accept(Object obj) {
                    PlaybookAsyncUpdateResponse.ResponseData responseData;
                    Playbook playbook3;
                    C20384514pX c20384514pX;
                    C20379114of c20379114ofLJIJ;
                    Playbook playbook4;
                    ActivePlaybook activePlaybook;
                    C1C7U.LIZ("PlaybookAnchorModel@281.checkAndAsyncUpdatePlaybook$2");
                    C470590Icr c470590Icr = (C470590Icr) obj;
                    C930480aJy.LIZ.getClass();
                    if (C930480aJy.LJJIFFI(c470590Icr) && (responseData = (PlaybookAsyncUpdateResponse.ResponseData) c470590Icr.data) != null && (playbook3 = responseData.playbook) != null && (c20379114ofLJIJ = (c20384514pX = this.LL).LJIJ()) != null && (playbook4 = c20379114ofLJIJ.LIZ) != null && playbook3.playbookId == playbook4.playbookId && ((activePlaybook = c20384514pX.LJIIIZ) == null || activePlaybook.playStatus != 1)) {
                        AbstractC20384214pU.LJJ(c20384514pX, playbook3, "asyncUpdate", true, null, 24);
                    }
                    C1C7U.LIZIZ("PlaybookAnchorModel@281.checkAndAsyncUpdatePlaybook$2");
                }
            }))).LJIILL().LJIIZILJ();
        }
        if (z) {
            ActivePlaybook activePlaybook = this.LJIIIZ;
            if (activePlaybook != null && (playbook = activePlaybook.playbook) != null && c20379114of.LIZ.playbookId == playbook.playbookId) {
                z3 = true;
            } else {
                z3 = false;
            }
            String str4 = "";
            if (z3) {
                if (Intrinsics.LJFF(this.LIZ.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                    PlaybookContent playbookContent4 = c20379114of.LIZ.content;
                    if (playbookContent4 == null || (str3 = playbookContent4.flowStr) == null) {
                        str3 = "";
                    }
                    String strLIZ = C01EI.LIZ(0, "PlaybookAnchorModel");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateActiveContent, newFlowStr=");
                    sbLIZ.append(str3);
                    C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    PlaybookUpdateActiveContentParams playbookUpdateActiveContentParams = new PlaybookUpdateActiveContentParams();
                    playbookUpdateActiveContentParams.roomId = AbstractC20384214pU.LJIJI();
                    ActivePlaybook activePlaybook2 = this.LJIIIZ;
                    if (activePlaybook2 != null) {
                        j2 = activePlaybook2.playId;
                    }
                    playbookUpdateActiveContentParams.playId = j2;
                    playbookUpdateActiveContentParams.updateType = 1;
                    playbookUpdateActiveContentParams.flowStr = str3;
                    playbookUpdateActiveContentParams.existsCustomContent = true;
                    C480460Ism.LIZ().getClass();
                    new C11QI(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).updateActiveContent(playbookUpdateActiveContentParams), "PlaybookAnchorModel", "updateActiveContent").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.00Sh
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            PlaybookUpdateActiveContentResponse.ResponseData responseData;
                            ActivePlaybook activePlaybook3;
                            C1C7U.LIZ("PlaybookAnchorModel@281.updateActiveContent$1");
                            C470590Icr c470590Icr = (C470590Icr) obj;
                            C930480aJy.LIZ.getClass();
                            if (C930480aJy.LJJIFFI(c470590Icr) && (responseData = (PlaybookUpdateActiveContentResponse.ResponseData) c470590Icr.data) != null && (activePlaybook3 = responseData.activePlaybook) != null) {
                                this.LL.LJJIII(activePlaybook3, "updateActiveContent", false, true);
                            }
                            C1C7U.LIZIZ("PlaybookAnchorModel@281.updateActiveContent$1");
                        }
                    }))).LJIILL().LJIIZILJ();
                } else if (C500260Jjc.LJJIL()) {
                    ActivePlaybook activePlaybook3 = this.LJIIIZ;
                    if (activePlaybook3 != null) {
                        Playbook playbook3 = activePlaybook3.playbook;
                        if (playbook3 != null && (playbookContent = playbook3.content) != null) {
                            PlaybookContent playbookContent5 = c20379114of.LIZ.content;
                            if (playbookContent5 == null || (str2 = playbookContent5.flowStr) == null) {
                                str2 = "";
                            }
                            playbookContent.flowStr = str2;
                        }
                        activePlaybook3.existsCustomContent = true;
                    }
                    LJJIII(activePlaybook3, "updateActiveContentInPreviewPage", false, true);
                }
            }
            String strLIZIZ = PlaybookUtilKt.LIZIZ(c20379114of.LIZ);
            PlaybookContent playbookContent6 = c20379114of.LIZ.content;
            if (playbookContent6 != null && (str = playbookContent6.flowStr) != null) {
                str4 = str;
            }
            LJJJJI(strLIZIZ, str4);
        }
    }

    @Override // X.AbstractC20384214pU
    public final void LJIL(ActivePlaybook activePlaybook, ActivePlaybook activePlaybook2, String str) {
        Playbook playbook;
        List<Integer> list;
        List<PlaybookTagAggregation> list2;
        Boolean boolValueOf;
        boolean z;
        Object obj;
        Object obj2;
        super.LJIL(activePlaybook, activePlaybook2, str);
        if (!this.LJFF && this.LJIL != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIL;
            if (activePlaybook2 != null && (playbook = activePlaybook2.playbook) != null) {
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                long j = playbook.playbookId;
                PlaybookContent playbookContent = playbook.content;
                Boolean boolValueOf2 = null;
                if (playbookContent != null) {
                    list = playbookContent.tagTypes;
                    list2 = playbookContent.tagAggregations;
                } else {
                    list = null;
                    list2 = null;
                }
                Integer numValueOf = Integer.valueOf(playbook.playbookType);
                Boolean boolValueOf3 = Boolean.valueOf(playbook.isMyCreation);
                PlaybookContent playbookContent2 = playbook.content;
                if (playbookContent2 != null) {
                    boolValueOf = Boolean.valueOf(playbookContent2.supportAutomation);
                } else {
                    boolValueOf = null;
                }
                boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                Integer numValueOf2 = Integer.valueOf(playbook.automationUserSetting);
                PlaybookContent playbookContent3 = playbook.content;
                if (playbookContent3 != null) {
                    boolValueOf2 = Boolean.valueOf(playbookContent3.supportAutomation);
                }
                boolean zLJIJJLI = PlaybookUtilKt.LJIJJLI(C500260Jjc.LJJJI(boolValueOf2), numValueOf2);
                C978360bZC.LJIIIIZZ = jCurrentTimeMillis;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C978360bZC.LIZ(linkedHashMap);
                C978360bZC.LIZIZ(Long.valueOf(j), linkedHashMap);
                linkedHashMap.put("playbook_id", String.valueOf(j));
                linkedHashMap.put("duration", String.valueOf(jCurrentTimeMillis));
                linkedHashMap.put("from", C978360bZC.LJIIIZ);
                if (C978360bZC.LJIIJ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = CardStruct.IStatusCode.DEFAULT;
                if (!z) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_auto_apply", obj);
                linkedHashMap.put("auto_apply_type", C978360bZC.LJIIJ);
                if (list != null && (!list.isEmpty())) {
                    linkedHashMap.put("recommend_label_list", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
                }
                if (PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put("recommend_label_vertical_list", C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(1), 30));
                }
                linkedHashMap.put("playbook_create_type", C978360bZC.LJJIJIIJI(boolValueOf3, numValueOf));
                if (zLJJJI && PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_auto_step_supported", obj2);
                if (zLJIJJLI && PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
                    str2 = "1";
                }
                linkedHashMap.put("is_auto_step", str2);
                C978360bZC.LJJIIZI("livesdk_multi_anchor_playbook_apply_over", linkedHashMap);
            }
        }
    }

    @Override // X.AbstractC20384214pU
    public final void LJJIIZ(String str, boolean z, boolean z2) {
        String strLIZIZ;
        Playbook playbook;
        String strLIZIZ2;
        ActivePlaybook activePlaybook;
        Playbook playbook2;
        Playbook playbook3;
        String strLIZIZ3;
        Playbook playbook4;
        Playbook playbook5;
        ActivePlaybook activePlaybook2 = this.LJIIJ;
        String strLIZIZ4 = null;
        if (activePlaybook2 != null && (playbook5 = activePlaybook2.playbook) != null) {
            strLIZIZ = PlaybookUtilKt.LIZIZ(playbook5);
        } else {
            strLIZIZ = null;
        }
        ActivePlaybook activePlaybook3 = this.LJIIIZ;
        if (activePlaybook3 != null && (playbook4 = activePlaybook3.playbook) != null) {
            strLIZIZ4 = PlaybookUtilKt.LIZIZ(playbook4);
        }
        if (!Intrinsics.LJFF(strLIZIZ, strLIZIZ4)) {
            ActivePlaybook activePlaybook4 = this.LJIIJ;
            if (activePlaybook4 != null && (playbook3 = activePlaybook4.playbook) != null && (strLIZIZ3 = PlaybookUtilKt.LIZIZ(playbook3)) != null) {
                C20377014oK c20377014oK = this.LJ.get(strLIZIZ3);
                if (c20377014oK != null) {
                    c20377014oK.LJ(false, false, true);
                    if (!c20377014oK.LJI && !c20377014oK.LJIIJ) {
                        C403501hZ.LIZ(new AwS575S0100000_31(c20377014oK, 1466));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateLastActivePlaybook, forceDestroy, contentKey=");
                        sbLIZ.append(strLIZIZ3);
                        C20441214yg.LIZIZ("PlaybookAnchorModel", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateLastActivePlaybook, running false, contentKey=");
                sbLIZ2.append(strLIZIZ3);
                C20441214yg.LIZIZ("PlaybookAnchorModel", C2188811AlT.LIZIZ(sbLIZ2));
            }
            ActivePlaybook activePlaybook5 = this.LJIIIZ;
            if (activePlaybook5 != null && (playbook = activePlaybook5.playbook) != null && (strLIZIZ2 = PlaybookUtilKt.LIZIZ(playbook)) != null) {
                if (!this.LJ.containsKey(strLIZIZ2) && (activePlaybook = this.LJIIIZ) != null && (playbook2 = activePlaybook.playbook) != null) {
                    String strLIZIZ5 = PlaybookUtilKt.LIZIZ(playbook2);
                    LJIIJJI(strLIZIZ5);
                    LJIILLIIL(PlaybookUtilKt.LJIJI(strLIZIZ5));
                    this.LJ.put(strLIZIZ5, new C20377014oK(this.LIZIZ, new C20378314oX(this), this.LIZ, playbook2, false, this));
                }
                C20377014oK c20377014oK2 = this.LJ.get(strLIZIZ2);
                if (c20377014oK2 != null) {
                    c20377014oK2.LJ(true, z, z2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateActivePlaybookDetail, running true, contentKey=");
                sbLIZ3.append(strLIZIZ2);
                C20441214yg.LIZIZ("PlaybookAnchorModel", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("updateActivePlaybook but contentId is the same, source: ");
        sbLIZ4.append(str);
        C20441214yg.LIZIZ("PlaybookAnchorModel", C2188811AlT.LIZIZ(sbLIZ4));
    }

    public final void LJJJJJL(int i, boolean z, EnumC20429214wk enumC20429214wk) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTagTypeState: ");
        sbLIZ.append(i);
        sbLIZ.append(" state:");
        sbLIZ.append(enumC20429214wk);
        C20441214yg.LIZIZ("PlaybookAnchorModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJI.put(Integer.valueOf(i), enumC20429214wk);
        if (this.LJJII == i) {
            LJJJJ(LJJIJL(i, z));
        }
    }

    @Override // X.AbstractC20384214pU
    public final void LJJIII(ActivePlaybook activePlaybook, String str, boolean z, boolean z2) {
        super.LJJIII(activePlaybook, str, z, z2);
        LJJJ(str);
    }
}
