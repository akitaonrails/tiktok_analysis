package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02C2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02C2 extends Message<C02C2, C02K6> {
    public static final ProtoAdapter<C02C2> ADAPTER = new ProtoAdapter<C02C2>() { // from class: X.0266
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02C2 decode(ProtoReader protoReader) {
            C02C2 c02c2 = new C02C2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02c2.extra = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02c2.type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02c2.user_list.add(C02B7.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02c2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02C2 c02c2) {
            C02C2 c02c22 = c02c2;
            return C02B7.ADAPTER.asRepeated().encodedSizeWithTag(1, c02c22.user_list) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02c22.type) + ProtoAdapter.STRING.encodedSizeWithTag(3, c02c22.extra) + c02c22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02C2 c02c2) {
            C02C2 c02c22 = c02c2;
            C02B7.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c02c22.user_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c02c22.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c02c22.extra);
            protoWriter.writeBytes(c02c22.unknownFields());
        }
    };
    public String extra;
    public Integer type;
    public List<C02B7> user_list;

    public C02C2() {
        super(ADAPTER, ByteString.EMPTY);
        this.user_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02K6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
