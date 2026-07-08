package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C546902Bf extends Message<C546902Bf, C02MK> {
    public static final ProtoAdapter<C546902Bf> ADAPTER = new ProtoAdapter<C546902Bf>() { // from class: X.024s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C546902Bf decode(ProtoReader protoReader) {
            C546902Bf c546902Bf = new C546902Bf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c546902Bf.show_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c546902Bf.business_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c546902Bf.wikipedia_info = C671402jg.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c546902Bf.shop_link = C638402eM.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c546902Bf.anchor_info = C5227021x.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c546902Bf.anchor_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c546902Bf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C546902Bf c546902Bf) {
            C546902Bf c546902Bf2 = c546902Bf;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c546902Bf2.show_type) + protoAdapter.encodedSizeWithTag(2, c546902Bf2.business_type) + C671402jg.ADAPTER.encodedSizeWithTag(3, c546902Bf2.wikipedia_info) + C638402eM.ADAPTER.encodedSizeWithTag(4, c546902Bf2.shop_link) + C5227021x.ADAPTER.encodedSizeWithTag(5, c546902Bf2.anchor_info) + ProtoAdapter.STRING.encodedSizeWithTag(6, c546902Bf2.anchor_id) + c546902Bf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C546902Bf c546902Bf) {
            C546902Bf c546902Bf2 = c546902Bf;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c546902Bf2.show_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c546902Bf2.business_type);
            C671402jg.ADAPTER.encodeWithTag(protoWriter, 3, c546902Bf2.wikipedia_info);
            C638402eM.ADAPTER.encodeWithTag(protoWriter, 4, c546902Bf2.shop_link);
            C5227021x.ADAPTER.encodeWithTag(protoWriter, 5, c546902Bf2.anchor_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, c546902Bf2.anchor_id);
            protoWriter.writeBytes(c546902Bf2.unknownFields());
        }
    };
    public String anchor_id;
    public C5227021x anchor_info;
    public Integer business_type;
    public C638402eM shop_link;
    public Integer show_type;
    public C671402jg wikipedia_info;

    public C546902Bf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
