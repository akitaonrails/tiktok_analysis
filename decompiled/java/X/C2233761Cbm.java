package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233761Cbm extends Message<C2233761Cbm, C2233781Cbo> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long width;
    public static final ProtoAdapter<C2233761Cbm> ADAPTER = new ProtoAdapter<C2233761Cbm>() { // from class: X.1Cbn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233761Cbm decode(ProtoReader protoReader) {
            C2233781Cbo c2233781Cbo = new C2233781Cbo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233781Cbo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2233781Cbo.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2233781Cbo.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233781Cbo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233761Cbm c2233761Cbm) {
            C2233761Cbm c2233761Cbm2 = c2233761Cbm;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2233761Cbm2.width) + protoAdapter.encodedSizeWithTag(2, c2233761Cbm2.height) + c2233761Cbm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233761Cbm redact(C2233761Cbm c2233761Cbm) {
            C2233781Cbo c2233781CboNewBuilder = c2233761Cbm.newBuilder();
            c2233781CboNewBuilder.clearUnknownFields();
            return c2233781CboNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233761Cbm c2233761Cbm) {
            C2233761Cbm c2233761Cbm2 = c2233761Cbm;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2233761Cbm2.width);
            protoAdapter.encodeWithTag(protoWriter, 2, c2233761Cbm2.height);
            protoWriter.writeBytes(c2233761Cbm2.unknownFields());
        }
    };
    public static final Long DEFAULT_WIDTH = 0L;
    public static final Long DEFAULT_HEIGHT = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.width.hashCode()) * 37) + this.height.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233781Cbo newBuilder() {
        C2233781Cbo c2233781Cbo = new C2233781Cbo();
        c2233781Cbo.LIZLLL = this.width;
        c2233781Cbo.LJ = this.height;
        c2233781Cbo.addUnknownFields(unknownFields());
        return c2233781Cbo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.replace(0, 2, "LinkMicLayoutStreamPlayerResolution{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233761Cbm)) {
            return false;
        }
        C2233761Cbm c2233761Cbm = (C2233761Cbm) obj;
        if (unknownFields().equals(c2233761Cbm.unknownFields()) && this.width.equals(c2233761Cbm.width) && this.height.equals(c2233761Cbm.height)) {
            return true;
        }
        return false;
    }

    public C2233761Cbm(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public C2233761Cbm(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.width = l;
        this.height = l2;
    }
}
