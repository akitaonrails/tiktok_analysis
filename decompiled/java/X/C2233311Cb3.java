package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233311Cb3 extends Message<C2233311Cb3, C2233331Cb5> {
    public static final ProtoAdapter<C2233311Cb3> ADAPTER = new ProtoAdapter<C2233311Cb3>() { // from class: X.1Cb4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233311Cb3 decode(ProtoReader protoReader) {
            C2233331Cb5 c2233331Cb5 = new C2233331Cb5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2233331Cb5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2233331Cb5.LIZLLL = C2233101Cai.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233331Cb5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233311Cb3 c2233311Cb3) {
            C2233311Cb3 c2233311Cb32 = c2233311Cb3;
            return C2233101Cai.ADAPTER.encodedSizeWithTag(1, c2233311Cb32.key) + c2233311Cb32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233311Cb3 redact(C2233311Cb3 c2233311Cb3) {
            C2233331Cb5 c2233331Cb5NewBuilder = c2233311Cb3.newBuilder();
            c2233331Cb5NewBuilder.LIZLLL = C2233101Cai.ADAPTER.redact(c2233331Cb5NewBuilder.LIZLLL);
            c2233331Cb5NewBuilder.clearUnknownFields();
            return c2233331Cb5NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233311Cb3 c2233311Cb3) {
            C2233311Cb3 c2233311Cb32 = c2233311Cb3;
            C2233101Cai.ADAPTER.encodeWithTag(protoWriter, 1, c2233311Cb32.key);
            protoWriter.writeBytes(c2233311Cb32.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LiveSetting#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2233101Cai key;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.key.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233331Cb5 newBuilder() {
        C2233331Cb5 c2233331Cb5 = new C2233331Cb5();
        c2233331Cb5.LIZLLL = this.key;
        c2233331Cb5.addUnknownFields(unknownFields());
        return c2233331Cb5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.replace(0, 2, "FuncParamsX72b77223901b2579{");
        sb.append('}');
        return sb.toString();
    }

    public C2233311Cb3(C2233101Cai c2233101Cai) {
        this(c2233101Cai, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233311Cb3)) {
            return false;
        }
        C2233311Cb3 c2233311Cb3 = (C2233311Cb3) obj;
        if (unknownFields().equals(c2233311Cb3.unknownFields()) && this.key.equals(c2233311Cb3.key)) {
            return true;
        }
        return false;
    }

    public C2233311Cb3(C2233101Cai c2233101Cai, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = c2233101Cai;
    }
}
