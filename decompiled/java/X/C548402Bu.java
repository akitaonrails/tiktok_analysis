package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C548402Bu extends Message<C548402Bu, C02JC> {
    public static final ProtoAdapter<C548402Bu> ADAPTER = new ProtoAdapter<C548402Bu>() { // from class: X.0251
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C548402Bu decode(ProtoReader protoReader) {
            C548402Bu c548402Bu = new C548402Bu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c548402Bu.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c548402Bu.end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c548402Bu.subscribe_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c548402Bu.is_subscribed = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c548402Bu.text_to_be_subscribed = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c548402Bu.text_already_subscribed = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c548402Bu.text_already_ended = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c548402Bu.event_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c548402Bu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C548402Bu c548402Bu) {
            C548402Bu c548402Bu2 = c548402Bu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c548402Bu2.title);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c548402Bu2.end_time) + protoAdapter2.encodedSizeWithTag(3, c548402Bu2.subscribe_count) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c548402Bu2.is_subscribed) + protoAdapter.encodedSizeWithTag(5, c548402Bu2.text_to_be_subscribed) + protoAdapter.encodedSizeWithTag(6, c548402Bu2.text_already_subscribed) + protoAdapter.encodedSizeWithTag(7, c548402Bu2.text_already_ended) + protoAdapter2.encodedSizeWithTag(8, c548402Bu2.event_id) + c548402Bu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C548402Bu c548402Bu) {
            C548402Bu c548402Bu2 = c548402Bu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c548402Bu2.title);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c548402Bu2.end_time);
            protoAdapter2.encodeWithTag(protoWriter, 3, c548402Bu2.subscribe_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c548402Bu2.is_subscribed);
            protoAdapter.encodeWithTag(protoWriter, 5, c548402Bu2.text_to_be_subscribed);
            protoAdapter.encodeWithTag(protoWriter, 6, c548402Bu2.text_already_subscribed);
            protoAdapter.encodeWithTag(protoWriter, 7, c548402Bu2.text_already_ended);
            protoAdapter2.encodeWithTag(protoWriter, 8, c548402Bu2.event_id);
            protoWriter.writeBytes(c548402Bu2.unknownFields());
        }
    };
    public Long end_time;
    public Long event_id;
    public Boolean is_subscribed;
    public Long subscribe_count;
    public String text_already_ended;
    public String text_already_subscribed;
    public String text_to_be_subscribed;
    public String title;

    public C548402Bu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
