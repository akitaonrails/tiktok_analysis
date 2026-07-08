package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02VX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02VX extends Message<C02VX, C02VY> {
    public static final ProtoAdapter<C02VX> ADAPTER = new ProtoAdapter<C02VX>() { // from class: X.02VW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02VX decode(ProtoReader protoReader) {
            C02VX c02vx = new C02VX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 255) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02vx.da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02vx.type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02vx.description_text = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02vx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02VX c02vx) {
            C02VX c02vx2 = c02vx;
            return C5431029t.ADAPTER.encodedSizeWithTag(1, c02vx2.description_text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02vx2.type) + ProtoAdapter.STRING.encodedSizeWithTag(255, c02vx2.da_info) + c02vx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02VX c02vx) {
        }
    };
    public String da_info;
    public C5431029t description_text;
    public Integer type;

    public C02VX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02VY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
