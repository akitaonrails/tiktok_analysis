package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListVideoClickAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ZSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZSQ {
    public final C900860ZVs<VideoCardTemplate> LIZ = new C900860ZVs<>(new InterfaceC900870ZVt<VideoCardTemplate>() { // from class: X.0ZVg
        @Override // X.InterfaceC900870ZVt
        public final List<InterfaceC900840ZVq> LIZLLL() {
            return C1697810uHb.LJIIJJI(C900830ZVp.LIZ, C900820ZVo.LIZ);
        }

        @Override // X.InterfaceC900870ZVt
        public final boolean LJIIIIZZ() {
            return true;
        }

        @Override // X.InterfaceC900870ZVt
        public final boolean LJIILIIL() {
            return true;
        }

        @Override // X.InterfaceC900870ZVt
        public final String getScene() {
            return "video-message-template";
        }

        @Override // X.InterfaceC900870ZVt
        public final EnumC900890ZVv LIZ() {
            return EnumC900890ZVv.VIDEO_THUMBNAIL_EMPTY;
        }

        @Override // X.InterfaceC900870ZVt
        public final BaseTemplate LJ(C869590Y9l c869590Y9l) {
            BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
            if (!(baseTemplateLIZ instanceof VideoCardTemplate)) {
                return null;
            }
            return baseTemplateLIZ;
        }

        @Override // X.InterfaceC900870ZVt
        public final boolean LJFF(C869590Y9l c869590Y9l) {
            return C0ZDX.LJJJJ(c869590Y9l);
        }

        @Override // X.InterfaceC900870ZVt
        public final String LJII(BaseTemplate baseTemplate) {
            VideoCardFallbackInfoComponent videoCardFallbackInfoComponent;
            TextComponent textComponent;
            VideoCardTemplate videoCardTemplate = (VideoCardTemplate) baseTemplate;
            if (videoCardTemplate != null && (videoCardFallbackInfoComponent = videoCardTemplate.fallbackInfo) != null && (textComponent = videoCardFallbackInfoComponent.text) != null) {
                return textComponent.text;
            }
            return null;
        }

        @Override // X.InterfaceC900870ZVt
        public final C2242281CpW LJIIJJI(BaseTemplate baseTemplate) {
            VideoCardFallbackInfoComponent videoCardFallbackInfoComponent;
            VideoCardTemplate videoCardTemplate = (VideoCardTemplate) baseTemplate;
            if (videoCardTemplate != null && (videoCardFallbackInfoComponent = videoCardTemplate.fallbackInfo) != null) {
                return C2242711CqD.LIZIZ(videoCardFallbackInfoComponent);
            }
            return null;
        }

        @Override // X.InterfaceC900870ZVt
        public final List LJI(C869590Y9l c869590Y9l, BaseTemplate baseTemplate) {
            ImageComponent imageComponent;
            VideoCoverComponent videoCoverComponent;
            VideoCardTemplate videoCardTemplate = (VideoCardTemplate) baseTemplate;
            C0ZSU.LIZ.getClass();
            C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
            String strLJIIJ = c912070ZqH.LJIILJJIL().LJIIJ(c869590Y9l);
            if (strLJIIJ == null || strLJIIJ.length() <= 0) {
                if (!c912070ZqH.LJIILJJIL().LIZIZ(c869590Y9l)) {
                    strLJIIJ = c912070ZqH.LJIILJJIL().LJIIIIZZ(c869590Y9l);
                } else {
                    strLJIIJ = null;
                }
            }
            if (videoCardTemplate != null && (videoCoverComponent = videoCardTemplate.baseVideoComponent) != null) {
                imageComponent = videoCoverComponent.coverImage;
            } else {
                imageComponent = null;
            }
            return C896400ZEo.LIZ(strLJIIJ, imageComponent, null, c912070ZqH.LJIILJJIL().LJIIJJI(c869590Y9l, "cover"));
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
            ResolutionComponent resolutionComponent;
            ResolutionComponent resolutionComponent2;
            VideoCardTemplate videoCardTemplate = (VideoCardTemplate) baseTemplate;
            C0ZSU c0zsu = C0ZSU.LIZ;
            if (videoCardTemplate == null) {
                resolutionComponent2 = C0ZSU.LIZIZ;
            } else {
                c0zsu.getClass();
                ResolutionComponent[] resolutionComponentArr = new ResolutionComponent[3];
                resolutionComponentArr[0] = C912070ZqH.LIZIZ.LJIILJJIL().LJ(c869590Y9l, "cover");
                VideoCoverComponent videoCoverComponent = videoCardTemplate.baseVideoComponent;
                resolutionComponentArr[1] = videoCoverComponent.resolutionComponent;
                ImageComponent imageComponent = videoCoverComponent.coverImage;
                Object obj = null;
                if (imageComponent != null) {
                    resolutionComponent = imageComponent.resolution;
                } else {
                    resolutionComponent = null;
                }
                resolutionComponentArr[2] = resolutionComponent;
                Iterator it2 = ((ArrayList) C13LQ.LJIJI(resolutionComponentArr)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    ResolutionComponent resolutionComponent3 = (ResolutionComponent) next;
                    if (resolutionComponent3.height > 0 && resolutionComponent3.width > 0) {
                        obj = next;
                        break;
                    }
                }
                resolutionComponent2 = (ResolutionComponent) obj;
                if (resolutionComponent2 == null) {
                    resolutionComponent2 = C0ZSU.LIZIZ;
                }
            }
            c0zsu.getClass();
            return C0ZSU.LJI(resolutionComponent2);
        }

        @Override // X.InterfaceC900870ZVt
        public final C0ZW8 LIZJ(final Fragment fragment, final C869590Y9l c869590Y9l, final SessionInfo sessionInfo, BaseTemplate baseTemplate) {
            final VideoCardTemplate videoCardTemplate = (VideoCardTemplate) baseTemplate;
            return new C0ZW8() { // from class: X.0ZQR
                @Override // X.C0ZW8
                public final void onClick(View view) {
                    MessageListVideoClickAbility messageListVideoClickAbility;
                    VideoCardTemplate videoCardTemplate2;
                    Fragment fragment2 = fragment;
                    if (fragment2 == null || (messageListVideoClickAbility = (MessageListVideoClickAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment2, null), MessageListVideoClickAbility.class, null)) == null || (videoCardTemplate2 = videoCardTemplate) == null) {
                        return;
                    }
                    messageListVideoClickAbility.PJ(view, c869590Y9l, C911220Zou.LJ(c869590Y9l, Boolean.valueOf(sessionInfo.isMediaMsgMasking())), videoCardTemplate2, true);
                }
            };
        }

        @Override // X.InterfaceC900870ZVt
        public final void LJIIJ(View view, Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, BaseTemplate baseTemplate) {
            MessageListVideoClickAbility messageListVideoClickAbility;
            if (!C0ZDX.LJJJJ(c869590Y9l)) {
                if ((C0ZDX.LJJIJIIJIL(c869590Y9l) && !C0ZNY.LIZ(sessionInfo.getConversationId())) || fragment == null || (messageListVideoClickAbility = (MessageListVideoClickAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), MessageListVideoClickAbility.class, null)) == null || baseTemplate == null) {
                    return;
                }
                messageListVideoClickAbility.PJ(view, c869590Y9l, C911220Zou.LJ(c869590Y9l, Boolean.valueOf(sessionInfo.isMediaMsgMasking())), baseTemplate, true);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
        @Override // X.InterfaceC900870ZVt
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List LIZIZ(androidx.fragment.app.Fragment r12, X.C869590Y9l r13, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r14, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r15, boolean r16, java.lang.String r17, boolean r18) {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C900740ZVg.LIZIZ(androidx.fragment.app.Fragment, X.0Y9l, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate, boolean, java.lang.String, boolean):java.util.List");
        }
    });
}
