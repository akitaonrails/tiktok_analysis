package X;

import Y.ACListenerS52S0101000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.QuestionContent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0TUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747610TUh extends AbstractC21673619ry<C747620TUi> {
    public final List<QuestionContent> LL;
    public int LLILLJJLI;
    public AwS591S0100000_12 LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C747610TUh(List<QuestionContent> list) {
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C747620TUi c747620TUi = (C747620TUi) viewHolder;
        QuestionContent questionContent = (QuestionContent) ListProtector.get(this.LL, i);
        TuxTextView tuxTextView = c747620TUi.LLILLJJLI;
        tuxTextView.setText(questionContent.value);
        Context context = tuxTextView.getContext();
        if (questionContent.selected) {
            i2 = R.attr.a1h;
        } else {
            i2 = R.attr.a1j;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i2, context);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        tuxTextView.setSelected(questionContent.selected);
        C427690Gpr.LJ(tuxTextView, 0.0f);
        C786410Ut5.h9(tuxTextView, new ACListenerS52S0101000_12(c747620TUi, i, 1));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C747620TUi c747620TUi = new C747620TUi(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bce, viewGroup, false), new AwS591S0100000_12(this, 32));
        try {
            View view = c747620TUi.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c747620TUi.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c747620TUi.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C747620TUi.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c747620TUi.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c747620TUi.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C747620TUi.class.getName();
        return c747620TUi;
    }
}
