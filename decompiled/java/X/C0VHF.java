package X;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: renamed from: X.0VHF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VHF {
    public final ComponentName LIZ;

    static {
        C0VI8.LIZIZ("SystemJobInfoConverter");
    }

    public C0VHF(Context context) {
        this.LIZ = new ComponentName(C786410Ut5.N3(context), (Class<?>) SystemJobService.class);
    }
}
