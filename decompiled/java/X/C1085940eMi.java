package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085940eMi {
    public long LIZLLL;
    public final int LIZ = 100;
    public final ArrayDeque<AbstractC1110800f0o<?>> LIZIZ = new ArrayDeque<>(100);
    public final Set<Integer> LIZJ = C093Y.LJ(Integer.valueOf(C001A.GIFT.getIntType()), Integer.valueOf(C001A.DOODLE_GIFT.getIntType()), Integer.valueOf(C001A.CHAT.getIntType()), Integer.valueOf(C001A.MEMBER.getIntType()), Integer.valueOf(C001A.SCREEN.getIntType()), Integer.valueOf(C001A.DIGG.getIntType()), Integer.valueOf(C001A.SOCIAL.getIntType()), Integer.valueOf(C001A.LIKE.getIntType()), Integer.valueOf(C001A.ROOM.getIntType()), Integer.valueOf(C001A.LIVE_GAME_INTRO_MESSAGE.getIntType()));
    public final C01GW LJ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(174));

    public final void LIZ(AbstractC1110800f0o<?> abstractC1110800f0o) {
        AbstractC1136060ffY abstractC1136060ffY = abstractC1110800f0o.LJIL;
        int intType = abstractC1136060ffY.getIntType();
        MESSAGE message = abstractC1110800f0o.LJIL;
        if (this.LIZJ.contains(Integer.valueOf(intType))) {
            if (intType == C001A.GIFT.getIntType()) {
                if (message instanceof GiftMessage) {
                    GiftMessage giftMessage = (GiftMessage) message;
                    Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(giftMessage.giftId);
                    if (giftFindGiftById != null && giftFindGiftById.combo && giftMessage.LLILLL) {
                        return;
                    }
                }
            } else if (intType == C001A.SOCIAL.getIntType()) {
                if ((abstractC1110800f0o instanceof C239500wD) && ((SocialMessage) abstractC1110800f0o.LJIL).action != 1) {
                    return;
                }
            } else if (intType == C001A.MEMBER.getIntType()) {
                if ((abstractC1110800f0o instanceof C234500vP) && ((MemberMessage) abstractC1110800f0o.LJIL).action != 1) {
                    return;
                }
            } else if (intType == C001A.ROOM.getIntType() && (message instanceof RoomMessage) && ((RoomMessage) message).source != 3 && !Intrinsics.LJFF(message.baseMessage.describe, "LiveGoal") && !Intrinsics.LJFF(((RoomMessage) message).scene, "living_post_highlight_guide")) {
                return;
            }
            Iterator it2 = ((ArrayList) this.LJ.getValue()).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC1085950eMj) it2.next()).LIZ(abstractC1136060ffY)) {
                    return;
                }
            }
            int intType2 = abstractC1110800f0o.LJIL.getIntType();
            MESSAGE message2 = abstractC1110800f0o.LJIL;
            if (intType2 == C001A.LIKE.getIntType() && (message2 instanceof LikeMessage)) {
                LikeMessage likeMessage = (LikeMessage) message2;
                if (this.LIZLLL == likeMessage.user.getId()) {
                    return;
                } else {
                    this.LIZLLL = likeMessage.user.getId();
                }
            }
            ArrayDeque<AbstractC1110800f0o<?>> arrayDeque = this.LIZIZ;
            if (arrayDeque.size() < this.LIZ) {
                arrayDeque.add(abstractC1110800f0o);
            }
        }
    }
}
