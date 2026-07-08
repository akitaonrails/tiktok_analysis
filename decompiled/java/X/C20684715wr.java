package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.outreach.dispersion.data.SyncOutreachModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.SyncOutreachSerializer;

/* JADX INFO: renamed from: X.15wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20684715wr {
    public static final Gson LIZ;

    static {
        e eVar = new e();
        eVar.LIZJ(new SyncOutreachSerializer(), SyncOutreachModel.class);
        LIZ = eVar.LIZ();
    }
}
