package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.jsb.SetLocalMsgDataMethodIDL$handle$2", f = "SetLocalMsgDataMethodIDL.kt", l = {61}, m = "invokeSuspend")
public final class C601640Nik extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC601560Nic LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC601390NiL> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C601380NiK LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C601640Nik(InterfaceC601560Nic interfaceC601560Nic, CompletionBlock<InterfaceC601390NiL> completionBlock, String str, C601380NiK c601380NiK, InterfaceC1364105Vn<? super C601640Nik> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC601560Nic;
        this.LLILLL = completionBlock;
        this.LLILZ = str;
        this.LLILZIL = c601380NiK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C601640Nik(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long jLongValue;
        boolean z;
        LinkedHashMap linkedHashMap;
        C601670Nin c601670NinPutIfAbsent;
        Object objLIZ = obj;
        C1C7U.LIZ("SetLocalMsgDataMethodIDL@86b.handle$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = "";
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
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
                CompletionBlock<InterfaceC601390NiL> completionBlock = this.LLILLL;
                XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601390NiL.class, this.LLILZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error - ");
                sbLIZ.append("msg doesn't exist in db");
                C2188811AlT.LIZIZ(sbLIZ);
                completionBlock.onFailure(0, "msg doesn't exist in db", xBaseResultModel);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SetLocalMsgDataMethodIDL@86b.handle$2");
                return unit;
            }
            String str2 = C601680Nio.LIZ;
            String uuid = c869590Y9lLIZ.getUuid();
            Map<String, Object> clientRAMData = this.LLILLJJLI.getClientRAMData();
            if (clientRAMData != null) {
                ConcurrentHashMap<String, C601670Nin> concurrentHashMap = C601680Nio.LIZIZ;
                String strLIZ = C601680Nio.LIZ();
                C601670Nin c601670Nin = concurrentHashMap.get(strLIZ);
                if (c601670Nin == null && (c601670NinPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZ, (c601670Nin = new C601670Nin()))) != null) {
                    c601670Nin = c601670NinPutIfAbsent;
                }
                C601670Nin c601670Nin2 = c601670Nin;
                Map<String, Object> map = c601670Nin2.LIZ.get(uuid);
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(map);
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                for (Map.Entry<String, Object> entry : clientRAMData.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                c601670Nin2.LIZ.put(uuid, C2097608Jq.LJIIZILJ(linkedHashMap));
            }
            Map<String, Object> clientDBData = this.LLILLJJLI.getClientDBData();
            if (clientDBData != null && !clientDBData.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                CompletionBlock<InterfaceC601390NiL> completionBlock2 = this.LLILLL;
                XBaseResultModel xBaseResultModel2 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601390NiL.class, this.LLILZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("success - ");
                sbLIZ2.append((String) null);
                C2188811AlT.LIZIZ(sbLIZ2);
                completionBlock2.onSuccess(xBaseResultModel2, "");
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SetLocalMsgDataMethodIDL@86b.handle$2");
                return unit2;
            }
            Set<Map.Entry<String, Object>> setEntrySet = clientDBData.entrySet();
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                String str3 = (String) entry2.getKey();
                Object value = entry2.getValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fe_local_data_");
                sbLIZ3.append(str3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                String string = value.toString();
                c869590Y9lLIZ.addLocalExt(strLIZIZ, string);
                Pair pair = new Pair(strLIZIZ, new C0Y3R(string));
                linkedHashMap2.put(pair.getFirst(), pair.getSecond());
            }
            InterfaceC603530Nln interfaceC603530NlnLIZIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ();
            String strLJI = C13LE.LIZ(this.LLILZIL.getClass()).LJI();
            if (strLJI == null) {
                strLJI = "";
            }
            C0Y3I c0y3i = new C0Y3I(strLJI);
            this.LL = 1;
            objLIZ = interfaceC603530NlnLIZIZ.LIZ(c869590Y9lLIZ, linkedHashMap2, c0y3i, false, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("SetLocalMsgDataMethodIDL@86b.handle$2");
                return objLJFF;
            }
        }
        CompletionBlock<InterfaceC601390NiL> completionBlock3 = this.LLILLL;
        String str4 = this.LLILZ;
        C0YPQ c0ypq = ((C0Y6Q) objLIZ).LIZIZ;
        if (c0ypq == null) {
            XBaseResultModel xBaseResultModel3 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601390NiL.class, str4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("success - ");
            sbLIZ4.append((String) null);
            C2188811AlT.LIZIZ(sbLIZ4);
            completionBlock3.onSuccess(xBaseResultModel3, "");
        } else {
            String message = c0ypq.getMessage();
            XBaseResultModel xBaseResultModel4 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601390NiL.class, str4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("error - ");
            sbLIZ5.append(message);
            C2188811AlT.LIZIZ(sbLIZ5);
            if (message != null) {
                str = message;
            }
            completionBlock3.onFailure(0, str, xBaseResultModel4);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SetLocalMsgDataMethodIDL@86b.handle$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
