package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0No4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel$updateAutoShareLiveRoomState$1", f = "BulletinSettingsChildViewModel.kt", l = {391}, m = "invokeSuspend")
public final class C604940No4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinSettingsChildViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604940No4(BulletinSettingsChildViewModel bulletinSettingsChildViewModel, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinSettingsChildViewModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604940No4(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        String str;
        C1C7U.LIZ("BulletinSettingsChildViewModel@3de0.updateAutoShareLiveRoomState$1");
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
            C0OIU c0oiu = (C0OIU) this.LLILLJJLI.LLILLJJLI.getValue().getOperator();
            boolean z = this.LLILLL;
            this.LL = 1;
            obj = c0oiu.LLLLIILL(z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.updateAutoShareLiveRoomState$1");
                return objLJFF;
            }
        }
        boolean z2 = obj instanceof C1623606Xi;
        BulletinSettingsChildViewModel bulletinSettingsChildViewModel = this.LLILLJJLI;
        if (z2) {
            boolValueOf = Boolean.valueOf(this.LLILLL);
        } else {
            boolValueOf = Boolean.valueOf(!this.LLILLL);
        }
        bulletinSettingsChildViewModel.LLILZIL = boolValueOf;
        if (z2) {
            C0OPQ c0opq = C0OPQ.LIZ;
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (this.LLILLL) {
                str = "on";
            } else {
                str = "off";
            }
            c0opq.getClass();
            C0OPQ.LJJIJIIJI(curUserId, "live_room", str);
        }
        this.LLILLJJLI.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.updateAutoShareLiveRoomState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
