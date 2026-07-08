package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0kPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318110kPB extends IOException {
    public C1318110kPB() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public C1318110kPB(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public C1318110kPB(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
    }
}
