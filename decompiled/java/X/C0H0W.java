package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.AIRemixInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0H0W, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.JoinRemixCTAButtonType$onShowButton$1", f = "JoinRemixCTAButtonType.kt", l = {60, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C0H0W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0H0X LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H0W(C0H0X c0h0x, InterfaceC1364105Vn<? super C0H0W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0h0x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H0W(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("JoinRemixCTAButtonType@f8ae.onShowButton$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        String taskId = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    taskId = (String) this.LL;
                    C155000ia.LIZIZ(obj);
                    iIntValue = ((Number) obj).intValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("auth result check permission: ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(", taskID: ");
                    sbLIZ.append(taskId);
                    sbLIZ.append(", remixItemId: ");
                    sbLIZ.append(this.LLILLL.LIZJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    Integer numLJ = C2286608xc.LJ(iIntValue);
                    C1C7U.LIZIZ("JoinRemixCTAButtonType@f8ae.onShowButton$1");
                    return numLJ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMAIRemixBridgeApi.LIZ.getClass();
            IMAIRemixBridgeApi iMAIRemixBridgeApiLIZ = C0H0Z.LIZ();
            if (iMAIRemixBridgeApiLIZ != null) {
                String str = this.LLILLL.LIZJ;
                this.LLILLJJLI = 1;
                obj = iMAIRemixBridgeApiLIZ.LJFF(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("JoinRemixCTAButtonType@f8ae.onShowButton$1");
                    return objLJFF;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("auth failed awemeInfo is null, remixItemId: ");
            sbLIZ2.append(this.LLILLL.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            Integer numLJ2 = C2286608xc.LJ(1);
            C1C7U.LIZIZ("JoinRemixCTAButtonType@f8ae.onShowButton$1");
            return numLJ2;
        }
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            this.LLILLL.LJFF = aweme;
            AIRemixInfo aIRemixInfo = aweme.aiRemixInfo;
            iIntValue = 0;
            if (aIRemixInfo != null && Intrinsics.LJFF(aIRemixInfo.getHasEntrance(), false)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("auth failed remix item has no entrance, remixItemId: ");
                sbLIZ3.append(this.LLILLL.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ3);
                Integer numLJ3 = C2286608xc.LJ(2);
                C1C7U.LIZIZ("JoinRemixCTAButtonType@f8ae.onShowButton$1");
                return numLJ3;
            }
            AIRemixInfo aIRemixInfo2 = aweme.aiRemixInfo;
            if (aIRemixInfo2 != null) {
                taskId = aIRemixInfo2.getTaskId();
            }
            IMAIRemixBridgeApi.LIZ.getClass();
            IMAIRemixBridgeApi iMAIRemixBridgeApiLIZ2 = C0H0Z.LIZ();
            if (iMAIRemixBridgeApiLIZ2 != null) {
                this.LL = taskId;
                this.LLILLJJLI = 2;
                obj = iMAIRemixBridgeApiLIZ2.LIZJ(taskId, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("JoinRemixCTAButtonType@f8ae.onShowButton$1");
                    return objLJFF;
                }
                iIntValue = ((Number) obj).intValue();
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("auth result check permission: ");
            sbLIZ4.append(iIntValue);
            sbLIZ4.append(", taskID: ");
            sbLIZ4.append(taskId);
            sbLIZ4.append(", remixItemId: ");
            sbLIZ4.append(this.LLILLL.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ4);
            Integer numLJ4 = C2286608xc.LJ(iIntValue);
            C1C7U.LIZIZ("JoinRemixCTAButtonType@f8ae.onShowButton$1");
            return numLJ4;
        }
        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
        sbLIZ22.append("auth failed awemeInfo is null, remixItemId: ");
        sbLIZ22.append(this.LLILLL.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ22);
        Integer numLJ22 = C2286608xc.LJ(1);
        C1C7U.LIZIZ("JoinRemixCTAButtonType@f8ae.onShowButton$1");
        return numLJ22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
