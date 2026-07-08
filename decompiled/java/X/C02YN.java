package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02YN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02YN extends Message<C02YN, C02YQ> {
    public static final ProtoAdapter<C02YN> ADAPTER = new ProtoAdapter<C02YN>() { // from class: X.02YM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02YN decode(ProtoReader protoReader) {
            C02YN c02yn = new C02YN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02yn.url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02yn.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02yn.place_holder = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02yn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02YN c02yn) {
            C02YN c02yn2 = c02yn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02yn2.place_holder) + protoAdapter.encodedSizeWithTag(2, c02yn2.text) + protoAdapter.encodedSizeWithTag(3, c02yn2.url) + c02yn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02YN c02yn) {
            C02YN c02yn2 = c02yn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02yn2.place_holder);
            protoAdapter.encodeWithTag(protoWriter, 2, c02yn2.text);
            protoAdapter.encodeWithTag(protoWriter, 3, c02yn2.url);
            protoWriter.writeBytes(c02yn2.unknownFields());
        }
    };
    public String place_holder;
    public String text;
    public String url;

    public C02YN() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02YQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
