package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.0ZD7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZD7 {
    public static void LIZ(IMUser iMUser, LifecycleOwner lifecycleOwner, EnumC1910440zoY enumC1910440zoY, String str, boolean z, String str2, int i) {
        boolean z2;
        if ((i & 32) != 0) {
            str2 = "profile";
        }
        if (lifecycleOwner != null) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
            C0ZE7 c0ze7 = new C0ZE7(lifecycleOwner);
            if (!C1572306Dp.LIZ(iMUser.getUid()) && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            c0ze7.LJII = Boolean.valueOf(z2);
            c0ze7.LJFF = str2;
            c0ze7.LIZIZ(enumC1910440zoY);
            c0ze7.LIZLLL = str;
            c0ze7.LIZJ = iMUser.getUid();
            c0ze8LJIIJJI.LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
        }
    }
}
