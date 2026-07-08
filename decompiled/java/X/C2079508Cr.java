package X;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2079508Cr implements InterfaceC19483011Ki<C0X4A> {
    public static final C2079508Cr LL = new C2079508Cr();

    @Override // X.InterfaceC19483011Ki
    public final boolean test(C0X4A c0x4a) {
        Activity activity = c0x4a.LIZ;
        if (activity != null && Intrinsics.LJFF(activity.getClass().getName(), "com.ss.android.ugc.aweme.main.MainActivity")) {
            return true;
        }
        return false;
    }
}
