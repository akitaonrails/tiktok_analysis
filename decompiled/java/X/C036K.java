package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.036K, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C036K extends Message<C036K, C036L> {
    public static final ProtoAdapter<C036K> ADAPTER = new ProtoAdapter<C036K>() { // from class: X.036J
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C036K decode(ProtoReader protoReader) {
            C036K c036k = new C036K();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c036k.market_sub_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c036k.id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c036k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C036K c036k) {
            C036K c036k2 = c036k;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c036k2.id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c036k2.market_sub_type) + c036k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C036K c036k) {
            C036K c036k2 = c036k;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c036k2.id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c036k2.market_sub_type);
            protoWriter.writeBytes(c036k2.unknownFields());
        }
    };
    public String id;
    public Integer market_sub_type;

    @Override // com.squareup.wire.Message
    public C036L newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C036K(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public C036K(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.market_sub_type = num;
    }
}
