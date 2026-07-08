package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletNewCacheEnabledSetting;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284040jWE {
    public final long LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final EnumC587980N4i LIZLLL;
    public final String LJ;

    public final String LIZ() {
        if (!LiveWalletNewCacheEnabledSetting.INSTANCE.getValue()) {
            return LIZIZ();
        }
        if (this.LIZLLL == null) {
            return LIZIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL.getBizline());
        sbLIZ.append('@');
        String str = this.LJ;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LIZIZ());
        sbLIZ2.append('-');
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final boolean LIZJ() {
        String str = this.LJ;
        if (str != null && a0.LJJIIZI(str, e3.g, false)) {
            return true;
        }
        String str2 = this.LJ;
        return str2 != null && a0.LJJIIZI(str2, "-", false);
    }

    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('@');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('@');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1284040jWE(long j, int i, String str, EnumC587980N4i enumC587980N4i, String str2) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = enumC587980N4i;
        this.LJ = str2;
    }
}
