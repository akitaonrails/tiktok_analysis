package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import iyl.i3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0t52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651580t52 implements InterfaceC1651480t4s<i3, InterfaceC1651550t4z> {
    public final Map<InterfaceC1651320t4c<i3>, InterfaceC1651480t4s<i3, InterfaceC1651550t4z>> LIZ = new LinkedHashMap();

    @Override // X.InterfaceC1651480t4s
    public final InterfaceC1651590t53<i3, InterfaceC1651550t4z> LIZ(InterfaceC1651320t4c<? extends i3> interfaceC1651320t4c, LifecycleOwner lifecycleOwner, List<View> list) {
        InterfaceC1651590t53<i3, InterfaceC1651550t4z> interfaceC1651590t53LIZ;
        InterfaceC1651480t4s interfaceC1651480t4s = (InterfaceC1651480t4s) ((LinkedHashMap) this.LIZ).get(interfaceC1651320t4c);
        if (interfaceC1651480t4s == null || (interfaceC1651590t53LIZ = interfaceC1651480t4s.LIZ(interfaceC1651320t4c, lifecycleOwner, list)) == null) {
            return new C1659090tH9(lifecycleOwner, list);
        }
        return interfaceC1651590t53LIZ;
    }
}
