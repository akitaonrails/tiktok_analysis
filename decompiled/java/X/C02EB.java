package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EB extends Message<C02EB, C02O2> {
    public static final ProtoAdapter<C02EB> ADAPTER = new ProtoAdapter<C02EB>() { // from class: X.028n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EB decode(ProtoReader protoReader) {
            C02EB c02eb = new C02EB();
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
                                    c02eb.prefix = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02eb.line_break = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02eb.input_type = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02eb.max_length = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02eb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EB c02eb) {
            C02EB c02eb2 = c02eb;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c02eb2.max_length) + protoAdapter.encodedSizeWithTag(2, c02eb2.input_type) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02eb2.line_break) + ProtoAdapter.STRING.encodedSizeWithTag(4, c02eb2.prefix) + c02eb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02EB c02eb) {
        }
    };
    public Long input_type;
    public Boolean line_break;
    public Long max_length;
    public String prefix;

    public C02EB() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02O2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
