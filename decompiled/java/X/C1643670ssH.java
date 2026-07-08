package X;

import Y.ACListenerS24S0301000_25;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ssH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643670ssH extends AbstractC2172971A2l<AIPlaygroundChipsModel, C1643690ssJ> {
    public final InterfaceC1631620sYq<AIPlaygroundChipsModel, Integer, Boolean, Unit> LLILLJJLI;
    public int LLILLL;
    public List<AIPlaygroundChipsModel> LLILZ;

    public C1643670ssH(C21285818Rs c21285818Rs) {
        super(new AbstractC339510DSr<AIPlaygroundChipsModel>() { // from class: X.0ssI
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(AIPlaygroundChipsModel aIPlaygroundChipsModel, AIPlaygroundChipsModel aIPlaygroundChipsModel2) {
                return Intrinsics.LJFF(aIPlaygroundChipsModel.id, aIPlaygroundChipsModel2.id);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(AIPlaygroundChipsModel aIPlaygroundChipsModel, AIPlaygroundChipsModel aIPlaygroundChipsModel2) {
                AIPlaygroundChipsModel aIPlaygroundChipsModel3 = aIPlaygroundChipsModel;
                AIPlaygroundChipsModel aIPlaygroundChipsModel4 = aIPlaygroundChipsModel2;
                if (Intrinsics.LJFF(aIPlaygroundChipsModel3.id, aIPlaygroundChipsModel4.id) && Intrinsics.LJFF(aIPlaygroundChipsModel3.title, aIPlaygroundChipsModel4.title)) {
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI = c21285818Rs;
        this.LLILLL = -1;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLIIIIL, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C1643690ssJ c1643690ssJ, int i) {
        boolean z;
        AIPlaygroundChipsModel aIPlaygroundChipsModelLLLFZ = LLLFZ(i);
        TuxTextView tuxTextView = (TuxTextView) c1643690ssJ.itemView;
        tuxTextView.setText(aIPlaygroundChipsModelLLLFZ.title);
        if (i == this.LLILLL) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView.setSelected(z);
        C786410Ut5.h9(tuxTextView, new ACListenerS24S0301000_25(this, c1643690ssJ, aIPlaygroundChipsModelLLLFZ, i, 2));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final TuxTextView tuxTextView = (TuxTextView) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.mz, viewGroup, false);
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(tuxTextView) { // from class: X.0ssJ
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1643690ssJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1643690ssJ.class.getName();
        return viewHolder;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C1643690ssJ c1643690ssJ = (C1643690ssJ) viewHolder;
        boolean z = true;
        if ((!list.isEmpty()) && Intrinsics.LJFF(ListProtector.get(list, 0), "sel")) {
            if (i != this.LLILLL) {
                z = false;
            }
            c1643690ssJ.itemView.setSelected(z);
            return;
        }
        onBindViewHolder(c1643690ssJ, i);
    }
}
