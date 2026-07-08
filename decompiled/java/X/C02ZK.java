package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ZK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02ZK extends Message<C02ZK, C02ZL> {
    public static final ProtoAdapter<C02ZK> ADAPTER = new ProtoAdapter<C02ZK>() { // from class: X.02ZJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02ZK decode(ProtoReader protoReader) {
            C02ZK c02zk = new C02ZK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02zk.subs_status = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02zk.sub_only_video_gates = C666002io.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02zk.should_show_paywall = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02zk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02ZK c02zk) {
            C02ZK c02zk2 = c02zk;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c02zk2.should_show_paywall) + C666002io.ADAPTER.encodedSizeWithTag(2, c02zk2.sub_only_video_gates) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02zk2.subs_status) + c02zk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02ZK c02zk) {
            C02ZK c02zk2 = c02zk;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02zk2.should_show_paywall);
            C666002io.ADAPTER.encodeWithTag(protoWriter, 2, c02zk2.sub_only_video_gates);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c02zk2.subs_status);
            protoWriter.writeBytes(c02zk2.unknownFields());
        }
    };
    public Boolean should_show_paywall;
    public C666002io sub_only_video_gates;
    public Integer subs_status;

    public C02ZK() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02ZL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
