package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1ChZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237351ChZ extends Message<C2237351ChZ, C2237371Chb> {
    public static final ProtoAdapter<C2237351ChZ> ADAPTER = new ProtoAdapter<C2237351ChZ>() { // from class: X.1Cha
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237351ChZ decode(ProtoReader protoReader) {
            C2237371Chb c2237371Chb = new C2237371Chb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2237371Chb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2237371Chb.LIZLLL = C2237381Chc.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237371Chb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237351ChZ c2237351ChZ) {
            C2237351ChZ c2237351ChZ2 = c2237351ChZ;
            return C2237381Chc.ADAPTER.encodedSizeWithTag(1, c2237351ChZ2.layout_extra) + c2237351ChZ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237351ChZ redact(C2237351ChZ c2237351ChZ) {
            C2237371Chb c2237371ChbNewBuilder = c2237351ChZ.newBuilder();
            c2237371ChbNewBuilder.LIZLLL = C2237381Chc.ADAPTER.redact(c2237371ChbNewBuilder.LIZLLL);
            c2237371ChbNewBuilder.clearUnknownFields();
            return c2237371ChbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237351ChZ c2237351ChZ) {
            C2237351ChZ c2237351ChZ2 = c2237351ChZ;
            C2237381Chc.ADAPTER.encodeWithTag(protoWriter, 1, c2237351ChZ2.layout_extra);
            protoWriter.writeBytes(c2237351ChZ2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutCohostLayoutExtra#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2237381Chc layout_extra;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.layout_extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237371Chb newBuilder() {
        C2237371Chb c2237371Chb = new C2237371Chb();
        c2237371Chb.LIZLLL = this.layout_extra;
        c2237371Chb.addUnknownFields(unknownFields());
        return c2237371Chb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_extra=");
        sb.append(this.layout_extra);
        sb.replace(0, 2, "FuncParamsXa7c4c1373c05dbdd{");
        sb.append('}');
        return sb.toString();
    }

    public C2237351ChZ(C2237381Chc c2237381Chc) {
        this(c2237381Chc, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237351ChZ)) {
            return false;
        }
        C2237351ChZ c2237351ChZ = (C2237351ChZ) obj;
        if (unknownFields().equals(c2237351ChZ.unknownFields()) && this.layout_extra.equals(c2237351ChZ.layout_extra)) {
            return true;
        }
        return false;
    }

    public C2237351ChZ(C2237381Chc c2237381Chc, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_extra = c2237381Chc;
    }
}
