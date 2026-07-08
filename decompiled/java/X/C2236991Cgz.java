package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236991Cgz extends Message<C2236991Cgz, C2237011Ch1> {
    public static final ProtoAdapter<C2236991Cgz> ADAPTER = new ProtoAdapter<C2236991Cgz>() { // from class: X.1Ch0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236991Cgz decode(ProtoReader protoReader) {
            C2237011Ch1 c2237011Ch1 = new C2237011Ch1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2237011Ch1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2237011Ch1.LIZLLL = C2236961Cgw.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237011Ch1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236991Cgz c2236991Cgz) {
            C2236991Cgz c2236991Cgz2 = c2236991Cgz;
            return C2236961Cgw.ADAPTER.encodedSizeWithTag(1, c2236991Cgz2.log_info) + c2236991Cgz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236991Cgz redact(C2236991Cgz c2236991Cgz) {
            C2237011Ch1 c2237011Ch1NewBuilder = c2236991Cgz.newBuilder();
            c2237011Ch1NewBuilder.LIZLLL = C2236961Cgw.ADAPTER.redact(c2237011Ch1NewBuilder.LIZLLL);
            c2237011Ch1NewBuilder.clearUnknownFields();
            return c2237011Ch1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236991Cgz c2236991Cgz) {
            C2236991Cgz c2236991Cgz2 = c2236991Cgz;
            C2236961Cgw.ADAPTER.encodeWithTag(protoWriter, 1, c2236991Cgz2.log_info);
            protoWriter.writeBytes(c2236991Cgz2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLogInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236961Cgw log_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.log_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237011Ch1 newBuilder() {
        C2237011Ch1 c2237011Ch1 = new C2237011Ch1();
        c2237011Ch1.LIZLLL = this.log_info;
        c2237011Ch1.addUnknownFields(unknownFields());
        return c2237011Ch1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", log_info=");
        sb.append(this.log_info);
        sb.replace(0, 2, "FuncParamsX5a391adcae974e1c{");
        sb.append('}');
        return sb.toString();
    }

    public C2236991Cgz(C2236961Cgw c2236961Cgw) {
        this(c2236961Cgw, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236991Cgz)) {
            return false;
        }
        C2236991Cgz c2236991Cgz = (C2236991Cgz) obj;
        if (unknownFields().equals(c2236991Cgz.unknownFields()) && this.log_info.equals(c2236991Cgz.log_info)) {
            return true;
        }
        return false;
    }

    public C2236991Cgz(C2236961Cgw c2236961Cgw, ByteString byteString) {
        super(ADAPTER, byteString);
        this.log_info = c2236961Cgw;
    }
}
