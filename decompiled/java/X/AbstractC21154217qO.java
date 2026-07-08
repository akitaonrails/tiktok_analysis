package X;

import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.nativeprefetch.INativePrefetchPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS148S0110000_32;
import kotlin.jvm.internal.AwS161S0110000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17qO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21154217qO implements InterfaceC21154317qP {
    public final C1771760wCs LL;
    public final C21157017qq LLILLJJLI;
    public final C21155617qc LLILLL;
    public volatile boolean LLILZ;
    public volatile boolean LLILZIL;
    public volatile boolean LLILZLL;
    public final String LLIZ = UUID.randomUUID().toString();

    public abstract void LJIIIZ(FrameLayout frameLayout);

    public abstract void LJIIJJI(FrameLayout frameLayout, FrameLayout frameLayout2, AwS161S0110000_32 awS161S0110000_32, AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322, AwS148S0110000_32 awS148S0110000_32);

    public abstract void LJIIL();

    @Override // X.InterfaceC21154317qP
    public final C21155617qc LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC21154317qP
    public final String LJII() {
        return this.LLIZ;
    }

    public AbstractC21154217qO(C1771760wCs c1771760wCs, C21157017qq c21157017qq, C21155617qc c21155617qc) {
        this.LL = c1771760wCs;
        this.LLILLJJLI = c21157017qq;
        this.LLILLL = c21155617qc;
    }

    @Override // X.InterfaceC21154317qP
    public final void LJFF(FrameLayout frameLayout, FrameLayout frameLayout2, boolean z) {
        boolean z2;
        new AwS576S0100000_32(this, 8);
        C1741560vQA c1741560vQA = this.LLILLL.LJIIIZ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("page_visible", Boolean.valueOf(this.LL.LIZLLL.K4()));
        pairArr[1] = new Pair("is_pending", Boolean.valueOf(z));
        INativePrefetchPopupService iNativePrefetchPopupService = (INativePrefetchPopupService) PluggableExtentionKt.pluggableSpi$default(INativePrefetchPopupService.class, false, false, false, 14, null);
        if (iNativePrefetchPopupService != null && iNativePrefetchPopupService.LIZLLL()) {
            z2 = true;
        } else {
            z2 = false;
        }
        pairArr[2] = new Pair("is_template_prefetch", Boolean.valueOf(z2));
        C1741560vQA.LIZJ(c1741560vQA, "load_start", 0L, C2097608Jq.LJIIJ(pairArr), 2);
        if (!this.LLILZ && !this.LLILZIL) {
            this.LLILZ = true;
            if (C7879035x.LIZLLL()) {
                this.LL.LIZIZ.LJ("popup_task_executing_id", this.LLIZ, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                C0NOE.LIZIZ(this.LL.LIZ, "ec_mix_mall_popup_task_executed", C2097608Jq.LJIIJ(new Pair("task_id", this.LLIZ)), false);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } else {
                try {
                    this.LL.LIZIZ.LJ("popup_task_executing_id", this.LLIZ, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                    C0NOE.LIZIZ(this.LL.LIZ, "ec_mix_mall_popup_task_executed", C2097608Jq.LJIIJ(new Pair("task_id", this.LLIZ)), false);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            LJIIJJI(frameLayout, frameLayout2, new AwS161S0110000_32(this, z, 0), new AwS576S0100000_32(this, 9), new AwS576S0100000_32(this, 10), new AwS148S0110000_32(this, z, 0));
            return;
        }
        LJIILIIL(null, "load_fail", "repeat invoke", null, false);
    }

    @Override // X.InterfaceC21154317qP
    public final void LIZLLL(boolean z, FrameLayout frameLayout, boolean z2, Pair<Integer, String> pair, InterfaceC21154417qQ interfaceC21154417qQ) {
        C1741560vQA c1741560vQALIZIZ;
        Integer first;
        String second;
        new AwS576S0100000_32(this, 7);
        if (interfaceC21154417qQ != null) {
            c1741560vQALIZIZ = interfaceC21154417qQ.LIZIZ(this.LLIZ, this.LLILLL, C2097608Jq.LJIIJ(new Pair("not_release", Integer.valueOf(z2 ? 1 : 0))));
        } else {
            c1741560vQALIZIZ = null;
        }
        if (this.LLILZIL) {
            if (!z2) {
                LJIIL();
            }
            if (!z && c1741560vQALIZIZ != null) {
                interfaceC21154417qQ.LIZ(c1741560vQALIZIZ, false, "has dismissed");
                return;
            }
            return;
        }
        this.LLILZIL = true;
        if (!this.LLILZLL) {
            if (pair != null) {
                first = pair.getFirst();
                second = pair.getSecond();
            } else {
                first = null;
                second = null;
            }
            LJIILIIL(first, "dismiss_unfinish", second, null, false);
        }
        LJIIIZ(frameLayout);
        if (!z2) {
            LJIIL();
        }
        if (C7879035x.LIZLLL()) {
            this.LL.LIZIZ.LJ("popup_task_executing_id", "", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            if (pair != null) {
                C0NOE.LIZIZ(this.LL.LIZ, "ec_mix_mall_popup_task_dismissed", C2097608Jq.LJIIJ(new Pair("task_id", this.LLIZ), new Pair("reason_code", pair.getFirst()), new Pair("reason_msg", pair.getSecond())), false);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } else {
            try {
                this.LL.LIZIZ.LJ("popup_task_executing_id", "", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                if (pair != null) {
                    C0NOE.LIZIZ(this.LL.LIZ, "ec_mix_mall_popup_task_dismissed", C2097608Jq.LJIIJ(new Pair("task_id", this.LLIZ), new Pair("reason_code", pair.getFirst()), new Pair("reason_msg", pair.getSecond())), false);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (c1741560vQALIZIZ != null) {
            interfaceC21154417qQ.LIZ(c1741560vQALIZIZ, true, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIILIIL(Integer num, String str, String str2, Map map, boolean z) {
        JSONObject jSONObject;
        Map linkedHashMap = map;
        this.LLILZLL = true;
        C21155617qc c21155617qc = this.LLILLL;
        C1741560vQA c1741560vQA = c21155617qc.LJIIIZ;
        if (z) {
            jSONObject = null;
        } else {
            jSONObject = c21155617qc.LJIIIIZZ;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("page_visible", Boolean.valueOf(this.LL.LIZLLL.K4()));
        c1741560vQA.LIZ(str, z, num, str2, jSONObject, linkedHashMap);
    }
}
