package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223301C0a extends Message<C2223301C0a, C2223321C0c> {
    public static final ProtoAdapter<C2223301C0a> ADAPTER = new ProtoAdapter<C2223301C0a>() { // from class: X.1C0b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223301C0a decode(ProtoReader protoReader) {
            C2223321C0c c2223321C0c = new C2223321C0c();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2223321C0c.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2223321C0c.LIZLLL.add(C1CDB.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223321C0c.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223301C0a c2223301C0a) {
            C2223301C0a c2223301C0a2 = c2223301C0a;
            return C1CDB.ADAPTER.asRepeated().encodedSizeWithTag(1, c2223301C0a2.extra) + c2223301C0a2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223301C0a redact(C2223301C0a c2223301C0a) {
            C2223321C0c c2223321C0cNewBuilder = c2223301C0a.newBuilder();
            C1516540pZE.LJIIIZ(c2223321C0cNewBuilder.LIZLLL, C1CDB.ADAPTER);
            c2223321C0cNewBuilder.clearUnknownFields();
            return c2223321C0cNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223301C0a c2223301C0a) {
            C2223301C0a c2223301C0a2 = c2223301C0a;
            C1CDB.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2223301C0a2.extra);
            protoWriter.writeBytes(c2223301C0a2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutMultiGuestSpotExtra#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C1CDB> extra;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2223321C0c newBuilder() {
        C2223321C0c c2223321C0c = new C2223321C0c();
        c2223321C0c.LIZLLL = C1516540pZE.LIZJ("extra", this.extra);
        c2223321C0c.addUnknownFields(unknownFields());
        return c2223321C0c;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "FuncParamsX7c07d475a1d74a1e{");
        sb.append('}');
        return sb.toString();
    }

    public C2223301C0a(List<C1CDB> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2223301C0a)) {
            return false;
        }
        C2223301C0a c2223301C0a = (C2223301C0a) obj;
        if (unknownFields().equals(c2223301C0a.unknownFields()) && this.extra.equals(c2223301C0a.extra)) {
            return true;
        }
        return false;
    }

    public C2223301C0a(List<C1CDB> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.extra = C1516540pZE.LJFF("extra", list);
    }
}
