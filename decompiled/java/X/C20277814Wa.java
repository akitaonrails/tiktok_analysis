package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.14Wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C20277814Wa {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(InterfaceC21503819Do interfaceC21503819Do) {
        if (interfaceC21503819Do instanceof Fragment) {
            Fragment fragment = (Fragment) interfaceC21503819Do;
            if (fragment.getActivity() instanceof InterfaceC20277914Wb) {
                ((InterfaceC20277914Wb) fragment.getActivity()).powerHostBackPressed();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC21503819Do interfaceC21503819Do, int i, int i2, Intent intent) {
        if (interfaceC21503819Do instanceof Fragment) {
            Fragment fragment = (Fragment) interfaceC21503819Do;
            if (fragment.getActivity() instanceof InterfaceC20277914Wb) {
                ((InterfaceC20277914Wb) fragment.getActivity()).powerHostActivityResult(i, i2, intent);
            }
        }
    }
}
