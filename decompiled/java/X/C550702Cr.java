package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C550702Cr extends Message<C550702Cr, C574302Lt> {
    public static final ProtoAdapter<C550702Cr> ADAPTER = new ProtoAdapter<C550702Cr>() { // from class: X.025u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C550702Cr decode(ProtoReader protoReader) {
            C550702Cr c550702Cr = new C550702Cr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c550702Cr.commerce_sticker_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c550702Cr.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c550702Cr.letters = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c550702Cr.open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c550702Cr.web_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c550702Cr.web_url_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c550702Cr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C550702Cr c550702Cr) {
            C550702Cr c550702Cr2 = c550702Cr;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c550702Cr2.commerce_sticker_id) + C673002jw.ADAPTER.encodedSizeWithTag(2, c550702Cr2.icon_url);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c550702Cr2.letters) + protoAdapter.encodedSizeWithTag(4, c550702Cr2.open_url) + protoAdapter.encodedSizeWithTag(5, c550702Cr2.web_url) + protoAdapter.encodedSizeWithTag(6, c550702Cr2.web_url_title) + c550702Cr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C550702Cr c550702Cr) {
            C550702Cr c550702Cr2 = c550702Cr;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c550702Cr2.commerce_sticker_id);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 2, c550702Cr2.icon_url);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, c550702Cr2.letters);
            protoAdapter.encodeWithTag(protoWriter, 4, c550702Cr2.open_url);
            protoAdapter.encodeWithTag(protoWriter, 5, c550702Cr2.web_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c550702Cr2.web_url_title);
            protoWriter.writeBytes(c550702Cr2.unknownFields());
        }
    };
    public Long commerce_sticker_id;
    public C673002jw icon_url;
    public String letters;
    public String open_url;
    public String web_url;
    public String web_url_title;

    public C550702Cr() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C574302Lt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
