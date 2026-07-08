package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GQ extends Message<C02GQ, C02OP> {
    public static final ProtoAdapter<C02GQ> ADAPTER = new ProtoAdapter<C02GQ>() { // from class: X.02Aq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GQ decode(ProtoReader protoReader) {
            C02GQ c02gq = new C02GQ();
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
                                    c02gq.popup_name = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02gq.content = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02gq.title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02gq.scene = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GQ c02gq) {
            C02GQ c02gq2 = c02gq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02gq2.scene) + protoAdapter.encodedSizeWithTag(2, c02gq2.title) + protoAdapter.encodedSizeWithTag(3, c02gq2.content) + protoAdapter.encodedSizeWithTag(4, c02gq2.popup_name) + c02gq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GQ c02gq) {
        }
    };
    public String content;
    public String popup_name;
    public String scene;
    public String title;

    public C02GQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
