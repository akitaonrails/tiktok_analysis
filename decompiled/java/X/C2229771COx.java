package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229771COx extends Message<C2229771COx, C2229781COy> {
    public static final ProtoAdapter<C2229771COx> ADAPTER = new ProtoAdapter<C2229771COx>() { // from class: X.1COw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229771COx decode(ProtoReader protoReader) {
            C2229781COy c2229781COy = new C2229781COy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2229781COy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2229781COy.LIZLLL.add(C2229741COu.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229781COy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229771COx c2229771COx) {
            C2229771COx c2229771COx2 = c2229771COx;
            return C2229741COu.ADAPTER.asRepeated().encodedSizeWithTag(1, c2229771COx2.outreach_frequency_info) + c2229771COx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229771COx c2229771COx) {
            C2229771COx c2229771COx2 = c2229771COx;
            C2229741COu.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2229771COx2.outreach_frequency_info);
            protoWriter.writeBytes(c2229771COx2.unknownFields());
        }
    };
    public List<C2229741COu> outreach_frequency_info;

    @Override // com.squareup.wire.Message
    public C2229781COy newBuilder() {
        return null;
    }

    public C2229771COx(List<C2229741COu> list) {
        this(list, ByteString.EMPTY);
    }

    public C2229771COx(List<C2229741COu> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.outreach_frequency_info = C1516540pZE.LJFF("outreach_frequency_info", list);
    }
}
