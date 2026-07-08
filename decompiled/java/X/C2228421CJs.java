package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228421CJs extends Message<C2228421CJs, C2228441CJu> {
    public static final ProtoAdapter<C2228421CJs> ADAPTER = new ProtoAdapter<C2228421CJs>() { // from class: X.1CJt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228421CJs decode(ProtoReader protoReader) {
            C2228441CJu c2228441CJu = new C2228441CJu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228441CJu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2228441CJu.LJ = C2232561CZq.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2228441CJu.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228441CJu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228421CJs c2228421CJs) {
            C2228421CJs c2228421CJs2 = c2228421CJs;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2228421CJs2.id) + C2232561CZq.ADAPTER.encodedSizeWithTag(2, c2228421CJs2.frame) + c2228421CJs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228421CJs redact(C2228421CJs c2228421CJs) {
            C2228441CJu c2228441CJuNewBuilder = c2228421CJs.newBuilder();
            c2228441CJuNewBuilder.LJ = C2232561CZq.ADAPTER.redact(c2228441CJuNewBuilder.LJ);
            c2228441CJuNewBuilder.clearUnknownFields();
            return c2228441CJuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228421CJs c2228421CJs) {
            C2228421CJs c2228421CJs2 = c2228421CJs;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2228421CJs2.id);
            C2232561CZq.ADAPTER.encodeWithTag(protoWriter, 2, c2228421CJs2.frame);
            protoWriter.writeBytes(c2228421CJs2.unknownFields());
        }
    };
    public static final Long DEFAULT_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRect#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232561CZq frame;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.frame.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228441CJu newBuilder() {
        C2228441CJu c2228441CJu = new C2228441CJu();
        c2228441CJu.LIZLLL = this.id;
        c2228441CJu.LJ = this.frame;
        c2228441CJu.addUnknownFields(unknownFields());
        return c2228441CJu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", frame=");
        sb.append(this.frame);
        sb.replace(0, 2, "LinkMicLayoutViewInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228421CJs)) {
            return false;
        }
        C2228421CJs c2228421CJs = (C2228421CJs) obj;
        if (unknownFields().equals(c2228421CJs.unknownFields()) && this.id.equals(c2228421CJs.id) && this.frame.equals(c2228421CJs.frame)) {
            return true;
        }
        return false;
    }

    public C2228421CJs(Long l, C2232561CZq c2232561CZq) {
        this(l, c2232561CZq, ByteString.EMPTY);
    }

    public C2228421CJs(Long l, C2232561CZq c2232561CZq, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.frame = c2232561CZq;
    }
}
