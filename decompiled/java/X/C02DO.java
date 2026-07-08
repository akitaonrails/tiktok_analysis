package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DO extends Message<C02DO, C583702Pj> {
    public static final ProtoAdapter<C02DO> ADAPTER = new ProtoAdapter<C02DO>() { // from class: X.0273
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DO decode(ProtoReader protoReader) {
            C02DO c02do = new C02DO();
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
                                    c02do.discount_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02do.discount_info = C023J.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02do.discount_text = C02GZ.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02do.discount_title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02do;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DO c02do) {
            C02DO c02do2 = c02do;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02do2.discount_title) + C02GZ.ADAPTER.encodedSizeWithTag(2, c02do2.discount_text) + C023J.ADAPTER.encodedSizeWithTag(3, c02do2.discount_info) + ProtoAdapter.INT32.encodedSizeWithTag(4, c02do2.discount_type) + c02do2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02DO c02do) {
        }
    };
    public C023J discount_info;
    public C02GZ discount_text;
    public String discount_title;
    public Integer discount_type;

    public C02DO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C583702Pj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
