package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKV extends Message<C1CKV, C1CKX> {
    public static final ProtoAdapter<C1CKV> ADAPTER = new ProtoAdapter<C1CKV>() { // from class: X.1CKW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CKV decode(ProtoReader protoReader) {
            C1CKX c1ckx = new C1CKX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1ckx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1ckx.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1ckx.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1ckx.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ckx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CKV c1ckv) {
            C1CKV c1ckv2 = c1ckv;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c1ckv2.uid);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1ckv2.link_mic_id) + protoAdapter.encodedSizeWithTag(3, c1ckv2.leave_reason) + c1ckv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CKV redact(C1CKV c1ckv) {
            C1CKX c1ckxNewBuilder = c1ckv.newBuilder();
            c1ckxNewBuilder.clearUnknownFields();
            return c1ckxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CKV c1ckv) {
            C1CKV c1ckv2 = c1ckv;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1ckv2.uid);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c1ckv2.link_mic_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c1ckv2.leave_reason);
            protoWriter.writeBytes(c1ckv2.unknownFields());
        }
    };
    public static final Long DEFAULT_UID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String leave_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long uid;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.uid.hashCode()) * 37) + this.link_mic_id.hashCode()) * 37) + this.leave_reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CKX newBuilder() {
        C1CKX c1ckx = new C1CKX();
        c1ckx.LIZLLL = this.uid;
        c1ckx.LJ = this.link_mic_id;
        c1ckx.LJFF = this.leave_reason;
        c1ckx.addUnknownFields(unknownFields());
        return c1ckx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", leave_reason=");
        sb.append(this.leave_reason);
        sb.replace(0, 2, "FuncParamsXf1ccf5e4d2c6211f{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CKV)) {
            return false;
        }
        C1CKV c1ckv = (C1CKV) obj;
        if (unknownFields().equals(c1ckv.unknownFields()) && this.uid.equals(c1ckv.uid) && this.link_mic_id.equals(c1ckv.link_mic_id) && this.leave_reason.equals(c1ckv.leave_reason)) {
            return true;
        }
        return false;
    }

    public C1CKV(Long l, String str, String str2) {
        this(l, str, str2, ByteString.EMPTY);
    }

    public C1CKV(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.link_mic_id = str;
        this.leave_reason = str2;
    }
}
