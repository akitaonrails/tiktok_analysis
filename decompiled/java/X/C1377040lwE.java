package X;

import android.content.Context;
import kotlin.jvm.internal.AwS107S0110000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377040lwE {
    public static final C1377040lwE LIZ = new C1377040lwE();

    public static void LIZ(Context context, String str, Integer num, InterfaceC1377050lwF interfaceC1377050lwF, boolean z) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZIZ(str);
        c1397580mTM.LJII = false;
        if (num != null && num.intValue() == 0) {
            C985403tE.LIZ(c1397580mTM, new AwS107S0110000_21(z, interfaceC1377050lwF, 0));
        } else {
            C985403tE.LIZ(c1397580mTM, new AwS600S0100000_21(z, interfaceC1377050lwF, 5));
        }
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        C1391850mK7.LIZIZ(c1397510mTF, "share_download_dynamic_popup");
        c1397510mTF.LIZLLL();
    }
}
