package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS111S0400000_14;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS32S0600000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0ZVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900720ZVe implements InterfaceC900870ZVt<PictureCardTemplate> {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C01GW<MessageListPhotoClickAbility> LIZIZ;

    @Override // X.InterfaceC900870ZVt
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.InterfaceC900870ZVt
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC900870ZVt
    public final String getScene() {
        return "photo-message-template";
    }

    @Override // X.InterfaceC900870ZVt
    public final List<C900790ZVl> LIZLLL() {
        return Collections.singletonList(C900790ZVl.LIZ);
    }

    @Override // X.InterfaceC900870ZVt
    public final EnumC900890ZVv LIZ() {
        return EnumC900890ZVv.PHOTO_THUMBNAIL_EMPTY;
    }

    @Override // X.InterfaceC900870ZVt
    public final BaseTemplate LJ(C869590Y9l c869590Y9l) {
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (!(baseTemplateLIZ instanceof PictureCardTemplate)) {
            return null;
        }
        return baseTemplateLIZ;
    }

    @Override // X.InterfaceC900870ZVt
    public final boolean LJFF(C869590Y9l c869590Y9l) {
        if (!C896060ZDg.LIZIZ(c869590Y9l)) {
            C0Z40 c0z40 = IMSaasHostOfflineDebugService.LIZ;
            EnumC900880ZVu enumC900880ZVu = EnumC900880ZVu.PHOTO_SWAP_HIGH_RISK;
            c0z40.getClass();
            if (!C0Z40.LIZ(enumC900880ZVu)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC900870ZVt
    public final String LJII(BaseTemplate baseTemplate) {
        PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent;
        TextComponent textComponent;
        PictureCardTemplate pictureCardTemplate = (PictureCardTemplate) baseTemplate;
        if (pictureCardTemplate != null && (pictureCardFallbackInfoComponent = pictureCardTemplate.fallbackInfo) != null && (textComponent = pictureCardFallbackInfoComponent.text) != null) {
            return textComponent.text;
        }
        return null;
    }

    @Override // X.InterfaceC900870ZVt
    public final C2242281CpW LJIIJJI(BaseTemplate baseTemplate) {
        PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent;
        PictureCardTemplate pictureCardTemplate = (PictureCardTemplate) baseTemplate;
        if (pictureCardTemplate != null && (pictureCardFallbackInfoComponent = pictureCardTemplate.fallbackInfo) != null) {
            return C911320Zp4.LIZ(pictureCardFallbackInfoComponent);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C900720ZVe(boolean z, C01GW<? extends MessageListPhotoClickAbility> c01gw) {
        this.LIZ = z;
        this.LIZIZ = c01gw;
    }

    @Override // X.InterfaceC900870ZVt
    public final List LJI(C869590Y9l c869590Y9l, BaseTemplate baseTemplate) {
        C0ZSU.LIZ.getClass();
        return C0ZSU.LJFF(c869590Y9l, (PictureCardTemplate) baseTemplate);
    }

    @Override // X.InterfaceC900870ZVt
    public final C0ZW4 LJIIIZ(C869590Y9l c869590Y9l, boolean z) {
        C0ZSU.LIZ.getClass();
        C0ZSV c0zsvLJII = C0ZSU.LJII(c869590Y9l);
        if (z) {
            return C0ZW4.BLUR;
        }
        if (c0zsvLJII != C0ZSV.NONE) {
            return C0ZW4.MOSAIC;
        }
        return C0ZW4.NONE;
    }

    @Override // X.InterfaceC900870ZVt
    public final ResolutionComponent LJIIL(C869590Y9l c869590Y9l, BaseTemplate baseTemplate) {
        C0ZSU.LIZ.getClass();
        return C0ZSU.LJ(c869590Y9l, (PictureCardTemplate) baseTemplate);
    }

    @Override // X.InterfaceC900870ZVt
    public final /* bridge */ /* synthetic */ C0ZW8 LIZJ(Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, BaseTemplate baseTemplate) {
        return null;
    }

    public static void LJIILJJIL(View view, Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, BaseTemplate baseTemplate) {
        MessageListPhotoClickAbility messageListPhotoClickAbility;
        if (!c869590Y9l.isSuccessStatus()) {
            return;
        }
        if ((C0ZDX.LJJIJIIJIL(c869590Y9l) && !C0ZNY.LIZ(sessionInfo.getConversationId())) || fragment == null || (messageListPhotoClickAbility = (MessageListPhotoClickAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), MessageListPhotoClickAbility.class, null)) == null || baseTemplate == null) {
            return;
        }
        messageListPhotoClickAbility.wM0(view, c869590Y9l, C911220Zou.LIZLLL(c869590Y9l, Boolean.valueOf(sessionInfo.isMediaMsgMasking())), baseTemplate, true);
    }

    @Override // X.InterfaceC900870ZVt
    public final void LJIIJ(View view, Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, BaseTemplate baseTemplate) {
        PictureCardTemplate pictureCardTemplate = (PictureCardTemplate) baseTemplate;
        if (!C896060ZDg.LIZIZ(c869590Y9l)) {
            C0Z40 c0z40 = IMSaasHostOfflineDebugService.LIZ;
            EnumC900880ZVu enumC900880ZVu = EnumC900880ZVu.PHOTO_SWAP_HIGH_RISK;
            c0z40.getClass();
            if (!C0Z40.LIZ(enumC900880ZVu)) {
                LJIILJJIL(view, fragment, c869590Y9l, sessionInfo, pictureCardTemplate);
                return;
            }
        }
        C0ZSU c0zsu = C0ZSU.LIZ;
        AwS32S0600000_14 awS32S0600000_14 = new AwS32S0600000_14(this, fragment, c869590Y9l, sessionInfo, view, pictureCardTemplate, 1);
        c0zsu.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
        c1397580mTM.LJFF(2131831770);
        c1397580mTM.LIZ(2131831776);
        C985403tE.LIZ(c1397580mTM, new AwS223S0300000_14(view, sessionInfo, awS32S0600000_14, 19));
        c1397580mTM.LIZLLL(new AwS593S0100000_14(sessionInfo, 273));
        new C1397510mTF(c1397580mTM).LIZLLL();
        String conversationId = sessionInfo.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        C900960ZWc.LIZIZ(conversationId);
    }

    @Override // X.InterfaceC900870ZVt
    public final List LIZIZ(Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, BaseTemplate baseTemplate, boolean z, String str, boolean z2) {
        Object c0nd4;
        C0ZSU.LIZ.getClass();
        C0ZSV c0zsvLJII = C0ZSU.LJII(c869590Y9l);
        if (C0ZDX.LJJJJ(c869590Y9l)) {
            c0nd4 = C900780ZVk.LIZ;
        } else if (z) {
            c0nd4 = C900800ZVm.LIZ;
        } else if (c0zsvLJII == C0ZSV.PHOTO_SWAP_INITIATE_MASK) {
            c0nd4 = C900810ZVn.LIZ;
        } else if (c0zsvLJII == C0ZSV.PHOTO_SWAP_REPLY_MASK) {
            c0nd4 = new C900760ZVi(new C1622006Ws(new AwS111S0400000_14(this, (C900720ZVe) c869590Y9l, (C869590Y9l) sessionInfo, (SessionInfo) this.LIZIZ, (C01GW<? extends MessageListPhotoClickAbility>) 3)));
        } else if (this.LIZ) {
            c0nd4 = new C0ND4(c869590Y9l.getUuid());
        } else {
            c0nd4 = C900800ZVm.LIZ;
        }
        return Collections.singletonList(c0nd4);
    }
}
