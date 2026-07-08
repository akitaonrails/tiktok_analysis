package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233971Cc7 extends Message<C2233971Cc7, C2233991Cc9> {
    public static final ProtoAdapter<C2233971Cc7> ADAPTER = new ProtoAdapter<C2233971Cc7>() { // from class: X.1Cc8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233971Cc7 decode(ProtoReader protoReader) {
            C2233991Cc9 c2233991Cc9 = new C2233991Cc9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233991Cc9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2233991Cc9.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2233991Cc9.LIZLLL = C2233671Cbd.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233991Cc9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233971Cc7 c2233971Cc7) {
            C2233971Cc7 c2233971Cc72 = c2233971Cc7;
            return C2233671Cbd.ADAPTER.encodedSizeWithTag(1, c2233971Cc72.sei_layout_model) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2233971Cc72.time_stamp) + c2233971Cc72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233971Cc7 redact(C2233971Cc7 c2233971Cc7) {
            C2233991Cc9 c2233991Cc9NewBuilder = c2233971Cc7.newBuilder();
            c2233991Cc9NewBuilder.LIZLLL = C2233671Cbd.ADAPTER.redact(c2233991Cc9NewBuilder.LIZLLL);
            c2233991Cc9NewBuilder.clearUnknownFields();
            return c2233991Cc9NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233971Cc7 c2233971Cc7) {
            C2233971Cc7 c2233971Cc72 = c2233971Cc7;
            C2233671Cbd.ADAPTER.encodeWithTag(protoWriter, 1, c2233971Cc72.sei_layout_model);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2233971Cc72.time_stamp);
            protoWriter.writeBytes(c2233971Cc72.unknownFields());
        }
    };
    public static final Long DEFAULT_TIME_STAMP = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutSeiLayoutModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2233671Cbd sei_layout_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long time_stamp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.sei_layout_model.hashCode()) * 37) + this.time_stamp.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233991Cc9 newBuilder() {
        C2233991Cc9 c2233991Cc9 = new C2233991Cc9();
        c2233991Cc9.LIZLLL = this.sei_layout_model;
        c2233991Cc9.LJ = this.time_stamp;
        c2233991Cc9.addUnknownFields(unknownFields());
        return c2233991Cc9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", sei_layout_model=");
        sb.append(this.sei_layout_model);
        sb.append(", time_stamp=");
        sb.append(this.time_stamp);
        sb.replace(0, 2, "FuncParamsXabbdb9b46b6e927d{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233971Cc7)) {
            return false;
        }
        C2233971Cc7 c2233971Cc7 = (C2233971Cc7) obj;
        if (unknownFields().equals(c2233971Cc7.unknownFields()) && this.sei_layout_model.equals(c2233971Cc7.sei_layout_model) && this.time_stamp.equals(c2233971Cc7.time_stamp)) {
            return true;
        }
        return false;
    }

    public C2233971Cc7(C2233671Cbd c2233671Cbd, Long l) {
        this(c2233671Cbd, l, ByteString.EMPTY);
    }

    public C2233971Cc7(C2233671Cbd c2233671Cbd, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sei_layout_model = c2233671Cbd;
        this.time_stamp = l;
    }
}
