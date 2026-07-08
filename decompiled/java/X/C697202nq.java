package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C697202nq extends Message<C697202nq, C697302nr> {
    public static final ProtoAdapter<C697202nq> ADAPTER = new ProtoAdapter<C697202nq>() { // from class: X.02np
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C697202nq decode(ProtoReader protoReader) {
            C697202nq c697202nq = new C697202nq();
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
                                    c697202nq.logistics_upper_areas.add(C697502nt.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c697202nq.appendix_area = C683202la.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c697202nq.logistic_area = C026Y.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c697202nq.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c697202nq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C697202nq c697202nq) {
            C697202nq c697202nq2 = c697202nq;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c697202nq2.title) + C026Y.ADAPTER.encodedSizeWithTag(2, c697202nq2.logistic_area) + C683202la.ADAPTER.encodedSizeWithTag(3, c697202nq2.appendix_area) + C697502nt.ADAPTER.asRepeated().encodedSizeWithTag(4, c697202nq2.logistics_upper_areas) + c697202nq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C697202nq c697202nq) {
        }
    };
    public C683202la appendix_area;
    public C026Y logistic_area;
    public List<C697502nt> logistics_upper_areas;
    public String title;

    public C697202nq() {
        super(ADAPTER, ByteString.EMPTY);
        this.logistics_upper_areas = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C697302nr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
