package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11pV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19619911pV extends AbstractC388880FMo<DMGroupChatStickerModel> {
    public final Function0<C0FT7> LJII;
    public final C0FTH LJIIIIZZ;

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.DM_GROUP_CHAT;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        float f;
        DMGroupChatStickerModel dMGroupChatStickerModel = (DMGroupChatStickerModel) stickerModel;
        BaseStickerModel baseStickerModel = dMGroupChatStickerModel.getBaseStickerModel();
        if (this.LJ.LJIIJ == EnumC391400FWg.RECORD) {
            f = 0.6f;
        } else {
            f = 1.0f;
        }
        return dMGroupChatStickerModel.copy(BaseStickerModel.copy$default(baseStickerModel, i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, 2147483646, 15, null), dMGroupChatStickerModel.groupInfo, dMGroupChatStickerModel.uiStyle, dMGroupChatStickerModel.useNewToolTip, dMGroupChatStickerModel.isAutoAdded, dMGroupChatStickerModel.eventTracking);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        return new C19620211pY(this.LIZ, (DMGroupChatStickerModel) stickerModel, c0ffo, lifecycleOwner, this.LIZIZ, this.LJFF, this.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19619911pV(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, final C390420FSm c390420FSm, Function0<? extends C0FT7> function0) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        this.LJII = function0;
        C0FTH c0fth = (C0FTH) c390420FSm.LIZIZ(C13LE.LIZ(C0FTH.class));
        this.LJIIIIZZ = c0fth;
        C390790FTx c390790FTxLIZIZ = c0fth.LIZIZ();
        ((ArrayList) c390790FTxLIZIZ.LLJJI).add(new C0FU7() { // from class: X.11pU
            @Override // X.C0FU7
            public final boolean LIZ(int i, EnumC1466150oFx enumC1466150oFx, int i2) {
                return false;
            }

            @Override // X.C0FU7
            public final EnumC1466150oFx getStickerType() {
                return EnumC1466150oFx.DM_GROUP_CHAT;
            }

            @Override // X.C0FU7
            public final List<C0FU6> LIZIZ(int i) {
                C0FTJ<StickerModel> next;
                DMGroupChatStickerModel dMGroupChatStickerModel;
                C0FFO next2;
                String string;
                DMGroupChatStickerGroupInfo groupInfo;
                Long conversationShortId;
                C19620211pY c19620211pY;
                Iterator<C0FTJ<StickerModel>> it2 = C390410FSl.LIZLLL(c390420FSm).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getStickerId() == i) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0FTJ<StickerModel> c0ftj = next;
                if ((c0ftj instanceof C19620211pY) && (c19620211pY = (C19620211pY) c0ftj) != null) {
                    dMGroupChatStickerModel = c19620211pY.LJJJLL().LIZ;
                } else {
                    dMGroupChatStickerModel = null;
                }
                C19619911pV c19619911pV = this;
                c19619911pV.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator<C0FFO> it3 = c19619911pV.LJ.LJIIIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2.LIZ == EnumC1466150oFx.DM_GROUP_CHAT) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C0FFO c0ffo = next2;
                if (c0ffo != null && c0ffo.LJIILJJIL) {
                    arrayList.add(c19619911pV.LJIIIIZZ.LIZIZ().LJJJ(3, null, null, null));
                }
                IGroupChatStickerApi iGroupChatStickerApi = (IGroupChatStickerApi) PluggableExtentionKt.pluggableSpi$default(IGroupChatStickerApi.class, false, false, false, 14, null);
                if (iGroupChatStickerApi != null) {
                    if (dMGroupChatStickerModel == null || (groupInfo = dMGroupChatStickerModel.getGroupInfo()) == null || (conversationShortId = groupInfo.getConversationShortId()) == null || (string = conversationShortId.toString()) == null) {
                        string = "";
                    }
                    if (iGroupChatStickerApi.LJFF(string)) {
                        arrayList.add(new C0FU6(10, R.raw.icon_pen_on_paper, c19619911pV.LIZ.getString(2131845529), null, null, 24));
                    }
                }
                arrayList.add(new C0FU6(9, R.raw.icon_double_circle, c19619911pV.LIZ.getString(2131844799), null, null, 24));
                return arrayList;
            }
        });
    }
}
