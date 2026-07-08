package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02A1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02A1 extends Message<C02A1, C02M1> {
    public static final ProtoAdapter<C02A1> ADAPTER = new ProtoAdapter<C02A1>() { // from class: X.024J
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02A1 decode(ProtoReader protoReader) {
            C02A1 c02a1 = new C02A1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02a1.uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02a1.nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02a1.signature = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02a1.avatar_thumb = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02a1.follow_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02a1.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c02a1.user_rate = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c02a1.avatar_larger = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02a1.hit_task_info = C735002tw.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02a1.unique_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c02a1.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02a1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02A1 c02a1) {
            C02A1 c02a12 = c02a1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02a12.uid) + protoAdapter.encodedSizeWithTag(2, c02a12.nickname) + protoAdapter.encodedSizeWithTag(3, c02a12.signature);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02a12.avatar_thumb);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c02a12.follow_status) + protoAdapter3.encodedSizeWithTag(6, c02a12.status) + protoAdapter3.encodedSizeWithTag(7, c02a12.user_rate) + protoAdapter2.encodedSizeWithTag(8, c02a12.avatar_larger) + C735002tw.ADAPTER.encodedSizeWithTag(9, c02a12.hit_task_info) + protoAdapter.encodedSizeWithTag(10, c02a12.unique_id) + protoAdapter.encodedSizeWithTag(11, c02a12.sec_uid) + c02a12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02A1 c02a1) {
            C02A1 c02a12 = c02a1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02a12.uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c02a12.nickname);
            protoAdapter.encodeWithTag(protoWriter, 3, c02a12.signature);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02a12.avatar_thumb);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 5, c02a12.follow_status);
            protoAdapter3.encodeWithTag(protoWriter, 6, c02a12.status);
            protoAdapter3.encodeWithTag(protoWriter, 7, c02a12.user_rate);
            protoAdapter2.encodeWithTag(protoWriter, 8, c02a12.avatar_larger);
            C735002tw.ADAPTER.encodeWithTag(protoWriter, 9, c02a12.hit_task_info);
            protoAdapter.encodeWithTag(protoWriter, 10, c02a12.unique_id);
            protoAdapter.encodeWithTag(protoWriter, 11, c02a12.sec_uid);
            protoWriter.writeBytes(c02a12.unknownFields());
        }
    };
    public C673002jw avatar_larger;
    public C673002jw avatar_thumb;
    public Integer follow_status;
    public C735002tw hit_task_info;
    public String nickname;
    public String sec_uid;
    public String signature;
    public Integer status;
    public String uid;
    public String unique_id;
    public Integer user_rate;

    public C02A1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02M1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
