package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HG extends Message<C02HG, C02JY> {
    public static final ProtoAdapter<C02HG> ADAPTER = new ProtoAdapter<C02HG>() { // from class: X.02HH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HG decode(ProtoReader protoReader) {
            C02HG c02hg = new C02HG();
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
                                    c02hg.background_gecko_id = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02hg.background_img_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02hg.gradient_img_data = C615902aj.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02hg.background_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HG c02hg) {
            C02HG c02hg2 = c02hg;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02hg2.background_type) + C615902aj.ADAPTER.encodedSizeWithTag(2, c02hg2.gradient_img_data);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c02hg2.background_img_url) + protoAdapter.encodedSizeWithTag(4, c02hg2.background_gecko_id) + c02hg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02HG c02hg) {
            C02HG c02hg2 = c02hg;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02hg2.background_type);
            C615902aj.ADAPTER.encodeWithTag(protoWriter, 2, c02hg2.gradient_img_data);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, c02hg2.background_img_url);
            protoAdapter.encodeWithTag(protoWriter, 4, c02hg2.background_gecko_id);
            protoWriter.writeBytes(c02hg2.unknownFields());
        }
    };
    public String background_gecko_id;
    public String background_img_url;
    public Integer background_type;
    public C615902aj gradient_img_data;

    public C02HG() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
