package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CF1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CF1 extends Message<C1CF1, C1CF3> {
    public static final ProtoAdapter<C1CF1> ADAPTER = new ProtoAdapter<C1CF1>() { // from class: X.1CF2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CF1 decode(ProtoReader protoReader) {
            C1CF3 c1cf3 = new C1CF3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cf3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cf3.LIZLLL.add(C2232021CXo.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cf3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CF1 c1cf1) {
            C1CF1 c1cf12 = c1cf1;
            return C2232021CXo.ADAPTER.asRepeated().encodedSizeWithTag(1, c1cf12.sei_linked_list) + c1cf12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CF1 redact(C1CF1 c1cf1) {
            C1CF3 c1cf3NewBuilder = c1cf1.newBuilder();
            C1516540pZE.LJIIIZ(c1cf3NewBuilder.LIZLLL, C2232021CXo.ADAPTER);
            c1cf3NewBuilder.clearUnknownFields();
            return c1cf3NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CF1 c1cf1) {
            C1CF1 c1cf12 = c1cf1;
            C2232021CXo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1cf12.sei_linked_list);
            protoWriter.writeBytes(c1cf12.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2232021CXo> sei_linked_list;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.sei_linked_list.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CF3 newBuilder() {
        C1CF3 c1cf3 = new C1CF3();
        c1cf3.LIZLLL = C1516540pZE.LIZJ("sei_linked_list", this.sei_linked_list);
        c1cf3.addUnknownFields(unknownFields());
        return c1cf3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.sei_linked_list.isEmpty()) {
            sb.append(", sei_linked_list=");
            sb.append(this.sei_linked_list);
        }
        sb.replace(0, 2, "FuncParamsX97b6a5deeffd69b1{");
        sb.append('}');
        return sb.toString();
    }

    public C1CF1(List<C2232021CXo> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CF1)) {
            return false;
        }
        C1CF1 c1cf1 = (C1CF1) obj;
        if (unknownFields().equals(c1cf1.unknownFields()) && this.sei_linked_list.equals(c1cf1.sei_linked_list)) {
            return true;
        }
        return false;
    }

    public C1CF1(List<C2232021CXo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sei_linked_list = C1516540pZE.LJFF("sei_linked_list", list);
    }
}
