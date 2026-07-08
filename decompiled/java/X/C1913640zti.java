package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.KRConsentConfig;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: renamed from: X.0zti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913640zti {
    public final Function0<Unit> LIZ;
    public final View LIZIZ;
    public final LinearLayout LIZJ;
    public final C197039127h LIZLLL;
    public final C0HZQ LJ;
    public final C0HZQ LJFF;
    public final C0HZQ LJI;
    public final C0HZQ LJII;
    public C1913660ztk LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public FrameLayout LJIIL;

    public final View LIZJ() {
        ViewGroup viewGroup;
        FrameLayout frameLayout = this.LJIIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ(this.LIZIZ, frameLayout);
        }
        ViewParent parent = this.LIZIZ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LIZIZ, viewGroup);
        }
        this.LJIIL = null;
        return this.LIZIZ;
    }

    public final void LIZLLL() {
        if (!this.LJIIJ) {
            this.LJIIIZ = true;
            this.LJ.setChecked(this.LJFF.isChecked() && this.LJI.isChecked() && this.LJII.isChecked());
            this.LJIIIZ = false;
        }
        LJI();
    }

    public final void LJI() {
        this.LIZLLL.setEnabled(this.LJFF.isChecked() && this.LJI.isChecked());
    }

    public static void LJFF(String str) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.NUJ_CONSENT.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }

    public final void LJ(String str) {
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.LJJL("use_webview_title", true);
        sparkContext.LJJL("hide_status_bar", true);
        sparkContext.LJJL("show_separate_line", false);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = this.LIZIZ.getContext();
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    public C1913640zti(Context context, AwS572S0100000_28 awS572S0100000_28) {
        KRConsentConfig kRConsentConfigLJIIJ;
        this.LIZ = awS572S0100000_28;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.czr, null, false);
        this.LIZIZ = viewTd;
        this.LIZJ = (LinearLayout) viewTd.findViewById(R.id.m0p);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.m0j);
        this.LIZLLL = c197039127h;
        C0HZQ c0hzq = (C0HZQ) viewTd.findViewById(R.id.m0k);
        this.LJ = c0hzq;
        C0HZQ c0hzq2 = (C0HZQ) viewTd.findViewById(R.id.m0o);
        this.LJFF = c0hzq2;
        C0HZQ c0hzq3 = (C0HZQ) viewTd.findViewById(R.id.m0n);
        this.LJI = c0hzq3;
        C0HZQ c0hzq4 = (C0HZQ) viewTd.findViewById(R.id.m0m);
        this.LJII = c0hzq4;
        LinearLayout linearLayout = (LinearLayout) viewTd.findViewById(R.id.m0x);
        RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.m0w);
        TextView textView = (TextView) viewTd.findViewById(R.id.m0z);
        LIZ((TuxTextView) viewTd.findViewById(R.id.m0v), "terms-of-service");
        LIZ((TuxTextView) viewTd.findViewById(R.id.m0u), "terms-and-conditions-kr");
        LIZ((TuxTextView) viewTd.findViewById(R.id.m0t), "consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose");
        LinearLayout linearLayout2 = this.LIZJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        C786410Ut5.d6(linearLayout2, layoutParams);
        C786410Ut5.D7(c0hzq, new C19332510kF(this, 15));
        C786410Ut5.D7(c0hzq2, new C19332510kF(this, 16));
        C786410Ut5.D7(c0hzq3, new C19332510kF(this, 17));
        C786410Ut5.D7(c0hzq4, new C19332510kF(this, 18));
        C786410Ut5.U8(c197039127h, new ACListenerS162S0100000_28(this, 89));
        LJI();
        if (C294580Bge.LIZ()) {
            IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ();
            if (iPNSConsentConfigServiceLJIIIZ != null) {
                kRConsentConfigLJIIJ = iPNSConsentConfigServiceLJIIIZ.LJIIJ();
            } else {
                kRConsentConfigLJIIJ = null;
            }
            if (kRConsentConfigLJIIJ != null) {
                iPNSConsentConfigServiceLJIIIZ.LIZLLL("kr_consent_box");
                if (recyclerView != null) {
                    List list = kRConsentConfigLJIIJ.checkboxes;
                    list = list == null ? C13BV.INSTANCE : list;
                    if (!list.isEmpty()) {
                        if (linearLayout != null) {
                            C786410Ut5.LJZL(8, linearLayout);
                        }
                        C1913660ztk c1913660ztk = new C1913660ztk(EnumC1913590ztd.CONSENT_BOX_KR.getValue(), list, new AwS642S0100000_28(this, 61));
                        this.LJIIIIZZ = c1913660ztk;
                        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                        recyclerView.setAdapter(c1913660ztk);
                        C786410Ut5.LLIZLLLIL(recyclerView, 0);
                        String str = kRConsentConfigLJIIJ.button;
                        if (str != null && str.length() > 0) {
                            c197039127h.setText(str);
                        }
                        String str2 = kRConsentConfigLJIIJ.agreeAll;
                        if (str2 != null && str2.length() > 0 && textView != null) {
                            textView.setText(str2);
                        }
                        c197039127h.setEnabled(c1913660ztk.LLLI());
                        this.LJIIIZ = true;
                        c0hzq.setChecked(c1913660ztk.LLLFZ());
                        this.LJIIIZ = false;
                        C786410Ut5.D7(c0hzq, new C19332510kF(this, 14));
                        C786410Ut5.U8(c197039127h, new ACListenerS130S0200000_28(c1913660ztk, this, 37));
                        return;
                    }
                    return;
                }
                return;
            }
            if (iPNSConsentConfigServiceLJIIIZ == null) {
                return;
            }
            iPNSConsentConfigServiceLJIIIZ.LJIIIZ("kr_consent_box");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZIZ(String str, boolean z) {
        String str2;
        int i;
        switch (str.hashCode()) {
            case -1495818221:
                if (!str.equals("consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose")) {
                    return;
                }
                str2 = "agree_to_receive_notifications_of_marketing_content_and_promotions";
                break;
                break;
            case 623683781:
                if (!str.equals("terms-of-service")) {
                    return;
                }
                str2 = "agree_to_tiktok_terms_of_service";
                break;
                break;
            case 975365518:
                if (!str.equals("agree_all")) {
                    return;
                }
                str2 = "select_all";
                break;
                break;
            case 2064195680:
                if (!str.equals("terms-and-conditions-kr")) {
                    return;
                }
                str2 = "agree_to_personal_information";
                break;
                break;
            default:
                return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "consent_box");
        c2344009Gk.LJIIIIZZ("content", str2);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c2344009Gk.LIZJ(i, "click_type");
        C20684815ws.LJIILLIIL("register_terms_click", c2344009Gk.LIZ);
    }

    public final void LIZ(TuxTextView tuxTextView, String str) {
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ = tuxTextView.getContext().getString(2131857918);
        c444940Hca.LIZIZ = true;
        c444940Hca.LIZIZ(51);
        c444940Hca.LIZLLL(2);
        c444940Hca.LJIIIIZZ = new AwS177S1100000_28(this, str, 10);
        tuxTextView.setText(c444940Hca.LIZ(tuxTextView.getContext()));
    }
}
