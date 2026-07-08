package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.026e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5338026e extends Message<C5338026e, C02N9> {
    public static final ProtoAdapter<C5338026e> ADAPTER = new ProtoAdapter<C5338026e>() { // from class: X.023X
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5338026e decode(ProtoReader protoReader) {
            C5338026e c5338026e = new C5338026e();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5338026e.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5338026e.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5338026e.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5338026e.item_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c5338026e.name_en = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5338026e.block_list.add(C5417029f.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c5338026e.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    c5338026e.desc_font_color = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    c5338026e.desc_font_dark_color = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 19:
                                    c5338026e.name_font = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5338026e;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5338026e c5338026e) {
            C5338026e c5338026e2 = c5338026e;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5338026e2.id) + protoAdapter.encodedSizeWithTag(2, c5338026e2.name) + protoAdapter.encodedSizeWithTag(3, c5338026e2.description);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5338026e2.item_type) + protoAdapter.encodedSizeWithTag(5, c5338026e2.name_en) + C5417029f.ADAPTER.asRepeated().encodedSizeWithTag(6, c5338026e2.block_list) + C029C.ADAPTER.encodedSizeWithTag(7, c5338026e2.icon) + protoAdapter.encodedSizeWithTag(17, c5338026e2.desc_font_color) + protoAdapter.encodedSizeWithTag(18, c5338026e2.desc_font_dark_color) + protoAdapter2.encodedSizeWithTag(19, c5338026e2.name_font) + c5338026e2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5338026e c5338026e) {
        }
    };
    public List<C5417029f> block_list;
    public String desc_font_color;
    public String desc_font_dark_color;
    public String description;
    public C029C icon;
    public String id;
    public Integer item_type;
    public String name;
    public String name_en;
    public Integer name_font;

    public C5338026e() {
        super(ADAPTER, ByteString.EMPTY);
        this.block_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02N9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
