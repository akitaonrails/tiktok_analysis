package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EJ extends Message<C02EJ, C567102Iz> {
    public static final ProtoAdapter<C02EJ> ADAPTER = new ProtoAdapter<C02EJ>() { // from class: X.028V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EJ decode(ProtoReader protoReader) {
            C02EJ c02ej = new C02EJ();
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
                                        c02ej.has_updated_episode = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c02ej.updated_to_episode = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c02ej.current_episode = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c02ej.collect_vv = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02ej.play_vv = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ej;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EJ c02ej) {
            C02EJ c02ej2 = c02ej;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c02ej2.play_vv) + protoAdapter.encodedSizeWithTag(2, c02ej2.collect_vv) + protoAdapter.encodedSizeWithTag(3, c02ej2.current_episode) + protoAdapter.encodedSizeWithTag(4, c02ej2.updated_to_episode) + protoAdapter.encodedSizeWithTag(5, c02ej2.has_updated_episode) + c02ej2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EJ c02ej) {
            C02EJ c02ej2 = c02ej;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ej2.play_vv);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ej2.collect_vv);
            protoAdapter.encodeWithTag(protoWriter, 3, c02ej2.current_episode);
            protoAdapter.encodeWithTag(protoWriter, 4, c02ej2.updated_to_episode);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ej2.has_updated_episode);
            protoWriter.writeBytes(c02ej2.unknownFields());
        }
    };
    public Long collect_vv;
    public Long current_episode;
    public Long has_updated_episode;
    public Long play_vv;
    public Long updated_to_episode;

    public C02EJ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C567102Iz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
