package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233461CbI extends Message<C2233461CbI, C2233481CbK> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutInsets#ADAPTER", tag = 6)
    public final C2232771CaB custom_insets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 7)
    public final Long dsl_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 5)
    public final Boolean has_split_line;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String layout_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String layout_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 3)
    public final Double ratio;
    public static final ProtoAdapter<C2233461CbI> ADAPTER = new ProtoAdapter<C2233461CbI>() { // from class: X.1CbJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233461CbI decode(ProtoReader protoReader) {
            C2233481CbK c2233481CbK = new C2233481CbK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2233481CbK.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2233481CbK.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2233481CbK.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 4:
                            c2233481CbK.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2233481CbK.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c2233481CbK.LJIIIIZZ = C2232771CaB.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2233481CbK.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233481CbK.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233481CbK.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233461CbI c2233461CbI) {
            C2233461CbI c2233461CbI2 = c2233461CbI;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2233461CbI2.layout_id) + protoAdapter.encodedSizeWithTag(2, c2233461CbI2.layout_key) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, c2233461CbI2.ratio) + protoAdapter.encodedSizeWithTag(4, c2233461CbI2.mode) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c2233461CbI2.has_split_line) + C2232771CaB.ADAPTER.encodedSizeWithTag(6, c2233461CbI2.custom_insets) + ProtoAdapter.INT64.encodedSizeWithTag(7, c2233461CbI2.dsl_version) + c2233461CbI2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233461CbI redact(C2233461CbI c2233461CbI) {
            C2233481CbK c2233481CbKNewBuilder = c2233461CbI.newBuilder();
            C2232771CaB c2232771CaB = c2233481CbKNewBuilder.LJIIIIZZ;
            if (c2232771CaB != null) {
                c2233481CbKNewBuilder.LJIIIIZZ = C2232771CaB.ADAPTER.redact(c2232771CaB);
            }
            c2233481CbKNewBuilder.clearUnknownFields();
            return c2233481CbKNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233461CbI c2233461CbI) {
            C2233461CbI c2233461CbI2 = c2233461CbI;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2233461CbI2.layout_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2233461CbI2.layout_key);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, c2233461CbI2.ratio);
            protoAdapter.encodeWithTag(protoWriter, 4, c2233461CbI2.mode);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c2233461CbI2.has_split_line);
            C2232771CaB.ADAPTER.encodeWithTag(protoWriter, 6, c2233461CbI2.custom_insets);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, c2233461CbI2.dsl_version);
            protoWriter.writeBytes(c2233461CbI2.unknownFields());
        }
    };
    public static final Double DEFAULT_RATIO = Double.valueOf(0.0d);
    public static final Boolean DEFAULT_HAS_SPLIT_LINE = Boolean.FALSE;
    public static final Long DEFAULT_DSL_VERSION = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.layout_id;
        int iHashCode2 = (((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.layout_key.hashCode()) * 37) + this.ratio.hashCode()) * 37) + this.mode.hashCode()) * 37) + this.has_split_line.hashCode()) * 37;
        C2232771CaB c2232771CaB = this.custom_insets;
        int iHashCode3 = ((iHashCode2 + (c2232771CaB != null ? c2232771CaB.hashCode() : 0)) * 37) + this.dsl_version.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2233481CbK newBuilder() {
        C2233481CbK c2233481CbK = new C2233481CbK();
        c2233481CbK.LIZLLL = this.layout_id;
        c2233481CbK.LJ = this.layout_key;
        c2233481CbK.LJFF = this.ratio;
        c2233481CbK.LJI = this.mode;
        c2233481CbK.LJII = this.has_split_line;
        c2233481CbK.LJIIIIZZ = this.custom_insets;
        c2233481CbK.LJIIIZ = this.dsl_version;
        c2233481CbK.addUnknownFields(unknownFields());
        return c2233481CbK;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.layout_id != null) {
            sb.append(", layout_id=");
            sb.append(this.layout_id);
        }
        sb.append(", layout_key=");
        sb.append(this.layout_key);
        sb.append(", ratio=");
        sb.append(this.ratio);
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append(", has_split_line=");
        sb.append(this.has_split_line);
        if (this.custom_insets != null) {
            sb.append(", custom_insets=");
            sb.append(this.custom_insets);
        }
        sb.append(", dsl_version=");
        sb.append(this.dsl_version);
        sb.replace(0, 2, "LinkMicLayoutSeiContainerInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233461CbI)) {
            return false;
        }
        C2233461CbI c2233461CbI = (C2233461CbI) obj;
        if (unknownFields().equals(c2233461CbI.unknownFields()) && C1516540pZE.LJ(this.layout_id, c2233461CbI.layout_id) && this.layout_key.equals(c2233461CbI.layout_key) && this.ratio.equals(c2233461CbI.ratio) && this.mode.equals(c2233461CbI.mode) && this.has_split_line.equals(c2233461CbI.has_split_line) && C1516540pZE.LJ(this.custom_insets, c2233461CbI.custom_insets) && this.dsl_version.equals(c2233461CbI.dsl_version)) {
            return true;
        }
        return false;
    }

    public C2233461CbI(String str, String str2, Double d, String str3, Boolean bool, C2232771CaB c2232771CaB, Long l) {
        this(str, str2, d, str3, bool, c2232771CaB, l, ByteString.EMPTY);
    }

    public C2233461CbI(String str, String str2, Double d, String str3, Boolean bool, C2232771CaB c2232771CaB, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_id = str;
        this.layout_key = str2;
        this.ratio = d;
        this.mode = str3;
        this.has_split_line = bool;
        this.custom_insets = c2232771CaB;
        this.dsl_version = l;
    }
}
