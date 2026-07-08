package X;

import Y.ACallableS67S1200000_3;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2188308hl implements InterfaceC2373909Rx {
    public final CommonApi LIZ = (CommonApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(CommonApi.class);

    public final void LIZJ(String str, Map<String, String> map, InterfaceC2373409Rs interfaceC2373409Rs) {
        C15O7.LIZJ(new ACallableS67S1200000_3(map, str, this, 3)).LJ(new C2501509rB(interfaceC2373409Rs, 20), C15O7.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC2373909Rx
    public final void LIZIZ(String str, Map<String, String> map, boolean z, Map<String, String> map2, InterfaceC2373409Rs interfaceC2373409Rs) {
        LIZJ(str, map, interfaceC2373409Rs);
    }

    public final void LIZLLL(final String str, final Map<String, String> map, final String str2, final JSONObject jSONObject, InterfaceC2373409Rs interfaceC2373409Rs) {
        C15O7.LIZJ(new Callable() { // from class: X.08hk
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2188408hm c2188408hm;
                String str3;
                ArrayList arrayList;
                C1C7U.LIZ("PrefetchNetworkExecutor@3761.post$1");
                try {
                    String str4 = str2;
                    if (str4 != null) {
                        C2188108hj c2188108hj = C2188108hj.LIZ;
                        String str5 = str;
                        JSONObject jSONObject2 = jSONObject;
                        Map<String, String> map2 = map;
                        if (map2 != null) {
                            ArrayList arrayList2 = new ArrayList(map2.size());
                            for (Map.Entry<String, String> entry : map2.entrySet()) {
                                arrayList2.add(new C080U(entry.getKey(), entry.getValue()));
                            }
                            arrayList = new ArrayList(arrayList2);
                        } else {
                            arrayList = null;
                        }
                        c2188108hj.getClass();
                        str3 = (String) C2188108hj.LIZ(str5, jSONObject2, str4, arrayList).LIZIZ;
                    } else {
                        HashMap map3 = new HashMap();
                        JSONObject jSONObject3 = jSONObject;
                        if (jSONObject3 != null) {
                            Iterator<String> itKeys = jSONObject3.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                map3.put(next, jSONObject.optString(next, ""));
                            }
                        }
                        str3 = this.LIZ.doPost(str, map3).execute().LIZIZ;
                    }
                    c2188408hm = new C2188408hm(true, str3.getBytes(Charsets.UTF_8), null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c2188408hm = new C2188408hm(false, null, th);
                }
                C1C7U.LIZIZ("PrefetchNetworkExecutor@3761.post$1");
                return c2188408hm;
            }
        }).LJ(new C2501509rB(interfaceC2373409Rs, 21), C15O7.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC2373909Rx
    public final void LIZ(String str, Map<String, String> map, String str2, JSONObject jSONObject, boolean z, Map<String, String> map2, InterfaceC2373409Rs interfaceC2373409Rs) {
        LIZLLL(str, map, str2, jSONObject, interfaceC2373409Rs);
    }
}
