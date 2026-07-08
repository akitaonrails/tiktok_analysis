package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0b6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960390b6D extends AbstractC960400b6E<C960450b6J> {
    public final C1117360fBO LLILZ;
    public final RecyclerView LLILZIL;
    public final Set<Long> LLILZLL;
    public final C958300b2q LLIZ;

    @Override // X.AbstractC960400b6E
    public final String getName() {
        return "BattlePairListViewHolder";
    }

    @Override // X.AbstractC960400b6E
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        this.LLILZIL.addOnChildAttachStateChangeListener(this.LLIZ);
    }

    @Override // X.AbstractC960400b6E
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        this.LLILZIL.removeOnChildAttachStateChangeListener(this.LLIZ);
    }

    @Override // X.AbstractC960400b6E
    public final void I5(List list, int i, Object obj) {
        C960450b6J c960450b6J = (C960450b6J) obj;
        if (i == 0) {
            C500260Jjc.LJLJL(0, this.itemView);
        } else {
            C500260Jjc.LJLJL(C439101nJ.LIZ(16), this.itemView);
        }
        C410901il c410901il = c960450b6J.LJ;
        C1117360fBO c1117360fBO = this.LLILZ;
        c1117360fBO.LL = c410901il;
        c1117360fBO.notifyDataSetChanged();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0b2q] */
    public C960390b6D(View view, final InterfaceC956060azE interfaceC956060azE, final InterfaceC956210azT interfaceC956210azT, final DataChannel dataChannel, AbstractC960950b77 abstractC960950b77) {
        super(view);
        C1117360fBO c1117360fBO = new C1117360fBO();
        this.LLILZ = c1117360fBO;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.t10);
        this.LLILZIL = recyclerView;
        this.LLILZLL = new LinkedHashSet();
        this.LLIZ = new InterfaceC21676519sR() { // from class: X.0b2q
            @Override // X.InterfaceC21676519sR
            public final void m3(View view2) {
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
            @Override // X.InterfaceC21676519sR
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void g5(android.view.View r17) {
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C958300b2q.g5(android.view.View):void");
            }
        };
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(0);
        c1117360fBO.LLLI(C958360b2w.class, new AbstractC960410b6F<C958360b2w, C958330b2t>(interfaceC956060azE, interfaceC956210azT, dataChannel) { // from class: X.0b2u
            public final InterfaceC956060azE LIZIZ;
            public final InterfaceC956210azT LIZJ;
            public final DataChannel LIZLLL;

            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "BattlePairViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View viewFindViewById;
                View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gsl, viewGroup, false);
                if (viewTd != null && (viewFindViewById = viewTd.findViewById(R.id.bwo)) != null) {
                    C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_interaction_normal_1", "ttlive_cohost_bg_battle_pairing_item.png");
                }
                return new C958330b2t(viewTd, this.LIZIZ, this.LIZJ, this.LIZLLL);
            }

            {
                this.LIZIZ = interfaceC956060azE;
                this.LIZJ = interfaceC956210azT;
                this.LIZLLL = dataChannel;
            }
        });
        new C955510ayL(recyclerView, abstractC960950b77);
        recyclerView.setAdapter(c1117360fBO);
        recyclerView.setItemViewCacheSize(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        new C20635115or().LIZIZ(recyclerView);
    }
}
