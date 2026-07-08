package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMV extends Message<C1CMV, C1CMX> {
    public static final ProtoAdapter<C1CMV> ADAPTER = new ProtoAdapter<C1CMV>() { // from class: X.1CMW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMV decode(ProtoReader protoReader) {
            C1CMX c1cmx = new C1CMX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c1cmx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1cmx.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1cmx.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cmx.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cmx.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cmx.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cmx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CMV c1cmv) {
            C1CMV c1cmv2 = c1cmv;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c1cmv2.err_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cmv2.err_msg) + protoAdapter.encodedSizeWithTag(3, c1cmv2.prompts) + protoAdapter.encodedSizeWithTag(4, c1cmv2.alert) + protoAdapter.encodedSizeWithTag(5, c1cmv2.extra) + c1cmv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMV redact(C1CMV c1cmv) {
            C1CMX c1cmxNewBuilder = c1cmv.newBuilder();
            c1cmxNewBuilder.clearUnknownFields();
            return c1cmxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CMV c1cmv) {
            C1CMV c1cmv2 = c1cmv;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cmv2.err_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c1cmv2.err_msg);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cmv2.prompts);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cmv2.alert);
            protoAdapter.encodeWithTag(protoWriter, 5, c1cmv2.extra);
            protoWriter.writeBytes(c1cmv2.unknownFields());
        }
    };
    public static final Long DEFAULT_ERR_CODE = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String alert;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long err_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String err_msg;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public final String extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String prompts;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.err_code.hashCode()) * 37) + this.err_msg.hashCode()) * 37) + this.prompts.hashCode()) * 37) + this.alert.hashCode()) * 37) + this.extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CMX newBuilder() {
        C1CMX c1cmx = new C1CMX();
        c1cmx.LIZLLL = this.err_code;
        c1cmx.LJ = this.err_msg;
        c1cmx.LJFF = this.prompts;
        c1cmx.LJI = this.alert;
        c1cmx.LJII = this.extra;
        c1cmx.addUnknownFields(unknownFields());
        return c1cmx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", err_code=");
        sb.append(this.err_code);
        sb.append(", err_msg=");
        sb.append(this.err_msg);
        sb.append(", prompts=");
        sb.append(this.prompts);
        sb.append(", alert=");
        sb.append(this.alert);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.replace(0, 2, "LinkMicError{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CMV)) {
            return false;
        }
        C1CMV c1cmv = (C1CMV) obj;
        if (unknownFields().equals(c1cmv.unknownFields()) && this.err_code.equals(c1cmv.err_code) && this.err_msg.equals(c1cmv.err_msg) && this.prompts.equals(c1cmv.prompts) && this.alert.equals(c1cmv.alert) && this.extra.equals(c1cmv.extra)) {
            return true;
        }
        return false;
    }

    public C1CMV(Long l, String str, String str2, String str3, String str4) {
        this(l, str, str2, str3, str4, ByteString.EMPTY);
    }

    public C1CMV(Long l, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.err_code = l;
        this.err_msg = str;
        this.prompts = str2;
        this.alert = str3;
        this.extra = str4;
    }
}
