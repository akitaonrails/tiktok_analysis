package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19566011go implements ViewModelProvider.Factory {
    public final C19566111gp<?>[] LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls) {
        return C19566311gr.LIZIZ(this, cls);
    }

    public C19566011go(C19566111gp<?>... c19566111gpArr) {
        this.LIZ = c19566111gpArr;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <VM extends ViewModel> VM create(Class<VM> cls, AbstractC903280Zc6 abstractC903280Zc6) {
        VM vm;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(cls);
        C19566111gp<?>[] c19566111gpArr = this.LIZ;
        C19566111gp[] c19566111gpArr2 = (C19566111gp[]) Arrays.copyOf(c19566111gpArr, c19566111gpArr.length);
        int length = c19566111gpArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C19566111gp c19566111gp = c19566111gpArr2[i];
            if (Intrinsics.LJFF(c19566111gp.LIZ, c19719912DlLIZ)) {
                Function1<AbstractC903280Zc6, T> function1 = c19566111gp.LIZIZ;
                if (function1 != 0 && (vm = (VM) function1.invoke(abstractC903280Zc6)) != null) {
                    return vm;
                }
            } else {
                i++;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No initializer set for given class ");
        sbLIZ.append(c19719912DlLIZ.LIZLLL());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
