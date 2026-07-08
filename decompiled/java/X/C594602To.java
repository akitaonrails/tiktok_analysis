package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02To, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C594602To extends Message<C594602To, C594802Tq> {
    public static final ProtoAdapter<C594602To> ADAPTER = new ProtoAdapter<C594602To>() { // from class: X.02Tp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C594602To decode(ProtoReader protoReader) {
            C594802Tq c594802Tq = new C594802Tq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c594802Tq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c594802Tq.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c594802Tq.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c594802Tq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C594602To c594602To) {
            C594602To c594602To2 = c594602To;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c594602To2.scene) + protoAdapter.encodedSizeWithTag(2, c594602To2.button_text) + c594602To2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C594602To c594602To) {
        }
    };
    public String button_text;
    public String scene;

    public C594602To() {
    }

    @Override // com.squareup.wire.Message
    public C594802Tq newBuilder() {
        return null;
    }

    public C594602To(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C594602To(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = str;
        this.button_text = str2;
    }
}
