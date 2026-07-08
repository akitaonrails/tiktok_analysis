package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C554802Eg extends Message<C554802Eg, C02J2> {
    public static final ProtoAdapter<C554802Eg> ADAPTER = new ProtoAdapter<C554802Eg>() { // from class: X.028l
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C554802Eg decode(ProtoReader protoReader) {
            C554802Eg c554802Eg = new C554802Eg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c554802Eg.color1 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c554802Eg.color2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c554802Eg.color3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c554802Eg.color4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c554802Eg.bg_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c554802Eg.lightness = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c554802Eg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C554802Eg c554802Eg) {
            C554802Eg c554802Eg2 = c554802Eg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c554802Eg2.color1) + protoAdapter.encodedSizeWithTag(2, c554802Eg2.color2) + protoAdapter.encodedSizeWithTag(3, c554802Eg2.color3) + protoAdapter.encodedSizeWithTag(4, c554802Eg2.color4) + protoAdapter.encodedSizeWithTag(5, c554802Eg2.bg_color) + protoAdapter.encodedSizeWithTag(6, c554802Eg2.lightness) + c554802Eg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C554802Eg c554802Eg) {
            C554802Eg c554802Eg2 = c554802Eg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c554802Eg2.color1);
            protoAdapter.encodeWithTag(protoWriter, 2, c554802Eg2.color2);
            protoAdapter.encodeWithTag(protoWriter, 3, c554802Eg2.color3);
            protoAdapter.encodeWithTag(protoWriter, 4, c554802Eg2.color4);
            protoAdapter.encodeWithTag(protoWriter, 5, c554802Eg2.bg_color);
            protoAdapter.encodeWithTag(protoWriter, 6, c554802Eg2.lightness);
            protoWriter.writeBytes(c554802Eg2.unknownFields());
        }
    };
    public String bg_color;
    public String color1;
    public String color2;
    public String color3;
    public String color4;
    public String lightness;

    public C554802Eg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02J2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
