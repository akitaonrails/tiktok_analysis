package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0285, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0285 extends Message<AnonymousClass0285, C02JK> {
    public static final ProtoAdapter<AnonymousClass0285> ADAPTER = new ProtoAdapter<AnonymousClass0285>() { // from class: X.0231
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0285 decode(ProtoReader protoReader) {
            AnonymousClass0285 anonymousClass0285 = new AnonymousClass0285();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0285.mix_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0285.mix_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0285.cover_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0285.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0285.status = C627202cY.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0285.statis = C02EJ.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0285.desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0285.author = C5189020l.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0285.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0285.share_info = C5271023p.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0285;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0285 anonymousClass0285) {
            AnonymousClass0285 anonymousClass02852 = anonymousClass0285;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02852.mix_id) + protoAdapter.encodedSizeWithTag(2, anonymousClass02852.mix_name);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02852.cover_url) + protoAdapter2.encodedSizeWithTag(4, anonymousClass02852.icon_url) + C627202cY.ADAPTER.encodedSizeWithTag(5, anonymousClass02852.status) + C02EJ.ADAPTER.encodedSizeWithTag(6, anonymousClass02852.statis) + protoAdapter.encodedSizeWithTag(7, anonymousClass02852.desc) + C5189020l.ADAPTER.encodedSizeWithTag(8, anonymousClass02852.author) + protoAdapter.encodedSizeWithTag(9, anonymousClass02852.extra) + C5271023p.ADAPTER.encodedSizeWithTag(10, anonymousClass02852.share_info) + anonymousClass02852.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0285 anonymousClass0285) {
            AnonymousClass0285 anonymousClass02852 = anonymousClass0285;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, anonymousClass02852.mix_id);
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02852.mix_name);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 3, anonymousClass02852.cover_url);
            protoAdapter2.encodeWithTag(protoWriter, 4, anonymousClass02852.icon_url);
            C627202cY.ADAPTER.encodeWithTag(protoWriter, 5, anonymousClass02852.status);
            C02EJ.ADAPTER.encodeWithTag(protoWriter, 6, anonymousClass02852.statis);
            protoAdapter.encodeWithTag(protoWriter, 7, anonymousClass02852.desc);
            C5189020l.ADAPTER.encodeWithTag(protoWriter, 8, anonymousClass02852.author);
            protoAdapter.encodeWithTag(protoWriter, 9, anonymousClass02852.extra);
            C5271023p.ADAPTER.encodeWithTag(protoWriter, 10, anonymousClass02852.share_info);
            protoWriter.writeBytes(anonymousClass02852.unknownFields());
        }
    };
    public C5189020l author;
    public C673002jw cover_url;
    public String desc;
    public String extra;
    public C673002jw icon_url;
    public String mix_id;
    public String mix_name;
    public C5271023p share_info;
    public C02EJ statis;
    public C627202cY status;

    public AnonymousClass0285() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
