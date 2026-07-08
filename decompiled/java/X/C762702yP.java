package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02yP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C762702yP extends Message<C762702yP, C762602yO> {
    public static final ProtoAdapter<C762702yP> ADAPTER = new ProtoAdapter<C762702yP>() { // from class: X.02yQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C762702yP decode(ProtoReader protoReader) {
            C762702yP c762702yP = new C762702yP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c762702yP.ladder_info_list.add(C763002yS.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c762702yP.ladders.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c762702yP.regions = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c762702yP;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C762702yP c762702yP) {
            C762702yP c762702yP2 = c762702yP;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c762702yP2.regions) + protoAdapter.asRepeated().encodedSizeWithTag(2, c762702yP2.ladders) + C763002yS.ADAPTER.asRepeated().encodedSizeWithTag(3, c762702yP2.ladder_info_list) + c762702yP2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C762702yP c762702yP) {
        }
    };
    public List<C763002yS> ladder_info_list;
    public List<String> ladders;
    public String regions;

    public C762702yP() {
        super(ADAPTER, ByteString.EMPTY);
        this.ladders = C1516540pZE.LJIIIIZZ();
        this.ladder_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C762602yO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
