package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555380LqK extends AbstractC1664490tPr<C555360LqI, C555340LqG> {
    public C555400LqM LLJJJIL;
    public C1397510mTF LLJJJJ;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C1397510mTF c1397510mTF = this.LLJJJJ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        this.LLJJJJ = null;
        super.onDestroyView();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        TuxIconView tuxIconView;
        super.onActivityCreated(bundle);
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this, new C581250Mqx(this, 0));
        }
        C555400LqM c555400LqM = this.LLJJJIL;
        if (c555400LqM != null && (tuxIconView = c555400LqM.LLILLJJLI) != null) {
            C786410Ut5.I7(new AkS80S0100000_8(this, 2), tuxIconView);
        }
        C555360LqI c555360LqI = LLLLILI().LIZ;
        CharSequence charSequence = c555360LqI.LIZ;
        if (charSequence != null && charSequence.length() != 0) {
            C555400LqM c555400LqM2 = this.LLJJJIL;
            if (c555400LqM2 != null && (tuxTextView3 = c555400LqM2.LLILLL) != null) {
                tuxTextView3.setText(c555360LqI.LIZ);
            }
            C555400LqM c555400LqM3 = this.LLJJJIL;
            if (c555400LqM3 != null && (tuxTextView2 = c555400LqM3.LLILLL) != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
        } else {
            C555400LqM c555400LqM4 = this.LLJJJIL;
            if (c555400LqM4 != null && (tuxTextView = c555400LqM4.LLILLL) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0LqJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C555360LqI) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 45));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.o8, viewGroup, false);
        int i = R.id.bn7;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.bn7, viewTd);
        if (tuxIconView != null) {
            i = R.id.y3j;
            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.y3j, viewTd);
            if (tuxTextView != null) {
                FrameLayout frameLayout = (FrameLayout) viewTd;
                this.LLJJJIL = new C555400LqM(frameLayout, tuxIconView, tuxTextView, frameLayout);
                return frameLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
