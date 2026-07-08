package com.bytedance.android.live.effect.api;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class Modification {

    @C09CT("effect_id")
    public long effectId;

    @C09CT("end_time")
    public Long endTime;

    @C09CT("extra")
    public String extra;

    @C09CT("from")
    public Long from;

    @C09CT("mode")
    public Long mode;

    @C09CT("modification_type")
    public long modificationType;

    @C09CT("name")
    public String name;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT("role")
    public long role;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("start_time")
    public Long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sub_effect_id")
    public Long subEffectId;

    @C09CT("sub_type")
    public long subType;

    @C09CT("tab")
    public String tab;

    @C09CT("url")
    public String url;

    @C09CT("value")
    public Float value;

    public Modification(long j, String str, String str2, long j2, Long l, Long l2, long j3, String str3, Long l3, Long l4, Float f, String str4, String str5, Long l5, String str6, long j4, int i) {
        this.effectId = j;
        this.name = str;
        this.resourceId = str2;
        this.modificationType = j2;
        this.startTime = l;
        this.endTime = l2;
        this.role = j3;
        this.tab = str3;
        this.mode = l3;
        this.from = l4;
        this.value = f;
        this.url = str4;
        this.scene = str5;
        this.subEffectId = l5;
        this.extra = str6;
        this.subType = j4;
        this.status = i;
    }
}
