package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS375S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Nij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.jsb.GetLocalMsgDataMethodIDL$handle$2", f = "GetLocalMsgDataMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C601630Nij extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC601620Nii LL;
    public final /* synthetic */ CompletionBlock<InterfaceC601550Nib> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C601630Nij(InterfaceC601620Nii interfaceC601620Nii, CompletionBlock<InterfaceC601550Nib> completionBlock, String str, InterfaceC1364105Vn<? super C601630Nij> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC601620Nii;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C601630Nij(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long jLongValue;
        ?? LJ;
        C601670Nin c601670NinPutIfAbsent;
        C1C7U.LIZ("GetLocalMsgDataMethodIDL@85e4.handle$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String clientMsgId = this.LL.getClientMsgId();
        try {
            c098200Yq = C2286608xc.LJFF(CastLongProtector.parseLong(this.LL.getServerMsgId()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Long l = (Long) c098200Yq;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        C869590Y9l c869590Y9lLIZ = C601720Nis.LIZ(jLongValue, clientMsgId);
        if (c869590Y9lLIZ == null) {
            CompletionBlock<InterfaceC601550Nib> completionBlock = this.LLILLJJLI;
            XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601550Nib.class, this.LLILLL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error - ");
            sbLIZ.append("msg doesn't exist in db");
            C2188811AlT.LIZIZ(sbLIZ);
            completionBlock.onFailure(0, "msg doesn't exist in db", xBaseResultModel);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GetLocalMsgDataMethodIDL@85e4.handle$2");
            return unit;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<String> clientDBKeys = this.LL.getClientDBKeys();
        if (clientDBKeys != null) {
            for (String str : clientDBKeys) {
                String str2 = c869590Y9lLIZ.getLocalExt().get("fe_local_data_" + str);
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put(str, str2);
            }
        }
        String str3 = C601680Nio.LIZ;
        String uuid = c869590Y9lLIZ.getUuid();
        List<String> clientRAMKeys = this.LL.getClientRAMKeys();
        if (clientRAMKeys == null) {
            LJ = C2097608Jq.LJ();
        } else {
            ConcurrentHashMap<String, C601670Nin> concurrentHashMap = C601680Nio.LIZIZ;
            String strLIZ = C601680Nio.LIZ();
            C601670Nin c601670Nin = concurrentHashMap.get(strLIZ);
            if (c601670Nin == null && (c601670NinPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZ, (c601670Nin = new C601670Nin()))) != null) {
                c601670Nin = c601670NinPutIfAbsent;
            }
            Map<String, Object> map = c601670Nin.LIZ.get(uuid);
            if (map != null) {
                LJ = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (clientRAMKeys.contains(entry.getKey())) {
                        LJ.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
        }
        linkedHashMap2.putAll(LJ);
        CompletionBlock<InterfaceC601550Nib> completionBlock2 = this.LLILLJJLI;
        String str4 = this.LLILLL;
        AwS375S0200000_9 awS375S0200000_9 = new AwS375S0200000_9(linkedHashMap, (Map<String, Object>) linkedHashMap2, (Map<String, Object>) 169);
        XBaseResultModel xBaseResultModel2 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601550Nib.class, str4);
        awS375S0200000_9.invoke(xBaseResultModel2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("success - ");
        sbLIZ2.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ2);
        completionBlock2.onSuccess(xBaseResultModel2, "");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GetLocalMsgDataMethodIDL@85e4.handle$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
