package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460710I4v {
    public static final Integer LIZ(C869590Y9l c869590Y9l) {
        boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
        int i = 2131832071;
        if (Intrinsics.LJFF(c869590Y9l.getScene(), "story_reply")) {
            if (!zLJJJJIZL) {
                i = 2131832072;
            }
            return Integer.valueOf(i);
        }
        int i2 = 2131849149;
        if (Intrinsics.LJFF(c869590Y9l.getScene(), "story_reaction")) {
            if (!zLJJJJIZL) {
                i2 = 2131849148;
            }
            return Integer.valueOf(i2);
        }
        if (C0ZDX.LJJJJJ(c869590Y9l)) {
            if (!zLJJJJIZL) {
                i = 2131832072;
            }
            return Integer.valueOf(i);
        }
        if (IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJI(c869590Y9l.getScene())) {
            if (!zLJJJJIZL) {
                i2 = 2131849148;
            }
            return Integer.valueOf(i2);
        }
        return null;
    }

    public static final Integer LIZIZ(C869590Y9l c869590Y9l) {
        int i;
        boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
        int i2 = 2131832071;
        if (Intrinsics.LJFF(c869590Y9l.getScene(), "story_reply")) {
            if (!zLJJJJIZL) {
                i2 = 2131832072;
            }
            return Integer.valueOf(i2);
        }
        if (Intrinsics.LJFF(c869590Y9l.getScene(), "story_reaction")) {
            if (zLJJJJIZL) {
                i = 2131849149;
            } else {
                i = 2131849148;
            }
            return Integer.valueOf(i);
        }
        if (C0ZDX.LJJJJJ(c869590Y9l)) {
            if (!zLJJJJIZL) {
                i2 = 2131832072;
            }
            return Integer.valueOf(i2);
        }
        return null;
    }

    public static final IMUser LJ(C869590Y9l c869590Y9l) {
        String refmsg_uid;
        String refmsg_sec_uid;
        BaseContent.ReferenceVideo refVideo;
        ReferenceInfoHint referenceInfoHintLJIIIZ = C0ZDX.LJIIIZ(c869590Y9l);
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        if (referenceInfoHintLJIIIZ != null) {
            refmsg_uid = referenceInfoHintLJIIIZ.getRefmsg_uid();
            refmsg_sec_uid = referenceInfoHintLJIIIZ.getRefmsg_sec_uid();
        } else {
            refmsg_uid = null;
            refmsg_sec_uid = null;
        }
        IMUser iMUserLIZLLL = c1bgsLJ.LIZLLL(refmsg_uid, refmsg_sec_uid, "im_chat_quoted_msg");
        if (iMUserLIZLLL == null) {
            BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
            if (orParseJsonContent == null || (refVideo = orParseJsonContent.getRefVideo()) == null) {
                return null;
            }
            return C069P.LIZ().LJ().LIZLLL(refVideo.getRefVideoAuthorUid(), refVideo.getRefVideoAuthorSecUid(), "im_chat_quoted_msg");
        }
        return iMUserLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0I4Y<X.InterfaceC460300I3g> LIZJ(boolean r5, java.lang.Integer r6, X.C869590Y9l r7, android.content.Context r8) {
        /*
            r4 = 0
            if (r7 == 0) goto La0
            if (r8 == 0) goto La0
            boolean r0 = X.C0ZDX.LJJIJIIJI(r7)
            if (r0 == 0) goto La0
            X.0I3V r3 = new X.0I3V
            X.04wF r2 = new X.04wF
            int r1 = r7.getMsgType()
            r0 = 5
            if (r1 == r0) goto L7c
            r0 = 7
            if (r1 == r0) goto L58
            java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate.class
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C0Z2Z.LIZ(r7, r0)
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent r0 = r0.og()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r0 = r0.text
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.im.message.content.BaseText r4 = new com.ss.android.ugc.aweme.im.message.content.BaseText
            java.lang.String r5 = r0.text
            java.lang.String r1 = r0.senderStarlingKey
            java.lang.String r0 = r0.receiverStarlingKey
            r4.<init>(r5, r1, r0)
        L36:
            boolean r0 = X.C0ZDX.LJJJJIZL(r7)
            if (r0 == 0) goto L53
            if (r4 == 0) goto L4a
            java.lang.String r0 = r4.senderStarling
        L40:
            java.lang.String r0 = com.ss.android.ugc.aweme.im.message.content.TextContentKt.getTextByStarlingKey(r0, r8)
            if (r0 != 0) goto L4c
            java.lang.String r0 = r4.text
            if (r0 != 0) goto L4c
        L4a:
            java.lang.String r0 = ""
        L4c:
            r2.<init>(r0)
            r3.<init>(r2)
            return r3
        L53:
            if (r4 == 0) goto L4a
            java.lang.String r0 = r4.receiverStarling
            goto L40
        L58:
            java.lang.Class<com.ss.android.ugc.aweme.im.message.content.BaseContent> r0 = com.ss.android.ugc.aweme.im.message.content.BaseContent.class
            com.ss.android.ugc.aweme.im.message.content.BaseContent r1 = com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt.getOrParseJsonContent(r7, r0)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.message.content.TextContent
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.im.message.content.TextContent r1 = (com.ss.android.ugc.aweme.im.message.content.TextContent) r1
            if (r1 == 0) goto L4a
            com.ss.android.ugc.aweme.im.message.content.BaseHeader r0 = r1.getHeader()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.im.message.content.BaseText r4 = r0.text
            if (r4 == 0) goto L4a
            boolean r0 = X.C0ZDX.LJJJJIZL(r7)
            if (r0 == 0) goto L79
            java.lang.String r0 = r4.senderStarling
            goto L40
        L79:
            java.lang.String r0 = r4.receiverStarling
            goto L40
        L7c:
            java.lang.Class<com.ss.android.ugc.aweme.im.message.content.BaseContent> r0 = com.ss.android.ugc.aweme.im.message.content.BaseContent.class
            com.ss.android.ugc.aweme.im.message.content.BaseContent r1 = com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt.getOrParseJsonContent(r7, r0)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.message.content.GifContent
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.im.message.content.GifContent r1 = (com.ss.android.ugc.aweme.im.message.content.GifContent) r1
            if (r1 == 0) goto L4a
            com.ss.android.ugc.aweme.im.message.content.BaseHeader r0 = r1.getHeader()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.im.message.content.BaseText r4 = r0.text
            if (r4 == 0) goto L4a
            boolean r0 = X.C0ZDX.LJJJJIZL(r7)
            if (r0 == 0) goto L9d
            java.lang.String r0 = r4.senderStarling
            goto L40
        L9d:
            java.lang.String r0 = r4.receiverStarling
            goto L40
        La0:
            if (r5 == 0) goto Lb6
            if (r6 == 0) goto Lb3
            X.0I3V r2 = new X.0I3V
            X.04sB r1 = new X.04sB
            int r0 = r6.intValue()
            r1.<init>(r0, r4)
            r2.<init>(r1)
            return r2
        Lb3:
            X.0I4H r2 = X.C0I4H.LIZ
            return r2
        Lb6:
            X.0I4H r2 = X.C0I4H.LIZ
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C460710I4v.LIZJ(boolean, java.lang.Integer, X.0Y9l, android.content.Context):X.0I4Y");
    }

    public static final AbstractC455680Htu LIZLLL(boolean z, Long l, final long j, final Long l2) {
        long jLongValue;
        if (z && l != null) {
            final long jLongValue2 = l.longValue();
            return new AbstractC455680Htu(jLongValue2, j, l2) { // from class: X.0Htq
                public final long LIZJ;
                public final long LIZLLL;
                public final Long LJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C455640Htq)) {
                        return false;
                    }
                    C455640Htq c455640Htq = (C455640Htq) obj;
                    return this.LIZJ == c455640Htq.LIZJ && this.LIZLLL == c455640Htq.LIZLLL && Intrinsics.LJFF(this.LJ, c455640Htq.LJ);
                }

                public final int hashCode() {
                    int iY2 = ((C786410Ut5.Y2(this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
                    Long l3 = this.LJ;
                    return iY2 + (l3 == null ? 0 : l3.hashCode());
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TextMessageClick(targetMsgId=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", clickedMsgId=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", messageType=");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC455680Htu
                public final void LIZ(View view, MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility) {
                    messageListQuotedMessageClickAbility.KZ0(this.LIZ, this.LJ, this.LIZLLL, this.LIZJ);
                }

                {
                    super(jLongValue2, l2);
                    this.LIZJ = jLongValue2;
                    this.LIZLLL = j;
                    this.LJ = l2;
                }
            };
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        return new C455650Htr(jLongValue, l2);
    }
}
