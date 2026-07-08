package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C609802Zk extends Message<C609802Zk, C610202Zo> {
    public static final ProtoAdapter<C609802Zk> ADAPTER = new ProtoAdapter<C609802Zk>() { // from class: X.02Zj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C609802Zk decode(ProtoReader protoReader) {
            C609802Zk c609802Zk = new C609802Zk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c609802Zk.test_fields = C739902uj.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c609802Zk.delivery_content.add(C02R8.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c609802Zk.aweme_trace = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c609802Zk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C609802Zk c609802Zk) {
            C609802Zk c609802Zk2 = c609802Zk;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c609802Zk2.aweme_trace) + C02R8.ADAPTER.asRepeated().encodedSizeWithTag(2, c609802Zk2.delivery_content) + C739902uj.ADAPTER.encodedSizeWithTag(3, c609802Zk2.test_fields) + c609802Zk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C609802Zk c609802Zk) {
            C609802Zk c609802Zk2 = c609802Zk;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c609802Zk2.aweme_trace);
            C02R8.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c609802Zk2.delivery_content);
            C739902uj.ADAPTER.encodeWithTag(protoWriter, 3, c609802Zk2.test_fields);
            protoWriter.writeBytes(c609802Zk2.unknownFields());
        }
    };
    public String aweme_trace;
    public List<C02R8> delivery_content;
    public C739902uj test_fields;

    public C609802Zk() {
        super(ADAPTER, ByteString.EMPTY);
        this.delivery_content = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C610202Zo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
