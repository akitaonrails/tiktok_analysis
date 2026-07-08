package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cjj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238691Cjj extends Message<C2238691Cjj, C2238711Cjl> {
    public static final ProtoAdapter<C2238691Cjj> ADAPTER = new ProtoAdapter<C2238691Cjj>() { // from class: X.1Cjk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2238691Cjj decode(ProtoReader protoReader) {
            C2238711Cjl c2238711Cjl = new C2238711Cjl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2238711Cjl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2238711Cjl.LJ.add(C2238721Cjm.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2238711Cjl.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238711Cjl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2238691Cjj c2238691Cjj) {
            C2238691Cjj c2238691Cjj2 = c2238691Cjj;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2238691Cjj2.text) + C2238721Cjm.ADAPTER.asRepeated().encodedSizeWithTag(2, c2238691Cjj2.action_template) + c2238691Cjj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2238691Cjj redact(C2238691Cjj c2238691Cjj) {
            C2238711Cjl c2238711CjlNewBuilder = c2238691Cjj.newBuilder();
            C1516540pZE.LJIIIZ(c2238711CjlNewBuilder.LJ, C2238721Cjm.ADAPTER);
            c2238711CjlNewBuilder.clearUnknownFields();
            return c2238711CjlNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2238691Cjj c2238691Cjj) {
            C2238691Cjj c2238691Cjj2 = c2238691Cjj;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2238691Cjj2.text);
            C2238721Cjm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2238691Cjj2.action_template);
            protoWriter.writeBytes(c2238691Cjj2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetActionTemplate#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2238721Cjm> action_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.action_template.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2238711Cjl newBuilder() {
        C2238711Cjl c2238711Cjl = new C2238711Cjl();
        c2238711Cjl.LIZLLL = this.text;
        c2238711Cjl.LJ = C1516540pZE.LIZJ("action_template", this.action_template);
        c2238711Cjl.addUnknownFields(unknownFields());
        return c2238711Cjl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (!this.action_template.isEmpty()) {
            sb.append(", action_template=");
            sb.append(this.action_template);
        }
        sb.replace(0, 2, "VisualPoetTnS{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2238691Cjj)) {
            return false;
        }
        C2238691Cjj c2238691Cjj = (C2238691Cjj) obj;
        if (unknownFields().equals(c2238691Cjj.unknownFields()) && C1516540pZE.LJ(this.text, c2238691Cjj.text) && this.action_template.equals(c2238691Cjj.action_template)) {
            return true;
        }
        return false;
    }

    public C2238691Cjj(String str, List<C2238721Cjm> list) {
        this(str, list, ByteString.EMPTY);
    }

    public C2238691Cjj(String str, List<C2238721Cjm> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.action_template = C1516540pZE.LJFF("action_template", list);
    }
}
