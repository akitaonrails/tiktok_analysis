package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CL extends Message<C02CL, C584802Pu> {
    public static final ProtoAdapter<C02CL> ADAPTER = new ProtoAdapter<C02CL>() { // from class: X.025y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CL decode(ProtoReader protoReader) {
            C02CL c02cl = new C02CL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cl.content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02cl.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02cl.image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02cl.appear_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c02cl.auto_disappearance_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c02cl.promotion_usable_end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CL c02cl) {
            C02CL c02cl2 = c02cl;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c02cl2.content) + C029C.ADAPTER.encodedSizeWithTag(2, c02cl2.icon) + C02U1.ADAPTER.encodedSizeWithTag(3, c02cl2.image);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c02cl2.appear_time) + protoAdapter.encodedSizeWithTag(5, c02cl2.auto_disappearance_time) + protoAdapter.encodedSizeWithTag(6, c02cl2.promotion_usable_end_time) + c02cl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02CL c02cl) {
        }
    };
    public Long appear_time;
    public Long auto_disappearance_time;
    public String content;
    public C029C icon;
    public C02U1 image;
    public Long promotion_usable_end_time;

    public C02CL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C584802Pu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
