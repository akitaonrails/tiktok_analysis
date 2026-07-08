package X;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571710MbZ extends C09AY implements Function0<String> {
    public C571710MbZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) C20021913Vp.LIZ.getValue());
        sbLIZ.append("cache");
        sbLIZ.append(File.separator);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
