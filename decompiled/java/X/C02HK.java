package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HK extends Message<C02HK, C575102Mb> {
    public static final ProtoAdapter<C02HK> ADAPTER = new ProtoAdapter<C02HK>() { // from class: X.02HL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HK decode(ProtoReader protoReader) {
            C02HK c02hk = new C02HK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 200) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02hk.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02hk.button_action = C611902a5.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02hk.dialog_button_style = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02hk.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HK c02hk) {
            C02HK c02hk2 = c02hk;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02hk2.text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02hk2.dialog_button_style) + C611902a5.ADAPTER.encodedSizeWithTag(3, c02hk2.button_action) + protoAdapter.encodedSizeWithTag(200, c02hk2.da_info) + c02hk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02HK c02hk) {
        }
    };
    public C611902a5 button_action;
    public String da_info;
    public Integer dialog_button_style;
    public String text;

    public C02HK() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C575102Mb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
