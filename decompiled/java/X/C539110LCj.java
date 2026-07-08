package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;

/* JADX INFO: renamed from: X.0LCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539110LCj {
    public static /* synthetic */ void LIZIZ(InterfaceC539120LCk interfaceC539120LCk, InnerPushMessage innerPushMessage, int[] iArr, boolean z, int i) {
        boolean z2;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        interfaceC539120LCk.LIZJ(innerPushMessage, iArr, z2, z);
    }
}
