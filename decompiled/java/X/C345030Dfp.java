package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.storage.clean.RecordStorageOptLimitInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS0S0100500_4;
import kxk.d;
import njp.a;

/* JADX INFO: renamed from: X.0Dfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$1$1", f = "RecordConditionCheck.kt", l = {}, m = "invokeSuspend")
public final class C345030Dfp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreativeLoadingDialog LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Activity LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345030Dfp(CreativeLoadingDialog creativeLoadingDialog, long j, Function0<Unit> function0, long j2, long j3, long j4, Activity activity, InterfaceC1364105Vn<? super C345030Dfp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = creativeLoadingDialog;
        this.LLILLJJLI = j;
        this.LLILLL = function0;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = j4;
        this.LLIZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345030Dfp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLJIILL;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isShowing()) {
            return Unit.LIZ;
        }
        this.LL.dismiss();
        try {
            jLJIILL = C2354709Kn.LJIILL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jLJIILL = 0;
        }
        if (jLJIILL >= this.LLILLJJLI) {
            this.LLILLL.invoke();
            C344950Dfh.LIZJ(EnumC344990Dfl.CLEAN_STORAGE_WITH_LOADING, jLJIILL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, true, false, false, 768);
            C344950Dfh.LIZ = false;
        } else {
            Activity activity = this.LLIZ;
            long j = this.LLILZIL;
            long j2 = this.LLILZLL;
            d.LIZ.getClass();
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            RecordStorageOptLimitInfo recordStorageOptLimitInfo = d.LIZIZ;
            RecordStorageOptLimitInfo recordStorageOptLimitInfo2 = (RecordStorageOptLimitInfo) c0c64LJIILLIIL.LJJII(RecordStorageOptLimitInfo.class, recordStorageOptLimitInfo, "creative_tool_open_storage_opt_limit", true);
            if (recordStorageOptLimitInfo2 == null) {
                recordStorageOptLimitInfo2 = recordStorageOptLimitInfo;
            }
            long j3 = 1024;
            long j4 = ((long) recordStorageOptLimitInfo2.storageLowerLimit) * j3 * j3;
            RecordStorageOptLimitInfo recordStorageOptLimitInfo3 = (RecordStorageOptLimitInfo) C0C64.LJIILLIIL().LJJII(RecordStorageOptLimitInfo.class, recordStorageOptLimitInfo, "creative_tool_open_storage_opt_limit", true);
            if (recordStorageOptLimitInfo3 != null) {
                recordStorageOptLimitInfo = recordStorageOptLimitInfo3;
            }
            long j5 = j3 * ((long) recordStorageOptLimitInfo.storageAutoCleanLimit) * j3;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_open_storage_opt", true) == 2) {
                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                c1397580mTM.LJFF(2131826591);
                c1397580mTM.LIZ(2131826590);
                C985403tE.LIZ(c1397580mTM, new AwS0S0100500_4(activity, jLJIILL, j4, j5, j, j2, 1));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            } else {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131830703);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activity, 3073, creativeToastBuilder);
                C344950Dfh.LIZ = false;
                C344950Dfh.LIZJ(EnumC344990Dfl.CLEAN_STORAGE_WITH_LOADING, jLJIILL, j4, j5, j, j2, false, false, false, 768);
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
