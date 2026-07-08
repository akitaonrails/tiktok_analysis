package X;

import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMRecordPageEnum;

/* JADX INFO: renamed from: X.0niH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445270niH {
    public final IMRecordPageEnum LIZ;
    public final IMRecordPageEnum LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1445270niH)) {
            return false;
        }
        C1445270niH c1445270niH = (C1445270niH) obj;
        return this.LIZ == c1445270niH.LIZ && this.LIZIZ == c1445270niH.LIZIZ;
    }

    public C1445270niH(IMRecordPageEnum iMRecordPageEnum, IMRecordPageEnum iMRecordPageEnum2) {
        this.LIZ = iMRecordPageEnum;
        this.LIZIZ = iMRecordPageEnum2;
    }
}
