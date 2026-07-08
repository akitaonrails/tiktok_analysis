package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFavoriteParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFavoriteResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchDetailParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetActiveContentParams;
import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookMockAabSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS146S1200000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookGroup;
import webcast.im.PlaybookMessage;

/* JADX INFO: renamed from: X.14pU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20384214pU implements InterfaceC20389414qK, InterfaceC20377114oL {
    public final DataChannel LIZ;
    public final WeakReference<Context> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(405));
    public final CopyOnWriteArraySet<C20389814qO> LIZLLL = new CopyOnWriteArraySet<>();
    public final ConcurrentHashMap<String, C20377014oK> LJ = new ConcurrentHashMap<>();
    public final boolean LJFF = C500260Jjc.LJJIL();
    public final CopyOnWriteArraySet<InterfaceC20378014oU> LJI = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<InterfaceC500101x9> LJII = new CopyOnWriteArraySet<>();
    public final C20384314pV LJIIIIZZ;
    public ActivePlaybook LJIIIZ;
    public ActivePlaybook LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public volatile long LJIILIIL;
    public volatile C20389514qL LJIILJJIL;
    public volatile boolean LJIILL;

    @Override // X.InterfaceC20377114oL
    public void LIZ(int i, long j, List list) {
    }

    @Override // X.InterfaceC20377114oL
    public boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC20377114oL
    public final void LIZJ() {
    }

    @Override // X.InterfaceC20377114oL
    public void LJ(C20379114of c20379114of) {
    }

    @Override // X.InterfaceC20377114oL
    public String LJI(String str) {
        return null;
    }

    public void LJIIJJI(String str) {
    }

    public void LJIIL(long j) {
    }

    public abstract String LJIJJ();

    public abstract boolean LJJII(long j);

    public void LJJIIZ(String str, boolean z, boolean z2) {
    }

    public abstract void LJJIIZI();

    public void LJJIJ(PlaybookMessage playbookMessage) {
    }

    public void LJJIJIIJI(Playbook playbook, EnumC466501rj enumC466501rj) {
    }

    public static long LJIJI() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
            return 0L;
        }
        return room.getId();
    }

    public final C20379114of LJIJ() {
        Object next;
        Iterator<T> it2 = this.LJ.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((C20377014oK) next).LJI) {
                break;
            }
        }
        C20377014oK c20377014oK = (C20377014oK) next;
        if (c20377014oK != null) {
            return c20377014oK.LJFF;
        }
        return null;
    }

    public final boolean LJIJJLI() {
        boolean zLJJJI;
        if (!MultiGuestPlaybookMockAabSetting.INSTANCE.enable()) {
            ILinkCoreService iLinkCoreService = (ILinkCoreService) C1161920gLG.LIZJ(ILinkCoreService.class);
            zLJJJI = C500260Jjc.LJJJI(iLinkCoreService != null ? Boolean.valueOf(iLinkCoreService.Nq1()) : null);
            if (!zLJJJI) {
            }
            return zLJJJI;
        }
        zLJJJI = false;
        C1AZW.LJIILL(C01EI.LIZ(131, LJIJJ()), "isSymphonyEngineEnable=false", null, null);
        LJJIFFI();
        return zLJJJI;
    }

    public void LJIILIIL() {
        IPcsService iPcsService;
        C0JKF c0jkfW2;
        IMessageManager iMessageManager;
        C1AZW.LJIIJ(12, C01EI.LIZ(0, LJIJJ()), "destroy", null, null);
        ((C11NJ) this.LIZJ.getValue()).LJ();
        C20389514qL c20389514qL = this.LJIILJJIL;
        if (c20389514qL != null && !c20389514qL.LIZ.isDisposed()) {
            c20389514qL.LIZ.dispose();
        }
        this.LJIILIIL = 0L;
        C20384314pV c20384314pV = this.LJIIIIZZ;
        c20384314pV.getClass();
        try {
            DataChannel dataChannel = c20384314pV.LIZ;
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) c20384314pV.LIZJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("PlaybookMessageChannel", e);
        }
        this.LJI.clear();
        this.LJII.clear();
        if (!C978390bZF.LIZ() || (iPcsService = (IPcsService) C1161920gLG.LIZJ(IPcsService.class)) == null || (c0jkfW2 = iPcsService.w2()) == null) {
            return;
        }
        c0jkfW2.LIZIZ();
        C518880KWo.LL.LJI();
    }

    public final void LJJIFFI() {
        C1AZW.LJIIJ(12, C01EI.LIZ(97, LJIJJ()), "tyrLoadSymphonyEngineSo", null, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LJIIJJI < 2000) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, LJIJJ()), "tyrLoadSymphonyEngineSo, prevent frequent calls, return", null, null);
            return;
        }
        this.LJIIJJI = jCurrentTimeMillis;
        ILinkCoreService iLinkCoreService = (ILinkCoreService) C1161920gLG.LIZJ(ILinkCoreService.class);
        if (iLinkCoreService != null) {
            iLinkCoreService.c60();
        }
    }

    @Override // X.InterfaceC20377114oL
    public final void LJFF(C20377014oK c20377014oK) {
        String strLIZ = C01EI.LIZ(84, LJIJJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookDetailHandler onDestroy, contentKey=");
        sbLIZ.append(PlaybookUtilKt.LIZIZ(c20377014oK.LJFF.LIZ));
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        ConcurrentHashMap<String, C20377014oK> concurrentHashMap = this.LJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C20377014oK> entry : concurrentHashMap.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue(), c20377014oK)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            this.LJ.remove(((Map.Entry) it2.next()).getKey());
        }
    }

    @Override // X.InterfaceC20389414qK
    public final void LJII(PlaybookMessage playbookMessage) {
        if (playbookMessage.playStatus == 1) {
            LJJI(playbookMessage, new AwS432S0200000_31(this, playbookMessage, 105), new C020W(this, playbookMessage, 55));
        } else {
            LJJI(playbookMessage, new AwS432S0200000_31(this, playbookMessage, 104), new AwS610S0100000_31(this, 406));
        }
    }

    @Override // X.InterfaceC20389414qK
    public final void LJIIIIZZ(PlaybookMessage playbookMessage) {
        LJJI(playbookMessage, new AwS432S0200000_31(this, playbookMessage, 105), new C020W(this, playbookMessage, 55));
    }

    @Override // X.InterfaceC20389414qK
    public final void LJIIIZ(PlaybookMessage playbookMessage) {
        LJJI(playbookMessage, new AwS432S0200000_31(this, playbookMessage, 104), new AwS610S0100000_31(this, 406));
    }

    public final void LJIIJ(C20379114of c20379114of) {
        Long lValueOf;
        Playbook playbook;
        String strLIZ = C01EI.LIZ(386, LJIJJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callBackDetailPlayBookListener, playbookId=");
        if (c20379114of != null && (playbook = c20379114of.LIZ) != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        Iterator<InterfaceC20378014oU> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c20379114of);
        }
    }

    public C11KQ LJIILL(PlaybookFetchDetailParams playbookFetchDetailParams) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).fetchDetail(playbookFetchDetailParams), LJIJJ(), "fetchDetail").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C516201zk(this, 225)));
    }

    public final void LJIILLIIL(long j) {
        Set<String> setKeySet = this.LJ.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (PlaybookUtilKt.LJIJI((String) obj) == j) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C20377014oK c20377014oKRemove = this.LJ.remove(it2.next());
            if (c20377014oKRemove != null) {
                C403501hZ.LIZ(new AwS575S0100000_31(c20377014oKRemove, 1466));
            }
        }
        arrayList.size();
    }

    public final void LJJIIJZLJL(Playbook playbook) {
        Playbook playbook2;
        ActivePlaybook activePlaybook = this.LJIIIZ;
        if (activePlaybook != null && (playbook2 = activePlaybook.playbook) != null && playbook.playbookId == playbook2.playbookId) {
            Playbook playbook3 = activePlaybook.playbook;
            if (playbook3 != null) {
                playbook3.isMyFavorite = playbook.isMyFavorite;
            }
            Playbook playbook4 = activePlaybook.playbook;
            if (playbook4 != null) {
                playbook4.totalFavorites = playbook.totalFavorites;
            }
            LJJIII(activePlaybook, "favoriteChange", false, true);
        }
    }

    public AbstractC20384214pU(DataChannel dataChannel, WeakReference<Context> weakReference) {
        this.LIZ = dataChannel;
        this.LIZIZ = weakReference;
        this.LJIIIIZZ = new C20384314pV(dataChannel, this);
    }

    public final C11KQ LJIIZILJ(long j, Function1 function1) {
        PlaybookGetActiveContentParams playbookGetActiveContentParams = new PlaybookGetActiveContentParams();
        playbookGetActiveContentParams.roomId = LJIJI();
        playbookGetActiveContentParams.playId = j;
        String strLIZ = C01EI.LIZ(0, LJIJJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getActiveContent, roomId=");
        sbLIZ.append(playbookGetActiveContentParams.roomId);
        sbLIZ.append(", playId=");
        sbLIZ.append(j);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C480460Ism.LIZ().getClass();
        return C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).getActiveContent(playbookGetActiveContentParams), LJIJJ(), "getActiveContent").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C515801zg(this, function1, 39)));
    }

    @Override // X.InterfaceC20377114oL
    public void LIZLLL(C20379114of c20379114of, boolean z, boolean z2) {
        if (z2) {
            LJIIJ(c20379114of);
        }
    }

    public void LJIL(ActivePlaybook activePlaybook, ActivePlaybook activePlaybook2, String str) {
        Long lValueOf;
        Long lValueOf2;
        String strLIZ = C01EI.LIZ(413, LJIJJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onActivePlaybookToNotOnGoing, source=");
        sbLIZ.append(str);
        sbLIZ.append(", currentActivePlayId=");
        ActivePlaybook activePlaybook3 = this.LJIIIZ;
        if (activePlaybook3 != null) {
            lValueOf = Long.valueOf(activePlaybook3.playId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", lastActivePlayId=");
        if (activePlaybook2 != null) {
            lValueOf2 = Long.valueOf(activePlaybook2.playId);
        } else {
            lValueOf2 = null;
        }
        sbLIZ.append(lValueOf2);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (!this.LJFF) {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ != null) {
                interfaceC924740aAiLIZ.LIZIZ("playbook");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                interfaceC941720ac6LIZIZ.LJIL(C01EL.END, "playbook");
            }
        }
    }

    public final void LJJI(PlaybookMessage playbookMessage, Function0<Unit> function0, Function1<? super ActivePlaybook, Unit> function1) {
        PlaybookGroup playbookGroup;
        long j = playbookMessage.version;
        if (j > 0 && (this instanceof C20384514pX) && (playbookGroup = playbookMessage.playbookGroup) != null && playbookGroup.groupId > 0) {
            if (j > this.LJIILIIL) {
                this.LJIILIIL = playbookMessage.version;
                if (playbookMessage.messageType == 2) {
                    function0.invoke();
                    function1.invoke(null);
                    return;
                } else {
                    if (playbookMessage.needRecharge) {
                        C20389514qL c20389514qL = this.LJIILJJIL;
                        if (c20389514qL != null && !c20389514qL.LIZ.isDisposed()) {
                            c20389514qL.LIZ.dispose();
                        }
                        this.LJIILJJIL = new C20389514qL((C11JL) LJIIZILJ(playbookMessage.playId, function1).LJFF(new C0UO0()).LJJIIZ(new C516201zk(this, 224), new C515801zg(this, function0, 34)));
                        return;
                    }
                    C20441214yg.LIZIZ(LJIJJ(), "[require] needRecharge == false");
                    function0.invoke();
                    return;
                }
            }
            C20441214yg.LIZIZ(LJIJJ(), "[require] version is less, do nothing");
            return;
        }
        C20441214yg.LIZIZ(LJIJJ(), "[require] version == 0");
        function0.invoke();
    }

    public final C11KQ LJIILJJIL(final long j, long j2, final long j3, String str) {
        C20379114of c20379114ofLJIJ;
        Playbook playbook;
        PlaybookContent playbookContent;
        String str2 = str;
        PlaybookFavoriteParams playbookFavoriteParams = new PlaybookFavoriteParams();
        playbookFavoriteParams.playbookId = j;
        playbookFavoriteParams.playbookContentId = j2;
        if (str2 == null && ((c20379114ofLJIJ = LJIJ()) == null || (playbook = c20379114ofLJIJ.LIZ) == null || (playbookContent = playbook.content) == null || (str2 = playbookContent.flowStr) == null)) {
            str2 = "";
        }
        playbookFavoriteParams.flowStr = str2;
        String strLIZ = C01EI.LIZ(0, LJIJJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("favorite, playbookId=");
        sbLIZ.append(j);
        sbLIZ.append(", playbookContentId=");
        sbLIZ.append(j2);
        sbLIZ.append(", originalPlaybookContentId=");
        sbLIZ.append(j3);
        sbLIZ.append(", flowStr=");
        sbLIZ.append(playbookFavoriteParams.flowStr);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C480460Ism.LIZ().getClass();
        return C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).favorite(playbookFavoriteParams), LJIJJ(), "favorite").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.01ri
            @Override // X.C09JN
            public final void accept(Object obj) {
                Playbook playbook2;
                C1C7U.LIZ("BasePlaybookModel@464b.favorite$1");
                C470590Icr c470590Icr = (C470590Icr) obj;
                C930480aJy.LIZ.getClass();
                if (C930480aJy.LJJIFFI(c470590Icr) && (playbook2 = ((PlaybookFavoriteResponse.ResponseData) c470590Icr.data).playbook) != null) {
                    AbstractC20384214pU abstractC20384214pU = this.LL;
                    long j4 = j;
                    long j5 = j3;
                    abstractC20384214pU.LJJIJIIJI(playbook2, EnumC466501rj.FAVORITE);
                    abstractC20384214pU.LJJIIJZLJL(playbook2);
                    C20377014oK c20377014oK = abstractC20384214pU.LJ.get(PlaybookUtilKt.LJIJ(Long.valueOf(j4), Long.valueOf(j5)));
                    if (c20377014oK != null) {
                        C403501hZ.LIZ(new AwS146S1200000_31("favorite", playbook2, c20377014oK, 10));
                    }
                }
                C1C7U.LIZIZ("BasePlaybookModel@464b.favorite$1");
            }
        }));
    }

    public void LJJIII(ActivePlaybook activePlaybook, String str, boolean z, boolean z2) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        C20379114of c20379114of;
        Playbook playbook;
        String strLIZIZ;
        C20377014oK c20377014oK;
        Long lValueOf6;
        Long lValueOf7;
        Playbook playbook2;
        PlaybookContent playbookContent;
        Playbook playbook3;
        String strLIZ = C01EI.LIZ(394, LJIJJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateActivePlaybook, source=");
        sbLIZ.append(str);
        sbLIZ.append(", operatorId=");
        if (activePlaybook != null) {
            lValueOf = Long.valueOf(activePlaybook.operatorId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", activePlayId=");
        if (activePlaybook != null) {
            lValueOf2 = Long.valueOf(activePlaybook.playId);
        } else {
            lValueOf2 = null;
        }
        sbLIZ.append(lValueOf2);
        sbLIZ.append(", playbookId: ");
        if (activePlaybook != null && (playbook3 = activePlaybook.playbook) != null) {
            lValueOf3 = Long.valueOf(playbook3.playbookId);
        } else {
            lValueOf3 = null;
        }
        sbLIZ.append(lValueOf3);
        sbLIZ.append(", playbookContentId: ");
        if (activePlaybook != null && (playbook2 = activePlaybook.playbook) != null && (playbookContent = playbook2.content) != null) {
            lValueOf4 = Long.valueOf(playbookContent.playbookContentId);
        } else {
            lValueOf4 = null;
        }
        sbLIZ.append(lValueOf4);
        sbLIZ.append(", ");
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        ActivePlaybook activePlaybook2 = this.LJIIIZ;
        this.LJIIJ = activePlaybook2;
        this.LJIIIZ = activePlaybook;
        boolean z3 = false;
        if (activePlaybook != null && activePlaybook.playStatus == 1) {
            z3 = true;
        }
        if (z3 != this.LJIIL) {
            if (z3) {
                String strLIZ2 = C01EI.LIZ(405, LJIJJ());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onActivePlaybookToOnGoing, source=");
                sbLIZ2.append(str);
                sbLIZ2.append(", currentActivePlayId=");
                ActivePlaybook activePlaybook3 = this.LJIIIZ;
                if (activePlaybook3 != null) {
                    lValueOf6 = Long.valueOf(activePlaybook3.playId);
                } else {
                    lValueOf6 = null;
                }
                sbLIZ2.append(lValueOf6);
                sbLIZ2.append(", lastActivePlayId=");
                if (activePlaybook2 != null) {
                    lValueOf7 = Long.valueOf(activePlaybook2.playId);
                } else {
                    lValueOf7 = null;
                }
                sbLIZ2.append(lValueOf7);
                C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                if (!this.LJFF) {
                    PlayRecordManager.LIZLLL.getClass();
                    InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
                    if (interfaceC924740aAiLIZ != null) {
                        interfaceC924740aAiLIZ.LIZ("playbook");
                    }
                    LinkMicAbilityManager.LJIIIZ.getClass();
                    InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
                    if (interfaceC941720ac6LIZIZ != null) {
                        interfaceC941720ac6LIZIZ.LJIL(C01EL.START, "playbook");
                    }
                }
            } else {
                LJIL(activePlaybook, activePlaybook2, str);
            }
            this.LJIIL = z3;
        }
        LJJIIZ(str, z, z2);
        String strLIZ3 = C01EI.LIZ(412, LJIJJ());
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("callBackActivePlayBookListener, activePlayId=");
        ActivePlaybook activePlaybook4 = this.LJIIIZ;
        if (activePlaybook4 != null) {
            lValueOf5 = Long.valueOf(activePlaybook4.playId);
        } else {
            lValueOf5 = null;
        }
        sbLIZ3.append(lValueOf5);
        C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
        for (InterfaceC500101x9 interfaceC500101x9 : this.LJII) {
            ActivePlaybook activePlaybook5 = this.LJIIIZ;
            if (activePlaybook5 != null && (playbook = activePlaybook5.playbook) != null && (strLIZIZ = PlaybookUtilKt.LIZIZ(playbook)) != null && (c20377014oK = this.LJ.get(strLIZIZ)) != null) {
                c20379114of = c20377014oK.LJFF;
            } else {
                c20379114of = null;
            }
            interfaceC500101x9.LIZ(activePlaybook5, c20379114of);
        }
    }

    public static void LJJ(AbstractC20384214pU abstractC20384214pU, Playbook playbook, String str, boolean z, Map map, int i) {
        boolean z2;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strLIZ = C01EI.LIZ(0, abstractC20384214pU.LJIJJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlaybookDetailFetchSuccess, source=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (map != null && !map.isEmpty()) {
            abstractC20384214pU.LIZLLL.add(new C20389814qO());
        }
        String strLIZIZ = PlaybookUtilKt.LIZIZ(playbook);
        if (abstractC20384214pU.LJ.get(strLIZIZ) != null && !z) {
            String strLIZ2 = C01EI.LIZ(0, abstractC20384214pU.LJIJJ());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onPlaybookDetailFetchSuccess, use Cache, contentKey=");
            sbLIZ2.append(strLIZIZ);
            C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            C20377014oK c20377014oK = abstractC20384214pU.LJ.get(strLIZIZ);
            if (c20377014oK != null) {
                if (z2) {
                    c20377014oK.LJFF(true, false);
                    C403501hZ.LIZ(new AwS146S1200000_31(str, playbook, c20377014oK, 10));
                    return;
                } else {
                    C403501hZ.LIZ(new AwS146S1200000_31(str, playbook, c20377014oK, 9));
                    return;
                }
            }
            return;
        }
        String strLIZ3 = C01EI.LIZ(0, abstractC20384214pU.LJIJJ());
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onPlaybookDetailFetchSuccess, new Instance, contentKey=");
        sbLIZ3.append(strLIZIZ);
        C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
        if (z) {
            abstractC20384214pU.LJIIL(playbook.playbookId);
        } else {
            abstractC20384214pU.LJIIJJI(strLIZIZ);
        }
        abstractC20384214pU.LJIILLIIL(PlaybookUtilKt.LJIJI(strLIZIZ));
        abstractC20384214pU.LJ.put(strLIZIZ, new C20377014oK(abstractC20384214pU.LIZIZ, new C20378314oX(abstractC20384214pU), abstractC20384214pU.LIZ, playbook, true, abstractC20384214pU));
    }
}
