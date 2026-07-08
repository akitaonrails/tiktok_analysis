package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557002Fc extends Message<C557002Fc, C02OH> {
    public static final ProtoAdapter<C557002Fc> ADAPTER = new ProtoAdapter<C557002Fc>() { // from class: X.028o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557002Fc decode(ProtoReader protoReader) {
            C557002Fc c557002Fc = new C557002Fc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c557002Fc.installment_tenure = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c557002Fc.rich_text = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c557002Fc.sub_text_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557002Fc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557002Fc c557002Fc) {
            C557002Fc c557002Fc2 = c557002Fc;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c557002Fc2.sub_text_type) + C5431029t.ADAPTER.encodedSizeWithTag(2, c557002Fc2.rich_text) + ProtoAdapter.STRING.encodedSizeWithTag(3, c557002Fc2.installment_tenure) + c557002Fc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C557002Fc c557002Fc) {
        }
    };
    public String installment_tenure;
    public C5431029t rich_text;
    public Integer sub_text_type;

    public C557002Fc() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
