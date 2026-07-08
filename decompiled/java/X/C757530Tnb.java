package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS130S1100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0Tnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friends.assem.MainPageFriendsAssem$newAuthDialogCenter$1", f = "MainPageFriendsAssem.kt", l = {77}, m = "invokeSuspend")
public final class C757530Tnb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757530Tnb(Context context, String str, InterfaceC1364105Vn<? super C757530Tnb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757530Tnb c757530Tnb = new C757530Tnb(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c757530Tnb.LLILLJJLI = obj;
        return c757530Tnb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C095D c095dLIZIZ;
        C1C7U.LIZ("MainPageFriendsAssem@4a75.newAuthDialogCenter$1");
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
            InterfaceC1264610j0t interfaceC1264610j0tLIZ = C1072350e0n.LIZ(this.LLILLL, new AwS130S1100000_16(this.LLILZ, (InterfaceC497601wk) this.LLILLJJLI, 27));
            if (interfaceC1264610j0tLIZ != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZ).LIZIZ()) != null) {
                this.LL = 1;
                if (C09IC.LJI(c095dLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("MainPageFriendsAssem@4a75.newAuthDialogCenter$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainPageFriendsAssem@4a75.newAuthDialogCenter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
