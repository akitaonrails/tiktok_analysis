package X;

import android.text.Editable;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.quickchat.InputViewDelegateFactory;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem.viewmodel.QuickReplyEmojiViewModel;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0I29, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0I29 extends C2217421BqW implements Function1<C0I0H, InterfaceC457250HwR> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Function1<CharSequence, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0I29(C869590Y9l c869590Y9l, boolean z, C19EG c19eg, String str, String str2, String str3, String str4, String str5, int i, String str6, Function1<? super CharSequence, Unit> function1) {
        super(1, C1449605lu.class, "getInputViewDelegate", "replyMessageFromSharedFeedUnified$getInputViewDelegate$18(Lcom/bytedance/im/core/message/core/model/Message;ZLandroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/ss/android/ugc/aweme/im/quickchat/QuickMessageDisplayAbility;)Lcom/ss/android/ugc/aweme/im/quickchat/InputViewFragmentDelegate;", 0);
        this.LL = c869590Y9l;
        this.LLILLJJLI = z;
        this.LLILLL = c19eg;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = i;
        this.LLJI = str6;
        this.LLJIJIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC457250HwR invoke(C0I0H c0i0h) {
        final C0I0H c0i0h2 = c0i0h;
        final C869590Y9l c869590Y9l = this.LL;
        boolean z = this.LLILLJJLI;
        final C19EG c19eg = this.LLILLL;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        final String str3 = this.LLILZLL;
        final String str4 = this.LLIZ;
        final String str5 = this.LLIZLLLIL;
        final int i = this.LLJ;
        final String str6 = this.LLJI;
        final Function1<CharSequence, Unit> function1 = this.LLJIJIL;
        IMChatService iMChatService = IMChatService.LIZIZ;
        final C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C896690ZFr(c869590Y9l, z, c19eg, str, str2, str3, str4, str5, i, str6));
        return new InterfaceC457250HwR(c01gwLIZIZ, c0i0h2, i, str6, c869590Y9l, str3, str4, str5, c19eg, function1) { // from class: X.0I26
            public final /* synthetic */ InterfaceC457250HwR LIZ;
            public final /* synthetic */ C0I0H LIZIZ;
            public final /* synthetic */ int LIZJ;
            public final /* synthetic */ String LIZLLL;
            public final /* synthetic */ C869590Y9l LJ;
            public final /* synthetic */ String LJFF;
            public final /* synthetic */ String LJI;
            public final /* synthetic */ String LJII;
            public final /* synthetic */ C19EG LJIIIIZZ;
            public final /* synthetic */ Function1<CharSequence, Unit> LJIIIZ;

            @Override // X.InterfaceC457250HwR
            public final void LIZ(C0ZGS c0zgs, String str7) {
                this.LIZ.LIZ(c0zgs, str7);
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
            public final void LIZLLL(StickerItem stickerItem, boolean z2) {
                this.LIZ.LIZLLL(stickerItem, z2);
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
            public final void LJII(boolean z2) {
                this.LIZ.LJII(z2);
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
            public final void LJFF(CharSequence charSequence, boolean z2) {
                C0I0E c0i0e;
                C0YHX c0yhxLIZ;
                C0YOZ c0yozLJFF;
                Editable editable;
                if (charSequence != null) {
                    int i2 = this.LIZJ;
                    String str7 = this.LIZLLL;
                    C869590Y9l c869590Y9l2 = this.LJ;
                    String str8 = this.LJFF;
                    String str9 = this.LJI;
                    String str10 = this.LJII;
                    C19EG c19eg2 = this.LJIIIIZZ;
                    C0I0H c0i0h3 = this.LIZIZ;
                    Function1<CharSequence, Unit> function12 = this.LJIIIZ;
                    List listLJIIIIZZ = null;
                    FeatureAttachmentContent featureAttachmentContent = new FeatureAttachmentContent(i2, str7, Long.valueOf(c869590Y9l2.getSender()), null, null);
                    IMChatService.LIZIZ.getClass();
                    String conversationId = c869590Y9l2.getConversationId();
                    C19EG c19eg3 = null;
                    if (conversationId != null) {
                        if ((charSequence instanceof Editable) && (editable = (Editable) charSequence) != null) {
                            C0ZDT.LIZ.getClass();
                            listLJIIIIZZ = C0ZDT.LJIIIIZZ(editable);
                        }
                        TextContent textContentLJ = C0ZDT.LJ(C0ZDT.LIZ, charSequence, listLJIIIIZZ, true, featureAttachmentContent, 16);
                        ReferenceInfo referenceInfoLJII = C0ZDT.LJII(c869590Y9l2);
                        Map<String, String> mapLJFF = C0ZDT.LJFF(c869590Y9l2, str9, null, null, null);
                        mapLJFF.put("enter_from", str8);
                        mapLJFF.put("enter_method", str9);
                        if (str10.length() > 0) {
                            mapLJFF.put("shared_feed_type", str10);
                        }
                        Map<String, String> mapLIZ = C0ZDT.LIZ(listLJIIIIZZ, null, null);
                        if (C455040Hss.LIZ()) {
                            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
                            IIMCoreProxyService.LIZ.getClass();
                            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
                            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                                c0yozLJFF.LJI(new C0YP2(new C1265504xJ(conversationId), C877840YcA.LIZ(textContentLJ), new C459930I1v(C051M.LJ(textContentLJ, false)), null, null, mapLIZ, mapLJFF, null, null, null, null, referenceInfoLJII, 14232), new C0IC5(null, 3), new C0YOY() { // from class: X.0I2D
                                    @Override // X.C0YOY
                                    public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                    }
                                });
                            }
                        } else {
                            CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                            C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                            c874730YTfLIZ.LIZIZ.LJFF = conversationId;
                            c874730YTfLIZ.LIZIZ(textContentLJ);
                            C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
                            c0ytz.LJIJ = referenceInfoLJII;
                            c0ytz.LJIILIIL = mapLJFF;
                            c0ytz.LJIIIZ = mapLIZ;
                            c874730YTfLIZ.LJ();
                        }
                    }
                    if (z2) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickReplyEmojiViewModel.class);
                        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(538);
                        C0I27 c0i27 = new C0I27(c19eg2);
                        C0I28 c0i28 = new C0I28(c19eg2);
                        C338530DOx c338530DOx = new C338530DOx(c19eg2);
                        C452070Ho5 c452070Ho5 = new C452070Ho5();
                        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(c19eg2);
                        if (c19eg2 instanceof HasDefaultViewModelProviderFactory) {
                            c19eg3 = c19eg2;
                        }
                        new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(c19eg3), aFwS236S0000000_6, c0i27, c0i28, c338530DOx).getValue().setState(new AwS585S0100000_6(charSequence, 284));
                        c0i0e = C0I0E.ACTION_SEND_QUICK_EMOJI;
                    } else {
                        c0i0e = C0I0E.ACTION_SEND_MESSAGE;
                    }
                    c0i0h3.Gk(c0i0e);
                    if (function12 != null) {
                        function12.invoke(charSequence);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZIZ = c0i0h2;
                this.LIZJ = i;
                this.LIZLLL = str6;
                this.LJ = c869590Y9l;
                this.LJFF = str3;
                this.LJI = str4;
                this.LJII = str5;
                this.LJIIIIZZ = c19eg;
                this.LJIIIZ = function1;
                Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(InputViewDelegateFactory.class, false, false, false, 14, null);
                if (objPluggableSpi$default != null) {
                    C0I2B.LIZ.getClass();
                    this.LIZ = ((InputViewDelegateFactory) objPluggableSpi$default).LIZ(c01gwLIZIZ, c0i0h2, C0I2A.LIZIZ);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        };
    }
}
