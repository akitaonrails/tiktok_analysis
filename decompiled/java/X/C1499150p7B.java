package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0p7B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499150p7B extends AbstractC1499210p7H implements InterfaceC789910Uyj {
    public boolean LIZIZ;

    @Override // X.AbstractC1499210p7H
    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        C1499130p79<InterfaceC789910Uyj> c1499130p79 = ApplicationStatus.LIZJ;
        if (c1499130p79 != null) {
            if (c1499130p79.LLILZIL) {
                c1499130p79.LLILLJJLI.getClass();
            }
            int iIndexOf = ((ArrayList) c1499130p79.LL).indexOf(this);
            if (iIndexOf != -1) {
                if (c1499130p79.LLILLL == 0) {
                    ListProtector.remove(c1499130p79.LL, iIndexOf);
                } else {
                    c1499130p79.LLILZ = true;
                    ListProtector.set(c1499130p79.LL, iIndexOf, null);
                }
            }
        }
        this.LIZIZ = true;
    }

    @Override // X.AbstractC1499210p7H
    public final void LIZIZ(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.LIZ = networkChangeNotifierAutoDetect;
        ApplicationStatus.LIZIZ(this);
        if (ApplicationStatus.hasVisibleActivities()) {
            LIZJ();
        } else {
            this.LIZ.LJI();
        }
    }
}
