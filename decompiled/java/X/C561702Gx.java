package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C561702Gx extends Message<C561702Gx, C02QC> {
    public static final ProtoAdapter<C561702Gx> ADAPTER = new ProtoAdapter<C561702Gx>() { // from class: X.02AN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C561702Gx decode(ProtoReader protoReader) {
            C561702Gx c561702Gx = new C561702Gx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c561702Gx.encrypt_code = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c561702Gx.hash_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c561702Gx.mask_code = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c561702Gx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C561702Gx c561702Gx) {
            C561702Gx c561702Gx2 = c561702Gx;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c561702Gx2.mask_code) + ProtoAdapter.INT64.encodedSizeWithTag(2, c561702Gx2.hash_id) + protoAdapter.encodedSizeWithTag(3, c561702Gx2.encrypt_code) + c561702Gx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C561702Gx c561702Gx) {
        }
    };
    public String encrypt_code;
    public Long hash_id;
    public String mask_code;

    public C561702Gx() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
