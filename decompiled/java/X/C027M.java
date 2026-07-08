package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027M extends Message<C027M, C02K7> {
    public static final ProtoAdapter<C027M> ADAPTER = new ProtoAdapter<C027M>() { // from class: X.023b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027M decode(ProtoReader protoReader) {
            C027M c027m = new C027M();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027m.text_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c027m.background_info = C02HG.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c027m.sub_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c027m.rich_text.add(C546802Be.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c027m.bubble_background_color = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c027m.avatar_info = C02AV.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c027m.text_extra.add(C547402Bk.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027m;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027M c027m) {
            C027M c027m2 = c027m;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c027m2.text_content) + C02HG.ADAPTER.encodedSizeWithTag(2, c027m2.background_info);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c027m2.sub_type) + C546802Be.ADAPTER.asRepeated().encodedSizeWithTag(4, c027m2.rich_text) + protoAdapter.encodedSizeWithTag(5, c027m2.bubble_background_color) + C02AV.ADAPTER.encodedSizeWithTag(6, c027m2.avatar_info) + C547402Bk.ADAPTER.asRepeated().encodedSizeWithTag(7, c027m2.text_extra) + c027m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C027M c027m) {
            C027M c027m2 = c027m;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c027m2.text_content);
            C02HG.ADAPTER.encodeWithTag(protoWriter, 2, c027m2.background_info);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 3, c027m2.sub_type);
            C546802Be.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c027m2.rich_text);
            protoAdapter.encodeWithTag(protoWriter, 5, c027m2.bubble_background_color);
            C02AV.ADAPTER.encodeWithTag(protoWriter, 6, c027m2.avatar_info);
            C547402Bk.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, c027m2.text_extra);
            protoWriter.writeBytes(c027m2.unknownFields());
        }
    };
    public C02AV avatar_info;
    public C02HG background_info;
    public Integer bubble_background_color;
    public List<C546802Be> rich_text;
    public Integer sub_type;
    public String text_content;
    public List<C547402Bk> text_extra;

    public C027M() {
        super(ADAPTER, ByteString.EMPTY);
        this.rich_text = C1516540pZE.LJIIIIZZ();
        this.text_extra = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02K7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
