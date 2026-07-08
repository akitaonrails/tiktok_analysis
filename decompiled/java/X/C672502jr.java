package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C672502jr extends Message<C672502jr, C672602js> {
    public static final ProtoAdapter<C672502jr> ADAPTER = new ProtoAdapter<C672502jr>() { // from class: X.02jq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C672502jr decode(ProtoReader protoReader) {
            C672502jr c672502jr = new C672502jr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c672502jr.label_type = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c672502jr.related_room_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c672502jr.label_starling_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c672502jr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C672502jr c672502jr) {
            C672502jr c672502jr2 = c672502jr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c672502jr2.label_starling_key) + ProtoAdapter.INT64.encodedSizeWithTag(2, c672502jr2.related_room_id) + protoAdapter.encodedSizeWithTag(3, c672502jr2.label_type) + c672502jr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C672502jr c672502jr) {
            C672502jr c672502jr2 = c672502jr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c672502jr2.label_starling_key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c672502jr2.related_room_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c672502jr2.label_type);
            protoWriter.writeBytes(c672502jr2.unknownFields());
        }
    };
    public String label_starling_key;
    public String label_type;
    public Long related_room_id;

    public C672502jr() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C672602js newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
