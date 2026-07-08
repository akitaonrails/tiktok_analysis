package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import webcast.data.TouchPointData;

/* JADX INFO: renamed from: X.0fHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121450fHz {
    public static final C1121450fHz LIZ = new C1121450fHz();
    public static final ConcurrentHashMap<String, C1123320fL0<? extends InterfaceC1992207rE, ? extends InterfaceC1121530fI7>> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(webcast.data.TouchPointData r7) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1121450fHz.LIZ(webcast.data.TouchPointData):void");
    }

    public static final <T extends InterfaceC1992207rE, K extends InterfaceC1121530fI7> C1123320fL0<T, K> LIZIZ(String str) {
        Object obj = LIZIZ.get(str);
        if (obj instanceof C1123320fL0) {
            return (C1123320fL0) obj;
        }
        return null;
    }

    public static final <T extends InterfaceC1992207rE, K extends InterfaceC1121530fI7> List<C1123320fL0<T, K>> LIZJ(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            C1123320fL0<? extends InterfaceC1992207rE, ? extends InterfaceC1121530fI7> c1123320fL0 = LIZIZ.get(it2.next());
            if ((c1123320fL0 instanceof C1123320fL0) && c1123320fL0 != null) {
                arrayList.add(c1123320fL0);
            }
        }
        return arrayList;
    }

    public static void LJFF(List list) {
        LIZIZ.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LIZ((TouchPointData) it2.next());
        }
    }

    public static C1123320fL0 LJ(TouchPointData touchPointData, InterfaceC1992207rE interfaceC1992207rE, InterfaceC1121530fI7 interfaceC1121530fI7) {
        return new C1123320fL0(touchPointData.logExtra, touchPointData.tpName, interfaceC1121530fI7, interfaceC1992207rE, touchPointData.styleName);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0254 A[Catch: Exception -> 0x026f, TryCatch #0 {Exception -> 0x026f, blocks: (B:131:0x0254, B:133:0x025b, B:135:0x0263, B:137:0x0269, B:118:0x0204, B:120:0x020a, B:122:0x0210, B:124:0x0222, B:125:0x0226, B:127:0x0232, B:128:0x0236, B:129:0x024a, B:130:0x024f), top: B:156:0x0204 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(android.content.Context r31, X.C785240UrC r32, final X.C254700yf r33, com.bytedance.ies.sdk.datachannel.DataChannel r34, final long r35) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1121450fHz.LIZLLL(android.content.Context, X.0UrC, X.00yf, com.bytedance.ies.sdk.datachannel.DataChannel, long):void");
    }
}
