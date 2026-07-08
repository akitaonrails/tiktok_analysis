package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CD2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CD2 extends Message<C1CD2, C1CD4> {
    public static final ProtoAdapter<C1CD2> ADAPTER = new ProtoAdapter<C1CD2>() { // from class: X.1CD3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CD2 decode(ProtoReader protoReader) {
            C1CD4 c1cd4 = new C1CD4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cd4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cd4.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c1cd4.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cd4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CD2 c1cd2) {
            C1CD2 c1cd22 = c1cd2;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cd22.info) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, c1cd22.ratio) + c1cd22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CD2 redact(C1CD2 c1cd2) {
            C1CD4 c1cd4NewBuilder = c1cd2.newBuilder();
            c1cd4NewBuilder.clearUnknownFields();
            return c1cd4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CD2 c1cd2) {
            C1CD2 c1cd22 = c1cd2;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cd22.info);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, c1cd22.ratio);
            protoWriter.writeBytes(c1cd22.unknownFields());
        }
    };
    public static final Double DEFAULT_RATIO = Double.valueOf(0.0d);
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 2)
    public final Double ratio;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.info.hashCode()) * 37) + this.ratio.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CD4 newBuilder() {
        C1CD4 c1cd4 = new C1CD4();
        c1cd4.LIZLLL = this.info;
        c1cd4.LJ = this.ratio;
        c1cd4.addUnknownFields(unknownFields());
        return c1cd4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", ratio=");
        sb.append(this.ratio);
        sb.replace(0, 2, "FuncParamsX98382a602170978b{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CD2)) {
            return false;
        }
        C1CD2 c1cd2 = (C1CD2) obj;
        if (unknownFields().equals(c1cd2.unknownFields()) && this.info.equals(c1cd2.info) && this.ratio.equals(c1cd2.ratio)) {
            return true;
        }
        return false;
    }

    public C1CD2(String str, Double d) {
        this(str, d, ByteString.EMPTY);
    }

    public C1CD2(String str, Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        this.info = str;
        this.ratio = d;
    }
}
