package X;

import android.text.TextUtils;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09Ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2347009Ho implements Function0<File> {
    public final String LL;
    public String LLILLJJLI = "";

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        if (TextUtils.isEmpty(this.LLILLJJLI)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C570490MZb.LIZJ(this.LL));
            sbLIZ.append(C1449640npK.LIZ("_editor_pro.mp4"));
            this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        }
        C0VSJ c0vsj = new C0VSJ(this.LLILLJJLI);
        C570490MZb.LJFF(c0vsj.getParentFile());
        return c0vsj;
    }

    public C2347009Ho(String str) {
        this.LL = str;
    }
}
