package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIY extends Message<C1CIY, C2227981CIa> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long config;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CIG event_listener;
    public static final ProtoAdapter<C1CIY> ADAPTER = new ProtoAdapter<C1CIY>() { // from class: X.1CIZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIY decode(ProtoReader protoReader) {
            C2227981CIa c2227981CIa = new C2227981CIa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2227981CIa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2227981CIa.LJFF = C1CIG.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2227981CIa.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2227981CIa.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227981CIa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CIY c1ciy) {
            C1CIY c1ciy2 = c1ciy;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1ciy2.config) + protoAdapter.encodedSizeWithTag(2, c1ciy2.channel_id) + C1CIG.ADAPTER.encodedSizeWithTag(3, c1ciy2.event_listener) + c1ciy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIY redact(C1CIY c1ciy) {
            C2227981CIa c2227981CIaNewBuilder = c1ciy.newBuilder();
            c2227981CIaNewBuilder.LJFF = C1CIG.ADAPTER.redact(c2227981CIaNewBuilder.LJFF);
            c2227981CIaNewBuilder.clearUnknownFields();
            return c2227981CIaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CIY c1ciy) {
            C1CIY c1ciy2 = c1ciy;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1ciy2.config);
            protoAdapter.encodeWithTag(protoWriter, 2, c1ciy2.channel_id);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 3, c1ciy2.event_listener);
            protoWriter.writeBytes(c1ciy2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONFIG = 0L;
    public static final Long DEFAULT_CHANNEL_ID = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.config.hashCode()) * 37) + this.channel_id.hashCode()) * 37) + this.event_listener.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227981CIa newBuilder() {
        C2227981CIa c2227981CIa = new C2227981CIa();
        c2227981CIa.LIZLLL = this.config;
        c2227981CIa.LJ = this.channel_id;
        c2227981CIa.LJFF = this.event_listener;
        c2227981CIa.addUnknownFields(unknownFields());
        return c2227981CIa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        sb.append(", event_listener=");
        sb.append(this.event_listener);
        sb.replace(0, 2, "FuncParamsXa3ebfa5335c3cfe3{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CIY)) {
            return false;
        }
        C1CIY c1ciy = (C1CIY) obj;
        if (unknownFields().equals(c1ciy.unknownFields()) && this.config.equals(c1ciy.config) && this.channel_id.equals(c1ciy.channel_id) && this.event_listener.equals(c1ciy.event_listener)) {
            return true;
        }
        return false;
    }

    public C1CIY(Long l, Long l2, C1CIG c1cig) {
        this(l, l2, c1cig, ByteString.EMPTY);
    }

    public C1CIY(Long l, Long l2, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.config = l;
        this.channel_id = l2;
        this.event_listener = c1cig;
    }
}
