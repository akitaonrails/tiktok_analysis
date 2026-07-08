package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227261CFg extends Message<C2227261CFg, C2227281CFi> {
    public static final ProtoAdapter<C2227261CFg> ADAPTER = new ProtoAdapter<C2227261CFg>() { // from class: X.1CFh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227261CFg decode(ProtoReader protoReader) {
            C2227281CFi c2227281CFi = new C2227281CFi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227281CFi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227281CFi.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227281CFi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227261CFg c2227261CFg) {
            C2227261CFg c2227261CFg2 = c2227261CFg;
            return C2232021CXo.ADAPTER.encodedSizeWithTag(1, c2227261CFg2.joiner) + c2227261CFg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227261CFg redact(C2227261CFg c2227261CFg) {
            C2227281CFi c2227281CFiNewBuilder = c2227261CFg.newBuilder();
            c2227281CFiNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2227281CFiNewBuilder.LIZLLL);
            c2227281CFiNewBuilder.clearUnknownFields();
            return c2227281CFiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227261CFg c2227261CFg) {
            C2227261CFg c2227261CFg2 = c2227261CFg;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c2227261CFg2.joiner);
            protoWriter.writeBytes(c2227261CFg2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo joiner;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.joiner.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227281CFi newBuilder() {
        C2227281CFi c2227281CFi = new C2227281CFi();
        c2227281CFi.LIZLLL = this.joiner;
        c2227281CFi.addUnknownFields(unknownFields());
        return c2227281CFi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", joiner=");
        sb.append(this.joiner);
        sb.replace(0, 2, "LinkMicImJoinRoomDirectModel{");
        sb.append('}');
        return sb.toString();
    }

    public C2227261CFg(C2232021CXo c2232021CXo) {
        this(c2232021CXo, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227261CFg)) {
            return false;
        }
        C2227261CFg c2227261CFg = (C2227261CFg) obj;
        if (unknownFields().equals(c2227261CFg.unknownFields()) && this.joiner.equals(c2227261CFg.joiner)) {
            return true;
        }
        return false;
    }

    public C2227261CFg(C2232021CXo c2232021CXo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.joiner = c2232021CXo;
    }
}
