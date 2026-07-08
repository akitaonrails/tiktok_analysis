package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0laZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363610laZ {
    public static C1363950lb7 LIZ(ViewGroup viewGroup, SharePanelViewModel sharePanelViewModel, boolean z, int i, boolean z2, boolean z3, int i2, boolean z4, int i3, InterfaceC897330ZId interfaceC897330ZId, InterfaceC1362600lYw interfaceC1362600lYw, EnumC1364050lbH enumC1364050lbH, Function1 function1) {
        View viewLIZIZ = C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.cn0, viewGroup, false);
        if (i <= 0) {
            return new C1363950lb7(viewLIZIZ, sharePanelViewModel, z, C1363950lb7.LLLFFI, z2, z3, i2, z4, i3, interfaceC897330ZId, interfaceC1362600lYw, enumC1364050lbH, function1);
        }
        return new C1363950lb7(viewLIZIZ, sharePanelViewModel, z, i, z2, z3, i2, z4, i3, interfaceC897330ZId, interfaceC1362600lYw, enumC1364050lbH, function1);
    }
}
