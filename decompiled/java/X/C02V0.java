package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02V0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02V0 extends Message<C02V0, C02V1> {
    public static final ProtoAdapter<C02V0> ADAPTER = new ProtoAdapter<C02V0>() { // from class: X.02Uz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02V0 decode(ProtoReader protoReader) {
            C02V0 c02v0 = new C02V0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02v0.image_major_language = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02v0.target_language = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02v0.translatable = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02v0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02V0 c02v0) {
            C02V0 c02v02 = c02v0;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c02v02.translatable);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02v02.target_language) + protoAdapter.encodedSizeWithTag(3, c02v02.image_major_language) + c02v02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02V0 c02v0) {
            C02V0 c02v02 = c02v0;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02v02.translatable);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02v02.target_language);
            protoAdapter.encodeWithTag(protoWriter, 3, c02v02.image_major_language);
            protoWriter.writeBytes(c02v02.unknownFields());
        }
    };
    public String image_major_language;
    public String target_language;
    public Boolean translatable;

    public C02V0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02V1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
