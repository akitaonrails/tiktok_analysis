package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02RD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02RD extends Message<C02RD, C02RE> {
    public static final ProtoAdapter<C02RD> ADAPTER = new ProtoAdapter<C02RD>() { // from class: X.02RC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02RD decode(ProtoReader protoReader) {
            C02RD c02rd = new C02RD();
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
                                    c02rd.creator_analytics_entrance_status = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02rd.show_analytics_data_entrance = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02rd.item_analytics_data_status = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02rd.creator_analytics_data_status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02rd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02RD c02rd) {
            C02RD c02rd2 = c02rd;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02rd2.creator_analytics_data_status) + protoAdapter.encodedSizeWithTag(2, c02rd2.item_analytics_data_status) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02rd2.show_analytics_data_entrance) + protoAdapter.encodedSizeWithTag(4, c02rd2.creator_analytics_entrance_status) + c02rd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02RD c02rd) {
            C02RD c02rd2 = c02rd;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02rd2.creator_analytics_data_status);
            protoAdapter.encodeWithTag(protoWriter, 2, c02rd2.item_analytics_data_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c02rd2.show_analytics_data_entrance);
            protoAdapter.encodeWithTag(protoWriter, 4, c02rd2.creator_analytics_entrance_status);
            protoWriter.writeBytes(c02rd2.unknownFields());
        }
    };
    public Integer creator_analytics_data_status;
    public Integer creator_analytics_entrance_status;
    public Integer item_analytics_data_status;
    public Boolean show_analytics_data_entrance;

    public C02RD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02RE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
