package X;

import android.content.Context;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.CPCUtilsKt$destroyHandling$1;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftCpcFaqUrlSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS135S0110000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import qo2.w;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0fZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132570fZv {
    public static final void LIZLLL(Context context, String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cpc_faq_click");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJII(str, "click_from");
        c474500IjALIZ.LIZ();
        Uri uri = UriProtector.parse(LiveGiftCpcFaqUrlSetting.INSTANCE.getValue());
        uri.buildUpon().appendQueryParameter("show_from", str);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        w.LIZ.getClass();
        builderBuildUpon.appendQueryParameter("enter_from_merge", w.LJIIIZ());
        uri.buildUpon().appendQueryParameter("enter_method", w.LJIIL());
        if (z) {
            IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                sbLIZ.append("?landscape=1&trait_mode=dark");
                Uri uriLJJL = C500260Jjc.LJJL(C500260Jjc.LJJL(uri, "url", C2188811AlT.LIZIZ(sbLIZ)), "height", String.valueOf((int) C497740JfY.LJJI(-1)));
                String strValueOf = String.valueOf((int) C497740JfY.LJJI(C497740JfY.LJIIIZ(R.dimen.arw)));
                Uri.Builder builderAppendQueryParameter = uriLJJL.buildUpon().appendQueryParameter("width", strValueOf).appendQueryParameter("landscape_width", strValueOf);
                if (TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJJL, "land_scape_custom_gravity"))) {
                    builderAppendQueryParameter.appendQueryParameter("land_scape_custom_gravity", "1");
                }
                iActionHandlerService.handle(context, builderAppendQueryParameter.build());
                return;
            }
            return;
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, uri);
    }

    public static final void LIZJ(boolean z, String str, TextView textView, TextView textView2, String str2) {
        String str3;
        String strJ4;
        if (!z) {
            str3 = "%s %s";
        } else {
            str3 = "%s\n\n%s";
        }
        Object[] objArr = new Object[2];
        objArr[0] = textView.getText().toString();
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        Pair<String, String> pairLIZ = C430600GuY.LIZ(C786410Ut5.j4(str3, Arrays.copyOf(objArr, 2)), e3.e, e3.f);
        textView.setText(C430600GuY.LIZIZ(textView.getContext(), pairLIZ.getSecond(), null, 0, pairLIZ.getFirst(), null, 92));
        if (str2 != null && C500260Jjc.LJJIIZ(str2)) {
            C500260Jjc.LLFFF(textView2);
            if (C497740JfY.LJJ()) {
                strJ4 = C786410Ut5.j4("%s %s", Arrays.copyOf(new Object[]{"<", str2}, 2));
            } else {
                strJ4 = C786410Ut5.j4("%s %s", Arrays.copyOf(new Object[]{str2, ">"}, 2));
            }
            textView2.setText(strJ4);
            C786410Ut5.T7(textView2, new View.OnClickListener() { // from class: X.0fa1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1132570fZv.LIZLLL(view.getContext(), "convenient_gif_popup", false);
                }
            });
            return;
        }
        C500260Jjc.LJIILIIL(textView2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.os.CountDownTimer] */
    public static final void LJ(InterfaceC1171660gay interfaceC1171660gay, LiveCPCViewModel liveCPCViewModel, C1133890fc3 c1133890fc3, boolean z, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12) {
        if (!C1132580fZw.LJ()) {
            if (C1132580fZw.LIZJ() && function1 != null) {
                function1.invoke(Boolean.valueOf(C1132580fZw.LIZ().giftFaq));
            }
            if (c1133890fc3 != null) {
                C500260Jjc.LJIILIIL(c1133890fc3);
            }
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        C259800zU c259800zU = new C259800zU();
        if (C1132580fZw.LIZLLL()) {
            liveCPCViewModel.getClass();
            boolean zLJI = MethodIDManager.LJI(202133);
            liveCPCViewModel.withState(new AwS596S0100000_17(liveCPCViewModel, 664));
            if (zLJI) {
                MethodIDManager.LJ();
            }
            C11EA.LJIIL(interfaceC1171660gay, liveCPCViewModel, new C1132560fZu(c259800zU, c1133890fc3, z, function1, function12));
        } else {
            CpcPromptResponse cpcPromptResponseLIZ = C1132580fZw.LIZ();
            c259800zU.element = LIZ(c1133890fc3, EnumC1132600fZy.SCENE_1_GIFT_PANEL, cpcPromptResponseLIZ.prompt, cpcPromptResponseLIZ.redirectLinkText, cpcPromptResponseLIZ.giftFaq, z, function1, function12, null);
        }
        interfaceC1171660gay.getLifecycle().addObserver(new CPCUtilsKt$destroyHandling$1(new AwS561S0100000_17(c259800zU, (C259800zU<CountDownTimer>) 618)));
    }

    public static final CountDownTimer LIZ(final C1133890fc3 c1133890fc3, EnumC1132600fZy enumC1132600fZy, String str, String str2, final boolean z, boolean z2, final Function1<? super Boolean, Unit> function1, final Function1<? super Boolean, Unit> function12, final Function0<Unit> function0) {
        final long jLongValue;
        CountDownTimer countDownTimerStart = null;
        if (c1133890fc3 != null) {
            if (str != null && str.length() != 0) {
                C500260Jjc.LJIILLIIL(c1133890fc3);
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                if (str2 != null) {
                    str3 = str2;
                }
                c1133890fc3.LLILZ = str;
                c1133890fc3.LLILZIL = str3;
                c1133890fc3.requestLayout();
                Long lValueOf = Long.valueOf(C1132580fZw.LIZ().timeIntervalForDisplay * 1000);
                if (lValueOf.longValue() > 0) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 10000;
                }
                countDownTimerStart = new CountDownTimer(jLongValue, c1133890fc3, function12, function1, z, function0) { // from class: X.0fXQ
                    public final /* synthetic */ C1133890fc3 LIZ;
                    public final /* synthetic */ Function1<Boolean, Unit> LIZIZ;
                    public final /* synthetic */ Function1<Boolean, Unit> LIZJ;
                    public final /* synthetic */ boolean LIZLLL;
                    public final /* synthetic */ Function0<Unit> LJ;

                    @Override // android.os.CountDownTimer
                    public final void onTick(long j) {
                    }

                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        C500260Jjc.LJIILIIL(this.LIZ);
                        Function1<Boolean, Unit> function13 = this.LIZIZ;
                        if (function13 != null) {
                            function13.invoke(Boolean.FALSE);
                        }
                        Function1<Boolean, Unit> function14 = this.LIZJ;
                        if (function14 != null) {
                            function14.invoke(Boolean.valueOf(this.LIZLLL));
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_bottom_faq_button_show");
                        c474500IjALIZ.LJIIIIZZ();
                        c474500IjALIZ.LIZ();
                        Function0<Unit> function02 = this.LJ;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(jLongValue, jLongValue);
                        this.LIZ = c1133890fc3;
                        this.LIZIZ = function12;
                        this.LIZJ = function1;
                        this.LIZLLL = z;
                        this.LJ = function0;
                    }
                }.start();
                c1133890fc3.setOnText2Clicked(new AwS135S0110000_17(c1133890fc3, z2, 11));
                C500260Jjc.LLFFF(c1133890fc3);
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
                int i = C1132610fZz.LIZ[enumC1132600fZy.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_goal_cpc_popup");
                        c474500IjALIZ.LJIIIIZZ();
                        c474500IjALIZ.LIZ();
                    }
                } else {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gift_panel_cpc_popup");
                    c474500IjALIZ2.LJIIIIZZ();
                    c474500IjALIZ2.LIZ();
                    return countDownTimerStart;
                }
            } else {
                C500260Jjc.LJIILIIL(c1133890fc3);
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                }
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
                return null;
            }
        }
        return countDownTimerStart;
    }
}
