package com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common;

import X.C01GW;
import X.C09AJ;
import X.C0PEM;
import X.C11NZ;
import X.C20441214yg;
import X.C204692157q;
import X.C204695157t;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C935950aSn;
import X.C936030aSv;
import X.C936170aT9;
import X.C936200aTC;
import X.InterfaceC500940Jki;
import Y.AObserverS219S0100000_15;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.AvatarStyle;

/* JADX INFO: loaded from: classes16.dex */
public final class AvatarBusinessAbilityImpl implements IAvatarBusinessAbility {
    public final LifecycleOwner LL;
    public List<AvatarStyle> LLILLJJLI;
    public Pair<Integer, ? extends List<Avatar>> LLILZ;
    public Avatar LLILZIL;
    public volatile C09AJ<C935950aSn> LLIZLLLIL;
    public C936170aT9 LLJIJIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 301));
    public final MutableLiveData<C936030aSv> LLILZLL = new MutableLiveData<>(null);
    public final AObserverS219S0100000_15 LLIZ = new AObserverS219S0100000_15(this, 17);
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(108));
    public final ConcurrentHashMap<Long, C936200aTC> LLJI = new ConcurrentHashMap<>();

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final long CA() {
        Keva keva = (Keva) this.LLJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("avatar-");
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        sbLIZ.append(interfaceC500940JkiUser != null ? Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()) : null);
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final C11NZ<C935950aSn> H01() {
        return (C11NZ) this.LLILLL.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final void LC2() {
        MutableLiveData<C936030aSv> mutableLiveData;
        C936170aT9 c936170aT9 = this.LLJIJIL;
        if (c936170aT9 != null && (mutableLiveData = c936170aT9.LJIIJ) != null) {
            mutableLiveData.removeObserver(this.LLIZ);
        }
        this.LLJIJIL = null;
        this.LLILZLL.setValue(null);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final MutableLiveData Hr2() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final Avatar Oj0() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final List<AvatarStyle> Q51() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final Pair<Integer, List<Avatar>> nJ0() {
        return this.LLILZ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final C936170aT9 qA() {
        return this.LLJIJIL;
    }

    public AvatarBusinessAbilityImpl(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final void Gl0(long j) {
        Long lValueOf;
        Keva keva = (Keva) this.LLJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("avatar-");
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final void PL(C936170aT9 c936170aT9) {
        MutableLiveData<C936030aSv> mutableLiveData;
        C20441214yg.LIZIZ("AvatarBusinessAbilityImpl", "setGeneratingTask");
        C936170aT9 c936170aT92 = this.LLJIJIL;
        if (c936170aT92 != null && (mutableLiveData = c936170aT92.LJIIJ) != null) {
            mutableLiveData.removeObserver(this.LLIZ);
        }
        this.LLJIJIL = c936170aT9;
        c936170aT9.LJIIJ.observe(this.LL, this.LLIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final void QP1(List<AvatarStyle> list) {
        this.LLILLJJLI = list;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final void e42(Avatar avatar) {
        this.LLILZIL = avatar;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final void qX(Pair<Integer, ? extends List<Avatar>> pair) {
        this.LLILZ = pair;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility
    public final void x01(Avatar avatar, boolean z) {
        C936200aTC c936200aTC = this.LLJI.get(Long.valueOf(avatar.avatarId));
        if (c936200aTC != null) {
            if (!z && c936200aTC.LIZJ) {
                c936200aTC.LIZJ = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("repeat download id:");
            sbLIZ.append(avatar.avatarId);
            C20441214yg.LJ("AvatarBusinessAbilityImpl", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C204692157q c204692157q = C204692157q.LIZ;
        C936200aTC c936200aTC2 = new C936200aTC(this, avatar, z);
        this.LLJI.put(Long.valueOf(avatar.avatarId), c936200aTC2);
        c204692157q.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C204695157t(c936200aTC2, avatar, null), 3);
    }
}
