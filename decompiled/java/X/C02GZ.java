package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GZ extends Message<C02GZ, C02NB> {
    public static final ProtoAdapter<C02GZ> ADAPTER = new ProtoAdapter<C02GZ>() { // from class: X.02GY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GZ decode(ProtoReader protoReader) {
            C02GZ c02gz = new C02GZ();
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
                                    c02gz.background_color = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02gz.text_font = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02gz.text_color = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02gz.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GZ c02gz) {
            C02GZ c02gz2 = c02gz;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c02gz2.text);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02gz2.text_color) + protoAdapter.encodedSizeWithTag(3, c02gz2.text_font) + protoAdapter.encodedSizeWithTag(4, c02gz2.background_color) + c02gz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GZ c02gz) {
        }
    };
    public Integer background_color;
    public String text;
    public Integer text_color;
    public Integer text_font;

    public C02GZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
