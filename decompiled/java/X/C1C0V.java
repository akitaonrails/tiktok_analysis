package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C0V extends Message<C1C0V, C1C0W> {
    public static final ProtoAdapter<C1C0V> ADAPTER = new ProtoAdapter<C1C0V>() { // from class: X.1C0U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C0V decode(ProtoReader protoReader) {
            C1C0V c1c0v = new C1C0V();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1c0v.ecom_count = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1c0v.ad_count = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1c0v.normal_count = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c0v;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C0V c1c0v) {
            C1C0V c1c0v2 = c1c0v;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1c0v2.normal_count) + protoAdapter.encodedSizeWithTag(2, c1c0v2.ad_count) + protoAdapter.encodedSizeWithTag(3, c1c0v2.ecom_count) + c1c0v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C0V c1c0v) {
            C1C0V c1c0v2 = c1c0v;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c0v2.normal_count);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c0v2.ad_count);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c0v2.ecom_count);
            protoWriter.writeBytes(c1c0v2.unknownFields());
        }
    };
    public Long ad_count;
    public Long ecom_count;
    public Long normal_count;

    @Override // com.squareup.wire.Message
    public C1C0W newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1C0V(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public C1C0V(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.normal_count = l;
        this.ad_count = l2;
        this.ecom_count = l3;
    }
}
