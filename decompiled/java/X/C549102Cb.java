package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549102Cb extends Message<C549102Cb, C566702Iv> {
    public static final ProtoAdapter<C549102Cb> ADAPTER = new ProtoAdapter<C549102Cb>() { // from class: X.025G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549102Cb decode(ProtoReader protoReader) {
            C549102Cb c549102Cb = new C549102Cb();
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
                                        c549102Cb.live_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c549102Cb.feed_show_time = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c549102Cb.topview_valid = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c549102Cb.end_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c549102Cb.start_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549102Cb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549102Cb c549102Cb) {
            C549102Cb c549102Cb2 = c549102Cb;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c549102Cb2.start_time) + protoAdapter.encodedSizeWithTag(2, c549102Cb2.end_time) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c549102Cb2.topview_valid) + ProtoAdapter.INT32.encodedSizeWithTag(4, c549102Cb2.feed_show_time) + ProtoAdapter.STRING.encodedSizeWithTag(5, c549102Cb2.live_info) + c549102Cb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C549102Cb c549102Cb) {
            C549102Cb c549102Cb2 = c549102Cb;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c549102Cb2.start_time);
            protoAdapter.encodeWithTag(protoWriter, 2, c549102Cb2.end_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c549102Cb2.topview_valid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c549102Cb2.feed_show_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c549102Cb2.live_info);
            protoWriter.writeBytes(c549102Cb2.unknownFields());
        }
    };
    public Long end_time;
    public Integer feed_show_time;
    public String live_info;
    public Long start_time;
    public Boolean topview_valid;

    public C549102Cb() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C566702Iv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
