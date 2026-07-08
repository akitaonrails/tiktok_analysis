package X;

import Y.ARunnableS110S0100000_10;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS139S0400000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653070PjV extends AbstractC652330PiJ implements InterfaceC648130PbX, C0PUC {
    public static final /* synthetic */ int LLJJIII = 0;
    public final SearchResultParam LLJI;
    public final ViewGroup LLJIJIL;
    public final TextView LLJILJIL;
    public SearchSpot LLJILJILJ;
    public boolean LLJILLL;
    public final C653090PjX LLJJ;
    public final C01GW LLJJI;

    @Override // X.C0PUC
    public final Aweme LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC648130PbX
    public final C0PUC LJJZZI() {
        return this;
    }

    @Override // X.C0PUC
    public final void LLLILZLLLI(int i) {
    }

    @Override // X.InterfaceC648130PbX
    public final InterfaceC648270Pbl LLLLLLLZIL() {
        return null;
    }

    @Override // X.C0PUC
    public final void LLLLLZ() {
    }

    @Override // X.C0PUC
    public final void LLZZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.C0PUC
    public final int getViewType() {
        return 70;
    }

    @Override // X.C0PUC
    public final void n4(MotionEvent motionEvent) {
    }

    public final C652890PjD S5() {
        return (C652890PjD) this.LLJJI.getValue();
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return C659230PtR.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return S5().isPlaying();
    }

    @Override // X.C0PUC
    public final int k2() {
        return getAdapterPosition();
    }

    @Override // X.C0PUC
    public final SearchResultParam I() {
        return this.LLJI;
    }

    @Override // X.C0PUC
    public final boolean LIZLLL() {
        return this.LLILLL;
    }

    @Override // X.C0PUC
    public final boolean LLLZZIL() {
        return this.LLJILLL;
    }

    @Override // X.C0PUC
    public final View getItemView() {
        return this.itemView;
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        C659230PtR.LIZJ(this, c650630PfZ);
    }

    @Override // X.AbstractC652330PiJ, X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        InterfaceC656470Poz interfaceC656470Poz;
        super.onViewAttachedToWindow(view);
        C0PPS.LIZ(this.itemView, new ARunnableS110S0100000_10(this, 106));
        if (!this.LLJILLL) {
            RecyclerView recyclerViewLJIIIIZZ = S5().LJIIIIZZ();
            ArrayList<ViewOnAttachStateChangeListenerC656430Pov> arrayList = new ArrayList();
            int childCount = recyclerViewLJIIIIZZ.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(recyclerViewLJIIIIZZ.getChildViewHolder(recyclerViewLJIIIIZZ.getChildAt(i)));
            }
            List<Aweme> awemeCards = this.LLJILJILJ.getAwemeCards();
            if (awemeCards == null) {
                awemeCards = C13BV.INSTANCE;
            }
            for (ViewOnAttachStateChangeListenerC656430Pov viewOnAttachStateChangeListenerC656430Pov : arrayList) {
                int bindingAdapterPosition = viewOnAttachStateChangeListenerC656430Pov.getBindingAdapterPosition();
                Aweme aweme = (Aweme) ListProtector.get(awemeCards, bindingAdapterPosition);
                if (bindingAdapterPosition != -1 && (interfaceC656470Poz = viewOnAttachStateChangeListenerC656430Pov.LLJIJIL) != null) {
                    interfaceC656470Poz.LIZ(bindingAdapterPosition, aweme);
                }
            }
        }
    }

    @Override // X.AbstractC652330PiJ, X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        this.LLJILLL = false;
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        C659230PtR.LIZ(this, c650630PfZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R5(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r16, X.C653660PkS r17) {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C653070PjV.R5(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, X.0PkS):void");
    }

    public C653070PjV(SearchResultParam searchResultParam, View view, InterfaceC641090PCp interfaceC641090PCp, InterfaceC652950PjJ interfaceC652950PjJ) {
        super(view, interfaceC641090PCp);
        this.LLJI = searchResultParam;
        this.LLJIJIL = (ViewGroup) view.findViewById(R.id.u75);
        this.LLJILJIL = (TextView) view.findViewById(R.id.cw8);
        this.LLJJ = new C653090PjX((ViewStub) view.findViewById(R.id.jkl), new AwS554S0100000_10(this, 971));
        this.LLJJI = C452501pT.LIZIZ(new AwS139S0400000_10(this, view, interfaceC641090PCp, interfaceC652950PjJ, 2));
    }
}
