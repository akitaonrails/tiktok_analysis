package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426670nEH extends AbstractC1664490tPr<C1426570nE7, C1426630nED> {
    public C1426740nEO LLJJJIL;
    public AwS566S0100000_22 LLJJJJ;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C0GXI c0gxi;
        super.onActivityCreated(bundle);
        C1426740nEO c1426740nEO = this.LLJJJIL;
        if (c1426740nEO != null && (c0gxi = c1426740nEO.LLILLL) != null) {
            c0gxi.setOnTouchEventDispatch(new AwS601S0100000_22(this, 87));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nEI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1426570nE7) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 67));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nEK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426570nE7) obj).LIZLLL;
            }
        }, new AwS601S0100000_22(this, 76));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nEL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426570nE7) obj).LJ;
            }
        }, new AwS601S0100000_22(this, 86));
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(46));
        C1664590tQ1.LIZLLL(this, null, false, AFwS261S0000000_22.get$arr$(47), 3);
        C1664600tQ2.LIZ(this, null, new AwS601S0100000_22(this, 66));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eo4, viewGroup, false);
        int i = R.id.jpb;
        FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.jpb, viewTd);
        if (frameLayout != null) {
            C0GXI c0gxi = (C0GXI) viewTd;
            i = R.id.vkx;
            FrameLayout frameLayout2 = (FrameLayout) C1616006Uk.LIZ(R.id.vkx, viewTd);
            if (frameLayout2 != null) {
                i = R.id.yjw;
                FrameLayout frameLayout3 = (FrameLayout) C1616006Uk.LIZ(R.id.yjw, viewTd);
                if (frameLayout3 != null) {
                    this.LLJJJIL = new C1426740nEO(c0gxi, frameLayout, c0gxi, frameLayout2, frameLayout3);
                    return c0gxi;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
