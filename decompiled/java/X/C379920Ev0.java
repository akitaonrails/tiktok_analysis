package X;

import Y.ACListenerS72S0300000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0Ev0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379920Ev0 extends AbstractC21673619ry<C379950Ev3> {
    public final List<C379910Euz> LL = new ArrayList();
    public AwS619S0100000_5 LLILLJJLI;
    public AIGCGenerationParamType LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        EnumC379800Euo enumC379800Euo;
        C379910Euz c379910Euz = (C379910Euz) C13LP.LJJJLZIJ(i, this.LL);
        if (c379910Euz != null) {
            enumC379800Euo = c379910Euz.LIZ;
        } else {
            enumC379800Euo = null;
        }
        if (enumC379800Euo == EnumC379800Euo.MORE) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int nameId;
        String string;
        C379950Ev3 c379950Ev3 = (C379950Ev3) viewHolder;
        c379950Ev3.LL = (C379910Euz) ListProtector.get(this.LL, i);
        C379910Euz c379910Euz = (C379910Euz) ListProtector.get(this.LL, i);
        C786410Ut5.I7(new ACListenerS72S0300000_5(c379950Ev3, c379910Euz, this, 6), c379950Ev3.itemView);
        if (c379950Ev3 instanceof C379940Ev2) {
            C379940Ev2 c379940Ev2 = (C379940Ev2) c379950Ev3;
            c379940Ev2.LLILLJJLI.setIconRes(c379910Euz.LIZ.getIconId());
            EnumC379800Euo enumC379800Euo = c379910Euz.LIZ;
            if (enumC379800Euo == EnumC379800Euo.GENERATE_VIDEO) {
                AIGCGenerationParamType aIGCGenerationParamType = this.LLILLL;
                if (C378280EsM.LIZ(C378280EsM.LIZIZ()) && aIGCGenerationParamType == AIGCGenerationParamType.I2I_TYPE) {
                    nameId = 2131834002;
                } else {
                    nameId = 2131825357;
                }
            } else {
                nameId = enumC379800Euo.getNameId();
            }
            Context context = c379950Ev3.itemView.getContext();
            if (context != null && (string = context.getString(nameId)) != null) {
                c379940Ev2.LLILLL.setText(string);
            }
            if (c379910Euz.LIZJ) {
                c379940Ev2.LLILLJJLI.setTintColorRes(R.attr.a1k);
                c379940Ev2.LLILLL.setTextColorRes(R.attr.a1k);
                c379950Ev3.itemView.setClickable(true);
                C786410Ut5.T4(c379950Ev3.itemView, 1.0f);
                return;
            }
            c379940Ev2.LLILLJJLI.setTintColorRes(R.attr.ei);
            c379940Ev2.LLILLL.setTextColorRes(R.attr.ei);
            c379950Ev3.itemView.setClickable(false);
            C786410Ut5.T4(c379950Ev3.itemView, 0.5f);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c379940Ev2;
        if (i == 1) {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bz_, viewGroup, false);
            c379940Ev2 = new C379950Ev3(viewTd) { // from class: X.0Ev4
            };
        } else {
            c379940Ev2 = new C379940Ev2(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bz9, viewGroup, false));
        }
        View view = c379940Ev2.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zf);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        view.setBackground(c384050F3z.LIZ(c379940Ev2.itemView.getContext()));
        try {
            View view2 = c379940Ev2.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c379940Ev2.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c379940Ev2.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c379940Ev2.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c379940Ev2.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c379940Ev2.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c379940Ev2.getClass().getName();
        return c379940Ev2;
    }
}
