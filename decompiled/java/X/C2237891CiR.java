package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237891CiR extends Message<C2237891CiR, C2237911CiT> {
    public static final ProtoAdapter<C2237891CiR> ADAPTER = new ProtoAdapter<C2237891CiR>() { // from class: X.1CiS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237891CiR decode(ProtoReader protoReader) {
            C2237911CiT c2237911CiT = new C2237911CiT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2237911CiT.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2237911CiT.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237911CiT.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237891CiR c2237891CiR) {
            C2237891CiR c2237891CiR2 = c2237891CiR;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2237891CiR2.expose_cnt) + c2237891CiR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237891CiR redact(C2237891CiR c2237891CiR) {
            C2237911CiT c2237911CiTNewBuilder = c2237891CiR.newBuilder();
            c2237911CiTNewBuilder.clearUnknownFields();
            return c2237911CiTNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237891CiR c2237891CiR) {
            C2237891CiR c2237891CiR2 = c2237891CiR;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2237891CiR2.expose_cnt);
            protoWriter.writeBytes(c2237891CiR2.unknownFields());
        }
    };
    public static final Long DEFAULT_EXPOSE_CNT = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long expose_cnt;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.expose_cnt;
        int iHashCode2 = iHashCode + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2237911CiT newBuilder() {
        C2237911CiT c2237911CiT = new C2237911CiT();
        c2237911CiT.LIZLLL = this.expose_cnt;
        c2237911CiT.addUnknownFields(unknownFields());
        return c2237911CiT;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.expose_cnt != null) {
            sb.append(", expose_cnt=");
            sb.append(this.expose_cnt);
        }
        sb.replace(0, 2, "BubbleCardExtra{");
        sb.append('}');
        return sb.toString();
    }

    public C2237891CiR(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237891CiR)) {
            return false;
        }
        C2237891CiR c2237891CiR = (C2237891CiR) obj;
        if (unknownFields().equals(c2237891CiR.unknownFields()) && C1516540pZE.LJ(this.expose_cnt, c2237891CiR.expose_cnt)) {
            return true;
        }
        return false;
    }

    public C2237891CiR(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.expose_cnt = l;
    }
}
