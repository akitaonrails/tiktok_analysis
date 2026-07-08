package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel;
import java.util.Stack;
import java.util.Vector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zuc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1914200zuc implements Observer, InterfaceC1635506an {
    public final /* synthetic */ UniversalPopupViewModel LL;

    public C1914200zuc(UniversalPopupViewModel universalPopupViewModel) {
        this.LL = universalPopupViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, UniversalPopupViewModel.class, "filterOutViewPriorityPopups", "filterOutViewPriorityPopups(Ljava/util/Stack;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        Vector vector = (Vector) obj;
        UniversalPopupViewModel universalPopupViewModel = this.LL;
        universalPopupViewModel.getClass();
        Stack<UniversalPopup> stack = new Stack<>();
        int size = vector.size();
        for (int i = 0; i < size; i++) {
            UniversalPopup universalPopup = (UniversalPopup) vector.get(i);
            if (i == vector.size() - 1) {
                stack.add(universalPopup);
            } else {
                if (universalPopup != null) {
                    str = universalPopup.style;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, EnumC1914300zum.FULLSCREEN.getValue())) {
                    stack.add(universalPopup);
                }
            }
        }
        universalPopupViewModel.LLILZIL.setValue(stack);
    }
}
