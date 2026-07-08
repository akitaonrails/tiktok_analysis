package X;

import android.view.ViewGroup;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.dataChannel.BeforeStickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.SupportBillboardOverlaySetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0UEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C768990UEn implements InterfaceC767730U9r {
    public String LIZ = "";
    public final /* synthetic */ VideoWidget LIZIZ;

    @Override // X.InterfaceC767730U9r
    public final void onDestroy() {
        InterfaceC768930UEh interfaceC768930UEh = this.LIZIZ.LLJZ;
        if (interfaceC768930UEh != null) {
            interfaceC768930UEh.onDestroy();
        }
    }

    public C768990UEn(VideoWidget videoWidget) {
        this.LIZIZ = videoWidget;
    }

    @Override // X.InterfaceC767730U9r
    public final void LJ(String str) {
        InterfaceC768930UEh interfaceC768930UEh = this.LIZIZ.LLJZ;
        if (interfaceC768930UEh != null) {
            interfaceC768930UEh.LJ(str);
        }
    }

    @Override // X.InterfaceC767730U9r
    public final void LJFF(LiveEffect liveEffect) {
        if (SupportBillboardOverlaySetting.INSTANCE.enable() && ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).wg(liveEffect.getResourceId())) {
            this.LIZIZ.B1();
            C769050UEt c769050UEt = this.LIZIZ.LLLFF;
            if (c769050UEt != null) {
                c769050UEt.LIZJ();
            }
        }
        C768460UCm.LIZIZ().vr(null);
        C768460UCm.LIZIZ().nr(null);
        InterfaceC768930UEh interfaceC768930UEh = this.LIZIZ.LLJZ;
        if (interfaceC768930UEh != null && interfaceC768930UEh.LJIIIIZZ(liveEffect)) {
            this.LIZIZ.LLJZ.LJFF(liveEffect);
        } else {
            InterfaceC768930UEh interfaceC768930UEh2 = this.LIZIZ.LLJZ;
            if (interfaceC768930UEh2 != null) {
                interfaceC768930UEh2.LIZJ();
            }
            LiveEffect liveEffect2 = this.LIZIZ.LLJLLIL;
            UrlModel urlModel = LiveEffect.LIZLLL;
            if (!C0UCX.LIZ(liveEffect2, liveEffect)) {
                C0UCF c0ucf = new C0UCF(liveEffect, C0UD4.LIZIZ, this.LIZ, false);
                DataChannel dataChannel = this.LIZIZ.dataChannel;
                if (dataChannel != null) {
                    dataChannel.LC0(StickerSelectedEvent.class, c0ucf);
                }
            }
        }
        this.LIZIZ.LLJLLIL = liveEffect;
        HashMap map = new HashMap();
        map.put(FollowStatusChangeMethod.PARAM_UID, String.valueOf(liveEffect.getEffectId()));
        map.put("name", liveEffect.getName());
        C465520INi.LIZ.t10("sticker", map);
        C0UOQ.LJ.put("sticker_id", String.valueOf(liveEffect.getEffectId()));
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        String strValueOf = String.valueOf(liveEffect.getEffectId());
        c1276840jKc.getClass();
        C1276840jKc.LJIIL(strValueOf);
        C1276840jKc.LJIILL(liveEffect.getResourceId());
        C1276840jKc.LJIIJ(liveEffect, false);
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_broadcast_action_all");
        c760160TrqLIZ.LJII("action", "change_sticker");
        c760160TrqLIZ.LJI(Long.valueOf(liveEffect.getEffectId()), "action_id");
        c760160TrqLIZ.LJII("user_id", C501590Jll.LIZ());
        c760160TrqLIZ.LJI(Long.valueOf(this.LIZIZ.x1()), "room_id");
        c760160TrqLIZ.LJIIIZ();
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIIJJI(String str) {
        InterfaceC768930UEh interfaceC768930UEh = this.LIZIZ.LLJZ;
        if (interfaceC768930UEh != null) {
            interfaceC768930UEh.LJI(null, str);
        }
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIIL(LiveEffect liveEffect) {
        C0UCF c0ucf = new C0UCF(liveEffect, C0UD4.LIZIZ, this.LIZ, false);
        DataChannel dataChannel = this.LIZIZ.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(BeforeStickerSelectedEvent.class, c0ucf);
        }
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIILJJIL(LiveEffect liveEffect) {
        C768460UCm.LIZIZ().lr(C0UD4.LIZIZ);
        VideoWidget videoWidget = this.LIZIZ;
        videoWidget.LLJLLIL = null;
        InterfaceC768930UEh interfaceC768930UEh = videoWidget.LLJZ;
        if (interfaceC768930UEh != null && interfaceC768930UEh.LJIIIIZZ(liveEffect)) {
            this.LIZIZ.LLJZ.LIZJ();
        }
        C465520INi.LIZ.sw0("sticker");
        C0UOQ.LJ.remove("sticker_id");
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJIIL("");
        C1276840jKc.LJIILL("");
        C1276840jKc.LJIIJ(liveEffect, true);
        this.LIZIZ.dataChannel.LC0(StickerCancelChannel.class, liveEffect);
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIILL(ViewGroup viewGroup) {
        InterfaceC768930UEh interfaceC768930UEh = this.LIZIZ.LLJZ;
        if (interfaceC768930UEh != null) {
            interfaceC768930UEh.LJIIIZ(viewGroup, false);
        }
    }

    @Override // X.InterfaceC767730U9r
    public final int LJIILIIL(String str, String str2) {
        long id;
        InterfaceC769940UIe interfaceC769940UIe = this.LIZIZ.LLILZIL;
        if (interfaceC769940UIe != null && interfaceC769940UIe.LJIIL() != null) {
            if (SupportBillboardOverlaySetting.INSTANCE.enable()) {
                VideoWidget videoWidget = this.LIZIZ;
                if (videoWidget.LLLFF == null) {
                    videoWidget.B1();
                    C769050UEt c769050UEt = this.LIZIZ.LLLFF;
                    if (c769050UEt != null) {
                        c769050UEt.LIZJ();
                    }
                }
            }
            C769020UEq.LIZJ = str;
            C769020UEq.LIZLLL = str2;
            int customEffect = this.LIZIZ.LLILZIL.LJIIL().setCustomEffect(str, str2);
            Room room = this.LIZIZ.LLJJIJI;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C769030UEr.LIZ.LIZ(new C0UC3(str2, id, UserService.getInstance().user().getCurrentUserId()));
            return customEffect;
        }
        return -1;
    }

    @Override // X.InterfaceC767730U9r
    public final int LJIILLIIL(String str, String str2) {
        long id;
        InterfaceC769940UIe interfaceC769940UIe = this.LIZIZ.LLILZIL;
        if (interfaceC769940UIe != null && interfaceC769940UIe.LJIIL() != null) {
            if (str2 == null || str2.isEmpty()) {
                C0UF5.LIZLLL().LIZ = "";
            }
            C768460UCm.LIZIZ().vr(str);
            C768460UCm.LIZIZ().nr(str2);
            C781270Ukn.LJI().updateGallerySticker(str, str2);
            int customEffect = this.LIZIZ.LLILZIL.LJIIL().setCustomEffect(str, str2);
            Room room = this.LIZIZ.LLJJIJI;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C769030UEr.LIZ.LIZ(new C0UC3(str2, id, UserService.getInstance().user().getCurrentUserId()));
            if (this.LIZIZ.context != null) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).reportUseC2PAPicture(Long.valueOf(id), str2, null, C1388190mED.LIZIZ(this.LIZIZ.context), Boolean.FALSE);
            }
            return customEffect;
        }
        return -1;
    }

    @Override // X.InterfaceC767730U9r
    public final void LJIIZILJ(String str, String str2) {
        boolean z;
        Boolean bool = (Boolean) this.LIZIZ.dataChannel.gg0(C769010UEp.class);
        String str3 = this.LIZ;
        int length = str3.length();
        int i = 0;
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                break;
            }
            int iCodePointAt = str3.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                if (!this.LIZ.equals(str)) {
                    z = false;
                }
            } else {
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        z = true;
        Boolean boolValueOf = Boolean.valueOf(z);
        this.LIZ = str;
        if (boolValueOf.booleanValue()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pm_live_sticker_tab_change");
        c474500IjALIZ.LJIJJLI(this.LIZIZ.dataChannel);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C931040aKs.class), "enter_from");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930950aKj.class), "banner_id");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930960aKk.class), "banner_from");
        c474500IjALIZ.LJJII(str2, "tab");
        if (bool != null && bool.booleanValue()) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_new_anchor_guide");
        c474500IjALIZ.LIZ();
    }
}
