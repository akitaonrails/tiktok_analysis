package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveAnchorSwitchFrequency;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917140ZyS {
    public static final int LIZ = MultiLiveAnchorSwitchFrequency.INSTANCE.getValue();
    public static final ArrayList<Long> LIZIZ = new ArrayList<>();
    public static final ArrayList<Long> LIZJ = new ArrayList<>();
    public static final ArrayList<Long> LIZLLL = new ArrayList<>();

    public static EnumC918970a1P LJI() {
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            return C927600aFK.LJII();
        }
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder.LJJJJI;
        }
        return null;
    }

    public static boolean LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<Long> arrayList = LIZLLL;
        if (arrayList.size() < LIZ) {
            arrayList.add(Long.valueOf(jCurrentTimeMillis));
            return true;
        }
        if (jCurrentTimeMillis - ((Number) ListProtector.get(arrayList, 0)).longValue() < 60000) {
            return false;
        }
        ListProtector.remove(arrayList, 0);
        arrayList.add(Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    public static boolean LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<Long> arrayList = LIZJ;
        if (arrayList.size() < LIZ) {
            arrayList.add(Long.valueOf(jCurrentTimeMillis));
            return true;
        }
        if (jCurrentTimeMillis - ((Number) ListProtector.get(arrayList, 0)).longValue() < 60000) {
            return false;
        }
        ListProtector.remove(arrayList, 0);
        arrayList.add(Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    public static final boolean LIZJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<Long> arrayList = LIZIZ;
        if (arrayList.size() < LIZ) {
            arrayList.add(Long.valueOf(jCurrentTimeMillis));
            return true;
        }
        if (jCurrentTimeMillis - ((Number) ListProtector.get(arrayList, 0)).longValue() < 60000) {
            return false;
        }
        ListProtector.remove(arrayList, 0);
        arrayList.add(Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    public static final EnumC918970a1P LJ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiGuestDataHolder multiGuestDataHolder;
        if (C931790aM5.LIZIZ()) {
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            if (C01ZD.LIZ(7)) {
                C307001Gy.LIZ().getClass();
                return C927600aFK.LJII();
            }
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        if ((!(objLJIIIZ instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) == null) && (multiLiveAnchorPanelSettingsLIZIZ = C924810aAp.LJ().LJJIII) == null) {
            return EnumC918970a1P.NORMAL;
        }
        int i = multiLiveAnchorPanelSettingsLIZIZ.layoutType;
        int i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
        if (i != 1) {
            if (i != 1) {
                if (i == 0) {
                    if (i2 == 0) {
                        return EnumC918970a1P.GRID_FIX;
                    }
                    if (i2 == 1) {
                        return EnumC918970a1P.GRID;
                    }
                }
            }
            return EnumC918970a1P.NORMAL;
        }
        if (i2 == 0) {
            return EnumC918970a1P.FLOATING_FIX;
        }
        if (i2 == 1) {
            return EnumC918970a1P.FLOATING;
        }
        return EnumC918970a1P.NORMAL;
    }

    public static final Pair<Integer, Integer> LIZLLL(String str) {
        if (Intrinsics.LJFF(str, EnumC918990a1R.FLOAT.getBusinessType())) {
            return new Pair<>(1, 1);
        }
        if (!Intrinsics.LJFF(str, EnumC918990a1R.ZOOM_PANEL.getBusinessType()) && !Intrinsics.LJFF(str, EnumC918990a1R.FLOAT_FIX.getBusinessType())) {
            if (Intrinsics.LJFF(str, EnumC918990a1R.GRID_FLOAT.getBusinessType())) {
                return new Pair<>(0, 1);
            }
            if (!Intrinsics.LJFF(str, EnumC918990a1R.ZOOM_GRID_GUEST.getBusinessType()) && !Intrinsics.LJFF(str, EnumC918990a1R.ZOOM_GRID_ANCHOR.getBusinessType()) && !Intrinsics.LJFF(str, EnumC918990a1R.GRID_FIX.getBusinessType())) {
                return null;
            }
            return new Pair<>(0, 0);
        }
        return new Pair<>(1, 0);
    }

    public static boolean LJIIIZ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] < C497740JfY.LJIILLIIL() / 2) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJ(DataChannel dataChannel) {
        Boolean boolValueOf;
        C0IGM c0igm;
        boolean z;
        if (dataChannel != null && (c0igm = (C0IGM) dataChannel.gg0(C781160Ukc.class)) != null) {
            if (c0igm.LIZ == 2) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public static final EnumC918970a1P LJFF(int i, int i2) {
        if (i == 1) {
            if (i2 == 0) {
                return EnumC918970a1P.FLOATING_FIX;
            }
        } else {
            if (i != 1) {
                if (i == 0) {
                    if (i2 == 0) {
                        return EnumC918970a1P.GRID_FIX;
                    }
                    if (i2 == 1) {
                        return EnumC918970a1P.GRID;
                    }
                }
            }
            return EnumC918970a1P.NORMAL;
        }
        if (i2 == 1) {
            return EnumC918970a1P.FLOATING;
        }
        return EnumC918970a1P.NORMAL;
    }

    public static final boolean LJIIIIZZ(InterfaceC937900aVw interfaceC937900aVw, String str) {
        boolean z;
        InterfaceC937840aVq next;
        InterfaceC937840aVq interfaceC937840aVq;
        InterfaceC937840aVq interfaceC937840aVqLJI = null;
        if (interfaceC937900aVw != null) {
            if (str == null) {
                str = "";
            }
            interfaceC937840aVqLJI = interfaceC937900aVw.LJI(str);
        }
        if (interfaceC937900aVw != null && interfaceC937840aVqLJI != null) {
            Iterator<InterfaceC937840aVq> it2 = interfaceC937900aVw.LJJJJZ().getAllLayoutWindows().iterator();
            do {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
                interfaceC937840aVq = next;
                if (interfaceC937840aVq.LJJIIJ().getLayoutParams().width > interfaceC937840aVqLJI.LJJIIJ().getLayoutParams().width) {
                    break;
                }
            } while (interfaceC937840aVq.LJJIIJ().getLayoutParams().height <= interfaceC937840aVqLJI.LJJIIJ().getLayoutParams().height);
            if (next != null) {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }

    public static final void LJII(Integer num, String str, Throwable th, Context context, DataChannel dataChannel, User user) {
        if (th != null) {
            boolean z = th instanceof C477520Io2;
            if (z && ((C501520Jle) th).getErrorCode() == 4004307) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843609, C0KVU.LIZ(user)));
                return;
            }
            C930480aJy.LJIIZILJ(C930480aJy.LIZ, context, th);
            if (!z || ((C501520Jle) th).getErrorCode() != 4004474) {
                return;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_draw_function_conflict_toast_show");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C923330a8R c923330a8R = C923330a8R.LIZ;
            c474500IjALIZ.LJJII(C923330a8R.LIZLLL(), "is_multi_guest_moderator");
            c474500IjALIZ.LJJII("guest_connection_icon", "click_position");
            c474500IjALIZ.LJJII("guest_connection_enlarge_screen", "function_type");
            c474500IjALIZ.LJJII(C923330a8R.LIZLLL(), "is_multi_guest_moderator");
            c474500IjALIZ.LIZ();
            return;
        }
        int iOrdinal = EnumC919060a1Y.E_C_GUEST_REJECT_ZOOM.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843609, C0KVU.LIZ(user)));
        } else {
            C766270U4b.LJIIJJI(str);
        }
    }
}
