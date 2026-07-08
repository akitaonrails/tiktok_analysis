package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C706002pG extends Message<C706002pG, C705902pF> {
    public static final ProtoAdapter<C706002pG> ADAPTER = new ProtoAdapter<C706002pG>() { // from class: X.02pH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C706002pG decode(ProtoReader protoReader) {
            C706002pG c706002pG = new C706002pG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c706002pG.countdown_ec_rich_text = C5431029t.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c706002pG.countdown_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c706002pG.time_control_second = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c706002pG;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C706002pG c706002pG) {
            C706002pG c706002pG2 = c706002pG;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c706002pG2.time_control_second) + ProtoAdapter.INT32.encodedSizeWithTag(2, c706002pG2.countdown_type) + C5431029t.ADAPTER.encodedSizeWithTag(3, c706002pG2.countdown_ec_rich_text) + c706002pG2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C706002pG c706002pG) {
        }
    };
    public C5431029t countdown_ec_rich_text;
    public Integer countdown_type;
    public Long time_control_second;

    public C706002pG() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C705902pF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
