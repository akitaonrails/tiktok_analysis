package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C605202Xq extends Message<C605202Xq, C605302Xr> {
    public static final ProtoAdapter<C605202Xq> ADAPTER = new ProtoAdapter<C605202Xq>() { // from class: X.02Xp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C605202Xq decode(ProtoReader protoReader) {
            C605202Xq c605202Xq = new C605202Xq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c605202Xq.trigger_interest_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c605202Xq.trigger_interest_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c605202Xq.interest_ids.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c605202Xq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C605202Xq c605202Xq) {
            C605202Xq c605202Xq2 = c605202Xq;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c605202Xq2.interest_ids) + protoAdapter.encodedSizeWithTag(2, c605202Xq2.trigger_interest_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, c605202Xq2.trigger_interest_name) + c605202Xq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C605202Xq c605202Xq) {
            C605202Xq c605202Xq2 = c605202Xq;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c605202Xq2.interest_ids);
            protoAdapter.encodeWithTag(protoWriter, 2, c605202Xq2.trigger_interest_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c605202Xq2.trigger_interest_name);
            protoWriter.writeBytes(c605202Xq2.unknownFields());
        }
    };
    public List<Long> interest_ids;
    public Long trigger_interest_id;
    public String trigger_interest_name;

    public C605202Xq() {
        super(ADAPTER, ByteString.EMPTY);
        this.interest_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C605302Xr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
