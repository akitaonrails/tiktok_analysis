package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1D4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249861D4e {
    public final Function0<IEventCenter> LIZ;
    public final EventBus LIZIZ;
    public final Function2<String, JSONObject, Unit> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public IEventCenter LJII;
    public final C2249841D4c LJIIIIZZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1D4c] */
    public C2249861D4e(int i) {
        AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(309);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        AnonymousClass0208 anonymousClass0208 = AnonymousClass0208.get$arr$(34);
        this.LIZ = aFwS185S0000000_1;
        this.LIZIZ = eventBusLIZLLL;
        this.LIZJ = anonymousClass0208;
        this.LJIIIIZZ = new InterfaceC1164530gPT() { // from class: X.1D4c
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
            @Override // X.InterfaceC1164530gPT
            public final void onEvent(String str, String str2) throws JSONException {
                Object obj;
                if (Intrinsics.LJFF(str, "ec_page_quit")) {
                    C2249861D4e c2249861D4e = this.LL;
                    c2249861D4e.getClass();
                    C2249561D3a c2249561D3a = C2249561D3a.LIZ;
                    boolean z = c2249861D4e.LJI;
                    c2249561D3a.getClass();
                    if (C2249561D3a.LIZIZ(z)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            boolean zLJFF = Intrinsics.LJFF(jSONObject.optString("page_name"), "product_detail");
                            JSONObject jSONObject2 = jSONObject;
                            if (!zLJFF) {
                                jSONObject2 = null;
                            }
                            C189200o6.m2constructorimpl(jSONObject2);
                            obj = jSONObject2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C098200Yq c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                            obj = c098200Yq;
                        }
                        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                        Object obj2 = obj;
                        if (zM7isFailureimpl) {
                            obj2 = null;
                        }
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        if (jSONObject3 != null) {
                            C2249561D3a c2249561D3a2 = C2249561D3a.LIZ;
                            boolean z2 = c2249861D4e.LJ;
                            c2249561D3a2.getClass();
                            jSONObject3.put("has_submitted_order", z2 ? 1 : 0);
                            if (C2249561D3a.LIZJ(null, jSONObject3, c2249861D4e.LJI)) {
                                c2249861D4e.LIZJ.invoke("tiktokec_sv_back_to_video", jSONObject3);
                            }
                        }
                    }
                }
            }
        };
    }

    @C14EU(sticky = false, threadMode = ThreadMode.MAIN)
    public final void onAnchorPanelAction(C1769480w9C c1769480w9C) {
        boolean z;
        C2249561D3a c2249561D3a = C2249561D3a.LIZ;
        boolean z2 = this.LJI;
        c2249561D3a.getClass();
        if (!C2249561D3a.LIZIZ(z2)) {
            return;
        }
        if (c1769480w9C.LIZIZ == EnumC1769010w8R.SHOW) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
    }

    @C14EU(sticky = false, threadMode = ThreadMode.MAIN)
    public final void onEcOrderSubmitEvent(C1769630w9R c1769630w9R) {
        C2249561D3a c2249561D3a = C2249561D3a.LIZ;
        boolean z = this.LJI;
        c2249561D3a.getClass();
        if (C2249561D3a.LIZIZ(z) && this.LIZLLL) {
            this.LJ = true;
        }
    }
}
