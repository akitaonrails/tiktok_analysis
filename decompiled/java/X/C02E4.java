package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02E4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02E4 extends Message<C02E4, C02K0> {
    public static final ProtoAdapter<C02E4> ADAPTER = new ProtoAdapter<C02E4>() { // from class: X.02E3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02E4 decode(ProtoReader protoReader) {
            C02E4 c02e4 = new C02E4();
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
                                    c02e4.view_through_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02e4.report_threshold.add(C02E2.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c02e4.domain = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02e4.common_params = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02e4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02E4 c02e4) {
            C02E4 c02e42 = c02e4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02e42.common_params) + protoAdapter.encodedSizeWithTag(2, c02e42.domain) + C02E2.ADAPTER.asRepeated().encodedSizeWithTag(3, c02e42.report_threshold) + protoAdapter.encodedSizeWithTag(4, c02e42.view_through_url) + c02e42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02E4 c02e4) {
            C02E4 c02e42 = c02e4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02e42.common_params);
            protoAdapter.encodeWithTag(protoWriter, 2, c02e42.domain);
            C02E2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c02e42.report_threshold);
            protoAdapter.encodeWithTag(protoWriter, 4, c02e42.view_through_url);
            protoWriter.writeBytes(c02e42.unknownFields());
        }
    };
    public String common_params;
    public String domain;
    public List<C02E2> report_threshold;
    public String view_through_url;

    public C02E4() {
        super(ADAPTER, ByteString.EMPTY);
        this.report_threshold = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02K0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
