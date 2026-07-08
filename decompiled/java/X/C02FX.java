package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FX extends Message<C02FX, C02LU> {
    public static final ProtoAdapter<C02FX> ADAPTER = new ProtoAdapter<C02FX>() { // from class: X.027d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FX decode(ProtoReader protoReader) {
            C02FX c02fx = new C02FX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02fx.card_insert_status = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02fx.card_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02fx.card_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FX c02fx) {
            C02FX c02fx2 = c02fx;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02fx2.card_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, c02fx2.card_id) + protoAdapter.encodedSizeWithTag(3, c02fx2.card_insert_status) + c02fx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FX c02fx) {
            C02FX c02fx2 = c02fx;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02fx2.card_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c02fx2.card_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c02fx2.card_insert_status);
            protoWriter.writeBytes(c02fx2.unknownFields());
        }
    };
    public Long card_id;
    public Integer card_insert_status;
    public Integer card_type;

    public C02FX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
