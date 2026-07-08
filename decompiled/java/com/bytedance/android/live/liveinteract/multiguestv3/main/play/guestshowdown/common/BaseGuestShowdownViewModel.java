package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common;

import X.AnonymousClass0206;
import X.C01GW;
import X.C01I4;
import X.C01I7;
import X.C01IE;
import X.C020L;
import X.C0UO0;
import X.C11NJ;
import X.C15B9;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C500260Jjc;
import X.C516201zk;
import X.C948450amx;
import X.C954140aw8;
import X.InterfaceC938550aWz;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.GuestShowdownService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownGetContentParams;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGuestShowdownViewModel extends ViewModel {
    public volatile C15B9 LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(48));
    public final MutableLiveData<Integer> LLILLJJLI = new MutableLiveData<>(null);
    public final MutableLiveData<List<GuestShowdownUser>> LLILLL = new MutableLiveData<>(null);
    public final MutableLiveData<List<GuestShowdownUser>> LLILZ = new MutableLiveData<>(null);
    public final MutableLiveData<GuestShowdownConfig> LLILZIL = new MutableLiveData<>(null);
    public final MutableLiveData<GuestShowdownContent> LLILZLL = new MutableLiveData<>(null);
    public final C01IE LLIZLLLIL = new C01I7() { // from class: X.01IE
        @Override // X.C01I7
        public final void LIZ(GuestShowdownContent guestShowdownContent) {
            Integer numValueOf;
            List<GuestShowdownUser> list;
            List<GuestShowdownUser> list2;
            InterfaceC938550aWz interfaceC938550aWzVQ2;
            C15B9 c15b9;
            int iIntValue;
            GuestShowdownConfig guestShowdownConfig = null;
            if (guestShowdownContent != null) {
                numValueOf = Integer.valueOf(guestShowdownContent.playStatus);
            } else {
                numValueOf = null;
            }
            int i = 0;
            if (!Intrinsics.LJFF(numValueOf, this.LIZ.LLILLJJLI.getValue())) {
                BaseGuestShowdownViewModel baseGuestShowdownViewModel = this.LIZ;
                Integer value = baseGuestShowdownViewModel.LLILLJJLI.getValue();
                if (value != null) {
                    iIntValue = value.intValue();
                } else {
                    iIntValue = 0;
                }
                if (guestShowdownContent != null) {
                    i = guestShowdownContent.playStatus;
                }
                baseGuestShowdownViewModel.DQ2(iIntValue, i);
                C500260Jjc.LJJLIIIJILLIZJL(new C020Y(this.LIZ, guestShowdownContent, 5));
                i = 1;
            }
            if (guestShowdownContent != null) {
                list = guestShowdownContent.runningPlayUsers;
            } else {
                list = null;
            }
            if (!C01Z9.LIZ(list, this.LIZ.LLILLL.getValue())) {
                C500260Jjc.LJJLIIIJILLIZJL(new C020Y(this.LIZ, guestShowdownContent, 6));
                i = 1;
            }
            if (guestShowdownContent != null) {
                list2 = guestShowdownContent.leavePlayUsers;
            } else {
                list2 = null;
            }
            if (!C01Z9.LIZ(list2, this.LIZ.LLILZ.getValue())) {
                C500260Jjc.LJJLIIIJILLIZJL(new C020Y(this.LIZ, guestShowdownContent, 7));
                i = 1;
            }
            if (guestShowdownContent != null) {
                guestShowdownConfig = guestShowdownContent.playConfig;
            }
            if (!Intrinsics.LJFF(guestShowdownConfig, this.LIZ.LLILZIL.getValue()) && guestShowdownContent != null && guestShowdownContent.playConfig != null) {
                C500260Jjc.LJJLIIIJILLIZJL(new C020Y(this.LIZ, guestShowdownContent, 8));
            } else {
                if (i != 0) {
                }
                interfaceC938550aWzVQ2 = this.LIZ.vQ2();
                if (!(interfaceC938550aWzVQ2 instanceof C15B9) && (c15b9 = (C15B9) interfaceC938550aWzVQ2) != null) {
                    c15b9.LJIIIIZZ(guestShowdownContent, "contentChange");
                    return;
                }
            }
            this.LIZ.LLILZLL.postValue(guestShowdownContent);
            interfaceC938550aWzVQ2 = this.LIZ.vQ2();
            if (!(interfaceC938550aWzVQ2 instanceof C15B9)) {
            }
        }
    };

    public abstract String BQ2();

    public abstract InterfaceC938550aWz vQ2();

    public abstract C01I4 xQ2();

    public final Integer AQ2() {
        return this.LLILLJJLI.getValue();
    }

    public final boolean CQ2() {
        if (this.LLILLJJLI.getValue() == null) {
            return false;
        }
        Integer value = this.LLILLJJLI.getValue();
        if (value != null && value.intValue() == 0) {
            return false;
        }
        Integer value2 = this.LLILLJJLI.getValue();
        return value2 == null || value2.intValue() != 5;
    }

    public void onInit() {
        C20441214yg.LIZIZ("GuestShowdownService", "GuestShowdownService create");
        C948450amx.LIZIZ.LJFF(new GuestShowdownService(this), null);
        C01I4 c01i4XQ2 = xQ2();
        C01IE c01ie = this.LLIZLLLIL;
        if (!c01i4XQ2.LJIIIZ.contains(c01ie)) {
            c01i4XQ2.LJIIIZ.add(c01ie);
        }
        c01i4XQ2.LJIIZILJ();
    }

    public final C11NJ wQ2() {
        return (C11NJ) this.LL.getValue();
    }

    public void clearCache() throws JSONException {
        xQ2().LJIIIZ();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C20441214yg.LIZIZ("GuestShowdownService", "GuestShowdownService release");
        C948450amx.LIZIZ.LJI("GUEST_SHOWDOWN");
        wQ2().LJ();
        C01I4 c01i4XQ2 = xQ2();
        C01IE c01ie = this.LLIZLLLIL;
        if (c01i4XQ2.LJIIIZ.contains(c01ie)) {
            c01i4XQ2.LJIIIZ.remove(c01ie);
        }
        c01i4XQ2.LJIJ();
    }

    public String yQ2() {
        GuestShowdownContent guestShowdownContent = xQ2().LIZIZ;
        if (guestShowdownContent != null) {
            return guestShowdownContent.streamId;
        }
        return null;
    }

    public final GuestShowdownContent zQ2() {
        return xQ2().LIZIZ;
    }

    public final void EQ2(int i) {
        long j;
        String strBQ2 = BQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCountDownForAllContent, getContentType: ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ(strBQ2, C2188811AlT.LIZIZ(sbLIZ));
        GuestShowdownGetContentParams guestShowdownGetContentParams = new GuestShowdownGetContentParams();
        guestShowdownGetContentParams.roomId = C954140aw8.LIZJ();
        guestShowdownGetContentParams.channelId = C954140aw8.LIZIZ();
        GuestShowdownContent guestShowdownContent = xQ2().LIZIZ;
        if (guestShowdownContent != null) {
            j = guestShowdownContent.playId;
        } else {
            j = 0;
        }
        guestShowdownGetContentParams.playId = j;
        guestShowdownGetContentParams.getType = i;
        wQ2().LIZ(xQ2().LJIJI(guestShowdownGetContentParams, 0L).LJFF(new C0UO0()).LJJIIZ(new C516201zk(this, 42), new C516201zk(this, 43)));
    }

    public void DQ2(int i, int i2) {
        if (i2 != 0 && i2 != 5) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C020L(i2, this, 0));
    }
}
