package X;

import Y.ACListenerS159S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0tMN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662330tMN extends C1662320tMM {
    public final ShortVideoContext LLLIZZ;
    public final boolean LLLJ;
    public RemoteImageView LLLJIL;
    public boolean LLLJL;

    @Override // X.C1662320tMM
    public final boolean LLLLLJLJLL() {
        return this.LLLJ;
    }

    @Override // X.C1662320tMM, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (d4.LIZ(this.LLLIZZ) && !this.LLLJL) {
            LLLLIL().LJ.invoke();
            this.LLLJL = true;
        }
    }

    @Override // X.C1662320tMM
    public final void LLLLLLJ(boolean z, boolean z2) {
        C0GSN c0gsn;
        if (!z && (c0gsn = this.LLLFF) != null) {
            c0gsn.setNeedLinearBackground(false);
        }
    }

    @Override // X.C1662320tMM, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxIconView tuxIconView;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eqx, viewGroup, false);
        View viewFindViewById = viewGroup3.findViewById(R.id.d9p);
        TuxTextView tuxTextView = null;
        if (viewFindViewById instanceof TuxIconView) {
            tuxIconView = (TuxIconView) viewFindViewById;
        } else {
            tuxIconView = null;
        }
        this.LLJLLL = tuxIconView;
        View viewFindViewById2 = viewGroup3.findViewById(R.id.d9q);
        if (viewFindViewById2 instanceof TuxTextView) {
            tuxTextView = (TuxTextView) viewFindViewById2;
        }
        this.LLJZ = tuxTextView;
        this.LLJZIJLIL = viewGroup3.findViewById(R.id.q98);
        this.LLL = (ViewGroup) viewGroup3.findViewById(R.id.d9n);
        this.LLLF = (FrameLayout) viewGroup3.findViewById(R.id.sza);
        this.LLLFF = (C0GSN) viewGroup3.findViewById(R.id.sz9);
        this.LLLFFI = (ViewGroup) viewGroup3.findViewById(R.id.sz_);
        this.LLLFZ = (C1642110spl) viewGroup3.findViewById(R.id.cwd);
        this.LLLI = (ViewGroup) viewGroup3.findViewById(R.id.q95);
        this.LLLII = (ViewGroup) viewGroup3.findViewById(R.id.tp4);
        this.LLLIIIIL = (TuxTextView) viewGroup3.findViewById(R.id.q_6);
        viewGroup3.findViewById(R.id.owe);
        this.LLLJIL = (RemoteImageView) viewGroup3.findViewById(R.id.ou1);
        viewGroup3.findViewById(R.id.uz1);
        viewGroup3.findViewById(R.id.ox6);
        viewGroup3.findViewById(R.id.ouj);
        viewGroup3.findViewById(R.id.das);
        C0GSN c0gsn = this.LLLFF;
        if (c0gsn != null) {
            C1447470nlp.LIZIZ(c0gsn, C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
        }
        View view = this.LLJZIJLIL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 8), view);
        }
        ViewGroup viewGroup4 = this.LLL;
        if (viewGroup4 != null) {
            C786410Ut5.K7(viewGroup4, new ACListenerS159S0100000_25(this, 9));
        }
        C1642110spl c1642110spl = this.LLLFZ;
        if (c1642110spl != null) {
            C786410Ut5.wa(c1642110spl, new ACListenerS159S0100000_25(this, 10));
        }
        C1642110spl c1642110spl2 = this.LLLFZ;
        if (c1642110spl2 != null) {
            C1546200qL4.LIZJ(49, c1642110spl2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1642110spl2.getLayoutParams();
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            marginLayoutParams.height = -2;
            c1642110spl2.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            c1642110spl2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            C1428310nGv.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), c1642110spl2, false);
        }
        AnonymousClass1250.LIZJ(this.LLLFZ);
        List<String> list = C579450Mo3.LIZ;
        if (C579450Mo3.LIZIZ(this.LLLIZZ) && C1627490sSB.LIZIZ() && (viewGroup2 = (ViewGroup) viewGroup3.findViewById(R.id.oh6)) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
            layoutParams.removeRule(21);
            layoutParams.addRule(20);
            layoutParams.addRule(16, R.id.syo);
            C786410Ut5.X5(layoutParams, viewGroup2);
        }
        RemoteImageView remoteImageView = this.LLLJIL;
        if (remoteImageView != null) {
            remoteImageView.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(4.5f)));
        }
        C1447800nmM.LIZIZ(this).LLLIILIL(this, new C1698360uIU(this, 1));
        return viewGroup3;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public C1662330tMN(C1664690tQB<C1662500tMe> c1664690tQB, C1662570tMl c1662570tMl, C385670FAf<Boolean> c385670FAf, C385670FAf<Boolean> c385670FAf2, ShortVideoContext shortVideoContext) {
        super(c1664690tQB, c1662570tMl, c385670FAf, c385670FAf2, shortVideoContext);
        this.LLLIZZ = shortVideoContext;
        this.LLLJ = true;
    }
}
