package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02B2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02B2 extends Message<C02B2, C02OO> {
    public static final ProtoAdapter<C02B2> ADAPTER = new ProtoAdapter<C02B2>() { // from class: X.026v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02B2 decode(ProtoReader protoReader) {
            C02B2 c02b2 = new C02B2();
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
                                        c02b2.desc = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02b2.link_name = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02b2.total_amount_inner_item = C649302g7.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02b2.item.add(C02A3.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02b2.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02b2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02B2 c02b2) {
            C02B2 c02b22 = c02b2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02b22.title) + C02A3.ADAPTER.asRepeated().encodedSizeWithTag(2, c02b22.item) + C649302g7.ADAPTER.encodedSizeWithTag(3, c02b22.total_amount_inner_item) + protoAdapter.encodedSizeWithTag(4, c02b22.link_name) + protoAdapter.encodedSizeWithTag(5, c02b22.desc) + c02b22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02B2 c02b2) {
        }
    };
    public String desc;
    public List<C02A3> item;
    public String link_name;
    public String title;
    public C649302g7 total_amount_inner_item;

    public C02B2() {
        super(ADAPTER, ByteString.EMPTY);
        this.item = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02OO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
