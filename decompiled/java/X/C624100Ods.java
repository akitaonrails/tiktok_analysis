package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;

/* JADX INFO: renamed from: X.0Ods, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624100Ods {
    public final String LIZ;
    public final String LIZIZ;
    public final WorkBenchNoticeResponse LIZJ;
    public final boolean LIZLLL;

    public /* synthetic */ C624100Ods(String str, String str2) {
        this(str, str2, null, false);
    }

    public C624100Ods(String str, String str2, WorkBenchNoticeResponse workBenchNoticeResponse, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = workBenchNoticeResponse;
        this.LIZLLL = z;
    }

    public static C624100Ods LIZ(C624100Ods c624100Ods, WorkBenchNoticeResponse workBenchNoticeResponse, boolean z, int i) {
        String str;
        String str2 = null;
        if ((i & 1) != 0) {
            str = c624100Ods.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c624100Ods.LIZIZ;
        }
        if ((i & 4) != 0) {
            workBenchNoticeResponse = c624100Ods.LIZJ;
        }
        if ((i & 8) != 0) {
            z = c624100Ods.LIZLLL;
        }
        c624100Ods.getClass();
        return new C624100Ods(str, str2, workBenchNoticeResponse, z);
    }
}
