package com.bytedance.android.live.liveinteract.multiguestv3.main.ability;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicAbilityMutexInfo {
    public static final TypeAdapter ADAPTER = new LinkMicAbilityMutexInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("mutex_ability")
    public List<String> mutexAbility;

    @C09CT("mutex_scene")
    public List<String> mutexScene;

    public LinkMicAbilityMutexInfo() {
        this(null, null, 3, null);
    }

    public LinkMicAbilityMutexInfo(List<String> list, List<String> list2) {
        this.mutexScene = list;
        this.mutexAbility = list2;
    }

    public LinkMicAbilityMutexInfo(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
