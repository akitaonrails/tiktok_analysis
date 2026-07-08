package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsEntrancePermissionRollback;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.pincard.LivePcsPinCardFixDuplicateBehaviorSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBToolInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0euc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106960euc {
    public volatile boolean LIZ;
    public volatile long LIZIZ;

    public final void LIZIZ() {
        if (this.LIZ) {
            return;
        }
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(90, new InterfaceC1112400f3O() { // from class: X.01l1
            @Override // X.InterfaceC1112400f3O
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIJIIJI() {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIJL(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final LiveCapsuleStyleItemConfig LJI() {
                return C952230at3.LIZ();
            }

            public static String LIZJ(C1112330f3H c1112330f3H) {
                if (c1112330f3H.LLIIIILZ().LJI) {
                    return "anchor";
                }
                if (C01C5.LIZ(c1112330f3H.LLIIIILZ().LJIIIZ)) {
                    return "moderator";
                }
                return "viewer";
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZJ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                String string;
                User owner;
                C010G.LIZ("click", LIZJ(c1112330f3H));
                if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
                    Context context = c1112330f3H.LLIIIILZ().LIZ;
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    C490590JLt c490590JLt = C490590JLt.LIZ;
                    String secUid = null;
                    if (room != null && (owner = room.getOwner()) != null) {
                        secUid = owner.getSecUid();
                    }
                    if (secUid == null) {
                        secUid = "";
                    }
                    if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
                        string = "";
                    }
                    c490590JLt.getClass();
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, new Uri.Builder().scheme("sslocal").authority("webcast_pcs").path("service_moderator_panel").appendQueryParameter("show_entrance", "").appendQueryParameter("room_id", string).appendQueryParameter("sec_anchor_id", secUid).build().toString());
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIIJ(C1112330f3H c1112330f3H) {
                C010G.LIZ("show", LIZJ(c1112330f3H));
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZIZ(c1112330f3H);
            }
        });
        this.LIZ = true;
    }

    public final void LIZJ() {
        C09AE c09ae = (C09AE) ((InterfaceC497601wk) C1343405No.LIZ.getValue()).getCoroutineContext().get(C09AE.LJJLJ);
        if (c09ae != null) {
            C23118094a.LJFF(c09ae);
        }
        ((ConcurrentHashMap) C1343405No.LIZIZ.getValue()).clear();
        this.LIZIZ = 0L;
    }

    public final void LJI() {
        long id;
        if (LivePcsPinCardFixDuplicateBehaviorSetting.INSTANCE.isEnabled()) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
                if (id != 0 && id == this.LIZIZ) {
                    return;
                }
            } else {
                id = 0;
            }
            this.LIZIZ = id;
        }
        IPinCardService iPinCardService = (IPinCardService) C1161920gLG.LIZJ(IPinCardService.class);
        EnumC1107860ew4 enumC1107860ew4 = EnumC1107860ew4.SERVICE_PLUS_DM;
        final AbstractC1107140euu abstractC1107140euu = new AbstractC1107140euu() { // from class: X.0euh
            public final int LLJJIJI = 3;
            public final EnumC1107860ew4 LLJJIJIIJIL = EnumC1107860ew4.SERVICE_PLUS_DM;

            @Override // X.AbstractC1107140euu
            public final boolean LJIIJJI() {
                SMBToolInfo sMBToolInfo;
                if (!C1083940eJU.LIZIZ(this.LLILZLL)) {
                    return false;
                }
                Room room2 = this.LLILZLL;
                return room2 == null || (sMBToolInfo = room2.smbToolInfo) == null || sMBToolInfo.showDmEntrance || LivePcsEntrancePermissionRollback.INSTANCE.rollback();
            }

            @Override // X.AbstractC1107140euu
            public final int LJIIL() {
                return this.LLJJIJI;
            }

            @Override // X.AbstractC1107140euu
            public final EnumC1107860ew4 LJIILIIL() {
                return this.LLJJIJIIJIL;
            }

            @Override // X.AbstractC1107140euu
            public final String LJIILJJIL(String str) {
                boolean z;
                Object obj;
                Room room2 = this.LLILZLL;
                if (room2 != null && room2.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "biz_event_tracking_extra");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "{}";
                    }
                    for (Map.Entry entry : ((LinkedHashMap) C08HX.LJ(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter))).entrySet()) {
                        linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    linkedHashMap.put("is_anchor", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
                    linkedHashMap.put("is_single_sku", CardStruct.IStatusCode.DEFAULT);
                    linkedHashMap.put("is_service_plus_revamp", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage())) ? 1 : 0));
                    C189200o6.m2constructorimpl(linkedHashMap);
                    obj = linkedHashMap;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                Map mapLJ = C2097608Jq.LJ();
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                Object obj2 = obj;
                if (zM7isFailureimpl) {
                    obj2 = mapLJ;
                }
                C490590JLt.LIZ.getClass();
                return C490590JLt.LJIIIIZZ(C490590JLt.LIZ(str, "biz_event_tracking_extra", (Map) obj2), null, true);
            }
        };
        iPinCardService.Y70(enumC1107860ew4, new C0UTI(abstractC1107140euu) { // from class: X.0eux
            public final AbstractC1107400evK LLILLJJLI;

            {
                this.LLILLJJLI = abstractC1107140euu;
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZ(enumC1108010ewJ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZIZ(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZJ(EnumC1107860ew4 enumC1107860ew42, boolean z) {
                this.LLILLJJLI.LIZJ(enumC1107860ew42, z);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZLLL(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LLLZIIL(view, map);
            }
        });
        IPinCardService iPinCardService2 = (IPinCardService) C1161920gLG.LIZJ(IPinCardService.class);
        EnumC1107860ew4 enumC1107860ew42 = EnumC1107860ew4.SERVICE_PLUS_FORM;
        final C1107090eup c1107090eup = new C1107090eup();
        iPinCardService2.Y70(enumC1107860ew42, new C0UTI(c1107090eup) { // from class: X.0eux
            public final AbstractC1107400evK LLILLJJLI;

            {
                this.LLILLJJLI = c1107090eup;
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZ(enumC1108010ewJ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZIZ(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZJ(EnumC1107860ew4 enumC1107860ew422, boolean z) {
                this.LLILLJJLI.LIZJ(enumC1107860ew422, z);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZLLL(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LLLZIIL(view, map);
            }
        });
        IPinCardService iPinCardService3 = (IPinCardService) C1161920gLG.LIZJ(IPinCardService.class);
        EnumC1107860ew4 enumC1107860ew43 = EnumC1107860ew4.SERVICE_PLUS_BIO;
        final AbstractC1107140euu abstractC1107140euu2 = new AbstractC1107140euu() { // from class: X.0eue
            public final int LLJJIJI = 7;
            public final EnumC1107860ew4 LLJJIJIIJIL = EnumC1107860ew4.SERVICE_PLUS_BIO;

            @Override // X.AbstractC1107140euu
            public final boolean LJIIJJI() {
                return C1083940eJU.LIZIZ(this.LLILZLL);
            }

            @Override // X.AbstractC1107140euu
            public final int LJIIL() {
                return this.LLJJIJI;
            }

            @Override // X.AbstractC1107140euu
            public final EnumC1107860ew4 LJIILIIL() {
                return this.LLJJIJIIJIL;
            }
        };
        iPinCardService3.Y70(enumC1107860ew43, new C0UTI(abstractC1107140euu2) { // from class: X.0eux
            public final AbstractC1107400evK LLILLJJLI;

            {
                this.LLILLJJLI = abstractC1107140euu2;
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZ(enumC1108010ewJ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZIZ(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZJ(EnumC1107860ew4 enumC1107860ew422, boolean z) {
                this.LLILLJJLI.LIZJ(enumC1107860ew422, z);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZLLL(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LLLZIIL(view, map);
            }
        });
        IPinCardService iPinCardService4 = (IPinCardService) C1161920gLG.LIZJ(IPinCardService.class);
        EnumC1107860ew4 enumC1107860ew44 = EnumC1107860ew4.SERVICE_PLUS_CALENDLY_BOOKING;
        final AbstractC1107140euu abstractC1107140euu3 = new AbstractC1107140euu() { // from class: X.0eud
            public final int LLJJIJI = 8;
            public final EnumC1107860ew4 LLJJIJIIJIL = EnumC1107860ew4.SERVICE_PLUS_CALENDLY_BOOKING;

            @Override // X.AbstractC1107140euu
            public final boolean LJIIJJI() {
                return C1083940eJU.LIZIZ(this.LLILZLL);
            }

            @Override // X.AbstractC1107140euu
            public final int LJIIL() {
                return this.LLJJIJI;
            }

            @Override // X.AbstractC1107140euu
            public final EnumC1107860ew4 LJIILIIL() {
                return this.LLJJIJIIJIL;
            }
        };
        iPinCardService4.Y70(enumC1107860ew44, new C0UTI(abstractC1107140euu3) { // from class: X.0eux
            public final AbstractC1107400evK LLILLJJLI;

            {
                this.LLILLJJLI = abstractC1107140euu3;
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZ(enumC1108010ewJ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZIZ(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZJ(EnumC1107860ew4 enumC1107860ew422, boolean z) {
                this.LLILLJJLI.LIZJ(enumC1107860ew422, z);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZLLL(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LLLZIIL(view, map);
            }
        });
        IPinCardService iPinCardService5 = (IPinCardService) C1161920gLG.LIZJ(IPinCardService.class);
        EnumC1107860ew4 enumC1107860ew45 = EnumC1107860ew4.SERVICE_PLUS_THIRD_PARTY_LINK;
        final AbstractC1107140euu abstractC1107140euu4 = new AbstractC1107140euu() { // from class: X.0euf
            public final int LLJJIJI = 9;
            public final EnumC1107860ew4 LLJJIJIIJIL = EnumC1107860ew4.SERVICE_PLUS_THIRD_PARTY_LINK;

            @Override // X.AbstractC1107140euu
            public final boolean LJIIJJI() {
                return C1083940eJU.LIZIZ(this.LLILZLL);
            }

            @Override // X.AbstractC1107140euu
            public final int LJIIL() {
                return this.LLJJIJI;
            }

            @Override // X.AbstractC1107140euu
            public final EnumC1107860ew4 LJIILIIL() {
                return this.LLJJIJIIJIL;
            }
        };
        iPinCardService5.Y70(enumC1107860ew45, new C0UTI(abstractC1107140euu4) { // from class: X.0eux
            public final AbstractC1107400evK LLILLJJLI;

            {
                this.LLILLJJLI = abstractC1107140euu4;
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZ(enumC1108010ewJ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZIZ(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZJ(EnumC1107860ew4 enumC1107860ew422, boolean z) {
                this.LLILLJJLI.LIZJ(enumC1107860ew422, z);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZLLL(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LLLZIIL(view, map);
            }
        });
        IPinCardService iPinCardService6 = (IPinCardService) C1161920gLG.LIZJ(IPinCardService.class);
        EnumC1107860ew4 enumC1107860ew46 = EnumC1107860ew4.PCS_COURSE_VIDEO_NATIVE;
        final AbstractC1107140euu abstractC1107140euu5 = new AbstractC1107140euu() { // from class: X.0eug
            public final int LLJJIJI = 6;
            public final EnumC1107860ew4 LLJJIJIIJIL = EnumC1107860ew4.PCS_COURSE_VIDEO_NATIVE;

            @Override // X.AbstractC1107140euu
            public final boolean LJIIJJI() {
                SMBToolInfo sMBToolInfo;
                if (!C1083940eJU.LIZIZ(this.LLILZLL)) {
                    return false;
                }
                Room room2 = this.LLILZLL;
                return room2 == null || (sMBToolInfo = room2.smbToolInfo) == null || sMBToolInfo.showCourseEntrance || LivePcsEntrancePermissionRollback.INSTANCE.rollback();
            }

            @Override // X.AbstractC1107140euu
            public final int LJIIL() {
                return this.LLJJIJI;
            }

            @Override // X.AbstractC1107140euu
            public final EnumC1107860ew4 LJIILIIL() {
                return this.LLJJIJIIJIL;
            }
        };
        iPinCardService6.Y70(enumC1107860ew46, new C0UTI(abstractC1107140euu5) { // from class: X.0eux
            public final AbstractC1107400evK LLILLJJLI;

            {
                this.LLILLJJLI = abstractC1107140euu5;
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZ(enumC1108010ewJ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZIZ(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZJ(EnumC1107860ew4 enumC1107860ew422, boolean z) {
                this.LLILLJJLI.LIZJ(enumC1107860ew422, z);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LIZLLL(c1107460evQ, map);
            }

            @Override // X.InterfaceC1107910ew9
            public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
                this.LLILLJJLI.LLLZIIL(view, map);
            }
        });
    }

    public static final void LIZLLL(DataChannel dataChannel) {
        C1106750euH c1106750euH = C1106750euH.LIZ;
        c1106750euH.LIZ("/webcast/sub/privilege/get_sub_privilege_detail/", C2097608Jq.LJ());
        c1106750euH.LIZ("/webcast/sub/gift/send_subscription_panel/", C2097608Jq.LJ());
        c1106750euH.LIZ("/webcast/sub/smb/preview/", C2097608Jq.LJ());
        if (dataChannel != null) {
            dataChannel.SX0(C754010Thv.class, Boolean.FALSE);
        }
    }

    public static final void LJ(DataChannel dataChannel) {
        EnumC1102740eno.load$default(EnumC1102740eno.AUDIENCE_SERVICE_PLUS, dataChannel, new C1103320eok(), false, 4, null);
    }

    public static final void LJFF(DataChannel dataChannel) {
        EnumC1102750enp.ANCHOR_SERVICE_PLUS.load(dataChannel, new C1103240eoc());
    }

    public static final C1107270ev7 LIZ(EnumC1107860ew4 enumC1107860ew4, SubPinCard subPinCard, Map map, C1107030euj c1107030euj, LifecycleOwner lifecycleOwner) {
        return new C1107270ev7(enumC1107860ew4, subPinCard, map, c1107030euj, lifecycleOwner);
    }
}
