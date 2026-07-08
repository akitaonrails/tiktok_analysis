package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.LiveInviteGuestSelectedChannel;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.HasPreInviteGuestModuleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.PreviewMgGuideInviteUidListChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.social.model.BatchInviteGuestReq;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.tool.helper.MultiGuestUtil$batchInviteGuest$1", f = "MultiGuestUtil.kt", l = {1554}, m = "invokeSuspend")
public final class C932200aMk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;

    public C932200aMk(InterfaceC1364105Vn<? super C932200aMk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C932200aMk(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        int i;
        boolean z;
        C418801k2 c418801k2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<User> list;
        List<User> list2;
        List list3;
        Object objBatchInviteGuest = obj;
        C1C7U.LIZ("MultiGuestUtil@525a.batchInviteGuest$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    List list4 = (List) this.LL;
                    C155000ia.LIZIZ(objBatchInviteGuest);
                    list3 = list4;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objBatchInviteGuest);
                ArrayList arrayList3 = new ArrayList();
                C0J9U c0j9u = (C0J9U) DataChannelGlobal.LLILZ.gg0(LiveInviteGuestSelectedChannel.class);
                BatchInviteGuestReq batchInviteGuestReq = new BatchInviteGuestReq();
                batchInviteGuestReq.source = "MULTI_GUEST_INVITE_FROM_GO_LIVE_PAGE";
                Long lLJIIJ = C930540aK4.LJIIJ();
                if (lLJIIJ != null) {
                    batchInviteGuestReq.roomId = lLJIIJ.longValue();
                    batchInviteGuestReq.channelId = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
                    C930480aJy.LIZ.getClass();
                    batchInviteGuestReq.anchorId = C930480aJy.LJIIIZ();
                    if (c0j9u != null && (list2 = c0j9u.LIZIZ) != null) {
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        for (User user : list2) {
                            BatchInviteGuestReq.InviteUser inviteUser = new BatchInviteGuestReq.InviteUser();
                            inviteUser.userId = user.getId();
                            inviteUser.inviteUserType = 2;
                            arrayList4.add(inviteUser);
                        }
                        arrayList = new ArrayList(arrayList4);
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (c0j9u != null && (list = c0j9u.LIZJ) != null) {
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (User user2 : list) {
                            BatchInviteGuestReq.InviteUser inviteUser2 = new BatchInviteGuestReq.InviteUser();
                            inviteUser2.userId = user2.getId();
                            inviteUser2.inviteUserType = 1;
                            arrayList5.add(inviteUser2);
                        }
                        arrayList2 = new ArrayList(arrayList5);
                    } else {
                        arrayList2 = new ArrayList();
                    }
                    arrayList3.addAll(arrayList);
                    arrayList3.addAll(arrayList2);
                    batchInviteGuestReq.inviteUsers = arrayList3;
                    C480460Ism.LIZ().getClass();
                    MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
                    this.LL = arrayList3;
                    this.LLILLJJLI = 1;
                    objBatchInviteGuest = multiLiveApi.batchInviteGuest(batchInviteGuestReq, this);
                    list3 = arrayList3;
                    if (objBatchInviteGuest == objLJFF) {
                        C1C7U.LIZIZ("MultiGuestUtil@525a.batchInviteGuest$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MultiGuestUtil@525a.batchInviteGuest$1");
                    return unit;
                }
            }
            c098200Yq = (C470590Icr) objBatchInviteGuest;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            C13BV c13bv = C13BV.INSTANCE;
            dataChannelGlobal.HQ2(LiveInviteGuestSelectedChannel.class, new C0J9U(c13bv, c13bv, c13bv));
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList6.add(C2286608xc.LJFF(((BatchInviteGuestReq.InviteUser) it2.next()).userId));
            }
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                long jLongValue = ((Number) it3.next()).longValue();
                LinkControlDataHolder linkControlDataHolder = (LinkControlDataHolder) C948450amx.LIZIZ.LJIIJJI("LINK_CONTROL_DATA_HOLDER");
                if (linkControlDataHolder != null) {
                    Boolean.valueOf(linkControlDataHolder.LIZ(jLongValue));
                }
            }
            DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
            if (Intrinsics.LJFF(dataChannelGlobal2.gg0(HasPreInviteGuestModuleChannel.class), false)) {
                C930480aJy.LIZ.getClass();
                List list5 = (List) dataChannelGlobal2.gg0(PreviewMgGuideInviteUidListChannel.class);
                if (list5 != null && !list5.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && (c418801k2 = (C418801k2) C13LP.LJJJLL(list5)) != null) {
                    if (list5.size() == 1) {
                        C766270U4b.LJII(2131854375, c418801k2.LIZIZ);
                    } else if (list5.size() > 1) {
                        C766270U4b.LJII(2131854376, c418801k2.LIZIZ);
                    }
                }
            }
            C20441214yg.LIZIZ("MultiGuestUtil", "batchInviteGuest success");
            C930480aJy.LIZ.getClass();
            dataChannelGlobal2.HQ2(HasPreInviteGuestModuleChannel.class, Boolean.FALSE);
            dataChannelGlobal2.HQ2(PreviewMgGuideInviteUidListChannel.class, C13BV.INSTANCE);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            DataChannelGlobal dataChannelGlobal3 = DataChannelGlobal.LLILZ;
            C13BV c13bv2 = C13BV.INSTANCE;
            dataChannelGlobal3.HQ2(LiveInviteGuestSelectedChannel.class, new C0J9U(c13bv2, c13bv2, c13bv2));
            C20441214yg.LJFF("MultiGuestUtil", "batchInviteGuest error,", thM5exceptionOrNullimpl);
            C766270U4b.LIZLLL(2131854374);
            C930480aJy.LIZ.getClass();
            dataChannelGlobal3.HQ2(HasPreInviteGuestModuleChannel.class, Boolean.FALSE);
            dataChannelGlobal3.HQ2(PreviewMgGuideInviteUidListChannel.class, c13bv2);
        }
        int i3 = 0;
        for (Object obj2 : list3) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                BatchInviteGuestReq.InviteUser inviteUser3 = (BatchInviteGuestReq.InviteUser) obj2;
                long j = inviteUser3.userId;
                List listLIZJ = C932140aMe.LIZJ(j);
                List listLIZLLL = C932140aMe.LIZLLL(j);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("source", "multiguest_icon");
                linkedHashMap.put("link_page", "multiguest_icon");
                if (inviteUser3.inviteUserType == 2) {
                    str = "outroom_friend";
                } else {
                    str = "outroom_recommend_user";
                }
                linkedHashMap.put("link_reason", str);
                linkedHashMap.put("link_page_entrance", "multiguest_icon");
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                Gson gson = C19748512Ol.LIZJ;
                String json = GsonProtectorUtils.toJson(gson, listLIZLLL);
                String json2 = GsonProtectorUtils.toJson(gson, listLIZJ);
                int size = listLIZJ.size();
                if (inviteUser3.inviteUserType == 2) {
                    i = 2;
                } else {
                    i = 0;
                }
                C925600aC6.LJIIJ(j, enumC918970a1PLJII, "pre_batch_invite", json, json2, size, i, true, i3, "multiguest_icon", false, false, "1", false, linkedHashMap, C2097608Jq.LJ(), false);
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestUtil@525a.batchInviteGuest$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C932200aMk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
