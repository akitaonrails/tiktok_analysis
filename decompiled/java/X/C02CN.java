package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CN extends Message<C02CN, C02J5> {
    public static final ProtoAdapter<C02CN> ADAPTER = new ProtoAdapter<C02CN>() { // from class: X.025Q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CN decode(ProtoReader protoReader) {
            C02CN c02cn = new C02CN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 7) {
                                        if (iNextTag != 8) {
                                            if (iNextTag != 9) {
                                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                            } else {
                                                c02cn.source_height = ProtoAdapter.DOUBLE.decode(protoReader);
                                            }
                                        } else {
                                            c02cn.source_width = ProtoAdapter.DOUBLE.decode(protoReader);
                                        }
                                    } else {
                                        c02cn.alignment = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02cn.text_language = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02cn.bg_color = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02cn.text_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02cn.text_size = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CN c02cn) {
            C02CN c02cn2 = c02cn;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02cn2.text_size);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02cn2.text_color) + protoAdapter2.encodedSizeWithTag(3, c02cn2.bg_color) + protoAdapter2.encodedSizeWithTag(4, c02cn2.text_language) + protoAdapter.encodedSizeWithTag(7, c02cn2.alignment);
            ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, c02cn2.source_width) + protoAdapter3.encodedSizeWithTag(9, c02cn2.source_height) + c02cn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CN c02cn) {
            C02CN c02cn2 = c02cn;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02cn2.text_size);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02cn2.text_color);
            protoAdapter2.encodeWithTag(protoWriter, 3, c02cn2.bg_color);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02cn2.text_language);
            protoAdapter.encodeWithTag(protoWriter, 7, c02cn2.alignment);
            ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
            protoAdapter3.encodeWithTag(protoWriter, 8, c02cn2.source_width);
            protoAdapter3.encodeWithTag(protoWriter, 9, c02cn2.source_height);
            protoWriter.writeBytes(c02cn2.unknownFields());
        }
    };
    public Integer alignment;
    public String bg_color;
    public Double source_height;
    public Double source_width;
    public String text_color;
    public String text_language;
    public Integer text_size;

    public C02CN() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02J5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
