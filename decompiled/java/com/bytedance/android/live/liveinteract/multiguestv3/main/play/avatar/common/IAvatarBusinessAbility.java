package com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common;

import X.C11NZ;
import X.C935950aSn;
import X.C936170aT9;
import X.InterfaceC494301wD;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Pair;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.AvatarStyle;

/* JADX INFO: loaded from: classes16.dex */
public interface IAvatarBusinessAbility extends InterfaceC494301wD {
    long CA();

    void Gl0(long j);

    C11NZ<C935950aSn> H01();

    MutableLiveData Hr2();

    void LC2();

    Avatar Oj0();

    void PL(C936170aT9 c936170aT9);

    List<AvatarStyle> Q51();

    void QP1(List<AvatarStyle> list);

    void e42(Avatar avatar);

    Pair<Integer, List<Avatar>> nJ0();

    C936170aT9 qA();

    void qX(Pair<Integer, ? extends List<Avatar>> pair);

    void x01(Avatar avatar, boolean z);
}
