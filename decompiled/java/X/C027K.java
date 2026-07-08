package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027K, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027K extends Message<C027K, C565502Ij> {
    public static final ProtoAdapter<C027K> ADAPTER = new ProtoAdapter<C027K>() { // from class: X.023O
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027K decode(ProtoReader protoReader) {
            C027K c027k = new C027K();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027k.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c027k.data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c027k.sticker_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c027k.sticker_urls.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            c027k.is_animation_sticker = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c027k.id_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c027k.elements.add(C02EH.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027K c027k) {
            C027K c027k2 = c027k;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c027k2.type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c027k2.data) + ProtoAdapter.INT64.encodedSizeWithTag(3, c027k2.sticker_id) + protoAdapter2.asRepeated().encodedSizeWithTag(4, c027k2.sticker_urls) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c027k2.is_animation_sticker) + protoAdapter.encodedSizeWithTag(6, c027k2.id_type) + C02EH.ADAPTER.asRepeated().encodedSizeWithTag(7, c027k2.elements) + c027k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C027K c027k) {
            C027K c027k2 = c027k;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c027k2.type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c027k2.data);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c027k2.sticker_id);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, c027k2.sticker_urls);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c027k2.is_animation_sticker);
            protoAdapter.encodeWithTag(protoWriter, 6, c027k2.id_type);
            C02EH.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, c027k2.elements);
            protoWriter.writeBytes(c027k2.unknownFields());
        }
    };
    public String data;
    public List<C02EH> elements;
    public Integer id_type;
    public Boolean is_animation_sticker;
    public Long sticker_id;
    public List<String> sticker_urls;
    public Integer type;

    public C027K() {
        super(ADAPTER, ByteString.EMPTY);
        this.sticker_urls = C1516540pZE.LJIIIIZZ();
        this.elements = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C565502Ij newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
