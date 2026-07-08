package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C760002xy extends Message<C760002xy, C760102xz> {
    public static final ProtoAdapter<C760002xy> ADAPTER = new ProtoAdapter<C760002xy>() { // from class: X.02xx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C760002xy decode(ProtoReader protoReader) {
            C760002xy c760002xy = new C760002xy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c760002xy.biz_pack_source = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c760002xy.pack_scene = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c760002xy.tenant = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c760002xy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C760002xy c760002xy) {
            C760002xy c760002xy2 = c760002xy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c760002xy2.tenant) + protoAdapter.encodedSizeWithTag(2, c760002xy2.pack_scene) + protoAdapter.encodedSizeWithTag(3, c760002xy2.biz_pack_source) + c760002xy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C760002xy c760002xy) {
            C760002xy c760002xy2 = c760002xy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c760002xy2.tenant);
            protoAdapter.encodeWithTag(protoWriter, 2, c760002xy2.pack_scene);
            protoAdapter.encodeWithTag(protoWriter, 3, c760002xy2.biz_pack_source);
            protoWriter.writeBytes(c760002xy2.unknownFields());
        }
    };
    public String biz_pack_source;
    public String pack_scene;
    public String tenant;

    public C760002xy() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C760102xz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
