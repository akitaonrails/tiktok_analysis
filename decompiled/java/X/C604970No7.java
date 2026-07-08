package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingValue;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0No7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel$updateEnableComment$1", f = "BulletinSettingsChildViewModel.kt", l = {445}, m = "invokeSuspend")
public final class C604970No7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinSettingsChildViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604970No7(BulletinSettingsChildViewModel bulletinSettingsChildViewModel, boolean z, String str, InterfaceC1364105Vn<? super C604970No7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinSettingsChildViewModel;
        this.LLILLL = z;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604970No7(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("BulletinSettingsChildViewModel@3de0.updateEnableComment$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C0OIU c0oiu = (C0OIU) this.LLILLJJLI.LLILLJJLI.getValue().getOperator();
                C617180OIq c617180OIq = this.LLILLJJLI.LLILZ;
                if (c617180OIq == null || (str = c617180OIq.LIZJ) == null) {
                    str = "";
                }
                List<BulletinSetting> listSingletonList = Collections.singletonList(new BulletinSetting(C2286608xc.LJ(EnumC604980No8.BULLETIN_SETTING_TYPE_CHANNEL_COMMENT.getType()), new BulletinSettingValue(C2286608xc.LJ(1), Boolean.valueOf(this.LLILLL), null), null, new LinkedHashMap()));
                this.LL = 1;
                obj = c0oiu.LJLJL(str, listSingletonList, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.updateEnableComment$1");
                    return objLJFF;
                }
            }
            AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
            if (abstractC1623806Xk instanceof C1623606Xi) {
                this.LLILLJJLI.LLIZ = Boolean.valueOf(this.LLILLL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinSettingsChildViewModel updateEnableComment to ");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(" success, perform update ui");
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                C0OPQ c0opq = C0OPQ.LIZ;
                C617180OIq c617180OIq2 = this.LLILLJJLI.LLILZ;
                if (c617180OIq2 == null || (str2 = c617180OIq2.LIZJ) == null) {
                    str2 = "";
                }
                C0OPQ.LJIIIIZZ(c0opq, str2, "comment", 0, 0, this.LLILZ, 12);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BulletinSettingsChildViewModel updateEnableComment to ");
                sbLIZ2.append(this.LLILLL);
                sbLIZ2.append(" failed, result ");
                sbLIZ2.append(abstractC1623806Xk);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("BulletinSettingsChildViewModel updateEnableComment to ");
            sbLIZ3.append(this.LLILLL);
            sbLIZ3.append(" failed, exception ");
            sbLIZ3.append(e);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.LLILLJJLI.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.updateEnableComment$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
