package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS246S0000000_13;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XA6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XA6 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final Map<String, Integer> LIZIZ = new LinkedHashMap();

    public static void LIZ(Context context) {
        Context contextN3;
        C07KH.LIZ = C264260AXg.LIZ(2);
        C07KH.LIZIZ = CastLongProtector.parseLong(C0W9I.LIZIZ(C1BWL.LIZ()).LIZ("build_timestamp", CardStruct.IStatusCode.DEFAULT));
        C844470XAv.LIZ.getClass();
        C844470XAv.LJ();
        C07KH.LIZJ = AFwS187S0000000_2.get$arr$(1490);
        C07KH.LIZLLL = AFwS200S0000000_13.get$arr$(434);
        C07KH.LJ = AFwS200S0000000_13.get$arr$(435);
        C07KH.LJFF = AFwS200S0000000_13.get$arr$(436);
        C07KH.LJI = AFwS200S0000000_13.get$arr$(437);
        C07KH.LJII = C2405009bc.LIZ();
        C844280XAc.LIZIZ = AFwS200S0000000_13.get$arr$(438);
        C844280XAc.LIZJ = new AwS246S0000000_13(1);
        C844280XAc.LIZLLL = AFwS200S0000000_13.get$arr$(439);
        C844280XAc.LJ = AFwS200S0000000_13.get$arr$(440);
        Context context2 = null;
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        if (contextN3 instanceof Application) {
            context2 = contextN3;
        }
        if (context2 != null) {
            C0XAB c0xab = new C0XAB();
            c0xab.LIZ = true;
            c0xab.LIZIZ = true;
            C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
            c2123408To.LIZJ = 1;
            c2123408To.LIZIZ = "scalpel_scene_thread";
            c0xab.LIZJ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
            if (!C0XAA.LIZIZ) {
                C0XAA.LIZJ = new C0XAW();
                C0XAA.LIZ = c0xab;
                C0XAA.LIZIZ = true;
            }
            C0XAA.LIZLLL = new C0XAF() { // from class: X.0XAC
                @Override // X.C0XAF
                public final String getScene() {
                    return C0VWW.LJ();
                }
            };
        }
        C0XAH.LIZ = C264260AXg.LIZ(4);
        if (C264260AXg.LIZ(1)) {
            C0XAG.LIZ = new C0XAI() { // from class: X.050Z
                @Override // X.C0XAI
                public final void LIZ(int i, String str) {
                    Map<String, Integer> map = C0XA6.LIZIZ;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = 0;
                        linkedHashMap.put(str, obj);
                    }
                    map.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("name", str);
                        jSONObject.put("type", i);
                        C793770VBv.LJII("thread_diagnose_count", jSONObject, null, null);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            };
        }
    }
}
