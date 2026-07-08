package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227531CGh extends Message<C2227531CGh, C2227551CGj> {
    public static final ProtoAdapter<C2227531CGh> ADAPTER = new ProtoAdapter<C2227531CGh>() { // from class: X.1CGi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227531CGh decode(ProtoReader protoReader) {
            C2227551CGj c2227551CGj = new C2227551CGj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227551CGj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227551CGj.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227551CGj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227531CGh c2227531CGh) {
            C2227531CGh c2227531CGh2 = c2227531CGh;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2227531CGh2.anchor_id) + c2227531CGh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227531CGh redact(C2227531CGh c2227531CGh) {
            C2227551CGj c2227551CGjNewBuilder = c2227531CGh.newBuilder();
            c2227551CGjNewBuilder.clearUnknownFields();
            return c2227551CGjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227531CGh c2227531CGh) {
            C2227531CGh c2227531CGh2 = c2227531CGh;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2227531CGh2.anchor_id);
            protoWriter.writeBytes(c2227531CGh2.unknownFields());
        }
    };
    public static final Long DEFAULT_ANCHOR_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long anchor_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.anchor_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227551CGj newBuilder() {
        C2227551CGj c2227551CGj = new C2227551CGj();
        c2227551CGj.LIZLLL = this.anchor_id;
        c2227551CGj.addUnknownFields(unknownFields());
        return c2227551CGj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", anchor_id=");
        sb.append(this.anchor_id);
        sb.replace(0, 2, "LinkMicMultiLiveBizLeaveParams{");
        sb.append('}');
        return sb.toString();
    }

    public C2227531CGh(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227531CGh)) {
            return false;
        }
        C2227531CGh c2227531CGh = (C2227531CGh) obj;
        if (unknownFields().equals(c2227531CGh.unknownFields()) && this.anchor_id.equals(c2227531CGh.anchor_id)) {
            return true;
        }
        return false;
    }

    public C2227531CGh(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.anchor_id = l;
    }
}
