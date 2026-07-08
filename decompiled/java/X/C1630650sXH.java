package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sXH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630650sXH extends Scene {
    public final C19A3 LLJI;
    public LinearLayout LLJIJIL;
    public InterfaceC1625760sPO LLJILJIL;
    public View LLJILJILJ;

    public C1630650sXH(C19A3 c19a3) {
        this.LLJI = c19a3;
    }

    public final void LLLII(Boolean bool, Boolean bool2) {
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool2, bool3) || Intrinsics.LJFF(bool, bool3)) {
            C1630550sX7.LIZ(this.LLJIJIL, this.LLJI.findViewById(R.id.vvc));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.wd, viewGroup, false);
        this.LLJIJIL = (LinearLayout) viewTd.findViewById(R.id.w4p);
        return viewTd;
    }
}
