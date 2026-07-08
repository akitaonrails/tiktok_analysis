package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235601Cek extends Message<C2235601Cek, C2235621Cem> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String app_data_json_string;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long app_data_sei_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public final String background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long canvas_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long canvas_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String regions_json_string;
    public static final ProtoAdapter<C2235601Cek> ADAPTER = new ProtoAdapter<C2235601Cek>() { // from class: X.1Cel
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235601Cek decode(ProtoReader protoReader) {
            C2235621Cem c2235621Cem = new C2235621Cem();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2235621Cem.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2235621Cem.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2235621Cem.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2235621Cem.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2235621Cem.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2235621Cem.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235621Cem.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235621Cem.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235601Cek c2235601Cek) {
            C2235601Cek c2235601Cek2 = c2235601Cek;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2235601Cek2.app_data_json_string) + protoAdapter.encodedSizeWithTag(2, c2235601Cek2.regions_json_string);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2235601Cek2.canvas_width) + protoAdapter2.encodedSizeWithTag(4, c2235601Cek2.canvas_height) + protoAdapter.encodedSizeWithTag(5, c2235601Cek2.background_color) + protoAdapter2.encodedSizeWithTag(6, c2235601Cek2.app_data_sei_mode) + c2235601Cek2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235601Cek redact(C2235601Cek c2235601Cek) {
            C2235621Cem c2235621CemNewBuilder = c2235601Cek.newBuilder();
            c2235621CemNewBuilder.clearUnknownFields();
            return c2235621CemNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235601Cek c2235601Cek) {
            C2235601Cek c2235601Cek2 = c2235601Cek;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2235601Cek2.app_data_json_string);
            protoAdapter.encodeWithTag(protoWriter, 2, c2235601Cek2.regions_json_string);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2235601Cek2.canvas_width);
            protoAdapter2.encodeWithTag(protoWriter, 4, c2235601Cek2.canvas_height);
            protoAdapter.encodeWithTag(protoWriter, 5, c2235601Cek2.background_color);
            protoAdapter2.encodeWithTag(protoWriter, 6, c2235601Cek2.app_data_sei_mode);
            protoWriter.writeBytes(c2235601Cek2.unknownFields());
        }
    };
    public static final Long DEFAULT_CANVAS_WIDTH = 0L;
    public static final Long DEFAULT_CANVAS_HEIGHT = 0L;
    public static final Long DEFAULT_APP_DATA_SEI_MODE = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.app_data_json_string.hashCode()) * 37) + this.regions_json_string.hashCode()) * 37) + this.canvas_width.hashCode()) * 37) + this.canvas_height.hashCode()) * 37) + this.background_color.hashCode()) * 37) + this.app_data_sei_mode.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2235621Cem newBuilder() {
        C2235621Cem c2235621Cem = new C2235621Cem();
        c2235621Cem.LIZLLL = this.app_data_json_string;
        c2235621Cem.LJ = this.regions_json_string;
        c2235621Cem.LJFF = this.canvas_width;
        c2235621Cem.LJI = this.canvas_height;
        c2235621Cem.LJII = this.background_color;
        c2235621Cem.LJIIIIZZ = this.app_data_sei_mode;
        c2235621Cem.addUnknownFields(unknownFields());
        return c2235621Cem;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", app_data_json_string=");
        sb.append(this.app_data_json_string);
        sb.append(", regions_json_string=");
        sb.append(this.regions_json_string);
        sb.append(", canvas_width=");
        sb.append(this.canvas_width);
        sb.append(", canvas_height=");
        sb.append(this.canvas_height);
        sb.append(", background_color=");
        sb.append(this.background_color);
        sb.append(", app_data_sei_mode=");
        sb.append(this.app_data_sei_mode);
        sb.replace(0, 2, "LinkMicSei{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235601Cek)) {
            return false;
        }
        C2235601Cek c2235601Cek = (C2235601Cek) obj;
        if (unknownFields().equals(c2235601Cek.unknownFields()) && this.app_data_json_string.equals(c2235601Cek.app_data_json_string) && this.regions_json_string.equals(c2235601Cek.regions_json_string) && this.canvas_width.equals(c2235601Cek.canvas_width) && this.canvas_height.equals(c2235601Cek.canvas_height) && this.background_color.equals(c2235601Cek.background_color) && this.app_data_sei_mode.equals(c2235601Cek.app_data_sei_mode)) {
            return true;
        }
        return false;
    }

    public C2235601Cek(String str, String str2, Long l, Long l2, String str3, Long l3) {
        this(str, str2, l, l2, str3, l3, ByteString.EMPTY);
    }

    public C2235601Cek(String str, String str2, Long l, Long l2, String str3, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_data_json_string = str;
        this.regions_json_string = str2;
        this.canvas_width = l;
        this.canvas_height = l2;
        this.background_color = str3;
        this.app_data_sei_mode = l3;
    }
}
