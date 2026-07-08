package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AwS559S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931660aLs implements LifecycleOwner {
    public IGuestInviteAbility LLILLJJLI;
    public C11JF LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public C00YI LLILZLL;
    public final LifecycleRegistry LL = new LifecycleRegistry(this);
    public final C01GW LLIZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 221));

    public static void LIZ() {
        C940770aaZ.LIZ().LIZIZ();
        for (AbstractC939840aZ4 abstractC939840aZ4 : (ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.NO_GUEST, null)) {
            if (abstractC939840aZ4 instanceof C934190aPx) {
                ((C934190aPx) abstractC939840aZ4).LJIILLIIL(null, false);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL;
    }

    public C931660aLs(DataChannel dataChannel) {
    }

    public final void LIZIZ(int i) {
        long id;
        User user;
        C00YI c00yi = this.LLILZLL;
        if (c00yi != null && (user = c00yi.LIZLLL) != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        int i2 = this.LLILZIL;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_id", String.valueOf(id));
        map.put("user_id", String.valueOf(C930540aK4.LJIIL()));
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        map.put("set_guest_cnt", String.valueOf(C927600aFK.LJI()));
        map.put("icon_rank", String.valueOf(i2));
        map.put("close_type", String.valueOf(i));
        C0KX4.LIZ("livesdk_multi_guest_seat_icon_close", map, null, true);
    }

    public final void LIZJ(C00YI c00yi, boolean z) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String str;
        Integer numLJIIJJI;
        String str2;
        Integer numLJIIJJI2;
        C940770aaZ.LIZ().LIZIZ();
        Object next = null;
        Iterator it2 = ((ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.NO_GUEST, null)).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                PosIdentity posIdentity = ((AbstractC939840aZ4) next).getWindow().getPosIdentity();
                if (posIdentity != null && (str2 = posIdentity.value) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str2)) != null) {
                    iIntValue2 = numLJIIJJI2.intValue();
                } else {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    PosIdentity posIdentity2 = ((AbstractC939840aZ4) next2).getWindow().getPosIdentity();
                    if (posIdentity2 != null && (str = posIdentity2.value) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                        iIntValue3 = numLJIIJJI.intValue();
                    } else {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
        }
        AbstractC939840aZ4 abstractC939840aZ4 = (AbstractC939840aZ4) next;
        if (abstractC939840aZ4 != null && (abstractC939840aZ4 instanceof C934190aPx)) {
            if (z) {
                int i = this.LLILZ;
                C957020b0m window = abstractC939840aZ4.getWindow();
                window.getClass();
                if (i == System.identityHashCode(window)) {
                    C20441214yg.LIZIZ("GuestInviteGuideHelper", "showGuestInviteGuide show on the same");
                    return;
                } else {
                    LIZ();
                    LIZIZ(99);
                }
            }
            C934190aPx c934190aPx = (C934190aPx) abstractC939840aZ4;
            Integer uiPos = c934190aPx.getUiPos();
            if (uiPos != null) {
                iIntValue = uiPos.intValue();
            } else {
                iIntValue = 0;
            }
            this.LLILZIL = iIntValue;
            C957020b0m window2 = abstractC939840aZ4.getWindow();
            window2.getClass();
            this.LLILZ = System.identityHashCode(window2);
            C20441214yg.LIZIZ("GuestInviteGuideHelper", "showGuestInviteGuide show resume=" + z);
            c934190aPx.LJIILLIIL(c00yi, z);
        }
    }
}
