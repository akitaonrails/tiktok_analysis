package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223641C1i extends Message<C2223641C1i, C2223651C1j> {
    public static final ProtoAdapter<C2223641C1i> ADAPTER = new ProtoAdapter<C2223641C1i>() { // from class: X.1C1h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223641C1i decode(ProtoReader protoReader) {
            C2223641C1i c2223641C1i = new C2223641C1i();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2223641C1i.level = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2223641C1i.category_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223641C1i.category_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223641C1i;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223641C1i c2223641C1i) {
            C2223641C1i c2223641C1i2 = c2223641C1i;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2223641C1i2.category_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2223641C1i2.category_name) + ProtoAdapter.INT32.encodedSizeWithTag(3, c2223641C1i2.level) + c2223641C1i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223641C1i c2223641C1i) {
        }
    };
    public Long category_id;
    public String category_name;
    public Integer level;

    public C2223641C1i() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223651C1j newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
