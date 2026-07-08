package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mediachoose.LayoutCutOptimizedChosenHandler$compile$1", f = "LayoutCutOptimizedChosenHandler.kt", l = {116, 165, 124, 125, 151, 165, 157, 165, 165}, m = "invokeSuspend")
public final class C09LW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C099G LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ List<MediaModel> LLILZLL;
    public final /* synthetic */ Intent LLIZ;
    public final /* synthetic */ C536280L1m LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09LW(List<? extends MediaModel> list, Intent intent, C536280L1m c536280L1m, boolean z, Function0<Unit> function0, InterfaceC1364105Vn<? super C09LW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = list;
        this.LLIZ = intent;
        this.LLIZLLLIL = c536280L1m;
        this.LLJ = z;
        this.LLJI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09LW c09lw = new C09LW(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c09lw.LLILZIL = obj;
        return c09lw;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0 A[ADDED_TO_REGION] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09LW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
