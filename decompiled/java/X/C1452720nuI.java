package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0nuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452720nuI implements Cloneable {
    public final String LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public String LLILZ;

    public static C1452720nuI LJI() {
        return new C1452720nuI(CardStruct.IStatusCode.DEFAULT);
    }

    public static C1452720nuI LJII() {
        return new C1452720nuI("1");
    }

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C1452720nuI clone() {
        try {
            return (C1452720nuI) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VETimeEffectOp{mType='");
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(", mStartTimePoint=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mEndTimePoint=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mIndex=");
        sbLIZ.append(0);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1452720nuI(String str) {
        this.LL = str;
        this.LLILLJJLI = 0L;
        this.LLILLL = 0L;
    }

    public static boolean LIZIZ(C1452720nuI c1452720nuI) {
        if (CardStruct.IStatusCode.DEFAULT.equals(c1452720nuI.LL)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(C1452720nuI c1452720nuI) {
        if (c1452720nuI != null && "2".equals(c1452720nuI.LL)) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(C1452720nuI c1452720nuI) {
        if (c1452720nuI != null && "3".equals(c1452720nuI.LL)) {
            return true;
        }
        return false;
    }

    public static boolean LJ(C1452720nuI c1452720nuI) {
        if (c1452720nuI != null && "1".equals(c1452720nuI.LL)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1452720nuI)) {
            return false;
        }
        C1452720nuI c1452720nuI = (C1452720nuI) obj;
        if (this.LL.equals(c1452720nuI.LL) && this.LLILLJJLI == c1452720nuI.LLILLJJLI && this.LLILLL == c1452720nuI.LLILLL) {
            c1452720nuI.getClass();
            return true;
        }
        return false;
    }

    public C1452720nuI(String str, long j, long j2) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C1452720nuI LJFF(long j, long j2, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 48:
                if (str.equals(CardStruct.IStatusCode.DEFAULT)) {
                    return LJI();
                }
                break;
            case 49:
                if (str.equals("1")) {
                    return LJII();
                }
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                if (str.equals("2")) {
                    return new C1452720nuI("2", j, j2);
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return new C1452720nuI("3", j, j2);
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("op key ");
        sbLIZ.append(str);
        sbLIZ.append(" is not supported, plz check again.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
