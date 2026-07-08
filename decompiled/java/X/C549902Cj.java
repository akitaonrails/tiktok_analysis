package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549902Cj extends Message<C549902Cj, C586102Qh> {
    public static final ProtoAdapter<C549902Cj> ADAPTER = new ProtoAdapter<C549902Cj>() { // from class: X.029N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549902Cj decode(ProtoReader protoReader) {
            C549902Cj c549902Cj = new C549902Cj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c549902Cj.selected_logistics_service_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c549902Cj.title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c549902Cj.logistics.add(C021O.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549902Cj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549902Cj c549902Cj) {
            C549902Cj c549902Cj2 = c549902Cj;
            int iEncodedSizeWithTag = C021O.ADAPTER.asRepeated().encodedSizeWithTag(1, c549902Cj2.logistics);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c549902Cj2.title) + protoAdapter.encodedSizeWithTag(3, c549902Cj2.selected_logistics_service_id) + c549902Cj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C549902Cj c549902Cj) {
        }
    };
    public List<C021O> logistics;
    public String selected_logistics_service_id;
    public String title;

    public C549902Cj() {
        super(ADAPTER, ByteString.EMPTY);
        this.logistics = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C586102Qh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
