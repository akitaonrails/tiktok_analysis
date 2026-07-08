package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HSY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HSY extends C1619110sEf implements InterfaceC19330810jy {
    public final InterfaceC441310HSf LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(507));
    public final int[] LLILLL = {2452};

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        return null;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LLILLL;
    }

    public C0HSY(C441270HSb c441270HSb) {
        this.LL = c441270HSb;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        AbstractC440540HPg value;
        C05YD<AbstractC440540HPg> taskStatus;
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LLILLJJLI.getValue();
        if (mixStudioStatusRepository != null && (taskStatus = mixStudioStatusRepository.getTaskStatus()) != null) {
            value = taskStatus.getValue();
        } else {
            value = null;
        }
        if (!Intrinsics.LJFF(value, C440620HPo.LIZ) && !(value instanceof C441130HRn)) {
            return false;
        }
        return true;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        String str;
        InterfaceC441310HSf interfaceC441310HSf;
        if (innerPushMessage != null && (uiTemplate = innerPushMessage.getUiTemplate()) != null && (str = uiTemplate.globalSchemaUrl) != null && (interfaceC441310HSf = this.LL) != null) {
            interfaceC441310HSf.onClick(str);
        }
    }
}
