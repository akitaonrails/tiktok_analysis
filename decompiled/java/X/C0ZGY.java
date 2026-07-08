package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.quickchat.InputViewDelegateFactory;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS9S3300000_14;

/* JADX INFO: renamed from: X.0ZGY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0ZGY extends C2217421BqW implements Function1<C0I0H, InterfaceC457250HwR> {
    public final /* synthetic */ EnumC896890ZGl LL;
    public final /* synthetic */ QuickDMEventParam LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<CharSequence, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZGY(EnumC896890ZGl enumC896890ZGl, QuickDMEventParam quickDMEventParam, Aweme aweme, C19EG c19eg, String str, String str2, Function1 function1) {
        super(1, C1449605lu.class, "getInputViewDelegate", "replyToAwemeAuthor$getInputViewDelegate(Lcom/ss/android/ugc/aweme/im/sharepanel/api/model/QuickDMEntranceType;Lcom/ss/android/ugc/aweme/im/service/service/QuickDMEventParam;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/ss/android/ugc/aweme/im/quickchat/QuickMessageDisplayAbility;)Lcom/ss/android/ugc/aweme/im/quickchat/InputViewFragmentDelegate;", 0);
        this.LL = enumC896890ZGl;
        this.LLILLJJLI = quickDMEventParam;
        this.LLILLL = aweme;
        this.LLILZ = c19eg;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC457250HwR invoke(C0I0H c0i0h) {
        String str;
        final C0I0H c0i0h2 = c0i0h;
        EnumC896890ZGl enumC896890ZGl = this.LL;
        final QuickDMEventParam quickDMEventParam = this.LLILLJJLI;
        final Aweme aweme = this.LLILLL;
        Activity activity = this.LLILZ;
        String str2 = this.LLILZIL;
        final String str3 = this.LLILZLL;
        final Function1<CharSequence, Unit> function1 = this.LLIZ;
        IMChatService iMChatService = IMChatService.LIZIZ;
        if (C896820ZGe.LIZ[enumC896890ZGl.ordinal()] != 1 || quickDMEventParam == null || (str = quickDMEventParam.enterMethod) == null) {
            str = "head_icon";
        }
        final C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS9S3300000_14(aweme, activity, str2, str3, str, quickDMEventParam, 1));
        final String str4 = str;
        return new InterfaceC457250HwR(c01gwLIZIZ, c0i0h2, aweme, str3, str4, quickDMEventParam, function1) { // from class: X.0ZGZ
            public final /* synthetic */ InterfaceC457250HwR LIZ;
            public final /* synthetic */ C0I0H LIZIZ;
            public final /* synthetic */ Aweme LIZJ;
            public final /* synthetic */ String LIZLLL;
            public final /* synthetic */ String LJ;
            public final /* synthetic */ QuickDMEventParam LJFF;
            public final /* synthetic */ Function1<CharSequence, Unit> LJI;

            @Override // X.InterfaceC457250HwR
            public final void LIZ(C0ZGS c0zgs, String str5) {
                this.LIZ.LIZ(c0zgs, str5);
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
            public final void LJIIIZ(SetSticker setSticker) {
                this.LIZ.LJIIIZ(setSticker);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v0, types: [X.0ZGi] */
            @Override // X.InterfaceC457250HwR
            public final void LJFF(final CharSequence charSequence, boolean z) {
                C0I0E c0i0e;
                C0ZGS c0zgs;
                if (charSequence != null) {
                    C0I0H c0i0h3 = this.LIZIZ;
                    Aweme aweme2 = this.LIZJ;
                    String str5 = this.LIZLLL;
                    String str6 = this.LJ;
                    QuickDMEventParam quickDMEventParam2 = this.LJFF;
                    final Function1<CharSequence, Unit> function12 = this.LJI;
                    if (z) {
                        c0i0e = C0I0E.ACTION_SEND_QUICK_EMOJI;
                    } else {
                        c0i0e = C0I0E.ACTION_SEND_MESSAGE;
                    }
                    c0i0h3.Gk(c0i0e);
                    IMSharePanelApi.LIZ.getClass();
                    InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                    String string = charSequence.toString();
                    if (z) {
                        c0zgs = C0ZGS.EMOJI;
                    } else {
                        c0zgs = C0ZGS.NONE;
                    }
                    shareService.LJJIL(string, aweme2, str5, str6, IMChatService.LJJIJIL(str5, aweme2, quickDMEventParam2, c0zgs), new InterfaceC1361990lXx() { // from class: X.0ZGi
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
                    });
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZIZ = c0i0h2;
                this.LIZJ = aweme;
                this.LIZLLL = str3;
                this.LJ = str4;
                this.LJFF = quickDMEventParam;
                this.LJI = function1;
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
