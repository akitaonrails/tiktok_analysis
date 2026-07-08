package X;

import Y.AfS143S0200000_7;
import Y.AfS1S0000100_7;
import Y.AfS2S0200100_7;
import Y.AkS323S0200000_7;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.EmoteCopywritingInfo;
import com.bytedance.android.livesdk.chatroom.api.PrivateEmoteDetail;
import com.bytedance.android.livesdk.chatroom.api.SubPackageEmote;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel;
import com.bytedance.android.livesdk.dataChannel.SuggestOwnEmoteList;
import com.bytedance.android.livesdk.livesetting.subscription.LivePublicScreenEmoteLoadResilienceSetting;
import com.bytedance.android.livesdk.subscription.SubscribeApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import emotes.model.EmoteListResult;
import emotes.model.SubEmoteDetailResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KBS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBS {
    public static boolean LIZIZ;
    public static String LIZJ;
    public static final List<SubPackageEmote> LJIIIZ;
    public static final Set<String> LJIIJ;
    public static C11JF LJIIJJI;
    public static boolean LJIIL;
    public static List<EmoteModel> LJIILIIL;
    public static final List<EmoteModel> LJIILJJIL;
    public static final List<EmoteModel> LJIILL;
    public static EmoteCopywritingInfo LJIILLIIL;
    public static boolean LJIIZILJ;
    public static boolean LJIJ;
    public static C11NJ LJIJI;
    public static BPEAHandler LJIJJ;
    public static final C0KBS LIZ = new C0KBS();
    public static final HashMap<String, Integer> LIZLLL = new HashMap<>();
    public static final List<EmoteModel> LJ = new ArrayList();
    public static final Map<String, EmoteModel> LJFF = new LinkedHashMap();
    public static final ArrayList<String> LJI = new ArrayList<>();
    public static final HashMap<String, List<String>> LJII = new HashMap<>();
    public static final HashMap<String, C0KBY> LJIIIIZZ = new HashMap<>();

    static {
        new LinkedHashMap();
        LJIIIZ = new ArrayList();
        LJIIJ = new LinkedHashSet();
        LJIILIIL = new ArrayList();
        LJIILJJIL = new ArrayList();
        LJIILL = new ArrayList();
        LJIJI = new C11NJ();
    }

    public static boolean LIZIZ() {
        Room room;
        User owner;
        return (!LJIIZILJ || (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) == null || (owner = room.getOwner()) == null || owner.fansClubInfo == null) ? false : true;
    }

    public static C1110510f0L LIZ(int i, String str) {
        return new C1110510f0L(LJ(i, str), LJIILJJIL, LJIILL, LJIILLIIL);
    }

    public static String LIZJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List LJ(int i, String str) {
        if (i == -1) {
            return LJ;
        }
        List<String> list = LJII.get(LIZJ(i, str));
        if (list == null) {
            return LJ;
        }
        List<EmoteModel> list2 = LJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list2) {
            if (list.contains(((EmoteModel) obj).emoteId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (Intrinsics.LJFF(((EmoteModel) next).emoteId, str2)) {
                        if (next != null) {
                            arrayList2.add(next);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = (ArrayList) LJIILJJIL;
        arrayList3.clear();
        ((ArrayList) LJIILL).clear();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((EmoteModel) obj2).emoteScene == 2) {
                arrayList4.add(obj2);
            }
        }
        arrayList3.addAll(arrayList4);
        List<EmoteModel> list3 = LJIILL;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((EmoteModel) obj3).emoteScene == 3) {
                arrayList5.add(obj3);
            }
        }
        ((ArrayList) list3).addAll(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList2) {
            int i2 = ((EmoteModel) obj4).emoteScene;
            if (i2 != 2 && i2 != 3) {
                arrayList6.add(obj4);
            }
        }
        return arrayList6;
    }

    public static final void LJIIJ(int i, String str) {
        LJIIIIZZ.put(LIZJ(i, str), C0KBY.WAIT_UPDATE);
    }

    public static void LJIIJJI(C0KB2 c0kb2, String str) {
        User owner;
        List<EmoteModel> list = c0kb2.LIZIZ;
        if (list != null && str != null) {
            LJIIL = c0kb2.LIZJ;
            LJIILIIL = list;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room != null && (owner = room.getOwner()) != null && LJIIL) {
                owner.getIdStr();
                dataChannelGlobal.HQ2(SuggestOwnEmoteList.class, new C513290KBb(LJIILIIL));
            }
        }
    }

    public static void LJII(EmoteModel emoteModel, Resources resources, InterfaceC1631620sYq interfaceC1631620sYq) {
        boolean z;
        Drawable drawable;
        Map<String, EmoteModel> map = LJFF;
        if (map.containsKey(emoteModel.emoteId)) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            EmoteModel emoteModel2 = (EmoteModel) linkedHashMap.get(emoteModel.emoteId);
            Drawable drawable2 = null;
            if (emoteModel2 != null && emoteModel2.emoteResource != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("-------- get bitmap from cache --emoteModelMap contains=");
                boolean z2 = true;
                sbLIZ.append(!map.containsKey(emoteModel.emoteId));
                sbLIZ.append("; if contain, emote resource=");
                EmoteModel emoteModel3 = (EmoteModel) linkedHashMap.get(emoteModel.emoteId);
                if (emoteModel3 != null) {
                    drawable2 = emoteModel3.emoteResource;
                }
                if (drawable2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(' ');
                Logger.i("sticker_lyp", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("has bitmap = ");
                if (emoteModel.emoteResource == null) {
                    z2 = false;
                }
                sbLIZ2.append(z2);
                sbLIZ2.append(" --- ");
                sbLIZ2.append(emoteModel.emoteId);
                sbLIZ2.append(" = ");
                sbLIZ2.append((String) ListProtector.get(C842240X2g.LIZ(emoteModel.image), 0));
                Logger.i("sticker_lyp", C2188811AlT.LIZIZ(sbLIZ2));
                EmoteModel emoteModel4 = (EmoteModel) linkedHashMap.get(emoteModel.emoteId);
                if (emoteModel4 != null && (drawable = emoteModel4.emoteResource) != null) {
                    emoteModel.emoteResource = drawable;
                    interfaceC1631620sYq.invoke(emoteModel, "", 2);
                    return;
                }
                return;
            }
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = C1121670fIL.LJ(emoteModel.image).LJJJJZI(new AkS323S0200000_7(emoteModel, resources, 10)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS143S0200000_7((Object) emoteModel, (EmoteModel) interfaceC1631620sYq, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 44), new AfS2S0200100_7(System.currentTimeMillis(), interfaceC1631620sYq, emoteModel, 16));
        C11NJ c11nj = LJIJI;
        if (c11nj == null) {
            return;
        }
        c11nj.LIZ(interfaceC420801kMLJJLL);
    }

    public static void LJIIIIZZ(final String str, boolean z, long j, long j2) {
        boolean z2;
        final String secUid;
        User owner;
        User owner2;
        final String strLIZJ = LIZJ(0, str);
        HashMap<String, C0KBY> map = LJIIIIZZ;
        if (!map.containsKey(strLIZJ)) {
            map.put(strLIZJ, C0KBY.UNINITIALIZED);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if ((room == null || (owner2 = room.getOwner()) == null || !owner2.isAnchorHasSubQualification()) && !LIZIZ()) {
            z2 = false;
        } else {
            z2 = true;
        }
        LIZIZ = z2;
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null && (owner = room2.getOwner()) != null) {
            secUid = owner.getSecUid();
        } else {
            secUid = null;
        }
        if (LIZIZ && !TextUtils.isEmpty(secUid)) {
            C0KBY c0kby = map.get(strLIZJ);
            if (c0kby == null) {
                c0kby = C0KBY.UNINITIALIZED;
            }
            C0KBY c0kby2 = C0KBY.LOADING;
            if (c0kby == c0kby2) {
                return;
            }
            if (c0kby == C0KBY.LOAD_SUCCESS) {
                dataChannelGlobal.HQ2(EmoteBaseInformationListChannel.class, LIZ(0, str));
                dataChannelGlobal.HQ2(EmoteBitmapListChannel.class, LIZ(0, str));
                return;
            }
            LIZJ = secUid;
            C11O8 c11o8LIZLLL = LIZLLL(j, j2, str, strLIZJ, z, LJIIZILJ);
            map.put(strLIZJ, c0kby2);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC420801kM interfaceC420801kMLJJLL = c11o8LIZLLL.LJJLL(new C09JN() { // from class: X.0KBT
                public final /* synthetic */ int LL = 0;

                @Override // X.C09JN
                public final void accept(Object obj) {
                    boolean z3;
                    C1C7U.LIZ("EmotesCommentLazyDispatcher@2531.preFetchEmoteModel$1");
                    C0KB2 c0kb2 = (C0KB2) obj;
                    List<EmoteModel> list = c0kb2.LIZ;
                    ArrayList<EmoteModel> arrayList = new ArrayList();
                    for (EmoteModel emoteModel : list) {
                        EmoteModel emoteModel2 = emoteModel;
                        Map<String, EmoteModel> map2 = C0KBS.LJFF;
                        if (map2.containsKey(emoteModel2.emoteId)) {
                            EmoteModel emoteModel3 = (EmoteModel) ((LinkedHashMap) map2).get(emoteModel2.emoteId);
                            if (emoteModel3 == null || emoteModel3.emoteResource == null) {
                            }
                        }
                        arrayList.add(emoteModel);
                    }
                    for (EmoteModel emoteModel4 : arrayList) {
                        Map<String, EmoteModel> map3 = C0KBS.LJFF;
                        if (map3.containsKey(emoteModel4.emoteId)) {
                            List<EmoteModel> list2 = C0KBS.LJ;
                            C19719512Dh.LIZ(list2).remove(((LinkedHashMap) map3).get(emoteModel4.emoteId));
                        }
                        ((ArrayList) C0KBS.LJ).add(emoteModel4);
                    }
                    DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                    C0KBS c0kbs = C0KBS.LIZ;
                    dataChannelGlobal2.HQ2(EmoteBitmapListChannel.class, C0KBS.LIZ(this.LL, str));
                    dataChannelGlobal2.HQ2(EmoteBaseInformationListChannel.class, C0KBS.LIZ(this.LL, str));
                    C0KBS.LJIIIIZZ.put(strLIZJ, C0KBY.LOAD_SUCCESS);
                    for (EmoteModel emoteModel5 : (ArrayList) C0KBS.LJ(this.LL, str)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(emoteModel5.emoteId);
                        sbLIZ.append(" = ");
                        sbLIZ.append((String) ListProtector.get(C842240X2g.LIZ(emoteModel5.image), 0));
                        sbLIZ.append(" = ");
                        if (emoteModel5.emoteResource != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        sbLIZ.append(z3);
                        Logger.i("sticker_lyp", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C0KBS c0kbs2 = C0KBS.LIZ;
                    C0KBS.LJIIJJI(c0kb2, secUid);
                    C1C7U.LIZIZ("EmotesCommentLazyDispatcher@2531.preFetchEmoteModel$1");
                }
            }, new C09JN() { // from class: X.0KBa
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("EmotesCommentLazyDispatcher@2531.preFetchEmoteModel$2");
                    C0KBS.LJIIIIZZ.put(strLIZJ, C0KBY.LOAD_FAILED);
                    C510380Jzw.LJIJ(jCurrentTimeMillis, (Throwable) obj);
                    C1C7U.LIZIZ("EmotesCommentLazyDispatcher@2531.preFetchEmoteModel$2");
                }
            });
            C11NJ c11nj = LJIJI;
            if (c11nj != null) {
                c11nj.LIZ(interfaceC420801kMLJJLL);
            }
        }
    }

    public static void LJFF(final Resources resources, final String str, boolean z, long j, long j2) {
        User owner;
        User owner2;
        User owner3;
        C11JF c11jf = LJIIJJI;
        final String secUid = null;
        boolean z2 = true;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        boolean zIsAnchorHasSubQualification = false;
        final String strLIZJ = LIZJ(0, str);
        HashMap<String, C0KBY> map = LJIIIIZZ;
        if (!map.containsKey(strLIZJ)) {
            map.put(strLIZJ, C0KBY.UNINITIALIZED);
        }
        if (LJIJ) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if ((room == null || (owner3 = room.getOwner()) == null || !owner3.isAnchorHasSubQualification()) && !LIZIZ()) {
                z2 = false;
            }
            LIZIZ = z2;
        } else {
            Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room2 != null && (owner = room2.getOwner()) != null) {
                zIsAnchorHasSubQualification = owner.isAnchorHasSubQualification();
            }
            LIZIZ = zIsAnchorHasSubQualification;
        }
        Room room3 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room3 != null && (owner2 = room3.getOwner()) != null) {
            secUid = owner2.getSecUid();
        }
        if (LIZIZ && !TextUtils.isEmpty(secUid)) {
            LJIIJJI = (C11JF) LIZLLL(j, j2, str, strLIZJ, z, LJIIZILJ).LJJLL(new C09JN() { // from class: X.0KBV
                public final /* synthetic */ int LLILLL = 0;
                public final /* synthetic */ LifecycleOwner LLILZLL = null;

                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("EmotesCommentLazyDispatcher@2531.loadAllEmotesListForPermission$2");
                    C0KB2 c0kb2 = (C0KB2) obj;
                    List<EmoteModel> list = c0kb2.LIZ;
                    String str2 = strLIZJ;
                    int i = this.LLILLL;
                    String str3 = str;
                    Resources resources2 = resources;
                    ArrayList arrayList = new ArrayList();
                    for (EmoteModel emoteModel : list) {
                        if (true ^ C0KBS.LJFF.containsKey(emoteModel.emoteId)) {
                            arrayList.add(emoteModel);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        if (!list.isEmpty()) {
                            for (EmoteModel emoteModel2 : list) {
                                if (((LinkedHashMap) C0KBS.LJFF).get(emoteModel2.emoteId) == null) {
                                    Iterator<EmoteModel> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        C0KBS.LJI.add(it2.next().emoteId);
                                    }
                                }
                            }
                            C0KBS.LJIIIIZZ.put(str2, C0KBY.LOAD_SUCCESS);
                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                            C0KBS c0kbs = C0KBS.LIZ;
                            dataChannelGlobal.HQ2(EmoteBitmapListChannel.class, C0KBS.LIZ(i, str3));
                            dataChannelGlobal.HQ2(EmoteBaseInformationListChannel.class, C0KBS.LIZ(i, str3));
                        } else {
                            C0KBS.LJIIIIZZ.put(str2, C0KBY.LOAD_SUCCESS);
                            DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
                            C0KBS c0kbs2 = C0KBS.LIZ;
                            dataChannelGlobal2.HQ2(EmoteBitmapListChannel.class, C0KBS.LIZ(i, str3));
                            dataChannelGlobal2.HQ2(EmoteBaseInformationListChannel.class, C0KBS.LIZ(i, str3));
                        }
                    } else {
                        C0KBS c0kbs3 = C0KBS.LIZ;
                        C0KBS c0kbs4 = C0KBS.LIZ;
                        C0KBS.LJI(arrayList, resources2, true, i, str3, "live_room_sub_emote_input_page", null);
                    }
                    C0KBS c0kbs5 = C0KBS.LIZ;
                    C0KBS.LJIIJJI(c0kb2, secUid);
                    C1C7U.LIZIZ("EmotesCommentLazyDispatcher@2531.loadAllEmotesListForPermission$2");
                }
            }, new AfS1S0000100_7(System.currentTimeMillis(), 3));
        }
    }

    public static C11O8 LIZLLL(final long j, long j2, String str, final String str2, final boolean z, boolean z2) {
        String str3;
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(354);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get sub emote packageId=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTier", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        SubscribeApi subscribeApi = (SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class);
        String str4 = LIZJ;
        Long lValueOf = Long.valueOf(j2);
        if (z2) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C11NZ<C470590Icr<SubEmoteDetailResult>> emotesDetail = subscribeApi.getEmotesDetail(false, str4, 0, str, lValueOf, str3);
        EnumC510330Jzr enumC510330Jzr = EnumC510330Jzr.EMOTE;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("display_type", String.valueOf(0));
        return C510380Jzw.LJIILJJIL(emotesDetail, enumC510330Jzr, "emote", null, linkedHashMap, aFwS237S0000000_7).LJJIL(new C521960KdW(aFwS237S0000000_7, 5)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0KB0
            public final /* synthetic */ int LL = 0;

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                boolean z3;
                EmoteCopywritingInfo emoteCopywritingInfo;
                Room room;
                User owner;
                EmoteListResult emoteListResult;
                List<EmoteModel> emoteList;
                PrivateEmoteDetail privateEmoteDetail;
                List<EmoteModel> list;
                List<SubPackageEmote> list2;
                List<EmoteModel> emoteList2;
                Room room2;
                User owner2;
                EmoteListResult emoteListResult2;
                List<EmoteModel> emoteList3;
                PrivateEmoteDetail privateEmoteDetail2;
                List<EmoteModel> list3;
                List<SubPackageEmote> list4;
                List<EmoteModel> emoteList4;
                BaseResponse baseResponse = (BaseResponse) obj;
                C0KBS c0kbs = C0KBS.LIZ;
                int i = this.LL;
                boolean z4 = z;
                String str5 = str2;
                long j3 = j;
                SubEmoteDetailResult subEmoteDetailResult = (SubEmoteDetailResult) baseResponse.data;
                if (subEmoteDetailResult.suggestEmotesSwitch == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                EmoteConfig emoteConfig = subEmoteDetailResult.getEmoteConfig();
                if (emoteConfig != null) {
                    emoteCopywritingInfo = emoteConfig.copywritingInfo;
                } else {
                    emoteCopywritingInfo = null;
                }
                C0KBS.LJIILLIIL = emoteCopywritingInfo;
                if (z3) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    if (z4 && (list4 = ((SubEmoteDetailResult) baseResponse.data).packageEmoteList) != null && (!list4.isEmpty())) {
                        List<SubPackageEmote> list5 = ((SubEmoteDetailResult) baseResponse.data).packageEmoteList;
                        if (list5 != null) {
                            Iterator<SubPackageEmote> it2 = list5.iterator();
                            while (it2.hasNext()) {
                                EmoteListResult emoteListResult3 = it2.next().emoteDetail;
                                if (emoteListResult3 == null || (emoteList4 = emoteListResult3.getEmoteList()) == null) {
                                    emoteList4 = C13BV.INSTANCE;
                                }
                                for (EmoteModel emoteModel : emoteList4) {
                                    if (C497250Jel.LIZIZ(emoteModel, j3)) {
                                        arrayList.add(emoteModel);
                                    } else if (C497250Jel.LIZ(emoteModel, j3)) {
                                        arrayList2.add(emoteModel);
                                    } else {
                                        arrayList3.add(emoteModel);
                                    }
                                }
                            }
                        }
                    } else {
                        T t = baseResponse.data;
                        if (t != 0 && ((SubEmoteDetailResult) t).getStableEmoteDetail() != null && ((SubEmoteDetailResult) baseResponse.data).getStableEmoteDetail().getEmoteList() != null) {
                            for (EmoteModel emoteModel2 : ((SubEmoteDetailResult) baseResponse.data).getStableEmoteDetail().getEmoteList()) {
                                if (C497250Jel.LIZIZ(emoteModel2, j3)) {
                                    arrayList.add(emoteModel2);
                                } else if (C497250Jel.LIZ(emoteModel2, j3)) {
                                    arrayList2.add(emoteModel2);
                                } else {
                                    arrayList3.add(emoteModel2);
                                }
                            }
                        }
                    }
                    T t2 = baseResponse.data;
                    if (t2 != 0 && ((SubEmoteDetailResult) t2).getEmoteConfig() != null) {
                        for (EmoteModel emoteModel3 : ((SubEmoteDetailResult) baseResponse.data).getEmoteConfig().defaultEmoteList) {
                            if (C497250Jel.LIZIZ(emoteModel3, j3)) {
                                arrayList.add(emoteModel3);
                            } else if (C497250Jel.LIZ(emoteModel3, j3)) {
                                arrayList2.add(emoteModel3);
                            } else {
                                arrayList3.add(emoteModel3);
                            }
                        }
                        if (!C0KPJ.Ge.LIZIZ().booleanValue()) {
                            DataChannelGlobal.LLILZ.JQ2(C930980aKm.class, ((SubEmoteDetailResult) baseResponse.data).getEmoteConfig().locatedEmoteId);
                        }
                    }
                    SubEmoteDetailResult subEmoteDetailResult2 = (SubEmoteDetailResult) baseResponse.data;
                    if (subEmoteDetailResult2 != null && (privateEmoteDetail2 = subEmoteDetailResult2.privateEmoteDetail) != null && (list3 = privateEmoteDetail2.emoteList) != null) {
                        for (EmoteModel emoteModel4 : list3) {
                            if (C497250Jel.LIZIZ(emoteModel4, j3)) {
                                arrayList.add(emoteModel4);
                            } else if (C497250Jel.LIZ(emoteModel4, j3)) {
                                arrayList2.add(emoteModel4);
                            } else {
                                arrayList3.add(emoteModel4);
                            }
                        }
                    }
                    if (!z4 && (room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null && (owner2 = room2.getOwner()) != null && !owner2.isSubscribed() && i == 0 && (emoteListResult2 = ((SubEmoteDetailResult) baseResponse.data).highestSubWaveStrikeCustomEmote) != null && (emoteList3 = emoteListResult2.getEmoteList()) != null) {
                        for (EmoteModel emoteModel5 : emoteList3) {
                            if (C497250Jel.LIZIZ(emoteModel5, j3)) {
                                arrayList.add(emoteModel5);
                            } else if (C497250Jel.LIZ(emoteModel5, j3)) {
                                arrayList2.add(emoteModel5);
                            } else {
                                arrayList3.add(emoteModel5);
                            }
                        }
                    }
                    if (arrayList.size() > 1) {
                        C08XD.LJJ(arrayList, new C512401z8(72));
                    }
                    if (arrayList2.size() > 1) {
                        C08XD.LJJ(arrayList2, new C512401z8(73));
                    }
                    arrayList4.addAll(C0KB1.LIZ(((SubEmoteDetailResult) baseResponse.data).fansEmoteDetail));
                    arrayList5.addAll(C0KB1.LIZIZ(((SubEmoteDetailResult) baseResponse.data).superFanEmoteDetail));
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList);
                    arrayList7.addAll(arrayList2);
                    arrayList7.addAll(arrayList3);
                    arrayList7.addAll(arrayList4);
                    arrayList7.addAll(arrayList5);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj2 : arrayList7) {
                        if (hashSet.add(((EmoteModel) obj2).emoteId)) {
                            arrayList8.add(obj2);
                        }
                    }
                    arrayList6.addAll(arrayList8);
                    HashMap<String, List<String>> map = C0KBS.LJII;
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj3 : arrayList6) {
                        if (hashSet2.add(((EmoteModel) obj3).emoteId)) {
                            arrayList9.add(obj3);
                        }
                    }
                    ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(arrayList9, 10));
                    Iterator it3 = arrayList9.iterator();
                    while (it3.hasNext()) {
                        arrayList10.add(((EmoteModel) it3.next()).emoteId);
                    }
                    map.put(str5, arrayList10);
                    List<SubPackageEmote> list6 = ((SubEmoteDetailResult) baseResponse.data).packageEmoteList;
                    if (list6 != null) {
                        ArrayList arrayList11 = (ArrayList) C0KBS.LJIIIZ;
                        arrayList11.clear();
                        arrayList11.addAll(list6);
                    }
                    return new C0KB2(arrayList6, arrayList, true);
                }
                ArrayList arrayList12 = new ArrayList();
                if (z4 && (list2 = ((SubEmoteDetailResult) baseResponse.data).packageEmoteList) != null && (!list2.isEmpty())) {
                    List<SubPackageEmote> list7 = ((SubEmoteDetailResult) baseResponse.data).packageEmoteList;
                    if (list7 != null) {
                        Iterator<SubPackageEmote> it4 = list7.iterator();
                        while (it4.hasNext()) {
                            EmoteListResult emoteListResult4 = it4.next().emoteDetail;
                            if (emoteListResult4 == null || (emoteList2 = emoteListResult4.getEmoteList()) == null) {
                                emoteList2 = C13BV.INSTANCE;
                            }
                            Iterator<EmoteModel> it5 = emoteList2.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(it5.next());
                            }
                        }
                    }
                } else {
                    T t3 = baseResponse.data;
                    if (t3 != 0 && ((SubEmoteDetailResult) t3).getStableEmoteDetail() != null && ((SubEmoteDetailResult) baseResponse.data).getStableEmoteDetail().getEmoteList() != null) {
                        Iterator<EmoteModel> it6 = ((SubEmoteDetailResult) baseResponse.data).getStableEmoteDetail().getEmoteList().iterator();
                        while (it6.hasNext()) {
                            arrayList12.add(it6.next());
                        }
                    }
                }
                T t4 = baseResponse.data;
                if (t4 != 0 && ((SubEmoteDetailResult) t4).getEmoteConfig() != null) {
                    List<EmoteModel> list8 = ((SubEmoteDetailResult) baseResponse.data).getEmoteConfig().defaultEmoteList;
                    if (list8 != null) {
                        Iterator<EmoteModel> it7 = list8.iterator();
                        while (it7.hasNext()) {
                            arrayList12.add(it7.next());
                        }
                    }
                    if (!C0KPJ.Ge.LIZIZ().booleanValue()) {
                        DataChannelGlobal.LLILZ.JQ2(C930980aKm.class, ((SubEmoteDetailResult) baseResponse.data).getEmoteConfig().locatedEmoteId);
                    }
                }
                SubEmoteDetailResult subEmoteDetailResult3 = (SubEmoteDetailResult) baseResponse.data;
                if (subEmoteDetailResult3 != null && (privateEmoteDetail = subEmoteDetailResult3.privateEmoteDetail) != null && (list = privateEmoteDetail.emoteList) != null) {
                    Iterator<EmoteModel> it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList12.add(it8.next());
                    }
                }
                List listLIZ = C0KB1.LIZ(((SubEmoteDetailResult) baseResponse.data).fansEmoteDetail);
                List listLIZIZ = C0KB1.LIZIZ(((SubEmoteDetailResult) baseResponse.data).superFanEmoteDetail);
                arrayList12.addAll(listLIZ);
                arrayList12.addAll(listLIZIZ);
                if (!z4 && (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null && (owner = room.getOwner()) != null && !owner.isSubscribed() && i == 0 && (emoteListResult = ((SubEmoteDetailResult) baseResponse.data).highestSubWaveStrikeCustomEmote) != null && (emoteList = emoteListResult.getEmoteList()) != null) {
                    arrayList12.addAll(emoteList);
                }
                HashMap<String, List<String>> map2 = C0KBS.LJII;
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList13 = new ArrayList();
                for (Object obj4 : arrayList12) {
                    if (hashSet3.add(((EmoteModel) obj4).emoteId)) {
                        arrayList13.add(obj4);
                    }
                }
                ArrayList arrayList14 = new ArrayList(C15438062q.LJIJJ(arrayList13, 10));
                Iterator it9 = arrayList13.iterator();
                while (it9.hasNext()) {
                    arrayList14.add(((EmoteModel) it9.next()).emoteId);
                }
                map2.put(str5, arrayList14);
                List<SubPackageEmote> list9 = ((SubEmoteDetailResult) baseResponse.data).packageEmoteList;
                if (list9 != null) {
                    ArrayList arrayList15 = (ArrayList) C0KBS.LJIIIZ;
                    arrayList15.clear();
                    arrayList15.addAll(list9);
                }
                ArrayList arrayList16 = new ArrayList();
                HashSet hashSet4 = new HashSet();
                ArrayList arrayList17 = new ArrayList();
                for (Object obj5 : arrayList12) {
                    if (hashSet4.add(((EmoteModel) obj5).emoteId)) {
                        arrayList17.add(obj5);
                    }
                }
                arrayList16.addAll(arrayList17);
                return new C0KB2(arrayList16, null, false);
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public static void LJIIIZ(Throwable th, String str, Function0 function0, StringBuilder sb, long j, long j2) {
        int errorCode;
        if (th != null) {
            if (function0 != null) {
                function0.invoke();
            }
            C510380Jzw.LJIJ(j, th);
            String string = th.toString();
            if (th instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) th;
                errorCode = c501470JlZ.getErrorCode();
                string = c501470JlZ.getErrorMsg();
            } else if (th instanceof C1811850xFX) {
                C1811850xFX c1811850xFX = (C1811850xFX) th;
                errorCode = c1811850xFX.statusCode;
                string = c1811850xFX.getMessage();
                if (string == null) {
                    string = "";
                }
            } else {
                errorCode = 10001;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_emote_load");
            c474500IjALIZ.LJJII(Integer.valueOf(errorCode), "err_code");
            c474500IjALIZ.LJJII(string, "error_detail");
            c474500IjALIZ.LJJII(1, "hit_cache_type");
            c474500IjALIZ.LJJII(Long.valueOf(SystemClock.currentThreadTimeMillis() - j2), "cost");
            c474500IjALIZ.LJJII(str, "show_entrance");
            c474500IjALIZ.LJJII(sb, "emote_id");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LJI(List list, Resources resources, final boolean z, final int i, final String str, final String str2, final Function0 function0) {
        int i2;
        if (list.isEmpty()) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        final String strLIZJ = LIZJ(i, str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        final boolean value = LivePublicScreenEmoteLoadResilienceSetting.INSTANCE.getValue();
        ArrayList<EmoteModel> arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            EmoteModel emoteModel = (EmoteModel) next;
            Map<String, EmoteModel> map = LJFF;
            if (map.containsKey(emoteModel.emoteId)) {
                EmoteModel emoteModel2 = (EmoteModel) ((LinkedHashMap) map).get(emoteModel.emoteId);
                if (emoteModel2 == null || emoteModel2.emoteResource == null) {
                }
            }
            if (!value || !LJIIJ.contains(emoteModel.emoteId)) {
                arrayList3.add(next);
            }
        }
        for (final EmoteModel emoteModel3 : arrayList3) {
            Map<String, EmoteModel> map2 = LJFF;
            if (map2.containsKey(emoteModel3.emoteId)) {
                C19719512Dh.LIZ(LJ).remove(((LinkedHashMap) map2).get(emoteModel3.emoteId));
                map2.remove(emoteModel3.emoteId);
            }
            ((ArrayList) LJ).add(emoteModel3);
            map2.put(emoteModel3.emoteId, emoteModel3);
            arrayList2.add(emoteModel3);
            C11J7 c11j7LJJJJZI = C1121670fIL.LJ(emoteModel3.image).LJJJJZI(new AkS323S0200000_7(emoteModel3, emoteModel3, resources, 11));
            if (value) {
                c11j7LJJJJZI = c11j7LJJJJZI.LJJL(new InterfaceC1487280oo2() { // from class: X.0KBZ
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        String str3 = emoteModel3.emoteId;
                        if (str3 != null) {
                            C0KBS.LJIIJ.add(str3);
                        }
                        C0KBS c0kbs = C0KBS.LIZ;
                        String str4 = str2;
                        String str5 = emoteModel3.emoteId;
                        if (str5 == null) {
                            str5 = "";
                        }
                        C0KBS.LJIIIZ(th, str4, null, new StringBuilder(str5), jCurrentTimeMillis, jCurrentThreadTimeMillis);
                        return C11IR.LL;
                    }
                });
            }
            arrayList.add(c11j7LJJJJZI);
        }
        if (arrayList.isEmpty()) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("");
        Iterator it3 = arrayList2.iterator();
        while (true) {
            int i3 = i2;
            if (it3.hasNext()) {
                Object next2 = it3.next();
                i2++;
                if (i3 >= 0) {
                    sb.append(((EmoteModel) next2).emoteId);
                    if (i3 != arrayList2.size() - 1) {
                        sb.append(",");
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                InterfaceC420801kM interfaceC420801kMLJJZ = C11NZ.LJJJLIIL(arrayList).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C09JN() { // from class: X.00NA
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("EmotesCommentLazyDispatcher@2531.loadEmoteResource$3");
                        C1C7U.LIZIZ("EmotesCommentLazyDispatcher@2531.loadEmoteResource$3");
                    }
                }, new C09JN() { // from class: X.0KBW
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("EmotesCommentLazyDispatcher@2531.loadEmoteResource$4");
                        Throwable th = (Throwable) obj;
                        if (value) {
                            Function0<Unit> function02 = function0;
                            if (function02 != null) {
                                function02.invoke();
                            }
                            C0KBS c0kbs = C0KBS.LIZ;
                            final int i4 = i;
                            final String str3 = str;
                            if (C0KBS.LJIJJ == null) {
                                C0KBS.LJIJJ = new BPEAHandler(Looper.getMainLooper());
                            }
                            BPEAHandler bPEAHandler = C0KBS.LJIJJ;
                            if (bPEAHandler != null) {
                                C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0KBX
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("EmotesCommentLazyDispatcher@2531.postReconcileChannel$1");
                                        try {
                                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                                            C0KBS c0kbs2 = C0KBS.LIZ;
                                            dataChannelGlobal.HQ2(EmoteBitmapListChannel.class, new C1110510f0L(C0KBS.LJ(i4, str3), C0KBS.LJIILJJIL, C0KBS.LJIILL, null));
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("EmotesCommentLazyDispatcher@2531.postReconcileChannel$1");
                                    }
                                });
                            }
                        } else {
                            C0KBS c0kbs2 = C0KBS.LIZ;
                            C0KBS.LJIIIZ(th, str2, function0, sb, jCurrentTimeMillis, jCurrentThreadTimeMillis);
                        }
                        C1C7U.LIZIZ("EmotesCommentLazyDispatcher@2531.loadEmoteResource$4");
                    }
                }, new InterfaceC781210Ukh() { // from class: X.0KBU
                    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
                    @Override // X.InterfaceC781210Ukh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r7 = this;
                            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1
                            if (r0 == 0) goto L7
                            r0.invoke()
                        L7:
                            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = X.C0KBS.LIZLLL
                            boolean r0 = r3.isEmpty()
                            r6 = 1
                            r0 = r0 ^ 1
                            if (r0 == 0) goto L21
                            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteModel> r2 = X.C0KBS.LJ
                            Y.AComparatorS26S0000000_7 r1 = new Y.AComparatorS26S0000000_7
                            r0 = 9
                            r1.<init>(r0)
                            X.C13LP.LJLLLL(r1, r2)
                            r3.clear()
                        L21:
                            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r3 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
                            java.lang.Class<com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel> r2 = com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel.class
                            X.0KBS r0 = X.C0KBS.LIZ
                            int r1 = r2
                            java.lang.String r0 = r3
                            X.0f0L r0 = X.C0KBS.LIZ(r1, r0)
                            r3.HQ2(r2, r0)
                            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteModel> r0 = X.C0KBS.LJ
                            java.util.HashSet r2 = new java.util.HashSet
                            r2.<init>()
                            java.util.ArrayList r0 = (java.util.ArrayList) r0
                            java.util.Iterator r1 = r0.iterator()
                        L3f:
                            boolean r0 = r1.hasNext()
                            if (r0 == 0) goto L51
                            java.lang.Object r0 = r1.next()
                            com.bytedance.android.live.base.model.emoji.EmoteModel r0 = (com.bytedance.android.live.base.model.emoji.EmoteModel) r0
                            java.lang.String r0 = r0.emoteId
                            r2.add(r0)
                            goto L3f
                        L51:
                            boolean r0 = r4
                            r5 = 0
                            if (r0 != 0) goto L66
                            java.util.ArrayList<java.lang.String> r1 = X.C0KBS.LJI
                            boolean r0 = r1.isEmpty()
                            r0 = r0 ^ 1
                            if (r0 == 0) goto L85
                            boolean r0 = r2.containsAll(r1)
                            if (r0 == 0) goto L85
                        L66:
                            java.util.ArrayList<java.lang.String> r0 = X.C0KBS.LJI
                            r0.clear()
                            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r3 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
                            java.lang.Class<com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel> r2 = com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel.class
                            X.0KBS r0 = X.C0KBS.LIZ
                            int r1 = r2
                            java.lang.String r0 = r3
                            X.0f0L r0 = X.C0KBS.LIZ(r1, r0)
                            r3.HQ2(r2, r0)
                            java.util.HashMap<java.lang.String, X.0KBY> r2 = X.C0KBS.LJIIIIZZ
                            java.lang.String r1 = r5
                            X.0KBY r0 = X.C0KBY.LOAD_SUCCESS
                            r2.put(r1, r0)
                        L85:
                            java.lang.String r0 = "livesdk_sub_emote_load"
                            X.0IjA r4 = X.C0IJT.LIZ(r0)
                            java.lang.String r1 = "err_code"
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                            r4.LJJII(r0, r1)
                            java.lang.String r1 = "error_detail"
                            java.lang.String r0 = ""
                            r4.LJJII(r0, r1)
                            java.lang.String r1 = "hit_cache_type"
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                            r4.LJJII(r0, r1)
                            long r2 = android.os.SystemClock.currentThreadTimeMillis()
                            long r0 = r6
                            long r2 = r2 - r0
                            java.lang.Long r1 = java.lang.Long.valueOf(r2)
                            java.lang.String r0 = "cost"
                            r4.LJJII(r1, r0)
                            java.lang.String r1 = "show_entrance"
                            java.lang.String r0 = r8
                            r4.LJJII(r0, r1)
                            java.lang.String r1 = "emote_id"
                            java.lang.StringBuilder r0 = r9
                            r4.LJJII(r0, r1)
                            r4.LIZ()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0KBU.run():void");
                    }
                });
                C11NJ c11nj = LJIJI;
                if (c11nj != null) {
                    c11nj.LIZ(interfaceC420801kMLJJZ);
                    return;
                }
                return;
            }
        }
    }
}
