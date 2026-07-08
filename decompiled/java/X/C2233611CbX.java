package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233611CbX extends Message<C2233611CbX, C2233631CbZ> {
    public static final ProtoAdapter<C2233611CbX> ADAPTER = new ProtoAdapter<C2233611CbX>() { // from class: X.1CbY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233611CbX decode(ProtoReader protoReader) {
            C2233631CbZ c2233631CbZ = new C2233631CbZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233631CbZ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2233631CbZ.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2233631CbZ.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233631CbZ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233611CbX c2233611CbX) {
            C2233611CbX c2233611CbX2 = c2233611CbX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2233611CbX2.biz_source) + protoAdapter.encodedSizeWithTag(2, c2233611CbX2.biz_source_id) + c2233611CbX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233611CbX redact(C2233611CbX c2233611CbX) {
            C2233631CbZ c2233631CbZNewBuilder = c2233611CbX.newBuilder();
            c2233631CbZNewBuilder.clearUnknownFields();
            return c2233631CbZNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233611CbX c2233611CbX) {
            C2233611CbX c2233611CbX2 = c2233611CbX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2233611CbX2.biz_source);
            protoAdapter.encodeWithTag(protoWriter, 2, c2233611CbX2.biz_source_id);
            protoWriter.writeBytes(c2233611CbX2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String biz_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String biz_source_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.biz_source.hashCode()) * 37) + this.biz_source_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233631CbZ newBuilder() {
        C2233631CbZ c2233631CbZ = new C2233631CbZ();
        c2233631CbZ.LIZLLL = this.biz_source;
        c2233631CbZ.LJ = this.biz_source_id;
        c2233631CbZ.addUnknownFields(unknownFields());
        return c2233631CbZ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", biz_source=");
        sb.append(this.biz_source);
        sb.append(", biz_source_id=");
        sb.append(this.biz_source_id);
        sb.replace(0, 2, "BizPipelineSource{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233611CbX)) {
            return false;
        }
        C2233611CbX c2233611CbX = (C2233611CbX) obj;
        if (unknownFields().equals(c2233611CbX.unknownFields()) && this.biz_source.equals(c2233611CbX.biz_source) && this.biz_source_id.equals(c2233611CbX.biz_source_id)) {
            return true;
        }
        return false;
    }

    public C2233611CbX(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C2233611CbX(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.biz_source = str;
        this.biz_source_id = str2;
    }
}
