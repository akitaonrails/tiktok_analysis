package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240251CmF extends Message<C2240251CmF, C2240271CmH> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer height;

    @WireField(adapter = "com.bytedance.im.message.template.proto.MediaStatus#ADAPTER", tag = 1)
    public final EnumC2240311CmL status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 5)
    public final List<String> url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer width;
    public static final ProtoAdapter<C2240251CmF> ADAPTER = new ProtoAdapter<C2240251CmF>() { // from class: X.1CmG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240251CmF decode(ProtoReader protoReader) {
            C2240271CmH c2240271CmH = new C2240271CmH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c2240271CmH.LIZLLL = EnumC2240311CmL.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2240271CmH.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c2240271CmH.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2240271CmH.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2240271CmH.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2240271CmH.LJII.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c2240271CmH.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2240271CmH.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240271CmH.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240251CmF c2240251CmF) {
            C2240251CmF c2240251CmF2 = c2240251CmF;
            int iEncodedSizeWithTag = EnumC2240311CmL.ADAPTER.encodedSizeWithTag(1, c2240251CmF2.status);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2240251CmF2.width) + protoAdapter.encodedSizeWithTag(3, c2240251CmF2.height);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c2240251CmF2.uri) + protoAdapter2.asRepeated().encodedSizeWithTag(5, c2240251CmF2.url) + protoAdapter2.encodedSizeWithTag(6, c2240251CmF2.display_name) + c2240251CmF2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240251CmF redact(C2240251CmF c2240251CmF) {
            C2240271CmH c2240271CmHNewBuilder = c2240251CmF.newBuilder();
            c2240271CmHNewBuilder.clearUnknownFields();
            return c2240271CmHNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240251CmF c2240251CmF) {
            C2240251CmF c2240251CmF2 = c2240251CmF;
            EnumC2240311CmL.ADAPTER.encodeWithTag(protoWriter, 1, c2240251CmF2.status);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c2240251CmF2.width);
            protoAdapter.encodeWithTag(protoWriter, 3, c2240251CmF2.height);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c2240251CmF2.uri);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, c2240251CmF2.url);
            protoAdapter2.encodeWithTag(protoWriter, 6, c2240251CmF2.display_name);
            protoWriter.writeBytes(c2240251CmF2.unknownFields());
        }
    };
    public static final EnumC2240311CmL DEFAULT_STATUS = EnumC2240311CmL.MEDIA_STATUS_UNKNOWN;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EnumC2240311CmL enumC2240311CmL = this.status;
        int iHashCode2 = (iHashCode + (enumC2240311CmL != null ? enumC2240311CmL.hashCode() : 0)) * 37;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.height;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str = this.uri;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 37) + this.url.hashCode()) * 37;
        String str2 = this.display_name;
        int iHashCode6 = iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2240271CmH newBuilder() {
        C2240271CmH c2240271CmH = new C2240271CmH();
        c2240271CmH.LIZLLL = this.status;
        c2240271CmH.LJ = this.width;
        c2240271CmH.LJFF = this.height;
        c2240271CmH.LJI = this.uri;
        c2240271CmH.LJII = C1516540pZE.LIZJ("url", this.url);
        c2240271CmH.LJIIIIZZ = this.display_name;
        c2240271CmH.addUnknownFields(unknownFields());
        return c2240271CmH;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (!this.url.isEmpty()) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        sb.replace(0, 2, "ImageStreamBlock{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240251CmF)) {
            return false;
        }
        C2240251CmF c2240251CmF = (C2240251CmF) obj;
        if (unknownFields().equals(c2240251CmF.unknownFields()) && C1516540pZE.LJ(this.status, c2240251CmF.status) && C1516540pZE.LJ(this.width, c2240251CmF.width) && C1516540pZE.LJ(this.height, c2240251CmF.height) && C1516540pZE.LJ(this.uri, c2240251CmF.uri) && this.url.equals(c2240251CmF.url) && C1516540pZE.LJ(this.display_name, c2240251CmF.display_name)) {
            return true;
        }
        return false;
    }

    public C2240251CmF(EnumC2240311CmL enumC2240311CmL, Integer num, Integer num2, String str, List<String> list, String str2) {
        this(enumC2240311CmL, num, num2, str, list, str2, ByteString.EMPTY);
    }

    public C2240251CmF(EnumC2240311CmL enumC2240311CmL, Integer num, Integer num2, String str, List<String> list, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = enumC2240311CmL;
        this.width = num;
        this.height = num2;
        this.uri = str;
        this.url = C1516540pZE.LJFF("url", list);
        this.display_name = str2;
    }
}
