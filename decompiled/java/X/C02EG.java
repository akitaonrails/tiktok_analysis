package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EG extends Message<C02EG, C02QM> {
    public static final ProtoAdapter<C02EG> ADAPTER = new ProtoAdapter<C02EG>() { // from class: X.028t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EG decode(ProtoReader protoReader) {
            C02EG c02eg = new C02EG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 255) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02eg.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02eg.is_confirmed = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02eg.need_to_confirm_text = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02eg.text = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02eg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EG c02eg) {
            C02EG c02eg2 = c02eg;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c02eg2.text) + protoAdapter.encodedSizeWithTag(2, c02eg2.need_to_confirm_text) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02eg2.is_confirmed) + ProtoAdapter.STRING.encodedSizeWithTag(255, c02eg2.da_info) + c02eg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02EG c02eg) {
        }
    };
    public String da_info;
    public Boolean is_confirmed;
    public C5431029t need_to_confirm_text;
    public C5431029t text;

    public C02EG() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
