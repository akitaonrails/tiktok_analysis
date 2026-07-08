package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KW1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.container.dynamicbutton.DynamicSuggestEditAction$onClick$1", f = "DynamicSuggestEditAction.kt", l = {122}, m = "invokeSuspend")
public final class C0KW1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0KW2 LL;
    public int LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ C1195910hE5 LLILZ;
    public final /* synthetic */ Function2<Double, Double, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0KW1(Activity activity, C1195910hE5 c1195910hE5, Function2<? super Double, ? super Double, Unit> function2, InterfaceC1364105Vn<? super C0KW1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = activity;
        this.LLILZ = c1195910hE5;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KW1(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0KW2, android.app.Dialog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.0KW2, android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.0KW2] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0WST] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r3;
        Object obj2;
        ?? r13;
        Object first;
        Object objLIZJ = obj;
        C1C7U.LIZ("DynamicSuggestEditAction@33b3.onClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        Object second = null;
        if (i != 0) {
            if (i == 1) {
                C0KW2 c0kw2 = this.LL;
                C155000ia.LIZIZ(objLIZJ);
                r13 = c0kw2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            final Activity activity = this.LLILLL;
            ?? r132 = new DialogC19728412Gs(activity) { // from class: X.0KW2
                public C1390410mHn LL;

                @Override // X.DialogC19728412Gs, android.app.Dialog
                public final void show() {
                    Activity ownerActivity;
                    Object obj3;
                    if (isShowing() || (ownerActivity = getOwnerActivity()) == null || ownerActivity.isFinishing()) {
                        return;
                    }
                    C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHK2SaUTpnD2k9iUtTvZ2PoxyO+JTRfg5hEGPPrPJCIvCBfnfdaz3XwP93WEA==", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = new Object[0];
                    C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
                    } else {
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj3 = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj3;
                        super.show();
                        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
                    }
                    C1390410mHn c1390410mHn = this.LL;
                    if (c1390410mHn == null) {
                        c1390410mHn = null;
                    }
                    C786410Ut5.LLLZZIL(c1390410mHn, 0);
                    C1390410mHn c1390410mHn2 = this.LL;
                    (c1390410mHn2 != null ? c1390410mHn2 : null).LIZJ();
                }

                @Override // android.app.Dialog, android.content.DialogInterface
                public final void dismiss() {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity == null || ownerActivity.isFinishing()) {
                        return;
                    }
                    try {
                        super.dismiss();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1390410mHn c1390410mHn = this.LL;
                    if (c1390410mHn == null) {
                        c1390410mHn = null;
                    }
                    c1390410mHn.LIZLLL();
                    C1390410mHn c1390410mHn2 = this.LL;
                    C786410Ut5.LLLZZIL(c1390410mHn2 != null ? c1390410mHn2 : null, 8);
                }

                {
                    super(activity, R.style.ach);
                    setOwnerActivity(activity);
                }

                @Override // android.app.Dialog
                public final void onCreate(Bundle bundle) {
                    super.onCreate(bundle);
                    setContentView(R.layout.e16);
                    this.LL = (C1390410mHn) findViewById(R.id.gb7);
                }
            };
            C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHK2SaUTpnD2k9iUtTvZ2PoxyO+JTRfg5hEGPPrPJCItDZQmOW1i9mvBr9+Js5RqCFz0ztp1QGN", null);
            ?? c0wst = new C0WST();
            Object[] objArr = new Object[0];
            C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/poi/detail/container/dynamicbutton/LoadingDialog", "show", r132, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(300000, "com/ss/android/ugc/aweme/poi/detail/container/dynamicbutton/LoadingDialog", "show", null, objArr, r132, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null && (obj2 = objArr2[0]) != null) {
                    r3 = (C0KW2) obj2;
                } else {
                    r3 = r132;
                }
                r3.show();
                c0wst.LIZ(300000, "com/ss/android/ugc/aweme/poi/detail/container/dynamicbutton/LoadingDialog", "show", null, objArr, r3, c0wzw, true);
            }
            C785410UrT.LIZIZ(r132);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(r132);
            C816490W1f.LIZ(r132);
            C0KW8 c0kw8 = new C0KW8(this.LLILZ, null);
            this.LL = r132;
            this.LLILLJJLI = 1;
            objLIZJ = C099A.LIZJ(3000L, c0kw8, this);
            r13 = r132;
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("DynamicSuggestEditAction@33b3.onClick$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLIZJ;
        Function2<Double, Double, Unit> function2 = this.LLILZIL;
        if (pair != null) {
            first = pair.getFirst();
            second = pair.getSecond();
        } else {
            first = null;
        }
        function2.invoke((Double) first, (Double) second);
        r13.dismiss();
        C785410UrT.LIZ(r13);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicSuggestEditAction@33b3.onClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
