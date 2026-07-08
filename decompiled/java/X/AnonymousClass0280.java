package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0280, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0280 extends Message<AnonymousClass0280, C02I1> {
    public static final ProtoAdapter<AnonymousClass0280> ADAPTER = new ProtoAdapter<AnonymousClass0280>() { // from class: X.023c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0280 decode(ProtoReader protoReader) {
            AnonymousClass0280 anonymousClass0280 = new AnonymousClass0280();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 2:
                            anonymousClass0280.content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0280.sug_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                        case 6:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0280.word_record = C028E.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0280.rich_sug_sec_pos.add(C559802Ge.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            anonymousClass0280.highlight_pos.add(C559802Ge.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0280.promotion_info = C623502bx.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0280.extra_info = C021K.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0280;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0280 anonymousClass0280) {
            AnonymousClass0280 anonymousClass02802 = anonymousClass0280;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, anonymousClass02802.content) + protoAdapter.encodedSizeWithTag(3, anonymousClass02802.sug_type) + C028E.ADAPTER.encodedSizeWithTag(5, anonymousClass02802.word_record);
            ProtoAdapter<C559802Ge> protoAdapter2 = C559802Ge.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(7, anonymousClass02802.rich_sug_sec_pos) + protoAdapter2.asRepeated().encodedSizeWithTag(8, anonymousClass02802.highlight_pos) + C623502bx.ADAPTER.encodedSizeWithTag(9, anonymousClass02802.promotion_info) + C021K.ADAPTER.encodedSizeWithTag(10, anonymousClass02802.extra_info) + anonymousClass02802.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0280 anonymousClass0280) {
            AnonymousClass0280 anonymousClass02802 = anonymousClass0280;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02802.content);
            protoAdapter.encodeWithTag(protoWriter, 3, anonymousClass02802.sug_type);
            C028E.ADAPTER.encodeWithTag(protoWriter, 5, anonymousClass02802.word_record);
            ProtoAdapter<C559802Ge> protoAdapter2 = C559802Ge.ADAPTER;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, anonymousClass02802.rich_sug_sec_pos);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 8, anonymousClass02802.highlight_pos);
            C623502bx.ADAPTER.encodeWithTag(protoWriter, 9, anonymousClass02802.promotion_info);
            C021K.ADAPTER.encodeWithTag(protoWriter, 10, anonymousClass02802.extra_info);
            protoWriter.writeBytes(anonymousClass02802.unknownFields());
        }
    };
    public String content;
    public C021K extra_info;
    public List<C559802Ge> highlight_pos;
    public C623502bx promotion_info;
    public List<C559802Ge> rich_sug_sec_pos;
    public String sug_type;
    public C028E word_record;

    public AnonymousClass0280() {
        super(ADAPTER, ByteString.EMPTY);
        this.rich_sug_sec_pos = C1516540pZE.LJIIIIZZ();
        this.highlight_pos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02I1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
