package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.029q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5428029q extends Message<C5428029q, C578302Nh> {
    public static final ProtoAdapter<C5428029q> ADAPTER = new ProtoAdapter<C5428029q>() { // from class: X.024L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5428029q decode(ProtoReader protoReader) {
            C5428029q c5428029q = new C5428029q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5428029q.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5428029q.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5428029q.font = C644402fK.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5428029q.has_underline = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c5428029q.has_strike = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c5428029q.font_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5428029q.background_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5428029q.is_italic = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5428029q.num_of_lines = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5428029q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5428029q c5428029q) {
            C5428029q c5428029q2 = c5428029q;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5428029q2.text) + protoAdapter.encodedSizeWithTag(2, c5428029q2.link) + C644402fK.ADAPTER.encodedSizeWithTag(3, c5428029q2.font);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5428029q2.has_underline) + protoAdapter2.encodedSizeWithTag(5, c5428029q2.has_strike);
            ProtoAdapter<C618602bA> protoAdapter3 = C618602bA.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c5428029q2.font_color) + protoAdapter3.encodedSizeWithTag(7, c5428029q2.background_color) + protoAdapter2.encodedSizeWithTag(8, c5428029q2.is_italic) + ProtoAdapter.INT32.encodedSizeWithTag(9, c5428029q2.num_of_lines) + c5428029q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5428029q c5428029q) {
        }
    };
    public C618602bA background_color;
    public C644402fK font;
    public C618602bA font_color;
    public Boolean has_strike;
    public Boolean has_underline;
    public Boolean is_italic;
    public String link;
    public Integer num_of_lines;
    public String text;

    public C5428029q() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C578302Nh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
