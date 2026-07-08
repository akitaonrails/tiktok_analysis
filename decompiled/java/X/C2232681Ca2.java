package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ca2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232681Ca2 extends Message<C2232681Ca2, C2232701Ca4> {
    public static final ProtoAdapter<C2232681Ca2> ADAPTER = new ProtoAdapter<C2232681Ca2>() { // from class: X.1Ca3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232681Ca2 decode(ProtoReader protoReader) {
            C2232701Ca4 c2232701Ca4 = new C2232701Ca4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232701Ca4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2232701Ca4.LJ = C2232561CZq.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2232701Ca4.LIZLLL = C2232561CZq.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232701Ca4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232681Ca2 c2232681Ca2) {
            C2232681Ca2 c2232681Ca22 = c2232681Ca2;
            ProtoAdapter<C2232561CZq> protoAdapter = C2232561CZq.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2232681Ca22.player_frame) + protoAdapter.encodedSizeWithTag(2, c2232681Ca22.layout_container_frame) + c2232681Ca22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232681Ca2 redact(C2232681Ca2 c2232681Ca2) {
            C2232701Ca4 c2232701Ca4NewBuilder = c2232681Ca2.newBuilder();
            ProtoAdapter<C2232561CZq> protoAdapter = C2232561CZq.ADAPTER;
            c2232701Ca4NewBuilder.LIZLLL = protoAdapter.redact(c2232701Ca4NewBuilder.LIZLLL);
            c2232701Ca4NewBuilder.LJ = protoAdapter.redact(c2232701Ca4NewBuilder.LJ);
            c2232701Ca4NewBuilder.clearUnknownFields();
            return c2232701Ca4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232681Ca2 c2232681Ca2) {
            C2232681Ca2 c2232681Ca22 = c2232681Ca2;
            ProtoAdapter<C2232561CZq> protoAdapter = C2232561CZq.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232681Ca22.player_frame);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232681Ca22.layout_container_frame);
            protoWriter.writeBytes(c2232681Ca22.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRect#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232561CZq layout_container_frame;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRect#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232561CZq player_frame;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.player_frame.hashCode()) * 37) + this.layout_container_frame.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232701Ca4 newBuilder() {
        C2232701Ca4 c2232701Ca4 = new C2232701Ca4();
        c2232701Ca4.LIZLLL = this.player_frame;
        c2232701Ca4.LJ = this.layout_container_frame;
        c2232701Ca4.addUnknownFields(unknownFields());
        return c2232701Ca4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", player_frame=");
        sb.append(this.player_frame);
        sb.append(", layout_container_frame=");
        sb.append(this.layout_container_frame);
        sb.replace(0, 2, "LinkMicLayoutSimpleSeiResult{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232681Ca2)) {
            return false;
        }
        C2232681Ca2 c2232681Ca2 = (C2232681Ca2) obj;
        if (unknownFields().equals(c2232681Ca2.unknownFields()) && this.player_frame.equals(c2232681Ca2.player_frame) && this.layout_container_frame.equals(c2232681Ca2.layout_container_frame)) {
            return true;
        }
        return false;
    }

    public C2232681Ca2(C2232561CZq c2232561CZq, C2232561CZq c2232561CZq2) {
        this(c2232561CZq, c2232561CZq2, ByteString.EMPTY);
    }

    public C2232681Ca2(C2232561CZq c2232561CZq, C2232561CZq c2232561CZq2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.player_frame = c2232561CZq;
        this.layout_container_frame = c2232561CZq2;
    }
}
