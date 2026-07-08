package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02UY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02UY extends Message<C02UY, C02UZ> {
    public static final ProtoAdapter<C02UY> ADAPTER = new ProtoAdapter<C02UY>() { // from class: X.02UX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02UY decode(ProtoReader protoReader) {
            C02UY c02uy = new C02UY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02uy.lead_icon = C029C.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02uy.contents.add(C5431029t.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02uy.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02uy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02UY c02uy) {
            C02UY c02uy2 = c02uy;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02uy2.title) + C5431029t.ADAPTER.asRepeated().encodedSizeWithTag(2, c02uy2.contents) + C029C.ADAPTER.encodedSizeWithTag(3, c02uy2.lead_icon) + c02uy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02UY c02uy) {
        }
    };
    public List<C5431029t> contents;
    public C029C lead_icon;
    public String title;

    public C02UY() {
        super(ADAPTER, ByteString.EMPTY);
        this.contents = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02UZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
