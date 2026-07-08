package X;

import Y.ACListenerS58S0101000_26;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillSecondaryFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0udU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711380udU extends AbstractC21673619ry<C1711390udV> {
    public final AutofillSecondaryFragment LL;
    public List<AutofillApi.CardNumberItem> LLILLJJLI = new ArrayList();
    public String LLILLL = "";
    public int LLILZ = -1;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C1711380udU(AutofillSecondaryFragment autofillSecondaryFragment) {
        this.LL = autofillSecondaryFragment;
    }

    public final void LLLFZ(int i) {
        if (!TextUtils.equals(this.LLILLL, ((AutofillApi.CardNumberItem) ListProtector.get(this.LLILLJJLI, i)).instrumentId)) {
            int i2 = this.LLILZ;
            String str = ((AutofillApi.CardNumberItem) ListProtector.get(this.LLILLJJLI, i)).instrumentId;
            if (str == null) {
                str = "";
            }
            this.LLILLL = str;
            this.LLILZ = i;
            notifyItemChanged(i);
            notifyItemChanged(i2);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Activity activityLIZ;
        Drawable drawableLJ;
        Context context;
        Activity activityLIZ2;
        Context context2;
        Context context3;
        C1711390udV c1711390udV = (C1711390udV) viewHolder;
        String strLIZ = ((AutofillApi.CardNumberItem) ListProtector.get(this.LLILLJJLI, i)).icon;
        AutofillSecondaryFragment autofillSecondaryFragment = this.LL;
        Context context4 = null;
        if (autofillSecondaryFragment != null && (context3 = autofillSecondaryFragment.getContext()) != null) {
            activityLIZ = C06MM.LIZ(context3);
        } else {
            activityLIZ = null;
        }
        if (activityLIZ instanceof C19EG) {
            C1711340udQ c1711340udQ = C1711340udQ.LIZ;
            AutofillSecondaryFragment autofillSecondaryFragment2 = this.LL;
            if (autofillSecondaryFragment2 != null && (context2 = autofillSecondaryFragment2.getContext()) != null) {
                activityLIZ2 = C06MM.LIZ(context2);
            } else {
                activityLIZ2 = null;
            }
            String str = ((AutofillApi.CardNumberItem) ListProtector.get(this.LLILLJJLI, i)).icon;
            String str2 = ((AutofillApi.CardNumberItem) ListProtector.get(this.LLILLJJLI, i)).darkModeIconUrl;
            c1711340udQ.getClass();
            strLIZ = C1711340udQ.LIZ(activityLIZ2, str, str2);
            if (strLIZ == null) {
                strLIZ = "";
            }
        } else if (strLIZ == null) {
            strLIZ = " ";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZ);
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_INSIDE;
        AutofillSecondaryFragment autofillSecondaryFragment3 = this.LL;
        if (autofillSecondaryFragment3 != null && (context = autofillSecondaryFragment3.getContext()) != null) {
            drawableLJ = C1308910kAL.LJ(R.attr.c7, context);
        } else {
            drawableLJ = null;
        }
        c1331670kl3LJIIIZ.LJJIIZI(drawableLJ);
        c1331670kl3LJIIIZ.LJJ(c1711390udV.LLILLJJLI);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        SmartImageView smartImageView = c1711390udV.LLILLJJLI;
        if (smartImageView != null) {
            C1331750klB c1331750klB = new C1331750klB();
            AutofillSecondaryFragment autofillSecondaryFragment4 = this.LL;
            if (autofillSecondaryFragment4 != null) {
                context4 = autofillSecondaryFragment4.getContext();
            }
            c1331750klB.LJ = C12ES.LIZJ(4.0f, context4);
            smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
        }
        TuxTextView tuxTextView = c1711390udV.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(((AutofillApi.CardNumberItem) ListProtector.get(this.LLILLJJLI, i)).title);
        }
        if (TextUtils.equals(this.LLILLL, ((AutofillApi.CardNumberItem) ListProtector.get(this.LLILLJJLI, i)).instrumentId)) {
            C1841350y17 c1841350y17 = c1711390udV.LLILZ;
            if (c1841350y17 != null) {
                c1841350y17.setChecked(true);
            }
            if (this.LLILZ == -1) {
                this.LLILZ = i;
            }
        } else {
            C1841350y17 c1841350y172 = c1711390udV.LLILZ;
            if (c1841350y172 != null) {
                c1841350y172.setChecked(false);
            }
        }
        C786410Ut5.I7(new ACListenerS58S0101000_26(i, this, 1), c1711390udV.LL);
        C1841350y17 c1841350y173 = c1711390udV.LLILZ;
        if (c1841350y173 != null) {
            C786410Ut5.e9(c1841350y173, new ACListenerS58S0101000_26(i, this, 2));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1711390udV c1711390udV = new C1711390udV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dvk, viewGroup, false));
        try {
            View view = c1711390udV.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1711390udV.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1711390udV.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1711390udV.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1711390udV.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1711390udV.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1711390udV.class.getName();
        return c1711390udV;
    }
}
