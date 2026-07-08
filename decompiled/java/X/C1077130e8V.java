package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.minis.page.MinisReportActivity;
import com.ss.android.ugc.aweme.spark.bullet.IBulletService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e8V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077130e8V extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                updateDrawState$2(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C1077130e8V c1077130e8V, View view) {
        ((C15QK) c1077130e8V.l0).LLLLLLIL((Context) c1077130e8V.l1, true);
    }

    public static final void onClick$1(C1077130e8V c1077130e8V, View view) {
        C1072030e0H c1072030e0H = (C1072030e0H) c1077130e8V.l0;
        if (c1072030e0H != null) {
            C1071990e0D c1071990e0D = C1071990e0D.LIZ;
            String str = c1072030e0H.LIZ;
            String str2 = c1072030e0H.LIZIZ;
            int i = c1072030e0H.LIZJ;
            EnumC1072080e0M enumC1072080e0M = EnumC1072080e0M.LEARN_MORE;
            c1071990e0D.getClass();
            C1071990e0D.LIZ(str, str2, i, enumC1072080e0M);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://support.tiktok.com/");
        C338980DQq.LIZ.getClass();
        String appLanguage = ((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage();
        if (Intrinsics.LJFF(appLanguage, "he")) {
            appLanguage = "he_IL";
        } else if (Intrinsics.LJFF(appLanguage, "zh-Hant")) {
            appLanguage = "zh-Hant-TW";
        }
        sbLIZ.append(appLanguage);
        sbLIZ.append("/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok");
        ((IBulletService) ServiceManager.get().getService(IBulletService.class)).LIZ((Context) c1077130e8V.l1, UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", C2188811AlT.LIZIZ(sbLIZ)).build().toString());
    }

    public static final void onClick$2(C1077130e8V c1077130e8V, View view) {
        MinisReportActivity minisReportActivity = (MinisReportActivity) c1077130e8V.l0;
        String str = minisReportActivity.LLJILJILJ;
        if (str != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jumpTermPage, url:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            AbstractC1893000zMQ abstractC1893000zMQ = new AbstractC1893000zMQ() { // from class: X.0dtN
                public View LL;

                @Override // X.InterfaceC1892990zMP
                public final void LJIILL(int i2) {
                }

                @Override // X.InterfaceC1892990zMP
                public final void LJJJI(int i2) {
                }

                @Override // X.AbstractC1893000zMQ, X.InterfaceC1163130gND
                public final void release() {
                    this.LL = null;
                }

                @Override // X.InterfaceC1892990zMP
                public final View LJFF(Context context) {
                    View viewSd = C786410Ut5.Sd(R.layout.eas, C786410Ut5.ne(context), null);
                    this.LL = viewSd;
                    return viewSd;
                }

                @Override // X.InterfaceC1892990zMP
                public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
                    TuxTextView tuxTextView;
                    View view2 = this.LL;
                    if (view2 != null) {
                        tuxTextView = (TuxTextView) view2.findViewById(R.id.cs9);
                    } else {
                        tuxTextView = null;
                    }
                    int i2 = C1067730dtL.LIZ[enumC1067700dtI.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4 && tuxTextView != null) {
                                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                                    tuxTextView.setText("Share");
                                    return;
                                }
                                return;
                            }
                            if (tuxTextView == null) {
                                return;
                            }
                            C786410Ut5.LLLLZLL(tuxTextView, 0);
                            tuxTextView.setText("Collect");
                            return;
                        }
                        if (tuxTextView == null) {
                            return;
                        }
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                        tuxTextView.setText("Report");
                        return;
                    }
                    if (tuxTextView == null) {
                        return;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }

                @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
                public final void LJJII(boolean z) {
                    TuxIconView tuxIconView;
                    int i2;
                    View view2 = this.LL;
                    if (view2 != null && (tuxIconView = (TuxIconView) view2.findViewById(R.id.l_a)) != null) {
                        if (z) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        C786410Ut5.LLLLLLZZ(tuxIconView, i2);
                    }
                }

                @Override // X.InterfaceC1892990zMP
                public final void LJJJJ(boolean z) {
                    ImageView imageView;
                    int i2;
                    View view2 = this.LL;
                    if (view2 != null && (imageView = (ImageView) view2.findViewById(R.id.lc1)) != null) {
                        if (z) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        C786410Ut5.LJZI(i2, imageView);
                    }
                }

                @Override // X.InterfaceC1892990zMP
                public final void setBackClickListener(View.OnClickListener onClickListener) {
                    TuxIconView tuxIconView;
                    View view2 = this.LL;
                    if (view2 != null && (tuxIconView = (TuxIconView) view2.findViewById(R.id.l_a)) != null) {
                        C786410Ut5.a9(tuxIconView, onClickListener);
                    }
                }

                @Override // X.InterfaceC1892990zMP
                public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
                    ImageView imageView;
                    View view2 = this.LL;
                    if (view2 != null && (imageView = (ImageView) view2.findViewById(R.id.lc1)) != null) {
                        C786410Ut5.Q7(imageView, onClickListener);
                    }
                }

                @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
                public final void setSubTitle(String str2) {
                    TuxTextView tuxTextView;
                    View view2 = this.LL;
                    if (view2 != null && (tuxTextView = (TuxTextView) view2.findViewById(R.id.tv_sub_title)) != null) {
                        tuxTextView.setText(str2);
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                    }
                }

                @Override // X.InterfaceC1892990zMP
                public final void setTitle(String str2) {
                    TuxTextView tuxTextView;
                    View view2 = this.LL;
                    if (view2 != null && (tuxTextView = (TuxTextView) view2.findViewById(R.id.tv_title)) != null) {
                        tuxTextView.setText(str2);
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                    }
                }
            };
            abstractC1893000zMQ.LJJIFFI(EnumC1067700dtI.TYPE_NONE);
            abstractC1893000zMQ.setBackClickListener(new ACListenerS151S0100000_16(minisReportActivity, 140));
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            sparkContext.LJJLIIIJLJLI(new C1905960zhK());
            sparkContext.LJJLIIIJLLLLLLLZ(abstractC1893000zMQ);
            sparkContext.bizCert = new ThirdPartyBizCert(402685961);
            sparkContext.LJJLIIIIJ(new C1067800dtS());
            c1537900q7g.getClass();
            new C1541950qED(minisReportActivity, sparkContext).LIZIZ();
        }
    }

    public static final void updateDrawState$0(C1077130e8V c1077130e8V, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C1077130e8V c1077130e8V, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.a1j, (Context) c1077130e8V.l1));
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C1077130e8V c1077130e8V, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Integer num = (Integer) c1077130e8V.l1;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
    }

    public C1077130e8V(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
