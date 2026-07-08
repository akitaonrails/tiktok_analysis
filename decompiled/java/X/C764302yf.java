package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C764302yf extends Message<C764302yf, C764402yg> {
    public static final ProtoAdapter<C764302yf> ADAPTER = new ProtoAdapter<C764302yf>() { // from class: X.02ye
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C764302yf decode(ProtoReader protoReader) {
            C764302yf c764302yf = new C764302yf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c764302yf.interactive_voucher_task_info = C2251551DAr.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c764302yf.waiting_time_for_claim_voucher = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c764302yf.seller_guide_interactive_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c764302yf.author_nick_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c764302yf.author_photo = C02U1.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c764302yf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C764302yf c764302yf) {
            C764302yf c764302yf2 = c764302yf;
            int iEncodedSizeWithTag = C02U1.ADAPTER.encodedSizeWithTag(1, c764302yf2.author_photo);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c764302yf2.author_nick_name) + protoAdapter.encodedSizeWithTag(3, c764302yf2.seller_guide_interactive_text) + protoAdapter.encodedSizeWithTag(4, c764302yf2.waiting_time_for_claim_voucher) + C2251551DAr.ADAPTER.encodedSizeWithTag(5, c764302yf2.interactive_voucher_task_info) + c764302yf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C764302yf c764302yf) {
        }
    };
    public String author_nick_name;
    public C02U1 author_photo;
    public C2251551DAr interactive_voucher_task_info;
    public String seller_guide_interactive_text;
    public String waiting_time_for_claim_voucher;

    public C764302yf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C764402yg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
