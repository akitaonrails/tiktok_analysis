package X;

import com.bytedance.crash.CrashType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802120VdK {
    public final String LIZ;
    public final List<Long> LIZIZ;
    public boolean LIZJ;

    public C802120VdK(String str, long j, CrashType crashType) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZ = str;
        arrayList.add(Long.valueOf(j));
        if (crashType == CrashType.LAUNCH) {
            this.LIZJ = true;
        }
    }
}
