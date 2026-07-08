package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DP extends Message<C02DP, C584502Pr> {
    public static final ProtoAdapter<C02DP> ADAPTER = new ProtoAdapter<C02DP>() { // from class: X.0274
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DP decode(ProtoReader protoReader) {
            C02DP c02dp = new C02DP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 8) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02dp.content_rich_text = C5431029t.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02dp.icon = C029C.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02dp.promotion_usable_end_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02dp.content = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DP c02dp) {
            C02DP c02dp2 = c02dp;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02dp2.content) + ProtoAdapter.INT64.encodedSizeWithTag(2, c02dp2.promotion_usable_end_time) + C029C.ADAPTER.encodedSizeWithTag(3, c02dp2.icon) + C5431029t.ADAPTER.encodedSizeWithTag(8, c02dp2.content_rich_text) + c02dp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02DP c02dp) {
        }
    };
    public String content;
    public C5431029t content_rich_text;
    public C029C icon;
    public Long promotion_usable_end_time;

    public C02DP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C584502Pr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
