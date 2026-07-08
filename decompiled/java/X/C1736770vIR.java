package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.UpdateMobileEffectRequestV3;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectServiceUtilKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$updateEffectNameImageV3$2", f = "MobileEffectUtil.kt", l = {1417}, m = "invokeSuspend")
public final class C1736770vIR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1736670vIH>, Object> {
    public int LL;
    public final /* synthetic */ EditImage LLILLJJLI;
    public final /* synthetic */ EditImage LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736770vIR(int i, EditImage editImage, EditImage editImage2, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editImage;
        this.LLILLL = editImage2;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1736770vIR(this.LLILZIL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1156270gC9;
        C0X52<MobileEffectResponse> c0x52Execute;
        C1C7U.LIZ("MobileEffectUtilKt@ccb6.updateEffectNameImageV3$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Uri uri = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            EditImage editImage = this.LLILLJJLI;
            EditImage editImage2 = this.LLILLL;
            this.LL = 1;
            obj = C2296808zG.LJ(new C2272108vH(editImage, editImage2, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.updateEffectNameImageV3$2");
                return objLJFF;
            }
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            C1156260gC8 c1156260gC8 = new C1156260gC8(new Throwable("fail to upload image"));
            C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.updateEffectNameImageV3$2");
            return c1156260gC8;
        }
        try {
            String str = this.LLILZ;
            C0X9S<MobileEffectResponse> c0x9sUpdateMobileEffectV3 = TTEPEffectServiceUtilKt.updateMobileEffectV3(str, this.LLILZIL, new UpdateMobileEffectRequestV3(C2095008Iq.LJIILIIL(str), this.LLILZLL, list, C2286608xc.LJ(this.LLILZIL)));
            if (c0x9sUpdateMobileEffectV3 != null) {
                c0x52Execute = c0x9sUpdateMobileEffectV3.execute();
            } else {
                c0x52Execute = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fail to upload effect with exception: ");
            sbLIZ.append(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
            c1156270gC9 = new C1156270gC9(e);
        }
        if (c0x52Execute == null) {
            C1736710vIL c1736710vIL = C1736710vIL.LIZ;
            C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.updateEffectNameImageV3$2");
            return c1736710vIL;
        }
        int i2 = c0x52Execute.LIZ.LIZIZ;
        MobileEffectResponse mobileEffectResponse = c0x52Execute.LIZIZ;
        mobileEffectResponse.LIZ = i2;
        MobileEffectResponse mobileEffectResponse2 = mobileEffectResponse;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateEffectNameImage, result ");
        sbLIZ2.append(mobileEffectResponse2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
        if (mobileEffectResponse2.statusCode == 0) {
            String str2 = this.LLILZLL;
            EditImage editImage3 = this.LLILLJJLI;
            if (editImage3 != null) {
                uri = editImage3.url;
            }
            c1156270gC9 = new C1736590vI9(uri, str2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fail to upload effect: ");
            sbLIZ3.append(mobileEffectResponse2.statusCode);
            sbLIZ3.append(", ");
            sbLIZ3.append(mobileEffectResponse2.errorCode);
            sbLIZ3.append(", ");
            sbLIZ3.append(mobileEffectResponse2.message);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ3));
            int i3 = mobileEffectResponse2.errorCode;
            if (i3 != 1406) {
                if (i3 != 1407) {
                    c1156270gC9 = C1736710vIL.LIZ;
                } else {
                    c1156270gC9 = C1736730vIN.LIZ;
                }
            } else {
                c1156270gC9 = C1736740vIO.LIZ;
            }
        }
        C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.updateEffectNameImageV3$2");
        return c1156270gC9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1736670vIH> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
