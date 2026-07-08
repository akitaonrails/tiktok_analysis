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

/* JADX INFO: renamed from: X.0244, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0244 extends Message<AnonymousClass0244, C02LI> {
    public static final ProtoAdapter<AnonymousClass0244> ADAPTER = new ProtoAdapter<AnonymousClass0244>() { // from class: X.022j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0244 decode(ProtoReader protoReader) {
            AnonymousClass0244 anonymousClass0244 = new AnonymousClass0244();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0244.gear_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0244.quality_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0244.bit_rate = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0244.play_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0244.is_h265 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0244.play_addr_265 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0244.is_bytevc1 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0244.play_addr_bytevc1 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0244.dub_infos.add(C691702mx.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0244.HDR_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0244.HDR_bit = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0244.video_extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0244.format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0244.fps = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            anonymousClass0244.bandwidth = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            anonymousClass0244.fid_profile_labels = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0244;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0244 anonymousClass0244) {
            AnonymousClass0244 anonymousClass02442 = anonymousClass0244;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02442.gear_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, anonymousClass02442.quality_type) + protoAdapter2.encodedSizeWithTag(3, anonymousClass02442.bit_rate);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, anonymousClass02442.play_addr) + protoAdapter2.encodedSizeWithTag(5, anonymousClass02442.is_h265) + protoAdapter3.encodedSizeWithTag(6, anonymousClass02442.play_addr_265) + protoAdapter2.encodedSizeWithTag(7, anonymousClass02442.is_bytevc1) + protoAdapter3.encodedSizeWithTag(8, anonymousClass02442.play_addr_bytevc1) + C691702mx.ADAPTER.asRepeated().encodedSizeWithTag(9, anonymousClass02442.dub_infos) + protoAdapter.encodedSizeWithTag(10, anonymousClass02442.HDR_type) + protoAdapter.encodedSizeWithTag(11, anonymousClass02442.HDR_bit) + protoAdapter.encodedSizeWithTag(12, anonymousClass02442.video_extra) + protoAdapter.encodedSizeWithTag(13, anonymousClass02442.format);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(14, anonymousClass02442.fps) + protoAdapter4.encodedSizeWithTag(15, anonymousClass02442.bandwidth) + protoAdapter.encodedSizeWithTag(16, anonymousClass02442.fid_profile_labels) + anonymousClass02442.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0244 anonymousClass0244) {
            AnonymousClass0244 anonymousClass02442 = anonymousClass0244;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, anonymousClass02442.gear_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, anonymousClass02442.quality_type);
            protoAdapter2.encodeWithTag(protoWriter, 3, anonymousClass02442.bit_rate);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 4, anonymousClass02442.play_addr);
            protoAdapter2.encodeWithTag(protoWriter, 5, anonymousClass02442.is_h265);
            protoAdapter3.encodeWithTag(protoWriter, 6, anonymousClass02442.play_addr_265);
            protoAdapter2.encodeWithTag(protoWriter, 7, anonymousClass02442.is_bytevc1);
            protoAdapter3.encodeWithTag(protoWriter, 8, anonymousClass02442.play_addr_bytevc1);
            C691702mx.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, anonymousClass02442.dub_infos);
            protoAdapter.encodeWithTag(protoWriter, 10, anonymousClass02442.HDR_type);
            protoAdapter.encodeWithTag(protoWriter, 11, anonymousClass02442.HDR_bit);
            protoAdapter.encodeWithTag(protoWriter, 12, anonymousClass02442.video_extra);
            protoAdapter.encodeWithTag(protoWriter, 13, anonymousClass02442.format);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            protoAdapter4.encodeWithTag(protoWriter, 14, anonymousClass02442.fps);
            protoAdapter4.encodeWithTag(protoWriter, 15, anonymousClass02442.bandwidth);
            protoAdapter.encodeWithTag(protoWriter, 16, anonymousClass02442.fid_profile_labels);
            protoWriter.writeBytes(anonymousClass02442.unknownFields());
        }
    };
    public String HDR_bit;
    public String HDR_type;
    public Long bandwidth;
    public Integer bit_rate;
    public List<C691702mx> dub_infos;
    public String fid_profile_labels;
    public String format;
    public Long fps;
    public String gear_name;
    public Integer is_bytevc1;
    public Integer is_h265;
    public C673002jw play_addr;
    public C673002jw play_addr_265;
    public C673002jw play_addr_bytevc1;
    public Integer quality_type;
    public String video_extra;

    public AnonymousClass0244() {
        super(ADAPTER, ByteString.EMPTY);
        this.dub_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02LI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
