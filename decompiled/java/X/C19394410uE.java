package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10uE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19394410uE implements InterfaceC19394510uF {
    public final Activity LIZ;

    public C19394410uE(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC19394510uF
    public final <T extends View> T LIZ(int i) {
        T t = (T) this.LIZ.findViewById(i);
        if (t != null) {
            return t;
        }
        try {
            String resourceName = this.LIZ.getResources().getResourceName(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" ");
            sbLIZ.append(resourceName);
            sbLIZ.append(" view not found");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" ");
            sbLIZ2.append(i);
            sbLIZ2.append(" view not found");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
