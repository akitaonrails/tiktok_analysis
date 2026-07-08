package X;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0sst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644050sst {
    public int LIZ;
    public boolean LIZIZ;
    public C1623010sKx LIZJ;
    public final String LJFF;
    public final Bundle LIZLLL = new Bundle();
    public Runnable LJ = null;
    public boolean LJI = false;
    public C1441190nbh LJII = null;

    public final String toString() {
        return "StopRecordingCommandEvent{}";
    }

    public C1644050sst(String str) {
        if (TextUtils.isEmpty(str) && C2219091BtD.LIZIZ()) {
            throw new IllegalStateException("stop recording reason shouldn't be empty!!!");
        }
        this.LJFF = str;
    }
}
