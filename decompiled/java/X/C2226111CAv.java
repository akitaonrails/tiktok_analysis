package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226111CAv extends Message<C2226111CAv, C2226101CAu> {
    public static final ProtoAdapter<C2226111CAv> ADAPTER = new ProtoAdapter<C2226111CAv>() { // from class: X.1CAw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226111CAv decode(ProtoReader protoReader) {
            C2226111CAv c2226111CAv = new C2226111CAv();
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
                                        c2226111CAv.schema = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2226111CAv.extra_info = C2226141CAy.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2226111CAv.text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2226111CAv.action = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2226111CAv.style = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226111CAv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226111CAv c2226111CAv) {
            C2226111CAv c2226111CAv2 = c2226111CAv;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2226111CAv2.style) + protoAdapter.encodedSizeWithTag(2, c2226111CAv2.action);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2226111CAv2.text) + C2226141CAy.ADAPTER.encodedSizeWithTag(4, c2226111CAv2.extra_info) + protoAdapter2.encodedSizeWithTag(5, c2226111CAv2.schema) + c2226111CAv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2226111CAv c2226111CAv) {
        }
    };
    public Integer action;
    public C2226141CAy extra_info;
    public String schema;
    public Integer style;
    public String text;

    public C2226111CAv() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2226101CAu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
