package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CE0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CE0 extends Message<C1CE0, C2226931CDz> {
    public static final ProtoAdapter<C1CE0> ADAPTER = new ProtoAdapter<C1CE0>() { // from class: X.1CE1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CE0 decode(ProtoReader protoReader) {
            C1CE0 c1ce0 = new C1CE0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1ce0.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1ce0.rating = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 3:
                            c1ce0.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1ce0.create_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1ce0.user = C5189020l.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1ce0.reply = C1CE0.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1ce0.reply_ref_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1ce0.is_edited = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1ce0.can_edit = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1ce0.can_reply = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ce0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CE0 c1ce0) {
            C1CE0 c1ce02 = c1ce0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1ce02.id) + ProtoAdapter.FLOAT.encodedSizeWithTag(2, c1ce02.rating) + protoAdapter.encodedSizeWithTag(3, c1ce02.text) + ProtoAdapter.INT64.encodedSizeWithTag(4, c1ce02.create_time) + C5189020l.ADAPTER.encodedSizeWithTag(5, c1ce02.user) + C1CE0.ADAPTER.encodedSizeWithTag(6, c1ce02.reply) + protoAdapter.encodedSizeWithTag(7, c1ce02.reply_ref_id);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(8, c1ce02.is_edited) + protoAdapter2.encodedSizeWithTag(9, c1ce02.can_edit) + protoAdapter2.encodedSizeWithTag(10, c1ce02.can_reply) + c1ce02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CE0 c1ce0) {
            C1CE0 c1ce02 = c1ce0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1ce02.id);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, c1ce02.rating);
            protoAdapter.encodeWithTag(protoWriter, 3, c1ce02.text);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c1ce02.create_time);
            C5189020l.ADAPTER.encodeWithTag(protoWriter, 5, c1ce02.user);
            C1CE0.ADAPTER.encodeWithTag(protoWriter, 6, c1ce02.reply);
            protoAdapter.encodeWithTag(protoWriter, 7, c1ce02.reply_ref_id);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 8, c1ce02.is_edited);
            protoAdapter2.encodeWithTag(protoWriter, 9, c1ce02.can_edit);
            protoAdapter2.encodeWithTag(protoWriter, 10, c1ce02.can_reply);
            protoWriter.writeBytes(c1ce02.unknownFields());
        }
    };
    public Boolean can_edit;
    public Boolean can_reply;
    public Long create_time;
    public String id;
    public Boolean is_edited;
    public Float rating;
    public C1CE0 reply;
    public String reply_ref_id;
    public String text;
    public C5189020l user;

    public C1CE0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2226931CDz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
