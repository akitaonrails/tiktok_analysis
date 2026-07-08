package X;

import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01fI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.DialogUtilsKt$showConfirmationDialog$2", f = "DialogUtils.kt", l = {60}, m = "invokeSuspend")
public final class C389401fI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC510301yn>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389401fI(Context context, int i, int i2, int i3, int i4, InterfaceC1364105Vn<? super C389401fI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = i4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C389401fI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC510301yn> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DialogUtilsKt@f142.showConfirmationDialog$2");
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
            Context context = this.LLILLL;
            int i2 = this.LLILZ;
            int i3 = this.LLILZIL;
            int i4 = this.LLILZLL;
            int i5 = this.LLIZ;
            this.LL = context;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C392901fr.LIZ("showConfirmationDialog");
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJIIZILJ(i2);
            c782110Um9.LJII(i3);
            c782110Um9.LJIILIIL(i4, new C515201za(c2252611DEt, 14));
            c782110Um9.LJIIJ(i5, new C515201za(c2252611DEt, 15));
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILLIIL = false;
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            c2252611DEt.LJJII(new C5183020f(liveDialogLIZ, 359));
            C786410Ut5.E4(liveDialogLIZ);
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DialogUtilsKt@f142.showConfirmationDialog$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DialogUtilsKt@f142.showConfirmationDialog$2");
        return obj;
    }
}
