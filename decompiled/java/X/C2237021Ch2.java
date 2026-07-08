package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ch2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237021Ch2 extends Message<C2237021Ch2, C2237041Ch4> {
    public static final ProtoAdapter<C2237021Ch2> ADAPTER = new ProtoAdapter<C2237021Ch2>() { // from class: X.1Ch3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237021Ch2 decode(ProtoReader protoReader) {
            C2237041Ch4 c2237041Ch4 = new C2237041Ch4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2237041Ch4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2237041Ch4.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2237041Ch4.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2237041Ch4.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c2237041Ch4.LIZLLL = EnumC2183061AcC.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2237041Ch4.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237041Ch4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237021Ch2 c2237021Ch2) {
            C2237021Ch2 c2237021Ch22 = c2237021Ch2;
            int iEncodedSizeWithTag = EnumC2183061AcC.ADAPTER.encodedSizeWithTag(1, c2237021Ch22.level);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2237021Ch22.tag) + protoAdapter.encodedSizeWithTag(3, c2237021Ch22.message) + protoAdapter.encodedSizeWithTag(4, c2237021Ch22.extra) + c2237021Ch22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237021Ch2 redact(C2237021Ch2 c2237021Ch2) {
            C2237041Ch4 c2237041Ch4NewBuilder = c2237021Ch2.newBuilder();
            c2237041Ch4NewBuilder.clearUnknownFields();
            return c2237041Ch4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237021Ch2 c2237021Ch2) {
            C2237021Ch2 c2237021Ch22 = c2237021Ch2;
            EnumC2183061AcC.ADAPTER.encodeWithTag(protoWriter, 1, c2237021Ch22.level);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c2237021Ch22.tag);
            protoAdapter.encodeWithTag(protoWriter, 3, c2237021Ch22.message);
            protoAdapter.encodeWithTag(protoWriter, 4, c2237021Ch22.extra);
            protoWriter.writeBytes(c2237021Ch22.unknownFields());
        }
    };
    public static final EnumC2183061AcC DEFAULT_LEVEL = EnumC2183061AcC.VAR_LINK_MIC_LOG_LEVEL_VERBOSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String extra;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLogLevel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183061AcC level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String tag;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.level.hashCode()) * 37) + this.tag.hashCode()) * 37) + this.message.hashCode()) * 37) + this.extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237041Ch4 newBuilder() {
        C2237041Ch4 c2237041Ch4 = new C2237041Ch4();
        c2237041Ch4.LIZLLL = this.level;
        c2237041Ch4.LJ = this.tag;
        c2237041Ch4.LJFF = this.message;
        c2237041Ch4.LJI = this.extra;
        c2237041Ch4.addUnknownFields(unknownFields());
        return c2237041Ch4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.replace(0, 2, "FuncParamsX1e323d1766ecdebe{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237021Ch2)) {
            return false;
        }
        C2237021Ch2 c2237021Ch2 = (C2237021Ch2) obj;
        if (unknownFields().equals(c2237021Ch2.unknownFields()) && this.level.equals(c2237021Ch2.level) && this.tag.equals(c2237021Ch2.tag) && this.message.equals(c2237021Ch2.message) && this.extra.equals(c2237021Ch2.extra)) {
            return true;
        }
        return false;
    }

    public C2237021Ch2(EnumC2183061AcC enumC2183061AcC, String str, String str2, String str3) {
        this(enumC2183061AcC, str, str2, str3, ByteString.EMPTY);
    }

    public C2237021Ch2(EnumC2183061AcC enumC2183061AcC, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.level = enumC2183061AcC;
        this.tag = str;
        this.message = str2;
        this.extra = str3;
    }
}
