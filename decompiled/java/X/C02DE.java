package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DE extends Message<C02DE, C02KS> {
    public static final ProtoAdapter<C02DE> ADAPTER = new ProtoAdapter<C02DE>() { // from class: X.026D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DE decode(ProtoReader protoReader) {
            C02DE c02de = new C02DE();
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
                                        c02de.game_attr_info = C02E4.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02de.publisher_task_id = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c02de.post_from = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02de.game_tag_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02de.game_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02de;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DE c02de) {
            C02DE c02de2 = c02de;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c02de2.game_id) + protoAdapter.encodedSizeWithTag(2, c02de2.game_tag_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02de2.post_from) + protoAdapter.encodedSizeWithTag(4, c02de2.publisher_task_id) + C02E4.ADAPTER.encodedSizeWithTag(5, c02de2.game_attr_info) + c02de2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DE c02de) {
            C02DE c02de2 = c02de;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c02de2.game_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02de2.game_tag_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c02de2.post_from);
            protoAdapter.encodeWithTag(protoWriter, 4, c02de2.publisher_task_id);
            C02E4.ADAPTER.encodeWithTag(protoWriter, 5, c02de2.game_attr_info);
            protoWriter.writeBytes(c02de2.unknownFields());
        }
    };
    public C02E4 game_attr_info;
    public Long game_id;
    public Long game_tag_id;
    public Integer post_from;
    public Long publisher_task_id;

    public C02DE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
