package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetItemModel;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0KvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.resource.TemplateFetcher$requestTemplateDetailViaAssetItem$1$onSuccess$1", f = "TemplateFetcher.kt", l = {}, m = "invokeSuspend")
public final class C533060KvQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AssetItemResponse LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, String, String, Unit> LLILLL;
    public final /* synthetic */ Function2<String, String, Unit> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ Function1<Map<String, C532330KuF>, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C533060KvQ(AssetItemResponse assetItemResponse, InterfaceC1631620sYq<? super Integer, ? super String, ? super String, Unit> interfaceC1631620sYq, Function2<? super String, ? super String, Unit> function2, List<String> list, Function1<? super Map<String, C532330KuF>, Unit> function1, InterfaceC1364105Vn<? super C533060KvQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = assetItemResponse;
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = function2;
        this.LLILZIL = list;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533060KvQ c533060KvQ = new C533060KvQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c533060KvQ.LL = obj;
        return c533060KvQ;
    }

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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int status_code;
        String message;
        Object obj2;
        List<Asset> list;
        String next;
        AssetItemModel data;
        String logId;
        C1C7U.LIZ("TemplateFetcher@4ce9.requestTemplateDetailViaAssetItem$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AssetItemResponse assetItemResponse = this.LLILLJJLI;
        if (assetItemResponse != null) {
            status_code = assetItemResponse.getStatus_code();
        } else {
            status_code = -1;
        }
        AssetItemResponse assetItemResponse2 = this.LLILLJJLI;
        if (assetItemResponse2 != null) {
            message = assetItemResponse2.getMessage();
        } else {
            message = null;
        }
        String str = "";
        if (message == null) {
            message = "";
        }
        AssetItemResponse assetItemResponse3 = this.LLILLJJLI;
        if (assetItemResponse3 != null && (logId = assetItemResponse3.getLogId()) != null) {
            str = logId;
        }
        InterfaceC1631620sYq<Integer, String, String, Unit> interfaceC1631620sYq = this.LLILLL;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(C2286608xc.LJ(status_code), message, str);
        }
        if (status_code != 0) {
            Function2<String, String, Unit> function2 = this.LLILZ;
            if (function2 != null) {
                if (message.length() == 0) {
                    message = "net fail";
                }
                function2.invoke(message, str);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TemplateFetcher@4ce9.requestTemplateDetailViaAssetItem$1$onSuccess$1");
            return unit;
        }
        AssetItemResponse assetItemResponse4 = this.LLILLJJLI;
        List<String> list2 = this.LLILZIL;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (assetItemResponse4 == null || (data = assetItemResponse4.getData()) == null || (list = data.asset_list) == null) {
                list = C13BV.INSTANCE;
            }
            for (Asset asset : list) {
                C1416990myf.LIZ.getClass();
                C532330KuF c532330KuFLIZ = C1416990myf.LIZ(asset);
                Iterator<String> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        String str2 = next;
                        if (Intrinsics.LJFF(str2, asset.getAsset_id()) || Intrinsics.LJFF(asset.getResource_id(), str2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                String asset_id = next;
                if (asset_id == null) {
                    asset_id = asset.getAsset_id();
                }
                C1416990myf.LIZ.getClass();
                C533070KvR c533070KvR = (C533070KvR) C1416990myf.LIZJ.getValue();
                if (!c533070KvR.LIZ.containsKey(asset_id)) {
                    c533070KvR.LIZ.put(asset_id, c532330KuFLIZ);
                }
                linkedHashMap.put(asset_id, c532330KuFLIZ);
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj2 = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        Function1<Map<String, C532330KuF>, Unit> function1 = this.LLILZLL;
        if (C189200o6.m8isSuccessimpl(obj2)) {
            function1.invoke(obj2);
        }
        Function2<String, String, Unit> function22 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
        if (thM5exceptionOrNullimpl != null && function22 != null) {
            String message2 = thM5exceptionOrNullimpl.getMessage();
            if (message2 == null) {
                message2 = "unknown error";
            }
            function22.invoke(message2, str);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateFetcher@4ce9.requestTemplateDetailViaAssetItem$1$onSuccess$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
