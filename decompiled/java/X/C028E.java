package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.028E, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C028E extends Message<C028E, C02JM> {
    public static final ProtoAdapter<C028E> ADAPTER = new ProtoAdapter<C028E>() { // from class: X.023G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C028E decode(ProtoReader protoReader) {
            C028E c028e = new C028E();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c028e.group_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c028e.words_position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c028e.words_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c028e.words_source = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c028e.sdk_version = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c028e.hot_level = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c028e.active_timestamp = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c028e.words_lang = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c028e.textnet_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c028e.is_personalized = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c028e.words_label = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c028e.qrec_json_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c028e;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C028E c028e) {
            C028E c028e2 = c028e;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c028e2.group_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c028e2.words_position) + protoAdapter.encodedSizeWithTag(3, c028e2.words_content) + protoAdapter.encodedSizeWithTag(4, c028e2.words_source) + ProtoAdapter.INT64.encodedSizeWithTag(5, c028e2.sdk_version) + protoAdapter.encodedSizeWithTag(6, c028e2.hot_level) + protoAdapter.encodedSizeWithTag(7, c028e2.active_timestamp) + protoAdapter.encodedSizeWithTag(8, c028e2.words_lang) + protoAdapter.encodedSizeWithTag(9, c028e2.textnet_id) + ProtoAdapter.BOOL.encodedSizeWithTag(10, c028e2.is_personalized) + protoAdapter.encodedSizeWithTag(11, c028e2.words_label) + protoAdapter.encodedSizeWithTag(12, c028e2.qrec_json_info) + c028e2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C028E c028e) {
            C028E c028e2 = c028e;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c028e2.group_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c028e2.words_position);
            protoAdapter.encodeWithTag(protoWriter, 3, c028e2.words_content);
            protoAdapter.encodeWithTag(protoWriter, 4, c028e2.words_source);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c028e2.sdk_version);
            protoAdapter.encodeWithTag(protoWriter, 6, c028e2.hot_level);
            protoAdapter.encodeWithTag(protoWriter, 7, c028e2.active_timestamp);
            protoAdapter.encodeWithTag(protoWriter, 8, c028e2.words_lang);
            protoAdapter.encodeWithTag(protoWriter, 9, c028e2.textnet_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, c028e2.is_personalized);
            protoAdapter.encodeWithTag(protoWriter, 11, c028e2.words_label);
            protoAdapter.encodeWithTag(protoWriter, 12, c028e2.qrec_json_info);
            protoWriter.writeBytes(c028e2.unknownFields());
        }
    };
    public String active_timestamp;
    public String group_id;
    public String hot_level;
    public Boolean is_personalized;
    public String qrec_json_info;
    public Long sdk_version;
    public String textnet_id;
    public String words_content;
    public String words_label;
    public String words_lang;
    public Integer words_position;
    public String words_source;

    public C028E() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
