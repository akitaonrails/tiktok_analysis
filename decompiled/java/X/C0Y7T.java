package X;

import com.bytedance.im.core.proto.MessageBody;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y7T, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y7T {
    public final C0Y73 LIZ;
    public final C869590Y9l LIZIZ;
    public final boolean LIZJ;
    public final C0Y72 LIZLLL;
    public final boolean LJ;
    public final C0Y7K LJFF;
    public final MessageBody LJI;

    public final boolean LIZ() {
        C869590Y9l c869590Y9l;
        return (Intrinsics.LJFF(this.LIZ, C0Y76.LL) || !this.LIZJ || (c869590Y9l = this.LIZIZ) == null || c869590Y9l.invalid()) ? false : true;
    }

    public C0Y7T(C0Y73 c0y73, C869590Y9l c869590Y9l, boolean z, C0Y72 c0y72, boolean z2, C0Y7K c0y7k, MessageBody messageBody, int i) {
        z2 = (i & 16) != 0 ? false : z2;
        c0y7k = (i & 32) != 0 ? null : c0y7k;
        messageBody = (i & 64) != 0 ? null : messageBody;
        this.LIZ = c0y73;
        this.LIZIZ = c869590Y9l;
        this.LIZJ = z;
        this.LIZLLL = c0y72;
        this.LJ = z2;
        this.LJFF = c0y7k;
        this.LJI = messageBody;
    }
}
