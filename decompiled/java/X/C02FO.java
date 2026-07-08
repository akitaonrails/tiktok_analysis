package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FO extends Message<C02FO, C02MJ> {
    public static final ProtoAdapter<C02FO> ADAPTER = new ProtoAdapter<C02FO>() { // from class: X.029R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FO decode(ProtoReader protoReader) {
            C02FO c02fo = new C02FO();
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
                                        c02fo.action_desc = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02fo.benefit_desc = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02fo.verify_desc = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fo.social_proof = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02fo.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FO c02fo) {
            C02FO c02fo2 = c02fo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02fo2.title) + protoAdapter.encodedSizeWithTag(2, c02fo2.social_proof) + protoAdapter.encodedSizeWithTag(3, c02fo2.verify_desc) + protoAdapter.encodedSizeWithTag(4, c02fo2.benefit_desc) + protoAdapter.encodedSizeWithTag(5, c02fo2.action_desc) + c02fo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FO c02fo) {
            C02FO c02fo2 = c02fo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02fo2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c02fo2.social_proof);
            protoAdapter.encodeWithTag(protoWriter, 3, c02fo2.verify_desc);
            protoAdapter.encodeWithTag(protoWriter, 4, c02fo2.benefit_desc);
            protoAdapter.encodeWithTag(protoWriter, 5, c02fo2.action_desc);
            protoWriter.writeBytes(c02fo2.unknownFields());
        }
    };
    public String action_desc;
    public String benefit_desc;
    public String social_proof;
    public String title;
    public String verify_desc;

    public C02FO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
