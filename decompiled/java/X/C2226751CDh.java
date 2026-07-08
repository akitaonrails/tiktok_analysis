package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226751CDh extends Message<C2226751CDh, C2226771CDj> {
    public static final ProtoAdapter<C2226751CDh> ADAPTER = new ProtoAdapter<C2226751CDh>() { // from class: X.1CDi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226751CDh decode(ProtoReader protoReader) {
            C2226771CDj c2226771CDj = new C2226771CDj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226771CDj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226771CDj.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226771CDj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226751CDh c2226751CDh) {
            C2226751CDh c2226751CDh2 = c2226751CDh;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2226751CDh2.is_mute) + c2226751CDh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226751CDh redact(C2226751CDh c2226751CDh) {
            C2226771CDj c2226771CDjNewBuilder = c2226751CDh.newBuilder();
            c2226771CDjNewBuilder.clearUnknownFields();
            return c2226771CDjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226751CDh c2226751CDh) {
            C2226751CDh c2226751CDh2 = c2226751CDh;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2226751CDh2.is_mute);
            protoWriter.writeBytes(c2226751CDh2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_MUTE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean is_mute;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.is_mute.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226771CDj newBuilder() {
        C2226771CDj c2226771CDj = new C2226771CDj();
        c2226771CDj.LIZLLL = this.is_mute;
        c2226771CDj.addUnknownFields(unknownFields());
        return c2226771CDj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_mute=");
        sb.append(this.is_mute);
        sb.replace(0, 2, "FuncParamsX9621e52640be7ae2{");
        sb.append('}');
        return sb.toString();
    }

    public C2226751CDh(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226751CDh)) {
            return false;
        }
        C2226751CDh c2226751CDh = (C2226751CDh) obj;
        if (unknownFields().equals(c2226751CDh.unknownFields()) && this.is_mute.equals(c2226751CDh.is_mute)) {
            return true;
        }
        return false;
    }

    public C2226751CDh(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_mute = bool;
    }
}
