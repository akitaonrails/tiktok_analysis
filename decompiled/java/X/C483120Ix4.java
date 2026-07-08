package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Ix4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483120Ix4 extends AbstractC21673619ry<C483130Ix5> {
    public final List<SurveySecondQuestion> LL;
    public final InterfaceC483140Ix6 LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C483130Ix5 c483130Ix5 = (C483130Ix5) viewHolder;
        SurveySecondQuestion surveySecondQuestion = (SurveySecondQuestion) ListProtector.get(this.LL, i);
        boolean z = this.LLILLL;
        c483130Ix5.LL = surveySecondQuestion;
        ((TextView) c483130Ix5.LLILLJJLI.getValue()).setText(surveySecondQuestion.content);
        TuxTextView tuxTextView = (TuxTextView) c483130Ix5.LLILLJJLI.getValue();
        if (z) {
            i2 = 52;
        } else {
            i2 = 102;
        }
        tuxTextView.setTuxFont(i2);
        C786410Ut5.I7(new ACListenerS111S0200000_7(this, c483130Ix5, 8), c483130Ix5.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C483130Ix5 c483130Ix5 = new C483130Ix5(C786410Ut5.Td(C1834150xpV.LIZJ(C786410Ut5.ne(viewGroup.getContext())), R.layout.h0i, viewGroup, false));
        try {
            View view = c483130Ix5.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c483130Ix5.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c483130Ix5.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C483130Ix5.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c483130Ix5.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c483130Ix5.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C483130Ix5.class.getName();
        return c483130Ix5;
    }

    public C483120Ix4(List list, C483160Ix8 c483160Ix8, boolean z) {
        this.LL = list;
        this.LLILLJJLI = c483160Ix8;
        this.LLILLL = z;
    }
}
