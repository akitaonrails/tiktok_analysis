package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.03bU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentFlowCoordinator$openExternalBackupBind$1", f = "BackupPaymentFlowCoordinator.kt", l = {659}, m = "invokeSuspend")
public final class C875403bU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ C875803bY LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ CommuteType LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875403bU(Context context, PaymentMethod paymentMethod, C875803bY c875803bY, String str, CommuteType commuteType, InterfaceC1364105Vn<? super C875403bU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = paymentMethod;
        this.LLILZ = c875803bY;
        this.LLILZIL = str;
        this.LLILZLL = commuteType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875403bU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJIIJ = obj;
        C1C7U.LIZ("BackupPaymentFlowCoordinator@88b3.openExternalBackupBind$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Boolean bool = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIJ);
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            Context context = this.LLILLJJLI;
            PaymentMethod paymentMethod = this.LLILLL;
            String str = paymentMethod.id;
            BindInfo bindInfo = paymentMethod.bindInfo;
            if (bindInfo != null) {
                bool = bindInfo.isNeedPrebindVerify;
            }
            C875803bY c875803bY = this.LLILZ;
            String str2 = c875803bY.LIZIZ;
            String str3 = c875803bY.LIZJ;
            String str4 = c875803bY.LIZLLL;
            n nVar = c875803bY.LJ;
            this.LL = 1;
            objLJIIJ = paymentBindHelper.LJIIJ(context, str, bool, str2, str3, str4, nVar, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("BackupPaymentFlowCoordinator@88b3.openExternalBackupBind$1");
                return objLJFF;
            }
        }
        if (!((Boolean) objLJIIJ).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BackupPaymentFlowCoordinator@88b3.openExternalBackupBind$1");
            return unit;
        }
        C875203bS c875203bS = C875203bS.LIZ;
        Context context2 = this.LLILLJJLI;
        Map<String, Object> map = this.LLILZ.LJFF;
        c875203bS.getClass();
        if (map != null) {
            C1323720kYE.LIZ(context2).LJIIIIZZ(C1741890vQh.LJIIIIZZ(map), "payment_track_params");
        }
        String str5 = this.LLILZIL;
        CommuteType commuteType = this.LLILZLL;
        PaymentMethod paymentMethod2 = this.LLILLL;
        Uri.Builder builderBuildUpon = UriProtector.parse(str5).buildUpon();
        builderBuildUpon.appendQueryParameter("source", "payment_method");
        if (commuteType != null) {
            builderBuildUpon.appendQueryParameter("commute_type", C899503fN.LIZ(commuteType));
        }
        String strLJ = paymentMethod2.LJ();
        if (strLJ != null && (!a0.LJJJIL(strLJ))) {
            builderBuildUpon.appendQueryParameter("idempotency_key", strLJ);
        }
        String string = builderBuildUpon.build().toString();
        PaymentBindHelper paymentBindHelper2 = PaymentBindHelper.LIZ;
        Context context3 = this.LLILLJJLI;
        PaymentMethod paymentMethod3 = this.LLILLL;
        String str6 = paymentMethod3.LJIILLIIL;
        String str7 = paymentMethod3.packageName;
        CommuteType commuteType2 = this.LLILZLL;
        C875803bY c875803bY2 = this.LLILZ;
        PaymentBindHelper.LJI(paymentBindHelper2, context3, str6, str7, string, commuteType2, c875803bY2.LIZLLL, paymentMethod3.id, c875803bY2.LJI, paymentMethod3, c875803bY2.LIZ, c875803bY2.LJII, false, c875803bY2.LJIIIIZZ, c875803bY2.LJIIIZ, paymentMethod3.displayName, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BackupPaymentFlowCoordinator@88b3.openExternalBackupBind$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
