package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02C1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02C1 extends Message<C02C1, C565702Il> {
    public static final ProtoAdapter<C02C1> ADAPTER = new ProtoAdapter<C02C1>() { // from class: X.025d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02C1 decode(ProtoReader protoReader) {
            C02C1 c02c1 = new C02C1();
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
                                    c02c1.server_extra_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02c1.market_sub_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02c1.operator_info_list.add(C557602Fi.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02c1.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02c1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02C1 c02c1) {
            C02C1 c02c12 = c02c1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02c12.aweme_id) + C557602Fi.ADAPTER.asRepeated().encodedSizeWithTag(2, c02c12.operator_info_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02c12.market_sub_type) + protoAdapter.encodedSizeWithTag(4, c02c12.server_extra_info) + c02c12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02C1 c02c1) {
            C02C1 c02c12 = c02c1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02c12.aweme_id);
            C557602Fi.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02c12.operator_info_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c02c12.market_sub_type);
            protoAdapter.encodeWithTag(protoWriter, 4, c02c12.server_extra_info);
            protoWriter.writeBytes(c02c12.unknownFields());
        }
    };
    public String aweme_id;
    public Integer market_sub_type;
    public List<C557602Fi> operator_info_list;
    public String server_extra_info;

    public C02C1() {
        super(ADAPTER, ByteString.EMPTY);
        this.operator_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C565702Il newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
