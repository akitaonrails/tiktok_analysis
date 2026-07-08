package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CL1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CL1 extends Message<C1CL1, C1CL3> {
    public static final ProtoAdapter<C1CL1> ADAPTER = new ProtoAdapter<C1CL1>() { // from class: X.1CL2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CL1 decode(ProtoReader protoReader) {
            C1CL3 c1cl3 = new C1CL3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cl3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cl3.LIZLLL = C2228751CKz.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cl3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CL1 c1cl1) {
            C1CL1 c1cl12 = c1cl1;
            return C2228751CKz.ADAPTER.encodedSizeWithTag(1, c1cl12.media_info) + c1cl12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CL1 redact(C1CL1 c1cl1) {
            C1CL3 c1cl3NewBuilder = c1cl1.newBuilder();
            c1cl3NewBuilder.LIZLLL = C2228751CKz.ADAPTER.redact(c1cl3NewBuilder.LIZLLL);
            c1cl3NewBuilder.clearUnknownFields();
            return c1cl3NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CL1 c1cl1) {
            C1CL1 c1cl12 = c1cl1;
            C2228751CKz.ADAPTER.encodeWithTag(protoWriter, 1, c1cl12.media_info);
            protoWriter.writeBytes(c1cl12.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAdaptiveRtcMediaInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2228751CKz media_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.media_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CL3 newBuilder() {
        C1CL3 c1cl3 = new C1CL3();
        c1cl3.LIZLLL = this.media_info;
        c1cl3.addUnknownFields(unknownFields());
        return c1cl3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", media_info=");
        sb.append(this.media_info);
        sb.replace(0, 2, "FuncParamsXbe017e85c1464e03{");
        sb.append('}');
        return sb.toString();
    }

    public C1CL1(C2228751CKz c2228751CKz) {
        this(c2228751CKz, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CL1)) {
            return false;
        }
        C1CL1 c1cl1 = (C1CL1) obj;
        if (unknownFields().equals(c1cl1.unknownFields()) && this.media_info.equals(c1cl1.media_info)) {
            return true;
        }
        return false;
    }

    public C1CL1(C2228751CKz c2228751CKz, ByteString byteString) {
        super(ADAPTER, byteString);
        this.media_info = c2228751CKz;
    }
}
