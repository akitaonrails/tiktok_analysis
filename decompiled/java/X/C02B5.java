package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02B5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02B5 extends Message<C02B5, C02J0> {
    public static final ProtoAdapter<C02B5> ADAPTER = new ProtoAdapter<C02B5>() { // from class: X.024C
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02B5 decode(ProtoReader protoReader) {
            C02B5 c02b5 = new C02B5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02b5.lang = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02b5.language_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c02b5.language_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02b5.can_translate_realtime = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c02b5.original_caption_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02b5.is_burnin_caption = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c02b5.can_translate_realtime_skip_translation_lang_check = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c02b5.first_subtitle_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02b5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02B5 c02b5) {
            C02B5 c02b52 = c02b5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02b52.lang);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02b52.language_id) + protoAdapter.encodedSizeWithTag(3, c02b52.language_code);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c02b52.can_translate_realtime) + ProtoAdapter.INT32.encodedSizeWithTag(5, c02b52.original_caption_type) + protoAdapter3.encodedSizeWithTag(6, c02b52.is_burnin_caption) + protoAdapter3.encodedSizeWithTag(7, c02b52.can_translate_realtime_skip_translation_lang_check) + protoAdapter2.encodedSizeWithTag(8, c02b52.first_subtitle_time) + c02b52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02B5 c02b5) {
            C02B5 c02b52 = c02b5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02b52.lang);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02b52.language_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c02b52.language_code);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 4, c02b52.can_translate_realtime);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, c02b52.original_caption_type);
            protoAdapter3.encodeWithTag(protoWriter, 6, c02b52.is_burnin_caption);
            protoAdapter3.encodeWithTag(protoWriter, 7, c02b52.can_translate_realtime_skip_translation_lang_check);
            protoAdapter2.encodeWithTag(protoWriter, 8, c02b52.first_subtitle_time);
            protoWriter.writeBytes(c02b52.unknownFields());
        }
    };
    public Boolean can_translate_realtime;
    public Boolean can_translate_realtime_skip_translation_lang_check;
    public Long first_subtitle_time;
    public Boolean is_burnin_caption;
    public String lang;
    public String language_code;
    public Long language_id;
    public Integer original_caption_type;

    public C02B5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02J0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
