package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C601802Wi extends Message<C601802Wi, C601902Wj> {
    public static final ProtoAdapter<C601802Wi> ADAPTER = new ProtoAdapter<C601802Wi>() { // from class: X.02Wh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C601802Wi decode(ProtoReader protoReader) {
            C601802Wi c601802Wi = new C601802Wi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c601802Wi.banner_tips_detail = C5431029t.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c601802Wi.banner_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c601802Wi.banner_tips = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c601802Wi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C601802Wi c601802Wi) {
            C601802Wi c601802Wi2 = c601802Wi;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c601802Wi2.banner_tips) + ProtoAdapter.STRING.encodedSizeWithTag(2, c601802Wi2.banner_title) + protoAdapter.encodedSizeWithTag(3, c601802Wi2.banner_tips_detail) + c601802Wi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C601802Wi c601802Wi) {
        }
    };
    public C5431029t banner_tips;
    public C5431029t banner_tips_detail;
    public String banner_title;

    public C601802Wi() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C601902Wj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
