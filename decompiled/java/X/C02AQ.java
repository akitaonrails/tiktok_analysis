package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AQ extends Message<C02AQ, C02PL> {
    public static final ProtoAdapter<C02AQ> ADAPTER = new ProtoAdapter<C02AQ>() { // from class: X.026Z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AQ decode(ProtoReader protoReader) {
            C02AQ c02aq = new C02AQ();
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
                                        c02aq.title_appendix.add(C5431029t.ADAPTER.decode(protoReader));
                                    }
                                } else {
                                    c02aq.appendix_area = C683202la.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02aq.logistic_area = C026Y.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02aq.selection_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02aq.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02aq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AQ c02aq) {
            C02AQ c02aq2 = c02aq;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02aq2.title) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02aq2.selection_type) + C026Y.ADAPTER.encodedSizeWithTag(3, c02aq2.logistic_area) + C683202la.ADAPTER.encodedSizeWithTag(4, c02aq2.appendix_area) + C5431029t.ADAPTER.asRepeated().encodedSizeWithTag(5, c02aq2.title_appendix) + c02aq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02AQ c02aq) {
        }
    };
    public C683202la appendix_area;
    public C026Y logistic_area;
    public Integer selection_type;
    public String title;
    public List<C5431029t> title_appendix;

    public C02AQ() {
        super(ADAPTER, ByteString.EMPTY);
        this.title_appendix = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02PL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
