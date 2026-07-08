package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EP extends Message<C02EP, C02JV> {
    public static final ProtoAdapter<C02EP> ADAPTER = new ProtoAdapter<C02EP>() { // from class: X.027l
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EP decode(ProtoReader protoReader) {
            C02EP c02ep = new C02EP();
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
                                        c02ep.qrec_json_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02ep.words_label = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02ep.is_personalized = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02ep.textnet_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02ep.words_lang = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ep;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EP c02ep) {
            C02EP c02ep2 = c02ep;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02ep2.words_lang) + protoAdapter.encodedSizeWithTag(2, c02ep2.textnet_id) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02ep2.is_personalized) + protoAdapter.encodedSizeWithTag(4, c02ep2.words_label) + protoAdapter.encodedSizeWithTag(5, c02ep2.qrec_json_info) + c02ep2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EP c02ep) {
            C02EP c02ep2 = c02ep;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ep2.words_lang);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ep2.textnet_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c02ep2.is_personalized);
            protoAdapter.encodeWithTag(protoWriter, 4, c02ep2.words_label);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ep2.qrec_json_info);
            protoWriter.writeBytes(c02ep2.unknownFields());
        }
    };
    public Boolean is_personalized;
    public String qrec_json_info;
    public String textnet_id;
    public String words_label;
    public String words_lang;

    public C02EP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
