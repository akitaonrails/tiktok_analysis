package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02a5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C611902a5 extends Message<C611902a5, C612102a7> {
    public static final ProtoAdapter<C611902a5> ADAPTER = new ProtoAdapter<C611902a5>() { // from class: X.02a6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C611902a5 decode(ProtoReader protoReader) {
            C612102a7 c612102a7 = new C612102a7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 200) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c612102a7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c612102a7.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c612102a7.LJ = C612202a8.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c612102a7.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c612102a7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C611902a5 c611902a5) {
            C611902a5 c611902a52 = c611902a5;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c611902a52.button_action_type) + C612202a8.ADAPTER.encodedSizeWithTag(2, c611902a52.button_action_info) + ProtoAdapter.STRING.encodedSizeWithTag(200, c611902a52.da_info) + c611902a52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C611902a5 c611902a5) {
        }
    };
    public C612202a8 button_action_info;
    public Integer button_action_type;
    public String da_info;

    public C611902a5() {
    }

    @Override // com.squareup.wire.Message
    public C612102a7 newBuilder() {
        return null;
    }

    public C611902a5(Integer num, C612202a8 c612202a8, String str) {
        this(num, c612202a8, str, ByteString.EMPTY);
    }

    public C611902a5(Integer num, C612202a8 c612202a8, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.button_action_type = num;
        this.button_action_info = c612202a8;
        this.da_info = str;
    }
}
