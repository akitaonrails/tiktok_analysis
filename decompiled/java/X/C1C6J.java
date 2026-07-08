package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6J extends Message<C1C6J, C1C6K> {
    public static final ProtoAdapter<C1C6J> ADAPTER = new ProtoAdapter<C1C6J>() { // from class: X.1C6I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C6J decode(ProtoReader protoReader) {
            C1C6J c1c6j = new C1C6J();
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
                                    c1c6j.text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c6j.room_schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c6j.live_icon = C029C.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c6j.room_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c6j;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C6J c1c6j) {
            C1C6J c1c6j2 = c1c6j;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c6j2.room_id) + C029C.ADAPTER.encodedSizeWithTag(2, c1c6j2.live_icon) + protoAdapter.encodedSizeWithTag(3, c1c6j2.room_schema) + protoAdapter.encodedSizeWithTag(4, c1c6j2.text) + c1c6j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C6J c1c6j) {
        }
    };
    public C029C live_icon;
    public String room_id;
    public String room_schema;
    public String text;

    public C1C6J() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C6K newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
