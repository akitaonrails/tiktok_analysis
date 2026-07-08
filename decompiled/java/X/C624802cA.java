package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C624802cA extends Message<C624802cA, C624902cB> {
    public static final ProtoAdapter<C624802cA> ADAPTER = new ProtoAdapter<C624802cA>() { // from class: X.02c9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C624802cA decode(ProtoReader protoReader) {
            C624802cA c624802cA = new C624802cA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c624802cA.fatal_item_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c624802cA.logid = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c624802cA.now = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c624802cA;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C624802cA c624802cA) {
            C624802cA c624802cA2 = c624802cA;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c624802cA2.now);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c624802cA2.logid) + protoAdapter.asRepeated().encodedSizeWithTag(3, c624802cA2.fatal_item_ids) + c624802cA2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C624802cA c624802cA) {
            C624802cA c624802cA2 = c624802cA;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c624802cA2.now);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c624802cA2.logid);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c624802cA2.fatal_item_ids);
            protoWriter.writeBytes(c624802cA2.unknownFields());
        }
    };
    public List<String> fatal_item_ids;
    public String logid;
    public Long now;

    public C624802cA() {
        super(ADAPTER, ByteString.EMPTY);
        this.fatal_item_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C624902cB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
