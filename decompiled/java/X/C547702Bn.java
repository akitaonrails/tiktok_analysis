package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C547702Bn extends Message<C547702Bn, C02N3> {
    public static final ProtoAdapter<C547702Bn> ADAPTER = new ProtoAdapter<C547702Bn>() { // from class: X.027t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C547702Bn decode(ProtoReader protoReader) {
            C547702Bn c547702Bn = new C547702Bn();
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
                                        c547702Bn.da_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c547702Bn.discount_info_list.add(C02G7.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c547702Bn.interest_fee_promotion_desc_selected = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c547702Bn.interest_fee_promotion_link = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c547702Bn.interest_fee_promotion_desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c547702Bn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C547702Bn c547702Bn) {
            C547702Bn c547702Bn2 = c547702Bn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c547702Bn2.interest_fee_promotion_desc) + protoAdapter.encodedSizeWithTag(2, c547702Bn2.interest_fee_promotion_link) + protoAdapter.encodedSizeWithTag(3, c547702Bn2.interest_fee_promotion_desc_selected) + C02G7.ADAPTER.asRepeated().encodedSizeWithTag(4, c547702Bn2.discount_info_list) + protoAdapter.encodedSizeWithTag(5, c547702Bn2.da_info) + c547702Bn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C547702Bn c547702Bn) {
        }
    };
    public String da_info;
    public List<C02G7> discount_info_list;
    public String interest_fee_promotion_desc;
    public String interest_fee_promotion_desc_selected;
    public String interest_fee_promotion_link;

    public C547702Bn() {
        super(ADAPTER, ByteString.EMPTY);
        this.discount_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02N3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
