package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ER, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02ER extends Message<C02ER, C570402Kg> {
    public static final ProtoAdapter<C02ER> ADAPTER = new ProtoAdapter<C02ER>() { // from class: X.027p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02ER decode(ProtoReader protoReader) {
            C02ER c02er = new C02ER();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02er.link_txt = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02er.link_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02er.link_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02er.banner_txt = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02er.banner_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02er;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02ER c02er) {
            C02ER c02er2 = c02er;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02er2.banner_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02er2.banner_txt) + protoAdapter.encodedSizeWithTag(3, c02er2.link_type) + protoAdapter2.encodedSizeWithTag(4, c02er2.link_url) + protoAdapter2.encodedSizeWithTag(5, c02er2.link_txt) + c02er2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02ER c02er) {
            C02ER c02er2 = c02er;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02er2.banner_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02er2.banner_txt);
            protoAdapter.encodeWithTag(protoWriter, 3, c02er2.link_type);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02er2.link_url);
            protoAdapter2.encodeWithTag(protoWriter, 5, c02er2.link_txt);
            protoWriter.writeBytes(c02er2.unknownFields());
        }
    };
    public String banner_txt;
    public Integer banner_type;
    public String link_txt;
    public Integer link_type;
    public String link_url;

    public C02ER() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C570402Kg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
