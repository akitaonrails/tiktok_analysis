package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyTrialLiveSwitchChannel;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0JTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492630JTp implements InterfaceC492580JTk {
    public final Context LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC492580JTk
    public final void LJFF(boolean z) {
    }

    @Override // X.InterfaceC492580JTk
    public final View LIZJ() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.gb3, null, false);
        LJ((C1324720kZq) viewTd.findViewById(R.id.gcr), (C1324720kZq) viewTd.findViewById(R.id.wj1), (C16F5) viewTd.findViewById(R.id.f04));
        C1143680frq.LIZLLL(viewTd.findViewById(R.id.ajo), "tiktok_live_broadcast_demand_5", "ttlive_sub_only_live_edu_after_preview_screenshot_new.png");
        View viewFindViewById = viewTd.findViewById(R.id.bv4);
        TextView textView = (TextView) viewTd.findViewById(R.id.f0p);
        Context context = this.LIZ;
        C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_broadcast_demand_5", C500260Jjc.LJJJI(context != null ? Boolean.valueOf(C426750GoL.LIZLLL(context)) : null) ? "ttlive_sub_only_live_edu_before_preview_screenshot_rtl_new.png" : "ttlive_sub_only_live_edu_before_preview_screenshot_new.png");
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131844247, "58"));
        }
        TextView textView2 = (TextView) viewTd.findViewById(R.id.guz);
        TextView textView3 = (TextView) viewTd.findViewById(R.id.gux);
        TextView textView4 = (TextView) viewTd.findViewById(R.id.wfs);
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJI(2131856617));
        }
        if (textView3 != null) {
            textView3.setText(C497740JfY.LJIJI(2131856614));
        }
        if (textView4 != null) {
            textView4.setText(C497740JfY.LJIJI(2131856631));
        }
        return viewTd;
    }

    public C492630JTp(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC492580JTk
    public final void LJ(C1324720kZq c1324720kZq, C1324720kZq c1324720kZq2, C16F5 c16f5) {
        Boolean boolValueOf;
        String str;
        ViewGroup.LayoutParams layoutParams;
        Context context = this.LIZ;
        if (context != null) {
            boolValueOf = Boolean.valueOf(C426750GoL.LIZLLL(context));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "ttlive_sub_only_live_edu_during_preview_screenshot_rtl_new.png";
        } else {
            str = "ttlive_sub_only_live_edu_during_preview_screenshot_new.png";
        }
        C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_broadcast_demand_5", str);
        if (c1324720kZq2 != null && (layoutParams = c1324720kZq2.getLayoutParams()) != null) {
            layoutParams.width = (int) C497740JfY.LIZIZ(71.25f);
            layoutParams.height = (int) C497740JfY.LIZIZ(52.5f);
            C786410Ut5.u6(c1324720kZq2, layoutParams);
        }
        C1143680frq.LIZLLL(c1324720kZq2, "tiktok_live_super_fans_resource", "ttlive_super_fans_icon_new_large_preview.png");
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131856675, "60"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.16F5, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // X.InterfaceC492580JTk
    public final void LIZIZ(C16F5 c16f5, View view, C19EG c19eg, boolean z) {
        ?? sb;
        int iLJJJ;
        ViewGroup.LayoutParams layoutParams;
        String strLJIJI = C497740JfY.LJIJI(2131844236);
        if (z) {
            sb = C497740JfY.LJIJJ(2131856615, strLJIJI);
        } else {
            sb = C497740JfY.LJIJI(2131844235);
        }
        if (z) {
            iLJJJ = Math.max(a0.LJJJ(sb, strLJIJI, 0, false, 6), 0);
            if (view != null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.wj1);
                C16F5 c16f52 = (C16F5) view.findViewById(R.id.wi7);
                TextView textView = (TextView) view.findViewById(R.id.mun);
                C16FS c16fs = (C16FS) view.findViewById(R.id.whx);
                TextView textView2 = (TextView) view.findViewById(R.id.hu6);
                if (imageView != null && (layoutParams = imageView.getLayoutParams()) != null) {
                    layoutParams.width = (int) C497740JfY.LIZIZ(71.25f);
                    layoutParams.height = (int) C497740JfY.LIZIZ(52.5f);
                    C786410Ut5.c6(imageView, layoutParams);
                }
                C1143680frq.LIZLLL(imageView, "tiktok_live_super_fans_resource", "ttlive_super_fans_icon_new_large_preview.png");
                if (c16fs != null) {
                    c16fs.setText(C497740JfY.LJIJI(2131856674));
                }
                if (textView2 != null) {
                    textView2.setText(C497740JfY.LJIJI(2131856674));
                }
                if (c16f52 != null) {
                    c16f52.setText("");
                    C786410Ut5.LLJJJJ(c16f52, 8);
                }
                if (textView != null) {
                    textView.setText(C497740JfY.LJIJI(2131856619));
                }
            }
        } else {
            iLJJJ = a0.LJJJ(sb, "%s", 0, false, 6);
            sb = new StringBuilder(u.LJJIFFI(sb, "%s", strLJIJI, false));
        }
        SpannableString spannableString = new SpannableString((CharSequence) sb);
        final C0DTZ c0dtz = new C0DTZ(this, view, c19eg);
        c16f5.setHighlightColor(C497740JfY.LIZLLL(R.attr.uk, this.LIZ));
        C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0JTr
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view2) {
                c0dtz.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(C497740JfY.LIZLLL(R.attr.a1j, this.LIZ));
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, strLJIJI.length() + iLJJJ, 33);
        c16f5.setMovementMethod(LinkMovementMethod.getInstance());
        C1119920fFW.LJIIIIZZ(spannableString, iLJJJ, strLJIJI.length() + iLJJJ, 34, 500);
        c16f5.setText(spannableString);
    }

    @Override // X.InterfaceC492580JTk
    public final void LIZ(C1324720kZq c1324720kZq, C1324720kZq c1324720kZq2, C16F5 c16f5, C16F5 c16f52, C16FS c16fs) {
        Boolean boolValueOf;
        String str;
        ViewGroup.LayoutParams layoutParams;
        Context context = this.LIZ;
        if (context != null) {
            boolValueOf = Boolean.valueOf(C426750GoL.LIZLLL(context));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "ttlive_sub_only_live_edu_during_preview_screenshot_rtl_new.png";
        } else {
            str = "ttlive_sub_only_live_edu_during_preview_screenshot_new.png";
        }
        C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_broadcast_demand_5", str);
        if (c1324720kZq2 != null && (layoutParams = c1324720kZq2.getLayoutParams()) != null) {
            layoutParams.width = (int) C497740JfY.LIZIZ(71.25f);
            layoutParams.height = (int) C497740JfY.LIZIZ(52.5f);
            C786410Ut5.u6(c1324720kZq2, layoutParams);
        }
        C1143680frq.LIZLLL(c1324720kZq2, "tiktok_live_super_fans_resource", "ttlive_super_fans_icon_new_large_preview.png");
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131856675, "60"));
        }
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131856674));
        }
        if (c16f52 != null) {
            c16f52.setText("");
            C786410Ut5.LLJJJJ(c16f52, 8);
        }
    }

    @Override // X.InterfaceC492580JTk
    public final void LIZLLL(C127K c127k, final GetSubInfoResponse getSubInfoResponse, final InterfaceC492700JTw interfaceC492700JTw, LifecycleOwner lifecycleOwner, final C492720JTy c492720JTy) {
        C127M accessory;
        String strLJIJI;
        int i;
        if (c127k != null) {
            if (C494680Jac.LIZJ()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c127k);
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C11G4) {
            C11G4 c11g4 = (C11G4) c127k.getAccessory();
            if (C494680Jac.LJFF()) {
                strLJIJI = C497740JfY.LJIJI(2131844231);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131844230);
            }
            c11g4.LJIILJJIL(strLJIJI);
            c11g4.LJIILLIIL(true);
            c11g4.LJIILL(new View.OnClickListener() { // from class: X.0JTd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C492630JTp c492630JTp = this.LL;
                    GetSubInfoResponse getSubInfoResponse2 = getSubInfoResponse;
                    Function0<Unit> function0 = c492720JTy;
                    c492630JTp.getClass();
                    C784440Upu.LIZ().LIZIZ(new C0JS1(EnumC492180JRw.SUB_ONLY_LIVE_PREVIEW_PAGE, EnumC492200JRy.OPEN, c492630JTp.LIZIZ, new C0JTD(getSubInfoResponse2, function0), null, null, null, 240));
                    interfaceC492700JTw.LIZIZ();
                }
            });
        }
        DataChannelGlobal.LLILZ.BQ2(lifecycleOwner, lifecycleOwner, PreviewSubOnlyTrialLiveSwitchChannel.class, new C492640JTq(c127k));
    }
}
