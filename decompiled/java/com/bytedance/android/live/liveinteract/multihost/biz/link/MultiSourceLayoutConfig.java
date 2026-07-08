package com.bytedance.android.live.liveinteract.multihost.biz.link;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiSourceLayoutConfig {
    public static final TypeAdapter ADAPTER = new MultiSourceLayoutConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("landscape_layout")
    public Map<Integer, String> landscapeLayout;

    @C09CT("portrait_layout")
    public Map<Integer, String> portraitLayout;

    public MultiSourceLayoutConfig() {
        this(null, null, 3, null);
    }

    public MultiSourceLayoutConfig(Map<Integer, String> map, Map<Integer, String> map2) {
        this.landscapeLayout = map;
        this.portraitLayout = map2;
    }

    public MultiSourceLayoutConfig(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJIIIIZZ(new Pair(2, "2004"), new Pair(3, "2005"), new Pair(4, "2006")) : map, (i & 2) != 0 ? C2097608Jq.LJIIIIZZ(new Pair(2, "2007"), new Pair(3, "2008"), new Pair(4, "2009")) : map2);
    }
}
