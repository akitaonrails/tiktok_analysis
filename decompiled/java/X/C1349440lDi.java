package X;

import Y.ACListenerS124S0200000_21;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0lDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349440lDi extends AbstractC21673619ry<C1349450lDj> {
    public final C0T4M LL;
    public final Function2<InterfaceC1348290lBr, C0T4M, Unit> LLILLJJLI;
    public final List<InterfaceC1348290lBr> LLILLL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public C1349440lDi(C0T4M c0t4m, C1348260lBo c1348260lBo) {
        this.LL = c0t4m;
        this.LLILLJJLI = c1348260lBo;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int iIntValue;
        float f;
        C1349450lDj c1349450lDj = (C1349450lDj) viewHolder;
        InterfaceC1348290lBr interfaceC1348290lBr = (InterfaceC1348290lBr) ListProtector.get(this.LLILLL, i);
        int iLIZIZ = interfaceC1348290lBr.LIZIZ();
        if (iLIZIZ != 0) {
            c1349450lDj.LL.setIconRes(iLIZIZ);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1349450lDj.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        int iLJIIL = C2441009hQ.LJIIL(iIntValue, 183);
        c1349450lDj.LL.setTintColor(iLJIIL);
        c1349450lDj.LLILLJJLI.setTextColor(iLJIIL);
        int iLIZLLL = interfaceC1348290lBr.LIZLLL();
        if (iLIZLLL != 0) {
            c1349450lDj.LLILLJJLI.setText(iLIZLLL);
        } else {
            c1349450lDj.LLILLJJLI.setText(interfaceC1348290lBr.getId().getRaw());
        }
        View view = c1349450lDj.itemView;
        IKeyboardIconGroupAssemAbility iKeyboardIconGroupAssemAbilityLIZ = C1349510lDp.LIZ(this.LL);
        if (iKeyboardIconGroupAssemAbilityLIZ != null && iKeyboardIconGroupAssemAbilityLIZ.lM0(interfaceC1348290lBr.getId())) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(view, f);
        C786410Ut5.I7(new ACListenerS124S0200000_21(interfaceC1348290lBr, this, 104), c1349450lDj.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1349450lDj c1349450lDj = new C1349450lDj(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a46, viewGroup, false));
        try {
            View view = c1349450lDj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1349450lDj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1349450lDj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1349450lDj.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1349450lDj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1349450lDj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1349450lDj.class.getName();
        return c1349450lDj;
    }
}
