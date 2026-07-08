package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.093x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.helper.AIPlaygroundInspirationChipsHelper$addTextDataModel$1$results$1", f = "AIPlaygroundInspirationChipsHelper.kt", l = {}, m = "invokeSuspend")
public final class C23115093x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AIPlaygroundChipsModel>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<Effect> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23115093x(String str, List list, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23115093x c23115093x = new C23115093x(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c23115093x.LL = obj;
        return c23115093x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object arrayList;
        Object c098200Yq;
        String str;
        C1C7U.LIZ("AIPlaygroundInspirationChipsHelper@4c0a.addTextDataModel$1$results$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Effect> list = this.LLILLJJLI;
        if (list != null) {
            boolean z = this.LLILLL;
            String str2 = this.LLILZ;
            arrayList = new ArrayList();
            for (Effect effect : list) {
                Object obj2 = null;
                if (effect != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(effect.getTransResPath());
                    sbLIZ.append("/trans.json");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                    if (!c0vsj.exists()) {
                        C559380Lwm c559380Lwm = C559380Lwm.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fileNotFound: ");
                        sbLIZ2.append(strLIZIZ);
                        C201955140j.LJIIIIZZ(c559380Lwm, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        try {
                            String string = a0.LJLIIIL(C09BH.LJI(c0vsj, Charset.defaultCharset())).toString();
                            new p();
                            n nVarLJJIJ = p.LIZJ(string).LJIILIIL().LJJIJ("trans_text");
                            String strLJIL = nVarLJJIJ.LJJIIZ("title").LJIL();
                            String strLJIL2 = nVarLJJIJ.LJJIIZ("content").LJIL();
                            if (z || (str = (String) C13LP.LJJJLL(effect.getIcon_url().getUrlList())) == null) {
                                str = "";
                            }
                            c098200Yq = new AIPlaygroundChipsModel(effect.getResource_id(), strLJIL, strLJIL2, str2, str);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl == null) {
                            obj2 = c098200Yq;
                        } else {
                            C559380Lwm c559380Lwm2 = C559380Lwm.LIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("parse error: ");
                            sbLIZ3.append(thM5exceptionOrNullimpl.getMessage());
                            C201955140j.LJIIIIZZ(c559380Lwm2, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("AIPlaygroundInspirationChipsHelper@4c0a.addTextDataModel$1$results$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AIPlaygroundChipsModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
