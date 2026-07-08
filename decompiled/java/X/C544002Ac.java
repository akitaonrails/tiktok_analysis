package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C544002Ac extends Message<C544002Ac, C579602Nu> {
    public static final ProtoAdapter<C544002Ac> ADAPTER = new ProtoAdapter<C544002Ac>() { // from class: X.024M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C544002Ac decode(ProtoReader protoReader) {
            C544002Ac c544002Ac = new C544002Ac();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c544002Ac.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c544002Ac.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c544002Ac.is_third_party_link = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c544002Ac.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c544002Ac.text_color = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c544002Ac.is_bold = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c544002Ac.has_underscore = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c544002Ac.show_arrow = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c544002Ac.text_raw_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c544002Ac;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C544002Ac c544002Ac) {
            C544002Ac c544002Ac2 = c544002Ac;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c544002Ac2.text) + protoAdapter.encodedSizeWithTag(2, c544002Ac2.link);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c544002Ac2.is_third_party_link) + protoAdapter.encodedSizeWithTag(4, c544002Ac2.name) + ProtoAdapter.INT32.encodedSizeWithTag(5, c544002Ac2.text_color) + protoAdapter2.encodedSizeWithTag(6, c544002Ac2.is_bold) + protoAdapter2.encodedSizeWithTag(7, c544002Ac2.has_underscore) + protoAdapter2.encodedSizeWithTag(8, c544002Ac2.show_arrow) + C618602bA.ADAPTER.encodedSizeWithTag(9, c544002Ac2.text_raw_color) + c544002Ac2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C544002Ac c544002Ac) {
        }
    };
    public Boolean has_underscore;
    public Boolean is_bold;
    public Boolean is_third_party_link;
    public String link;
    public String name;
    public Boolean show_arrow;
    public String text;
    public Integer text_color;
    public C618602bA text_raw_color;

    public C544002Ac() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C579602Nu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
