package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.livesdk.feed.skylight.multi.MultiTopLiveSkylightAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkApplyStateUpdateWithPayloadSetting;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472700IgG implements InterfaceC472710IgH {
    public final InterfaceC472680IgE LIZ;
    public ViewGroup LIZIZ;
    public C477770IoR LIZJ;
    public MultiTopLiveSkylightAdapter LIZLLL;
    public View.OnTouchListener LJ;

    public C472700IgG(C477740IoO c477740IoO) {
        this.LIZ = c477740IoO;
    }

    public final void LIZ(int i, GuestApplyInfo guestApplyInfo) {
        Long lValueOf;
        Long lValueOf2;
        MultiTopLiveSkylightAdapter multiTopLiveSkylightAdapter = this.LIZLLL;
        if (multiTopLiveSkylightAdapter != null) {
            if (guestApplyInfo != null) {
                lValueOf = Long.valueOf(guestApplyInfo.roomId);
            } else {
                lValueOf = null;
            }
            if (lValueOf != null && lValueOf.longValue() > 0) {
                int i2 = 0;
                for (Object obj : new ArrayList(multiTopLiveSkylightAdapter.LLILLJJLI)) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        RecommendItem recommendItem = (RecommendItem) obj;
                        Room room = recommendItem.room;
                        if (room != null) {
                            lValueOf2 = Long.valueOf(room.getId());
                        } else {
                            lValueOf2 = null;
                        }
                        if (Intrinsics.LJFF(lValueOf2, lValueOf)) {
                            if (i != 2 && i != 3) {
                                if (i2 == 0) {
                                    if (LiveSdkApplyStateUpdateWithPayloadSetting.INSTANCE.isEnable()) {
                                        multiTopLiveSkylightAdapter.notifyItemChanged(i2, Integer.valueOf(i));
                                    } else {
                                        RecommendItem recommendItem2 = (RecommendItem) ListProtector.get(multiTopLiveSkylightAdapter.LLILLJJLI, i2);
                                        recommendItem2.guestApplyInfo = guestApplyInfo;
                                        ListProtector.set(multiTopLiveSkylightAdapter.LLILLJJLI, 0, recommendItem2);
                                        multiTopLiveSkylightAdapter.notifyItemChanged(0);
                                        multiTopLiveSkylightAdapter.LL.LIZJ();
                                    }
                                } else if (LiveSdkApplyStateUpdateWithPayloadSetting.INSTANCE.isEnable()) {
                                    multiTopLiveSkylightAdapter.notifyItemMoved(i2, 0);
                                    multiTopLiveSkylightAdapter.notifyItemChanged(0, Integer.valueOf(i));
                                    Collections.swap(multiTopLiveSkylightAdapter.LLILLJJLI, i2, 0);
                                } else if (i2 < ((ArrayList) multiTopLiveSkylightAdapter.LLILLJJLI).size() && ((ArrayList) multiTopLiveSkylightAdapter.LLILLJJLI).size() > 0) {
                                    RecommendItem recommendItem3 = (RecommendItem) ListProtector.remove(multiTopLiveSkylightAdapter.LLILLJJLI, i2);
                                    recommendItem3.guestApplyInfo = guestApplyInfo;
                                    ListProtector.add(multiTopLiveSkylightAdapter.LLILLJJLI, 0, recommendItem3);
                                    multiTopLiveSkylightAdapter.notifyItemRemoved(i2);
                                    multiTopLiveSkylightAdapter.notifyItemInserted(0);
                                    multiTopLiveSkylightAdapter.LL.LIZJ();
                                }
                            } else {
                                recommendItem.guestApplyInfo = guestApplyInfo;
                                ListProtector.set(multiTopLiveSkylightAdapter.LLILLJJLI, i2, recommendItem);
                                multiTopLiveSkylightAdapter.notifyItemChanged(i2);
                                C20441214yg.LIZIZ("MultiTopLiveSkylightAdapter", "do not update item by swap position for applyState is expired or rejected");
                                return;
                            }
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return;
            }
            C20441214yg.LIZIZ("MultiTopLiveSkylightAdapter", "do not update for targetRoomId is null or less than 0L");
        }
    }
}
