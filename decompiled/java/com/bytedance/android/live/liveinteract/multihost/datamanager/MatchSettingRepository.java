package com.bytedance.android.live.liveinteract.multihost.datamanager;

import X.C0UO0;
import X.C13BV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C480460Ism;
import X.C515801zg;
import X.C516201zk;
import X.InterfaceC978510bZR;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class MatchSettingRepository implements InterfaceC978510bZR {
    public final MatchSettingRepository$_selectedGift$1 LIZ;
    public final MatchSettingRepository$_selectedGift$1 LIZIZ;
    public long LIZJ;
    public final MatchSettingRepository$_selectedMatchOption$1 LIZLLL;
    public final MatchSettingRepository$_selectedMatchOption$1 LJ;
    public List<GiftMode> LJFF;
    public Text LJI;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.android.live.liveinteract.multihost.datamanager.MatchSettingRepository$_selectedGift$1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.live.liveinteract.multihost.datamanager.MatchSettingRepository$_selectedMatchOption$1] */
    public MatchSettingRepository() {
        ?? r0 = new MutableLiveData<GiftMode>() { // from class: com.bytedance.android.live.liveinteract.multihost.datamanager.MatchSettingRepository$_selectedGift$1
            @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
            public void setValue(GiftMode giftMode) {
                Long lValueOf;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_selectedGift new value, id: ");
                String str = null;
                if (giftMode != null) {
                    lValueOf = Long.valueOf(giftMode.giftId);
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(" name: ");
                if (giftMode != null) {
                    str = giftMode.giftName;
                }
                sbLIZ.append(str);
                C20441214yg.LIZIZ("MatchSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
                super.setValue(giftMode);
            }
        };
        this.LIZ = r0;
        this.LIZIZ = r0;
        ?? r02 = new MutableLiveData<Integer>() { // from class: com.bytedance.android.live.liveinteract.multihost.datamanager.MatchSettingRepository$_selectedMatchOption$1
            public void setValue(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_selectedMatchOption new value, option: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("MatchSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
                super.setValue(Integer.valueOf(i));
            }

            @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
            public /* bridge */ /* synthetic */ void setValue(Object obj) {
                setValue(((Number) obj).intValue());
            }
        };
        this.LIZLLL = r02;
        this.LJ = r02;
    }

    @Override // X.InterfaceC978510bZR
    public final Text LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC978510bZR
    public final long LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC978510bZR
    public final List<GiftMode> LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC978510bZR
    public final LiveData<GiftMode> LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC978510bZR
    public final LiveData<Integer> LJIIIIZZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC978510bZR
    public final void LJ(long j) {
        if (j == 0) {
            Integer value = getValue();
            if (value != null && value.intValue() == 1) {
                LJIIJJI(0);
                return;
            }
            return;
        }
        LJIIJJI(1);
    }

    @Override // X.InterfaceC978510bZR
    public final void LJFF(Text text) {
        this.LJI = text;
    }

    @Override // X.InterfaceC978510bZR
    public final void LJII(GiftMode giftMode) {
        long j;
        if (giftMode != null) {
            j = giftMode.giftId;
        } else {
            j = 0;
        }
        this.LIZJ = j;
        postValue(giftMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[PHI: r5
      0x002b: PHI (r5v1 com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode) = 
      (r5v0 com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode)
      (r5v4 com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode)
     binds: [B:3:0x0003, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC978510bZR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(long r7) {
        /*
            r6 = this;
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode> r0 = r6.LJFF
            r5 = 0
            if (r0 == 0) goto L2b
            java.util.Iterator r4 = r0.iterator()
        L9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode) r0
            long r1 = r0.giftId
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L9
            r5 = r3
        L1d:
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r5 = (com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode) r5
            if (r5 == 0) goto L2b
            long r0 = r5.giftId
        L23:
            r6.LIZJ = r0
            com.bytedance.android.live.liveinteract.multihost.datamanager.MatchSettingRepository$_selectedGift$1 r0 = r6.LIZ
            r0.postValue(r5)
            return
        L2b:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.datamanager.MatchSettingRepository.LJIIIZ(long):void");
    }

    @Override // X.InterfaceC978510bZR
    public final void LJIIJ(List<GiftMode> list) {
        this.LJFF = list;
    }

    @Override // X.InterfaceC978510bZR
    public final void LJIIJJI(int i) {
        postValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC978510bZR
    public final void LIZJ(Function1<? super List<GiftMode>, Unit> function1, Function1<? super Throwable, Unit> function12) {
        List<GiftMode> list = this.LJFF;
        if (list != null && !list.isEmpty()) {
            Collection collection = this.LJFF;
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
            function1.invoke(collection);
            return;
        }
        C480460Ism.LIZ().getClass();
        ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).getMatchPlaybookInfo(null).LJIILIIL(new C0UO0()).LJJLL(new C515801zg(this, function1, 18), new C516201zk(function12, 71));
    }
}
