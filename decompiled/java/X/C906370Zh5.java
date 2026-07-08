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

/* JADX INFO: renamed from: X.0Zh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906370Zh5 extends Message<C906370Zh5, C906480ZhG> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer height;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.MediaStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC906550ZhN status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 5)
    public final List<String> url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer width;
    public static final ProtoAdapter<C906370Zh5> ADAPTER = new ProtoAdapter<C906370Zh5>() { // from class: X.0Zh4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906370Zh5 decode(ProtoReader protoReader) {
            C906480ZhG c906480ZhG = new C906480ZhG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c906480ZhG.LIZLLL = EnumC906550ZhN.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c906480ZhG.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c906480ZhG.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c906480ZhG.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c906480ZhG.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c906480ZhG.LJII.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c906480ZhG.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c906480ZhG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906480ZhG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906370Zh5 c906370Zh5) {
            C906370Zh5 c906370Zh52 = c906370Zh5;
            int iEncodedSizeWithTag = EnumC906550ZhN.ADAPTER.encodedSizeWithTag(1, c906370Zh52.status);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c906370Zh52.width) + protoAdapter.encodedSizeWithTag(3, c906370Zh52.height);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c906370Zh52.uri) + protoAdapter2.asRepeated().encodedSizeWithTag(5, c906370Zh52.url) + protoAdapter2.encodedSizeWithTag(6, c906370Zh52.display_name) + c906370Zh52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906370Zh5 redact(C906370Zh5 c906370Zh5) {
            C906480ZhG c906480ZhGNewBuilder = c906370Zh5.newBuilder();
            c906480ZhGNewBuilder.clearUnknownFields();
            return c906480ZhGNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906370Zh5 c906370Zh5) {
            C906370Zh5 c906370Zh52 = c906370Zh5;
            EnumC906550ZhN.ADAPTER.encodeWithTag(protoWriter, 1, c906370Zh52.status);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c906370Zh52.width);
            protoAdapter.encodeWithTag(protoWriter, 3, c906370Zh52.height);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c906370Zh52.uri);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, c906370Zh52.url);
            protoAdapter2.encodeWithTag(protoWriter, 6, c906370Zh52.display_name);
            protoWriter.writeBytes(c906370Zh52.unknownFields());
        }
    };
    public static final EnumC906550ZhN DEFAULT_STATUS = EnumC906550ZhN.MEDIA_STATUS_UNKNOWN;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.status.hashCode()) * 37;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.height;
        int iHashCode3 = (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str = this.uri;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 37) + this.url.hashCode()) * 37;
        String str2 = this.display_name;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C906480ZhG newBuilder() {
        C906480ZhG c906480ZhG = new C906480ZhG();
        c906480ZhG.LIZLLL = this.status;
        c906480ZhG.LJ = this.width;
        c906480ZhG.LJFF = this.height;
        c906480ZhG.LJI = this.uri;
        c906480ZhG.LJII = C1516540pZE.LIZJ("url", this.url);
        c906480ZhG.LJIIIIZZ = this.display_name;
        c906480ZhG.addUnknownFields(unknownFields());
        return c906480ZhG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
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
        if (!(obj instanceof C906370Zh5)) {
            return false;
        }
        C906370Zh5 c906370Zh5 = (C906370Zh5) obj;
        if (unknownFields().equals(c906370Zh5.unknownFields()) && this.status.equals(c906370Zh5.status) && C1516540pZE.LJ(this.width, c906370Zh5.width) && C1516540pZE.LJ(this.height, c906370Zh5.height) && C1516540pZE.LJ(this.uri, c906370Zh5.uri) && this.url.equals(c906370Zh5.url) && C1516540pZE.LJ(this.display_name, c906370Zh5.display_name)) {
            return true;
        }
        return false;
    }

    public C906370Zh5(EnumC906550ZhN enumC906550ZhN, Integer num, Integer num2, String str, List<String> list, String str2) {
        this(enumC906550ZhN, num, num2, str, list, str2, ByteString.EMPTY);
    }

    public C906370Zh5(EnumC906550ZhN enumC906550ZhN, Integer num, Integer num2, String str, List<String> list, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = enumC906550ZhN;
        this.width = num;
        this.height = num2;
        this.uri = str;
        this.url = C1516540pZE.LJFF("url", list);
        this.display_name = str2;
    }
}
