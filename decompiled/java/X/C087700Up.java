package X;

import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C087700Up extends AbstractC1136060ffY {
    public final long LL;
    public final String LLILLJJLI;
    public final int LLILLL = R.drawable.eyb;
    public final String LLILZ;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C087700Up)) {
            return false;
        }
        C087700Up c087700Up = (C087700Up) obj;
        return this.LL == c087700Up.LL && Intrinsics.LJFF(this.LLILLJJLI, c087700Up.LLILLJJLI) && this.LLILLL == c087700Up.LLILLL && Intrinsics.LJFF(this.LLILZ, c087700Up.LLILZ);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalActionMessage(roomId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", resIcon=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", actionString=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C087700Up(String str, long j, String str2) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILZ = str2;
        this.type = C001A.LOCAL_ACTION_MESSAGE;
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        this.baseMessage = commonMessageData;
    }
}
