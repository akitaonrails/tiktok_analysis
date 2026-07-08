package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* JADX INFO: renamed from: X.0pXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515460pXU<T extends Message<T, ?>> implements InterfaceC1501660pBE<T, TypedOutput> {
    public static final C0X0P LIZIZ = C0X0P.LIZJ("application/x-protobuf");
    public final ProtoAdapter<T> LIZ;

    public C1515460pXU(ProtoAdapter<T> protoAdapter) {
        this.LIZ = protoAdapter;
    }

    @Override // X.InterfaceC1501660pBE
    public final TypedOutput LIZ(Object obj) {
        C1496690p3D c1496690p3D = new C1496690p3D();
        this.LIZ.encode(c1496690p3D, obj);
        return new TypedByteArray(LIZIZ.LIZIZ, c1496690p3D.LJZL(), new String[0]);
    }
}
