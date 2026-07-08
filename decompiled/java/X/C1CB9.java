package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CB9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CB9 extends Message<C1CB9, C1CBB> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String content_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicContentType#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C1CXP content_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long position;
    public static final ProtoAdapter<C1CB9> ADAPTER = new ProtoAdapter<C1CB9>() { // from class: X.1CBA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CB9 decode(ProtoReader protoReader) {
            C1CBB c1cbb = new C1CBB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cbb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c1cbb.LJI = C1CXP.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1cbb.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c1cbb.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cbb.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cbb.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cbb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CB9 c1cb9) {
            C1CB9 c1cb92 = c1cb9;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c1cb92.position);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cb92.link_mic_id) + protoAdapter.encodedSizeWithTag(3, c1cb92.content_id) + C1CXP.ADAPTER.encodedSizeWithTag(4, c1cb92.content_type) + c1cb92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CB9 redact(C1CB9 c1cb9) {
            C1CBB c1cbbNewBuilder = c1cb9.newBuilder();
            c1cbbNewBuilder.clearUnknownFields();
            return c1cbbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CB9 c1cb9) {
            C1CB9 c1cb92 = c1cb9;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cb92.position);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c1cb92.link_mic_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cb92.content_id);
            C1CXP.ADAPTER.encodeWithTag(protoWriter, 4, c1cb92.content_type);
            protoWriter.writeBytes(c1cb92.unknownFields());
        }
    };
    public static final Long DEFAULT_POSITION = 0L;
    public static final C1CXP DEFAULT_CONTENT_TYPE = C1CXP.VAR_LINK_MIC_CONTENT_TYPE_UNDEFINED;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.position.hashCode()) * 37) + this.link_mic_id.hashCode()) * 37) + this.content_id.hashCode()) * 37) + this.content_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CBB newBuilder() {
        C1CBB c1cbb = new C1CBB();
        c1cbb.LIZLLL = this.position;
        c1cbb.LJ = this.link_mic_id;
        c1cbb.LJFF = this.content_id;
        c1cbb.LJI = this.content_type;
        c1cbb.addUnknownFields(unknownFields());
        return c1cbb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", content_id=");
        sb.append(this.content_id);
        sb.append(", content_type=");
        sb.append(this.content_type);
        sb.replace(0, 2, "LinkMicContentPosition{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CB9)) {
            return false;
        }
        C1CB9 c1cb9 = (C1CB9) obj;
        if (unknownFields().equals(c1cb9.unknownFields()) && this.position.equals(c1cb9.position) && this.link_mic_id.equals(c1cb9.link_mic_id) && this.content_id.equals(c1cb9.content_id) && this.content_type.equals(c1cb9.content_type)) {
            return true;
        }
        return false;
    }

    public C1CB9(Long l, String str, String str2, C1CXP c1cxp) {
        this(l, str, str2, c1cxp, ByteString.EMPTY);
    }

    public C1CB9(Long l, String str, String str2, C1CXP c1cxp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.position = l;
        this.link_mic_id = str;
        this.content_id = str2;
        this.content_type = c1cxp;
    }
}
