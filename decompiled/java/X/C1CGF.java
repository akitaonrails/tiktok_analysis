package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGF extends Message<C1CGF, C1CGG> {
    public static final ProtoAdapter<C1CGF> ADAPTER = new ProtoAdapter<C1CGF>() { // from class: X.1CGE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGF decode(ProtoReader protoReader) {
            C1CGG c1cgg = new C1CGG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cgg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            c1cgg.LIZLLL = EnumC2228611CKl.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cgg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cgg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CGF c1cgf) {
            C1CGF c1cgf2 = c1cgf;
            return EnumC2228611CKl.ADAPTER.encodedSizeWithTag(1, c1cgf2.mode) + c1cgf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGF redact(C1CGF c1cgf) {
            C1CGG c1cggNewBuilder = c1cgf.newBuilder();
            c1cggNewBuilder.clearUnknownFields();
            return c1cggNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CGF c1cgf) {
            C1CGF c1cgf2 = c1cgf;
            EnumC2228611CKl.ADAPTER.encodeWithTag(protoWriter, 1, c1cgf2.mode);
            protoWriter.writeBytes(c1cgf2.unknownFields());
        }
    };
    public static final EnumC2228611CKl DEFAULT_MODE = EnumC2228611CKl.VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_NORMAL;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPlayMode#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2228611CKl mode;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.mode.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CGG newBuilder() {
        C1CGG c1cgg = new C1CGG();
        c1cgg.LIZLLL = this.mode;
        c1cgg.addUnknownFields(unknownFields());
        return c1cgg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", mode=");
        sb.append(this.mode);
        sb.replace(0, 2, "FuncParamsX9f183a02ad65ba93{");
        sb.append('}');
        return sb.toString();
    }

    public C1CGF(EnumC2228611CKl enumC2228611CKl) {
        this(enumC2228611CKl, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CGF)) {
            return false;
        }
        C1CGF c1cgf = (C1CGF) obj;
        if (unknownFields().equals(c1cgf.unknownFields()) && this.mode.equals(c1cgf.mode)) {
            return true;
        }
        return false;
    }

    public C1CGF(EnumC2228611CKl enumC2228611CKl, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mode = enumC2228611CKl;
    }
}
