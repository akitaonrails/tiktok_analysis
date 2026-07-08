package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229741COu extends Message<C2229741COu, C2229751COv> {
    public static final ProtoAdapter<C2229741COu> ADAPTER = new ProtoAdapter<C2229741COu>() { // from class: X.1COt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229741COu decode(ProtoReader protoReader) {
            C2229751COv c2229751COv = new C2229751COv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229751COv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229751COv.LJ.add(C2229711COr.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2229751COv.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229751COv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229741COu c2229741COu) {
            C2229741COu c2229741COu2 = c2229741COu;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2229741COu2.outreach_type) + C2229711COr.ADAPTER.asRepeated().encodedSizeWithTag(2, c2229741COu2.not_allow_item_list) + c2229741COu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229741COu c2229741COu) {
            C2229741COu c2229741COu2 = c2229741COu;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2229741COu2.outreach_type);
            C2229711COr.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2229741COu2.not_allow_item_list);
            protoWriter.writeBytes(c2229741COu2.unknownFields());
        }
    };
    public List<C2229711COr> not_allow_item_list;
    public String outreach_type;

    @Override // com.squareup.wire.Message
    public C2229751COv newBuilder() {
        return null;
    }

    public C2229741COu(String str, List<C2229711COr> list) {
        this(str, list, ByteString.EMPTY);
    }

    public C2229741COu(String str, List<C2229711COr> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.outreach_type = str;
        this.not_allow_item_list = C1516540pZE.LJFF("not_allow_item_list", list);
    }
}
