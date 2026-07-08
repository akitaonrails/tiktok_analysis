package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ExS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381440ExS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C381430ExR LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC381500ExY<C381330ExH> LLILZLL;
    public final /* synthetic */ C381480ExW LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381440ExS(C381430ExR c381430ExR, int i, int i2, int i3, String str, InterfaceC381500ExY<C381330ExH> interfaceC381500ExY, C381480ExW c381480ExW, String str2) {
        super(0);
        this.LL = c381430ExR;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC381500ExY;
        this.LLIZ = c381480ExW;
        this.LLIZLLLIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        Object obj;
        C381430ExR c381430ExR = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LL.LJ);
        sbLIZ.append("] MessageReceived: type=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", arg1=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", arg2=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", listenerId=");
        InterfaceC381500ExY<C381330ExH> interfaceC381500ExY = this.LL.LIZJ;
        sbLIZ.append(interfaceC381500ExY != null ? interfaceC381500ExY.LIZIZ() : null);
        sbLIZ.append(", listenerIsNull=");
        sbLIZ.append(this.LL.LIZJ == null);
        sbLIZ.append(", arg3=");
        sbLIZ.append(this.LLILZIL);
        C381530Exb.LIZJ(c381430ExR, C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LLILLJJLI;
        if ((i == 17 || i == 41) && this.LLILLL == 0 && this.LLILZ == 0 && (str = this.LLILZIL) != null) {
            C381430ExR c381430ExR2 = this.LL;
            InterfaceC381500ExY<C381330ExH> interfaceC381500ExY2 = this.LLILZLL;
            C381480ExW c381480ExW = this.LLIZ;
            String str2 = this.LLIZLLLIL;
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("interface");
                String strOptString2 = jSONObject.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                if (Intrinsics.LJFF(strOptString, "editing_effect_server_algo")) {
                    String strOptString3 = jSONObject.optString("path_cache");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('[');
                    sbLIZ2.append(c381430ExR2.LJ);
                    sbLIZ2.append("] EFFECT_SERVER_ALGO_RESULT: effectCacheUrl=");
                    sbLIZ2.append(strOptString3);
                    sbLIZ2.append(", listenerId=");
                    sbLIZ2.append(interfaceC381500ExY2.LIZIZ());
                    sbLIZ2.append(", isMatch=");
                    sbLIZ2.append(Intrinsics.LJFF(interfaceC381500ExY2.LIZIZ(), strOptString3));
                    C381530Exb.LIZJ(c381430ExR2, C2188811AlT.LIZIZ(sbLIZ2));
                    boolean zContains = C1697810uHb.LJIIJJI("fail", "cached result wrong", "no full body", "no face").contains(strOptString2);
                    boolean zLJFF = Intrinsics.LJFF(strOptString2, "success");
                    if (!c381480ExW.LJI || !C358630E4f.LIZ() || C381400ExO.LIZ() == 0) {
                        LIZ(zLJFF, c381430ExR2, str2, interfaceC381500ExY2, strOptString3, zContains, strOptString2, jSONObject);
                    } else if (C381400ExO.LIZ() > 0) {
                        if (Intrinsics.LJFF(interfaceC381500ExY2.LIZIZ(), strOptString3)) {
                            LIZ(zLJFF, c381430ExR2, str2, interfaceC381500ExY2, strOptString3, zContains, strOptString2, jSONObject);
                        } else if (zLJFF && C381430ExR.LJJIIZ(interfaceC381500ExY2.LIZIZ())) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append('[');
                            sbLIZ3.append(c381430ExR2.LJ);
                            sbLIZ3.append("] onSuccess(folder): cost=");
                            sbLIZ3.append(c381430ExR2.LJJIIJZLJL());
                            sbLIZ3.append(", cacheUrl=");
                            sbLIZ3.append(str2);
                            C381530Exb.LIZJ(c381430ExR2, C2188811AlT.LIZIZ(sbLIZ3));
                            C381330ExH c381330ExH = new C381330ExH(strOptString3);
                            Map<String, String> map = c381330ExH.LIZIZ;
                            try {
                                Map<String, Object> map2 = JsonExtKt.toMap(jSONObject);
                                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                                for (Object obj2 : map2.entrySet()) {
                                    linkedHashMap.put(((Map.Entry) obj2).getKey(), ((Map.Entry) obj2).getValue().toString());
                                }
                                C189200o6.m2constructorimpl(linkedHashMap);
                                obj = linkedHashMap;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C098200Yq c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                                obj = c098200Yq;
                            }
                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
                            Object objLJ = obj;
                            if (thM5exceptionOrNullimpl != null) {
                                objLJ = C2097608Jq.LJ();
                            }
                            map.putAll((Map) objLJ);
                            interfaceC381500ExY2.LIZLLL(c381330ExH);
                            c381430ExR2.LJJIIZI();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(boolean r6, X.C381430ExR r7, java.lang.String r8, X.InterfaceC381500ExY<X.C381330ExH> r9, java.lang.String r10, boolean r11, java.lang.String r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381440ExS.LIZ(boolean, X.0ExR, java.lang.String, X.0ExY, java.lang.String, boolean, java.lang.String, org.json.JSONObject):void");
    }
}
