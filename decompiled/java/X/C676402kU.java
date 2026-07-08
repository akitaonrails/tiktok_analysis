package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02kU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C676402kU extends Message<C676402kU, C676502kV> {
    public static final ProtoAdapter<C676402kU> ADAPTER = new ProtoAdapter<C676402kU>() { // from class: X.02kT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C676402kU decode(ProtoReader protoReader) {
            C676402kU c676402kU = new C676402kU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c676402kU.need_show = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c676402kU.background_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c676402kU.video = C1CG9.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c676402kU.pic_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c676402kU.music_deprecated = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c676402kU.color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c676402kU.music_info = C02RG.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c676402kU.dynamic_image = C739302ud.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c676402kU.shader_view = C02EO.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c676402kU;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C676402kU c676402kU) {
            C676402kU c676402kU2 = c676402kU;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c676402kU2.need_show) + ProtoAdapter.INT32.encodedSizeWithTag(2, c676402kU2.background_type) + C1CG9.ADAPTER.encodedSizeWithTag(3, c676402kU2.video);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c676402kU2.pic_url) + protoAdapter.encodedSizeWithTag(5, c676402kU2.music_deprecated) + protoAdapter.encodedSizeWithTag(6, c676402kU2.color) + C02RG.ADAPTER.encodedSizeWithTag(7, c676402kU2.music_info) + C739302ud.ADAPTER.encodedSizeWithTag(8, c676402kU2.dynamic_image) + C02EO.ADAPTER.encodedSizeWithTag(9, c676402kU2.shader_view) + c676402kU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C676402kU c676402kU) {
            C676402kU c676402kU2 = c676402kU;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c676402kU2.need_show);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c676402kU2.background_type);
            C1CG9.ADAPTER.encodeWithTag(protoWriter, 3, c676402kU2.video);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c676402kU2.pic_url);
            protoAdapter.encodeWithTag(protoWriter, 5, c676402kU2.music_deprecated);
            protoAdapter.encodeWithTag(protoWriter, 6, c676402kU2.color);
            C02RG.ADAPTER.encodeWithTag(protoWriter, 7, c676402kU2.music_info);
            C739302ud.ADAPTER.encodeWithTag(protoWriter, 8, c676402kU2.dynamic_image);
            C02EO.ADAPTER.encodeWithTag(protoWriter, 9, c676402kU2.shader_view);
            protoWriter.writeBytes(c676402kU2.unknownFields());
        }
    };
    public Integer background_type;
    public String color;
    public C739302ud dynamic_image;
    public String music_deprecated;
    public C02RG music_info;
    public Boolean need_show;
    public String pic_url;
    public C02EO shader_view;
    public C1CG9 video;

    public C676402kU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C676502kV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
