package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251241D9m extends Message<C2251241D9m, C2251251D9n> {
    public static final ProtoAdapter<C2251241D9m> ADAPTER = new ProtoAdapter<C2251241D9m>() { // from class: X.1D9l
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251241D9m decode(ProtoReader protoReader) {
            C2251241D9m c2251241D9m = new C2251241D9m();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c2251241D9m.icon_url = C673002jw.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2251241D9m.text_color = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2251241D9m.sub_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2251241D9m.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251241D9m;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251241D9m c2251241D9m) {
            C2251241D9m c2251241D9m2 = c2251241D9m;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2251241D9m2.title) + protoAdapter.encodedSizeWithTag(2, c2251241D9m2.sub_title) + protoAdapter.encodedSizeWithTag(3, c2251241D9m2.text_color) + C673002jw.ADAPTER.encodedSizeWithTag(4, c2251241D9m2.icon_url) + c2251241D9m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251241D9m c2251241D9m) {
            C2251241D9m c2251241D9m2 = c2251241D9m;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251241D9m2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251241D9m2.sub_title);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251241D9m2.text_color);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 4, c2251241D9m2.icon_url);
            protoWriter.writeBytes(c2251241D9m2.unknownFields());
        }
    };
    public C673002jw icon_url;
    public String sub_title;
    public String text_color;
    public String title;

    public C2251241D9m() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2251251D9n newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
