package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CUV extends Message<C1CUV, C1CUX> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer data_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public final List<String> url_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer width;
    public static final ProtoAdapter<C1CUV> ADAPTER = new ProtoAdapter<C1CUV>() { // from class: X.1CUW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CUV decode(ProtoReader protoReader) {
            C1CUX c1cux = new C1CUX();
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
                                        c1cux.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1cux.LJII = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c1cux.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c1cux.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1cux.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c1cux.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cux.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CUV c1cuv) {
            C1CUV c1cuv2 = c1cuv;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cuv2.uri) + protoAdapter.asRepeated().encodedSizeWithTag(2, c1cuv2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1cuv2.width) + protoAdapter2.encodedSizeWithTag(4, c1cuv2.height) + protoAdapter2.encodedSizeWithTag(5, c1cuv2.data_size) + c1cuv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CUV redact(C1CUV c1cuv) {
            C1CUX c1cuxNewBuilder = c1cuv.newBuilder();
            c1cuxNewBuilder.clearUnknownFields();
            return c1cuxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CUV c1cuv) {
            C1CUV c1cuv2 = c1cuv;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cuv2.uri);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c1cuv2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c1cuv2.width);
            protoAdapter2.encodeWithTag(protoWriter, 4, c1cuv2.height);
            protoAdapter2.encodeWithTag(protoWriter, 5, c1cuv2.data_size);
            protoWriter.writeBytes(c1cuv2.unknownFields());
        }
    };
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_DATA_SIZE = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.uri;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.url_list.hashCode()) * 37;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.height;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.data_size;
        int iHashCode5 = iHashCode4 + (num3 != null ? num3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C1CUX newBuilder() {
        C1CUX c1cux = new C1CUX();
        c1cux.LIZLLL = this.uri;
        c1cux.LJ = C1516540pZE.LIZJ("url_list", this.url_list);
        c1cux.LJFF = this.width;
        c1cux.LJI = this.height;
        c1cux.LJII = this.data_size;
        c1cux.addUnknownFields(unknownFields());
        return c1cux;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.data_size != null) {
            sb.append(", data_size=");
            sb.append(this.data_size);
        }
        sb.replace(0, 2, "UrlStruct{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CUV)) {
            return false;
        }
        C1CUV c1cuv = (C1CUV) obj;
        if (unknownFields().equals(c1cuv.unknownFields()) && C1516540pZE.LJ(this.uri, c1cuv.uri) && this.url_list.equals(c1cuv.url_list) && C1516540pZE.LJ(this.width, c1cuv.width) && C1516540pZE.LJ(this.height, c1cuv.height) && C1516540pZE.LJ(this.data_size, c1cuv.data_size)) {
            return true;
        }
        return false;
    }

    public C1CUV(String str, List<String> list, Integer num, Integer num2, Integer num3) {
        this(str, list, num, num2, num3, ByteString.EMPTY);
    }

    public C1CUV(String str, List<String> list, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uri = str;
        this.url_list = C1516540pZE.LJFF("url_list", list);
        this.width = num;
        this.height = num2;
        this.data_size = num3;
    }
}
