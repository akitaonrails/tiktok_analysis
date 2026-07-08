package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.06r6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1736606r6 {
    public final int LIZ;
    public final WeakReference<Context> LIZIZ;
    public final String LIZJ;
    public final Long LIZLLL;
    public final C869590Y9l LJ;
    public final Object LJFF;
    public final AbstractC1708306mX LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FakeMsgContext(protocolType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msgUuid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", senderUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", targetMessage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1736606r6(int i, WeakReference weakReference, String str, Long l, C869590Y9l c869590Y9l, Object obj, C1708206mW c1708206mW) {
        this.LIZ = i;
        this.LIZIZ = weakReference;
        this.LIZJ = str;
        this.LIZLLL = l;
        this.LJ = c869590Y9l;
        this.LJFF = obj;
        this.LJI = c1708206mW;
    }
}
