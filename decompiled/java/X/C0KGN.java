package X;

import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KGN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGN extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final PackagePageViewModel LL;
    public final Map<String, String> LLILLJJLI;
    public boolean LLILLL;
    public C514790KGv LLILZ;
    public List<SubscriptionProductDetailWithTemplateInfo> LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<SubscriptionProductDetailWithTemplateInfo> list = this.LLILZIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void LLLII(C514790KGv c514790KGv) {
        C16F5 c16f5;
        RadioButton radioButton;
        View view;
        C514790KGv c514790KGv2 = this.LLILZ;
        if (c514790KGv2 != null && (view = c514790KGv2.itemView) != null) {
            view.setBackground(view.getContext().getDrawable(R.drawable.fby));
        }
        View view2 = c514790KGv.itemView;
        view2.setBackground(view2.getContext().getDrawable(R.drawable.fbz));
        C514790KGv c514790KGv3 = this.LLILZ;
        boolean z = false;
        if (c514790KGv3 != null && (radioButton = c514790KGv3.LLJ) != null) {
            radioButton.setChecked(false);
        }
        C514790KGv c514790KGv4 = this.LLILZ;
        if (c514790KGv4 != null && !c514790KGv4.LLJIJIL && (c16f5 = c514790KGv4.LLJI) != null) {
            C500260Jjc.LJIILIIL(c16f5);
        }
        c514790KGv.LLJ.setChecked(true);
        C16F5 c16f52 = c514790KGv.LLJI;
        if (c16f52.getText().length() > 0) {
            z = true;
        }
        C500260Jjc.LJLJLJ(c16f52, z);
        this.LLILZ = c514790KGv;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C514790KGv) {
            C514790KGv c514790KGv = (C514790KGv) viewHolder;
            CountDownTimer countDownTimer = c514790KGv.LLIZ;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            c514790KGv.LLIZ = null;
        }
    }

    public C0KGN(PackagePageViewModel packagePageViewModel, Map<String, String> map) {
        this.LL = packagePageViewModel;
        this.LLILLJJLI = map;
    }

    public static void LLLI(C514790KGv c514790KGv, SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        String strLJI = C513900KDk.LJI(subscriptionProductDetailWithTemplateInfo);
        C16F5 c16f5 = c514790KGv.LLILZ;
        c16f5.setText(C513900KDk.LIZ(c16f5, strLJI, C513940KDo.LJIILJJIL(subscriptionProductDetailWithTemplateInfo.getTemplateInfo())));
        C500260Jjc.LLFFF(c16f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(final androidx.recyclerview.widget.RecyclerView.ViewHolder r25, int r26) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KGN.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C514790KGv c514790KGv = new C514790KGv(C500260Jjc.LJIILL(R.layout.hny, viewGroup, false));
        try {
            View view = c514790KGv.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c514790KGv.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c514790KGv.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C514790KGv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c514790KGv.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c514790KGv.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C514790KGv.class.getName();
        return c514790KGv;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0015 A[PHI: r4
      0x0015: PHI (r4v5 java.lang.String) = (r4v3 java.lang.String), (r4v0 java.lang.String) binds: [B:14:0x0042, B:4:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LLLFZ(X.C514790KGv r8, X.C0KGN r9, java.lang.String r10, long r11) {
        /*
            X.16F5 r0 = r8.LLILZLL
            X.C500260Jjc.LLFFF(r0)
            X.16F5 r3 = r8.LLILZLL
            r9.getClass()
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            java.lang.String r4 = ""
            if (r0 <= 0) goto L1a
            if (r10 != 0) goto L16
        L15:
            r10 = r4
        L16:
            r3.setText(r10)
            return
        L1a:
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            java.lang.String r2 = " · "
            r9 = 0
            r7 = 1
            if (r0 <= 0) goto L56
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 / r0
            int r0 = (int) r11
            int r0 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r9] = r0
            r0 = 2131856512(0x7f118c80, float:1.9346758E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r1)
            if (r0 == 0) goto L3e
            r4 = r0
        L3e:
            boolean r0 = X.C500260Jjc.LJJIIZ(r10)
            if (r0 == 0) goto L15
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r10)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r10 = X.C2188811AlT.LIZIZ(r0)
            goto L16
        L56:
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
            boolean r0 = X.C500260Jjc.LJJIIZ(r10)
            if (r0 == 0) goto La1
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r10)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r10 = X.C2188811AlT.LIZIZ(r0)
            goto L16
        La1:
            r10 = r1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KGN.LLLFZ(X.0KGv, X.0KGN, java.lang.String, long):void");
    }
}
