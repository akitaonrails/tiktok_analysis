package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAD extends Message<C1DAD, C1DAE> {
    public static final ProtoAdapter<C1DAD> ADAPTER = new ProtoAdapter<C1DAD>() { // from class: X.1DAC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DAD decode(ProtoReader protoReader) {
            C1DAD c1dad = new C1DAD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dad.key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1dad.data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1dad.type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1dad.style = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1dad.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1dad.color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1dad.color_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1dad.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1dad.image = C1DA7.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dad;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DAD c1dad) {
            C1DAD c1dad2 = c1dad;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1dad2.key) + protoAdapter.encodedSizeWithTag(2, c1dad2.data) + protoAdapter.encodedSizeWithTag(3, c1dad2.type) + protoAdapter.encodedSizeWithTag(4, c1dad2.style) + protoAdapter.encodedSizeWithTag(5, c1dad2.link) + protoAdapter.encodedSizeWithTag(6, c1dad2.color) + protoAdapter.encodedSizeWithTag(7, c1dad2.color_dark) + protoAdapter.encodedSizeWithTag(8, c1dad2.name) + C1DA7.ADAPTER.encodedSizeWithTag(9, c1dad2.image) + c1dad2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1DAD c1dad) {
        }
    };
    public String color;
    public String color_dark;
    public String data;
    public C1DA7 image;
    public String key;
    public String link;
    public String name;
    public String style;
    public String type;

    public C1DAD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1DAE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
