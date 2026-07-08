package X;

import Y.ACListenerS129S0200000_27;
import Y.ACListenerS148S0100000_13;
import Y.ACListenerS161S0100000_27;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGPInsufficientFundGuidanceSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0x0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class DialogC1802700x0m extends AbstractDialogC972150bPB {
    public static final /* synthetic */ int LLJJJIL = 0;
    public final C1797250wrz LLJI;
    public final Function1<Dialog, Unit> LLJIJIL;
    public final Function1<Dialog, Unit> LLJILJIL;
    public final Function1<Dialog, Unit> LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public TextView LLJJI;
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public boolean LLJJJ;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.ga1;
    }

    public final SpannableStringBuilder LJL(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(">");
        Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.esf);
        if (drawableLJIIJ != null) {
            drawableLJIIJ.setBounds(0, 0, (int) C497740JfY.LIZIZ(12.0f), (int) C497740JfY.LIZIZ(12.0f));
            drawableLJIIJ.setTint(C20736316Cj.LIZIZ(R.attr.ewy, getContext()));
            C786410Ut5.q2(spannableStringBuilder2, new ImageSpan(drawableLJIIJ, 1), 0, 1, 17);
        }
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        return spannableStringBuilder;
    }

    public final void LJLI(String str) {
        int i;
        String str2;
        String message;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        C1797250wrz c1797250wrz = this.LLJI;
        C1802410x0J c1802410x0J = c1797250wrz.LJIIIIZZ;
        if (c1802410x0J != null) {
            i = c1802410x0J.LJFF;
        } else {
            i = 0;
        }
        String str3 = "";
        if (c1802410x0J == null || (str2 = c1802410x0J.LJ) == null) {
            str2 = "";
        }
        int i2 = c1797250wrz.LIZ;
        int i3 = c1797250wrz.LIZIZ;
        int i4 = c1797250wrz.LJI;
        Exception exc = c1797250wrz.LIZJ;
        if (exc != null && (message = exc.getMessage()) != null) {
            str3 = message;
        }
        C1803800x2Y.LJIIZILJ(c1803800x2Y, i, "pay", "google-apple", str2, i2, i3, i4, str3, str, C1797420wsG.LIZ(getContext(), this.LLJI), C1797420wsG.LIZIZ(this.LLJI), this.LLJI.LIZLLL, Boolean.TRUE, null, 16896);
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean zLIZ;
        C1802730x0p c1802730x0p;
        super.onCreate(bundle);
        this.LLJILLL = findViewById(R.id.hf1);
        this.LLJJ = findViewById(R.id.hez);
        this.LLJJI = (TextView) findViewById(R.id.hf5);
        this.LLJJIII = (TextView) findViewById(R.id.hf0);
        this.LLJJIJI = (TextView) findViewById(R.id.hf3);
        this.LLJJIJIIJIL = (TextView) findViewById(R.id.hf2);
        this.LLJJIJIL = (TextView) findViewById(R.id.hf4);
        IapService iapService = (IapService) C1161920gLG.LIZJ(IapService.class);
        TextView textView = this.LLJJIJIIJIL;
        if (textView != null) {
            C786410Ut5.T7(textView, new ACListenerS129S0200000_27(iapService, this, 27));
        }
        TextView textView2 = this.LLJJIJIL;
        if (textView2 != null) {
            C786410Ut5.T7(textView2, new ACListenerS161S0100000_27(this, 120));
        }
        View view = this.LLJJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS148S0100000_13(this, 39), view);
        }
        setOnCancelListener(new DialogInterfaceOnCancelListenerC854590Xfl(this, 1));
        try {
            zLIZ = new C815520Vyw(getContext()).LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZ = false;
        }
        if (!zLIZ) {
            C500260Jjc.LJLJLJ(this.LLJJIJI, true);
            TextView textView3 = this.LLJJIJI;
            if (textView3 != null) {
                textView3.setText(LJL(C497740JfY.LJIJI(2131856844)));
            }
            TextView textView4 = this.LLJJIJI;
            if (textView4 != null) {
                C786410Ut5.T7(textView4, new ACListenerS148S0100000_13(this, 37));
            }
        } else if (!((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Aj1()) {
            C500260Jjc.LJLJLJ(this.LLJJIJI, true);
            TextView textView5 = this.LLJJIJI;
            if (textView5 != null) {
                textView5.setText(LJL(C497740JfY.LJIJI(2131856845)));
            }
            TextView textView6 = this.LLJJIJI;
            if (textView6 != null) {
                C786410Ut5.T7(textView6, new ACListenerS148S0100000_13(this, 38));
            }
        } else {
            this.LLJJJ = true;
            C500260Jjc.LJLJLJ(this.LLJJIJI, false);
        }
        C1797250wrz c1797250wrz = this.LLJI;
        int i = c1797250wrz.LIZ;
        if (i == -202) {
            TextView textView7 = this.LLJJI;
            if (textView7 != null) {
                textView7.setText(getContext().getText(2131856839));
            }
            if (this.LLJJJ) {
                TextView textView8 = this.LLJJIII;
                if (textView8 != null) {
                    textView8.setText(getContext().getText(2131856838));
                }
            } else {
                TextView textView9 = this.LLJJIII;
                if (textView9 != null) {
                    textView9.setText(getContext().getText(2131856837));
                }
            }
            TextView textView10 = this.LLJJIJIIJIL;
            if (textView10 != null) {
                C500260Jjc.LJLJLJ(textView10, true);
                return;
            }
            return;
        }
        if (i == 203 && c1797250wrz.LJI == 1) {
            TextView textView11 = this.LLJJI;
            if (textView11 != null) {
                textView11.setText(getContext().getText(2131842046));
            }
            TextView textView12 = this.LLJJIII;
            if (textView12 != null) {
                textView12.setText(getContext().getText(2131842045));
            }
            C500260Jjc.LJLJLJ(this.LLJJIJI, false);
            TextView textView13 = this.LLJJIJI;
            if (textView13 != null) {
                C786410Ut5.T7(textView13, null);
            }
            TextView textView14 = this.LLJJIJIIJIL;
            if (textView14 == null) {
                return;
            }
            C500260Jjc.LJLJLJ(textView14, true);
            return;
        }
        if (LiveWalletGPInsufficientFundGuidanceSetting.INSTANCE.getValue() != 0) {
            C1797250wrz c1797250wrz2 = this.LLJI;
            if (c1797250wrz2.LIZ == 203 && c1797250wrz2.LJI == 11) {
                View view2 = this.LLJILLL;
                if (view2 != null) {
                    C500260Jjc.LJLJLJ(view2, false);
                }
                TextView textView15 = this.LLJJI;
                if (textView15 != null) {
                    textView15.setText(getContext().getText(2131852555));
                }
                if (this.LLJJJ) {
                    TextView textView16 = this.LLJJIII;
                    if (textView16 != null) {
                        textView16.setText(getContext().getText(2131852554));
                    }
                } else {
                    TextView textView17 = this.LLJJIII;
                    if (textView17 != null) {
                        textView17.setText(getContext().getText(2131852553));
                    }
                }
                TextView textView18 = this.LLJJIJIIJIL;
                if (textView18 != null) {
                    C500260Jjc.LJLJLJ(textView18, true);
                }
                TextView textView19 = this.LLJJIJIIJIL;
                if (textView19 != null) {
                    textView19.setText(getContext().getText(2131852552));
                }
                RechargeRequestParams rechargeRequestParams = this.LLJI.LJII;
                if (rechargeRequestParams == null || (c1802730x0p = rechargeRequestParams.LIZ) == null || c1802730x0p.LIZJ.length() <= 0) {
                    return;
                }
                C500260Jjc.LJLJLJ(this.LLJJIJI, false);
                TextView textView20 = this.LLJJIJI;
                if (textView20 != null) {
                    C786410Ut5.T7(textView20, null);
                }
                TextView textView21 = this.LLJJIII;
                if (textView21 != null) {
                    textView21.setText(C497740JfY.LJIJJ(2131852956, Integer.valueOf(c1802730x0p.LIZLLL)));
                }
                TextView textView22 = this.LLJJIJIIJIL;
                if (textView22 != null) {
                    textView22.setText(C497740JfY.LJIJI(2131852955));
                }
                TextView textView23 = this.LLJJIJIL;
                if (textView23 == null) {
                    return;
                }
                textView23.setText(C497740JfY.LJIJI(2131852957));
                return;
            }
        }
        TextView textView24 = this.LLJJI;
        if (textView24 != null) {
            textView24.setText(getContext().getText(2131856842));
        }
        if (this.LLJJJ) {
            TextView textView25 = this.LLJJIII;
            if (textView25 != null) {
                textView25.setText(getContext().getText(2131856841));
            }
        } else {
            TextView textView26 = this.LLJJIII;
            if (textView26 != null) {
                textView26.setText(getContext().getText(2131856840));
            }
        }
        TextView textView27 = this.LLJJIJIIJIL;
        if (textView27 == null) {
            return;
        }
        C500260Jjc.LJLJLJ(textView27, false);
    }

    public /* synthetic */ DialogC1802700x0m(Context context, C1797250wrz c1797250wrz) {
        this(context, c1797250wrz, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogC1802700x0m(Context context, C1797250wrz c1797250wrz, Function1<? super Dialog, Unit> function1, Function1<? super Dialog, Unit> function12, Function1<? super Dialog, Unit> function13) {
        super(C1834150xpV.LJIIIZ(context));
        this.LLJI = c1797250wrz;
        this.LLJIJIL = function1;
        this.LLJILJIL = function12;
        this.LLJILJILJ = function13;
    }
}
