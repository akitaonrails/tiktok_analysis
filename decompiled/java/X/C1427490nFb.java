package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427490nFb extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public String LLILLJJLI;
    public C1424380nAa LLILLL;
    public final List<SearchSugEntity> LL = new ArrayList();
    public final TreeSet<C1424200nAI> LLILZ = C093Z.LIZ(C20085613iQ.LIZ(new C2217381BqS() { // from class: X.0nFT
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1424200nAI) obj).LIZJ;
        }
    }, new C2217381BqS() { // from class: X.0nFR
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return Integer.valueOf(((C1424200nAI) obj).LIZLLL);
        }
    }, new C2217381BqS() { // from class: X.0nFV
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1424200nAI) obj).LJ;
        }
    }, new C2217381BqS() { // from class: X.0nFj
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1424200nAI) obj).LJFF;
        }
    }, new C2217381BqS() { // from class: X.0nFX
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1424200nAI) obj).LJI;
        }
    }, new C2217381BqS() { // from class: X.0nFZ
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1424200nAI) obj).LJII;
        }
    }), new C1424200nAI[0]);

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return 9;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.getRecycledViewPool().setMaxRecycledViews(9, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof InterfaceC669260QMy) {
            ((InterfaceC669260QMy) viewHolder).onViewAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof InterfaceC669260QMy) {
            ((InterfaceC669260QMy) viewHolder).onViewDetachedFromWindow();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof C1427500nFc)) {
            return;
        }
        C1427500nFc c1427500nFc = (C1427500nFc) viewHolder;
        SearchSugEntity searchSugEntity = (SearchSugEntity) ListProtector.get(this.LL, i);
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 141);
        if (searchSugEntity == null) {
            c1427500nFc.getClass();
            return;
        }
        c1427500nFc.LLJIJIL = awS601S0100000_22;
        int i2 = searchSugEntity.LIZJ;
        if (i2 >= 0) {
            i = i2;
        }
        c1427500nFc.LLIZLLLIL = i;
        c1427500nFc.LLIZ = searchSugEntity;
        C668470QJx.LIZ(searchSugEntity);
        c1427500nFc.LLJ = str;
        c1427500nFc.itemView.setTag(c1427500nFc);
        if (searchSugEntity.LIZJ()) {
            TuxIconView tuxIconView = c1427500nFc.LLILZLL;
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(c1427500nFc.LLJJ);
            }
            TuxIconView tuxIconView2 = c1427500nFc.LLILZIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setImageDrawable(c1427500nFc.LLJILLL);
            }
            TuxIconView tuxIconView3 = c1427500nFc.LLILZIL;
            if (tuxIconView3 != null) {
                tuxIconView3.setContentDescription(c1427500nFc.itemView.getContext().getString(2131823323));
            }
        } else {
            TuxIconView tuxIconView4 = c1427500nFc.LLILZLL;
            if (tuxIconView4 != null) {
                tuxIconView4.setImageDrawable(c1427500nFc.LLJJI);
            }
            TuxIconView tuxIconView5 = c1427500nFc.LLILZIL;
            if (tuxIconView5 != null) {
                tuxIconView5.setImageDrawable(c1427500nFc.LLJJIII);
            }
            TuxIconView tuxIconView6 = c1427500nFc.LLILZIL;
            if (tuxIconView6 != null) {
                tuxIconView6.setContentDescription(c1427500nFc.itemView.getContext().getString(2131823322));
            }
        }
        C669090QMh.LIZIZ(C669090QMh.LIZ, searchSugEntity, c1427500nFc.LLILZ, c1427500nFc.LLJILJILJ, c1427500nFc.L5(), null, 32);
        if (c1427500nFc.LLJI) {
            return;
        }
        c1427500nFc.LLJI = true;
        HandlerHook.viewPost(c1427500nFc.itemView, new ARunnableS116S0100000_16(c1427500nFc, 72));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1427530nFf c1427530nFf;
        final C1424380nAa c1424380nAa = this.LLILLL;
        if (c1424380nAa != null) {
            c1427530nFf = new InterfaceC1427550nFh(c1424380nAa, this) { // from class: X.0nFf
                public final /* synthetic */ InterfaceC1427550nFh LIZ;
                public final /* synthetic */ InterfaceC1427550nFh LIZIZ;
                public final /* synthetic */ C1427490nFb LIZJ;

                @Override // X.InterfaceC1427550nFh
                public final void LIZ(int i2, SearchSugEntity searchSugEntity) {
                    this.LIZ.LIZ(i2, searchSugEntity);
                }

                @Override // X.InterfaceC1427550nFh
                public final void LIZJ() {
                    this.LIZ.LIZJ();
                }

                @Override // X.InterfaceC1427550nFh
                public final void LIZLLL(SearchSugEntity searchSugEntity) {
                    this.LIZ.LIZLLL(searchSugEntity);
                }

                @Override // X.InterfaceC1427550nFh
                public final void LJ(SearchSugEntity searchSugEntity) {
                    this.LIZ.LJ(searchSugEntity);
                }

                @Override // X.InterfaceC1427550nFh
                public final void LIZIZ(C1424200nAI c1424200nAI) {
                    if (c1424200nAI.LIZ) {
                        this.LIZJ.LLILZ.add(c1424200nAI);
                    }
                    this.LIZIZ.LIZIZ(c1424200nAI);
                }

                {
                    this.LIZIZ = c1424380nAa;
                    this.LIZJ = this;
                    this.LIZ = c1424380nAa;
                }
            };
        } else {
            c1427530nFf = 0;
        }
        int i2 = C1427500nFc.LLJJIJI;
        C1427500nFc c1427500nFc = new C1427500nFc(C786410Ut5.Td(C786410Ut5.ne((Context) C452501pT.LIZIZ(new AwS566S0100000_22(viewGroup, 233)).getValue()), R.layout.ezx, viewGroup, false), c1427530nFf);
        try {
            View view = c1427500nFc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1427500nFc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1427500nFc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1427500nFc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1427500nFc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1427500nFc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1427500nFc.class.getName();
        return c1427500nFc;
    }
}
