package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLD extends Message<C1CLD, C1CLF> {
    public static final ProtoAdapter<C1CLD> ADAPTER = new ProtoAdapter<C1CLD>() { // from class: X.1CLE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLD decode(ProtoReader protoReader) {
            C1CLF c1clf = new C1CLF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1clf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1clf.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c1clf.LIZLLL = C1CZR.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1clf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CLD c1cld) {
            C1CLD c1cld2 = c1cld;
            return C1CZR.ADAPTER.encodedSizeWithTag(1, c1cld2.config) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, c1cld2.ratio) + c1cld2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLD redact(C1CLD c1cld) {
            C1CLF c1clfNewBuilder = c1cld.newBuilder();
            c1clfNewBuilder.LIZLLL = C1CZR.ADAPTER.redact(c1clfNewBuilder.LIZLLL);
            c1clfNewBuilder.clearUnknownFields();
            return c1clfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CLD c1cld) {
            C1CLD c1cld2 = c1cld;
            C1CZR.ADAPTER.encodeWithTag(protoWriter, 1, c1cld2.config);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, c1cld2.ratio);
            protoWriter.writeBytes(c1cld2.unknownFields());
        }
    };
    public static final Double DEFAULT_RATIO = Double.valueOf(0.0d);
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMediaParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CZR config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 2)
    public final Double ratio;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.config.hashCode()) * 37) + this.ratio.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CLF newBuilder() {
        C1CLF c1clf = new C1CLF();
        c1clf.LIZLLL = this.config;
        c1clf.LJ = this.ratio;
        c1clf.addUnknownFields(unknownFields());
        return c1clf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", ratio=");
        sb.append(this.ratio);
        sb.replace(0, 2, "FuncParamsXd0e0a8d5400e209c{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CLD)) {
            return false;
        }
        C1CLD c1cld = (C1CLD) obj;
        if (unknownFields().equals(c1cld.unknownFields()) && this.config.equals(c1cld.config) && this.ratio.equals(c1cld.ratio)) {
            return true;
        }
        return false;
    }

    public C1CLD(C1CZR c1czr, Double d) {
        this(c1czr, d, ByteString.EMPTY);
    }

    public C1CLD(C1CZR c1czr, Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        this.config = c1czr;
        this.ratio = d;
    }
}
