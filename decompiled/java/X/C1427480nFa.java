package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.services.editeffect.ISearchSugHelper;
import com.zhiliaoapp.musically.R;
import irm.AkS90S0100000_22;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: X.0nFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427480nFa extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public String LLILLJJLI;
    public C1426150nDR LLILLL;
    public final List<SearchSugEntity> LL = new ArrayList();
    public final TreeSet<C1426830nEX> LLILZ = C093Z.LIZ(C20085613iQ.LIZ(new C2217381BqS() { // from class: X.0nFS
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1426830nEX) obj).LIZJ;
        }
    }, new C2217381BqS() { // from class: X.0nFQ
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return Integer.valueOf(((C1426830nEX) obj).LIZLLL);
        }
    }, new C2217381BqS() { // from class: X.0nFU
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1426830nEX) obj).LJ;
        }
    }, new C2217381BqS() { // from class: X.0nFi
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1426830nEX) obj).LJFF;
        }
    }, new C2217381BqS() { // from class: X.0nFW
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1426830nEX) obj).LJI;
        }
    }, new C2217381BqS() { // from class: X.0nFY
        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
        public final Object get(Object obj) {
            return ((C1426830nEX) obj).LJII;
        }
    }), new C1426830nEX[0]);

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

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1427510nFd c1427510nFd;
        C1426830nEX c1426830nEXI5;
        InterfaceC1426290nDf interfaceC1426290nDf;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof C1427510nFd) && (c1426830nEXI5 = (c1427510nFd = (C1427510nFd) viewHolder).I5()) != null && (interfaceC1426290nDf = c1427510nFd.LLILLJJLI) != null) {
            interfaceC1426290nDf.LIZIZ(c1426830nEXI5);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof C1427510nFd)) {
            return;
        }
        C1427510nFd c1427510nFd = (C1427510nFd) viewHolder;
        SearchSugEntity searchSugEntity = (SearchSugEntity) ListProtector.get(this.LL, i);
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        c1427510nFd.getClass();
        if (searchSugEntity != null) {
            int i2 = searchSugEntity.LIZJ;
            if (i2 >= 0) {
                i = i2;
            }
            c1427510nFd.LLILZLL = i;
            c1427510nFd.LLILZIL = searchSugEntity;
            c1427510nFd.LLIZ = str;
            c1427510nFd.itemView.setTag(c1427510nFd);
            C1427540nFg c1427540nFg = c1427510nFd.LL;
            c1427540nFg.LLILLJJLI.setBackground(c1427510nFd.LLJ.LIZ(c1427540nFg.LL.getContext()));
            C786410Ut5.I7(new AkS90S0100000_22(c1427510nFd, 0), c1427510nFd.LL.LL);
            ISearchSugHelper iSearchSugHelper = c1427510nFd.LLILLL;
            if (iSearchSugHelper != null) {
                iSearchSugHelper.bindLiteSug(searchSugEntity, c1427510nFd.LL.LLILLL, c1427510nFd.itemView, c1427510nFd.LLIZLLLIL, c1427510nFd.LLILZ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1426300nDg c1426300nDg;
        final C1426150nDR c1426150nDR = this.LLILLL;
        if (c1426150nDR != null) {
            c1426300nDg = new InterfaceC1426290nDf(c1426150nDR, this) { // from class: X.0nDg
                public final /* synthetic */ InterfaceC1426290nDf LIZ;
                public final /* synthetic */ InterfaceC1426290nDf LIZIZ;
                public final /* synthetic */ C1427480nFa LIZJ;

                @Override // X.InterfaceC1426290nDf
                public final void LIZ(SearchSugEntity searchSugEntity) {
                    this.LIZ.LIZ(searchSugEntity);
                }

                @Override // X.InterfaceC1426290nDf
                public final void LIZIZ(C1426830nEX c1426830nEX) {
                    if (c1426830nEX.LIZ) {
                        this.LIZJ.LLILZ.add(c1426830nEX);
                    }
                    this.LIZIZ.LIZIZ(c1426830nEX);
                }

                {
                    this.LIZIZ = c1426150nDR;
                    this.LIZJ = this;
                    this.LIZ = c1426150nDR;
                }
            };
        } else {
            c1426300nDg = 0;
        }
        int i2 = C1427510nFd.LLJI;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(C1385040m98.LIZ(viewGroup.getContext(), true)), R.layout.byc, viewGroup, false);
        int i3 = R.id.vym;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.vym, viewTd);
        if (tuxIconView != null) {
            i3 = R.id.tvl_sug;
            C21415018rM c21415018rM = (C21415018rM) C1616006Uk.LIZ(R.id.tvl_sug, viewTd);
            if (c21415018rM != null) {
                C1427510nFd c1427510nFd = new C1427510nFd(new C1427540nFg((ConstraintLayout) viewTd, tuxIconView, c21415018rM), c1426300nDg);
                try {
                    View view = c1427510nFd.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1427510nFd.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1427510nFd.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1427510nFd.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1427510nFd.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1427510nFd.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1427510nFd.class.getName();
                return c1427510nFd;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i3)));
    }
}
