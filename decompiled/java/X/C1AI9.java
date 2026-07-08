package X;

import Y.AfS186S0100000_17;
import Y.AfS200S0100000_31;
import Y.AfS61S0110000_31;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.viewerwishes.api.ViewerWishesApi;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.ViewerPicksGiftPickReviewMessage;
import com.bytedance.android.livesdk.viewer_picks.model.GetSettingsResponse;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithStatus;
import com.bytedance.android.livesdk.viewer_picks.model.MUpsertGiftPickParams;
import com.bytedance.android.livesdk.viewer_picks.model.UpdateSettingsParams;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AI9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AI9 {
    public final C1AIP LIZ;
    public final DataChannel LIZIZ;
    public final C1AI6 LIZJ;
    public final long LIZLLL;
    public final IMessageManager LJ;
    public final long LJFF = System.currentTimeMillis();
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public long LJIILIIL;
    public List<String> LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public String LJIJ;
    public GetSettingsResponse.Data.TemplateBannerConfig LJIJI;
    public String LJIJJ;
    public AwS577S0100000_33 LJIJJLI;
    public List<C1AIE> LJIL;
    public List<GiftPickWithStatus> LJJ;
    public List<Gift> LJJI;
    public List<Long> LJJIFFI;
    public List<Long> LJJII;
    public boolean LJJIII;
    public final Map<String, String> LJJIIJ;
    public Set<Long> LJJIIJZLJL;
    public Set<Long> LJJIIZ;

    public final boolean LIZIZ() {
        List<GiftPickWithStatus> list = this.LJJ;
        if (list == null) {
            return false;
        }
        Iterator<GiftPickWithStatus> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().status == 4) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZJ() {
        List<GiftPickWithStatus> list = this.LJJ;
        if (list == null) {
            return true;
        }
        Iterator<GiftPickWithStatus> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().status != 3) {
                return false;
            }
        }
        return true;
    }

    public final List<Long> LIZLLL() {
        List<C1AIE> list = this.LJIL;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1AIE> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LIZIZ));
        }
        return arrayList;
    }

    public final void LJII() {
        C20441214yg.LIZIZ("ViewerWishesSettingPresenter", "handleLoadingTimeOut");
        List<GiftPickWithStatus> list = this.LJJ;
        if (list != null) {
            for (GiftPickWithStatus giftPickWithStatus : list) {
                if (giftPickWithStatus.status == 4) {
                    giftPickWithStatus.status = 2;
                }
            }
        }
        List<C1AIE> list2 = this.LJIL;
        if (list2 != null) {
            for (C1AIE c1aie : list2) {
                if (c1aie.LJII == 4) {
                    c1aie.LJII = 2;
                }
            }
        }
        this.LIZ.wG();
        this.LIZ.HO();
        this.LIZ.KM(false);
    }

    public final void LJIIJ() {
        GiftPick giftPick;
        String string;
        List<GiftPickWithStatus> list = this.LJJ;
        if (list != null) {
            for (GiftPickWithStatus giftPickWithStatus : list) {
                if (giftPickWithStatus.status == 2 && (giftPick = giftPickWithStatus.giftPick) != null) {
                    if (this.LJJIIJ.containsKey(String.valueOf(giftPick.giftId))) {
                        if (!Intrinsics.LJFF(((LinkedHashMap) this.LJJIIJ).get(String.valueOf(giftPick.giftId)), giftPick.customizedDesc)) {
                        }
                    }
                    this.LJJIIJ.put(String.valueOf(giftPick.giftId), giftPick.customizedDesc);
                    String strLIZIZ = C1AI1.LIZIZ(this.LIZJ);
                    GiftPick giftPick2 = giftPickWithStatus.giftPick;
                    if (giftPick2 == null || (string = Long.valueOf(giftPick2.giftId).toString()) == null) {
                        string = "";
                    }
                    C1AI2 c1ai2 = new C1AI2(null, null, strLIZIZ, null, null, null, null, 0L, 0L, null, null, null, null, null, string, null, giftPick.customizedDesc, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -81925, 2097151);
                    C1AI1.LIZ(c1ai2, this.LIZIZ, true);
                    if (C1AI0.LJFF()) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_set_error");
                        c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
                        c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
                        c474500IjALIZ.LJJII(c1ai2.LIZJ, "entrance");
                        c474500IjALIZ.LJJII(c1ai2.LJIILJJIL, "error_gift_id");
                        c474500IjALIZ.LJJII(c1ai2.LJIILLIIL, "error_gift_content");
                        Boolean bool = c1ai2.LJJIJIIJI;
                        c474500IjALIZ.LJJII(bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null, "is_campaign_anchor");
                        c474500IjALIZ.LIZ();
                    }
                }
            }
        }
    }

    public final void LJIIJJI() {
        ArrayList arrayList = new ArrayList();
        C11KS c11ksLJII = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.1AIN
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                final C1AI9 c1ai9 = this.LL;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                c1ai9.LJIIL(new InterfaceC1135130fe3() { // from class: X.1AIH
                    @Override // X.InterfaceC1135130fe3
                    public final void onSuccess() {
                        if (!c11kt.isDisposed()) {
                            c11kt.onSuccess("");
                        }
                        if (c1ai9.LIZIZ()) {
                            c1ai9.LIZ();
                        }
                    }

                    @Override // X.InterfaceC1135130fe3
                    public final void onFailed(int i) {
                        if (!c11kt.isDisposed()) {
                            c11kt.onError(new Throwable(""));
                            C1AI0.LJIJI(c1ai9.LJFF, Integer.valueOf(i), "settings", false);
                        }
                    }
                }, 0);
            }
        });
        arrayList.add(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0fe0
            /* JADX WARN: Type inference failed for: r0v0, types: [X.0fe2] */
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                long jLJJLIIIJ;
                final C1AI9 c1ai9 = this.LL;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                final ?? r0 = new InterfaceC1135130fe3() { // from class: X.0fe2
                    @Override // X.InterfaceC1135130fe3
                    public final void onSuccess() {
                        if (c11kt.isDisposed()) {
                            return;
                        }
                        c11kt.onSuccess("");
                    }

                    @Override // X.InterfaceC1135130fe3
                    public final void onFailed(int i) {
                        if (!c11kt.isDisposed()) {
                            c11kt.onError(new Throwable(""));
                            C1AI0.LJIJI(c1ai9.LJFF, Integer.valueOf(i), "gift_list", false);
                        }
                    }
                };
                c1ai9.getClass();
                AbstractC1132980faa abstractC1132980faa = new AbstractC1132980faa() { // from class: X.0fe1
                    @Override // X.AbstractC1132980faa
                    public final void LIZIZ(List<Gift> list) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onSyncGiftListFinish, gifts = ");
                        sbLIZ.append(list);
                        C20441214yg.LIZIZ("ViewerWishesSettingPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.AbstractC1132980faa
                    public final void LIZ(int i, String str) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onSyncGiftFailure, message = ");
                        sbLIZ.append(str);
                        C20441214yg.LIZIZ("ViewerWishesSettingPresenter", C2188811AlT.LIZIZ(sbLIZ));
                        r0.onFailed(i);
                    }

                    @Override // X.AbstractC1132980faa
                    public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
                        if (list != null) {
                            C1AI9 c1ai92 = c1ai9;
                            if (!list.isEmpty()) {
                                c1ai92.LJJI = ((GiftPage) ListProtector.get(list, 0)).gifts;
                            }
                        }
                        r0.onSuccess();
                        C20441214yg.LIZIZ("ViewerWishesSettingPresenter", "onSyncGiftPageListFinish");
                    }
                };
                C1129650fVD giftRepository = GiftManager.inst().getGiftRepository();
                DataChannel dataChannel = c1ai9.LIZIZ;
                if (dataChannel != null) {
                    jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
                } else {
                    jLJJLIIIJ = 0;
                }
                giftRepository.LJFF(24, jLJJLIIIJ, true, abstractC1132980faa, "");
            }
        }));
        arrayList.add(c11ksLJII);
        AbstractC19484711Kz.LJJIL(arrayList, new InterfaceC1487280oo2() { // from class: X.0frg
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return 0;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<Object>() { // from class: X.1AIO
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                this.LL.LIZ.LLJJIJIIJIL();
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(Object obj) {
                this.LL.LIZ.LJIJJLI();
                C1AI9 c1ai9 = this.LL;
                c1ai9.LIZ.KM(c1ai9.LIZJ());
                C1AI9.LJIIIIZZ(this.LL, false, false, 6);
                C1AI0.LJIJI(this.LL.LJFF, null, null, true);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1AIB, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retryTNS, enterFrom = ");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ("ViewerWishesSettingPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LIZJ.LIZ) {
            C500260Jjc.LJJJJJ(this.LIZ.getLifecycleOwner(), null, new C862860Xt6(20, this, null), 3);
            return;
        }
        ?? r2 = new OnIMMessageListener() { // from class: X.1AIB
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "ViewerWishesSettingPresenter";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.ASYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                IMessageManager iMessageManager;
                Long lValueOf;
                if ((iMessage instanceof ViewerPicksGiftPickReviewMessage) && this.LL.LJ != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("pollingSettingsList on message, ");
                    ViewerPicksGiftPickReviewMessage viewerPicksGiftPickReviewMessage = (ViewerPicksGiftPickReviewMessage) iMessage;
                    sbLIZ2.append(viewerPicksGiftPickReviewMessage.status);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(viewerPicksGiftPickReviewMessage.rejectReason);
                    C20441214yg.LIZIZ("ViewerWishesSettingPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                    List<C1AIE> list = this.LL.LJIL;
                    if (list != null) {
                        for (C1AIE c1aie : list) {
                            GiftPick giftPick = viewerPicksGiftPickReviewMessage.giftPick;
                            if (giftPick != null && c1aie.LIZIZ == giftPick.giftId) {
                                c1aie.LJII = viewerPicksGiftPickReviewMessage.status;
                                c1aie.LJI = viewerPicksGiftPickReviewMessage.rejectReason;
                            }
                        }
                    }
                    List<GiftPickWithStatus> list2 = this.LL.LJJ;
                    if (list2 != null) {
                        for (GiftPickWithStatus giftPickWithStatus : list2) {
                            GiftPick giftPick2 = giftPickWithStatus.giftPick;
                            if (giftPick2 != null) {
                                Long lValueOf2 = Long.valueOf(giftPick2.giftId);
                                GiftPick giftPick3 = viewerPicksGiftPickReviewMessage.giftPick;
                                if (giftPick3 != null) {
                                    lValueOf = Long.valueOf(giftPick3.giftId);
                                } else {
                                    lValueOf = null;
                                }
                                if (Intrinsics.LJFF(lValueOf2, lValueOf)) {
                                    giftPickWithStatus.status = viewerPicksGiftPickReviewMessage.status;
                                    giftPickWithStatus.rejectReason = viewerPicksGiftPickReviewMessage.rejectReason;
                                }
                            }
                        }
                    }
                    boolean zLIZJ = this.LL.LIZJ();
                    this.LL.LIZ.wG();
                    this.LL.LIZ.KM(zLIZJ);
                    C1AI9.LJIIIIZZ(this.LL, false, false, 7);
                    if (!zLIZJ) {
                        this.LL.LJIIJ();
                    }
                    if (!this.LL.LIZIZ() && (iMessageManager = this.LL.LJ) != null) {
                        iMessageManager.removeMessageListener((OnIMMessageListener) this);
                    }
                }
            }
        };
        C500260Jjc.LJJJJJ(this.LIZ.getLifecycleOwner(), null, new C862870Xt7(this, r2, null), 3);
        IMessageManager iMessageManager = this.LJ;
        if (iMessageManager != 0) {
            iMessageManager.addMessageListener(C001A.VIEWER_PICKS_GIFT_PICK_REVIEW_MESSAGE.getIntType(), (OnIMMessageListener) r2);
        }
    }

    public static String LJFF(String str) {
        if (Intrinsics.LJFF(str, "custom_add")) {
            return "custom_add";
        }
        return "inspiration_mkt_edit";
    }

    public static MUpsertGiftPickParams.UpsertGiftPick LJI(C1AIE c1aie) {
        int i;
        MUpsertGiftPickParams.UpsertGiftPick upsertGiftPick = new MUpsertGiftPickParams.UpsertGiftPick();
        upsertGiftPick.giftPickId = c1aie.LIZ;
        upsertGiftPick.giftId = c1aie.LIZIZ;
        upsertGiftPick.customizedDesc = c1aie.LJFF;
        upsertGiftPick.contentSource = c1aie.LJIIJJI;
        upsertGiftPick.isPriorityRequest = c1aie.LJIILJJIL;
        if (c1aie.LJIILL) {
            i = 2;
        } else {
            i = 1;
        }
        upsertGiftPick.descSource = i;
        return upsertGiftPick;
    }

    public static GiftPickWithStatus LJIILIIL(C1AIM c1aim) {
        String str;
        ImageModel imageModel;
        long j;
        GiftPickWithStatus giftPickWithStatus = new GiftPickWithStatus();
        GiftPick giftPick = new GiftPick();
        Gift giftFindGiftById = GiftManager.inst().findGiftById(c1aim.LIZJ);
        if (giftFindGiftById == null || (str = giftFindGiftById.name) == null) {
            str = "";
        }
        giftPickWithStatus.giftName = str;
        if (giftFindGiftById != null) {
            imageModel = giftFindGiftById.image;
        } else {
            imageModel = null;
        }
        giftPick.giftIcon = imageModel;
        if (giftFindGiftById != null) {
            j = giftFindGiftById.diamondCount;
        } else {
            j = 0;
        }
        giftPick.giftPrice = j;
        giftPick.giftPickId = c1aim.LIZIZ;
        giftPick.giftId = c1aim.LIZJ;
        giftPick.customizedDesc = c1aim.LIZLLL;
        giftPick.isPriorityRequest = c1aim.LJFF;
        giftPick.descSource = 2;
        giftPickWithStatus.giftPick = giftPick;
        giftPickWithStatus.contentSource = c1aim.LJ;
        return giftPickWithStatus;
    }

    public static C1AIE LJIILJJIL(C1AIM c1aim) {
        String str;
        ImageModel imageModel;
        int i;
        C1AIE c1aie = new C1AIE();
        Gift giftFindGiftById = GiftManager.inst().findGiftById(c1aim.LIZJ);
        if (giftFindGiftById == null || (str = giftFindGiftById.name) == null) {
            str = "";
        }
        c1aie.LIZLLL = str;
        if (giftFindGiftById != null) {
            imageModel = giftFindGiftById.image;
        } else {
            imageModel = null;
        }
        c1aie.LJ = imageModel;
        if (giftFindGiftById != null) {
            i = giftFindGiftById.diamondCount;
        } else {
            i = 0;
        }
        c1aie.LIZJ = i;
        c1aie.LJFF = c1aim.LIZLLL;
        c1aie.LIZ = c1aim.LIZIZ;
        c1aie.LIZIZ = c1aim.LIZJ;
        c1aie.LJIIJJI = c1aim.LJ;
        c1aie.LJIILJJIL = c1aim.LJFF;
        c1aie.LJIILL = c1aim.LJI;
        return c1aie;
    }

    public static C1AIE LJIILL(GiftPickWithStatus giftPickWithStatus) {
        String str;
        ImageModel imageModel;
        long j;
        int i;
        C1AIE c1aie = new C1AIE();
        c1aie.LIZLLL = giftPickWithStatus.giftName;
        GiftPick giftPick = giftPickWithStatus.giftPick;
        if (giftPick == null || (str = giftPick.customizedDesc) == null) {
            str = "";
        }
        c1aie.LJFF = str;
        if (giftPick != null) {
            imageModel = giftPick.giftIcon;
        } else {
            imageModel = null;
        }
        c1aie.LJ = imageModel;
        long j2 = 0;
        if (giftPick != null) {
            j = giftPick.giftPickId;
        } else {
            j = 0;
        }
        c1aie.LIZ = j;
        if (giftPick != null) {
            j2 = giftPick.giftId;
        }
        c1aie.LIZIZ = j2;
        c1aie.LJI = giftPickWithStatus.rejectReason;
        c1aie.LJII = giftPickWithStatus.status;
        boolean z = false;
        if (giftPick != null) {
            i = (int) giftPick.giftPrice;
        } else {
            i = 0;
        }
        c1aie.LIZJ = i;
        c1aie.LJIIJJI = giftPickWithStatus.contentSource;
        if (giftPick != null) {
            z = giftPick.isPriorityRequest;
        }
        c1aie.LJIILJJIL = z;
        return c1aie;
    }

    public final void LJ(int i) {
        List<C1AIE> list;
        List<GiftPickWithStatus> list2;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        if (!this.LJJIII && i >= 0 && (list = this.LJIL) != null && i < list.size() && (list2 = this.LJJ) != null && i < list2.size()) {
            this.LJJIII = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteItem, index = ");
            sbLIZ.append(i);
            sbLIZ.append(", viewerWishesItems.size = ");
            List<C1AIE> list3 = this.LJIL;
            Integer numValueOf4 = null;
            if (list3 != null) {
                numValueOf = Integer.valueOf(list3.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", giftPickWithStatusList.size = ");
            List<GiftPickWithStatus> list4 = this.LJJ;
            if (list4 != null) {
                numValueOf2 = Integer.valueOf(list4.size());
            } else {
                numValueOf2 = null;
            }
            sbLIZ.append(numValueOf2);
            C20441214yg.LIZIZ("ViewerWishesSettingPresenter", C2188811AlT.LIZIZ(sbLIZ));
            List<GiftPickWithStatus> list5 = this.LJJ;
            if (list5 != null) {
                ListProtector.remove(list5, i);
            }
            List<C1AIE> list6 = this.LJIL;
            if (list6 != null) {
                ListProtector.remove(list6, i);
            }
            this.LJIJ = "";
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("deleteItem, viewerWishesItems.size = ");
            List<C1AIE> list7 = this.LJIL;
            if (list7 != null) {
                numValueOf3 = Integer.valueOf(list7.size());
            } else {
                numValueOf3 = null;
            }
            sbLIZ2.append(numValueOf3);
            sbLIZ2.append(", giftPickWithStatusList.size = ");
            List<GiftPickWithStatus> list8 = this.LJJ;
            if (list8 != null) {
                numValueOf4 = Integer.valueOf(list8.size());
            }
            sbLIZ2.append(numValueOf4);
            C20441214yg.LIZIZ("ViewerWishesSettingPresenter", C2188811AlT.LIZIZ(sbLIZ2));
            LJIJJLI(this, false, true, false, 12);
        }
    }

    public final void LJIIIZ(C1AII c1aii) {
        List<C1AIM> list;
        if (c1aii != null && (list = c1aii.LIZJ) != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty() && c1aii.LIZLLL <= 0) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(LJIILIIL((C1AIM) it2.next()));
            }
            this.LJJ = new ArrayList(arrayList2);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(LJIILJJIL((C1AIM) it3.next()));
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            this.LJIL = arrayList4;
            LJIJ(4, -2L, c1aii.LIZLLL, c1aii.LJ, arrayList4);
        }
    }

    public final void LJIIL(final InterfaceC1135130fe3 interfaceC1135130fe3, final int i) {
        String strLIZIZ;
        C20441214yg.LIZIZ("ViewerWishesSettingPresenter", "requestSettingsList");
        if (this.LJJ == null) {
            strLIZIZ = C1AI1.LIZIZ(this.LIZJ);
        } else {
            strLIZIZ = "";
        }
        C480460Ism.LIZ().getClass();
        ((ViewerWishesApi) C480460Ism.LIZLLL(ViewerWishesApi.class)).getViewerWishesSettings(strLIZIZ).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.1AID
            @Override // X.C09JN
            public final void accept(Object obj) {
                GetSettingsResponse.Data data;
                C1C7U.LIZ("ViewerWishesSettingsPresenter@547f.requestSettingsList$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (data = (GetSettingsResponse.Data) baseResponse.data) != null) {
                    this.LL.LJIILLIIL(data, true);
                    if (!this.LL.LIZJ()) {
                        this.LL.LJIIJ();
                    }
                    if (i > 0 && this.LL.LIZIZ()) {
                        C1AI9 c1ai9 = this.LL;
                        int i2 = i - 1;
                        if (i2 <= 0) {
                            c1ai9.LJII();
                        } else {
                            C500260Jjc.LJJJJJ(c1ai9.LIZ.getLifecycleOwner(), null, new C862860Xt6(i2, c1ai9, null), 3);
                        }
                    }
                    InterfaceC1135130fe3 interfaceC1135130fe32 = interfaceC1135130fe3;
                    if (interfaceC1135130fe32 != null) {
                        interfaceC1135130fe32.onSuccess();
                    }
                } else {
                    InterfaceC1135130fe3 interfaceC1135130fe33 = interfaceC1135130fe3;
                    if (interfaceC1135130fe33 != null) {
                        interfaceC1135130fe33.onFailed(2);
                    }
                }
                C1C7U.LIZIZ("ViewerWishesSettingsPresenter@547f.requestSettingsList$1");
            }
        }, new AfS186S0100000_17(interfaceC1135130fe3, 139));
    }

    public final void LJIILLIIL(GetSettingsResponse.Data data, boolean z) {
        ArrayList arrayList;
        AwS577S0100000_33 awS577S0100000_33;
        String str;
        List<GiftPickWithStatus> list = data.giftPickList;
        this.LJJ = list;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<GiftPickWithStatus> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(LJIILL(it2.next()));
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        this.LJIL = arrayList;
        boolean zLJIJJ = LJIJJ(data.roundDurationSec / ((long) 60), data.hasScore, data.enableAutoRestart, data.autoStart);
        this.LJIIZILJ = data.importedTemplateId;
        this.LJIJ = data.importedTemplateName;
        if (z) {
            this.LJIIJJI = data.musicCampaignEnded;
            boolean z2 = data.activeInMusicCampaign;
            this.LJIIJ = z2;
            C1AI0.LIZJ = Boolean.valueOf(z2);
            this.LIZJ.LJFF = data.settingName;
            GetSettingsResponse.Data.PlatformConfig platformConfig = data.platformConfig;
            if (platformConfig != null) {
                long j = platformConfig.maxGiftPicksCount;
                if (j > 0) {
                    this.LJIILIIL = j;
                }
                this.LJIILJJIL = platformConfig.recommendedPerformanceNames;
                this.LJIILL = platformConfig.recommendPriorityRequestGiftPrice;
                this.LJIILLIIL = platformConfig.recommendedPriorityRequestGiftId;
            }
            this.LJIJI = data.templateBannerConfig;
            this.LJIIL = data.campaignInfo;
            GetSettingsResponse.Data.TaxonomyTagInfo taxonomyTagInfo = data.taxonomyTagInfo;
            if (taxonomyTagInfo == null || (str = taxonomyTagInfo.level2Tag) == null) {
                str = "";
            }
            this.LJIJJ = str;
        }
        if (zLJIJJ && (awS577S0100000_33 = this.LJIJJLI) != null) {
            awS577S0100000_33.invoke();
        }
    }

    public C1AI9(C1AI6 c1ai6, ViewerWishesSettingsPage viewerWishesSettingsPage, DataChannel dataChannel) {
        long id;
        IMessageManager iMessageManager;
        Room room;
        this.LIZ = viewerWishesSettingsPage;
        this.LIZIZ = dataChannel;
        this.LIZJ = c1ai6;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LIZLLL = id;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LJ = iMessageManager;
        this.LJIIJJI = true;
        this.LJIIL = "";
        this.LJIILIIL = 6L;
        this.LJIILJJIL = C13BV.INSTANCE;
        this.LJIJ = "";
        this.LJIJJ = "";
        this.LJJIIJ = new LinkedHashMap();
        C08CX c08cx = C08CX.INSTANCE;
        this.LJJIIJZLJL = c08cx;
        this.LJJIIZ = c08cx;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C1AI9 r11, boolean r12, boolean r13, int r14) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AI9.LJIIIIZZ(X.1AI9, boolean, boolean, int):void");
    }

    public final boolean LJIJJ(long j, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (this.LJI == z && this.LJII == z2 && this.LJIIIIZZ == z3 && this.LJIIIZ == j) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = j;
        return z4;
    }

    public static void LJIJJLI(final C1AI9 c1ai9, final boolean z, boolean z2, boolean z3, int i) {
        final boolean z4 = z3;
        final boolean z5 = z2;
        boolean z6 = false;
        if ((i & 2) != 0) {
            z5 = false;
        }
        if ((i & 4) != 0) {
            z4 = false;
        }
        final long j = 0;
        c1ai9.LIZ.Oa();
        UpdateSettingsParams updateSettingsParams = new UpdateSettingsParams();
        updateSettingsParams.hasScore = c1ai9.LJI;
        updateSettingsParams.enableAutoRestart = c1ai9.LJII;
        long j2 = c1ai9.LJIIIZ;
        if (j2 > 0) {
            z6 = true;
        }
        updateSettingsParams.hasDuration = z6;
        updateSettingsParams.autoStart = c1ai9.LJIIIIZZ;
        updateSettingsParams.roundDurationSec = j2 * ((long) 60);
        updateSettingsParams.clickedConfirm = z;
        ArrayList arrayList = new ArrayList();
        List<GiftPickWithStatus> list = c1ai9.LJJ;
        if (list != null) {
            Iterator<GiftPickWithStatus> it2 = list.iterator();
            while (it2.hasNext()) {
                GiftPick giftPick = it2.next().giftPick;
                if (giftPick != null) {
                    arrayList.add(Long.valueOf(giftPick.giftId));
                }
            }
        }
        updateSettingsParams.giftIds = arrayList;
        C480460Ism.LIZ().getClass();
        ((ViewerWishesApi) C480460Ism.LIZLLL(ViewerWishesApi.class)).updateViewerWishesPicksSettings(updateSettingsParams).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.1AIF
            @Override // X.C09JN
            public final void accept(Object obj) {
                GetSettingsResponse.Data data;
                C1C7U.LIZ("ViewerWishesSettingsPresenter@547f.updateViewerWishesSettingsForServer$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null) {
                    data = (GetSettingsResponse.Data) baseResponse.data;
                } else {
                    data = null;
                }
                if (data != null) {
                    this.LL.LJIILLIIL(data, false);
                    if (!z) {
                        this.LL.LIZ.w6(j);
                        boolean zLIZJ = this.LL.LIZJ();
                        this.LL.LIZ.KM(zLIZJ);
                        if (z5) {
                            this.LL.LIZ.lF();
                        } else if (!z4) {
                            C1AI9.LJIIIIZZ(this.LL, false, false, 7);
                            if (this.LL.LIZIZ()) {
                                this.LL.LIZ();
                            }
                            if (!zLIZJ) {
                                this.LL.LJIIJ();
                            }
                        }
                    }
                }
                this.LL.LJJIII = false;
                C1C7U.LIZIZ("ViewerWishesSettingsPresenter@547f.updateViewerWishesSettingsForServer$2");
            }
        }, new AfS200S0100000_31(c1ai9, 39));
    }

    public final void LJIJ(int i, long j, long j2, String str, List list) {
        int i2 = 1;
        if (i != 1 && i != 3) {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJI((C1AIE) it2.next()));
        }
        LJIIZILJ(arrayList, i, i2, j, j2, str);
    }

    public final void LJIIZILJ(final List list, final int i, int i2, final long j, long j2, String str) {
        this.LIZ.Oa();
        this.LJIJ = str;
        this.LJIIZILJ = j2;
        MUpsertGiftPickParams mUpsertGiftPickParams = new MUpsertGiftPickParams();
        mUpsertGiftPickParams.upsertGiftPicks = list;
        mUpsertGiftPickParams.roomId = this.LIZLLL;
        mUpsertGiftPickParams.replace = false;
        mUpsertGiftPickParams.upsertType = i;
        mUpsertGiftPickParams.addToPlace = i2;
        mUpsertGiftPickParams.templateId = j2;
        mUpsertGiftPickParams.templateName = str;
        C480460Ism.LIZ().getClass();
        ((ViewerWishesApi) C480460Ism.LIZLLL(ViewerWishesApi.class)).updateViewerWishesGiftPick(mUpsertGiftPickParams).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.1AIC
            /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.String r7 = "ViewerWishesSettingsPresenter@547f.updateGiftPicks$1"
                    X.C1C7U.LIZ(r7)
                    com.bytedance.android.live.network.response.BaseResponse r15 = (com.bytedance.android.live.network.response.BaseResponse) r15
                    T r4 = r15.data
                    r3 = 0
                    if (r4 == 0) goto L9f
                    X.1AI9 r8 = r14.LL
                    com.bytedance.android.livesdk.viewer_picks.model.MUpsertGiftPickResponse$Data r4 = (com.bytedance.android.livesdk.viewer_picks.model.MUpsertGiftPickResponse.Data) r4
                    r8.getClass()
                    java.util.List<com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithStatus> r0 = r4.giftPickList
                    r8.LJJ = r0
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.List<com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithStatus> r0 = r4.giftPickList
                    java.util.Iterator r1 = r0.iterator()
                L22:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L36
                    java.lang.Object r0 = r1.next()
                    com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithStatus r0 = (com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithStatus) r0
                    X.1AIE r0 = X.C1AI9.LJIILL(r0)
                    r2.add(r0)
                    goto L22
                L36:
                    r8.LJIL = r2
                    com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksUserSettings r0 = r4.settings
                    if (r0 == 0) goto L55
                    boolean r11 = r0.hasScore
                    boolean r12 = r0.enableAutoRestart
                    boolean r13 = r0.autoStart
                    long r9 = r0.roundDurationSec
                    r0 = 60
                    long r0 = (long) r0
                    long r9 = r9 / r0
                    boolean r0 = r8.LJIJJ(r9, r11, r12, r13)
                    if (r0 == 0) goto L55
                    kotlin.jvm.internal.AwS577S0100000_33 r0 = r8.LJIJJLI
                    if (r0 == 0) goto L55
                    r0.invoke()
                L55:
                    X.1AI9 r0 = r14.LL
                    X.1AIP r0 = r0.LIZ
                    r0.wG()
                    X.1AI9 r0 = r14.LL
                    X.1AIP r2 = r0.LIZ
                    long r0 = r2
                    r2.w6(r0)
                    X.1AI9 r0 = r14.LL
                    boolean r6 = r0.LIZJ()
                    X.1AI9 r0 = r14.LL
                    X.1AIP r0 = r0.LIZ
                    r0.KM(r6)
                    java.util.List<com.bytedance.android.livesdk.viewer_picks.model.MUpsertGiftPickParams$UpsertGiftPick> r1 = r4
                    boolean r0 = r1 instanceof java.util.Collection
                    r5 = 1
                    if (r0 == 0) goto La9
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto La9
                L7f:
                    r4 = 1
                L80:
                    X.1AI9 r2 = r14.LL
                    int r1 = r5
                    r0 = 4
                    if (r1 != r0) goto La7
                    r0 = 1
                L88:
                    X.C1AI9.LJIIIIZZ(r2, r0, r4, r5)
                    if (r6 != 0) goto L92
                    X.1AI9 r0 = r14.LL
                    r0.LJIIJ()
                L92:
                    X.1AI9 r0 = r14.LL
                    boolean r0 = r0.LIZIZ()
                    if (r0 == 0) goto L9f
                    X.1AI9 r0 = r14.LL
                    r0.LIZ()
                L9f:
                    X.1AI9 r0 = r14.LL
                    r0.LJJIII = r3
                    X.C1C7U.LIZIZ(r7)
                    return
                La7:
                    r0 = 0
                    goto L88
                La9:
                    java.util.Iterator r2 = r1.iterator()
                Lad:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L7f
                    java.lang.Object r0 = r2.next()
                    com.bytedance.android.livesdk.viewer_picks.model.MUpsertGiftPickParams$UpsertGiftPick r0 = (com.bytedance.android.livesdk.viewer_picks.model.MUpsertGiftPickParams.UpsertGiftPick) r0
                    int r1 = r0.descSource
                    r0 = 2
                    if (r1 == r0) goto Lad
                    r4 = 0
                    goto L80
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1AIC.accept(java.lang.Object):void");
            }
        }, new AfS61S0110000_31(this, 1));
    }
}
