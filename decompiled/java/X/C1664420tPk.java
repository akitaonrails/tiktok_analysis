package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664420tPk extends AbstractC21673619ry<C1664450tPn> {
    public List<? extends List<? extends Effect>> LL = C13BV.INSTANCE;
    public C19754712Qv LLILLJJLI;
    public Effect LLILLL;
    public InterfaceC1664180tPM LLILZ;
    public C12RW LLILZIL;
    public InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        C19754712Qv c19754712Qv;
        RecyclerView recyclerView;
        C1664150tPJ c1664150tPJLJIIJJI;
        Effect effect;
        final C1664450tPn c1664450tPn = (C1664450tPn) viewHolder;
        C12RW c12rw = this.LLILZIL;
        if (c12rw != null) {
            c12rw.LIZJ.put(Integer.valueOf(i), c1664450tPn.LL);
        }
        c1664450tPn.LL.LJII(this.LLILZ);
        C12RW c12rw2 = this.LLILZIL;
        String effectId = null;
        if (c12rw2 != null && (c1664150tPJLJIIJJI = c12rw2.LJIIJJI()) != null && (effect = c1664150tPJLJIIJJI.LIZ) != null) {
            Effect effect2 = this.LLILLL;
            if (effect2 != null) {
                effectId = effect2.getEffectId();
            }
            if (!Intrinsics.LJFF(effectId, effect.getEffectId())) {
                this.LLILLL = effect;
            }
        }
        List<? extends Effect> list = (List) ListProtector.get(this.LL, i);
        C12RW c12rw3 = this.LLILZIL;
        if (c12rw3 == null || (c19754712Qv = c12rw3.LIZLLL) == null) {
            c19754712Qv = this.LLILLJJLI;
        }
        Effect effect3 = this.LLILLL;
        if (c19754712Qv != null) {
            c1664450tPn.LL.LJIIIZ(list, c19754712Qv, effect3);
        }
        View view = c1664450tPn.itemView;
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
            recyclerView.addOnScrollListener(new AbstractC1585810rMx(c1664450tPn, this, i) { // from class: X.0tPl
                public final GridLayoutManager LL;
                public boolean LLILLJJLI;
                public int LLILLL;
                public final /* synthetic */ C1664420tPk LLILZ;
                public final /* synthetic */ int LLILZIL;

                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i2) {
                    InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr;
                    if (this.LLILLL == 0) {
                        int iFindFirstCompletelyVisibleItemPosition = this.LL.findFirstCompletelyVisibleItemPosition();
                        int iFindLastCompletelyVisibleItemPosition = this.LL.findLastCompletelyVisibleItemPosition();
                        this.LLILLL = iFindLastCompletelyVisibleItemPosition;
                        if (iFindLastCompletelyVisibleItemPosition == C1697810uHb.LJIIJ((List) ListProtector.get(this.LLILZ.LL, this.LLILZIL))) {
                            this.LLILLJJLI = true;
                            InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr2 = this.LLILZ.LLILZLL;
                            if (interfaceC1631630sYr2 != null) {
                                interfaceC1631630sYr2.invoke(-1, Integer.valueOf(iFindFirstCompletelyVisibleItemPosition), Integer.valueOf(iFindLastCompletelyVisibleItemPosition), Integer.valueOf(this.LLILZIL));
                                return;
                            }
                            return;
                        }
                        this.LLILLJJLI = false;
                        return;
                    }
                    if (!this.LLILLJJLI || (interfaceC1631630sYr = this.LLILZ.LLILZLL) == null) {
                        return;
                    }
                    interfaceC1631630sYr.invoke(-1, 0, Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILZIL));
                }

                {
                    this.LLILZ = this;
                    this.LLILZIL = i;
                    this.LL = (GridLayoutManager) ((RecyclerView) c1664450tPn.itemView).getLayoutManager();
                }

                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView2, int i2, int i3) {
                    this.LLILLJJLI = false;
                    int iFindFirstCompletelyVisibleItemPosition = this.LL.findFirstCompletelyVisibleItemPosition();
                    int iFindLastCompletelyVisibleItemPosition = this.LL.findLastCompletelyVisibleItemPosition();
                    InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr = this.LLILZ.LLILZLL;
                    if (interfaceC1631630sYr != null) {
                        interfaceC1631630sYr.invoke(Integer.valueOf(i3), Integer.valueOf(iFindFirstCompletelyVisibleItemPosition), Integer.valueOf(iFindLastCompletelyVisibleItemPosition), Integer.valueOf(this.LLILZIL));
                    }
                }
            });
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(viewGroup.getContext(), 4);
        C1664120tPG c1664120tPG = new C1664120tPG();
        RecyclerView recyclerViewLIZLLL = c1664120tPG.LIZLLL(viewGroup.getContext(), gridLayoutManager, new C1664440tPm());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart((int) (((double) C1415610mwR.LIZIZ()) * 0.04d));
        layoutParams.setMarginEnd((int) (((double) C1415610mwR.LIZIZ()) * 0.04d));
        C1664220tPQ c1664220tPQ = new C1664220tPQ(false);
        c1664220tPQ.LLJIJIL = AFwS214S0000000_25.get$arr$(535);
        c1664120tPG.LJFF(c1664220tPQ);
        recyclerViewLIZLLL.setItemAnimator(null);
        C786410Ut5.p6(recyclerViewLIZLLL, layoutParams);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.setAnimateParentHierarchy(false);
        }
        LayoutTransition layoutTransition2 = recyclerViewLIZLLL.getLayoutTransition();
        if (layoutTransition2 != null) {
            layoutTransition2.setAnimateParentHierarchy(false);
        }
        C1664450tPn c1664450tPn = new C1664450tPn(recyclerViewLIZLLL, c1664120tPG);
        try {
            View view = c1664450tPn.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1664450tPn.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1664450tPn.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1664450tPn.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1664450tPn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1664450tPn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1664450tPn.class.getName();
        return c1664450tPn;
    }
}
