package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528870pt7 extends Message<C1528870pt7, C1528890pt9> {
    public static final ProtoAdapter<C1528870pt7> ADAPTER = new ProtoAdapter<C1528870pt7>() { // from class: X.0pt8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1528870pt7 decode(ProtoReader protoReader) {
            C1528890pt9 c1528890pt9 = new C1528890pt9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1528890pt9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1528890pt9.LIZLLL.add(C2233281Cb0.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1528890pt9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1528870pt7 c1528870pt7) {
            C1528870pt7 c1528870pt72 = c1528870pt7;
            return C2233281Cb0.ADAPTER.asRepeated().encodedSizeWithTag(1, c1528870pt72.infos) + c1528870pt72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1528870pt7 redact(C1528870pt7 c1528870pt7) {
            C1528890pt9 c1528890pt9NewBuilder = c1528870pt7.newBuilder();
            C1516540pZE.LJIIIZ(c1528890pt9NewBuilder.LIZLLL, C2233281Cb0.ADAPTER);
            c1528890pt9NewBuilder.clearUnknownFields();
            return c1528890pt9NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1528870pt7 c1528870pt7) {
            C1528870pt7 c1528870pt72 = c1528870pt7;
            C2233281Cb0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1528870pt72.infos);
            protoWriter.writeBytes(c1528870pt72.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicInteractForwardStreamStateInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2233281Cb0> infos;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.infos.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1528890pt9 newBuilder() {
        C1528890pt9 c1528890pt9 = new C1528890pt9();
        c1528890pt9.LIZLLL = C1516540pZE.LIZJ("infos", this.infos);
        c1528890pt9.addUnknownFields(unknownFields());
        return c1528890pt9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.infos.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        sb.replace(0, 2, "FuncParamsX335fbbab26201cd3{");
        sb.append('}');
        return sb.toString();
    }

    public C1528870pt7(List<C2233281Cb0> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1528870pt7)) {
            return false;
        }
        C1528870pt7 c1528870pt7 = (C1528870pt7) obj;
        if (unknownFields().equals(c1528870pt7.unknownFields()) && this.infos.equals(c1528870pt7.infos)) {
            return true;
        }
        return false;
    }

    public C1528870pt7(List<C2233281Cb0> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.infos = C1516540pZE.LJFF("infos", list);
    }
}
