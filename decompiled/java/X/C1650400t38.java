package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650400t38 extends AbstractC1664490tPr<C1650350t33, C1650390t37> {
    public FrameLayout LLJJJIL;
    public C2260571Ddv LLJJJJ;
    public int LLJJJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FrameLayout frameLayout = this.LLJJJIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0t34
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1650350t33) obj).LIZ;
            }
        }, new AwS604S0100000_25(this, 174));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0t35
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1650350t33) obj).LIZIZ;
            }
        }, new AwS604S0100000_25(this, 175));
        C2260571Ddv c2260571Ddv = this.LLJJJJ;
        if (c2260571Ddv != null) {
            C0M31.LIZ(c2260571Ddv, new AwS569S0100000_25(this, 315));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.es0, viewGroup, false);
        this.LLJJJIL = (FrameLayout) viewGroup2.findViewById(R.id.xr_);
        this.LLJJJJ = (C2260571Ddv) viewGroup2.findViewById(R.id.xra);
        return viewGroup2;
    }
}
