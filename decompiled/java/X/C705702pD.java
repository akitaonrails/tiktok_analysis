package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02pD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C705702pD extends Message<C705702pD, C705802pE> {
    public static final ProtoAdapter<C705702pD> ADAPTER = new ProtoAdapter<C705702pD>() { // from class: X.02pC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C705702pD decode(ProtoReader protoReader) {
            C705702pD c705702pD = new C705702pD();
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
                                    c705702pD.countdown_configs.add(C706002pG.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c705702pD.countdown_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c705702pD.end_time = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c705702pD.start_time = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c705702pD;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C705702pD c705702pD) {
            C705702pD c705702pD2 = c705702pD;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c705702pD2.start_time) + protoAdapter.encodedSizeWithTag(2, c705702pD2.end_time) + protoAdapter.encodedSizeWithTag(3, c705702pD2.countdown_text) + C706002pG.ADAPTER.asRepeated().encodedSizeWithTag(4, c705702pD2.countdown_configs) + c705702pD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C705702pD c705702pD) {
        }
    };
    public List<C706002pG> countdown_configs;
    public String countdown_text;
    public String end_time;
    public String start_time;

    public C705702pD() {
        super(ADAPTER, ByteString.EMPTY);
        this.countdown_configs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C705802pE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
