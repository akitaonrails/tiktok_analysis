package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.029z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5437029z extends Message<C5437029z, C02KJ> {
    public static final ProtoAdapter<C5437029z> ADAPTER = new ProtoAdapter<C5437029z>() { // from class: X.023U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5437029z decode(ProtoReader protoReader) {
            C5437029z c5437029z = new C5437029z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5437029z.question_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c5437029z.user_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c5437029z.item_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c5437029z.content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5437029z.username = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5437029z.user_avatar = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5437029z.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5437029z.invite_share_info = C5271023p.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5437029z.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5437029z.category_meta = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5437029z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5437029z c5437029z) {
            C5437029z c5437029z2 = c5437029z;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5437029z2.question_id) + protoAdapter.encodedSizeWithTag(2, c5437029z2.user_id) + protoAdapter.encodedSizeWithTag(3, c5437029z2.item_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5437029z2.content) + protoAdapter2.encodedSizeWithTag(5, c5437029z2.username) + C673002jw.ADAPTER.encodedSizeWithTag(6, c5437029z2.user_avatar) + protoAdapter2.encodedSizeWithTag(7, c5437029z2.sec_uid) + C5271023p.ADAPTER.encodedSizeWithTag(8, c5437029z2.invite_share_info) + protoAdapter2.encodedSizeWithTag(9, c5437029z2.extra) + protoAdapter2.encodedSizeWithTag(10, c5437029z2.category_meta) + c5437029z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5437029z c5437029z) {
            C5437029z c5437029z2 = c5437029z;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c5437029z2.question_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c5437029z2.user_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c5437029z2.item_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c5437029z2.content);
            protoAdapter2.encodeWithTag(protoWriter, 5, c5437029z2.username);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 6, c5437029z2.user_avatar);
            protoAdapter2.encodeWithTag(protoWriter, 7, c5437029z2.sec_uid);
            C5271023p.ADAPTER.encodeWithTag(protoWriter, 8, c5437029z2.invite_share_info);
            protoAdapter2.encodeWithTag(protoWriter, 9, c5437029z2.extra);
            protoAdapter2.encodeWithTag(protoWriter, 10, c5437029z2.category_meta);
            protoWriter.writeBytes(c5437029z2.unknownFields());
        }
    };
    public String category_meta;
    public String content;
    public String extra;
    public C5271023p invite_share_info;
    public Long item_id;
    public Long question_id;
    public String sec_uid;
    public C673002jw user_avatar;
    public Long user_id;
    public String username;

    public C5437029z() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
