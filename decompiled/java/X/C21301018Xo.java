package X;

import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import com.ss.android.ugc.tools.data.GuideAppearance;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS86S0500000_32;

/* JADX INFO: renamed from: X.18Xo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21301018Xo implements InterfaceC21291818Ua {
    public C214799194j LIZ;
    public final C2252321DDq LIZIZ = C1BNE.LIZ(Boolean.valueOf(((Keva) C21287618Sk.LIZ.getValue()).getBoolean("key_privacy_passed", false)));

    @Override // X.InterfaceC21291818Ua
    public final boolean LIZIZ() {
        return ((Boolean) this.LIZIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC21291818Ua
    public final AnonymousClass0951 LIZJ() {
        return C09IC.LIZIZ(this.LIZIZ);
    }

    @Override // X.InterfaceC21291818Ua
    public final void LJ(C19A3 c19a3) {
        C214799194j c214799194j = this.LIZ;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
            if (c19a3.isAdded(c214799194j)) {
                c19a3.remove(c214799194j);
            }
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC21291818Ua
    public final void LIZ(C19A3 c19a3, AIChatGenModel aIChatGenModel, AwS552S0100000_8 awS552S0100000_8) {
        if (aIChatGenModel == null || aIChatGenModel.consumptionModel == null || ((Keva) C21287618Sk.LIZ.getValue()).getBoolean("key_privacy_passed", false) || this.LIZ != null) {
            return;
        }
        LJFF(aIChatGenModel, null, null, c19a3, R.id.drg, awS552S0100000_8, null);
    }

    @Override // X.InterfaceC21291818Ua
    public final void LIZLLL(AIChatGenModel aIChatGenModel, AIChatTrackingConfig aIChatTrackingConfig, GuideAppearance guideAppearance, C19A3 c19a3, Function0 function0, Function0 function02) {
        Scene sceneFindSceneByTag;
        if (((Keva) C21287618Sk.LIZ.getValue()).getBoolean("key_privacy_passed", false)) {
            function0.invoke();
        } else {
            if (this.LIZ != null) {
                return;
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "creation_ai_chat_guide_crash_fix", true, true) && (sceneFindSceneByTag = c19a3.findSceneByTag("AiChatGuideDialogScene")) != null) {
                c19a3.remove(sceneFindSceneByTag);
            }
            LJFF(aIChatGenModel, aIChatTrackingConfig, guideAppearance, c19a3, R.id.f7o, function02, function0);
        }
    }

    public final void LJFF(AIChatGenModel aIChatGenModel, AIChatTrackingConfig aIChatTrackingConfig, GuideAppearance guideAppearance, C19A3 c19a3, int i, Function0<Unit> function0, Function0<Unit> function02) {
        String str;
        AIChatGenChatRoomModel aIChatGenChatRoomModel;
        AIChatGenChatRoomModel aIChatGenChatRoomModel2;
        this.LIZIZ.setValue(Boolean.FALSE);
        C18UP.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("ai_function_type", "visual_poet");
        if (aIChatGenModel != null && (aIChatGenChatRoomModel2 = aIChatGenModel.chatRoomModel) != null) {
            c0lab.LJ("shoot_way", aIChatGenChatRoomModel2.shootWay);
            c0lab.LJ("shoot_enter_method", aIChatGenChatRoomModel2.enterMethod);
            c0lab.LJ("creation_id", aIChatGenChatRoomModel2.creationId);
        }
        if (aIChatTrackingConfig != null) {
            Integer num = aIChatTrackingConfig.awemeType;
            if (num != null) {
                c0lab.LJ("aweme_type", String.valueOf(num.intValue()));
            }
            String str2 = aIChatTrackingConfig.sessionId;
            if (str2 != null) {
                c0lab.LJ("session_id", str2);
            }
        }
        C20684815ws.LJIILLIIL("ttcrt_ai_function_auth_popup_show", c0lab.LIZ);
        if (aIChatGenModel != null && (aIChatGenChatRoomModel = aIChatGenModel.chatRoomModel) != null) {
            str = aIChatGenChatRoomModel.entranceType;
        } else {
            str = null;
        }
        C18XX c18xx = new C18XX(new AwS86S0500000_32(this, (C21301018Xo) c19a3, (C19A3) function0, (Function0<Unit>) aIChatGenModel, (AIChatGenModel) aIChatTrackingConfig, (AIChatTrackingConfig) 1), new AwS86S0500000_32(this, (C21301018Xo) c19a3, (C19A3) function02, (Function0<Unit>) aIChatGenModel, (AIChatGenModel) aIChatTrackingConfig, (AIChatTrackingConfig) 2), guideAppearance, str);
        c18xx.disableSceneRestore();
        CreativeBottomSheetBehavior<?> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
        creativeBottomSheetBehavior.LJJ = false;
        creativeBottomSheetBehavior.LJIIJ = false;
        C18YA c18ya = new C18YA();
        C214799194j c214799194j = c18ya.LIZ;
        c214799194j.LLJJIJI = true;
        c214799194j.LLJILLL = i;
        c214799194j.LLJJ = "AiChatGuideDialogScene";
        c214799194j.LLJJI = c18xx;
        c214799194j.LLJJLIIIJLLLLLLLZ = false;
        c18ya.LIZIZ(EnumC214804194o.FREEDOM_HEIGHT);
        c18ya.LIZ.LLLII = true;
        c18ya.LIZ.LLJLLL = new AwS276S0300000_32(this, (C21301018Xo) function0, (Function0<Unit>) c19a3, (C19A3) 21);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 874);
        C214799194j c214799194j2 = c18ya.LIZ;
        c214799194j2.LLJZIJLIL = awS576S0100000_32;
        c214799194j2.LLJLILLLLZIIL = creativeBottomSheetBehavior;
        this.LIZ = c214799194j2;
        c214799194j2.LLLLL(c19a3);
    }
}
