package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02SH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02SH extends Message<C02SH, C02SI> {
    public static final ProtoAdapter<C02SH> ADAPTER = new ProtoAdapter<C02SH>() { // from class: X.02SG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02SH decode(ProtoReader protoReader) {
            C02SH c02sh = new C02SH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02sh.ext_pass = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02sh.word = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02sh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02SH c02sh) {
            C02SH c02sh2 = c02sh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02sh2.word) + protoAdapter.encodedSizeWithTag(2, c02sh2.ext_pass) + c02sh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02SH c02sh) {
            C02SH c02sh2 = c02sh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02sh2.word);
            protoAdapter.encodeWithTag(protoWriter, 2, c02sh2.ext_pass);
            protoWriter.writeBytes(c02sh2.unknownFields());
        }
    };
    public String ext_pass;
    public String word;

    public C02SH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02SI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
