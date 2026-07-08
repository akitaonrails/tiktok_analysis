package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.protocol.sharepackage.CommonWebShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;

/* JADX INFO: renamed from: X.0lwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1377240lwY extends AbstractC1377610lx9 {
    public final CommonWebShareModel LIZ;

    @Override // X.AbstractC1377630lxB
    public final String LIZIZ() {
        return "web";
    }

    @Override // X.AbstractC1377630lxB
    public final String LIZJ() {
        return "web";
    }

    @Override // X.AbstractC1377630lxB
    public final String LIZ() {
        String desc = this.LIZ.shareInfo.getDesc();
        return desc == null ? "" : desc;
    }

    @Override // X.AbstractC1377630lxB
    public final Bundle LJFF() {
        return new Bundle();
    }

    @Override // X.AbstractC1377630lxB
    public final String LJI() {
        String title = this.LIZ.shareInfo.getTitle();
        return title == null ? "" : title;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[PHI: r0
      0x002e: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v11 java.lang.String) binds: [B:10:0x002b, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // X.AbstractC1377630lxB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String LJII() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.protocol.sharepackage.CommonWebShareModel r0 = r2.LIZ
            com.ss.android.ugc.aweme.web.share.model.WebShareInfo r0 = r0.shareInfo
            java.lang.Boolean r1 = r0.getDisableAppendParam()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.protocol.sharepackage.CommonWebShareModel r0 = r2.LIZ
            com.ss.android.ugc.aweme.web.share.model.WebShareInfo r0 = r0.shareInfo
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L2e
        L1c:
            return r1
        L1d:
            com.ss.android.ugc.aweme.protocol.sharepackage.CommonWebShareModel r0 = r2.LIZ
            com.ss.android.ugc.aweme.web.share.model.WebShareInfo r0 = r0.shareInfo
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L1c
            java.lang.String r0 = X.C1375500ltk.LJ(r0)
            if (r0 != 0) goto L2e
            return r1
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1377240lwY.LJII():java.lang.String");
    }

    @Override // X.AbstractC1377630lxB
    public final ShareModel LJ() {
        return this.LIZ;
    }

    public C1377240lwY(CommonWebShareModel commonWebShareModel) {
        this.LIZ = commonWebShareModel;
    }
}
