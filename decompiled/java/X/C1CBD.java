package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBD extends Message<C1CBD, C1CBE> {
    public static final ProtoAdapter<C1CBD> ADAPTER = new ProtoAdapter<C1CBD>() { // from class: X.1CBC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBD decode(ProtoReader protoReader) {
            C1CBE c1cbe = new C1CBE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cbe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cbe.LIZLLL.add(C1CB9.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cbe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CBD c1cbd) {
            C1CBD c1cbd2 = c1cbd;
            return C1CB9.ADAPTER.asRepeated().encodedSizeWithTag(1, c1cbd2.content_position_array) + c1cbd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBD redact(C1CBD c1cbd) {
            C1CBE c1cbeNewBuilder = c1cbd.newBuilder();
            C1516540pZE.LJIIIZ(c1cbeNewBuilder.LIZLLL, C1CB9.ADAPTER);
            c1cbeNewBuilder.clearUnknownFields();
            return c1cbeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CBD c1cbd) {
            C1CBD c1cbd2 = c1cbd;
            C1CB9.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1cbd2.content_position_array);
            protoWriter.writeBytes(c1cbd2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicContentPosition#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C1CB9> content_position_array;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.content_position_array.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CBE newBuilder() {
        C1CBE c1cbe = new C1CBE();
        c1cbe.LIZLLL = C1516540pZE.LIZJ("content_position_array", this.content_position_array);
        c1cbe.addUnknownFields(unknownFields());
        return c1cbe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.content_position_array.isEmpty()) {
            sb.append(", content_position_array=");
            sb.append(this.content_position_array);
        }
        sb.replace(0, 2, "FuncParamsX26eb60ab0c33dca2{");
        sb.append('}');
        return sb.toString();
    }

    public C1CBD(List<C1CB9> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CBD)) {
            return false;
        }
        C1CBD c1cbd = (C1CBD) obj;
        if (unknownFields().equals(c1cbd.unknownFields()) && this.content_position_array.equals(c1cbd.content_position_array)) {
            return true;
        }
        return false;
    }

    public C1CBD(List<C1CB9> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content_position_array = C1516540pZE.LJFF("content_position_array", list);
    }
}
