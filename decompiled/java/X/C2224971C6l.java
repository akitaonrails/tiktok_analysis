package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224971C6l extends Message<C2224971C6l, C2224981C6m> {
    public static final ProtoAdapter<C2224971C6l> ADAPTER = new ProtoAdapter<C2224971C6l>() { // from class: X.1C6k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224971C6l decode(ProtoReader protoReader) {
            C2224971C6l c2224971C6l = new C2224971C6l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2224971C6l.countdown_ec_rich_text = C5431029t.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2224971C6l.countdown_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2224971C6l.time_control_second = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224971C6l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224971C6l c2224971C6l) {
            C2224971C6l c2224971C6l2 = c2224971C6l;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2224971C6l2.time_control_second) + ProtoAdapter.INT32.encodedSizeWithTag(2, c2224971C6l2.countdown_type) + C5431029t.ADAPTER.encodedSizeWithTag(3, c2224971C6l2.countdown_ec_rich_text) + c2224971C6l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224971C6l c2224971C6l) {
        }
    };
    public C5431029t countdown_ec_rich_text;
    public Integer countdown_type;
    public Long time_control_second;

    public C2224971C6l() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224981C6m newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
