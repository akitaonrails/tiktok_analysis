package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVT extends Message<C1CVT, C1CVV> {
    public static final ProtoAdapter<C1CVT> ADAPTER = new ProtoAdapter<C1CVT>() { // from class: X.1CVU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVT decode(ProtoReader protoReader) {
            C1CVV c1cvv = new C1CVV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cvv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cvv.LJ = C1CW6.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cvv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cvv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CVT c1cvt) {
            C1CVT c1cvt2 = c1cvt;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cvt2.change_state_type) + C1CW6.ADAPTER.encodedSizeWithTag(2, c1cvt2.state_model) + c1cvt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVT redact(C1CVT c1cvt) {
            C1CVV c1cvvNewBuilder = c1cvt.newBuilder();
            c1cvvNewBuilder.LJ = C1CW6.ADAPTER.redact(c1cvvNewBuilder.LJ);
            c1cvvNewBuilder.clearUnknownFields();
            return c1cvvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CVT c1cvt) {
            C1CVT c1cvt2 = c1cvt;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cvt2.change_state_type);
            C1CW6.ADAPTER.encodeWithTag(protoWriter, 2, c1cvt2.state_model);
            protoWriter.writeBytes(c1cvt2.unknownFields());
        }
    };
    public static final Long DEFAULT_CHANGE_STATE_TYPE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long change_state_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicStateModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CW6 state_model;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.change_state_type.hashCode()) * 37) + this.state_model.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CVV newBuilder() {
        C1CVV c1cvv = new C1CVV();
        c1cvv.LIZLLL = this.change_state_type;
        c1cvv.LJ = this.state_model;
        c1cvv.addUnknownFields(unknownFields());
        return c1cvv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", change_state_type=");
        sb.append(this.change_state_type);
        sb.append(", state_model=");
        sb.append(this.state_model);
        sb.replace(0, 2, "FuncParamsXe77fdcef627e162b{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CVT)) {
            return false;
        }
        C1CVT c1cvt = (C1CVT) obj;
        if (unknownFields().equals(c1cvt.unknownFields()) && this.change_state_type.equals(c1cvt.change_state_type) && this.state_model.equals(c1cvt.state_model)) {
            return true;
        }
        return false;
    }

    public C1CVT(Long l, C1CW6 c1cw6) {
        this(l, c1cw6, ByteString.EMPTY);
    }

    public C1CVT(Long l, C1CW6 c1cw6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.change_state_type = l;
        this.state_model = c1cw6;
    }
}
