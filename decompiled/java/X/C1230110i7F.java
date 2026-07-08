package X;

import com.ss.android.ugc.aweme.publicgroup.data.JoinApplyInfo;

/* JADX INFO: renamed from: X.0i7F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230110i7F {
    public final String LIZ;
    public final C900560ZUo LIZIZ;
    public final JoinApplyInfo LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1230110i7F(JoinApplyInfo joinApplyInfo, int i) {
        String str;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(str, null, (i & 8) != 0 ? new JoinApplyInfo("") : joinApplyInfo);
    }

    public C1230110i7F(String str, C900560ZUo c900560ZUo, JoinApplyInfo joinApplyInfo) {
        this.LIZ = str;
        this.LIZIZ = c900560ZUo;
        this.LIZJ = joinApplyInfo;
    }
}
