package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CM5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CM5 extends Message<C1CM5, C1CM7> {
    public static final ProtoAdapter<C1CM5> ADAPTER = new ProtoAdapter<C1CM5>() { // from class: X.1CM6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CM5 decode(ProtoReader protoReader) {
            C1CM7 c1cm7 = new C1CM7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cm7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cm7.LJ = C1CMV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cm7.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cm7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CM5 c1cm5) {
            C1CM5 c1cm52 = c1cm5;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cm52.state_type) + C1CMV.ADAPTER.encodedSizeWithTag(2, c1cm52.error) + c1cm52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CM5 redact(C1CM5 c1cm5) {
            C1CM7 c1cm7NewBuilder = c1cm5.newBuilder();
            C1CMV c1cmv = c1cm7NewBuilder.LJ;
            if (c1cmv != null) {
                c1cm7NewBuilder.LJ = C1CMV.ADAPTER.redact(c1cmv);
            }
            c1cm7NewBuilder.clearUnknownFields();
            return c1cm7NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CM5 c1cm5) {
            C1CM5 c1cm52 = c1cm5;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cm52.state_type);
            C1CMV.ADAPTER.encodeWithTag(protoWriter, 2, c1cm52.error);
            protoWriter.writeBytes(c1cm52.unknownFields());
        }
    };
    public static final Long DEFAULT_STATE_TYPE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicError#ADAPTER", tag = 2)
    public final C1CMV error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long state_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.state_type.hashCode()) * 37;
        C1CMV c1cmv = this.error;
        int iHashCode2 = iHashCode + (c1cmv != null ? c1cmv.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CM7 newBuilder() {
        C1CM7 c1cm7 = new C1CM7();
        c1cm7.LIZLLL = this.state_type;
        c1cm7.LJ = this.error;
        c1cm7.addUnknownFields(unknownFields());
        return c1cm7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", state_type=");
        sb.append(this.state_type);
        if (this.error != null) {
            sb.append(", error=");
            sb.append(this.error);
        }
        sb.replace(0, 2, "FuncParamsX59d1efa4c292b567{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CM5)) {
            return false;
        }
        C1CM5 c1cm5 = (C1CM5) obj;
        if (unknownFields().equals(c1cm5.unknownFields()) && this.state_type.equals(c1cm5.state_type) && C1516540pZE.LJ(this.error, c1cm5.error)) {
            return true;
        }
        return false;
    }

    public C1CM5(Long l, C1CMV c1cmv) {
        this(l, c1cmv, ByteString.EMPTY);
    }

    public C1CM5(Long l, C1CMV c1cmv, ByteString byteString) {
        super(ADAPTER, byteString);
        this.state_type = l;
        this.error = c1cmv;
    }
}
