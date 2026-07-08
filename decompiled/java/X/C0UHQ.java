package X;

import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS138S0201000_12;

/* JADX INFO: renamed from: X.0UHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UHQ {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ = R.layout.ddh;
    public final Function0<Fragment> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestEffectPageData(pageType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tabResId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fragmentFactory=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0UHQ(int i, String str, AwS138S0201000_12 awS138S0201000_12) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZLLL = awS138S0201000_12;
    }
}
