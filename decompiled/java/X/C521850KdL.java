package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRoomRefreshConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0KdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521850KdL implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public static final void run$0(C521850KdL c521850KdL) {
        CoHostOperationCell coHostOperationCell = (CoHostOperationCell) c521850KdL.l0;
        SystemClock.uptimeMillis();
        coHostOperationCell.getClass();
    }

    public static final void run$1(C521850KdL c521850KdL) {
        ((Activity) c521850KdL.l0).finish();
    }

    public static final void run$10(C521850KdL c521850KdL) {
        ((C0ISJ) c521850KdL.l0).LLLLJI.set(0);
    }

    public static final void run$11(C521850KdL c521850KdL) {
        boolean z = C08SQ.LIZ;
        if (C08SQ.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDispose ");
            sbLIZ.append((InterfaceC475810IlH) c521850KdL.l0);
            C20441214yg.LJIIIZ("PersistenceTaskUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void run$2(C521850KdL c521850KdL) {
        ((Activity) c521850KdL.l0).finish();
    }

    public static final void run$3(C521850KdL c521850KdL) {
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) c521850KdL.l0;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    public static final void run$4(C521850KdL c521850KdL) {
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) c521850KdL.l0;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    public static final void run$5(C521850KdL c521850KdL) {
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) c521850KdL.l0;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    public static final void run$6(C521850KdL c521850KdL) {
        ((C0JSH) c521850KdL.l0).LLILLL = false;
    }

    public static final void run$7(C521850KdL c521850KdL) {
        ((C467660IVo) c521850KdL.l0).LIZ();
    }

    public static final void run$8(C521850KdL c521850KdL) {
        long id;
        C467210ITv.LIZ.getClass();
        LiveRoomRefreshConfig liveRoomRefreshConfig = C467210ITv.LIZIZ;
        if (liveRoomRefreshConfig.enable) {
            C0ISJ c0isj = (C0ISJ) c521850KdL.l0;
            if (!c0isj.LLJILJIL.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                boolean z = liveRoomRefreshConfig.enableRegisterOpt;
                int size = c0isj.LLJILJIL.size();
                for (int i = 0; i < size; i++) {
                    if (!z || i > c0isj.LLLLLZ || !c0isj.LLILZLL) {
                        Room room = (Room) ListProtector.get(c0isj.LLJILJIL, i);
                        if (!room.isVariantCard()) {
                            User owner = room.getOwner();
                            if (owner != null) {
                                id = owner.getId();
                            } else {
                                id = 0;
                            }
                            linkedHashSet.add(String.valueOf(id));
                            linkedHashSet2.add(Long.valueOf(room.getId()));
                        }
                    }
                }
                c0isj.LLILZLL = true;
                if (!c0isj.LLIZ) {
                    c0isj.LLIZ = true;
                }
                ((ILiveStatusCheckService) C1161920gLG.LIZJ(ILiveStatusCheckService.class)).oj1(5, linkedHashSet, linkedHashSet2);
            }
        }
    }

    public static final void run$9(C521850KdL c521850KdL) {
        ((C0ISJ) c521850KdL.l0).LLLLJI.set(0);
    }

    public C521850KdL(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
