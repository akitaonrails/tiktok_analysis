package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224041C2w extends Message<C2224041C2w, C2224051C2x> {
    public static final ProtoAdapter<C2224041C2w> ADAPTER = new ProtoAdapter<C2224041C2w>() { // from class: X.1C2v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224041C2w decode(ProtoReader protoReader) {
            C2224051C2x c2224051C2x = new C2224051C2x();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2224051C2x.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2224051C2x.LIZLLL.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224051C2x.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224041C2w c2224041C2w) {
            C2224041C2w c2224041C2w2 = c2224041C2w;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c2224041C2w2.survey_keys) + c2224041C2w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224041C2w c2224041C2w) {
            C2224041C2w c2224041C2w2 = c2224041C2w;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, c2224041C2w2.survey_keys);
            protoWriter.writeBytes(c2224041C2w2.unknownFields());
        }
    };
    public List<String> survey_keys;

    @Override // com.squareup.wire.Message
    public C2224051C2x newBuilder() {
        return null;
    }

    public C2224041C2w(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public C2224041C2w(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.survey_keys = C1516540pZE.LJFF("survey_keys", list);
    }
}
