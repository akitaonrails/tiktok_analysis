package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236661CgS extends Message<C2236661CgS, C2236681CgU> {
    public static final ProtoAdapter<C2236661CgS> ADAPTER = new ProtoAdapter<C2236661CgS>() { // from class: X.1CgT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236661CgS decode(ProtoReader protoReader) {
            C2236681CgU c2236681CgU = new C2236681CgU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2236681CgU.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2236681CgU.LJFF = C2236691CgV.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2236681CgU.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2236681CgU.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236681CgU.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236661CgS c2236661CgS) {
            C2236661CgS c2236661CgS2 = c2236661CgS;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2236661CgS2.invoke_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2236661CgS2.is_accept) + C2236691CgV.ADAPTER.encodedSizeWithTag(3, c2236661CgS2.biz_params) + c2236661CgS2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236661CgS redact(C2236661CgS c2236661CgS) {
            C2236681CgU c2236681CgUNewBuilder = c2236661CgS.newBuilder();
            c2236681CgUNewBuilder.LJFF = C2236691CgV.ADAPTER.redact(c2236681CgUNewBuilder.LJFF);
            c2236681CgUNewBuilder.clearUnknownFields();
            return c2236681CgUNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236661CgS c2236661CgS) {
            C2236661CgS c2236661CgS2 = c2236661CgS;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2236661CgS2.invoke_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2236661CgS2.is_accept);
            C2236691CgV.ADAPTER.encodeWithTag(protoWriter, 3, c2236661CgS2.biz_params);
            protoWriter.writeBytes(c2236661CgS2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_ACCEPT = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMultiLiveBizJoinDirectParams#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2236691CgV biz_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean is_accept;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.is_accept.hashCode()) * 37) + this.biz_params.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236681CgU newBuilder() {
        C2236681CgU c2236681CgU = new C2236681CgU();
        c2236681CgU.LIZLLL = this.invoke_id;
        c2236681CgU.LJ = this.is_accept;
        c2236681CgU.LJFF = this.biz_params;
        c2236681CgU.addUnknownFields(unknownFields());
        return c2236681CgU;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", is_accept=");
        sb.append(this.is_accept);
        sb.append(", biz_params=");
        sb.append(this.biz_params);
        sb.replace(0, 2, "LinkMicJoinDirectParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236661CgS)) {
            return false;
        }
        C2236661CgS c2236661CgS = (C2236661CgS) obj;
        if (unknownFields().equals(c2236661CgS.unknownFields()) && this.invoke_id.equals(c2236661CgS.invoke_id) && this.is_accept.equals(c2236661CgS.is_accept) && this.biz_params.equals(c2236661CgS.biz_params)) {
            return true;
        }
        return false;
    }

    public C2236661CgS(String str, Boolean bool, C2236691CgV c2236691CgV) {
        this(str, bool, c2236691CgV, ByteString.EMPTY);
    }

    public C2236661CgS(String str, Boolean bool, C2236691CgV c2236691CgV, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.is_accept = bool;
        this.biz_params = c2236691CgV;
    }
}
