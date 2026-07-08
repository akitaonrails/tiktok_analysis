package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DPJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbneo.FetchAweme$handle$1", f = "FetchAweme.kt", l = {49}, m = "invokeSuspend")
public final class C0DPJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C338550DOz LL;
    public CompletionBlock LLILLJJLI;
    public InterfaceC497601wk LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0DP6 LLIZ;
    public final /* synthetic */ C338550DOz LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ CompletionBlock<C0DP8> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DPJ(C0DP6 c0dp6, C338550DOz c338550DOz, boolean z, CompletionBlock<C0DP8> completionBlock, InterfaceC1364105Vn<? super C0DPJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c0dp6;
        this.LLIZLLLIL = c338550DOz;
        this.LLJ = z;
        this.LLJI = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0DPJ c0dpj = new C0DPJ(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c0dpj.LLILZLL = obj;
        return c0dpj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C0DP6 c0dp6;
        C338550DOz c338550DOz;
        boolean z;
        CompletionBlock<C0DP8> completionBlock;
        Object c098200Yq2;
        n nVar;
        String containerID;
        String containerID2;
        InterfaceC634840OvC interfaceC634840OvC;
        String containerID3;
        boolean z2;
        Object objLIZJ = obj;
        C1C7U.LIZ("FetchAweme@86a9.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    z = this.LLILZ;
                    completionBlock = this.LLILLJJLI;
                    c338550DOz = this.LL;
                    c0dp6 = (C0DP6) this.LLILZLL;
                    C155000ia.LIZIZ(objLIZJ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZJ);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
                c0dp6 = this.LLIZ;
                c338550DOz = this.LLIZLLLIL;
                z = this.LLJ;
                completionBlock = this.LLJI;
                SearchApiNew.RealApi realApiLIZ = SearchApiNew.LIZ();
                String url = c0dp6.getUrl();
                Map<String, Object> params = c0dp6.getParams();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : params.entrySet()) {
                    arrayList.add(new Pair(entry.getKey(), entry.getValue().toString()));
                }
                C11NZ<String> c11nzJsbRequestAwemeList = realApiLIZ.jsbRequestAwemeList(url, C2097608Jq.LJIILLIIL(arrayList));
                this.LLILZLL = c0dp6;
                this.LL = c338550DOz;
                this.LLILLJJLI = completionBlock;
                this.LLILLL = interfaceC497601wk;
                this.LLILZ = z;
                this.LLILZIL = 1;
                objLIZJ = C11UD.LIZJ(c11nzJsbRequestAwemeList, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("FetchAweme@86a9.handle$1");
                    return objLJFF;
                }
            }
            String str = (String) objLIZJ;
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq2 = (n) C1227904rF.LIZIZ(str, n.class);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            nVar = (n) c098200Yq2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (nVar == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FetchAweme@86a9.handle$1");
            return unit;
        }
        List listLIZIZ = C651830PhV.LIZIZ(nVar, c0dp6.getAwemePath());
        Iterator it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) C09CX.LJLJJLL("fetchAweme", Aweme.class, (Map) it2.next());
            if (aweme != null) {
                String aid = aweme.getAid();
                if (aid == null || aid.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(!z2)) {
                    aweme = null;
                }
                if (aweme != null) {
                    C651640PhC.LIZIZ.getClass();
                    C651640PhC.LJI().put(aweme.getAid(), aweme);
                }
            }
        }
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC2 = c338550DOz.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        C647380PaK.LJIIIIZZ.getClass();
        List listLJIIIIZZ = C647380PaK.LJIIIIZZ(c1537480q70LIZIZ, listLIZIZ);
        if (!(listLJIIIIZZ instanceof List)) {
            listLJIIIIZZ = null;
        }
        if (listLJIIIIZZ != null) {
            C651830PhV.LJIIIIZZ(c0dp6.getAwemePath(), nVar, listLJIIIIZZ);
        }
        if (z && (interfaceC634840OvC = c338550DOz.IBridgeSdkContext) != null && (containerID3 = interfaceC634840OvC.getContainerID()) != null) {
            C1529870puj.LIZ.getClass();
            InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(containerID3);
            if (interfaceC1541990qEHLJFF != null) {
                interfaceC1541990qEHLJFF.LIZ("awemeResponse", new JSONObject(C1741890vQh.LJIIIIZZ(nVar)));
            }
        }
        InterfaceC634840OvC interfaceC634840OvC3 = c338550DOz.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            containerID2 = interfaceC634840OvC3.getContainerID();
        } else {
            containerID2 = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0DP8.class, containerID2);
        C1227904rF.LIZ.getClass();
        ((C0DP8) xBaseModelLIZJ).setResponse((Map) C1227904rF.LIZLLL().LIZLLL(nVar, new TypeToken<Map<String, ? extends Object>>() { // from class: X.0DPK
        }.getType()));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        CompletionBlock<C0DP8> completionBlock2 = this.LLJI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "fetch aweme fail";
            }
            C2382909Vj.LIZ(completionBlock2, 0, message, null, 4);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FetchAweme@86a9.handle$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
