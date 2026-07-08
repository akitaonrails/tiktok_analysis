package X;

import Y.ACListenerS52S0101000_12;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.Description;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TO6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TO6 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C0TO8 LL;
    public List<OfferInfo> LLILLJJLI = new ArrayList();
    public Context LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C0TO6(C0TO5 c0to5) {
        this.LL = c0to5;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C0TO7 c0to7 = (C0TO7) viewHolder;
        if (i == 1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0to7.LL.getLayoutParams();
            marginLayoutParams.topMargin = 40;
            C786410Ut5.m6(c0to7.LL, marginLayoutParams);
        }
        c0to7.LLILLJJLI.setText(((OfferInfo) ListProtector.get(this.LLILLJJLI, i)).offerName);
        if (i == 0) {
            c0to7.LLILZ.setText(((OfferInfo) ListProtector.get(this.LLILLJJLI, i)).title);
        } else {
            TuxTextView tuxTextView = c0to7.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((OfferInfo) ListProtector.get(this.LLILLJJLI, i)).title);
            sbLIZ.append(((OfferInfo) ListProtector.get(this.LLILLJJLI, i)).periodName);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            TuxTextView tuxTextView2 = c0to7.LLILZ;
            if (((OfferInfo) ListProtector.get(this.LLILLJJLI, i)).isSelected()) {
                i2 = R.attr.dl;
            } else {
                i2 = R.attr.a04;
            }
            tuxTextView2.setTextColorRes(i2);
        }
        Description description = ((OfferInfo) ListProtector.get(this.LLILLJJLI, i)).offerDescription;
        Context context = null;
        if (description != null) {
            TuxTextView tuxTextView3 = c0to7.LLILZIL;
            C746100TOm c746100TOm = C746100TOm.LIZ;
            Context context2 = this.LLILLL;
            if (context2 == null) {
                context2 = null;
            }
            String str = description.description;
            List<String> list = description.hyperText;
            List<String> list2 = description.hyperLink;
            Integer numValueOf = Integer.valueOf(R.attr.a1h);
            Boolean bool = Boolean.TRUE;
            c746100TOm.getClass();
            tuxTextView3.setText(C746100TOm.LIZLLL(context2, str, list, list2, numValueOf, bool));
            c0to7.LLILZIL.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C0HZQ c0hzq = c0to7.LLILLL;
        if (i == 1) {
            C0TOS c0tos = C0TOS.LIZ;
            Context context3 = this.LLILLL;
            if (context3 == null) {
                context3 = null;
            }
            c0tos.getClass();
            c0hzq.setCheckBoxCheckedColor(C0TOS.LIZJ(R.attr.dk, context3));
            Context context4 = this.LLILLL;
            if (context4 == null) {
                context4 = null;
            }
            c0hzq.setCheckBoxInnerShapeColor(C0TOS.LIZJ(R.attr.d9, context4));
        }
        c0hzq.setChecked(((OfferInfo) ListProtector.get(this.LLILLJJLI, i)).isSelected());
        C786410Ut5.b9(c0hzq, new ACListenerS52S0101000_12(this, i, 5));
        C0TOS c0tos2 = C0TOS.LIZ;
        Context context5 = this.LLILLL;
        if (context5 != null) {
            context = context5;
        }
        c0tos2.getClass();
        c0hzq.setCheckBoxMaskColor(C0TOS.LIZJ(R.attr.zm, context));
        c0hzq.setInnerMaskVisibility(true);
        C786410Ut5.h9(c0to7.LLILZIL, new ACListenerS52S0101000_12(this, i, 6));
        C786410Ut5.Y7(c0to7.LL, new ACListenerS52S0101000_12(this, i, 7));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TO7 c0to7 = new C0TO7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bfg, viewGroup, false));
        try {
            View view = c0to7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0to7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0to7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TO7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0to7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0to7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TO7.class.getName();
        return c0to7;
    }
}
