package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: renamed from: X.0hoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218540hoa {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1209250hZb LIZ(Fragment fragment, C19EG c19eg) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC1218550hob interfaceC1218550hob;
        if (fragment != 0) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                while (true) {
                    if (fragment instanceof InterfaceC214902198i) {
                        InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (interfaceC214902198i != null && (!C294780Bgy.LIZ() ? !(!(c19eg instanceof InterfaceC214897198d) || !((InterfaceC214897198d) c19eg).getEnableSAF()) : (c19eg instanceof InterfaceC214897198d))) {
                            if (!(interfaceC214902198i instanceof InterfaceC1218550hob) || (interfaceC1218550hob = (InterfaceC1218550hob) interfaceC214902198i) == null) {
                                return null;
                            }
                            return interfaceC1218550hob.getHelper();
                        }
                    } else {
                        fragment = fragment.getParentFragment();
                        if (fragment == 0) {
                            break;
                        }
                    }
                }
            }
        }
        if (!(c19eg instanceof InterfaceC1218550hob)) {
            return null;
        }
        return ((InterfaceC1218550hob) c19eg).getHelper();
    }
}
