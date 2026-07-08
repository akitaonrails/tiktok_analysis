package X;

import Y.ARunnableS106S0100000_6;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.quickchat.InputViewDelegateFactory;
import com.ss.android.ugc.aweme.im.service.impl.edit.EditShareSendToPanelUtils;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I22, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0I22 extends C2217421BqW implements Function1<C0I0H, InterfaceC457250HwR> {
    public final /* synthetic */ IMContact LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0I22(IMContact iMContact, C19EG c19eg, String str, String str2, String str3, Function1<? super Boolean, Unit> function1) {
        super(1, C1449605lu.class, "getInputViewDelegate", "openSendToPanel$getInputViewDelegate(Lcom/ss/android/ugc/aweme/im/contacts/api/model/IMContact;Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/ss/android/ugc/aweme/im/quickchat/QuickMessageDisplayAbility;)Lcom/ss/android/ugc/aweme/im/quickchat/InputViewFragmentDelegate;", 0);
        this.LL = iMContact;
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC457250HwR invoke(C0I0H c0i0h) {
        final C0I0H c0i0h2 = c0i0h;
        final IMContact iMContact = this.LL;
        final C19EG c19eg = this.LLILLJJLI;
        final String str = this.LLILLL;
        final String str2 = this.LLILZ;
        final String str3 = this.LLILZIL;
        final Function1<Boolean, Unit> function1 = this.LLILZLL;
        final C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0ZGB(iMContact, c19eg, str, str2, str3));
        return new InterfaceC457250HwR(c01gwLIZIZ, c0i0h2, str, iMContact, c19eg, str3, str2, function1) { // from class: X.0I21
            public final /* synthetic */ InterfaceC457250HwR LIZ;
            public final /* synthetic */ C0I0H LIZIZ;
            public final /* synthetic */ String LIZJ;
            public final /* synthetic */ IMContact LIZLLL;
            public final /* synthetic */ C19EG LJ;
            public final /* synthetic */ String LJFF;
            public final /* synthetic */ String LJI;
            public final /* synthetic */ Function1<Boolean, Unit> LJII;

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
                return true;
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
            public final void LJII(boolean z) {
                Function1<Boolean, Unit> function12 = this.LJII;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(z));
                }
            }

            @Override // X.InterfaceC457250HwR
            public final void LJFF(CharSequence charSequence, boolean z) {
                String string;
                C0YHX c0yhxLIZ;
                C0YOZ c0yozLJFF;
                if (charSequence != null && (string = charSequence.toString()) != null) {
                    EditShareSendToPanelUtils editShareSendToPanelUtils = EditShareSendToPanelUtils.LIZ;
                    String str4 = this.LIZJ;
                    String displayName = this.LIZLLL.getDisplayName();
                    if (displayName == null) {
                        displayName = "";
                    }
                    C19EG c19eg2 = this.LJ;
                    final C0I0H c0i0h3 = this.LIZIZ;
                    String str5 = this.LJFF;
                    String str6 = this.LJI;
                    editShareSendToPanelUtils.getClass();
                    TextContent textContent = new TextContent(string, null, null, null);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_from", str6);
                    linkedHashMap.put("enter_method", str5);
                    String string2 = c19eg2.getString(2131837002, displayName);
                    C1389890mGx c1389890mGx = new C1389890mGx(c19eg2);
                    c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                    c1389890mGx.LJII(R.attr.a1h);
                    c1389890mGx.LJIIJ(string2);
                    c1389890mGx.LJIIJJI();
                    if (C455040Hss.LIZ()) {
                        IIMCoreProxyService.LIZ.getClass();
                        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
                        if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                            c0yozLJFF.LJI(new C0YP2(new C1265504xJ(str4), C877840YcA.LIZ(textContent), new C459930I1v(C051M.LJ(textContent, false)), null, null, null, linkedHashMap, null, null, null, null, null, 16312), new C0IC5(null, 3), new C0YOY() { // from class: X.0I23
                                @Override // X.C0YOY
                                public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                    if (interfaceC873750YPl instanceof C0YPL) {
                                        C786410Ut5.LJJZZIII(EditShareSendToPanelUtils.LIZIZ, new ARunnableS106S0100000_6(c0i0h3, 336));
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                    C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                    c874730YTfLIZ.LIZIZ.LJFF = str4;
                    c874730YTfLIZ.LIZIZ(textContent);
                    c874730YTfLIZ.LIZIZ.LJIILIIL = linkedHashMap;
                    c874730YTfLIZ.LJFF(new C0YTK() { // from class: X.0I1u
                        @Override // X.C0YTK
                        public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
                        }

                        @Override // X.C0YTY
                        public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
                        }

                        @Override // X.C0YTK
                        public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                        }

                        @Override // X.C0YTY
                        public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                        }

                        @Override // X.C0YTK
                        public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                        }

                        @Override // X.C0YTK
                        public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                            c0i0h3.Gk(C0I0E.ACTION_SEND_MESSAGE);
                        }
                    });
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZIZ = c0i0h2;
                this.LIZJ = str;
                this.LIZLLL = iMContact;
                this.LJ = c19eg;
                this.LJFF = str3;
                this.LJI = str2;
                this.LJII = function1;
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
