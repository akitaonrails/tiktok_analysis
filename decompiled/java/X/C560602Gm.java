package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C560602Gm extends Message<C560602Gm, C02MY> {
    public static final ProtoAdapter<C560602Gm> ADAPTER = new ProtoAdapter<C560602Gm>() { // from class: X.02Bp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C560602Gm decode(ProtoReader protoReader) {
            C560602Gm c560602Gm = new C560602Gm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c560602Gm.selling_tag = C547802Bo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c560602Gm.selling_points = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c560602Gm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C560602Gm c560602Gm) {
            C560602Gm c560602Gm2 = c560602Gm;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c560602Gm2.selling_points) + C547802Bo.ADAPTER.encodedSizeWithTag(2, c560602Gm2.selling_tag) + c560602Gm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C560602Gm c560602Gm) {
        }
    };
    public String selling_points;
    public C547802Bo selling_tag;

    public C560602Gm() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
