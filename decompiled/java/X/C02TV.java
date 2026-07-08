package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02TV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02TV extends Message<C02TV, C02TY> {
    public static final ProtoAdapter<C02TV> ADAPTER = new ProtoAdapter<C02TV>() { // from class: X.02TU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02TV decode(ProtoReader protoReader) {
            C02TV c02tv = new C02TV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                c02tv.text = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                c02tv.click_action = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 3:
                                c02tv.background_color = C618602bA.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c02tv.image = C02U1.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c02tv.border_color = C618602bA.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c02tv.enable_blur_effect = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                c02tv.padding = C698502o3.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c02tv.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02tv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02TV c02tv) {
            C02TV c02tv2 = c02tv;
            int iEncodedSizeWithTag = C5431029t.ADAPTER.encodedSizeWithTag(1, c02tv2.text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02tv2.click_action);
            ProtoAdapter<C618602bA> protoAdapter = C618602bA.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c02tv2.background_color) + C02U1.ADAPTER.encodedSizeWithTag(4, c02tv2.image) + protoAdapter.encodedSizeWithTag(5, c02tv2.border_color) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c02tv2.enable_blur_effect) + C698502o3.ADAPTER.encodedSizeWithTag(7, c02tv2.padding) + ProtoAdapter.STRING.encodedSizeWithTag(255, c02tv2.da_info) + c02tv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02TV c02tv) {
        }
    };
    public C618602bA background_color;
    public C618602bA border_color;
    public Integer click_action;
    public String da_info;
    public Boolean enable_blur_effect;
    public C02U1 image;
    public C698502o3 padding;
    public C5431029t text;

    public C02TV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02TY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
