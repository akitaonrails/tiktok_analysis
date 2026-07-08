package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578240rAk extends Message<C1578240rAk, C1578250rAl> {
    public static final ProtoAdapter<C1578240rAk> ADAPTER = new ProtoAdapter<C1578240rAk>() { // from class: X.0rAd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578240rAk decode(ProtoReader protoReader) {
            C1578250rAl c1578250rAl = new C1578250rAl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1578250rAl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1578250rAl.LIZLLL.add(C1578180rAe.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578250rAl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578240rAk c1578240rAk) {
            C1578240rAk c1578240rAk2 = c1578240rAk;
            return C1578180rAe.ADAPTER.asRepeated().encodedSizeWithTag(1, c1578240rAk2.skylight_card_list) + c1578240rAk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578240rAk c1578240rAk) {
            C1578240rAk c1578240rAk2 = c1578240rAk;
            C1578180rAe.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1578240rAk2.skylight_card_list);
            protoWriter.writeBytes(c1578240rAk2.unknownFields());
        }
    };
    public List<C1578180rAe> skylight_card_list;

    @Override // com.squareup.wire.Message
    public C1578250rAl newBuilder() {
        return null;
    }

    public C1578240rAk(List<C1578180rAe> list) {
        this(list, ByteString.EMPTY);
    }

    public C1578240rAk(List<C1578180rAe> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.skylight_card_list = C1516540pZE.LJFF("skylight_card_list", list);
    }
}
