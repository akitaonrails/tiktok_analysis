package com.bytedance.amg.minigameruntime.api;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class JsEngineType {
    public static final /* synthetic */ JsEngineType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final JsEngineType QUICKJS;
    public static final JsEngineType V8;

    public static InterfaceC2044707zh<JsEngineType> getEntries() {
        return LLILLJJLI;
    }

    static {
        JsEngineType jsEngineType = new JsEngineType("V8", 0);
        V8 = jsEngineType;
        JsEngineType jsEngineType2 = new JsEngineType("QUICKJS", 1);
        QUICKJS = jsEngineType2;
        JsEngineType[] jsEngineTypeArr = {jsEngineType, jsEngineType2};
        LL = jsEngineTypeArr;
        LLILLJJLI = new C2254308sP(jsEngineTypeArr);
    }

    public static JsEngineType[] values() {
        return (JsEngineType[]) LL.clone();
    }

    public static JsEngineType valueOf(String str) {
        return (JsEngineType) C08FF.LIZ(JsEngineType.class, str);
    }

    public JsEngineType(String str, int i) {
    }
}
