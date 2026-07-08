package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02B8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02B8 extends Message<C02B8, C570102Kd> {
    public static final ProtoAdapter<C02B8> ADAPTER = new ProtoAdapter<C02B8>() { // from class: X.023V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02B8 decode(ProtoReader protoReader) {
            C02B8 c02b8 = new C02B8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02b8.lang = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02b8.language_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c02b8.voice_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02b8.play_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02b8.volume_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02b8.bit_rate = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c02b8.language_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02b8.format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02b8.sub_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02b8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02B8 c02b8) {
            C02B8 c02b82 = c02b8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02b82.lang) + ProtoAdapter.INT64.encodedSizeWithTag(2, c02b82.language_id) + protoAdapter.encodedSizeWithTag(3, c02b82.voice_type) + C673002jw.ADAPTER.encodedSizeWithTag(4, c02b82.play_addr) + protoAdapter.encodedSizeWithTag(5, c02b82.volume_info) + ProtoAdapter.INT32.encodedSizeWithTag(6, c02b82.bit_rate) + protoAdapter.encodedSizeWithTag(7, c02b82.language_code) + protoAdapter.encodedSizeWithTag(8, c02b82.format) + protoAdapter.encodedSizeWithTag(9, c02b82.sub_info) + c02b82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02B8 c02b8) {
            C02B8 c02b82 = c02b8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02b82.lang);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c02b82.language_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c02b82.voice_type);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 4, c02b82.play_addr);
            protoAdapter.encodeWithTag(protoWriter, 5, c02b82.volume_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, c02b82.bit_rate);
            protoAdapter.encodeWithTag(protoWriter, 7, c02b82.language_code);
            protoAdapter.encodeWithTag(protoWriter, 8, c02b82.format);
            protoAdapter.encodeWithTag(protoWriter, 9, c02b82.sub_info);
            protoWriter.writeBytes(c02b82.unknownFields());
        }
    };
    public Integer bit_rate;
    public String format;
    public String lang;
    public String language_code;
    public Long language_id;
    public C673002jw play_addr;
    public String sub_info;
    public String voice_type;
    public String volume_info;

    public C02B8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C570102Kd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
