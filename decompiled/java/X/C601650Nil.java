package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.jsb.RemoveLocalMsgDataMethodIDL$handle$2", f = "RemoveLocalMsgDataMethodIDL.kt", l = {53}, m = "invokeSuspend")
public final class C601650Nil extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC601660Nim LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC601350NiH> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C601340NiG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C601650Nil(InterfaceC601660Nim interfaceC601660Nim, CompletionBlock<InterfaceC601350NiH> completionBlock, String str, C601340NiG c601340NiG, InterfaceC1364105Vn<? super C601650Nil> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC601660Nim;
        this.LLILLL = completionBlock;
        this.LLILZ = str;
        this.LLILZIL = c601340NiG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C601650Nil(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long jLongValue;
        boolean z;
        Object objLJ;
        C601670Nin c601670NinPutIfAbsent;
        Object objLJI = obj;
        C1C7U.LIZ("RemoveLocalMsgDataMethodIDL@efb5.handle$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = "";
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            String clientMsgId = this.LLILLJJLI.getClientMsgId();
            try {
                c098200Yq = C2286608xc.LJFF(CastLongProtector.parseLong(this.LLILLJJLI.getServerMsgId()));
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
                CompletionBlock<InterfaceC601350NiH> completionBlock = this.LLILLL;
                XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601350NiH.class, this.LLILZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error - ");
                sbLIZ.append("msg doesn't exist in db");
                C2188811AlT.LIZIZ(sbLIZ);
                completionBlock.onFailure(0, "msg doesn't exist in db", xBaseResultModel);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RemoveLocalMsgDataMethodIDL@efb5.handle$2");
                return unit;
            }
            String str2 = C601680Nio.LIZ;
            String uuid = c869590Y9lLIZ.getUuid();
            if (this.LLILLJJLI.getClientRAMKeys() != null) {
                ConcurrentHashMap<String, C601670Nin> concurrentHashMap = C601680Nio.LIZIZ;
                String strLIZ = C601680Nio.LIZ();
                C601670Nin c601670Nin = concurrentHashMap.get(strLIZ);
                if (c601670Nin == null && (c601670NinPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZ, (c601670Nin = new C601670Nin()))) != null) {
                    c601670Nin = c601670NinPutIfAbsent;
                }
                C601670Nin c601670Nin2 = c601670Nin;
                Map<String, Object> map = c601670Nin2.LIZ.get(uuid);
                if (map != null) {
                    objLJ = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!r13.contains(entry.getKey())) {
                            objLJ.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    objLJ = C2097608Jq.LJ();
                }
                c601670Nin2.LIZ.put(uuid, (Map<String, Object>) objLJ);
            }
            List<String> clientDBKeys = this.LLILLJJLI.getClientDBKeys();
            if (clientDBKeys != null && !clientDBKeys.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                CompletionBlock<InterfaceC601350NiH> completionBlock2 = this.LLILLL;
                XBaseResultModel xBaseResultModel2 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601350NiH.class, this.LLILZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("success - ");
                sbLIZ2.append((String) null);
                C2188811AlT.LIZIZ(sbLIZ2);
                completionBlock2.onSuccess(xBaseResultModel2, "");
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("RemoveLocalMsgDataMethodIDL@efb5.handle$2");
                return unit2;
            }
            Iterator<String> it2 = clientDBKeys.iterator();
            while (it2.hasNext()) {
                c869590Y9lLIZ.clearLocalExt(it2.next());
            }
            InterfaceC603530Nln interfaceC603530NlnLIZIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ();
            Set<String> setLLIIJI = C13LP.LLIIJI(clientDBKeys);
            String strLJI = C13LE.LIZ(this.LLILZIL.getClass()).LJI();
            if (strLJI == null) {
                strLJI = "";
            }
            C0Y3I c0y3i = new C0Y3I(strLJI);
            this.LL = 1;
            objLJI = interfaceC603530NlnLIZIZ.LJI(c869590Y9lLIZ, setLLIIJI, c0y3i, false, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("RemoveLocalMsgDataMethodIDL@efb5.handle$2");
                return objLJFF;
            }
        }
        CompletionBlock<InterfaceC601350NiH> completionBlock3 = this.LLILLL;
        String str3 = this.LLILZ;
        C0YPQ c0ypq = ((C0Y6Q) objLJI).LIZIZ;
        if (c0ypq == null) {
            XBaseResultModel xBaseResultModel3 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601350NiH.class, str3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("success - ");
            sbLIZ3.append((String) null);
            C2188811AlT.LIZIZ(sbLIZ3);
            completionBlock3.onSuccess(xBaseResultModel3, "");
        } else {
            String message = c0ypq.getMessage();
            XBaseResultModel xBaseResultModel4 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601350NiH.class, str3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("error - ");
            sbLIZ4.append(message);
            C2188811AlT.LIZIZ(sbLIZ4);
            if (message != null) {
                str = message;
            }
            completionBlock3.onFailure(0, str, xBaseResultModel4);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RemoveLocalMsgDataMethodIDL@efb5.handle$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
