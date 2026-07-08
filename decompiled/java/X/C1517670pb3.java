package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517670pb3 extends Message<C1517670pb3, C1517680pb4> {
    public static final ProtoAdapter<C1517670pb3> ADAPTER = new ProtoAdapter<C1517670pb3>() { // from class: X.0pb2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517670pb3 decode(ProtoReader protoReader) {
            C1517670pb3 c1517670pb3 = new C1517670pb3();
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
                                    c1517670pb3.background_gecko_id = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1517670pb3.background_img_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1517670pb3.gradient_img_data = C1517640pb0.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1517670pb3.background_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517670pb3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517670pb3 c1517670pb3) {
            C1517670pb3 c1517670pb32 = c1517670pb3;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c1517670pb32.background_type) + C1517640pb0.ADAPTER.encodedSizeWithTag(2, c1517670pb32.gradient_img_data);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1517670pb32.background_img_url) + protoAdapter.encodedSizeWithTag(4, c1517670pb32.background_gecko_id) + c1517670pb32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517670pb3 c1517670pb3) {
            C1517670pb3 c1517670pb32 = c1517670pb3;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1517670pb32.background_type);
            C1517640pb0.ADAPTER.encodeWithTag(protoWriter, 2, c1517670pb32.gradient_img_data);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, c1517670pb32.background_img_url);
            protoAdapter.encodeWithTag(protoWriter, 4, c1517670pb32.background_gecko_id);
            protoWriter.writeBytes(c1517670pb32.unknownFields());
        }
    };
    public String background_gecko_id;
    public String background_img_url;
    public Integer background_type;
    public C1517640pb0 gradient_img_data;

    public C1517670pb3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517680pb4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
