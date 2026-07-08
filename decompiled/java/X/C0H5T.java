package X;

import android.content.Context;
import com.bytedance.tux.icon.TuxIconView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.standard.ui.ProfileStandardResourceHelperKt$byProfileStandardAttr$1", f = "ProfileStandardResourceHelper.kt", l = {136}, m = "invokeSuspend")
public final class C0H5T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ TuxIconView LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H5T(Context context, String str, String str2, String str3, String str4, Integer num, Integer num2, TuxIconView tuxIconView, Function0<Unit> function0, InterfaceC1364105Vn<? super C0H5T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = num;
        this.LLIZLLLIL = num2;
        this.LLJ = tuxIconView;
        this.LLJI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H5T(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileStandardResourceHelperKt@e35e.byProfileStandardAttr$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Map<Integer, Integer> map = C1721460utk.LIZ;
            C698190Ra5 c698190Ra5LIZJ = C1721460utk.LIZJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0H5R c0h5r = new C0H5R(c698190Ra5LIZJ, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c0h5r) == objLJFF) {
                C1C7U.LIZIZ("ProfileStandardResourceHelperKt@e35e.byProfileStandardAttr$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileStandardResourceHelperKt@e35e.byProfileStandardAttr$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
