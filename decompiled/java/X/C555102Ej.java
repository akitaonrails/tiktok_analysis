package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C555102Ej extends Message<C555102Ej, C574502Lv> {
    public static final ProtoAdapter<C555102Ej> ADAPTER = new ProtoAdapter<C555102Ej>() { // from class: X.028L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C555102Ej decode(ProtoReader protoReader) {
            C555102Ej c555102Ej = new C555102Ej();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c555102Ej.margin = C02F5.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c555102Ej.padding = C02F5.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c555102Ej.height = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c555102Ej;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C555102Ej c555102Ej) {
            C555102Ej c555102Ej2 = c555102Ej;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c555102Ej2.height);
            ProtoAdapter<C02F5> protoAdapter = C02F5.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c555102Ej2.padding) + protoAdapter.encodedSizeWithTag(3, c555102Ej2.margin) + c555102Ej2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C555102Ej c555102Ej) {
            C555102Ej c555102Ej2 = c555102Ej;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c555102Ej2.height);
            ProtoAdapter<C02F5> protoAdapter = C02F5.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c555102Ej2.padding);
            protoAdapter.encodeWithTag(protoWriter, 3, c555102Ej2.margin);
            protoWriter.writeBytes(c555102Ej2.unknownFields());
        }
    };
    public Integer height;
    public C02F5 margin;
    public C02F5 padding;

    public C555102Ej() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C574502Lv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
