package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227181CEy extends Message<C2227181CEy, C1CF0> {
    public static final ProtoAdapter<C2227181CEy> ADAPTER = new ProtoAdapter<C2227181CEy>() { // from class: X.1CEz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227181CEy decode(ProtoReader protoReader) {
            C1CF0 c1cf0 = new C1CF0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cf0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cf0.LIZLLL.add(C2232021CXo.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cf0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227181CEy c2227181CEy) {
            C2227181CEy c2227181CEy2 = c2227181CEy;
            return C2232021CXo.ADAPTER.asRepeated().encodedSizeWithTag(1, c2227181CEy2.linked_list) + c2227181CEy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227181CEy redact(C2227181CEy c2227181CEy) {
            C1CF0 c1cf0NewBuilder = c2227181CEy.newBuilder();
            C1516540pZE.LJIIIZ(c1cf0NewBuilder.LIZLLL, C2232021CXo.ADAPTER);
            c1cf0NewBuilder.clearUnknownFields();
            return c1cf0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227181CEy c2227181CEy) {
            C2227181CEy c2227181CEy2 = c2227181CEy;
            C2232021CXo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2227181CEy2.linked_list);
            protoWriter.writeBytes(c2227181CEy2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2232021CXo> linked_list;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.linked_list.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CF0 newBuilder() {
        C1CF0 c1cf0 = new C1CF0();
        c1cf0.LIZLLL = C1516540pZE.LIZJ("linked_list", this.linked_list);
        c1cf0.addUnknownFields(unknownFields());
        return c1cf0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.linked_list.isEmpty()) {
            sb.append(", linked_list=");
            sb.append(this.linked_list);
        }
        sb.replace(0, 2, "FuncParamsX5d972f46d5a12cd0{");
        sb.append('}');
        return sb.toString();
    }

    public C2227181CEy(List<C2232021CXo> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227181CEy)) {
            return false;
        }
        C2227181CEy c2227181CEy = (C2227181CEy) obj;
        if (unknownFields().equals(c2227181CEy.unknownFields()) && this.linked_list.equals(c2227181CEy.linked_list)) {
            return true;
        }
        return false;
    }

    public C2227181CEy(List<C2232021CXo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.linked_list = C1516540pZE.LJFF("linked_list", list);
    }
}
