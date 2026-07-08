package X;

import Y.AComparatorS31S0000000_12;
import com.bytedance.android.live.effect.model.composer.LiveComposerNode;
import com.bytedance.android.live.effect.model.composer.LiveComposerTagNode;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectAddTagSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UG7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UG7 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(LiveComposerNode liveComposerNode) {
        JSONObject jSONObject;
        String strJ3 = liveComposerNode.extra;
        try {
            if (!Intrinsics.LJFF(strJ3, "")) {
                jSONObject = new JSONObject(strJ3);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("sticker_panel", liveComposerNode.panel);
            jSONObject.put("effect_id", String.valueOf(liveComposerNode.effectId));
            if (LiveGiftEffectAddTagSetting.INSTANCE.enable()) {
                long j = liveComposerNode.giftId;
                if (j != 0) {
                    jSONObject.put("gift_id", String.valueOf(j));
                }
            }
            jSONObject.put("msg_id", String.valueOf(liveComposerNode.msgId));
            LIZ(jSONObject, liveComposerNode);
            strJ3 = C786410Ut5.J3(jSONObject);
            return strJ3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return strJ3;
        }
    }

    public static List LJFF(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS31S0000000_12(4));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            LiveComposerNode liveComposerNode = (LiveComposerNode) obj;
            if (liveComposerNode.use && liveComposerNode.updateTime >= InterfaceC766480U4w.LJIJJLI.LIZIZ().longValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static List LJI(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS31S0000000_12(5));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            LiveComposerNode liveComposerNode = (LiveComposerNode) obj;
            if (liveComposerNode.use && liveComposerNode.updateTime < InterfaceC766480U4w.LJIJJLI.LIZIZ().longValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String[] LJIIIIZZ(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS31S0000000_12(7));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<LiveComposerNode> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((LiveComposerNode) obj).use) {
                arrayList3.add(obj);
            }
        }
        for (LiveComposerNode liveComposerNode : arrayList3) {
            Iterator<LiveComposerTagNode> it2 = liveComposerNode.tagList.iterator();
            if (it2.hasNext() && it2.next() != null) {
                List<LiveComposerTagNode> list2 = liveComposerNode.tagList;
                ArrayList<LiveComposerTagNode> arrayList4 = new ArrayList();
                Iterator<LiveComposerTagNode> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(it3.next());
                }
                for (LiveComposerTagNode liveComposerTagNode : arrayList4) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(liveComposerNode.path);
                    sbLIZ.append(':');
                    sbLIZ.append(liveComposerTagNode.LIZ);
                    sbLIZ.append(":0");
                    arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                arrayList2.add(liveComposerNode.path);
            }
        }
        C20441214yg.LIZIZ("LiveComposerManagerB", arrayList2.toString());
        return (String[]) arrayList2.toArray(new String[0]);
    }

    public static Pair LJIIIZ(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            boolean z = false;
            if (it2.hasNext()) {
                LiveComposerNode liveComposerNode = (LiveComposerNode) it2.next();
                if (liveComposerNode.use) {
                    String strLIZIZ = LIZIZ(liveComposerNode);
                    for (LiveComposerTagNode liveComposerTagNode : liveComposerNode.tagList) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(liveComposerNode.path);
                        sbLIZ.append(':');
                        sbLIZ.append(liveComposerTagNode.LIZ);
                        sbLIZ.append(':');
                        sbLIZ.append(liveComposerTagNode.value);
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                        arrayList2.add(strLIZIZ);
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(liveComposerNode.path);
                        arrayList2.add(LIZIZ(liveComposerNode));
                    }
                }
            } else {
                return new Pair(arrayList.toArray(new String[0]), arrayList2.toArray(new String[0]));
            }
        }
    }

    public static List LJIIJ(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS31S0000000_12(6));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((LiveComposerNode) obj).use) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static void LIZ(JSONObject jSONObject, LiveComposerNode liveComposerNode) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        long j = liveComposerNode.duration;
        if (j > 0) {
            jSONObject2.put("gift_duration", j);
        }
        JSONArray jSONArray = liveComposerNode.prefabs;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject2.put("prefabs", liveComposerNode.prefabs);
        }
        if (liveComposerNode.giftEffectExtra.length() > 0) {
            jSONObject2.put("effect_extra", liveComposerNode.giftEffectExtra);
        }
        jSONObject.put("gift_info", C786410Ut5.J3(jSONObject2));
    }

    public static final int LIZJ(LiveEffect.ComposerConfig composerConfig, float f) {
        int i;
        float f2;
        float f3;
        int i2;
        if (f == 0.0f) {
            return 0;
        }
        if (composerConfig != null) {
            i = composerConfig.LIZJ;
            i2 = composerConfig.LIZLLL;
            f2 = composerConfig.LJ;
            f3 = composerConfig.LJFF;
            if (i2 < 0) {
                if (f > 0.0f) {
                    if (f2 == 0.0f) {
                        return 0;
                    }
                    if (f > f2) {
                        f = f2;
                    }
                    return C500260Jjc.LJZ((f / f2) * i);
                }
                if (f < f3) {
                    f = f3;
                }
                return C500260Jjc.LJZ((f / f3) * i2);
            }
            if (f2 == f3) {
                return 0;
            }
        } else {
            i = 100;
            f2 = 1.0f;
            f3 = 0.0f;
            i2 = 0;
        }
        if (f > f2) {
            f = f2;
        } else if (f < f3) {
            f = f3;
        }
        return C500260Jjc.LJZ((f / (f2 - f3)) * (i - i2));
    }

    public static final float LIZLLL(LiveEffect.ComposerConfig composerConfig, int i) {
        float f;
        int i2;
        int i3;
        float f2;
        if (i == 0) {
            return 0.0f;
        }
        if (composerConfig != null) {
            i3 = composerConfig.LIZJ;
            i2 = composerConfig.LIZLLL;
            f = composerConfig.LJ;
            f2 = composerConfig.LJFF;
            if (i2 < 0) {
                if (i > 0) {
                    return (i / i3) * f;
                }
                return f2 * (i / i2);
            }
        } else {
            f = 1.0f;
            i2 = 0;
            i3 = 100;
            f2 = 0.0f;
        }
        return ((i * 1.0f) / (i3 - i2)) * (f - f2);
    }

    public static String[] LJII(LiveComposerNode liveComposerNode, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (C13LP.LJJJLL(liveComposerNode.tagList) != null) {
            for (LiveComposerTagNode liveComposerTagNode : liveComposerNode.tagList) {
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(liveComposerNode.path);
                    sbLIZ.append(':');
                    sbLIZ.append(liveComposerTagNode.LIZ);
                    sbLIZ.append(":0");
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(liveComposerNode.path);
                    sbLIZ2.append(':');
                    sbLIZ2.append(liveComposerTagNode.LIZ);
                    sbLIZ2.append(':');
                    sbLIZ2.append(liveComposerTagNode.value);
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        } else {
            arrayList.add(liveComposerNode.path);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String[] LJ(Map map, String[] strArr, boolean z) {
        String strJ3;
        Object next;
        JSONObject jSONObject;
        boolean z2;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator it2 = ((ConcurrentHashMap) map).entrySet().iterator();
            while (true) {
                strJ3 = "";
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    Iterator it3 = ((Iterable) entry.getValue()).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            LiveEffect liveEffect = (LiveEffect) next;
                            if (C500260Jjc.LJJIIZ(liveEffect.getFilePath()) && u.LJJIIJZLJL(str, liveEffect.getFilePath(), false)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    LiveEffect liveEffect2 = (LiveEffect) next;
                    if (liveEffect2 != null) {
                        String extra = liveEffect2.getExtra();
                        if (extra == null) {
                            extra = "";
                        }
                        try {
                            if (!Intrinsics.LJFF(extra, "")) {
                                jSONObject = new JSONObject(extra);
                            } else {
                                jSONObject = new JSONObject();
                            }
                            jSONObject.put("sticker_panel", key);
                            jSONObject.put("effect_id", String.valueOf(liveEffect2.getEffectId()));
                            if (LiveGiftEffectAddTagSetting.INSTANCE.enable()) {
                                jSONObject.put("gift_id", String.valueOf(liveEffect2.getGiftId()));
                            }
                            jSONObject.put("msg_id", String.valueOf(liveEffect2.getMsgId()));
                            if (z) {
                                jSONObject.put("delay_remove", "1");
                            }
                            strJ3 = C786410Ut5.J3(jSONObject);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            strJ3 = extra;
                        }
                    }
                }
            }
            arrayList.add(strJ3);
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effect extra list:");
        sbLIZ.append(Arrays.toString(strArr2));
        C20441214yg.LIZIZ("LiveComposerUtils", C2188811AlT.LIZIZ(sbLIZ));
        return strArr2;
    }
}
