package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889240YuY {
    public static final AssemVMLazy<C887820YsG, MessageRequestRootPageVM> LIZ(Fragment fragment) {
        Object obj;
        Context context = fragment.getContext();
        ComponentCallbacks2 componentCallbacks2LJFF = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        }
        if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            obj = C01D1.LIZ;
        } else {
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    obj = C485430J1x.LIZ;
                    break;
                }
            }
            obj = C01D1.LIZ;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestRootPageVM.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 1295);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(355);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            return new AssemVMLazy<>(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 1296), aFwS248S0000000_14, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        }
        if (obj instanceof InterfaceC451590HnJ) {
            return C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) obj, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new AwS558S0100000_14(fragment, 1297), aFwS248S0000000_14, null, null, null);
        }
        if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            return new AssemVMLazy<>(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 1298), aFwS248S0000000_14, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        }
        throw new IllegalArgumentException("Do not support this scope here.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.assem.arch.viewModel.AssemVMLazy LIZIZ(com.bytedance.assem.arch.core.UIAssem r10) {
        /*
            r3 = r10
            androidx.fragment.app.Fragment r2 = X.C724240Sb0.LJI(r3)
            r1 = 0
            if (r2 == 0) goto L1c
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L12
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L12:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L3e
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L4d
        L1c:
            X.01D1 r5 = X.C01D1.LIZ
        L1e:
            java.lang.Class<com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM> r0 = com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM.class
            X.12Dl r1 = X.C13LE.LIZ(r0)
            X.06bB r6 = X.C1637806bA.LIZ
            X.020e r7 = new X.020e
            r0 = 186(0xba, float:2.6E-43)
            r7.<init>(r1, r0)
            r0 = 357(0x165, float:5.0E-43)
            kotlin.jvm.internal.AFwS248S0000000_14 r8 = kotlin.jvm.internal.AFwS248S0000000_14.get$arr$(r0)
            r9 = 0
            kotlin.jvm.functions.Function0 r4 = X.C724750Sbp.LJIIJ(r3, r1)
            r10 = 1
            com.bytedance.assem.arch.viewModel.AssemVMLazy r0 = X.C724750Sbp.LIZ(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L3e:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1c
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L4d
            goto L1c
        L4b:
            if (r2 == 0) goto L1c
        L4d:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L54
            X.0J1x r5 = X.C485430J1x.LIZ
            goto L1e
        L54:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C889240YuY.LIZIZ(com.bytedance.assem.arch.core.UIAssem):com.bytedance.assem.arch.viewModel.AssemVMLazy");
    }
}
