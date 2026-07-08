package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.CombinationPaymentMethodInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03d4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C885203d4 extends AbstractC21673619ry<C885303d5> {
    public final Context LL;
    public final List<CombinationPaymentMethodInfo> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C885203d4(Context context) {
        this.LL = context;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        C885303d5 c885303d5 = (C885303d5) viewHolder;
        CombinationPaymentMethodInfo combinationPaymentMethodInfo = (CombinationPaymentMethodInfo) ListProtector.get(this.LLILLJJLI, i);
        if (C1744700vVE.LJ(this.LL, null)) {
            str = combinationPaymentMethodInfo.paymentCardUrlDark;
        } else {
            str = combinationPaymentMethodInfo.paymentCardUrl;
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        c1331670kl3LIZLLL.LJJ(c885303d5.LL);
        C786410Ut5.h3(c1331670kl3LIZLLL);
        SmartImageView smartImageView = c885303d5.LL;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C679280Qkg.LIZ(2);
        smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
        String str2 = combinationPaymentMethodInfo.paymentCardNum;
        if (str2 != null && str2.length() != 0) {
            c885303d5.LLILLJJLI.setText(u.LJJIFFI(C20642515q3.LJI(2131832781), "{####}", combinationPaymentMethodInfo.paymentCardNum, false));
        } else {
            c885303d5.LLILLJJLI.setText(combinationPaymentMethodInfo.paymentMethodText);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C885303d5 c885303d5 = new C885303d5(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.b3d, viewGroup, false));
        try {
            View view = c885303d5.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c885303d5.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c885303d5.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C885303d5.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c885303d5.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c885303d5.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C885303d5.class.getName();
        return c885303d5;
    }
}
