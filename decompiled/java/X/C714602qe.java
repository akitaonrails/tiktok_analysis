package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C714602qe extends Message<C714602qe, C714702qf> {
    public static final ProtoAdapter<C714602qe> ADAPTER = new ProtoAdapter<C714602qe>() { // from class: X.02qd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C714602qe decode(ProtoReader protoReader) {
            C714602qe c714602qe = new C714602qe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 255) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c714602qe.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c714602qe.selling_points_label_info = C02TX.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c714602qe.selling_points_bottom_bubble = C02TX.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c714602qe.selling_points_header_bubble = C02TX.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c714602qe;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C714602qe c714602qe) {
            C714602qe c714602qe2 = c714602qe;
            ProtoAdapter<C02TX> protoAdapter = C02TX.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c714602qe2.selling_points_header_bubble) + protoAdapter.encodedSizeWithTag(2, c714602qe2.selling_points_bottom_bubble) + protoAdapter.encodedSizeWithTag(3, c714602qe2.selling_points_label_info) + ProtoAdapter.STRING.encodedSizeWithTag(255, c714602qe2.da_info) + c714602qe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C714602qe c714602qe) {
        }
    };
    public String da_info;
    public C02TX selling_points_bottom_bubble;
    public C02TX selling_points_header_bubble;
    public C02TX selling_points_label_info;

    public C714602qe() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C714702qf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
