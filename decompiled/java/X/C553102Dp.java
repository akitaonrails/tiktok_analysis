package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C553102Dp extends Message<C553102Dp, C02NG> {
    public static final ProtoAdapter<C553102Dp> ADAPTER = new ProtoAdapter<C553102Dp>() { // from class: X.02BK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C553102Dp decode(ProtoReader protoReader) {
            C553102Dp c553102Dp = new C553102Dp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c553102Dp.credit_info_list.add(C022J.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c553102Dp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C553102Dp c553102Dp) {
            C553102Dp c553102Dp2 = c553102Dp;
            return C022J.ADAPTER.asRepeated().encodedSizeWithTag(1, c553102Dp2.credit_info_list) + c553102Dp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C553102Dp c553102Dp) {
        }
    };
    public List<C022J> credit_info_list;

    public C553102Dp() {
        super(ADAPTER, ByteString.EMPTY);
        this.credit_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02NG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
