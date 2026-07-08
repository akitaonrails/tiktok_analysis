package X;

import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.fans.GroupInviteItem;

/* JADX INFO: renamed from: X.0i4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupViewModel$onShowClick$2", f = "FanGroupChooseGroupViewModel.kt", l = {189}, m = "invokeSuspend")
public final class C1228390i4T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ GroupInviteItem LLILLL;
    public final /* synthetic */ FanGroupChooseGroupViewModel LLILZ;
    public final /* synthetic */ C1228410i4V LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228390i4T(long j, GroupInviteItem groupInviteItem, FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel, C1228410i4V c1228410i4V, InterfaceC1364105Vn<? super C1228390i4T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = groupInviteItem;
        this.LLILZ = fanGroupChooseGroupViewModel;
        this.LLILZIL = c1228410i4V;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1228390i4T(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object value;
        C1219950hqr c1219950hqr;
        C1C7U.LIZ("FanGroupChooseGroupViewModel@c0f6.onShowClick$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                c098200Yq = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
            if (iMGroupChatApiLIZ != null) {
                long j = this.LLILLJJLI;
                this.LL = 1;
                c098200Yq = iMGroupChatApiLIZ.LJIIL(j, this, true);
                if (c098200Yq == objLJFF) {
                    C1C7U.LIZIZ("FanGroupChooseGroupViewModel@c0f6.onShowClick$2");
                    return objLJFF;
                }
            } else {
                c098200Yq = new C098200Yq(new IllegalStateException("IMGroupChatApi not ready"));
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        long j2 = this.LLILLJJLI;
        GroupInviteItem groupInviteItem = this.LLILLL;
        FanGroupChooseGroupViewModel fanGroupChooseGroupViewModel = this.LLILZ;
        C1228410i4V c1228410i4V = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateGroupShowStatus failed convId=");
            sbLIZ.append(j2);
            sbLIZ.append(" err=");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            groupInviteItem.isHidden = true;
            C2252321DDq c2252321DDq = fanGroupChooseGroupViewModel.LL;
            do {
                value = c2252321DDq.getValue();
                c1219950hqr = (C1219950hqr) value;
            } while (!c2252321DDq.compareAndSet(value, C1219950hqr.LIZ(c1219950hqr, false, false, false, null, FanGroupChooseGroupViewModel.vQ2(c1228410i4V.LIZ, c1219950hqr.LIZLLL, c1219950hqr.LJFF), null, 47)));
            fanGroupChooseGroupViewModel.LLILLL.LIZJ(c1228410i4V.LIZ.getString(2131835079));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FanGroupChooseGroupViewModel@c0f6.onShowClick$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
