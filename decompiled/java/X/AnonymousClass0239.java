package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0239, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0239 extends Message<AnonymousClass0239, C02Q1> {
    public static final ProtoAdapter<AnonymousClass0239> ADAPTER = new ProtoAdapter<AnonymousClass0239>() { // from class: X.0225
        public final ProtoAdapter<Map<String, C025E>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C025E.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0239 decode(ProtoReader protoReader) {
            AnonymousClass0239 anonymousClass0239 = new AnonymousClass0239();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0239.key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0239.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0239.hint = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0239.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0239.max_line = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0239.max_length = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0239.rules.add(C660702hx.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            anonymousClass0239.default_value = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0239.empty = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0239.input_hint_message = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0239.min_length = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0239.length_hint = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0239.arguments.putAll(this.LIZ.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0239;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0239 anonymousClass0239) {
            AnonymousClass0239 anonymousClass02392 = anonymousClass0239;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02392.key) + protoAdapter.encodedSizeWithTag(2, anonymousClass02392.title) + protoAdapter.encodedSizeWithTag(3, anonymousClass02392.hint);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, anonymousClass02392.type) + protoAdapter2.encodedSizeWithTag(5, anonymousClass02392.max_line) + protoAdapter2.encodedSizeWithTag(6, anonymousClass02392.max_length) + C660702hx.ADAPTER.asRepeated().encodedSizeWithTag(7, anonymousClass02392.rules) + protoAdapter.encodedSizeWithTag(8, anonymousClass02392.default_value) + ProtoAdapter.BOOL.encodedSizeWithTag(9, anonymousClass02392.empty) + protoAdapter.encodedSizeWithTag(10, anonymousClass02392.input_hint_message) + protoAdapter2.encodedSizeWithTag(11, anonymousClass02392.min_length) + protoAdapter.encodedSizeWithTag(12, anonymousClass02392.length_hint) + this.LIZ.encodedSizeWithTag(13, anonymousClass02392.arguments) + anonymousClass02392.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0239 anonymousClass0239) {
        }
    };
    public Map<String, C025E> arguments;
    public String default_value;
    public Boolean empty;
    public String hint;
    public String input_hint_message;
    public String key;
    public String length_hint;
    public Integer max_length;
    public Integer max_line;
    public Integer min_length;
    public List<C660702hx> rules;
    public String title;
    public Integer type;

    @Override // com.squareup.wire.Message
    public C02Q1 newBuilder() {
        return null;
    }

    public AnonymousClass0239() {
        super(ADAPTER, ByteString.EMPTY);
        this.rules = C1516540pZE.LJIIIIZZ();
        this.arguments = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
