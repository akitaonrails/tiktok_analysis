package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS117S1000000_33;
import kotlin.jvm.internal.AwS182S1100000_33;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1A57, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A57 {
    public static final C1A57 LIZ = new C1A57();
    public static final HashMap<String, C1A5B> LIZIZ = new HashMap<>();

    public static boolean LIZJ() {
        InterfaceC20320414fC interfaceC20320414fCG3;
        InterfaceC20320414fC interfaceC20320414fCG32;
        InterfaceC20320414fC interfaceC20320414fCG33;
        Boolean boolValueOf = null;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        Boolean boolValueOf2 = null;
        if (iLiveOuterService != null && (interfaceC20320414fCG33 = iLiveOuterService.G3()) != null) {
            boolValueOf = Boolean.valueOf(interfaceC20320414fCG33.LIZIZ());
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService2 != null && (interfaceC20320414fCG32 = iLiveOuterService2.G3()) != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC20320414fCG32.LJII());
        }
        C589080N8o.LIZIZ(C20267014Rw.LIZ, "GameLiveBottomBarAssemTest", new AwS408S0200000_7(boolValueOf2, boolValueOf, 67));
        ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        boolean z = (iLiveOuterService3 == null || (interfaceC20320414fCG3 = iLiveOuterService3.G3()) == null || interfaceC20320414fCG3.LIZLLL() <= 0) ? false : true;
        Boolean bool = Boolean.FALSE;
        return Intrinsics.LJFF(boolValueOf, bool) && Intrinsics.LJFF(boolValueOf2, bool) && !z;
    }

    public static String LIZIZ(String str) {
        C1A5B c1a5b;
        if (LIZJ()) {
            return null;
        }
        C20266914Rv c20266914Rv = C20267014Rw.LIZ;
        C589080N8o.LIZIZ(c20266914Rv, "GameLiveBottomBarAssemTest", new AwS117S1000000_33(str, 3));
        if (str == null || (c1a5b = (C1A5B) C7726030a.LIZ(str, LIZIZ)) == null) {
            return null;
        }
        C589080N8o.LIZIZ(c20266914Rv, "GameLiveBottomBarAssemTest", new AwS182S1100000_33(str, c1a5b, 1));
        return c1a5b.LIZIZ;
    }

    public static void LIZ(String str, String str2) {
        String string;
        if (LIZJ()) {
            return;
        }
        C20266914Rv c20266914Rv = C20267014Rw.LIZ;
        C589080N8o.LIZIZ(c20266914Rv, "GameLiveBottomBarAssemTest", new C1A59(str2, str));
        C1A5B c1a5b = null;
        if (str != null) {
            int i = 0;
            if (!a0.LJJIIZI(str, "hero_list", false)) {
                C589080N8o.LIZIZ(c20266914Rv, "GameLiveBottomBarAssemTest", AFwS224S0000000_33.get$arr$(621));
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("hero_list")) {
                        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "hero_list");
                        int length = jSONArray.length();
                        long j = -1;
                        while (true) {
                            if (i < length) {
                                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                                if (jSONObject2.has(FollowStatusChangeMethod.PARAM_UID) && jSONObject2.has("name")) {
                                    j = JSONObjectProtectorUtils.getLong(jSONObject2, FollowStatusChangeMethod.PARAM_UID);
                                    if (j >= 0) {
                                        string = JSONObjectProtectorUtils.getString(jSONObject2, "name");
                                        if (string == null) {
                                            string = "";
                                        }
                                    }
                                }
                                i++;
                            } else {
                                string = null;
                                break;
                            }
                        }
                        if (j > 0) {
                            jSONObject.remove("hero_list");
                            jSONObject.put("hero_id", String.valueOf(j));
                            c1a5b = new C1A5B(j, string, C786410Ut5.J3(jSONObject));
                        }
                    } else {
                        C589080N8o.LIZIZ(c20266914Rv, "GameLiveBottomBarAssemTest", AFwS224S0000000_33.get$arr$(622));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C589080N8o.LIZIZ(C20267014Rw.LIZ, "GameLiveBottomBarAssemTest", new C5182020e(e, 547));
                }
            }
        }
        C589080N8o.LIZIZ(C20267014Rw.LIZ, "GameLiveBottomBarAssemTest", new AwS577S0100000_33(c1a5b, 4118));
        if (str2 != null && c1a5b != null) {
            LIZIZ.put(str2, c1a5b);
        }
    }
}
