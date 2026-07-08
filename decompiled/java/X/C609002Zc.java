package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C609002Zc extends Message<C609002Zc, C609102Zd> {
    public static final ProtoAdapter<C609002Zc> ADAPTER = new ProtoAdapter<C609002Zc>() { // from class: X.02Zb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C609002Zc decode(ProtoReader protoReader) {
            C609002Zc c609002Zc = new C609002Zc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c609002Zc.show_count = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c609002Zc.payment_methods.add(C5193020p.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c609002Zc.title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c609002Zc.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c609002Zc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C609002Zc c609002Zc) {
            C609002Zc c609002Zc2 = c609002Zc;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c609002Zc2.name) + protoAdapter.encodedSizeWithTag(2, c609002Zc2.title) + C5193020p.ADAPTER.asRepeated().encodedSizeWithTag(3, c609002Zc2.payment_methods) + ProtoAdapter.INT32.encodedSizeWithTag(4, c609002Zc2.show_count) + c609002Zc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C609002Zc c609002Zc) {
        }
    };
    public String name;
    public List<C5193020p> payment_methods;
    public Integer show_count;
    public String title;

    public C609002Zc() {
        super(ADAPTER, ByteString.EMPTY);
        this.payment_methods = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C609102Zd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
