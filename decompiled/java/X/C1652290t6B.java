package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.social.creation.record.viewmodel.RecordViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import lth.o;

/* JADX INFO: renamed from: X.0t6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652290t6B extends C19A3 {
    public final C1647120sxq LLJILLL;
    public final C385670FAf<Boolean> LLJJ;
    public final C385670FAf<Boolean> LLJJI;
    public RecordViewModel LLJJIII;
    public CreativeLoadingDialog LLJJIJIIJIL;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1101));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1096));

    public final InterfaceC1655310tB3 LLLLIIIILLL() {
        C1DRG c1drgLJFF = C1664600tQ2.LJ(this).LJFF();
        if (c1drgLJFF != null) {
            return (InterfaceC1655310tB3) c1drgLJFF.LJII(InterfaceC1655310tB3.class, null);
        }
        return null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        o.LJI.Ok();
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        C201955140j.LIZ("VideoRecordContainerScene onStart()");
    }

    public static int LLLLIILL(ViewGroup viewGroup) {
        int iGenerateViewId = View.generateViewId();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(iGenerateViewId);
        viewGroup.addView(frameLayout);
        return iGenerateViewId;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1664590tQ1.LIZ(this, "SocialVideoRecordContainerScene", true, AFwS266S0000000_25.get$arr$(559));
        C1664600tQ2.LIZ(this, "SocialVideoRecordContainerScene", new AwS604S0100000_25(this, 896));
        ViewGroup viewGroup = (ViewGroup) this.mView.findViewById(R.id.iuy);
        ViewTreeLifecycleOwner.set(viewGroup, this);
        viewGroup.setTag(R.id.view_tree_saved_state_registry_owner, this);
        ViewTreeViewModelStoreOwner.set(viewGroup, this);
        ComposeView composeView = new ComposeView(requireActivity(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        composeView.setBackgroundColor(0);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(2025493926, new AwS639S0100000_25(this, 149), true));
        viewGroup.addView(composeView);
        InterfaceC1655310tB3 interfaceC1655310tB3LLLLIIIILLL = LLLLIIIILLL();
        if (interfaceC1655310tB3LLLLIIIILLL != null) {
            interfaceC1655310tB3LLLLIIIILLL.onCreated();
        }
    }

    public C1652290t6B(C1647120sxq c1647120sxq, h0 h0Var, h0 h0Var2) {
        this.LLJILLL = c1647120sxq;
        this.LLJJ = h0Var;
        this.LLJJI = h0Var2;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.f9x, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
