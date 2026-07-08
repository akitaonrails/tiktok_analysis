package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6Z extends Message<C1C6Z, C1C6Y> {
    public static final ProtoAdapter<C1C6Z> ADAPTER = new ProtoAdapter<C1C6Z>() { // from class: X.1C6a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C6Z decode(ProtoReader protoReader) {
            C1C6Z c1c6z = new C1C6Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1c6z.xl_ec_rich_text = C2224881C6c.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1c6z.image = C02U1.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1c6z.ec_rich_text = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c6z.rich_block_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c6z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C6Z c1c6z) {
            C1C6Z c1c6z2 = c1c6z;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1c6z2.rich_block_type) + C5431029t.ADAPTER.encodedSizeWithTag(2, c1c6z2.ec_rich_text) + C02U1.ADAPTER.encodedSizeWithTag(3, c1c6z2.image) + C2224881C6c.ADAPTER.encodedSizeWithTag(4, c1c6z2.xl_ec_rich_text) + c1c6z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C6Z c1c6z) {
        }
    };
    public C5431029t ec_rich_text;
    public C02U1 image;
    public Integer rich_block_type;
    public C2224881C6c xl_ec_rich_text;

    public C1C6Z() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C6Y newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
