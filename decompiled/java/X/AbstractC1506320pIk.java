package X;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.0pIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1506320pIk implements InterfaceC1516690pZT {
    public static final Charset LIZ = Charset.forName("UTF-8");

    @Override // X.InterfaceC1516690pZT
    public final long LJIIJ() {
        long j = 0;
        int i = 0;
        do {
            j |= (((long) readByte()) & 255) << (i * 8);
            i++;
        } while (i < 8);
        return j;
    }

    @Override // X.InterfaceC1516690pZT
    public final int LJJIFFI() {
        return (readByte() & 255) | ((readByte() & 255) << 8) | ((readByte() & 255) << 16) | ((readByte() & 255) << 24);
    }
}
