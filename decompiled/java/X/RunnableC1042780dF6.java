package X;

import com.bytedance.lynx.hybrid.ssp.base.net.DefaultNetAdapter;
import com.google.gson.h;
import com.google.gson.n;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0dF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1042780dF6 implements Runnable {
    public final /* synthetic */ C1042280dEI LL;

    public RunnableC1042780dF6(C1042280dEI c1042280dEI) {
        this.LL = c1042280dEI;
    }

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
    public final void LIZ() {
        DefaultNetAdapter defaultNetAdapter = C1042900dFI.LJFF;
        C1042280dEI c1042280dEI = this.LL;
        defaultNetAdapter.getClass();
        HashMap<String, String> map = new HashMap<>();
        map.put("ssp_sdk_version", "1");
        n nVar = new n();
        h hVar = new h();
        for (C1042770dF5 c1042770dF5 : c1042280dEI.LIZ) {
            n nVar2 = new n();
            nVar2.LJJIIJ("bid", c1042770dF5.LIZ);
            nVar2.LJJIIJ("current_url", c1042770dF5.LIZIZ);
            nVar2.LJJIIJ("scheme_url", c1042770dF5.LIZJ);
            nVar2.LJJIIJ("parent_url", c1042770dF5.LIZLLL);
            n nVar3 = c1042770dF5.LJ;
            nVar2.LJJIIJ("extra", nVar3 != null ? nVar3.toString() : "");
            nVar2.LJJIII(Integer.valueOf(c1042770dF5.LJFF), "hit_status");
            C1042840dFC c1042840dFC = c1042770dF5.LJI;
            if (c1042840dFC != null) {
                nVar2.LJJIII(Integer.valueOf(c1042840dFC.LIZ), "preConnect_count");
                nVar2.LJJIII(Integer.valueOf(c1042840dFC.LIZIZ), "preConnect_hit");
                nVar2.LJJIII(Integer.valueOf(c1042840dFC.LIZJ), "preConnect_miss");
            }
            C1042760dF4 c1042760dF4 = c1042770dF5.LJII;
            if (c1042760dF4 != null) {
                nVar2.LJJIII(Integer.valueOf(c1042760dF4.LIZ), "prefetch_count");
                nVar2.LJJIII(Integer.valueOf(c1042760dF4.LIZIZ), "prefetch_hit");
            }
            hVar.LJJIFFI(nVar2);
        }
        nVar.LJJIFFI("report_list", hVar);
        C1490740otc.LIZIZ(C1490740otc.LIZ, "start fetch ssp landing page response. https://scc.tiktokv.com/ssp_sdk/landingpage_report", null, "SspLifeCycle_", 2);
        defaultNetAdapter.LIZIZ(EnumC1042800dF8.POST, "https://scc.tiktokv.com/ssp_sdk/landingpage_report", "", defaultNetAdapter.LIZ, map, nVar, null, null, false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SSPBase@88ad.sendLandingPageRequest$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SSPBase@88ad.sendLandingPageRequest$1");
    }
}
