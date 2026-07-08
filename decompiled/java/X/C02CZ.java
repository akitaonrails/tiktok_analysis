package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CZ extends Message<C02CZ, C02P0> {
    public static final ProtoAdapter<C02CZ> ADAPTER = new ProtoAdapter<C02CZ>() { // from class: X.025w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CZ decode(ProtoReader protoReader) {
            C02CZ c02cz = new C02CZ();
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
                                    c02cz.countdown_text_ec_richtext = C5431029t.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02cz.countdown_text = AnonymousClass0241.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02cz.countdown_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02cz.time_control_second = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CZ c02cz) {
            C02CZ c02cz2 = c02cz;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c02cz2.time_control_second) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02cz2.countdown_type) + AnonymousClass0241.ADAPTER.encodedSizeWithTag(3, c02cz2.countdown_text) + C5431029t.ADAPTER.encodedSizeWithTag(4, c02cz2.countdown_text_ec_richtext) + c02cz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02CZ c02cz) {
        }
    };
    public AnonymousClass0241 countdown_text;
    public C5431029t countdown_text_ec_richtext;
    public Integer countdown_type;
    public Long time_control_second;

    public C02CZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02P0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
