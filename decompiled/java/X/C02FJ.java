package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FJ extends Message<C02FJ, C585102Px> {
    public static final ProtoAdapter<C02FJ> ADAPTER = new ProtoAdapter<C02FJ>() { // from class: X.029c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FJ decode(ProtoReader protoReader) {
            C02FJ c02fj = new C02FJ();
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
                                    c02fj.template = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02fj.page_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fj.region = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02fj.biz_line = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FJ c02fj) {
            C02FJ c02fj2 = c02fj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02fj2.biz_line) + protoAdapter.encodedSizeWithTag(2, c02fj2.region) + protoAdapter.encodedSizeWithTag(3, c02fj2.page_name) + ProtoAdapter.INT32.encodedSizeWithTag(4, c02fj2.template) + c02fj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FJ c02fj) {
        }
    };
    public String biz_line;
    public String page_name;
    public String region;
    public Integer template;

    public C02FJ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C585102Px newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
