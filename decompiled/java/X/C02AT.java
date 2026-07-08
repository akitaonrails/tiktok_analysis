package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AT extends Message<C02AT, C02KL> {
    public static final ProtoAdapter<C02AT> ADAPTER = new ProtoAdapter<C02AT>() { // from class: X.024n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AT decode(ProtoReader protoReader) {
            C02AT c02at = new C02AT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02at.banner_enabled = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c02at.meta_info = C02T3.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02at.button = C02DC.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02at.high_tag = C552802Dm.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02at.meta_tag = C552802Dm.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02at.info_bar = C552502Dj.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c02at.bottom_tag = C552802Dm.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02at;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AT c02at) {
            C02AT c02at2 = c02at;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c02at2.banner_enabled) + C02T3.ADAPTER.encodedSizeWithTag(2, c02at2.meta_info) + C02DC.ADAPTER.encodedSizeWithTag(3, c02at2.button);
            ProtoAdapter<C552802Dm> protoAdapter = C552802Dm.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c02at2.high_tag) + protoAdapter.encodedSizeWithTag(5, c02at2.meta_tag) + C552502Dj.ADAPTER.encodedSizeWithTag(6, c02at2.info_bar) + protoAdapter.encodedSizeWithTag(7, c02at2.bottom_tag) + c02at2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02AT c02at) {
            C02AT c02at2 = c02at;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02at2.banner_enabled);
            C02T3.ADAPTER.encodeWithTag(protoWriter, 2, c02at2.meta_info);
            C02DC.ADAPTER.encodeWithTag(protoWriter, 3, c02at2.button);
            ProtoAdapter<C552802Dm> protoAdapter = C552802Dm.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 4, c02at2.high_tag);
            protoAdapter.encodeWithTag(protoWriter, 5, c02at2.meta_tag);
            C552502Dj.ADAPTER.encodeWithTag(protoWriter, 6, c02at2.info_bar);
            protoAdapter.encodeWithTag(protoWriter, 7, c02at2.bottom_tag);
            protoWriter.writeBytes(c02at2.unknownFields());
        }
    };
    public Boolean banner_enabled;
    public C552802Dm bottom_tag;
    public C02DC button;
    public C552802Dm high_tag;
    public C552502Dj info_bar;
    public C02T3 meta_info;
    public C552802Dm meta_tag;

    public C02AT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
