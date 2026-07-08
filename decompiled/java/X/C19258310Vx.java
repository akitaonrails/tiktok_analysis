package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeFromStoreServiceGoogleImpl;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.network.AgeGateResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10Vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.agegate.PNSAgeFromStoreServiceGoogleImpl$fetchAgeRangeFromStore$1", f = "PNSAgeFromStoreServiceGoogleImpl.kt", l = {184}, m = "invokeSuspend")
public final class C19258310Vx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PNSAgeFromStoreServiceGoogleImpl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C10UK LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19258310Vx(PNSAgeFromStoreServiceGoogleImpl pNSAgeFromStoreServiceGoogleImpl, Context context, int i, C10UK c10uk, InterfaceC1364105Vn<? super C19258310Vx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pNSAgeFromStoreServiceGoogleImpl;
        this.LLILLL = context;
        this.LLILZ = i;
        this.LLILZIL = c10uk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19258310Vx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C15O7<AgeGateResponse> c15o7LIZ;
        Object objLJ = obj;
        C1C7U.LIZ("PNSAgeFromStoreServiceGoogleImpl@411d.fetchAgeRangeFromStore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        final int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJ);
            PNSAgeFromStoreServiceGoogleImpl pNSAgeFromStoreServiceGoogleImpl = this.LLILLJJLI;
            Context context = this.LLILLL;
            this.LL = 1;
            objLJ = pNSAgeFromStoreServiceGoogleImpl.LJ(context, this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("PNSAgeFromStoreServiceGoogleImpl@411d.fetchAgeRangeFromStore$1");
                return objLJFF;
            }
        }
        C19258510Vz c19258510Vz = (C19258510Vz) objLJ;
        if (c19258510Vz != null) {
            C19257210Vm c19257210Vm = C19257210Vm.LIZ;
            int i3 = this.LLILZ;
            Integer num = c19258510Vz.LIZ;
            Integer num2 = c19258510Vz.LIZIZ;
            final C19258510Vz c19258510Vz2 = new C19258510Vz(num, num2, null);
            final C10UK c10uk = this.LLILZIL;
            c19257210Vm.getClass();
            C01GW c01gw = C19257210Vm.LIZJ;
            c01gw.getValue();
            C10WC c10wc = (C10WC) c01gw.getValue();
            if (c10wc != null && (c15o7LIZ = c10wc.LIZ("", 1, i3, false, 0, null, null, num, num2)) != null) {
                c15o7LIZ.LIZLLL(new InterfaceC2385309Wh() { // from class: X.10WO
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0167  */
                    @Override // X.InterfaceC2385309Wh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object then(X.C15O7 r19) {
                        /*
                            Method dump skipped, instruction units count: 362
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C10WO.then(X.15O7):java.lang.Object");
                    }
                });
            }
        } else {
            C10UK c10uk2 = this.LLILZIL;
            if (c10uk2 != null) {
                Boolean.valueOf(c10uk2.onError(new PNSErrorModel(null, null, null, null)));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSAgeFromStoreServiceGoogleImpl@411d.fetchAgeRangeFromStore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
