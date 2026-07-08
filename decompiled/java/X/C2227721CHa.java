package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227721CHa extends Message<C2227721CHa, C2227731CHb> {
    public static final ProtoAdapter<C2227721CHa> ADAPTER = new ProtoAdapter<C2227721CHa>() { // from class: X.1CHZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227721CHa decode(ProtoReader protoReader) {
            C2227721CHa c2227721CHa = new C2227721CHa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c2227721CHa.live_group_id = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2227721CHa.image_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2227721CHa.title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2227721CHa.source = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2227721CHa.button_background_color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227721CHa;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227721CHa c2227721CHa) {
            C2227721CHa c2227721CHa2 = c2227721CHa;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2227721CHa2.button_background_color) + protoAdapter.encodedSizeWithTag(2, c2227721CHa2.source) + protoAdapter.encodedSizeWithTag(3, c2227721CHa2.title) + protoAdapter.encodedSizeWithTag(4, c2227721CHa2.image_url) + protoAdapter.encodedSizeWithTag(5, c2227721CHa2.live_group_id) + c2227721CHa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227721CHa c2227721CHa) {
            C2227721CHa c2227721CHa2 = c2227721CHa;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2227721CHa2.button_background_color);
            protoAdapter.encodeWithTag(protoWriter, 2, c2227721CHa2.source);
            protoAdapter.encodeWithTag(protoWriter, 3, c2227721CHa2.title);
            protoAdapter.encodeWithTag(protoWriter, 4, c2227721CHa2.image_url);
            protoAdapter.encodeWithTag(protoWriter, 5, c2227721CHa2.live_group_id);
            protoWriter.writeBytes(c2227721CHa2.unknownFields());
        }
    };
    public String button_background_color;
    public String image_url;
    public String live_group_id;
    public String source;
    public String title;

    public C2227721CHa() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2227731CHb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
