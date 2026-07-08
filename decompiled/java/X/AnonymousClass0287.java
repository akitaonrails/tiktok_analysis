package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0287, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0287 extends Message<AnonymousClass0287, C574102Lr> {
    public static final ProtoAdapter<AnonymousClass0287> ADAPTER = new ProtoAdapter<AnonymousClass0287>() { // from class: X.023E
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0287 decode(ProtoReader protoReader) {
            AnonymousClass0287 anonymousClass0287 = new AnonymousClass0287();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0287.room = C022A.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0287.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0287.fans_struct = C554102Dz.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0287.tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0287.tag_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0287.icon = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0287.distance = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0287.rawdata = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0287.ecom_rec_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0287.enter_boost_data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0287;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0287 anonymousClass0287) {
            AnonymousClass0287 anonymousClass02872 = anonymousClass0287;
            int iEncodedSizeWithTag = C022A.ADAPTER.encodedSizeWithTag(1, anonymousClass02872.room) + ProtoAdapter.INT32.encodedSizeWithTag(2, anonymousClass02872.type) + C554102Dz.ADAPTER.encodedSizeWithTag(3, anonymousClass02872.fans_struct);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, anonymousClass02872.tag) + ProtoAdapter.INT64.encodedSizeWithTag(5, anonymousClass02872.tag_id) + C673002jw.ADAPTER.encodedSizeWithTag(6, anonymousClass02872.icon) + protoAdapter.encodedSizeWithTag(7, anonymousClass02872.distance) + protoAdapter.encodedSizeWithTag(8, anonymousClass02872.rawdata) + protoAdapter.encodedSizeWithTag(9, anonymousClass02872.ecom_rec_info) + protoAdapter.encodedSizeWithTag(10, anonymousClass02872.enter_boost_data) + anonymousClass02872.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0287 anonymousClass0287) {
            AnonymousClass0287 anonymousClass02872 = anonymousClass0287;
            C022A.ADAPTER.encodeWithTag(protoWriter, 1, anonymousClass02872.room);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, anonymousClass02872.type);
            C554102Dz.ADAPTER.encodeWithTag(protoWriter, 3, anonymousClass02872.fans_struct);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, anonymousClass02872.tag);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, anonymousClass02872.tag_id);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 6, anonymousClass02872.icon);
            protoAdapter.encodeWithTag(protoWriter, 7, anonymousClass02872.distance);
            protoAdapter.encodeWithTag(protoWriter, 8, anonymousClass02872.rawdata);
            protoAdapter.encodeWithTag(protoWriter, 9, anonymousClass02872.ecom_rec_info);
            protoAdapter.encodeWithTag(protoWriter, 10, anonymousClass02872.enter_boost_data);
            protoWriter.writeBytes(anonymousClass02872.unknownFields());
        }
    };
    public String distance;
    public String ecom_rec_info;
    public String enter_boost_data;
    public C554102Dz fans_struct;
    public C673002jw icon;
    public String rawdata;
    public C022A room;
    public String tag;
    public Long tag_id;
    public Integer type;

    public AnonymousClass0287() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C574102Lr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
