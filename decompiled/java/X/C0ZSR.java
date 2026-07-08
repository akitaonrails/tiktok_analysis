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
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0ZSR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZSR {
    public final C900860ZVs<PictureCardTemplate> LIZ = new C900860ZVs<>(new InterfaceC900870ZVt<PictureCardTemplate>() { // from class: X.0ZVf
        @Override // X.InterfaceC900870ZVt
        public final boolean LJFF(C869590Y9l c869590Y9l) {
            return false;
        }

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

        @Override // X.InterfaceC900870ZVt
        public final List LJI(C869590Y9l c869590Y9l, BaseTemplate baseTemplate) {
            C0ZSU.LIZ.getClass();
            return C0ZSU.LJFF(c869590Y9l, (PictureCardTemplate) baseTemplate);
        }

        @Override // X.InterfaceC900870ZVt
        public final C0ZW4 LJIIIZ(C869590Y9l c869590Y9l, boolean z) {
            if (z) {
                return C0ZW4.BLUR;
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

        @Override // X.InterfaceC900870ZVt
        public final void LJIIJ(View view, Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, BaseTemplate baseTemplate) {
            MessageListPhotoClickAbility messageListPhotoClickAbility;
            if (!C0ZDX.LJJJJ(c869590Y9l)) {
                if ((C0ZDX.LJJIJIIJIL(c869590Y9l) && !C0ZNY.LIZ(sessionInfo.getConversationId())) || fragment == null || (messageListPhotoClickAbility = (MessageListPhotoClickAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), MessageListPhotoClickAbility.class, null)) == null || baseTemplate == null) {
                    return;
                }
                messageListPhotoClickAbility.wM0(view, c869590Y9l, C911220Zou.LIZLLL(c869590Y9l, Boolean.valueOf(sessionInfo.isMediaMsgMasking())), baseTemplate, true);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
        @Override // X.InterfaceC900870ZVt
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List LIZIZ(androidx.fragment.app.Fragment r9, X.C869590Y9l r10, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r11, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r12, boolean r13, java.lang.String r14, boolean r15) {
            /*
                r8 = this;
                r7 = r14
                r5 = r10
                boolean r0 = X.C0ZDX.LJJJJ(r5)
                if (r0 == 0) goto Lf
                X.0ZVk r0 = X.C900780ZVk.LIZ
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
            Lf:
                if (r13 == 0) goto L18
                X.0ZVm r0 = X.C900800ZVm.LIZ
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
            L18:
                r6 = r11
                int r0 = r6.getChatType()
                boolean r0 = X.C0ZWZ.LIZ(r5, r0)
                r3 = r9
                if (r0 != 0) goto L31
                X.0Z40 r1 = com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService.LIZ
                X.0ZVu r0 = X.EnumC900880ZVu.GROUP_SHOT_BTN
                r1.getClass()
                boolean r0 = X.C0Z40.LIZ(r0)
                if (r0 == 0) goto L57
            L31:
                if (r3 == 0) goto L57
                X.19EG r2 = r3.getActivity()
                if (r2 == 0) goto L57
                X.0ZqH r0 = X.C912070ZqH.LIZIZ
                X.0Zq3 r1 = r0.LJIIZILJ()
                if (r12 == 0) goto L55
                java.lang.String r0 = X.C0ZTJ.LIZIZ(r12)
            L45:
                X.0IBX r1 = r1.LIZJ(r2, r6, r0)
                if (r1 == 0) goto L57
                X.0ZVh r0 = new X.0ZVh
                r0.<init>(r1)
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
            L55:
                r0 = 0
                goto L45
            L57:
                X.0IBW r0 = X.C0IBW.LIZ
                r0.getClass()
                boolean r0 = X.C0IBW.LIZJ(r5, r6, r7, r15)
                if (r0 != 0) goto L6f
                X.0Z40 r1 = com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService.LIZ
                X.0ZVu r0 = X.EnumC900880ZVu.SHOW_TRY_EFFECT
                r1.getClass()
                boolean r0 = X.C0Z40.LIZ(r0)
                if (r0 == 0) goto L8e
            L6f:
                if (r3 == 0) goto L8e
                android.content.Context r2 = r3.getContext()
                if (r2 == 0) goto L8e
                X.0ZVh r0 = new X.0ZVh
                X.0Hzi r1 = new X.0Hzi
                com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.TryEffectMobViewModel r4 = X.C900770ZVj.LIZ(r3)
                if (r7 != 0) goto L83
                java.lang.String r7 = ""
            L83:
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.<init>(r1)
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
            L8e:
                X.0ZVm r0 = X.C900800ZVm.LIZ
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C900730ZVf.LIZIZ(androidx.fragment.app.Fragment, X.0Y9l, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate, boolean, java.lang.String, boolean):java.util.List");
        }
    });
}
