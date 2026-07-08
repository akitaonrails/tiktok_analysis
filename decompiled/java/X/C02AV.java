package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AV extends Message<C02AV, C02L7> {
    public static final ProtoAdapter<C02AV> ADAPTER = new ProtoAdapter<C02AV>() { // from class: X.027N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AV decode(ProtoReader protoReader) {
            C02AV c02av = new C02AV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02av.avatar_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02av.avatar_img_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02av.avatar_thought_primary_url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            c02av.avatar_thought_secondary_url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            c02av.avatar_thought_primary_uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02av.avatar_thought_secondary_uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02av;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AV c02av) {
            C02AV c02av2 = c02av;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02av2.avatar_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02av2.avatar_img_url) + protoAdapter.asRepeated().encodedSizeWithTag(3, c02av2.avatar_thought_primary_url_list) + protoAdapter.asRepeated().encodedSizeWithTag(4, c02av2.avatar_thought_secondary_url_list) + protoAdapter.encodedSizeWithTag(5, c02av2.avatar_thought_primary_uri) + protoAdapter.encodedSizeWithTag(6, c02av2.avatar_thought_secondary_uri) + c02av2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02AV c02av) {
            C02AV c02av2 = c02av;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02av2.avatar_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02av2.avatar_img_url);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c02av2.avatar_thought_primary_url_list);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, c02av2.avatar_thought_secondary_url_list);
            protoAdapter.encodeWithTag(protoWriter, 5, c02av2.avatar_thought_primary_uri);
            protoAdapter.encodeWithTag(protoWriter, 6, c02av2.avatar_thought_secondary_uri);
            protoWriter.writeBytes(c02av2.unknownFields());
        }
    };
    public String avatar_img_url;
    public String avatar_thought_primary_uri;
    public List<String> avatar_thought_primary_url_list;
    public String avatar_thought_secondary_uri;
    public List<String> avatar_thought_secondary_url_list;
    public Integer avatar_type;

    public C02AV() {
        super(ADAPTER, ByteString.EMPTY);
        this.avatar_thought_primary_url_list = C1516540pZE.LJIIIIZZ();
        this.avatar_thought_secondary_url_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02L7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
