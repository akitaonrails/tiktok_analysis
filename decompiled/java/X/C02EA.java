package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EA extends Message<C02EA, C02ND> {
    public static final ProtoAdapter<C02EA> ADAPTER = new ProtoAdapter<C02EA>() { // from class: X.027v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EA decode(ProtoReader protoReader) {
            C02EA c02ea = new C02EA();
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
                                    c02ea.is_selected = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c02ea.period_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02ea.period_unit = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02ea.period = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ea;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EA c02ea) {
            C02EA c02ea2 = c02ea;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02ea2.period) + protoAdapter.encodedSizeWithTag(2, c02ea2.period_unit) + ProtoAdapter.STRING.encodedSizeWithTag(3, c02ea2.period_text) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c02ea2.is_selected) + c02ea2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02EA c02ea) {
        }
    };
    public Boolean is_selected;
    public Integer period;
    public String period_text;
    public Integer period_unit;

    public C02EA() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02ND newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
