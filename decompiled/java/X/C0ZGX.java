package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.quickchat.InputViewDelegateFactory;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZGX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0ZGX extends C2217421BqW implements Function1<C0I0H, InterfaceC457250HwR> {
    public final /* synthetic */ C0Y8T LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ EnumC896890ZGl LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C0SZG LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ Function1<CharSequence, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZGX(C0Y8T c0y8t, C19EG c19eg, String str, Aweme aweme, boolean z, EnumC896890ZGl enumC896890ZGl, String str2, String str3, C0SZG c0szg, boolean z2, Function1 function1) {
        super(1, C1449605lu.class, "getInputViewDelegate", "replyToConversation$getInputViewDelegate$17(Lcom/bytedance/im/core/conversation/core/model/Conversation;Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;ZLcom/ss/android/ugc/aweme/im/sharepanel/api/model/QuickDMEntranceType;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/im/service/ISendQuickReplyEmojiListener;ZLkotlin/jvm/functions/Function1;Lcom/ss/android/ugc/aweme/im/quickchat/QuickMessageDisplayAbility;)Lcom/ss/android/ugc/aweme/im/quickchat/InputViewFragmentDelegate;", 0);
        this.LL = c0y8t;
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
        this.LLILZ = aweme;
        this.LLILZIL = z;
        this.LLILZLL = enumC896890ZGl;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = c0szg;
        this.LLJI = z2;
        this.LLJIJIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC457250HwR invoke(C0I0H c0i0h) {
        final C0I0H c0i0h2 = c0i0h;
        final C0Y8T c0y8t = this.LL;
        Activity activity = this.LLILLJJLI;
        final String str = this.LLILLL;
        final Aweme aweme = this.LLILZ;
        final boolean z = this.LLILZIL;
        final EnumC896890ZGl enumC896890ZGl = this.LLILZLL;
        final String str2 = this.LLIZ;
        final String str3 = this.LLIZLLLIL;
        final C0SZG c0szg = this.LLJ;
        final boolean z2 = this.LLJI;
        final Function1<CharSequence, Unit> function1 = this.LLJIJIL;
        IMChatService iMChatService = IMChatService.LIZIZ;
        final C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C896710ZFt(c0y8t, activity, str, aweme, z, enumC896890ZGl, str2, str3));
        return new InterfaceC457250HwR(c01gwLIZIZ, c0i0h2, c0szg, z, z2, enumC896890ZGl, c0y8t, aweme, str, str2, str3, function1) { // from class: X.0ZGa
            public final /* synthetic */ InterfaceC457250HwR LIZ;
            public final /* synthetic */ C0SZG LIZIZ;
            public final /* synthetic */ boolean LIZJ;
            public final /* synthetic */ boolean LIZLLL;
            public final /* synthetic */ EnumC896890ZGl LJ;
            public final /* synthetic */ C0Y8T LJFF;
            public final /* synthetic */ Aweme LJI;
            public final /* synthetic */ String LJII;
            public final /* synthetic */ String LJIIIIZZ;
            public final /* synthetic */ String LJIIIZ;
            public final /* synthetic */ Function1<CharSequence, Unit> LJIIJ;

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
            public final boolean LJ() {
                return this.LIZ.LJ();
            }

            @Override // X.InterfaceC457250HwR
            public final void LJI() {
                this.LIZ.LJI();
            }

            @Override // X.InterfaceC457250HwR
            public final void LJII(boolean z3) {
                this.LIZ.LJII(z3);
            }

            @Override // X.InterfaceC457250HwR
            public final void LJIIIIZZ(DMCreativeStickerFontData dMCreativeStickerFontData) {
                this.LIZ.LJIIIIZZ(dMCreativeStickerFontData);
            }

            @Override // X.InterfaceC457250HwR
            public final void LJIIIZ(SetSticker setSticker) {
                this.LIZ.LJIIIZ(setSticker);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [X.0ZGj] */
            @Override // X.InterfaceC457250HwR
            public final void LJFF(final CharSequence charSequence, boolean z3) {
                C0SZG c0szg2;
                C0ZGS c0zgs;
                String strLJJIJIIJI;
                boolean z4;
                if (charSequence != null) {
                    boolean z5 = this.LIZJ;
                    boolean z6 = this.LIZLLL;
                    EnumC896890ZGl enumC896890ZGl2 = this.LJ;
                    C0Y8T c0y8t2 = this.LJFF;
                    Aweme aweme2 = this.LJI;
                    String str4 = this.LJII;
                    String str5 = this.LJIIIIZZ;
                    String str6 = this.LJIIIZ;
                    final Function1<CharSequence, Unit> function12 = this.LJIIJ;
                    IMSharePanelApi.LIZ.getClass();
                    InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                    String string = charSequence.toString();
                    if (z3) {
                        c0zgs = C0ZGS.EMOJI;
                    } else {
                        c0zgs = C0ZGS.NONE;
                    }
                    if (z5) {
                        IMChatService.LIZIZ.getClass();
                        strLJJIJIIJI = IMChatService.LJJIJIIJI(enumC896890ZGl2, c0zgs);
                    } else {
                        strLJJIJIIJI = "quick_reply_pannel";
                    }
                    boolean z7 = true;
                    if (!z5 && !z6) {
                        z4 = false;
                    } else {
                        z4 = true;
                        if (!z5 || enumC896890ZGl2 == EnumC896890ZGl.TYPE_MAIN_FEED_MUF_ENTRANCE || enumC896890ZGl2 == EnumC896890ZGl.TYPE_REPOST_PANEL) {
                        }
                        shareService.LJJJJLL(c0y8t2, aweme2, new InterfaceC1361990lXx() { // from class: X.0ZGj
                            @Override // X.InterfaceC1361990lXx
                            public final /* synthetic */ void LIZIZ(HashMap map) {
                            }

                            @Override // X.InterfaceC1361990lXx
                            public final void LIZ() {
                                Function1<CharSequence, Unit> function13 = function12;
                                if (function13 != null) {
                                    function13.invoke(charSequence);
                                }
                            }
                        }, Boolean.valueOf(z4), string, str4, strLJJIJIIJI, str5, str6, z7);
                    }
                    z7 = false;
                    shareService.LJJJJLL(c0y8t2, aweme2, new InterfaceC1361990lXx() { // from class: X.0ZGj
                        @Override // X.InterfaceC1361990lXx
                        public final /* synthetic */ void LIZIZ(HashMap map) {
                        }

                        @Override // X.InterfaceC1361990lXx
                        public final void LIZ() {
                            Function1<CharSequence, Unit> function13 = function12;
                            if (function13 != null) {
                                function13.invoke(charSequence);
                            }
                        }
                    }, Boolean.valueOf(z4), string, str4, strLJJIJIIJI, str5, str6, z7);
                }
                if (z3 && charSequence != null && (c0szg2 = this.LIZIZ) != null) {
                    c0szg2.LIZIZ(null, charSequence);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZIZ = c0szg;
                this.LIZJ = z;
                this.LIZLLL = z2;
                this.LJ = enumC896890ZGl;
                this.LJFF = c0y8t;
                this.LJI = aweme;
                this.LJII = str;
                this.LJIIIIZZ = str2;
                this.LJIIIZ = str3;
                this.LJIIJ = function1;
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
