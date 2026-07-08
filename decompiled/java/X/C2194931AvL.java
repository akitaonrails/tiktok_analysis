package X;

import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl$startRender$2$runtime$1$onSuccess$3", f = "MiniGameRenderServiceImpl.kt", l = {773}, m = "invokeSuspend")
public final class C2194931AvL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MiniGameRenderServiceImpl LLILLJJLI;
    public final /* synthetic */ C1304490k3D LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SchemaParserData LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C2196371Axf LLIZ;
    public final /* synthetic */ WeakReference<C2195011AvT> LLIZLLLIL;
    public final /* synthetic */ MinisMetaResp LLJ;
    public final /* synthetic */ AtomicBoolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194931AvL(MiniGameRenderServiceImpl miniGameRenderServiceImpl, C1304490k3D c1304490k3D, String str, SchemaParserData schemaParserData, boolean z, C2196371Axf c2196371Axf, WeakReference<C2195011AvT> weakReference, MinisMetaResp minisMetaResp, AtomicBoolean atomicBoolean, InterfaceC1364105Vn<? super C2194931AvL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = miniGameRenderServiceImpl;
        this.LLILLL = c1304490k3D;
        this.LLILZ = str;
        this.LLILZIL = schemaParserData;
        this.LLILZLL = z;
        this.LLIZ = c2196371Axf;
        this.LLIZLLLIL = weakReference;
        this.LLJ = minisMetaResp;
        this.LLJI = atomicBoolean;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2194931AvL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        SchemaParserData schemaParserData;
        MinisMetaResp minisMetaResp;
        String strLJII;
        JSONObject jSONObject;
        String str;
        C1C7U.LIZ("MiniGameRenderServiceImpl@ccfc.startRender$2$runtime$1$onSuccess$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MiniGameRenderServiceImpl miniGameRenderServiceImpl = this.LLILLJJLI;
            C1304490k3D c1304490k3D = this.LLILLL;
            this.LL = 1;
            obj = miniGameRenderServiceImpl.LIZLLL(c1304490k3D, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MiniGameRenderServiceImpl@ccfc.startRender$2$runtime$1$onSuccess$3");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("coreJS load/execute failed for schema: ");
            sbLIZ.append(this.LLILZ);
            C1720106oR.LIZ("MiniGameRenderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            MiniGameRenderServiceImpl.LJII(this.LLJI, this.LLIZ, this.LLILZLL, false, 301, this.LLILZIL);
            if (!this.LLILZLL) {
                JSONArray jSONArray = C2196361Axe.LIZ;
                C2196361Axe.LJI(this.LLIZ, this.LLILZIL);
            }
            C2195011AvT c2195011AvT = this.LLIZLLLIL.get();
            if (c2195011AvT != null) {
                c2195011AvT.LJIIIZ(301, "coreJS load or execute failed", false);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MiniGameRenderServiceImpl@ccfc.startRender$2$runtime$1$onSuccess$3");
            return unit;
        }
        MiniGameRenderServiceImpl miniGameRenderServiceImpl2 = this.LLILLJJLI;
        C1304490k3D c1304490k3D2 = this.LLILLL;
        SchemaParserData schemaParserData2 = this.LLILZIL;
        MinisMetaResp minisMetaResp2 = this.LLJ;
        miniGameRenderServiceImpl2.getClass();
        if (schemaParserData2 == null) {
            schemaParserData = C2195221Avo.LJII;
        } else {
            schemaParserData = schemaParserData2;
        }
        if (minisMetaResp2 == null) {
            minisMetaResp = C2195221Avo.LJIIJ;
        } else {
            minisMetaResp = minisMetaResp2;
        }
        if (schemaParserData != null) {
            strLJII = schemaParserData.LJII();
        } else {
            strLJII = "__GAME__";
        }
        if (minisMetaResp != null) {
            C1227904rF.LIZ.getClass();
            jSONObject = new JSONObject(C1227904rF.LJI(minisMetaResp));
        } else {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", strLJII);
        jSONObject2.put("meta", jSONObject);
        IMiniGameRuntimeAPI runtime = c1304490k3D2.getRuntime();
        if (runtime != null) {
            runtime.emitJSAPIEvent("onGameReady", jSONObject2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("notifyOnGameReady, pkgName: ");
        sbLIZ2.append(strLJII);
        sbLIZ2.append(", clientKey: ");
        String str2 = null;
        if (schemaParserData != null) {
            str = schemaParserData.clientKey;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        sbLIZ2.append(", metaClientKey: ");
        if (minisMetaResp != null) {
            str2 = minisMetaResp.clientKey;
        }
        sbLIZ2.append(str2);
        sbLIZ2.append(", fromArgs: ");
        if (schemaParserData2 == null || minisMetaResp2 == null) {
            z = false;
        }
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        C2195011AvT c2195011AvT2 = this.LLIZLLLIL.get();
        if (c2195011AvT2 != null) {
            c2195011AvT2.LJIIJ(EnumC1007130cJb.PRE_RENDER);
        }
        JSONArray jSONArray2 = C2196361Axe.LIZ;
        C2196361Axe.LJIILJJIL(this.LLILZIL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MiniGameRenderServiceImpl@ccfc.startRender$2$runtime$1$onSuccess$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
