package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C654702gz extends Message<C654702gz, C654802h0> {
    public static final ProtoAdapter<C654702gz> ADAPTER = new ProtoAdapter<C654702gz>() { // from class: X.02gy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C654702gz decode(ProtoReader protoReader) {
            C654702gz c654702gz = new C654702gz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c654702gz.recommendation_tag_creator_str = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c654702gz.recommendation_tag_consumer_str = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c654702gz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C654702gz c654702gz) {
            C654702gz c654702gz2 = c654702gz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c654702gz2.recommendation_tag_consumer_str) + protoAdapter.encodedSizeWithTag(2, c654702gz2.recommendation_tag_creator_str) + c654702gz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C654702gz c654702gz) {
            C654702gz c654702gz2 = c654702gz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c654702gz2.recommendation_tag_consumer_str);
            protoAdapter.encodeWithTag(protoWriter, 2, c654702gz2.recommendation_tag_creator_str);
            protoWriter.writeBytes(c654702gz2.unknownFields());
        }
    };
    public String recommendation_tag_consumer_str;
    public String recommendation_tag_creator_str;

    public C654702gz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C654802h0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
