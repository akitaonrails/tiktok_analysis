package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DY extends Message<C02DY, C583302Pf> {
    public static final ProtoAdapter<C02DY> ADAPTER = new ProtoAdapter<C02DY>() { // from class: X.02DX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DY decode(ProtoReader protoReader) {
            C02DY c02dy = new C02DY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02dy.background_image = C029C.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02dy.promotion_tips = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02dy.items.add(C02DW.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DY c02dy) {
            C02DY c02dy2 = c02dy;
            return C02DW.ADAPTER.asRepeated().encodedSizeWithTag(1, c02dy2.items) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02dy2.promotion_tips) + C029C.ADAPTER.encodedSizeWithTag(3, c02dy2.background_image) + c02dy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02DY c02dy) {
        }
    };
    public C029C background_image;
    public List<C02DW> items;
    public String promotion_tips;

    public C02DY() {
        super(ADAPTER, ByteString.EMPTY);
        this.items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C583302Pf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
