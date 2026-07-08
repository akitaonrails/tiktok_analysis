package X;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2108908Nz extends C09AY implements Function0<File> {
    public C2108908Nz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        File filesDir = C1BWL.LIZ().getFilesDir();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("splitcompat/");
        C2108708Nx c2108708Nx = C2108708Nx.LIZ;
        sbLIZ.append((String) C2108708Nx.LIZJ.getValue());
        sbLIZ.append("/native-libraries/");
        return new C0VSJ(filesDir, C2188811AlT.LIZIZ(sbLIZ));
    }
}
