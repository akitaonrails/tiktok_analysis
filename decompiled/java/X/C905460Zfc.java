package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905460Zfc extends Message<C905460Zfc, C905600Zfq> {
    public static final ProtoAdapter<C905460Zfc> ADAPTER = new ProtoAdapter<C905460Zfc>() { // from class: X.0Zfb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905460Zfc decode(ProtoReader protoReader) {
            C905600Zfq c905600Zfq = new C905600Zfq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c905600Zfq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c905600Zfq.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c905600Zfq.LIZLLL = C905410ZfX.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c905600Zfq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C905460Zfc c905460Zfc) {
            C905460Zfc c905460Zfc2 = c905460Zfc;
            return C905410ZfX.ADAPTER.encodedSizeWithTag(1, c905460Zfc2.mention_message_params) + ProtoAdapter.STRING.encodedSizeWithTag(2, c905460Zfc2.aggregation_message_type) + c905460Zfc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905460Zfc redact(C905460Zfc c905460Zfc) {
            C905600Zfq c905600ZfqNewBuilder = c905460Zfc.newBuilder();
            C905410ZfX c905410ZfX = c905600ZfqNewBuilder.LIZLLL;
            if (c905410ZfX != null) {
                c905600ZfqNewBuilder.LIZLLL = C905410ZfX.ADAPTER.redact(c905410ZfX);
            }
            c905600ZfqNewBuilder.clearUnknownFields();
            return c905600ZfqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C905460Zfc c905460Zfc) {
            C905460Zfc c905460Zfc2 = c905460Zfc;
            C905410ZfX.ADAPTER.encodeWithTag(protoWriter, 1, c905460Zfc2.mention_message_params);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c905460Zfc2.aggregation_message_type);
            protoWriter.writeBytes(c905460Zfc2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String aggregation_message_type;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.MentionMessageParams#ADAPTER", tag = 1)
    public final C905410ZfX mention_message_params;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C905410ZfX c905410ZfX = this.mention_message_params;
        int iHashCode2 = (iHashCode + (c905410ZfX != null ? c905410ZfX.hashCode() : 0)) * 37;
        String str = this.aggregation_message_type;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C905600Zfq newBuilder() {
        C905600Zfq c905600Zfq = new C905600Zfq();
        c905600Zfq.LIZLLL = this.mention_message_params;
        c905600Zfq.LJ = this.aggregation_message_type;
        c905600Zfq.addUnknownFields(unknownFields());
        return c905600Zfq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mention_message_params != null) {
            sb.append(", mention_message_params=");
            sb.append(this.mention_message_params);
        }
        if (this.aggregation_message_type != null) {
            sb.append(", aggregation_message_type=");
            sb.append(this.aggregation_message_type);
        }
        sb.replace(0, 2, "TrackInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C905460Zfc)) {
            return false;
        }
        C905460Zfc c905460Zfc = (C905460Zfc) obj;
        if (unknownFields().equals(c905460Zfc.unknownFields()) && C1516540pZE.LJ(this.mention_message_params, c905460Zfc.mention_message_params) && C1516540pZE.LJ(this.aggregation_message_type, c905460Zfc.aggregation_message_type)) {
            return true;
        }
        return false;
    }

    public C905460Zfc(C905410ZfX c905410ZfX, String str) {
        this(c905410ZfX, str, ByteString.EMPTY);
    }

    public C905460Zfc(C905410ZfX c905410ZfX, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mention_message_params = c905410ZfX;
        this.aggregation_message_type = str;
    }
}
