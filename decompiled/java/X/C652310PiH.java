package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C652310PiH extends AbstractC652330PiJ implements C0PUC, InterfaceC648310Pbp, InterfaceC648130PbX {
    public static final /* synthetic */ int LLJL = 0;
    public final InterfaceC641090PCp LLJI;
    public final InterfaceC652950PjJ LLJIJIL;
    public final Fragment LLJILJIL;
    public final C650350Pf7 LLJILJILJ;
    public final ViewGroup LLJILLL;
    public boolean LLJJ;
    public String LLJJI;
    public C652320PiI LLJJIII;
    public TuxTextView LLJJIJI;
    public View LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxIconView LLJJJIL;
    public LinearLayout LLJJJJ;
    public int LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final int LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    @Override // X.C0PUC
    public final SearchResultParam I() {
        return null;
    }

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
        return 72;
    }

    @Override // X.C0PUC
    public final void n4(MotionEvent motionEvent) {
    }

    @Override // X.AbstractC652330PiJ, X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        this.LLJILJILJ.LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU LLL() {
        return (C652600Pik) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU n5() {
        return (C652600Pik) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.InterfaceC648310Pbp
    public final boolean K4() {
        return (C301200BrK.LIZ() || C301190BrJ.LIZ()) ? false : true;
    }

    @Override // X.AbstractC652330PiJ, X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        if (C301200BrK.LIZ() || C301190BrJ.LIZ()) {
            this.LLJILJILJ.LJJJLIIL();
        } else {
            ((C652600Pik) this.LLJJLIIIJLLLLLLLZ.getValue()).LJFF();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        if (C301200BrK.LIZ() || C301190BrJ.LIZ()) {
            return this.LLJILJILJ.isPlaying();
        }
        C652320PiI c652320PiI = this.LLJJIII;
        return c652320PiI != null && c652320PiI.isPlaying();
    }

    @Override // X.C0PUC
    public final int k2() {
        return getAdapterPosition() < 0 ? this.LLJJJJJIL : getAdapterPosition();
    }

    @Override // X.InterfaceC648310Pbp
    public final int y1() {
        return hashCode();
    }

    @Override // X.C0PUC
    public final boolean LIZLLL() {
        return this.LLILLL;
    }

    @Override // X.C0PUC
    public final boolean LLLZZIL() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC648310Pbp
    public final View d5() {
        return this.itemView;
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return this.itemView;
    }

    @Override // X.C0PUC
    public final View getItemView() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        C659230PtR.LIZJ(this, c650630PfZ);
    }

    @Override // X.AbstractC652330PiJ, X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        super.onViewAttachedToWindow(view);
        if (C301200BrK.LIZ() && (interfaceC665370Q7zLJIIL = C1558360qeg.LJIIL(this.itemView, null, 3)) != null) {
            this.LLJILJILJ.LLILLJJLI = interfaceC665370Q7zLJIIL;
        }
    }

    @Override // X.AbstractC652330PiJ, X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        if (C301200BrK.LIZ()) {
            this.LLJILJILJ.LLILLJJLI = null;
        }
        super.onViewDetachedFromWindow(view);
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        C659230PtR.LIZ(this, c650630PfZ);
    }

    @Override // X.InterfaceC648310Pbp
    public final void LJJLL(Aweme aweme, C0PBW c0pbw) {
        C648300Pbo.LIZIZ(this, aweme, c0pbw);
    }

    @Override // X.AbstractC652330PiJ, X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        if (!C301200BrK.LIZ() && !C301190BrJ.LIZ()) {
            ((C652600Pik) this.LLJJLIIIJLLLLLLLZ.getValue()).LJ();
        } else {
            this.LLJILJILJ.W0(j, null);
        }
    }

    public C652310PiH(View view, InterfaceC641090PCp interfaceC641090PCp, InterfaceC652950PjJ interfaceC652950PjJ, Fragment fragment) {
        super(view, interfaceC641090PCp);
        this.LLJI = interfaceC641090PCp;
        this.LLJIJIL = interfaceC652950PjJ;
        this.LLJILJIL = fragment;
        this.LLJILJILJ = new C650350Pf7(view);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.u75);
        this.LLJJI = "";
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 502));
        this.LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS411S0200000_10(view, this, 35));
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R5(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r18, X.C653660PkS r19, int r20, com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel r21) {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C652310PiH.R5(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, X.0PkS, int, com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel):void");
    }
}
