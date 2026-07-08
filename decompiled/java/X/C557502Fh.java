package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557502Fh extends Message<C557502Fh, C02II> {
    public static final ProtoAdapter<C557502Fh> ADAPTER = new ProtoAdapter<C557502Fh>() { // from class: X.028R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557502Fh decode(ProtoReader protoReader) {
            C557502Fh c557502Fh = new C557502Fh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c557502Fh.region = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c557502Fh.end_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c557502Fh.target_vv = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557502Fh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557502Fh c557502Fh) {
            C557502Fh c557502Fh2 = c557502Fh;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c557502Fh2.target_vv) + protoAdapter.encodedSizeWithTag(2, c557502Fh2.end_time) + ProtoAdapter.STRING.encodedSizeWithTag(3, c557502Fh2.region) + c557502Fh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C557502Fh c557502Fh) {
            C557502Fh c557502Fh2 = c557502Fh;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c557502Fh2.target_vv);
            protoAdapter.encodeWithTag(protoWriter, 2, c557502Fh2.end_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c557502Fh2.region);
            protoWriter.writeBytes(c557502Fh2.unknownFields());
        }
    };
    public Long end_time;
    public String region;
    public Long target_vv;

    public C557502Fh() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02II newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
