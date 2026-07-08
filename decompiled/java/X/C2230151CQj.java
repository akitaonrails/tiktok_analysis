package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230151CQj extends Message<C2230151CQj, C2230171CQl> {
    public static final ProtoAdapter<C2230151CQj> ADAPTER = new ProtoAdapter<C2230151CQj>() { // from class: X.1CQk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230151CQj decode(ProtoReader protoReader) {
            C2230171CQl c2230171CQl = new C2230171CQl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2230171CQl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2230171CQl.LJ.add(C2230191CQn.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2230171CQl.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230171CQl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230151CQj c2230151CQj) {
            C2230151CQj c2230151CQj2 = c2230151CQj;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2230151CQj2.tips) + C2230191CQn.ADAPTER.asRepeated().encodedSizeWithTag(2, c2230151CQj2.template) + c2230151CQj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230151CQj redact(C2230151CQj c2230151CQj) {
            C2230171CQl c2230171CQlNewBuilder = c2230151CQj.newBuilder();
            C1516540pZE.LJIIIZ(c2230171CQlNewBuilder.LJ, C2230191CQn.ADAPTER);
            c2230171CQlNewBuilder.clearUnknownFields();
            return c2230171CQlNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230151CQj c2230151CQj) {
            C2230151CQj c2230151CQj2 = c2230151CQj;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2230151CQj2.tips);
            C2230191CQn.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2230151CQj2.template);
            protoWriter.writeBytes(c2230151CQj2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InlineMessageKey#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2230191CQn> template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String tips;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.tips;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.template.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2230171CQl newBuilder() {
        C2230171CQl c2230171CQl = new C2230171CQl();
        c2230171CQl.LIZLLL = this.tips;
        c2230171CQl.LJ = C1516540pZE.LIZJ("template", this.template);
        c2230171CQl.addUnknownFields(unknownFields());
        return c2230171CQl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        if (!this.template.isEmpty()) {
            sb.append(", template=");
            sb.append(this.template);
        }
        sb.replace(0, 2, "InlineMessageTip{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230151CQj)) {
            return false;
        }
        C2230151CQj c2230151CQj = (C2230151CQj) obj;
        if (unknownFields().equals(c2230151CQj.unknownFields()) && C1516540pZE.LJ(this.tips, c2230151CQj.tips) && this.template.equals(c2230151CQj.template)) {
            return true;
        }
        return false;
    }

    public C2230151CQj(String str, List<C2230191CQn> list) {
        this(str, list, ByteString.EMPTY);
    }

    public C2230151CQj(String str, List<C2230191CQn> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tips = str;
        this.template = C1516540pZE.LJFF("template", list);
    }
}
