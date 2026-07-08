package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226211CBf extends Message<C2226211CBf, C2226231CBh> {
    public static final ProtoAdapter<C2226211CBf> ADAPTER = new ProtoAdapter<C2226211CBf>() { // from class: X.1CBg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226211CBf decode(ProtoReader protoReader) {
            C2226231CBh c2226231CBh = new C2226231CBh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226231CBh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226231CBh.LIZLLL.add(C2226181CBc.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226231CBh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226211CBf c2226211CBf) {
            C2226211CBf c2226211CBf2 = c2226211CBf;
            return C2226181CBc.ADAPTER.asRepeated().encodedSizeWithTag(1, c2226211CBf2.link_mic_position_array) + c2226211CBf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226211CBf redact(C2226211CBf c2226211CBf) {
            C2226231CBh c2226231CBhNewBuilder = c2226211CBf.newBuilder();
            C1516540pZE.LJIIIZ(c2226231CBhNewBuilder.LIZLLL, C2226181CBc.ADAPTER);
            c2226231CBhNewBuilder.clearUnknownFields();
            return c2226231CBhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226211CBf c2226211CBf) {
            C2226211CBf c2226211CBf2 = c2226211CBf;
            C2226181CBc.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2226211CBf2.link_mic_position_array);
            protoWriter.writeBytes(c2226211CBf2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosition#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2226181CBc> link_mic_position_array;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.link_mic_position_array.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226231CBh newBuilder() {
        C2226231CBh c2226231CBh = new C2226231CBh();
        c2226231CBh.LIZLLL = C1516540pZE.LIZJ("link_mic_position_array", this.link_mic_position_array);
        c2226231CBh.addUnknownFields(unknownFields());
        return c2226231CBh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.link_mic_position_array.isEmpty()) {
            sb.append(", link_mic_position_array=");
            sb.append(this.link_mic_position_array);
        }
        sb.replace(0, 2, "FuncParamsX6c5bc078a115a452{");
        sb.append('}');
        return sb.toString();
    }

    public C2226211CBf(List<C2226181CBc> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226211CBf)) {
            return false;
        }
        C2226211CBf c2226211CBf = (C2226211CBf) obj;
        if (unknownFields().equals(c2226211CBf.unknownFields()) && this.link_mic_position_array.equals(c2226211CBf.link_mic_position_array)) {
            return true;
        }
        return false;
    }

    public C2226211CBf(List<C2226181CBc> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_position_array = C1516540pZE.LJFF("link_mic_position_array", list);
    }
}
