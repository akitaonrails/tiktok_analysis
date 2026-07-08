package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CY extends Message<C02CY, C02OS> {
    public static final ProtoAdapter<C02CY> ADAPTER = new ProtoAdapter<C02CY>() { // from class: X.028N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CY decode(ProtoReader protoReader) {
            C02CY c02cy = new C02CY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02cy.blocks.add(C599102Vh.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02cy.display_direction = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CY c02cy) {
            C02CY c02cy2 = c02cy;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02cy2.display_direction) + C599102Vh.ADAPTER.asRepeated().encodedSizeWithTag(2, c02cy2.blocks) + c02cy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02CY c02cy) {
        }
    };
    public List<C599102Vh> blocks;
    public Integer display_direction;

    public C02CY() {
        super(ADAPTER, ByteString.EMPTY);
        this.blocks = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02OS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
