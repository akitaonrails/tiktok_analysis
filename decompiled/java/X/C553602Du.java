package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C553602Du extends Message<C553602Du, C02IF> {
    public static final ProtoAdapter<C553602Du> ADAPTER = new ProtoAdapter<C553602Du>() { // from class: X.027c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C553602Du decode(ProtoReader protoReader) {
            C553602Du c553602Du = new C553602Du();
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
                                    c553602Du.padding = C02F5.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c553602Du.margin = C02F5.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c553602Du.text_style = C02D5.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c553602Du.content = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c553602Du;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C553602Du c553602Du) {
            C553602Du c553602Du2 = c553602Du;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c553602Du2.content) + C02D5.ADAPTER.encodedSizeWithTag(2, c553602Du2.text_style);
            ProtoAdapter<C02F5> protoAdapter = C02F5.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c553602Du2.margin) + protoAdapter.encodedSizeWithTag(4, c553602Du2.padding) + c553602Du2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C553602Du c553602Du) {
            C553602Du c553602Du2 = c553602Du;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c553602Du2.content);
            C02D5.ADAPTER.encodeWithTag(protoWriter, 2, c553602Du2.text_style);
            ProtoAdapter<C02F5> protoAdapter = C02F5.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c553602Du2.margin);
            protoAdapter.encodeWithTag(protoWriter, 4, c553602Du2.padding);
            protoWriter.writeBytes(c553602Du2.unknownFields());
        }
    };
    public String content;
    public C02F5 margin;
    public C02F5 padding;
    public C02D5 text_style;

    public C553602Du() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
