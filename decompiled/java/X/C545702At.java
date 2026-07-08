package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02At, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C545702At extends Message<C545702At, C584102Pn> {
    public static final ProtoAdapter<C545702At> ADAPTER = new ProtoAdapter<C545702At>() { // from class: X.025m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C545702At decode(ProtoReader protoReader) {
            C545702At c545702At = new C545702At();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 200) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c545702At.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c545702At.promotion_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c545702At.voucher_reminder = C611402a0.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c545702At.price_additional.add(AnonymousClass0241.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c545702At;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C545702At c545702At) {
            C545702At c545702At2 = c545702At;
            return AnonymousClass0241.ADAPTER.asRepeated().encodedSizeWithTag(1, c545702At2.price_additional) + C611402a0.ADAPTER.encodedSizeWithTag(2, c545702At2.voucher_reminder) + ProtoAdapter.INT32.encodedSizeWithTag(3, c545702At2.promotion_type) + ProtoAdapter.STRING.encodedSizeWithTag(200, c545702At2.da_info) + c545702At2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C545702At c545702At) {
        }
    };
    public String da_info;
    public List<AnonymousClass0241> price_additional;
    public Integer promotion_type;
    public C611402a0 voucher_reminder;

    public C545702At() {
        super(ADAPTER, ByteString.EMPTY);
        this.price_additional = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C584102Pn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
