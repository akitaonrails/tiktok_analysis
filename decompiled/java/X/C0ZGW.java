package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.quickchat.InputViewDelegateFactory;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZGW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0ZGW extends C2217421BqW implements Function1<C0I0H, InterfaceC457250HwR> {
    public final /* synthetic */ C0ZH0 LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ EnumC896890ZGl LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ AttachmentTypeComponent LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ InterfaceC714750S1x LLJI;
    public final /* synthetic */ Function2<CharSequence, Boolean, Unit> LLJIJIL;
    public final /* synthetic */ C0SZG LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZGW(C0ZH0 c0zh0, User user, C19EG c19eg, String str, EnumC896890ZGl enumC896890ZGl, Aweme aweme, AttachmentTypeComponent attachmentTypeComponent, String str2, String str3, InterfaceC714750S1x interfaceC714750S1x, Function2 function2, C0SZG c0szg) {
        super(1, C1449605lu.class, "getInputViewDelegate", "replyToUserWithSticker$getInputViewDelegate$15(Lcom/ss/android/ugc/aweme/im/sharepanel/api/model/MufQuickReplyPostType;Lcom/ss/android/ugc/aweme/profile/model/User;Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/ugc/aweme/im/sharepanel/api/model/QuickDMEntranceType;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/im/message/template/component/AttachmentTypeComponent;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/im/sharepanel/api/model/ImBizEventParam;Lkotlin/jvm/functions/Function2;Lcom/ss/android/ugc/aweme/im/service/ISendQuickReplyEmojiListener;Lcom/ss/android/ugc/aweme/im/quickchat/QuickMessageDisplayAbility;)Lcom/ss/android/ugc/aweme/im/quickchat/InputViewFragmentDelegate;", 0);
        this.LL = c0zh0;
        this.LLILLJJLI = user;
        this.LLILLL = c19eg;
        this.LLILZ = str;
        this.LLILZIL = enumC896890ZGl;
        this.LLILZLL = aweme;
        this.LLIZ = attachmentTypeComponent;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = interfaceC714750S1x;
        this.LLJIJIL = function2;
        this.LLJILJIL = c0szg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC457250HwR invoke(C0I0H c0i0h) {
        final BaseContent.ReferenceSceneType referenceSceneType;
        final C0I0H c0i0h2 = c0i0h;
        C0ZH0 c0zh0 = this.LL;
        final User user = this.LLILLJJLI;
        Activity activity = this.LLILLL;
        final String str = this.LLILZ;
        final EnumC896890ZGl enumC896890ZGl = this.LLILZIL;
        final Aweme aweme = this.LLILZLL;
        final AttachmentTypeComponent attachmentTypeComponent = this.LLIZ;
        final String str2 = this.LLIZLLLIL;
        final String str3 = this.LLJ;
        final InterfaceC714750S1x interfaceC714750S1x = this.LLJI;
        final Function2<CharSequence, Boolean, Unit> function2 = this.LLJIJIL;
        final C0SZG c0szg = this.LLJILJIL;
        IMChatService iMChatService = IMChatService.LIZIZ;
        if (c0zh0 == C0ZH0.REPOST) {
            referenceSceneType = BaseContent.ReferenceSceneType.REPLY_TO_REPOST;
        } else {
            referenceSceneType = null;
        }
        final C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0ZG2(user, activity, str, enumC896890ZGl, aweme, attachmentTypeComponent, str2, str3, referenceSceneType, interfaceC714750S1x));
        return new InterfaceC457250HwR(c01gwLIZIZ, c0i0h2, user, aweme, str, enumC896890ZGl, str2, referenceSceneType, str3, interfaceC714750S1x, function2, attachmentTypeComponent, c0szg) { // from class: X.0ZGb
            public final /* synthetic */ InterfaceC457250HwR LIZ;
            public final /* synthetic */ User LIZIZ;
            public final /* synthetic */ Aweme LIZJ;
            public final /* synthetic */ String LIZLLL;
            public final /* synthetic */ EnumC896890ZGl LJ;
            public final /* synthetic */ String LJFF;
            public final /* synthetic */ BaseContent.ReferenceSceneType LJI;
            public final /* synthetic */ String LJII;
            public final /* synthetic */ InterfaceC714750S1x LJIIIIZZ;
            public final /* synthetic */ Function2<CharSequence, Boolean, Unit> LJIIIZ;
            public final /* synthetic */ AttachmentTypeComponent LJIIJ;
            public final /* synthetic */ C0SZG LJIIJJI;

            @Override // X.InterfaceC457250HwR
            public final void LIZ(C0ZGS c0zgs, String str4) {
                this.LIZ.LIZ(c0zgs, str4);
            }

            @Override // X.InterfaceC457250HwR
            public final void LIZIZ(C458370HyF c458370HyF, C0HVB c0hvb) {
                this.LIZ.LIZIZ(c458370HyF, c0hvb);
            }

            @Override // X.InterfaceC457250HwR
            @InterfaceC1294060jmO
            public final void LIZJ(VideoSticker videoSticker) {
                this.LIZ.LIZJ(videoSticker);
            }

            @Override // X.InterfaceC457250HwR
            public final void LIZLLL(StickerItem stickerItem, boolean z) {
                this.LIZ.LIZLLL(stickerItem, z);
            }

            @Override // X.InterfaceC457250HwR
            public final boolean LJ() {
                return this.LIZ.LJ();
            }

            @Override // X.InterfaceC457250HwR
            public final void LJI() {
                this.LIZ.LJI();
            }

            @Override // X.InterfaceC457250HwR
            public final void LJII(boolean z) {
                this.LIZ.LJII(z);
            }

            @Override // X.InterfaceC457250HwR
            public final void LJIIIIZZ(DMCreativeStickerFontData dMCreativeStickerFontData) {
                this.LIZ.LJIIIIZZ(dMCreativeStickerFontData);
            }

            @Override // X.InterfaceC457250HwR
            public final void LJIIIZ(final SetSticker setSticker) {
                boolean z;
                if (this.LJIIJ == null) {
                    return;
                }
                IMSharePanelApi.LIZ.getClass();
                AttachmentComponent attachmentComponentLJJJJI = C1599690rjL.LIZ().getShareService().LJJJJI(this.LIZJ, this.LJIIJ, this.LIZIZ);
                if (attachmentComponentLJJJJI == null) {
                    return;
                }
                InterfaceC454710HsL imStickerMessageService = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService();
                C0I0B.LJFF.LIZJ();
                StickerTemplate stickerTemplateLJIJJLI = imStickerMessageService.LJIJJLI(setSticker, C894660Z7w.LIZ(), attachmentComponentLJJJJI, null, null);
                InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                User user2 = this.LIZIZ;
                Aweme aweme2 = this.LIZJ;
                String str4 = this.LIZLLL;
                IMChatService iMChatService2 = IMChatService.LIZIZ;
                EnumC896890ZGl enumC896890ZGl2 = this.LJ;
                C0ZGS c0zgs = C0ZGS.NONE;
                iMChatService2.getClass();
                String strLJJIJIIJI = IMChatService.LJJIJIIJI(enumC896890ZGl2, c0zgs);
                String str5 = this.LJFF;
                Boolean bool = Boolean.TRUE;
                EnumC896890ZGl enumC896890ZGl3 = this.LJ;
                if (enumC896890ZGl3 != EnumC896890ZGl.TYPE_MAIN_FEED_MUF_ENTRANCE && enumC896890ZGl3 != EnumC896890ZGl.TYPE_REPOST_PANEL) {
                    z = true;
                } else {
                    z = false;
                }
                BaseContent.ReferenceSceneType referenceSceneType2 = this.LJI;
                String str6 = this.LJII;
                InterfaceC714750S1x interfaceC714750S1x2 = this.LJIIIIZZ;
                final Function2<CharSequence, Boolean, Unit> function22 = this.LJIIIZ;
                shareService.LJIJJ(null, stickerTemplateLJIJJLI, user2, aweme2, str4, strLJJIJIIJI, str5, bool, z, referenceSceneType2, str6, interfaceC714750S1x2, new LinkedHashMap(), new InterfaceC1361990lXx() { // from class: X.0ZGg
                    public final /* synthetic */ boolean LIZJ = false;

                    @Override // X.InterfaceC1361990lXx
                    public final /* synthetic */ void LIZIZ(HashMap map) {
                    }

                    @Override // X.InterfaceC1361990lXx
                    public final void LIZ() {
                        Function2<CharSequence, Boolean, Unit> function23 = function22;
                        if (function23 != null) {
                            String name = setSticker.getName();
                            if (name == null) {
                                name = "";
                            }
                            function23.invoke(name, Boolean.valueOf(this.LIZJ));
                        }
                    }
                });
                C0SZG c0szg2 = this.LJIIJJI;
                if (c0szg2 != null) {
                    String name = setSticker.getName();
                    if (name == null) {
                        name = "";
                    }
                    c0szg2.LIZIZ(null, name);
                }
            }

            @Override // X.InterfaceC457250HwR
            public final void LJFF(final CharSequence charSequence, final boolean z) {
                C0ZGS c0zgs;
                boolean z2;
                if (charSequence != null) {
                    User user2 = this.LIZIZ;
                    Aweme aweme2 = this.LIZJ;
                    String str4 = this.LIZLLL;
                    EnumC896890ZGl enumC896890ZGl2 = this.LJ;
                    String str5 = this.LJFF;
                    BaseContent.ReferenceSceneType referenceSceneType2 = this.LJI;
                    String str6 = this.LJII;
                    InterfaceC714750S1x interfaceC714750S1x2 = this.LJIIIIZZ;
                    final Function2<CharSequence, Boolean, Unit> function22 = this.LJIIIZ;
                    IMSharePanelApi.LIZ.getClass();
                    InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                    String string = charSequence.toString();
                    IMChatService iMChatService2 = IMChatService.LIZIZ;
                    if (z) {
                        c0zgs = C0ZGS.EMOJI;
                    } else {
                        c0zgs = C0ZGS.NONE;
                    }
                    iMChatService2.getClass();
                    String strLJJIJIIJI = IMChatService.LJJIJIIJI(enumC896890ZGl2, c0zgs);
                    Boolean bool = Boolean.TRUE;
                    if (enumC896890ZGl2 != EnumC896890ZGl.TYPE_MAIN_FEED_MUF_ENTRANCE && enumC896890ZGl2 != EnumC896890ZGl.TYPE_REPOST_PANEL) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    shareService.LJIJJ(string, null, user2, aweme2, str4, strLJJIJIIJI, str5, bool, z2, referenceSceneType2, str6, interfaceC714750S1x2, new LinkedHashMap(), new InterfaceC1361990lXx() { // from class: X.0ZGf
                        @Override // X.InterfaceC1361990lXx
                        public final /* synthetic */ void LIZIZ(HashMap map) {
                        }

                        @Override // X.InterfaceC1361990lXx
                        public final void LIZ() {
                            Function2<CharSequence, Boolean, Unit> function23 = function22;
                            if (function23 != null) {
                                function23.invoke(charSequence, Boolean.valueOf(z));
                            }
                        }
                    });
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZIZ = user;
                this.LIZJ = aweme;
                this.LIZLLL = str;
                this.LJ = enumC896890ZGl;
                this.LJFF = str2;
                this.LJI = referenceSceneType;
                this.LJII = str3;
                this.LJIIIIZZ = interfaceC714750S1x;
                this.LJIIIZ = function2;
                this.LJIIJ = attachmentTypeComponent;
                this.LJIIJJI = c0szg;
                Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(InputViewDelegateFactory.class, false, false, false, 14, null);
                if (objPluggableSpi$default != null) {
                    this.LIZ = ((InputViewDelegateFactory) objPluggableSpi$default).LIZ(c01gwLIZIZ, c0i0h2, null);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        };
    }
}
