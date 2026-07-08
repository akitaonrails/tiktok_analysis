package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$tryUpdateStorageNotice$1", f = "DraftBoxFragment.kt", l = {833, 871, 883, 897}, m = "invokeSuspend")
public final class C0M1Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ DraftBoxFragment LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M1Y(DraftBoxFragment draftBoxFragment, Context context, InterfaceC1364105Vn<? super C0M1Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = draftBoxFragment;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0M1Y c0m1y = new C0M1Y(this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0m1y.LLILZLL = obj;
        return c0m1y;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M1Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
