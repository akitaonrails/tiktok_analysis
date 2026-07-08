package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02C8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02C8 extends Message<C02C8, C582802Pa> {
    public static final ProtoAdapter<C02C8> ADAPTER = new ProtoAdapter<C02C8>() { // from class: X.024h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02C8 decode(ProtoReader protoReader) {
            C02C8 c02c8 = new C02C8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02c8.rich_text = AnonymousClass0241.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c02c8.background_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02c8.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02c8.bubble_text_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02c8.num_in_selling_point = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02c8.rich_text_ec_richtext = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02c8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02C8 c02c8) {
            C02C8 c02c82 = c02c8;
            int iEncodedSizeWithTag = AnonymousClass0241.ADAPTER.encodedSizeWithTag(1, c02c82.rich_text) + C618602bA.ADAPTER.encodedSizeWithTag(2, c02c82.background_color);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c02c82.description) + protoAdapter.encodedSizeWithTag(4, c02c82.bubble_text_type) + ProtoAdapter.INT32.encodedSizeWithTag(5, c02c82.num_in_selling_point) + C5431029t.ADAPTER.encodedSizeWithTag(6, c02c82.rich_text_ec_richtext) + c02c82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02C8 c02c8) {
        }
    };
    public C618602bA background_color;
    public String bubble_text_type;
    public String description;
    public Integer num_in_selling_point;
    public AnonymousClass0241 rich_text;
    public C5431029t rich_text_ec_richtext;

    public C02C8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C582802Pa newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
