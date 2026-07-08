package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02SS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02SS extends Message<C02SS, C02SU> {
    public static final ProtoAdapter<C02SS> ADAPTER = new ProtoAdapter<C02SS>() { // from class: X.02SR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02SS decode(ProtoReader protoReader) {
            C02SS c02ss = new C02SS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02ss.extra.add(C02SQ.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02ss.is_ls_content = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ss;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02SS c02ss) {
            C02SS c02ss2 = c02ss;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c02ss2.is_ls_content) + C02SQ.ADAPTER.asRepeated().encodedSizeWithTag(2, c02ss2.extra) + c02ss2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02SS c02ss) {
            C02SS c02ss2 = c02ss;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02ss2.is_ls_content);
            C02SQ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02ss2.extra);
            protoWriter.writeBytes(c02ss2.unknownFields());
        }
    };
    public List<C02SQ> extra;
    public Boolean is_ls_content;

    public C02SS() {
        super(ADAPTER, ByteString.EMPTY);
        this.extra = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02SU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
