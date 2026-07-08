package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0k1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303650k1r extends C09AY implements Function0<String> {
    public C1303650k1r() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        Context contextLJIIJJI;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        C0VSJ c0vsj = new C0VSJ((abstractC1896090zRP == null || (contextLJIIJJI = abstractC1896090zRP.LJIIJJI()) == null) ? null : C786410Ut5.w2(contextLJIIJJI), "feedbanner");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        if (a0.LJJIJIIJIL(c0vsj.getAbsolutePath(), File.separatorChar)) {
            return c0vsj.getAbsolutePath();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsj.getAbsolutePath());
        sbLIZ.append(File.separatorChar);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
