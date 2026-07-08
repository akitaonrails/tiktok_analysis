package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFU extends Message<C1CFU, C1CFW> {
    public static final ProtoAdapter<C1CFU> ADAPTER = new ProtoAdapter<C1CFU>() { // from class: X.1CFV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFU decode(ProtoReader protoReader) {
            C1CFW c1cfw = new C1CFW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cfw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cfw.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cfw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CFU c1cfu) {
            C1CFU c1cfu2 = c1cfu;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cfu2.group_channel_id) + c1cfu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFU redact(C1CFU c1cfu) {
            C1CFW c1cfwNewBuilder = c1cfu.newBuilder();
            c1cfwNewBuilder.clearUnknownFields();
            return c1cfwNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CFU c1cfu) {
            C1CFU c1cfu2 = c1cfu;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cfu2.group_channel_id);
            protoWriter.writeBytes(c1cfu2.unknownFields());
        }
    };
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long group_channel_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.group_channel_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CFW newBuilder() {
        C1CFW c1cfw = new C1CFW();
        c1cfw.LIZLLL = this.group_channel_id;
        c1cfw.addUnknownFields(unknownFields());
        return c1cfw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.replace(0, 2, "LinkMicImJoinGroupDirectModel{");
        sb.append('}');
        return sb.toString();
    }

    public C1CFU(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CFU)) {
            return false;
        }
        C1CFU c1cfu = (C1CFU) obj;
        if (unknownFields().equals(c1cfu.unknownFields()) && this.group_channel_id.equals(c1cfu.group_channel_id)) {
            return true;
        }
        return false;
    }

    public C1CFU(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_channel_id = l;
    }
}
