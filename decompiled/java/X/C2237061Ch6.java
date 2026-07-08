package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ch6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237061Ch6 extends Message<C2237061Ch6, C2237071Ch7> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 2)
    public final ByteString content;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicEncodeType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2232091CXv encode_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImMessageExtra#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2237111ChB extra;
    public static final ProtoAdapter<C2237061Ch6> ADAPTER = new ProtoAdapter<C2237061Ch6>() { // from class: X.1Ch5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237061Ch6 decode(ProtoReader protoReader) {
            C2237071Ch7 c2237071Ch7 = new C2237071Ch7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2237071Ch7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2237071Ch7.LJFF = C2237111ChB.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2237071Ch7.LJ = ProtoAdapter.BYTES.decode(protoReader);
                        }
                    } else {
                        try {
                            c2237071Ch7.LIZLLL = EnumC2232091CXv.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2237071Ch7.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237071Ch7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237061Ch6 c2237061Ch6) {
            C2237061Ch6 c2237061Ch62 = c2237061Ch6;
            return EnumC2232091CXv.ADAPTER.encodedSizeWithTag(1, c2237061Ch62.encode_type) + ProtoAdapter.BYTES.encodedSizeWithTag(2, c2237061Ch62.content) + C2237111ChB.ADAPTER.encodedSizeWithTag(3, c2237061Ch62.extra) + c2237061Ch62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237061Ch6 redact(C2237061Ch6 c2237061Ch6) {
            C2237071Ch7 c2237071Ch7NewBuilder = c2237061Ch6.newBuilder();
            c2237071Ch7NewBuilder.LJFF = C2237111ChB.ADAPTER.redact(c2237071Ch7NewBuilder.LJFF);
            c2237071Ch7NewBuilder.clearUnknownFields();
            return c2237071Ch7NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237061Ch6 c2237061Ch6) {
            C2237061Ch6 c2237061Ch62 = c2237061Ch6;
            EnumC2232091CXv.ADAPTER.encodeWithTag(protoWriter, 1, c2237061Ch62.encode_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, c2237061Ch62.content);
            C2237111ChB.ADAPTER.encodeWithTag(protoWriter, 3, c2237061Ch62.extra);
            protoWriter.writeBytes(c2237061Ch62.unknownFields());
        }
    };
    public static final EnumC2232091CXv DEFAULT_ENCODE_TYPE = EnumC2232091CXv.VAR_LINK_MIC_ENCODE_TYPE_JSON;
    public static final ByteString DEFAULT_CONTENT = ByteString.EMPTY;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.encode_type.hashCode()) * 37) + this.content.hashCode()) * 37) + this.extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237071Ch7 newBuilder() {
        C2237071Ch7 c2237071Ch7 = new C2237071Ch7();
        c2237071Ch7.LIZLLL = this.encode_type;
        c2237071Ch7.LJ = this.content;
        c2237071Ch7.LJFF = this.extra;
        c2237071Ch7.addUnknownFields(unknownFields());
        return c2237071Ch7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", encode_type=");
        sb.append(this.encode_type);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.replace(0, 2, "LinkMicBaseMessage{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237061Ch6)) {
            return false;
        }
        C2237061Ch6 c2237061Ch6 = (C2237061Ch6) obj;
        if (unknownFields().equals(c2237061Ch6.unknownFields()) && this.encode_type.equals(c2237061Ch6.encode_type) && this.content.equals(c2237061Ch6.content) && this.extra.equals(c2237061Ch6.extra)) {
            return true;
        }
        return false;
    }

    public C2237061Ch6(EnumC2232091CXv enumC2232091CXv, ByteString byteString, C2237111ChB c2237111ChB) {
        this(enumC2232091CXv, byteString, c2237111ChB, ByteString.EMPTY);
    }

    public C2237061Ch6(EnumC2232091CXv enumC2232091CXv, ByteString byteString, C2237111ChB c2237111ChB, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.encode_type = enumC2232091CXv;
        this.content = byteString;
        this.extra = c2237111ChB;
    }
}
