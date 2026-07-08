package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.118z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194535118z extends AnonymousClass1194<AnchorModule, AnonymousClass1190> {
    public final C1117360fBO LIZLLL;

    public C194535118z(final AnonymousClass1192 anonymousClass1192) {
        super(anonymousClass1192);
        C1117360fBO c1117360fBO = new C1117360fBO();
        this.LIZLLL = c1117360fBO;
        c1117360fBO.LLLI(AnchorCell.class, new AnonymousClass1194<AnchorCell, AnonymousClass1196>(anonymousClass1192) { // from class: X.1197
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                String str;
                C424600Gks c424600Gks = ((AnonymousClass1196) viewHolder).LL;
                AnchorIcon anchorIcon = ((AnchorCell) obj).icon;
                if (anchorIcon != null) {
                    str = anchorIcon.uri;
                } else {
                    str = null;
                }
                C1324840ka2.LJIIJ(c424600Gks, str, -1, -1);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new AnonymousClass1196(this, C786410Ut5.Td(layoutInflater, R.layout.cul, viewGroup, false));
            }
        });
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        AnchorModule anchorModule = (AnchorModule) obj;
        ArrayList<AnchorCell> arrayList = anchorModule.cells;
        if (arrayList != null && !arrayList.isEmpty()) {
            C1117360fBO c1117360fBO = this.LIZLLL;
            ArrayList<AnchorCell> arrayList2 = anchorModule.cells;
            c1117360fBO.LL = arrayList2;
            c1117360fBO.notifyItemRangeChanged(0, arrayList2.size());
        }
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cuk, viewGroup, false);
        return new AnonymousClass1194<AnchorModule, AnonymousClass1190>.a(this, viewTd) { // from class: X.1190
            {
                super(this, viewTd);
                RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.t0k);
                Context context = viewTd.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                final int iLIZJ = (int) C12ES.LIZJ(4.0f, context);
                recyclerView.addItemDecoration(new C0DXR(iLIZJ) { // from class: X.1191
                    public final int LL;

                    {
                        this.LL = iLIZJ;
                    }

                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                        rect.left = this.LL;
                    }
                });
                recyclerView.setAdapter(this.LIZLLL);
            }
        };
    }
}
