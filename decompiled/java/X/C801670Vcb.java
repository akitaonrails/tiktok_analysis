package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C801670Vcb {
    public static C801670Vcb LIZ;

    public C801670Vcb() {
        LIZ = this;
    }

    public static void LIZ(final InterfaceC791530V3f interfaceC791530V3f) {
        if (LIZ != null) {
            Npth.addAttachUserData(new AttachUserData() { // from class: X.0Vca
                @Override // com.bytedance.crash.AttachUserData
                public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                    return interfaceC791530V3f.getData();
                }
            }, CrashType.ALL);
        }
    }
}
