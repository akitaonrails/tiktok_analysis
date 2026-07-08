package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;

/* JADX INFO: renamed from: X.0pXV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515470pXV<T extends Message<T, ?>> implements InterfaceC1501660pBE<TypedInput, T> {
    public final ProtoAdapter<T> LIZ;

    public C1515470pXV(ProtoAdapter<T> protoAdapter) {
        this.LIZ = protoAdapter;
    }

    @Override // X.InterfaceC1501660pBE
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final T LIZ(TypedInput typedInput) throws IOException {
        try {
            T tDecode = this.LIZ.decode(typedInput.in());
            typedInput.in().reset();
            return tDecode;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedInput.in().reset();
            throw th;
        }
    }
}
