package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.quickchat.InputViewDelegateFactory;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZGV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0ZGV extends C2217421BqW implements Function1<C0I0H, InterfaceC457250HwR> {
    public final /* synthetic */ C0ZH0 LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ QuickDMEventParam LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ EnumC896890ZGl LLIZ;
    public final /* synthetic */ Aweme LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ InterfaceC714750S1x LLJIJIL;
    public final /* synthetic */ C0SZG LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ Function1<CharSequence, Unit> LLJILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLJJ;
    public final /* synthetic */ Function0<Boolean> LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZGV(C0ZH0 c0zh0, User user, C19EG c19eg, String str, QuickDMEventParam quickDMEventParam, boolean z, EnumC896890ZGl enumC896890ZGl, Aweme aweme, String str2, String str3, InterfaceC714750S1x interfaceC714750S1x, C0SZG c0szg, boolean z2, Function1 function1, Function1 function12, Function0 function0) {
        super(1, C1449605lu.class, "getInputViewDelegate", "replyToUser$getInputViewDelegate$14(Lcom/ss/android/ugc/aweme/im/sharepanel/api/model/MufQuickReplyPostType;Lcom/ss/android/ugc/aweme/profile/model/User;Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/ugc/aweme/im/service/service/QuickDMEventParam;ZLcom/ss/android/ugc/aweme/im/sharepanel/api/model/QuickDMEntranceType;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/im/sharepanel/api/model/ImBizEventParam;Lcom/ss/android/ugc/aweme/im/service/ISendQuickReplyEmojiListener;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/ss/android/ugc/aweme/im/quickchat/QuickMessageDisplayAbility;)Lcom/ss/android/ugc/aweme/im/quickchat/InputViewFragmentDelegate;", 0);
        this.LL = c0zh0;
        this.LLILLJJLI = user;
        this.LLILLL = c19eg;
        this.LLILZ = str;
        this.LLILZIL = quickDMEventParam;
        this.LLILZLL = z;
        this.LLIZ = enumC896890ZGl;
        this.LLIZLLLIL = aweme;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = interfaceC714750S1x;
        this.LLJILJIL = c0szg;
        this.LLJILJILJ = z2;
        this.LLJILLL = function1;
        this.LLJJ = function12;
        this.LLJJI = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC457250HwR invoke(C0I0H c0i0h) {
        final BaseContent.ReferenceSceneType referenceSceneType;
        C0I0H c0i0h2 = c0i0h;
        C0ZH0 c0zh0 = this.LL;
        final User user = this.LLILLJJLI;
        Activity activity = this.LLILLL;
        final String str = this.LLILZ;
        final QuickDMEventParam quickDMEventParam = this.LLILZIL;
        final boolean z = this.LLILZLL;
        final EnumC896890ZGl enumC896890ZGl = this.LLIZ;
        final Aweme aweme = this.LLIZLLLIL;
        final String str2 = this.LLJ;
        final String str3 = this.LLJI;
        final InterfaceC714750S1x interfaceC714750S1x = this.LLJIJIL;
        final C0SZG c0szg = this.LLJILJIL;
        final boolean z2 = this.LLJILJILJ;
        final Function1<CharSequence, Unit> function1 = this.LLJILLL;
        final Function1<Boolean, Unit> function12 = this.LLJJ;
        final Function0<Boolean> function0 = this.LLJJI;
        IMChatService iMChatService = IMChatService.LIZIZ;
        if (c0zh0 == C0ZH0.REPOST) {
            referenceSceneType = BaseContent.ReferenceSceneType.REPLY_TO_REPOST;
        } else {
            referenceSceneType = null;
        }
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C896740ZFw(user, activity, str, quickDMEventParam, z, enumC896890ZGl, aweme, str2, str3, referenceSceneType, interfaceC714750S1x));
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(InputViewDelegateFactory.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            final C0ZGL c0zglLIZ = ((InputViewDelegateFactory) objPluggableSpi$default).LIZ(c01gwLIZIZ, c0i0h2, null);
            return new InterfaceC457250HwR(c0szg, user, aweme, str, str2, z, z2, enumC896890ZGl, referenceSceneType, str3, interfaceC714750S1x, quickDMEventParam, function1, function12, function0) { // from class: X.0ZGc
                public final /* synthetic */ InterfaceC457250HwR LIZ;
                public final /* synthetic */ C0SZG LIZJ;
                public final /* synthetic */ User LIZLLL;
                public final /* synthetic */ Aweme LJ;
                public final /* synthetic */ String LJFF;
                public final /* synthetic */ String LJI;
                public final /* synthetic */ boolean LJII;
                public final /* synthetic */ boolean LJIIIIZZ;
                public final /* synthetic */ EnumC896890ZGl LJIIIZ;
                public final /* synthetic */ BaseContent.ReferenceSceneType LJIIJ;
                public final /* synthetic */ String LJIIJJI;
                public final /* synthetic */ InterfaceC714750S1x LJIIL;
                public final /* synthetic */ QuickDMEventParam LJIILIIL;
                public final /* synthetic */ Function1<CharSequence, Unit> LJIILJJIL;
                public final /* synthetic */ Function1<Boolean, Unit> LJIILL;
                public final /* synthetic */ Function0<Boolean> LJIILLIIL;

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
                public final void LIZLLL(StickerItem stickerItem, boolean z3) {
                    this.LIZ.LIZLLL(stickerItem, z3);
                }

                @Override // X.InterfaceC457250HwR
                public final void LJI() {
                    this.LIZ.LJI();
                }

                @Override // X.InterfaceC457250HwR
                public final void LJIIIIZZ(DMCreativeStickerFontData dMCreativeStickerFontData) {
                    this.LIZ.LJIIIIZZ(dMCreativeStickerFontData);
                }

                @Override // X.InterfaceC457250HwR
                public final void LJIIIZ(SetSticker setSticker) {
                    this.LIZ.LJIIIZ(setSticker);
                }

                @Override // X.InterfaceC457250HwR
                public final boolean LJ() {
                    Function0<Boolean> function02 = this.LJIILLIIL;
                    return function02 == null ? this.LIZIZ.LJ() : function02.invoke().booleanValue();
                }

                @Override // X.InterfaceC457250HwR
                public final void LJII(boolean z3) {
                    Function1<Boolean, Unit> function13 = this.LJIILL;
                    if (function13 == null) {
                        this.LIZIZ.LJII(z3);
                    } else {
                        function13.invoke(Boolean.valueOf(z3));
                    }
                }

                @Override // X.InterfaceC457250HwR
                public final void LJFF(final CharSequence charSequence, boolean z3) {
                    C0SZG c0szg2;
                    C0ZGS c0zgs;
                    boolean z4;
                    if (charSequence != null) {
                        User user2 = this.LIZLLL;
                        Aweme aweme2 = this.LJ;
                        String str4 = this.LJFF;
                        String str5 = this.LJI;
                        boolean z5 = this.LJII;
                        boolean z6 = this.LJIIIIZZ;
                        EnumC896890ZGl enumC896890ZGl2 = this.LJIIIZ;
                        BaseContent.ReferenceSceneType referenceSceneType2 = this.LJIIJ;
                        String str6 = this.LJIIJJI;
                        InterfaceC714750S1x interfaceC714750S1x2 = this.LJIIL;
                        QuickDMEventParam quickDMEventParam2 = this.LJIILIIL;
                        final Function1<CharSequence, Unit> function13 = this.LJIILJJIL;
                        IMSharePanelApi.LIZ.getClass();
                        InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                        String string = charSequence.toString();
                        if (z3) {
                            c0zgs = C0ZGS.EMOJI;
                        } else {
                            c0zgs = C0ZGS.NONE;
                        }
                        String strLJJIJL = IMChatService.LJJIJL(quickDMEventParam2, z5, enumC896890ZGl2, c0zgs);
                        boolean z7 = false;
                        if (!z5 && !z6) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        if (z5 && enumC896890ZGl2 != EnumC896890ZGl.TYPE_MAIN_FEED_MUF_ENTRANCE && enumC896890ZGl2 != EnumC896890ZGl.TYPE_REPOST_PANEL) {
                            z7 = true;
                        }
                        shareService.LJIJJ(string, null, user2, aweme2, str4, strLJJIJL, str5, boolValueOf, z7, referenceSceneType2, str6, interfaceC714750S1x2, IMChatService.LJJIJLIJ(user2, aweme2, quickDMEventParam2, C0ZGS.EMOJI), new InterfaceC1361990lXx() { // from class: X.0ZGh
                            @Override // X.InterfaceC1361990lXx
                            public final /* synthetic */ void LIZIZ(HashMap map) {
                            }

                            @Override // X.InterfaceC1361990lXx
                            public final void LIZ() {
                                Function1<CharSequence, Unit> function14 = function13;
                                if (function14 != null) {
                                    function14.invoke(charSequence);
                                }
                            }
                        });
                    }
                    if (z3 && charSequence != null && (c0szg2 = this.LIZJ) != null) {
                        c0szg2.LIZIZ(null, charSequence);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZJ = c0szg;
                    this.LIZLLL = user;
                    this.LJ = aweme;
                    this.LJFF = str;
                    this.LJI = str2;
                    this.LJII = z;
                    this.LJIIIIZZ = z2;
                    this.LJIIIZ = enumC896890ZGl;
                    this.LJIIJ = referenceSceneType;
                    this.LJIIJJI = str3;
                    this.LJIIL = interfaceC714750S1x;
                    this.LJIILIIL = quickDMEventParam;
                    this.LJIILJJIL = function1;
                    this.LJIILL = function12;
                    this.LJIILLIIL = function0;
                    this.LIZ = this.LIZIZ;
                }
            };
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
