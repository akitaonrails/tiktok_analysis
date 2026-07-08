package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C646502ff extends Message<C646502ff, C646602fg> {
    public static final ProtoAdapter<C646502ff> ADAPTER = new ProtoAdapter<C646502ff>() { // from class: X.02fe
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C646502ff decode(ProtoReader protoReader) {
            C646502ff c646502ff = new C646502ff();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c646502ff.bill_items.add(C652802gg.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c646502ff;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C646502ff c646502ff) {
            C646502ff c646502ff2 = c646502ff;
            return C652802gg.ADAPTER.asRepeated().encodedSizeWithTag(1, c646502ff2.bill_items) + c646502ff2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C646502ff c646502ff) {
        }
    };
    public List<C652802gg> bill_items;

    public C646502ff() {
        super(ADAPTER, ByteString.EMPTY);
        this.bill_items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C646602fg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
