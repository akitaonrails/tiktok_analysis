package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321710CjJ {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Message LIZLLL;
    public final Long LJ;

    public C321710CjJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321710CjJ)) {
            return false;
        }
        C321710CjJ c321710CjJ = (C321710CjJ) obj;
        return Intrinsics.LJFF(this.LIZ, c321710CjJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c321710CjJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c321710CjJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c321710CjJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c321710CjJ.LJ);
    }

    public /* synthetic */ C321710CjJ(int i) {
        this("", "", 0, null, null);
    }

    public C321710CjJ(String str, String str2, Integer num, Message message, Long l) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = message;
        this.LJ = l;
    }
}
