package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.data.MediaProvider$warmUpResources$1", f = "MediaProvider.kt", l = {207, 208}, m = "invokeSuspend")
public final class C1418405gs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0L20 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C540820LIy LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418405gs(C540820LIy c540820LIy, InterfaceC1364105Vn<? super C1418405gs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c540820LIy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1418405gs(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0L20 c0l20;
        C1C7U.LIZ("MediaProvider@7017.warmUpResources$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MediaProvider@7017.warmUpResources$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0l20 = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0L20 c0l202 = new C0L20(false, false, true, 27);
            c0l20 = new C0L20(false, false, true, 27);
            C540820LIy c540820LIy = this.LLILLL;
            ArrayList arrayList = new ArrayList();
            this.LL = c0l20;
            this.LLILLJJLI = 1;
            if (c540820LIy.LIZJ(arrayList, 1, c0l202, false, null, this) == objLJFF) {
                C1C7U.LIZIZ("MediaProvider@7017.warmUpResources$1");
                return objLJFF;
            }
        }
        C540820LIy c540820LIy2 = this.LLILLL;
        ArrayList arrayList2 = new ArrayList();
        this.LL = null;
        this.LLILLJJLI = 2;
        if (c540820LIy2.LIZJ(arrayList2, 4, c0l20, false, null, this) == objLJFF) {
            C1C7U.LIZIZ("MediaProvider@7017.warmUpResources$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaProvider@7017.warmUpResources$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
