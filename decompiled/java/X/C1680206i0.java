package X;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.BlockResponse;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1680206i0 extends AbstractC1673006gq {
    public final int LL;
    public final IMUser LLILLJJLI;
    public final String LLILLL;
    public final SessionInfo LLILZ;
    public final C869590Y9l LLILZIL;
    public String LLILZLL;
    public final String LLIZ;
    public SystemContent.Key LLIZLLLIL;
    public WeakHandler LLJ;

    public static void LIZ(Object obj) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if (obj instanceof C0XIR) {
            C12ES.LJ(activityLIZIZ, 0, ((C0XIR) obj).getErrorMsg());
            return;
        }
        if (obj instanceof Exception) {
            C12ES.LIZLLL(2131835702, activityLIZIZ);
            return;
        }
        if (!(obj instanceof BlockResponse)) {
            return;
        }
        BlockResponse blockResponse = (BlockResponse) obj;
        if (blockResponse.getBlockStaus() == 1) {
            C12ES.LIZLLL(2131835673, activityLIZIZ);
        } else {
            if (blockResponse.getBlockStaus() != 0) {
                return;
            }
            C12ES.LIZLLL(2131835823, activityLIZIZ);
        }
    }

    public static boolean LIZJ(Integer num) {
        if (num == null || C13LQ.LJJIJIIJI(num, new Integer[]{25, 200001, 200003}) < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo LIZLLL(com.ss.android.ugc.aweme.im.message.content.AnimationInfo r6) {
        /*
            com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo r5 = new com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo
            com.ss.android.ugc.aweme.im.message.content.ElementDownAnimation r0 = r6.elementDownAnimation
            r4 = 0
            if (r0 == 0) goto L3e
            int r0 = r0.elementDownAnimationType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 1
            if (r1 == 0) goto L3e
            int r0 = r1.intValue()
            if (r0 != r2) goto L32
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L1b:
            com.ss.android.ugc.aweme.im.message.content.ElementDownAnimation r0 = r6.elementDownAnimation
            if (r0 == 0) goto L30
            java.lang.String r2 = r0.emoji
        L21:
            com.ss.android.ugc.aweme.socialgame.api.model.StickerMatchStruct r1 = new com.ss.android.ugc.aweme.socialgame.api.model.StickerMatchStruct
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.stickerUrl
        L27:
            r1.<init>(r4, r4, r0)
            r5.<init>(r3, r2, r1)
            return r5
        L2e:
            r0 = r4
            goto L27
        L30:
            r2 = r4
            goto L21
        L32:
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L1b
        L3e:
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1680206i0.LIZLLL(com.ss.android.ugc.aweme.im.message.content.AnimationInfo):com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1680206i0.LJFF(android.view.View):void");
    }

    public final void LJI(View view) {
        SessionInfo sessionInfo;
        String conversationId;
        String strLJFF;
        Long lLJIILIIL;
        String str;
        String str2;
        IMUser fromUser;
        Map<String, String> extra;
        Map<String, String> extra2;
        if (C06AG.LIZ == 1 && (sessionInfo = this.LLILZ) != null && (conversationId = sessionInfo.getConversationId()) != null && (strLJFF = C0YNP.LJFF(conversationId, "reduce_exposure_banner_key")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLJFF)) != null) {
            C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(lLJIILIIL.longValue());
            if (c869590Y9lLJJJ == null) {
                return;
            }
            SystemContent.Key key = this.LLIZLLLIL;
            if (key != null && (extra2 = key.getExtra()) != null) {
                str = extra2.get(Scene.SCENE_SERVICE);
            } else {
                str = null;
            }
            SystemContent.Key key2 = this.LLIZLLLIL;
            if (key2 == null || (extra = key2.getExtra()) == null || (str2 = extra.get("user_type")) == null) {
                str2 = "";
            }
            if (Intrinsics.LJFF(str, "minor_protection") || Intrinsics.LJFF(str, "age_protection")) {
                LJ(view, c869590Y9lLJJJ, str, null);
                SessionInfo sessionInfo2 = this.LLILZ;
                C0I0B.LJFF.LIZIZ();
                C830490Whz c830490Whz = new C830490Whz();
                c830490Whz.put("conversation_id", sessionInfo2.getConversationId());
                if (sessionInfo2.isMessageRequest()) {
                    c830490Whz.put("chat_type", "stranger");
                } else if (sessionInfo2.isSingleChat()) {
                    c830490Whz.put("chat_type", "private");
                }
                if ((sessionInfo2 instanceof C909290Zln) && (fromUser = ((C909290Zln) sessionInfo2).getFromUser()) != null) {
                    c830490Whz.put("relation_tag", String.valueOf(fromUser.getFollowStatus()));
                }
                c830490Whz.put(Scene.SCENE_SERVICE, str);
                c830490Whz.put("user_type", str2);
                C20684815ws.LJIILLIIL("dm_block_interaction_appeal", c830490Whz);
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i = message.what;
        if (i == 1) {
            LIZ(HandlerHook.getMessageObj(message.obj));
        } else {
            if (i != 0) {
                return;
            }
            LIZ(HandlerHook.getMessageObj(message.obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0170  */
    @Override // android.text.style.ClickableSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r24) {
        /*
            Method dump skipped, instruction units count: 2138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1680206i0.onClick(android.view.View):void");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.LL);
        textPaint.setUnderlineText(false);
    }

    public final void LIZIZ(SystemContent.Key key, Activity activity, SessionInfo sessionInfo, String str) {
        String conversationId;
        String uuid;
        String str2;
        String uuid2;
        String uuid3;
        String conversationId2;
        if (activity != null && key != null) {
            int action = key.getAction();
            String str3 = "";
            if (sessionInfo == null || (conversationId = sessionInfo.getConversationId()) == null) {
                conversationId = "";
            }
            C06H2 c06h2 = C06H2.CHAT;
            if (action != 25) {
                if (action != 200001) {
                    if (action == 200003) {
                        if (sessionInfo != null && (conversationId2 = sessionInfo.getConversationId()) != null) {
                            IStreakPetService.LIZ.getClass();
                            IStreakPetService iStreakPetServiceLIZ = C1586906Jf.LIZ();
                            C869590Y9l c869590Y9l = this.LLILZIL;
                            if (c869590Y9l != null) {
                                c869590Y9l.getScene();
                            }
                            iStreakPetServiceLIZ.LJIIIZ(conversationId2);
                        }
                        IStreakPetService.LIZ.getClass();
                        C1586906Jf.LIZ().LIZLLL(activity, C06G9.STREAK_PET_INLINE_MESSAGE, conversationId, str, C06GA.INLINE_MESSAGE.getValue(), c06h2, null, null);
                        IStreakService.LJJIIZ.getClass();
                        IStreakService iStreakServiceLIZ = C06LY.LIZ();
                        C869590Y9l c869590Y9l2 = this.LLILZIL;
                        if (c869590Y9l2 == null || (uuid3 = c869590Y9l2.getUuid()) == null) {
                            uuid3 = "";
                        }
                        if (str != null) {
                            str3 = str;
                        }
                        iStreakServiceLIZ.w(conversationId, uuid3, c06h2, str3);
                        return;
                    }
                    return;
                }
                Map<String, String> extra = key.getExtra();
                if (extra == null || (str2 = extra.get("panel_type")) == null) {
                    str2 = "";
                }
                C06ET c06etLIZ = C06EU.LIZ(str2);
                Map<String, String> extra2 = key.getExtra();
                if (extra2 != null) {
                    extra2.get("panel_schema");
                }
                Map<String, String> extra3 = key.getExtra();
                if (extra3 != null) {
                    new LinkedHashMap(extra3).remove("panel_schema");
                }
                IStreakService.LJJIIZ.getClass();
                C06LY.LIZ().N(activity, C06G9.STREAK_INLINE_MESSAGE, c06h2, c06etLIZ, conversationId, str, C06GA.INLINE_MESSAGE.getValue(), C06H4.INLINE_MESSAGE);
                IStreakService iStreakServiceLIZ2 = C06LY.LIZ();
                C869590Y9l c869590Y9l3 = this.LLILZIL;
                if (c869590Y9l3 == null || (uuid2 = c869590Y9l3.getUuid()) == null) {
                    uuid2 = "";
                }
                if (str != null) {
                    str3 = str;
                }
                iStreakServiceLIZ2.w(conversationId, uuid2, c06h2, str3);
                return;
            }
            C06ET c06et = C06ET.LIZLLL;
            IStreakService.LJJIIZ.getClass();
            C06LY.LIZ().N(activity, C06G9.STREAK_INLINE_MESSAGE, c06h2, c06et, conversationId, str, C06GA.INLINE_MESSAGE.getValue(), C06H4.INLINE_MESSAGE);
            IStreakService iStreakServiceLIZ3 = C06LY.LIZ();
            C869590Y9l c869590Y9l4 = this.LLILZIL;
            if (c869590Y9l4 == null || (uuid = c869590Y9l4.getUuid()) == null) {
                uuid = "";
            }
            if (str != null) {
                str3 = str;
            }
            iStreakServiceLIZ3.w(conversationId, uuid, c06h2, str3);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.06ZS] */
    public final void LJ(View view, C869590Y9l c869590Y9l, String str, String str2) {
        int chatType;
        SessionInfo sessionInfo = this.LLILZ;
        if (sessionInfo != null) {
            chatType = sessionInfo.getChatType();
        } else {
            chatType = -1;
        }
        C06ZU c06zu = new C06ZU();
        C817503Hh c817503Hh = C817503Hh.LL;
        AwS616S0100000_2 awS616S0100000_2 = new AwS616S0100000_2(view, 38);
        C23250099c.LIZLLL(c817503Hh, C0PEM.LIZ, null, new C06ZR(c869590Y9l, chatType, new Object() { // from class: X.06ZS
        }, c06zu, str, str2, awS616S0100000_2, null), 2);
    }

    public C1680206i0(int i, IMUser iMUser, String str, SessionInfo sessionInfo, C869590Y9l c869590Y9l) {
        String uid;
        this.LL = i;
        this.LLILLJJLI = iMUser;
        this.LLILLL = str;
        this.LLILZ = sessionInfo;
        this.LLILZIL = c869590Y9l;
        if (iMUser != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        this.LLILZLL = uid;
        if (uid == null) {
            this.LLILZLL = CardStruct.IStatusCode.DEFAULT;
        }
        String secUid = iMUser != null ? iMUser.getSecUid() : null;
        this.LLIZ = secUid;
        if (secUid == null) {
            this.LLIZ = "";
        }
        if (this.LLJ == null) {
            this.LLJ = new WeakHandler(Looper.getMainLooper(), this);
        }
    }
}
