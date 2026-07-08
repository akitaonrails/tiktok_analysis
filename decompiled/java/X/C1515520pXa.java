package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* JADX INFO: renamed from: X.0pXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515520pXa<T extends Message<T, ?>> implements InterfaceC1501660pBE<byte[], T> {
    public final ProtoAdapter<T> LIZ;

    public C1515520pXa(ProtoAdapter<T> protoAdapter) {
        this.LIZ = protoAdapter;
    }

    @Override // X.InterfaceC1501660pBE
    public final Object LIZ(byte[] bArr) {
        try {
            return this.LIZ.decode(bArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
