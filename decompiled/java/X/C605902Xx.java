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

/* JADX INFO: renamed from: X.02Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C605902Xx extends Message<C605902Xx, C606002Xy> {
    public static final ProtoAdapter<C605902Xx> ADAPTER = new ProtoAdapter<C605902Xx>() { // from class: X.02Xw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C605902Xx decode(ProtoReader protoReader) {
            C605902Xx c605902Xx = new C605902Xx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c605902Xx.location = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c605902Xx.audio_uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c605902Xx.utterances.add(C5335026b.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c605902Xx.auto_captions.add(C02Y0.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c605902Xx.disable = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c605902Xx.src_lang = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c605902Xx.position = C725202sM.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c605902Xx.appearance = C2260481Ddm.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c605902Xx.is_translatable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c605902Xx.caption_lines = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c605902Xx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C605902Xx c605902Xx) {
            C605902Xx c605902Xx2 = c605902Xx;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c605902Xx2.location);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c605902Xx2.audio_uri) + C5335026b.ADAPTER.asRepeated().encodedSizeWithTag(3, c605902Xx2.utterances) + C02Y0.ADAPTER.asRepeated().encodedSizeWithTag(4, c605902Xx2.auto_captions);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, c605902Xx2.disable) + protoAdapter.encodedSizeWithTag(6, c605902Xx2.src_lang) + C725202sM.ADAPTER.encodedSizeWithTag(7, c605902Xx2.position) + C2260481Ddm.ADAPTER.encodedSizeWithTag(8, c605902Xx2.appearance) + ProtoAdapter.BOOL.encodedSizeWithTag(9, c605902Xx2.is_translatable) + protoAdapter2.encodedSizeWithTag(10, c605902Xx2.caption_lines) + c605902Xx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C605902Xx c605902Xx) {
            C605902Xx c605902Xx2 = c605902Xx;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c605902Xx2.location);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c605902Xx2.audio_uri);
            C5335026b.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c605902Xx2.utterances);
            C02Y0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c605902Xx2.auto_captions);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 5, c605902Xx2.disable);
            protoAdapter.encodeWithTag(protoWriter, 6, c605902Xx2.src_lang);
            C725202sM.ADAPTER.encodeWithTag(protoWriter, 7, c605902Xx2.position);
            C2260481Ddm.ADAPTER.encodeWithTag(protoWriter, 8, c605902Xx2.appearance);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, c605902Xx2.is_translatable);
            protoAdapter2.encodeWithTag(protoWriter, 10, c605902Xx2.caption_lines);
            protoWriter.writeBytes(c605902Xx2.unknownFields());
        }
    };
    public C2260481Ddm appearance;
    public String audio_uri;
    public List<C02Y0> auto_captions;
    public Long caption_lines;
    public Long disable;
    public Boolean is_translatable;
    public Integer location;
    public C725202sM position;
    public String src_lang;
    public List<C5335026b> utterances;

    public C605902Xx() {
        super(ADAPTER, ByteString.EMPTY);
        this.utterances = C1516540pZE.LJIIIIZZ();
        this.auto_captions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C606002Xy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
