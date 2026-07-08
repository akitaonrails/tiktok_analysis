package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EE extends Message<C02EE, C02Q7> {
    public static final ProtoAdapter<C02EE> ADAPTER = new ProtoAdapter<C02EE>() { // from class: X.028s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EE decode(ProtoReader protoReader) {
            C02EE c02ee = new C02EE();
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
                                    c02ee.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02ee.toast_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02ee.location = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02ee.desc_rich_text = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ee;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EE c02ee) {
            C02EE c02ee2 = c02ee;
            int iEncodedSizeWithTag = C5431029t.ADAPTER.encodedSizeWithTag(1, c02ee2.desc_rich_text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02ee2.location);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c02ee2.toast_text) + protoAdapter.encodedSizeWithTag(4, c02ee2.da_info) + c02ee2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02EE c02ee) {
        }
    };
    public String da_info;
    public C5431029t desc_rich_text;
    public Integer location;
    public String toast_text;

    public C02EE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Q7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
