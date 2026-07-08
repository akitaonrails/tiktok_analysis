package X;

import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1622306Wv {
    public final boolean LIZ;
    public final C1622006Ws<Function2<C869590Y9l, SystemContent.Key, Object>> LIZIZ;
    public final C1622006Ws<Function2<C869590Y9l, SystemContent.Key, Boolean>> LIZJ;
    public final Object LIZLLL;

    public C1622306Wv() {
        this(15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1622306Wv)) {
            return false;
        }
        C1622306Wv c1622306Wv = (C1622306Wv) obj;
        return this.LIZ == c1622306Wv.LIZ && Intrinsics.LJFF(this.LIZIZ, c1622306Wv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1622306Wv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1622306Wv.LIZLLL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        C1622006Ws<Function2<C869590Y9l, SystemContent.Key, Object>> c1622006Ws = this.LIZIZ;
        if (c1622006Ws != null) {
            c1622006Ws.getClass();
        }
        int i = iZ2 * 31;
        C1622006Ws<Function2<C869590Y9l, SystemContent.Key, Boolean>> c1622006Ws2 = this.LIZJ;
        if (c1622006Ws2 != null) {
            c1622006Ws2.getClass();
        }
        int i2 = i * 31;
        Object obj = this.LIZLLL;
        return i2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemNoticeCustomUIData(needShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customSpan=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", skipTemplateKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", noticeState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1622306Wv(int i) {
        this((i & 1) != 0, null, null, null);
    }

    public C1622306Wv(boolean z, C1622006Ws<Function2<C869590Y9l, SystemContent.Key, Object>> c1622006Ws, C1622006Ws<Function2<C869590Y9l, SystemContent.Key, Boolean>> c1622006Ws2, Object obj) {
        this.LIZ = z;
        this.LIZIZ = c1622006Ws;
        this.LIZJ = c1622006Ws2;
        this.LIZLLL = obj;
    }
}
