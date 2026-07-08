package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GA extends Message<C02GA, C564502Hz> {
    public static final ProtoAdapter<C02GA> ADAPTER = new ProtoAdapter<C02GA>() { // from class: X.029O
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GA decode(ProtoReader protoReader) {
            C02GA c02ga = new C02GA();
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
                                    c02ga.external_song_key = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02ga.partner_song_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02ga.partner_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02ga.h5_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ga;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GA c02ga) {
            C02GA c02ga2 = c02ga;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02ga2.h5_url) + protoAdapter.encodedSizeWithTag(2, c02ga2.partner_name) + protoAdapter.encodedSizeWithTag(3, c02ga2.partner_song_id) + protoAdapter.encodedSizeWithTag(4, c02ga2.external_song_key) + c02ga2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02GA c02ga) {
            C02GA c02ga2 = c02ga;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ga2.h5_url);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ga2.partner_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c02ga2.partner_song_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c02ga2.external_song_key);
            protoWriter.writeBytes(c02ga2.unknownFields());
        }
    };
    public String external_song_key;
    public String h5_url;
    public String partner_name;
    public String partner_song_id;

    public C02GA() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C564502Hz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
