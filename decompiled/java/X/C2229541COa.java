package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229541COa extends Message<C2229541COa, C2229551COb> {
    public static final ProtoAdapter<C2229541COa> ADAPTER = new ProtoAdapter<C2229541COa>() { // from class: X.1COZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229541COa decode(ProtoReader protoReader) {
            C2229541COa c2229541COa = new C2229541COa();
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
                                    c2229541COa.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2229541COa.items.add(C1COX.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c2229541COa.subtitle = C1COL.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2229541COa.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229541COa;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229541COa c2229541COa) {
            C2229541COa c2229541COa2 = c2229541COa;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2229541COa2.title) + C1COL.ADAPTER.encodedSizeWithTag(2, c2229541COa2.subtitle) + C1COX.ADAPTER.asRepeated().encodedSizeWithTag(3, c2229541COa2.items) + protoAdapter.encodedSizeWithTag(4, c2229541COa2.da_info) + c2229541COa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2229541COa c2229541COa) {
        }
    };
    public String da_info;
    public List<C1COX> items;
    public C1COL subtitle;
    public String title;

    public C2229541COa() {
        super(ADAPTER, ByteString.EMPTY);
        this.items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2229551COb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
