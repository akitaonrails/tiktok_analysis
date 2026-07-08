package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.viewmodel;

import X.C11S5;
import X.C13BV;
import X.C13LP;
import X.C1701940uOG;
import X.C472820IgS;
import X.C480460Ism;
import X.InterfaceC1631620sYq;
import Y.AfS143S0200000_7;
import Y.AfS176S0100000_7;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.liveinteract.multilive.model.LiveGuideCard;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestLinkMicMatchViewModel extends ViewModel {
    public final MutableLiveData<List<MultiGuestRecommendRoomInfo>> LL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<List<Long>> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZ = new MutableLiveData<>();
    public String LLILZIL;
    public LiveGuideCard LLILZLL;
    public boolean LLIZ;

    public final void vQ2(List<Long> list) {
        String strLJJLIIIJ;
        if (list.isEmpty()) {
            this.LLILLL.setValue(C13BV.INSTANCE);
            this.LLILZ.setValue(Boolean.TRUE);
            C472820IgS.LIZ("checkRoomState params is empty");
        } else {
            if (list.size() == 1) {
                strLJJLIIIJ = String.valueOf(((Number) ListProtector.get(list, 0)).longValue());
            } else {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
            }
            C480460Ism.LIZ().getClass();
            ((RoomStatApi) C480460Ism.LIZLLL(RoomStatApi.class)).checkRoom(strLJJLIIIJ, "live_detail").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS143S0200000_7((Object) this, (EmoteModel) list, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 4), new AfS176S0100000_7(this, 15));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(int r9) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.viewmodel.MultiGuestLinkMicMatchViewModel.wQ2(int):void");
    }
}
