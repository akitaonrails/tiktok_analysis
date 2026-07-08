package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.026X, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C026X extends Message<C026X, C02KE> {
    public static final ProtoAdapter<C026X> ADAPTER = new ProtoAdapter<C026X>() { // from class: X.023e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C026X decode(ProtoReader protoReader) {
            C026X c026x = new C026X();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        switch (iNextTag) {
                            case 1:
                                c026x.images.add(C5309025b.ADAPTER.decode(protoReader));
                                break;
                            case 2:
                                c026x.image_post_cover = C5309025b.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c026x.music_volume = ProtoAdapter.FLOAT.decode(protoReader);
                                break;
                            case 4:
                                c026x.title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c026x.photomode_image_quality_info = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c026x.translation_info = C02V0.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c026x.help_post_info = C709402po.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c026x.post_extra = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c026x;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C026X c026x) {
            C026X c026x2 = c026x;
            ProtoAdapter<C5309025b> protoAdapter = C5309025b.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(1, c026x2.images) + protoAdapter.encodedSizeWithTag(2, c026x2.image_post_cover) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, c026x2.music_volume);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c026x2.title) + protoAdapter2.encodedSizeWithTag(5, c026x2.photomode_image_quality_info) + C02V0.ADAPTER.encodedSizeWithTag(6, c026x2.translation_info) + C709402po.ADAPTER.encodedSizeWithTag(7, c026x2.help_post_info) + protoAdapter2.encodedSizeWithTag(100, c026x2.post_extra) + c026x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C026X c026x) {
            C026X c026x2 = c026x;
            ProtoAdapter<C5309025b> protoAdapter = C5309025b.ADAPTER;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c026x2.images);
            protoAdapter.encodeWithTag(protoWriter, 2, c026x2.image_post_cover);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, c026x2.music_volume);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c026x2.title);
            protoAdapter2.encodeWithTag(protoWriter, 5, c026x2.photomode_image_quality_info);
            C02V0.ADAPTER.encodeWithTag(protoWriter, 6, c026x2.translation_info);
            C709402po.ADAPTER.encodeWithTag(protoWriter, 7, c026x2.help_post_info);
            protoAdapter2.encodeWithTag(protoWriter, 100, c026x2.post_extra);
            protoWriter.writeBytes(c026x2.unknownFields());
        }
    };
    public C709402po help_post_info;
    public C5309025b image_post_cover;
    public List<C5309025b> images;
    public Float music_volume;
    public String photomode_image_quality_info;
    public String post_extra;
    public String title;
    public C02V0 translation_info;

    public C026X() {
        super(ADAPTER, ByteString.EMPTY);
        this.images = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02KE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
