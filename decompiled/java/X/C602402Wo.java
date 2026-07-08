package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C602402Wo extends Message<C602402Wo, C602502Wp> {
    public static final ProtoAdapter<C602402Wo> ADAPTER = new ProtoAdapter<C602402Wo>() { // from class: X.02Wn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C602402Wo decode(ProtoReader protoReader) {
            C602402Wo c602402Wo = new C602402Wo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c602402Wo.desc = C5431029t.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c602402Wo.title = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c602402Wo.schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c602402Wo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C602402Wo c602402Wo) {
            C602402Wo c602402Wo2 = c602402Wo;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c602402Wo2.schema);
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c602402Wo2.title) + protoAdapter.encodedSizeWithTag(3, c602402Wo2.desc) + c602402Wo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C602402Wo c602402Wo) {
        }
    };
    public C5431029t desc;
    public String schema;
    public C5431029t title;

    public C602402Wo() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C602502Wp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
