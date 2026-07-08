package X;

import android.content.Context;
import com.ss.android.ugc.aweme.launcershortcut.LauncherShortcutService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Yk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.launcershortcut.LauncherShortcutService$openPermissionSettingPage$1", f = "LauncherShortcutService.kt", l = {203}, m = "invokeSuspend")
public final class C1371605Yk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AnonymousClass0956 LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ LauncherShortcutService LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371605Yk(Function0<Unit> function0, LauncherShortcutService launcherShortcutService, Context context, InterfaceC1364105Vn<? super C1371605Yk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = function0;
        this.LLILZIL = launcherShortcutService;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1371605Yk c1371605Yk = new C1371605Yk(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1371605Yk.LLILLL = obj;
        return c1371605Yk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C013C c013c;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        C1C7U.LIZ("LauncherShortcutService@f16f.openPermissionSettingPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                anonymousClass0956LIZLLL = this.LL;
                c013c = (C013C) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            c013c = new C013C();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, abstractC2238408pq, null, new C1371705Yl(this.LLILZIL, c013c, this.LLILZ, null), 2);
            C23250099c.LIZLLL(interfaceC497601wk, abstractC2238408pq, null, new C2429509fZ(this.LLILZIL, this.LLILZLL, null), 2);
            this.LLILLL = c013c;
            this.LL = anonymousClass0956LIZLLL;
            this.LLILLJJLI = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("LauncherShortcutService@f16f.openPermissionSettingPage$1");
                return objLJFF;
            }
        }
        if (!c013c.element) {
            anonymousClass0956LIZLLL.LIZIZ(null);
            Function0<Unit> function0 = this.LLILZ;
            if (function0 != null) {
                function0.invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LauncherShortcutService@f16f.openPermissionSettingPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
