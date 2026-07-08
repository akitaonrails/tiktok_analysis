package X;

import Y.ACListenerS20S0301000_6;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447390HgX extends AbstractC21673619ry<C447410HgZ> {
    public RecyclerView LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1597));
    public final List<Effect> LLILLL = new ArrayList();
    public int LLILZ = -1;
    public Function1<? super Effect, Unit> LLILZIL;
    public boolean LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LL = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C447410HgZ c447410HgZ = (C447410HgZ) viewHolder;
        if (((ArrayList) this.LLILLL).size() > i) {
            Effect effect = (Effect) ListProtector.get(this.LLILLL, i);
            C786410Ut5.LJLLLLLL(8, c447410HgZ.LLILLJJLI);
            if (!effect.getIcon_url().getUrlList().isEmpty()) {
                String str = (String) ListProtector.get(effect.getIcon_url().getUrlList(), 0);
                float f = 22.0f * c447410HgZ.itemView.getContext().getResources().getDisplayMetrics().density;
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = true;
                c1331750klB.LJ = f;
                C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
                c447410HgZ.LL.setCircleOptions(c1331730kl9);
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJIJL(c447410HgZ.LL.getContext());
                c1331670kl3LJIIIZ.LJJ(c447410HgZ.LL);
                c1331670kl3LJIIIZ.LJJI = c1331730kl9;
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
            C786410Ut5.I7(new ACListenerS20S0301000_6(this, c447410HgZ, i, effect, 2), c447410HgZ.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C447410HgZ c447410HgZ = new C447410HgZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.egz, viewGroup, false));
        if (((Number) this.LLILLJJLI.getValue()).intValue() < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) * 6) {
            c447410HgZ.itemView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47));
            c447410HgZ.itemView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47));
            C426750GoL.LJIIL(c447410HgZ.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
        }
        try {
            View view = c447410HgZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c447410HgZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c447410HgZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C447410HgZ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c447410HgZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c447410HgZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C447410HgZ.class.getName();
        return c447410HgZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C447410HgZ c447410HgZ = (C447410HgZ) viewHolder;
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (objLJJJLL != null) {
            if (Intrinsics.LJFF(objLJJJLL, 1)) {
                C786410Ut5.LJLLLLLL(8, c447410HgZ.LLILLJJLI);
                return;
            }
            C786410Ut5.LJLLLLLL(0, c447410HgZ.LLILLJJLI);
            ColorStateList colorStateListValueOf = null;
            if (this.LLILZLL) {
                View view = c447410HgZ.LLILLJJLI;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, c447410HgZ.itemView.getContext());
                if (numLIZJ != null) {
                    colorStateListValueOf = ColorStateList.valueOf(numLIZJ.intValue());
                }
                view.setBackgroundTintList(colorStateListValueOf);
                return;
            }
            c447410HgZ.LLILLJJLI.setBackgroundTintList(null);
            return;
        }
        super.onBindViewHolder(c447410HgZ, i, list);
    }
}
