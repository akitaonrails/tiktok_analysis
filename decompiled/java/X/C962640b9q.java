package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import com.bytedance.bddatefmt.BDDateFormat;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0b9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962640b9q extends C0J8P<C962660b9s, C962740bA0> {
    public static String LJIIIIZZ(long j) {
        if (j == 0) {
            return EnumC962630b9p.MATCH_LV0.getValue();
        }
        if (j == 1) {
            return EnumC962630b9p.MATCH_LV1.getValue();
        }
        if (j == 2) {
            return EnumC962630b9p.MATCH_LV2.getValue();
        }
        if (j == 3) {
            return EnumC962630b9p.MATCH_LV3.getValue();
        }
        return "";
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C962660b9s c962660b9s) {
        Drawable drawableLIZ;
        boolean z;
        long j;
        boolean z2;
        long j2;
        long j3;
        long j4;
        String strLJIIJ;
        C962740bA0 c962740bA0 = (C962740bA0) viewHolder;
        final C962660b9s c962660b9s2 = c962660b9s;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(new BDDateFormat("ll-Y").LIZIZ(c962660b9s2.LJI * 1000, Locale.getDefault()));
        sbLIZ.append(" - ");
        sbLIZ.append(new BDDateFormat("ll-Y").LIZIZ(c962660b9s2.LJII * 1000, Locale.getDefault()));
        ((TextView) c962740bA0.LLILZ.getValue()).setText(C2188811AlT.LIZIZ(sbLIZ));
        ((TextView) c962740bA0.LLILLL.getValue()).setText(c962660b9s2.LJFF);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        spannableStringBuilder.append((CharSequence) c962660b9s2.LJ).append((CharSequence) "  ");
        if (!C497740JfY.LJJ()) {
            drawableLIZ = C0UDZ.LIZ(R.drawable.ec_);
        } else {
            drawableLIZ = C0UDZ.LIZ(R.drawable.eca);
        }
        if (drawableLIZ != null) {
            drawableLIZ.setBounds(0, 0, iLIZIZ, iLIZIZ);
            C786410Ut5.q2(spannableStringBuilder, new ImageSpan(drawableLIZ), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        ((TextView) c962740bA0.LLILZIL.getValue()).setText(spannableStringBuilder);
        ((TextView) c962740bA0.LLILLL.getValue()).setText(c962660b9s2.LJFF);
        C1143680frq.LJI((View) c962740bA0.LLILLJJLI.getValue(), C1143780fs0.LJIIJ("tiktok_live_interaction_demand_1", "ttlive_cohost_eoy_banner_global_campaign_firework.png"), null, true);
        C1143680frq.LJI((View) c962740bA0.LLILZLL.getValue(), C1143780fs0.LJIIJ("tiktok_live_interaction_demand_1", "ttlive_cohost_eoy_banner_global_campaign_progress_bg.png"), null, true);
        if (c962660b9s2.LJIIIIZZ == null) {
            z = true;
        } else {
            z = false;
        }
        long j5 = 0;
        if (z) {
            ((TextView) c962740bA0.LLJ.getValue()).setText("/0");
            ((TextView) c962740bA0.LLIZLLLIL.getValue()).setText("1000");
            ((TextView) c962740bA0.LLIZ.getValue()).setText(C786410Ut5.j4(C497740JfY.LJIJI(2131841675), Arrays.copyOf(new Object[]{0}, 1)));
        } else {
            TextView textView = (TextView) c962740bA0.LLIZ.getValue();
            String strLJIJI = C497740JfY.LJIJI(2131841675);
            Object[] objArr = new Object[1];
            EOYBanner.GradeInfo gradeInfo = c962660b9s2.LJIIIIZZ;
            if (gradeInfo != null) {
                j = gradeInfo.level;
            } else {
                j = 0;
            }
            objArr[0] = Long.valueOf(j);
            textView.setText(C786410Ut5.j4(strLJIJI, Arrays.copyOf(objArr, 1)));
            EOYBanner.GradeInfo gradeInfo2 = c962660b9s2.LJIIIIZZ;
            if (gradeInfo2 != null && gradeInfo2.level == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C786410Ut5.LLJJJJ((C16F5) c962740bA0.LLJ.getValue(), 8);
                C786410Ut5.LLJJJJ((C16F5) c962740bA0.LLIZLLLIL.getValue(), 8);
                C786410Ut5.LLIIJLIL((ProgressBar) c962740bA0.LLJI.getValue(), 8);
                C786410Ut5.LLJJJJ((C16F5) c962740bA0.LLJIJIL.getValue(), 0);
                C786410Ut5.LLJJIJIL((LiveIconView) c962740bA0.LLJILJIL.getValue(), 0);
                C1143680frq.LJI((View) c962740bA0.LLJILJIL.getValue(), C1143780fs0.LJIIJ("tiktok_live_interaction_demand_1", "ttlive_cohost_eoy_banner_global_campaign_reward.png"), null, true);
            } else {
                if (gradeInfo2 != null) {
                    j2 = gradeInfo2.target;
                    j3 = gradeInfo2.progress;
                } else {
                    j2 = 1000;
                    j3 = 0;
                }
                TextView textView2 = (TextView) c962740bA0.LLJ.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('/');
                sbLIZ2.append(j2);
                textView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
                ((TextView) c962740bA0.LLIZLLLIL.getValue()).setText(String.valueOf(j3));
                ((ProgressBar) c962740bA0.LLJI.getValue()).setProgress((int) ((j3 * ((long) 100)) / j2));
                C786410Ut5.LLJJJJ((C16F5) c962740bA0.LLJ.getValue(), 0);
                C786410Ut5.LLJJJJ((C16F5) c962740bA0.LLIZLLLIL.getValue(), 0);
                C786410Ut5.LLIIJLIL((ProgressBar) c962740bA0.LLJI.getValue(), 0);
                C786410Ut5.LLJJJJ((C16F5) c962740bA0.LLJIJIL.getValue(), 8);
                C786410Ut5.LLJJIJIL((LiveIconView) c962740bA0.LLJILJIL.getValue(), 8);
            }
        }
        EOYBanner.GradeInfo gradeInfo3 = c962660b9s2.LJIIIIZZ;
        if (gradeInfo3 != null) {
            j4 = gradeInfo3.level;
        } else {
            j4 = 0;
        }
        View view = (View) c962740bA0.LL.getValue();
        if (j4 == 0) {
            strLJIIJ = C1143780fs0.LJIIJ("tiktok_live_interaction_demand_1", "ttlive_cohost_eoy_banner_global_campaign_cover_lv0.png");
        } else if (j4 == 1) {
            strLJIIJ = C1143780fs0.LJIIJ("tiktok_live_interaction_demand_1", "ttlive_cohost_eoy_banner_global_campaign_cover_lv1.png");
        } else if (j4 == 2) {
            strLJIIJ = C1143780fs0.LJIIJ("tiktok_live_interaction_demand_1", "ttlive_cohost_eoy_banner_global_campaign_cover_lv2.png");
        } else if (j4 == 3) {
            strLJIIJ = C1143780fs0.LJIIJ("tiktok_live_interaction_demand_1", "ttlive_cohost_eoy_banner_global_campaign_cover_lv3.png");
        } else {
            strLJIIJ = "";
        }
        C1143680frq.LJI(view, strLJIIJ, null, true);
        if (!c962660b9s2.LIZ) {
            c962660b9s2.LIZ = true;
            C955400ayA c955400ayA = C955400ayA.LIZ;
            EOYBanner.GradeInfo gradeInfo4 = c962660b9s2.LJIIIIZZ;
            if (gradeInfo4 != null) {
                j5 = gradeInfo4.level;
            }
            c955400ayA.LJLILLLLZI(LJIIIIZZ(j5));
        }
        if (C500260Jjc.LJJIIZ(c962660b9s2.LJIIIZ)) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC951940asa() { // from class: X.0b9l
                @Override // X.AbstractViewOnClickListenerC951940asa
                public final void LIZ(View view2) {
                    long j6;
                    C955400ayA c955400ayA2 = C955400ayA.LIZ;
                    C962640b9q c962640b9q = this.LLILZIL;
                    EOYBanner.GradeInfo gradeInfo5 = c962660b9s2.LJIIIIZZ;
                    if (gradeInfo5 != null) {
                        j6 = gradeInfo5.level;
                    } else {
                        j6 = 0;
                    }
                    c962640b9q.getClass();
                    c955400ayA2.LJLIL(C962640b9q.LJIIIIZZ(j6));
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                    Context contextLJII = C497740JfY.LJII();
                    C962640b9q c962640b9q2 = this.LLILZIL;
                    String str = c962660b9s2.LJIIIZ;
                    c962640b9q2.getClass();
                    int iLJJI = (int) ((((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.7d) + ((double) 52));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(u.LJJIFFI(str, "webcast_webview", "webcast_webview_popup", false));
                    sbLIZ3.append("&height=");
                    sbLIZ3.append(iLJJI);
                    iActionHandlerService.handle(contextLJII, C2188811AlT.LIZIZ(sbLIZ3));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, c962740bA0.itemView);
        }
        C960940b76.LIZIZ(c962740bA0, c962660b9s2);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C962740bA0(C786410Ut5.Td(layoutInflater, R.layout.gr7, viewGroup, false));
    }
}
