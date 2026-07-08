package X;

import Y.ACListenerS131S0200000_29;
import Y.ARunnableS73S0200000_4;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.118n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC194523118n {
    public final AnonymousClass1192 LIZ;

    public abstract void LIZ(C1117360fBO c1117360fBO, AnonymousClass1192 anonymousClass1192, String str);

    public final C1117360fBO LIZIZ() {
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLILLJJLI.LIZJ(AnchorModule.class);
        C1117380fBQ c1117380fBQ = new C1117380fBQ(c1117360fBO, AnchorModule.class);
        final AnonymousClass1192 anonymousClass1192 = this.LIZ;
        final AnonymousClass1192 anonymousClass11922 = this.LIZ;
        final AnonymousClass1192 anonymousClass11923 = this.LIZ;
        final AnonymousClass1192 anonymousClass11924 = this.LIZ;
        c1117380fBQ.LIZJ = new C0J8P[]{new AnonymousClass1194<AnchorModule, RecyclerView.ViewHolder>(anonymousClass1192) { // from class: X.118q
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View view = new View(viewGroup.getContext());
                return new RecyclerView.ViewHolder(view) { // from class: X.118s
                };
            }

            @Override // X.C0J8P
            public final /* bridge */ /* synthetic */ void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
            }
        }, new AnonymousClass1194<AnchorModule, RecyclerView.ViewHolder>(anonymousClass11922) { // from class: X.118r
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new RecyclerView.ViewHolder(C786410Ut5.Td(layoutInflater, R.layout.cuq, viewGroup, false)) { // from class: X.0DID
                    {
                        super(view);
                        HandlerHook.viewPost(view, new ARunnableS73S0200000_4(view, this, 0));
                    }
                };
            }

            @Override // X.C0J8P
            public final /* bridge */ /* synthetic */ void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
            }
        }, new AnonymousClass1194<AnchorModule, C194525118p>(anonymousClass11923) { // from class: X.118o
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                C194525118p c194525118p = (C194525118p) viewHolder;
                AnchorModule anchorModule = (AnchorModule) obj;
                if (TextUtils.isEmpty(anchorModule.name)) {
                    C786410Ut5.LLIL(c194525118p.LL, 8);
                } else {
                    C786410Ut5.LLIL(c194525118p.LL, 0);
                    c194525118p.LL.setText(anchorModule.name);
                }
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C194525118p(this, C786410Ut5.Td(layoutInflater, R.layout.cup, viewGroup, false));
            }
        }, new AnonymousClass1194<AnchorModule, C194534118y>(anonymousClass11924) { // from class: X.118x
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                String string;
                C194534118y c194534118y = (C194534118y) viewHolder;
                AnchorModule anchorModule = (AnchorModule) obj;
                TextView textView = c194534118y.LLILLJJLI;
                if (TextUtils.isEmpty(anchorModule.name)) {
                    string = textView.getContext().getString(2131829268);
                } else {
                    string = anchorModule.name;
                }
                textView.setText(string);
                TextView textView2 = c194534118y.LL;
                C194533118x c194533118x = c194534118y.LLILLL;
                ArrayList<AnchorCell> arrayList = anchorModule.cells;
                int i = 0;
                if (arrayList == null || arrayList.size() <= 3) {
                    i = 4;
                }
                C786410Ut5.LLIL(textView2, i);
                C786410Ut5.T7(textView2, new ACListenerS131S0200000_29(c194533118x, anchorModule, 1));
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C194534118y(this, C786410Ut5.Td(layoutInflater, R.layout.cuo, viewGroup, false));
            }
        }, new C194535118z(this.LIZ)};
        c1117380fBQ.LIZ(new InterfaceC1112620f3k() { // from class: X.118N
            @Override // X.InterfaceC1112620f3k
            public final int LIZ(Object obj) {
                ArrayList<AnchorCell> arrayList;
                ArrayList<AnchorCell> arrayList2;
                AnchorModule anchorModule = (AnchorModule) obj;
                Integer num = anchorModule.type;
                if (num != null && num.intValue() == 1) {
                    ArrayList<AnchorCell> arrayList3 = anchorModule.cells;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        return 2;
                    }
                    return 1;
                }
                Integer num2 = anchorModule.type;
                if (num2 != null && num2.intValue() == 2 && (arrayList2 = anchorModule.cells) != null && !arrayList2.isEmpty()) {
                    return 3;
                }
                Integer num3 = anchorModule.type;
                if (num3 != null && num3.intValue() == 3 && (arrayList = anchorModule.cells) != null && !arrayList.isEmpty()) {
                    return 4;
                }
                return 0;
            }
        });
        LIZ(c1117360fBO, this.LIZ, "enter_page");
        return c1117360fBO;
    }

    public AbstractC194523118n(AnonymousClass1192 anonymousClass1192) {
        this.LIZ = anonymousClass1192;
    }
}
