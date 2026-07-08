package X;

import Y.AObserverS234S0100000_32;
import Y.ATListenerS464S0100000_32;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.OECDisplayScriptInfoMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.data.OecInitData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import g1c.AjS72S0100000_32;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1811, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1811 extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> {
    public Room LLILLL;
    public AnonymousClass1814 LLILZ;
    public final C1743900vTw LLILZIL = new C1743900vTw();

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final boolean LLIZLLLIL() {
        return true;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C21182917v1.LIZ(3);
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return new IFrameSlot() { // from class: X.1815
            @Override // com.bytedance.android.live.slot.IFrameSlot
            public final Animation LJIIZILJ() {
                return null;
            }

            @Override // com.bytedance.android.live.slot.IFrameSlot
            public final Animation LJIJ() {
                return null;
            }

            @Override // com.bytedance.android.live.slot.IFrameSlot
            public final /* synthetic */ void LJIJJ(String str) {
            }

            @Override // com.bytedance.android.live.slot.IFrameSlot
            public final String getScheme() {
                return null;
            }

            @Override // com.bytedance.android.live.slot.IFrameSlot
            public final /* synthetic */ void onHide() {
            }

            @Override // com.bytedance.android.live.slot.IFrameSlot
            public final InterfaceC752610Tff LIZJ() {
                return new InterfaceC752610Tff() { // from class: X.1817
                    @Override // X.InterfaceC752610Tff
                    public final void LIZ(View view, String str) {
                    }
                };
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [X.1816] */
            @Override // com.bytedance.android.live.slot.IFrameSlot
            public final View LJIJI(Context context) {
                if (context != null) {
                    AnonymousClass1811 anonymousClass1811 = this.LL;
                    anonymousClass1811.getClass();
                    String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
                    if (currentUserID == null) {
                        currentUserID = "";
                    }
                    AnonymousClass1814 anonymousClass1814 = new AnonymousClass1814(context, currentUserID, anonymousClass1811.LLILZIL, new AnonymousClass1813() { // from class: X.1816
                        @Override // X.AnonymousClass1813
                        public final void LIZ(boolean z) {
                            C1440005kM.LIZ(new C7838034i(z));
                        }
                    });
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.zh);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                    anonymousClass1814.setBackground(c384050F3z.LIZ(anonymousClass1814.getContext()));
                    TuxTextView tuxTextView = anonymousClass1814.LLILZLL;
                    if (tuxTextView != null) {
                        tuxTextView.setMovementMethod(new ScrollingMovementMethod());
                        tuxTextView.addOnLayoutChangeListener(new C19LV(anonymousClass1814, 8));
                        tuxTextView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.181B
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                return true;
                            }
                        });
                    }
                    TuxTextView tuxTextView2 = anonymousClass1814.LLILZ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.181C
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                return true;
                            }
                        });
                    }
                    TuxIconView tuxIconView = anonymousClass1814.LLILZIL;
                    if (tuxIconView != null) {
                        tuxIconView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.181D
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                return true;
                            }
                        });
                    }
                    C03DZ.LIZ(anonymousClass1814);
                    anonymousClass1814.LLILLL.LIZ(false);
                    AnonymousClass1814.h0(anonymousClass1814, false, false, 2);
                    anonymousClass1811.LLILZ = anonymousClass1814;
                    return anonymousClass1814;
                }
                return null;
            }
        };
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        AnonymousClass1814 anonymousClass1814 = this.LLILZ;
        if (anonymousClass1814 != null) {
            if (anonymousClass1814.getVisibility() == 0) {
                Map<String, Object> map = anonymousClass1814.LLJJ;
                map.put("module_show_type", "expand");
                map.put("stay_time", Long.valueOf(System.currentTimeMillis() - anonymousClass1814.LLJI));
                map.put("quit_type", "off_live");
                C1421105hJ.LIZJ("tiktokec_module_staytime", map);
            }
            AnonymousClass1814.h0(anonymousClass1814, false, false, 2);
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_BROADCAST_SCRIPT;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
        String str;
        AnonymousClass1814 anonymousClass1814 = this.LLILZ;
        if (anonymousClass1814 != null && (iMessage instanceof OECDisplayScriptInfoMessage)) {
            OECDisplayScriptInfoMessage oECDisplayScriptInfoMessage = (OECDisplayScriptInfoMessage) iMessage;
            long j = oECDisplayScriptInfoMessage.timestamp;
            if (j <= anonymousClass1814.LLJIJIL) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("version is old");
                C1731680vAE.LIZJ(EnumC1731690vAF.TIMESTAMP_EXPIRED, anonymousClass1814.LL, oECDisplayScriptInfoMessage.productId);
                return;
            }
            anonymousClass1814.LLJIJIL = j;
            Map<String, Object> mapLJ = anonymousClass1814.LLILLJJLI.LJ();
            mapLJ.put("page_name", "live");
            mapLJ.put("module_name", "on_screen_script");
            mapLJ.put("product_id", oECDisplayScriptInfoMessage.productId);
            mapLJ.putAll(oECDisplayScriptInfoMessage.daInfoMap);
            anonymousClass1814.LLJJ = mapLJ;
            if (oECDisplayScriptInfoMessage.enabled) {
                String str2 = oECDisplayScriptInfoMessage.script;
                if (str2 != null && str2.length() != 0 && (str = oECDisplayScriptInfoMessage.title) != null && str.length() != 0) {
                    C03DZ.LIZJ(anonymousClass1814);
                    anonymousClass1814.LLILLL.LIZ(true);
                    AnonymousClass1814.h0(anonymousClass1814, true, false, 2);
                    if (anonymousClass1814.LLJ) {
                        anonymousClass1814.LLJ = false;
                        anonymousClass1814.LLJI = System.currentTimeMillis();
                        Map<String, Object> map = anonymousClass1814.LLJJ;
                        map.put("module_show_type", "expand");
                        C1731680vAE.LIZ(map, true);
                    }
                    C1731680vAE.LIZJ(EnumC1731690vAF.SHOW, anonymousClass1814.LL, oECDisplayScriptInfoMessage.productId);
                    TuxTextView tuxTextView = anonymousClass1814.LLILZ;
                    if (tuxTextView != null) {
                        tuxTextView.setText(oECDisplayScriptInfoMessage.title);
                    }
                    TuxTextView tuxTextView2 = anonymousClass1814.LLILZ;
                    if (tuxTextView2 != null) {
                        C786410Ut5.I7(new AjS72S0100000_32(anonymousClass1814, 15), tuxTextView2);
                    }
                    C371510EhR c371510EhR = anonymousClass1814.LLIZLLLIL;
                    if (c371510EhR != null) {
                        C786410Ut5.I7(new AjS72S0100000_32(anonymousClass1814, 16), c371510EhR);
                    }
                    TuxTextView tuxTextView3 = anonymousClass1814.LLILZLL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(oECDisplayScriptInfoMessage.script);
                    }
                    TuxTextView tuxTextView4 = anonymousClass1814.LLILZLL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setOnTouchListener(new ATListenerS464S0100000_32(anonymousClass1814, 6));
                    }
                    if (oECDisplayScriptInfoMessage.collapsable) {
                        TuxIconView tuxIconView = anonymousClass1814.LLILZIL;
                        if (tuxIconView != null) {
                            C03DZ.LIZJ(tuxIconView);
                        }
                        TuxIconView tuxIconView2 = anonymousClass1814.LLILZIL;
                        if (tuxIconView2 != null) {
                            C786410Ut5.I7(new AjS72S0100000_32(anonymousClass1814, 17), tuxIconView2);
                        }
                        LifecycleOwner lifecycleOwnerLIZ = C843803Rk.LIZ(anonymousClass1814.getContext());
                        if (lifecycleOwnerLIZ == null) {
                            return;
                        }
                        anonymousClass1814.LLIZ.observe(lifecycleOwnerLIZ, new AObserverS234S0100000_32(anonymousClass1814, 42));
                        return;
                    }
                    TuxIconView tuxIconView3 = anonymousClass1814.LLILZIL;
                    if (tuxIconView3 == null) {
                        return;
                    }
                    C03DZ.LIZ(tuxIconView3);
                    return;
                }
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("content is empty, not process");
                C1731680vAE.LIZJ(EnumC1731690vAF.CONTENT_EMPTY, anonymousClass1814.LL, oECDisplayScriptInfoMessage.productId);
                return;
            }
            C1731680vAE.LIZJ(EnumC1731690vAF.DISABLED, anonymousClass1814.LL, oECDisplayScriptInfoMessage.productId);
            anonymousClass1814.e0(anonymousClass1814.LLJJ);
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        boolean z;
        String str;
        Type type;
        CommerceStruct commerceStruct;
        CommerceStruct commerceStruct2;
        Object obj = map.get("param_room");
        String idStr = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLILLL = room;
        boolean z2 = true;
        if (room != null && (commerceStruct2 = room.getCommerceStruct()) != null && commerceStruct2.commercePermission == 1) {
            z = true;
        } else {
            z = false;
        }
        Object obj2 = map.get("param_is_hidden_ec_widget");
        if (!(obj2 instanceof Boolean)) {
            obj2 = null;
        }
        Room room2 = this.LLILLL;
        if (room2 != null && (commerceStruct = room2.getCommerceStruct()) != null) {
            str = commerceStruct.oecInitDataString;
        } else {
            str = null;
        }
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(OecInitData.class));
            } else {
                type = new TypeToken<OecInitData>() { // from class: X.180i
                }.getType();
            }
            if (!(GsonProtectorUtils.fromJson(gsonLJFF, str, type) instanceof OecInitData)) {
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1743900vTw c1743900vTw = this.LLILZIL;
        Room room3 = this.LLILLL;
        if (room3 != null) {
            idStr = room3.getIdStr();
        }
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID == null) {
            currentUserID = "";
        }
        c1743900vTw.LJIIIIZZ("live_status", "during_live", false);
        c1743900vTw.LJIIIIZZ("anchor_id", currentUserID, false);
        c1743900vTw.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI", false);
        c1743900vTw.LJIIIIZZ("room_id", idStr, false);
        if (!z || Intrinsics.LJFF(obj2, Boolean.TRUE)) {
            z2 = false;
        }
        interfaceC756140TlM.LIZ(z2);
    }
}
