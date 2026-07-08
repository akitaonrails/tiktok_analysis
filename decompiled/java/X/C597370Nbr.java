package X;

import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.UserSearchContentUpdateEngine$11", f = "UserSearchContentUpdateEngine.kt", l = {145}, m = "invokeSuspend")
public final class C597370Nbr extends C09AX implements Function2<C597380Nbs, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C907530Zix LLILLL;
    public final /* synthetic */ InterfaceC907650Zj9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597370Nbr(C907530Zix c907530Zix, InterfaceC907650Zj9 interfaceC907650Zj9, InterfaceC1364105Vn<? super C597370Nbr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c907530Zix;
        this.LLILZ = interfaceC907650Zj9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C597370Nbr c597370Nbr = new C597370Nbr(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c597370Nbr.LLILLJJLI = obj;
        return c597370Nbr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserSearchContentUpdateEngine@f047.<init>$11");
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
            C597380Nbs c597380Nbs = (C597380Nbs) this.LLILLJJLI;
            C1231704rr c1231704rr = this.LLILLL.LIZ;
            c597380Nbs.toString();
            c1231704rr.LIZIZ();
            int iOrdinal = c597380Nbs.LIZ.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    C2286608xc.LJ(this.LLILZ.LJ(Collections.singletonList(new C907840ZjS(0, c597380Nbs.LIZIZ, 2, "", 0L, null, null, 480))));
                } else {
                    throw new C1954807lC();
                }
            } else {
                this.LLILLL.LIZ.LIZIZ();
                C907530Zix c907530Zix = this.LLILLL;
                this.LL = 1;
                if (c907530Zix.LIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("UserSearchContentUpdateEngine@f047.<init>$11");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserSearchContentUpdateEngine@f047.<init>$11");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C597380Nbs c597380Nbs, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c597380Nbs, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
