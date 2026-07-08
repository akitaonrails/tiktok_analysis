package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02T6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02T6 extends Message<C02T6, C02T8> {
    public static final ProtoAdapter<C02T6> ADAPTER = new ProtoAdapter<C02T6>() { // from class: X.02T7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02T6 decode(ProtoReader protoReader) {
            C02T6 c02t6 = new C02T6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02t6.action = C696002ne.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02t6.content = C607302Yl.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02t6.head_icon = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02t6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02T6 c02t6) {
            C02T6 c02t62 = c02t6;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02t62.head_icon) + C607302Yl.ADAPTER.encodedSizeWithTag(2, c02t62.content) + C696002ne.ADAPTER.encodedSizeWithTag(3, c02t62.action) + c02t62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02T6 c02t6) {
            C02T6 c02t62 = c02t6;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02t62.head_icon);
            C607302Yl.ADAPTER.encodeWithTag(protoWriter, 2, c02t62.content);
            C696002ne.ADAPTER.encodeWithTag(protoWriter, 3, c02t62.action);
            protoWriter.writeBytes(c02t62.unknownFields());
        }
    };
    public C696002ne action;
    public C607302Yl content;
    public String head_icon;

    public C02T6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02T8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
