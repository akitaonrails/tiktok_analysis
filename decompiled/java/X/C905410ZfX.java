package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905410ZfX extends Message<C905410ZfX, C905390ZfV> {
    public static final ProtoAdapter<C905410ZfX> ADAPTER = new ProtoAdapter<C905410ZfX>() { // from class: X.0ZfY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905410ZfX decode(ProtoReader protoReader) {
            C905390ZfV c905390ZfV = new C905390ZfV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c905390ZfV.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c905390ZfV.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c905390ZfV.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c905390ZfV.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c905390ZfV.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c905390ZfV.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c905390ZfV.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c905390ZfV.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C905410ZfX c905410ZfX) {
            C905410ZfX c905410ZfX2 = c905410ZfX;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c905410ZfX2.has_caption_mode_mention) + protoAdapter.encodedSizeWithTag(2, c905410ZfX2.has_text_mode_mention) + protoAdapter.encodedSizeWithTag(3, c905410ZfX2.has_sticker_mention) + protoAdapter.encodedSizeWithTag(4, c905410ZfX2.has_post_page_mention) + protoAdapter.encodedSizeWithTag(5, c905410ZfX2.has_story_mention_after_publish_share_panel) + protoAdapter.encodedSizeWithTag(6, c905410ZfX2.has_story_mention_after_publish_feed_bottom) + c905410ZfX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905410ZfX redact(C905410ZfX c905410ZfX) {
            C905390ZfV c905390ZfVNewBuilder = c905410ZfX.newBuilder();
            c905390ZfVNewBuilder.clearUnknownFields();
            return c905390ZfVNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C905410ZfX c905410ZfX) {
            C905410ZfX c905410ZfX2 = c905410ZfX;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c905410ZfX2.has_caption_mode_mention);
            protoAdapter.encodeWithTag(protoWriter, 2, c905410ZfX2.has_text_mode_mention);
            protoAdapter.encodeWithTag(protoWriter, 3, c905410ZfX2.has_sticker_mention);
            protoAdapter.encodeWithTag(protoWriter, 4, c905410ZfX2.has_post_page_mention);
            protoAdapter.encodeWithTag(protoWriter, 5, c905410ZfX2.has_story_mention_after_publish_share_panel);
            protoAdapter.encodeWithTag(protoWriter, 6, c905410ZfX2.has_story_mention_after_publish_feed_bottom);
            protoWriter.writeBytes(c905410ZfX2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_CAPTION_MODE_MENTION;
    public static final Boolean DEFAULT_HAS_POST_PAGE_MENTION;
    public static final Boolean DEFAULT_HAS_STICKER_MENTION;
    public static final Boolean DEFAULT_HAS_STORY_MENTION_AFTER_PUBLISH_FEED_BOTTOM;
    public static final Boolean DEFAULT_HAS_STORY_MENTION_AFTER_PUBLISH_SHARE_PANEL;
    public static final Boolean DEFAULT_HAS_TEXT_MODE_MENTION;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean has_caption_mode_mention;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean has_post_page_mention;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean has_sticker_mention;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    public final Boolean has_story_mention_after_publish_feed_bottom;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean has_story_mention_after_publish_share_panel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean has_text_mode_mention;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_HAS_CAPTION_MODE_MENTION = bool;
        DEFAULT_HAS_TEXT_MODE_MENTION = bool;
        DEFAULT_HAS_STICKER_MENTION = bool;
        DEFAULT_HAS_POST_PAGE_MENTION = bool;
        DEFAULT_HAS_STORY_MENTION_AFTER_PUBLISH_SHARE_PANEL = bool;
        DEFAULT_HAS_STORY_MENTION_AFTER_PUBLISH_FEED_BOTTOM = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.has_caption_mode_mention;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.has_text_mode_mention;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.has_sticker_mention;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.has_post_page_mention;
        int iHashCode5 = (iHashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.has_story_mention_after_publish_share_panel;
        int iHashCode6 = (iHashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.has_story_mention_after_publish_feed_bottom;
        int iHashCode7 = iHashCode6 + (bool6 != null ? bool6.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C905390ZfV newBuilder() {
        C905390ZfV c905390ZfV = new C905390ZfV();
        c905390ZfV.LIZLLL = this.has_caption_mode_mention;
        c905390ZfV.LJ = this.has_text_mode_mention;
        c905390ZfV.LJFF = this.has_sticker_mention;
        c905390ZfV.LJI = this.has_post_page_mention;
        c905390ZfV.LJII = this.has_story_mention_after_publish_share_panel;
        c905390ZfV.LJIIIIZZ = this.has_story_mention_after_publish_feed_bottom;
        c905390ZfV.addUnknownFields(unknownFields());
        return c905390ZfV;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.has_caption_mode_mention != null) {
            sb.append(", has_caption_mode_mention=");
            sb.append(this.has_caption_mode_mention);
        }
        if (this.has_text_mode_mention != null) {
            sb.append(", has_text_mode_mention=");
            sb.append(this.has_text_mode_mention);
        }
        if (this.has_sticker_mention != null) {
            sb.append(", has_sticker_mention=");
            sb.append(this.has_sticker_mention);
        }
        if (this.has_post_page_mention != null) {
            sb.append(", has_post_page_mention=");
            sb.append(this.has_post_page_mention);
        }
        if (this.has_story_mention_after_publish_share_panel != null) {
            sb.append(", has_story_mention_after_publish_share_panel=");
            sb.append(this.has_story_mention_after_publish_share_panel);
        }
        if (this.has_story_mention_after_publish_feed_bottom != null) {
            sb.append(", has_story_mention_after_publish_feed_bottom=");
            sb.append(this.has_story_mention_after_publish_feed_bottom);
        }
        sb.replace(0, 2, "MentionMessageParams{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C905410ZfX)) {
            return false;
        }
        C905410ZfX c905410ZfX = (C905410ZfX) obj;
        if (unknownFields().equals(c905410ZfX.unknownFields()) && C1516540pZE.LJ(this.has_caption_mode_mention, c905410ZfX.has_caption_mode_mention) && C1516540pZE.LJ(this.has_text_mode_mention, c905410ZfX.has_text_mode_mention) && C1516540pZE.LJ(this.has_sticker_mention, c905410ZfX.has_sticker_mention) && C1516540pZE.LJ(this.has_post_page_mention, c905410ZfX.has_post_page_mention) && C1516540pZE.LJ(this.has_story_mention_after_publish_share_panel, c905410ZfX.has_story_mention_after_publish_share_panel) && C1516540pZE.LJ(this.has_story_mention_after_publish_feed_bottom, c905410ZfX.has_story_mention_after_publish_feed_bottom)) {
            return true;
        }
        return false;
    }

    public C905410ZfX(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this(bool, bool2, bool3, bool4, bool5, bool6, ByteString.EMPTY);
    }

    public C905410ZfX(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_caption_mode_mention = bool;
        this.has_text_mode_mention = bool2;
        this.has_sticker_mention = bool3;
        this.has_post_page_mention = bool4;
        this.has_story_mention_after_publish_share_panel = bool5;
        this.has_story_mention_after_publish_feed_bottom = bool6;
    }
}
