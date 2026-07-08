package X;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13Vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20021713Vn extends C09AY implements Function0<String> {
    public C20021713Vn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        if (C287580BOy.LIZ()) {
            return C20021913Vp.LIZ.getValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C570490MZb.LIZJ(C20021913Vp.LIZIZ()));
        sbLIZ.append("CreativeTool");
        sbLIZ.append(File.separator);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
