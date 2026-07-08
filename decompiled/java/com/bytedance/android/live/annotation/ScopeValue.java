package com.bytedance.android.live.annotation;

import X.C08FF;

/* JADX INFO: loaded from: classes19.dex */
public enum ScopeValue {
    BANNER("banner"),
    BARRAGE("barrage"),
    BROADCAST("broadcast"),
    COMMENT("comment"),
    DECORATION("decoration"),
    FEED("feed"),
    GIFT("gift"),
    HYBRID("hybrid"),
    LINKMIC("linkmic"),
    MESSAGE("message"),
    PUBLICSCREEN("publicscreen"),
    PULLSTREAM("pullstream"),
    RANK("rank"),
    ROOMFUNCTION("roomfunction"),
    SLOT("slot"),
    WALLET("wallet"),
    WATCHLIVE("watchlive"),
    PERFORMANCE("performance"),
    PRO_CS("professional_content_service"),
    SUBSCRIPTION("subscription"),
    REVENUE_STRATEGY("revenue_strategy"),
    LIVE_EVENT("live_event"),
    REVENUE("revenue"),
    PCS("pcs"),
    OTHER("other");

    public String name;

    public String getName() {
        return this.name;
    }

    public static ScopeValue valueOf(String str) {
        return (ScopeValue) C08FF.LIZ(ScopeValue.class, str);
    }

    ScopeValue(String str) {
        this.name = str;
    }
}
