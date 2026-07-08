package X;

import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513830KDd extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final PackagePageViewModel LL;
    public final Map<String, String> LLILLJJLI;
    public boolean LLILLL;
    public C0KE0 LLILZ;
    public List<PGCSubscriptionProductDetailWithTemplateInfo> LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<PGCSubscriptionProductDetailWithTemplateInfo> list = this.LLILZIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void LLLII(C0KE0 c0ke0) {
        TextView textView;
        RadioButton radioButton;
        View view;
        C0KE0 c0ke02 = this.LLILZ;
        if (c0ke02 != null && (view = c0ke02.itemView) != null) {
            view.setBackground(view.getContext().getDrawable(R.drawable.dc5));
        }
        View view2 = c0ke0.itemView;
        view2.setBackground(view2.getContext().getDrawable(R.drawable.dc6));
        C0KE0 c0ke03 = this.LLILZ;
        boolean z = false;
        if (c0ke03 != null && (radioButton = c0ke03.LLJ) != null) {
            radioButton.setChecked(false);
        }
        C0KE0 c0ke04 = this.LLILZ;
        if (c0ke04 != null && !c0ke04.LLJIJIL && (textView = c0ke04.LLJI) != null) {
            C0K0R.LIZ(textView);
        }
        c0ke0.LLJ.setChecked(true);
        TextView textView2 = c0ke0.LLJI;
        if (textView2.getText().length() > 0) {
            z = true;
        }
        C0K0R.LIZIZ(textView2, z);
        this.LLILZ = c0ke0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C0KE0) {
            C0KE0 c0ke0 = (C0KE0) viewHolder;
            CountDownTimer countDownTimer = c0ke0.LLIZ;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            c0ke0.LLIZ = null;
        }
    }

    public C513830KDd(PackagePageViewModel packagePageViewModel, Map<String, String> map) {
        this.LL = packagePageViewModel;
        this.LLILLJJLI = map;
    }

    public static void LLLI(C0KE0 c0ke0, PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo) {
        String strLJI = C513890KDj.LJI(pGCSubscriptionProductDetailWithTemplateInfo);
        TextView textView = c0ke0.LLILZ;
        textView.setText(C513890KDj.LIZ(textView, strLJI, C513840KDe.LJIILJJIL(pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo())));
        C0K0R.LIZJ(textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r25, int r26) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513830KDd.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0KE0 c0ke0 = new C0KE0(C0KEJ.LIZ(viewGroup, R.layout.fgx));
        try {
            View view = c0ke0.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ke0.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ke0.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0KE0.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ke0.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ke0.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0KE0.class.getName();
        return c0ke0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d A[PHI: r1
      0x009d: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v7 java.lang.String) binds: [B:14:0x0088, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LLLFZ(X.C0KE0 r8, X.C513830KDd r9, java.lang.String r10, long r11) {
        /*
            android.widget.TextView r0 = r8.LLILZLL
            X.C0K0R.LIZJ(r0)
            android.widget.TextView r3 = r8.LLILZLL
            r9.getClass()
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L19
            if (r10 != 0) goto L15
            java.lang.String r10 = ""
        L15:
            r3.setText(r10)
            return
        L19:
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            java.lang.String r2 = " · "
            r9 = 0
            r7 = 1
            if (r0 <= 0) goto L52
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 / r0
            int r0 = (int) r11
            int r4 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r9] = r0
            r0 = 2131755465(0x7f1001c9, float:1.914181E38)
            java.lang.String r1 = X.C511520K4g.LJ(r0, r4, r1)
            boolean r0 = X.C0K51.LJ(r10)
            if (r0 == 0) goto L9d
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r10)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r10 = X.C2188811AlT.LIZIZ(r0)
            goto L15
        L52:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r0
            r0 = 60
            long r4 = (long) r0
            long r0 = r11 % r4
            int r6 = (int) r0
            long r0 = r11 / r4
            long r0 = r0 % r4
            int r8 = (int) r0
            r0 = 3600(0xe10, float:5.045E-42)
            long r0 = (long) r0
            long r11 = r11 / r0
            int r0 = (int) r11
            r5 = 3
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4[r7] = r0
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r4[r1] = r0
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r0 = "%02d:%02d:%02d"
            java.lang.String r1 = X.C786410Ut5.j4(r0, r1)
            boolean r0 = X.C0K51.LJ(r10)
            if (r0 == 0) goto L9d
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r10)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r10 = X.C2188811AlT.LIZIZ(r0)
            goto L15
        L9d:
            r10 = r1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513830KDd.LLLFZ(X.0KE0, X.0KDd, java.lang.String, long):void");
    }
}
