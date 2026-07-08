package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549202Cc extends Message<C549202Cc, C02JW> {
    public static final ProtoAdapter<C549202Cc> ADAPTER = new ProtoAdapter<C549202Cc>() { // from class: X.025J
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549202Cc decode(ProtoReader protoReader) {
            C549202Cc c549202Cc = new C549202Cc();
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
                                        c549202Cc.feed_recall_type = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c549202Cc.recall_uid = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c549202Cc.source = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c549202Cc.feed_do_aweme = C5186020i.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c549202Cc.feed_do_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549202Cc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549202Cc c549202Cc) {
            C549202Cc c549202Cc2 = c549202Cc;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c549202Cc2.feed_do_type) + C5186020i.ADAPTER.encodedSizeWithTag(2, c549202Cc2.feed_do_aweme) + protoAdapter.encodedSizeWithTag(3, c549202Cc2.source) + ProtoAdapter.INT64.encodedSizeWithTag(4, c549202Cc2.recall_uid) + protoAdapter.encodedSizeWithTag(5, c549202Cc2.feed_recall_type) + c549202Cc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C549202Cc c549202Cc) {
            C549202Cc c549202Cc2 = c549202Cc;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c549202Cc2.feed_do_type);
            C5186020i.ADAPTER.encodeWithTag(protoWriter, 2, c549202Cc2.feed_do_aweme);
            protoAdapter.encodeWithTag(protoWriter, 3, c549202Cc2.source);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c549202Cc2.recall_uid);
            protoAdapter.encodeWithTag(protoWriter, 5, c549202Cc2.feed_recall_type);
            protoWriter.writeBytes(c549202Cc2.unknownFields());
        }
    };
    public C5186020i feed_do_aweme;
    public Integer feed_do_type;
    public Integer feed_recall_type;
    public Long recall_uid;
    public Integer source;

    public C549202Cc() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
