package X;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13Vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20022013Vq extends C09AY implements Function0<String> {
    public C20022013Vq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) C20021913Vp.LIZ.getValue());
        sbLIZ.append("creative");
        sbLIZ.append(File.separator);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
