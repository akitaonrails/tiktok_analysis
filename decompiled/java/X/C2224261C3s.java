package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224261C3s extends Message<C2224261C3s, C2224271C3t> {
    public static final ProtoAdapter<C2224261C3s> ADAPTER = new ProtoAdapter<C2224261C3s>() { // from class: X.1C3r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224261C3s decode(ProtoReader protoReader) {
            C2224261C3s c2224261C3s = new C2224261C3s();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2224261C3s.usable_end_time = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2224261C3s.usable_start_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2224261C3s.voucher_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224261C3s;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224261C3s c2224261C3s) {
            C2224261C3s c2224261C3s2 = c2224261C3s;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2224261C3s2.voucher_id) + protoAdapter.encodedSizeWithTag(2, c2224261C3s2.usable_start_time) + protoAdapter.encodedSizeWithTag(3, c2224261C3s2.usable_end_time) + c2224261C3s2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224261C3s c2224261C3s) {
        }
    };
    public Long usable_end_time;
    public Long usable_start_time;
    public Long voucher_id;

    public C2224261C3s() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224271C3t newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
