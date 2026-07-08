package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.utils.PassportHelper$showToast$2", f = "PassportHelper.kt", l = {130}, m = "invokeSuspend")
public final class C1744630vV7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ ToastContent LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744630vV7(ToastContent toastContent, long j, Context context, InterfaceC1364105Vn<? super C1744630vV7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = toastContent;
        this.LLILZ = j;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1744630vV7(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PassportHelper@b0c0.showToast$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ToastContent toastContent = this.LLILLL;
            long j = this.LLILZ;
            Context context = this.LLILZIL;
            this.LL = context;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            try {
                C1750960vfK.LIZLLL = c2252611DEt;
                C446610HfH c446610HfH = new C446610HfH(toastContent.message, toastContent.iconRes, j);
                c446610HfH.LJJIIJZLJL(context);
                Integer num = toastContent.iconWidth;
                Integer num2 = toastContent.iconHeight;
                if (num2 != null && num != null) {
                    c446610HfH.LJJIIZ(num.intValue(), num2.intValue());
                }
                c446610HfH.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0vV8
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        C1750960vfK.LIZ();
                    }
                });
                c446610HfH.show();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1750960vfK.LIZ();
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PassportHelper@b0c0.showToast$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PassportHelper@b0c0.showToast$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
