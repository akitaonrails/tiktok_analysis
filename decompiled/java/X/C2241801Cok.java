package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241801Cok extends Message<C2241801Cok, C2241831Con> {
    public static final ProtoAdapter<C2241801Cok> ADAPTER = new ProtoAdapter<C2241801Cok>() { // from class: X.1Col
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241801Cok decode(ProtoReader protoReader) {
            C2241831Con c2241831Con = new C2241831Con();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2241831Con.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2241831Con.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2241831Con.LJ.add(C2241841Coo.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2241831Con.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241831Con.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241801Cok c2241801Cok) {
            C2241801Cok c2241801Cok2 = c2241801Cok;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2241801Cok2.text) + C2241841Coo.ADAPTER.asRepeated().encodedSizeWithTag(2, c2241801Cok2.images) + protoAdapter.encodedSizeWithTag(3, c2241801Cok2.prompt_uri) + c2241801Cok2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241801Cok redact(C2241801Cok c2241801Cok) {
            C2241831Con c2241831ConNewBuilder = c2241801Cok.newBuilder();
            C1516540pZE.LJIIIZ(c2241831ConNewBuilder.LJ, C2241841Coo.ADAPTER);
            c2241831ConNewBuilder.clearUnknownFields();
            return c2241831ConNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241801Cok c2241801Cok) {
            C2241801Cok c2241801Cok2 = c2241801Cok;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241801Cok2.text);
            C2241841Coo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2241801Cok2.images);
            protoAdapter.encodeWithTag(protoWriter, 3, c2241801Cok2.prompt_uri);
            protoWriter.writeBytes(c2241801Cok2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetPictureStruct#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2241841Coo> images;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String prompt_uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.images.hashCode()) * 37;
        String str2 = this.prompt_uri;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2241831Con newBuilder() {
        C2241831Con c2241831Con = new C2241831Con();
        c2241831Con.LIZLLL = this.text;
        c2241831Con.LJ = C1516540pZE.LIZJ("images", this.images);
        c2241831Con.LJFF = this.prompt_uri;
        c2241831Con.addUnknownFields(unknownFields());
        return c2241831Con;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (!this.images.isEmpty()) {
            sb.append(", images=");
            sb.append(this.images);
        }
        if (this.prompt_uri != null) {
            sb.append(", prompt_uri=");
            sb.append(this.prompt_uri);
        }
        sb.replace(0, 2, "VisualPoetUser{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241801Cok)) {
            return false;
        }
        C2241801Cok c2241801Cok = (C2241801Cok) obj;
        if (unknownFields().equals(c2241801Cok.unknownFields()) && C1516540pZE.LJ(this.text, c2241801Cok.text) && this.images.equals(c2241801Cok.images) && C1516540pZE.LJ(this.prompt_uri, c2241801Cok.prompt_uri)) {
            return true;
        }
        return false;
    }

    public C2241801Cok(String str, List<C2241841Coo> list, String str2) {
        this(str, list, str2, ByteString.EMPTY);
    }

    public C2241801Cok(String str, List<C2241841Coo> list, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.images = C1516540pZE.LJFF("images", list);
        this.prompt_uri = str2;
    }
}
