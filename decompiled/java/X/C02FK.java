package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FK extends Message<C02FK, C585702Qd> {
    public static final ProtoAdapter<C02FK> ADAPTER = new ProtoAdapter<C02FK>() { // from class: X.02FL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FK decode(ProtoReader protoReader) {
            C02FK c02fk = new C02FK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 200) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02fk.da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fk.consent_infos.add(C02H4.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02fk.popup = C02HM.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FK c02fk) {
            C02FK c02fk2 = c02fk;
            return C02HM.ADAPTER.encodedSizeWithTag(1, c02fk2.popup) + C02H4.ADAPTER.asRepeated().encodedSizeWithTag(2, c02fk2.consent_infos) + ProtoAdapter.STRING.encodedSizeWithTag(200, c02fk2.da_info) + c02fk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FK c02fk) {
        }
    };
    public List<C02H4> consent_infos;
    public String da_info;
    public C02HM popup;

    public C02FK() {
        super(ADAPTER, ByteString.EMPTY);
        this.consent_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C585702Qd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
