package X;

import Y.AComparatorS50S0000000_31;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownPlayerListUpdatedEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ShowdownAnimationPerformanceOptSetting;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.15B9, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15B9 implements InterfaceC938550aWz {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final DataChannel LIZ;
    public EnumC937920aVy LIZIZ;
    public ViewGroup LJI;
    public ViewGroup LJII;
    public GuestShowdownContent LJIIIIZZ;
    public InterfaceC420801kM LJIIJJI;
    public final List<C20476915Ap> LIZJ = new ArrayList();
    public final List<C15BT> LIZLLL = new ArrayList();
    public final C01GW LJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(1));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS559S0100000_15(this, 9));
    public List<GuestShowdownUser> LJIIIZ = C13BV.INSTANCE;
    public final List<GuestShowdownContent> LJIIJ = new ArrayList();
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 6));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new C5182020e(this, 2));

    public final void LIZ() {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        ((ArrayList) this.LJIIJ).clear();
        for (C20476915Ap c20476915Ap : (ArrayList) this.LIZJ) {
            if (c20476915Ap != null) {
                int i = C20476915Ap.LJIIJJI;
                c20476915Ap.LJIIJ("onDestroy", true);
                InterfaceC420801kM interfaceC420801kM = c20476915Ap.LJII;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                c20476915Ap.LJIILIIL(null);
                C11JL c11jl = c20476915Ap.LJIIIIZZ;
                if (c11jl != null) {
                    c11jl.dispose();
                }
                c20476915Ap.LJIIIIZZ = null;
                c20476915Ap.LIZJ();
            }
        }
        ((ArrayList) this.LIZJ).clear();
        for (InterfaceC20478415Be interfaceC20478415Be : (ArrayList) this.LIZLLL) {
            if (interfaceC20478415Be != null) {
                interfaceC20478415Be.onDestroy();
            }
        }
        ((ArrayList) this.LIZLLL).clear();
        InterfaceC938250aWV interfaceC938250aWVLIZIZ = LIZIZ();
        if (interfaceC938250aWVLIZIZ != null) {
            interfaceC938250aWVLIZIZ.LJII((C945560aiI) this.LJFF.getValue());
        }
        this.LJI = null;
    }

    public final InterfaceC938250aWV LIZIZ() {
        return (InterfaceC938250aWV) this.LJ.getValue();
    }

    public final void LJI() {
        InterfaceC420801kM interfaceC420801kM;
        LJFF("onDestroy");
        if (MultiGuestV3ShowdownAnimationPerformanceOptSetting.INSTANCE.isEnable()) {
            InterfaceC420801kM interfaceC420801kM2 = this.LJIIJJI;
            if (C500260Jjc.LJJIFFI(interfaceC420801kM2 != null ? Boolean.valueOf(interfaceC420801kM2.isDisposed()) : null) && (interfaceC420801kM = this.LJIIJJI) != null) {
                interfaceC420801kM.dispose();
            }
        }
        this.LJIIJJI = null;
        LIZ();
    }

    public C15B9(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public static List LJIIJ(Map map) {
        ImageModel avatarThumb;
        String nickName;
        String displayId;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((Number) entry.getKey()).longValue() != C950220apo.LJ()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            GuestShowdownUser guestShowdownUser = new GuestShowdownUser();
            guestShowdownUser.userId = ((Number) entry2.getKey()).longValue();
            LinkListUser linkListUserLIZJ = C01Z9.LIZJ(((Number) entry2.getKey()).longValue());
            if (linkListUserLIZJ != null) {
                guestShowdownUser.linkmicId = linkListUserLIZJ.linkMicId;
                User user = linkListUserLIZJ.user;
                User.EnigmaInfo enigmaInfo = null;
                if (user != null) {
                    avatarThumb = user.getAvatarThumb();
                } else {
                    avatarThumb = null;
                }
                guestShowdownUser.avatarThumb = avatarThumb;
                User user2 = linkListUserLIZJ.user;
                String str = "";
                if (user2 == null || (nickName = user2.getNickName()) == null) {
                    nickName = "";
                }
                guestShowdownUser.nickname = nickName;
                User user3 = linkListUserLIZJ.user;
                if (user3 != null && (displayId = user3.getDisplayId()) != null) {
                    str = displayId;
                }
                guestShowdownUser.displayId = str;
                User user4 = linkListUserLIZJ.user;
                if (user4 != null) {
                    enigmaInfo = user4.enigmaInfo;
                }
                guestShowdownUser.enigmaInfo = enigmaInfo;
            }
            UserPlayInfo userPlayInfo = (UserPlayInfo) entry2.getValue();
            if (userPlayInfo != null) {
                guestShowdownUser.score = userPlayInfo.score;
                guestShowdownUser.rank = userPlayInfo.rank;
                guestShowdownUser.userTag = userPlayInfo.userTag;
            }
            arrayList.add(guestShowdownUser);
        }
        return C13LP.LJLLLL(new AComparatorS50S0000000_31(0), arrayList);
    }

    @Override // X.InterfaceC938550aWz
    public final void LIZJ(ViewGroup viewGroup) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("injectLayoutContainer before set layoutContainer:");
        sbLIZ.append(viewGroup.hashCode());
        sbLIZ.append(" curlayoutContainer:");
        ViewGroup viewGroup2 = this.LJII;
        if (viewGroup2 != null) {
            numValueOf = Integer.valueOf(viewGroup2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" calculatorList:");
        sbLIZ.append(((ArrayList) this.LIZLLL).size());
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = viewGroup;
        for (C15BT c15bt : this.LIZLLL) {
            boolean z = C15BC.LIZ;
            if (!C15BC.LIZ || (c15bt instanceof C15BQ) || this.LIZIZ != EnumC937920aVy.ANCHOR) {
                c15bt.LIZ(this.LJII);
            }
        }
        for (C20476915Ap c20476915Ap : this.LIZJ) {
            boolean z2 = C15BC.LIZ;
            if (!C15BC.LIZ || (c20476915Ap instanceof C20477215As)) {
                c20476915Ap.LIZLLL = this.LJII;
            }
        }
        ((ArrayList) this.LJIIJ).clear();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("injectLayoutContainer after set layoutContainer:");
        sbLIZ2.append(viewGroup);
        LJFF(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJFF(String str) {
        if (!C958370b2x.LIZJ()) {
            C20441214yg.LIZIZ((String) this.LJIILIIL.getValue(), str);
        }
    }

    public final void LJIIIZ(Function0<Unit> function0) {
        Thread thread;
        Context context;
        Looper mainLooper;
        Thread threadU3 = C786410Ut5.u3();
        ViewGroup viewGroup = this.LJI;
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (mainLooper = context.getMainLooper()) != null) {
            thread = mainLooper.getThread();
        } else {
            thread = null;
        }
        if (Intrinsics.LJFF(threadU3, thread)) {
            function0.invoke();
            return;
        }
        ViewGroup viewGroup2 = this.LJI;
        if (viewGroup2 == null) {
            return;
        }
        HandlerHook.viewPost(viewGroup2, new ARunnableS113S0100000_13(function0, (Function0<Unit>) 3));
    }

    @Override // X.InterfaceC938550aWz
    public final void LIZLLL(ViewGroup viewGroup, EnumC937920aVy enumC937920aVy) {
        Integer numValueOf;
        ViewGroup viewGroupLIZIZ;
        InterfaceC938250aWV interfaceC938250aWVLIZIZ;
        Map<Long, UserPlayInfo> mapLJIIJ;
        GuestShowdownContent guestShowdownContentLJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated role:");
        sbLIZ.append(enumC937920aVy);
        sbLIZ.append(" lastRole:");
        sbLIZ.append(enumC937920aVy);
        sbLIZ.append(" root:");
        sbLIZ.append(viewGroup);
        sbLIZ.append(" lastRootView:");
        sbLIZ.append(this.LJI);
        sbLIZ.append(' ');
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        GuestShowdownContent guestShowdownContentLJI2 = null;
        if (interfaceC938530aWxLIZ != null && (guestShowdownContentLJI = interfaceC938530aWxLIZ.LJI()) != null) {
            numValueOf = Integer.valueOf(guestShowdownContentLJI.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" ready2ConsumeGuestShowdownContentList.size:");
        sbLIZ.append(((ArrayList) this.LJIIJ).size());
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ == enumC937920aVy && Intrinsics.LJFF(this.LJI, viewGroup)) {
            LJFF("onViewCreated return");
            return;
        }
        boolean z = !Intrinsics.LJFF(this.LJI, viewGroup);
        ViewGroup viewGroup2 = this.LJI;
        if (viewGroup2 != null && !Intrinsics.LJFF(viewGroup2, viewGroup)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onDestroyView source:");
            sbLIZ2.append("onViewCreated_rootView_change");
            LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            LIZ();
        }
        this.LIZIZ = enumC937920aVy;
        this.LJI = viewGroup;
        if (!z && (!((ArrayList) this.LIZLLL).isEmpty())) {
            LJFF("initAnimationEngine return as root not change and calculatorList is not empty");
            Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
            while (it2.hasNext()) {
                ((C15BT) it2.next()).LIZIZ(enumC937920aVy);
            }
        } else {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.b4a);
            if (viewGroup3 != null) {
                LJ(enumC937920aVy, viewGroup3, new C15AH() { // from class: X.15AA
                    @Override // X.C15AH
                    public final <M extends InterfaceC20476615Am, T extends C15AJ<M>> T LIZ(EnumC20476415Ak enumC20476415Ak, ViewGroup viewGroup4, M m) {
                        T c204747159t;
                        switch (C20476315Aj.LIZ[enumC20476415Ak.ordinal()]) {
                            case 1:
                                c204747159t = new C204748159u(viewGroup4, m.getGeniusId(), true);
                                break;
                            case 2:
                                c204747159t = new C204749159v(viewGroup4, m.getGeniusId(), true);
                                break;
                            case 3:
                                c204747159t = new C204732159e(viewGroup4, m.getGeniusId(), true);
                                break;
                            case 4:
                                c204747159t = new C150L(viewGroup4, m.getGeniusId(), true);
                                break;
                            case 5:
                                c204747159t = new C204751159x(viewGroup4, m.getGeniusId());
                                break;
                            case 6:
                                c204747159t = new C204750159w(viewGroup4, m.getGeniusId(), true);
                                break;
                            case 7:
                                c204747159t = new C204747159t(viewGroup4, m.getGeniusId(), true);
                                break;
                            default:
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Unsupported genius type: ");
                                sbLIZ3.append(enumC20476415Ak);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        c204747159t.W(m);
                        return c204747159t;
                    }
                }, true);
            }
            ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.underground_mask);
            EnumC937920aVy enumC937920aVy2 = EnumC937920aVy.ANCHOR;
            if (enumC937920aVy == enumC937920aVy2 && C15BC.LIZ) {
                C500260Jjc.LJLJLJ(viewGroup3, false);
                C500260Jjc.LJLJLJ(viewGroup4, true);
            } else {
                C500260Jjc.LJLJLJ(viewGroup3, true);
                if (viewGroup4 != null) {
                    C12ES.LJIILL(4, viewGroup4);
                }
            }
            if (enumC937920aVy == enumC937920aVy2 && viewGroup4 != null) {
                LJ(enumC937920aVy, viewGroup4, new C15AH() { // from class: X.15A9
                    @Override // X.C15AH
                    public final <M extends InterfaceC20476615Am, T extends C15AJ<M>> T LIZ(EnumC20476415Ak enumC20476415Ak, ViewGroup viewGroup5, M m) {
                        T c204747159t;
                        C20475415Aa c20475415Aa;
                        C204746159s c204746159sLJI;
                        C15AO c15ao;
                        C20345714jH c20345714jH;
                        switch (C20476515Al.LIZ[enumC20476415Ak.ordinal()]) {
                            case 1:
                                c204747159t = new C204748159u(viewGroup5, m.getGeniusId(), false);
                                break;
                            case 2:
                                if ((m instanceof C20475415Aa) && (c204746159sLJI = (c20475415Aa = (C20475415Aa) m).LJI()) != null && (c15ao = c204746159sLJI.LIZ) != null && (c20345714jH = c15ao.LJIIIIZZ) != null && c20345714jH.LIZLLL != null) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("create LottieGeniusScreenShotView id:");
                                    sbLIZ3.append(c20475415Aa.LIZIZ);
                                    C20441214yg.LIZIZ("ScreenShotGeniusFactory", C2188811AlT.LIZIZ(sbLIZ3));
                                    c204747159t = new C204745159r(c20475415Aa.LIZIZ, viewGroup5);
                                } else {
                                    c204747159t = new C204749159v(viewGroup5, m.getGeniusId(), false);
                                }
                                break;
                            case 3:
                                c204747159t = new C204732159e(viewGroup5, m.getGeniusId(), false);
                                break;
                            case 4:
                                c204747159t = new C150L(viewGroup5, m.getGeniusId(), false);
                                break;
                            case 5:
                                c204747159t = new C204751159x(viewGroup5, m.getGeniusId());
                                break;
                            case 6:
                                c204747159t = new C204750159w(viewGroup5, m.getGeniusId(), false);
                                break;
                            case 7:
                                c204747159t = new C204747159t(viewGroup5, m.getGeniusId(), false);
                                break;
                            default:
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("Unsupported genius type: ");
                                sbLIZ4.append(enumC20476415Ak);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                        c204747159t.W(m);
                        return c204747159t;
                    }
                }, false);
            }
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.CQ2(GuestShowdownPlayerListUpdatedEvent.class, this, new C5183020f(this, 3));
        }
        EnumC937920aVy enumC937920aVy3 = EnumC937920aVy.AUDIENCE;
        if (enumC937920aVy == enumC937920aVy3) {
            InterfaceC938250aWV interfaceC938250aWVLIZIZ2 = LIZIZ();
            if (interfaceC938250aWVLIZIZ2 != null) {
                interfaceC938250aWVLIZIZ2.LJI((C945560aiI) this.LJFF.getValue());
            }
        } else {
            InterfaceC938250aWV interfaceC938250aWVLIZIZ3 = LIZIZ();
            if (interfaceC938250aWVLIZIZ3 != null) {
                interfaceC938250aWVLIZIZ3.LJII((C945560aiI) this.LJFF.getValue());
            }
        }
        GuestShowdownContent guestShowdownContent = this.LJIIIIZZ;
        if (guestShowdownContent == null) {
            InterfaceC938530aWx interfaceC938530aWxLIZ2 = C01IB.LIZ();
            if (interfaceC938530aWxLIZ2 != null) {
                guestShowdownContentLJI2 = interfaceC938530aWxLIZ2.LJI();
            }
        } else {
            guestShowdownContentLJI2 = guestShowdownContent;
        }
        if (guestShowdownContentLJI2 != null) {
            LJIIIIZZ(guestShowdownContentLJI2, "onViewCreated");
        }
        if (enumC937920aVy == enumC937920aVy3 && (interfaceC938250aWVLIZIZ = LIZIZ()) != null && (mapLJIIJ = interfaceC938250aWVLIZIZ.LJIIJ()) != null) {
            LJII("onViewCreated", mapLJIIJ);
        }
        if (MultiGuestV3ShowdownAnimationPerformanceOptSetting.INSTANCE.isEnable() && enumC937920aVy != EnumC937920aVy.ANCHOR) {
            this.LJIIJJI = C915980Zwa.LIZJ().registerAppEnterForeBackgroundCallback((C15BR) this.LJIIL.getValue());
        }
        InterfaceC938530aWx interfaceC938530aWxLIZ3 = C01IB.LIZ();
        if (interfaceC938530aWxLIZ3 != null && (viewGroupLIZIZ = interfaceC938530aWxLIZ3.LIZIZ()) != null) {
            LIZJ(viewGroupLIZIZ);
        }
    }

    public final void LJII(String str, Map map) {
        UserPlayInfo userPlayInfo;
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            UserPlayInfo userPlayInfo2 = (UserPlayInfo) entry.getValue();
            if (userPlayInfo2 != null && Integer.valueOf(userPlayInfo2.userTag) != null && ((userPlayInfo = (UserPlayInfo) entry.getValue()) == null || userPlayInfo.userTag != 0)) {
                List<GuestShowdownUser> listLJIIJ = LJIIJ(map);
                StringBuilder sb = new StringBuilder("onPlayerInfoMapChange source:");
                sb.append(str);
                sb.append(" list:");
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJ, 10));
                Iterator<GuestShowdownUser> it2 = listLJIIJ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().nickname);
                }
                sb.append(arrayList);
                LJFF(sb.toString());
                this.LJIIIZ = listLJIIJ;
                GuestShowdownContent guestShowdownContent = this.LJIIIIZZ;
                if (guestShowdownContent != null) {
                    List<GuestShowdownUser> list = guestShowdownContent.runningPlayUsers;
                    if (list.size() == listLJIIJ.size()) {
                        int i = 0;
                        for (GuestShowdownUser guestShowdownUser : list) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                if (Intrinsics.LJFF(ListProtector.get(listLJIIJ, i), guestShowdownUser)) {
                                    i = i2;
                                }
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        LJFF("guestShowdownContentUpdateByFanTicketUpdate not update");
                        return;
                    }
                    guestShowdownContent.runningPlayUsers.clear();
                    guestShowdownContent.runningPlayUsers.addAll(listLJIIJ);
                    for (C15BT c15bt : (ArrayList) this.LIZLLL) {
                        if (c15bt != null) {
                            c15bt.LIZJ(guestShowdownContent, "playerListUpdate", true);
                        }
                    }
                    return;
                }
                return;
            }
        }
        LJFF("onPlayInfoMapChanged return as usertag is all PLAY_USER_TAG_UNKNOWN");
    }

    public final void LJIIIIZZ(GuestShowdownContent guestShowdownContent, String str) {
        Integer numValueOf;
        Map<Long, UserPlayInfo> mapLJIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiveGuestShowdownContent guestShowdownContent.playStatus:");
        List listLJIIJ = null;
        if (guestShowdownContent != null) {
            numValueOf = Integer.valueOf(guestShowdownContent.playStatus);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        sbLIZ.append(" calculatorList:");
        sbLIZ.append(((ArrayList) this.LIZLLL).size());
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIIZZ = guestShowdownContent;
        if (guestShowdownContent != null) {
            if (this.LIZIZ == EnumC937920aVy.AUDIENCE && guestShowdownContent.runningPlayUsers.isEmpty()) {
                InterfaceC938250aWV interfaceC938250aWVLIZIZ = LIZIZ();
                if (interfaceC938250aWVLIZIZ != null && (mapLJIIJ = interfaceC938250aWVLIZIZ.LJIIJ()) != null) {
                    listLJIIJ = LJIIJ(mapLJIIJ);
                }
                if (this.LJIIIZ.isEmpty() && listLJIIJ != null) {
                    Iterator it2 = listLJIIJ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((GuestShowdownUser) next).userTag != 0) {
                            if (next != null) {
                                LJFF("insert guestshowdownList form fanticket");
                                guestShowdownContent.runningPlayUsers.addAll(listLJIIJ);
                            }
                        }
                    }
                }
            }
            Iterator it3 = ((ArrayList) this.LIZLLL).iterator();
            while (it3.hasNext()) {
                ((C15BT) it3.next()).LIZJ(guestShowdownContent, str, false);
            }
        }
    }

    public final void LJ(final EnumC937920aVy enumC937920aVy, final ViewGroup viewGroup, final C15AH c15ah, boolean z) {
        final C20476915Ap c20476915Ap;
        C15B8 c15b8;
        final C20475815Ae c20475815Ae = new C20475815Ae();
        if (z) {
            c20476915Ap = new C20476915Ap(viewGroup, c20475815Ae, c15ah);
        } else {
            c20476915Ap = new C20476915Ap(viewGroup, c20475815Ae, c15ah) { // from class: X.15As
                public final ViewGroup LJIIL;
                public final String LJIILIIL;

                @Override // X.C20476915Ap
                public final String LJIIIZ() {
                    return this.LJIILIIL;
                }

                {
                    super(viewGroup, c20475815Ae, c15ah);
                    this.LJIIL = viewGroup;
                    this.LJIILIIL = "ScreenShotAnimationExecutor";
                }
            };
        }
        if (z) {
            c15b8 = new C15B8(enumC937920aVy, this.LIZ, c20475815Ae, c20476915Ap, true);
        } else {
            final DataChannel dataChannel = this.LIZ;
            c15b8 = new C15B8(enumC937920aVy, dataChannel, c20475815Ae, c20476915Ap) { // from class: X.15BQ
                public ViewGroup LJJIFFI;
                public final String LJJII = "GuestShowdownScreenShotAnimationCalculator";

                @Override // X.C15B8
                public final boolean LJIIJJI() {
                    return (this.LJII == null || this.LJJIFFI == null) ? false : true;
                }

                @Override // X.C15B8
                public final String LJIIJ() {
                    return this.LJJII;
                }

                @Override // X.C15B8, X.C15BT
                public final void LIZ(ViewGroup viewGroup2) {
                    this.LJJIFFI = viewGroup2;
                    this.LJIIIIZZ = this.LJII;
                    LIZLLL();
                }
            };
        }
        ((ArrayList) c15b8.LJIILIIL).add(new C15BU() { // from class: X.15Au
            @Override // X.C15BU
            public final void LIZ(EnumC1153990g8T enumC1153990g8T, C20477515Av c20477515Av) {
                if (enumC1153990g8T == EnumC1153990g8T.CLEAR_AND_ADD_TO_QUEUE) {
                    C20476915Ap c20476915Ap2 = c20476915Ap;
                    List<InterfaceC20476615Am> list = c20477515Av.LJ;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<InterfaceC20476615Am> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getGeniusId());
                    }
                    c20476915Ap2.LIZLLL();
                } else if (enumC1153990g8T == EnumC1153990g8T.CANCEL_AND_ADD_TO_QUEUE) {
                    this.LJIIIZ(new AwS575S0100000_31(c20476915Ap, 7));
                } else if (enumC1153990g8T == EnumC1153990g8T.CLEAR_QUEUE) {
                    this.LJIIIZ(new AwS575S0100000_31(c20476915Ap, 8));
                    return;
                }
                this.LJIIIZ(new AwS432S0200000_31(c20476915Ap, c20477515Av, 0));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[onReceiveAnimationUpdate]type:");
                sbLIZ.append(enumC1153990g8T);
                sbLIZ.append(",animationGroup:");
                sbLIZ.append(c20477515Av);
                C2032807xm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        if (Intrinsics.LJFF(c15b8.LJII, viewGroup)) {
            C15B8.LJIIL(c15b8, "[onViewCreated] root is the same obj");
            c15b8.LJIILLIIL(true, false);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onViewCreated] root=");
            sbLIZ.append(viewGroup);
            C15B8.LJIIL(c15b8, C2188811AlT.LIZIZ(sbLIZ));
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
            viewGroup.removeAllViewsInLayout();
            if (Intrinsics.LJFF(c15b8.LJII, viewGroup)) {
                C15B8.LJIIL(c15b8, "[initView] but root is tha same obj");
            } else {
                c15b8.LJII = viewGroup;
            }
            c15b8.LJIILLIIL(true, false);
        }
        Pair pair = new Pair(c20476915Ap, c15b8);
        ((ArrayList) this.LIZJ).add(pair.getFirst());
        ((ArrayList) this.LIZLLL).add(pair.getSecond());
    }
}
