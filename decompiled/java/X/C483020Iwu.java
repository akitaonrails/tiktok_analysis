package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0Iwu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483020Iwu extends AbstractC21673619ry<C483030Iwv> {
    public final SurveyViewModel LL;
    public final List<SurveySecondQuestion> LLILLJJLI;
    public final InterfaceC483050Iwx LLILLL;
    public final Function0<Boolean> LLILZ;
    public final LayoutInflater LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
        /*
            r4 = this;
            X.0Iwv r5 = (X.C483030Iwv) r5
            if (r6 < 0) goto L41
            java.util.List<com.bytedance.android.livesdk.survey.model.SurveySecondQuestion> r0 = r4.LLILLJJLI
            int r0 = r0.size()
            if (r0 <= r6) goto L41
            java.util.List<com.bytedance.android.livesdk.survey.model.SurveySecondQuestion> r0 = r4.LLILLJJLI
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            com.bytedance.android.livesdk.survey.model.SurveySecondQuestion r3 = (com.bytedance.android.livesdk.survey.model.SurveySecondQuestion) r3
            com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel r0 = r4.LL
            if (r0 == 0) goto L42
            java.util.Set<com.bytedance.android.livesdk.survey.model.SurveySecondQuestion> r0 = r0.LLILZIL
            if (r0 == 0) goto L42
            boolean r0 = r0.contains(r3)
            r2 = 1
            if (r0 != r2) goto L42
        L23:
            r5.LL = r3
            android.view.View r1 = r5.itemView
            boolean r0 = r1 instanceof X.C16F5
            if (r0 == 0) goto L32
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.content
            r1.setText(r0)
        L32:
            r5.I5(r2)
            android.view.View r2 = r5.itemView
            Y.ACListenerS111S0200000_7 r1 = new Y.ACListenerS111S0200000_7
            r0 = 26
            r1.<init>(r4, r5, r0)
            X.C786410Ut5.I7(r1, r2)
        L41:
            return
        L42:
            r2 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C483020Iwu.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewTd = C786410Ut5.Td(this.LLILZIL, R.layout.hl5, viewGroup, false);
        if (this.LLILZ.invoke().booleanValue()) {
            ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            }
        }
        C483030Iwv c483030Iwv = new C483030Iwv(viewTd);
        try {
            View view = c483030Iwv.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c483030Iwv.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c483030Iwv.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C483030Iwv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c483030Iwv.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c483030Iwv.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C483030Iwv.class.getName();
        return c483030Iwv;
    }

    public C483020Iwu(Context context, SurveyViewModel surveyViewModel, List list, C483060Iwy c483060Iwy, AwS551S0100000_7 awS551S0100000_7) {
        this.LL = surveyViewModel;
        this.LLILLJJLI = list;
        this.LLILLL = c483060Iwy;
        this.LLILZ = awS551S0100000_7;
        this.LLILZIL = C786410Ut5.ne(context);
    }
}
