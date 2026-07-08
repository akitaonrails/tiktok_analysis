package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03sX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C981103sX extends C09AY implements Function0<Map<String, ? extends List<? extends String>>> {
    public C981103sX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends List<? extends String>> invoke() {
        C980803sU.LIZ.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, List<String>> map = C980803sU.LIZIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_debug_panel_path_to_pagename", Map.class, map);
        return LJIIIIZZ != 0 ? LJIIIIZZ : map;
    }
}
