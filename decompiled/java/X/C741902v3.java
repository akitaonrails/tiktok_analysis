package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02v3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C741902v3 extends Message<C741902v3, C742002v4> {
    public static final ProtoAdapter<C741902v3> ADAPTER = new ProtoAdapter<C741902v3>() { // from class: X.02v2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C741902v3 decode(ProtoReader protoReader) {
            C741902v3 c741902v3 = new C741902v3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c741902v3.light_icon = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c741902v3.dark_icon = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c741902v3.suffix_light_icon = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c741902v3.suffix_dark_icon = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c741902v3.prefix_light_icon = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c741902v3.prefix_dark_icon = C02U1.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c741902v3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C741902v3 c741902v3) {
            C741902v3 c741902v32 = c741902v3;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c741902v32.light_icon) + protoAdapter.encodedSizeWithTag(2, c741902v32.dark_icon) + protoAdapter.encodedSizeWithTag(3, c741902v32.suffix_light_icon) + protoAdapter.encodedSizeWithTag(4, c741902v32.suffix_dark_icon) + protoAdapter.encodedSizeWithTag(5, c741902v32.prefix_light_icon) + protoAdapter.encodedSizeWithTag(6, c741902v32.prefix_dark_icon) + c741902v32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C741902v3 c741902v3) {
        }
    };
    public C02U1 dark_icon;
    public C02U1 light_icon;
    public C02U1 prefix_dark_icon;
    public C02U1 prefix_light_icon;
    public C02U1 suffix_dark_icon;
    public C02U1 suffix_light_icon;

    public C741902v3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C742002v4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
