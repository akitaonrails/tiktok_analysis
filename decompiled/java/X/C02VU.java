package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02VU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02VU extends Message<C02VU, C02VV> {
    public static final ProtoAdapter<C02VU> ADAPTER = new ProtoAdapter<C02VU>() { // from class: X.02VT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02VU decode(ProtoReader protoReader) {
            C02VU c02vu = new C02VU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02vu.desc_rich_text = C5431029t.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02vu.desc_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02vu.desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02vu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02VU c02vu) {
            C02VU c02vu2 = c02vu;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02vu2.desc) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02vu2.desc_type) + C5431029t.ADAPTER.encodedSizeWithTag(3, c02vu2.desc_rich_text) + c02vu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02VU c02vu) {
        }
    };
    public String desc;
    public C5431029t desc_rich_text;
    public Integer desc_type;

    public C02VU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02VV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
