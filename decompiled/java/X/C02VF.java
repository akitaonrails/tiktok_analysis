package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02VF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02VF extends Message<C02VF, C02VG> {
    public static final ProtoAdapter<C02VF> ADAPTER = new ProtoAdapter<C02VF>() { // from class: X.02VE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02VF decode(ProtoReader protoReader) {
            C02VF c02vf = new C02VF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02vf.rec_extra = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02vf.yield_to_share_in = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c02vf.reach_threshold = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02vf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02VF c02vf) {
            C02VF c02vf2 = c02vf;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c02vf2.reach_threshold) + protoAdapter.encodedSizeWithTag(2, c02vf2.yield_to_share_in) + ProtoAdapter.STRING.encodedSizeWithTag(3, c02vf2.rec_extra) + c02vf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02VF c02vf) {
            C02VF c02vf2 = c02vf;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c02vf2.reach_threshold);
            protoAdapter.encodeWithTag(protoWriter, 2, c02vf2.yield_to_share_in);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c02vf2.rec_extra);
            protoWriter.writeBytes(c02vf2.unknownFields());
        }
    };
    public Boolean reach_threshold;
    public String rec_extra;
    public Boolean yield_to_share_in;

    public C02VF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02VG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
