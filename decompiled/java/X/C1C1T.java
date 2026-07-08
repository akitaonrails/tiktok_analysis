package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1T extends Message<C1C1T, C1C1U> {
    public static final ProtoAdapter<C1C1T> ADAPTER = new ProtoAdapter<C1C1T>() { // from class: X.1C1S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1T decode(ProtoReader protoReader) {
            C1C1T c1c1t = new C1C1T();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1c1t.emoji_quick_reply = C1517280paQ.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c1c1t.story_note = C1517700pb6.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c1c1t.secret_reply_blob = C1C1Q.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c1c1t.attribution_link_story_anchor_blob = C2222971BzT.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1c1t.shared_comment_blob = C2223001BzW.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1c1t.story_archive_blob = C1517460pai.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1c1t.share_story_metadata = C1610010rzz.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c1c1t.reveal_story_blob = C1517550par.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1c1t.allow_story_reshare_blob = C1517580pau.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1c1t.whee_info = C1C1W.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c1t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C1T c1c1t) {
            C1C1T c1c1t2 = c1c1t;
            return C1517280paQ.ADAPTER.encodedSizeWithTag(1, c1c1t2.emoji_quick_reply) + C1517700pb6.ADAPTER.encodedSizeWithTag(2, c1c1t2.story_note) + C1C1Q.ADAPTER.encodedSizeWithTag(3, c1c1t2.secret_reply_blob) + C2222971BzT.ADAPTER.encodedSizeWithTag(4, c1c1t2.attribution_link_story_anchor_blob) + C2223001BzW.ADAPTER.encodedSizeWithTag(5, c1c1t2.shared_comment_blob) + C1517460pai.ADAPTER.encodedSizeWithTag(6, c1c1t2.story_archive_blob) + C1610010rzz.ADAPTER.encodedSizeWithTag(7, c1c1t2.share_story_metadata) + C1517550par.ADAPTER.encodedSizeWithTag(8, c1c1t2.reveal_story_blob) + C1517580pau.ADAPTER.encodedSizeWithTag(9, c1c1t2.allow_story_reshare_blob) + C1C1W.ADAPTER.encodedSizeWithTag(10, c1c1t2.whee_info) + c1c1t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C1T c1c1t) {
            C1C1T c1c1t2 = c1c1t;
            C1517280paQ.ADAPTER.encodeWithTag(protoWriter, 1, c1c1t2.emoji_quick_reply);
            C1517700pb6.ADAPTER.encodeWithTag(protoWriter, 2, c1c1t2.story_note);
            C1C1Q.ADAPTER.encodeWithTag(protoWriter, 3, c1c1t2.secret_reply_blob);
            C2222971BzT.ADAPTER.encodeWithTag(protoWriter, 4, c1c1t2.attribution_link_story_anchor_blob);
            C2223001BzW.ADAPTER.encodeWithTag(protoWriter, 5, c1c1t2.shared_comment_blob);
            C1517460pai.ADAPTER.encodeWithTag(protoWriter, 6, c1c1t2.story_archive_blob);
            C1610010rzz.ADAPTER.encodeWithTag(protoWriter, 7, c1c1t2.share_story_metadata);
            C1517550par.ADAPTER.encodeWithTag(protoWriter, 8, c1c1t2.reveal_story_blob);
            C1517580pau.ADAPTER.encodeWithTag(protoWriter, 9, c1c1t2.allow_story_reshare_blob);
            C1C1W.ADAPTER.encodeWithTag(protoWriter, 10, c1c1t2.whee_info);
            protoWriter.writeBytes(c1c1t2.unknownFields());
        }
    };
    public C1517580pau allow_story_reshare_blob;
    public C2222971BzT attribution_link_story_anchor_blob;
    public C1517280paQ emoji_quick_reply;
    public C1517550par reveal_story_blob;
    public C1C1Q secret_reply_blob;
    public C1610010rzz share_story_metadata;
    public C2223001BzW shared_comment_blob;
    public C1517460pai story_archive_blob;
    public C1517700pb6 story_note;
    public C1C1W whee_info;

    public C1C1T() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C1U newBuilder() {
        return null;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C1517280paQ c1517280paQ = this.emoji_quick_reply;
        int iHashCode2 = (iHashCode + (c1517280paQ != null ? c1517280paQ.hashCode() : 0)) * 37;
        C1517700pb6 c1517700pb6 = this.story_note;
        int iHashCode3 = (iHashCode2 + (c1517700pb6 != null ? c1517700pb6.hashCode() : 0)) * 37;
        C1C1Q c1c1q = this.secret_reply_blob;
        int iHashCode4 = (iHashCode3 + (c1c1q != null ? c1c1q.hashCode() : 0)) * 37;
        C2222971BzT c2222971BzT = this.attribution_link_story_anchor_blob;
        int iHashCode5 = (iHashCode4 + (c2222971BzT != null ? c2222971BzT.hashCode() : 0)) * 37;
        C2223001BzW c2223001BzW = this.shared_comment_blob;
        int iHashCode6 = (iHashCode5 + (c2223001BzW != null ? c2223001BzW.hashCode() : 0)) * 37;
        C1517460pai c1517460pai = this.story_archive_blob;
        int iHashCode7 = (iHashCode6 + (c1517460pai != null ? c1517460pai.hashCode() : 0)) * 37;
        C1610010rzz c1610010rzz = this.share_story_metadata;
        int iHashCode8 = (iHashCode7 + (c1610010rzz != null ? c1610010rzz.hashCode() : 0)) * 37;
        C1517550par c1517550par = this.reveal_story_blob;
        int iHashCode9 = (iHashCode8 + (c1517550par != null ? c1517550par.hashCode() : 0)) * 37;
        C1517580pau c1517580pau = this.allow_story_reshare_blob;
        int iHashCode10 = (iHashCode9 + (c1517580pau != null ? c1517580pau.hashCode() : 0)) * 37;
        C1C1W c1c1w = this.whee_info;
        int iHashCode11 = iHashCode10 + (c1c1w != null ? c1c1w.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
