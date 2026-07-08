package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupActionsConfig;

/* JADX INFO: renamed from: X.10kZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19334510kZ implements InterfaceC300801Eo {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<BaseResponse> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
            case 2:
                subscribe$2(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C19334510kZ c19334510kZ, InterfaceC2329309At interfaceC2329309At) {
        C612100Nzc.LIZ(C19296410eQ.LIZIZ, c19334510kZ.s0, ((PopupActionsConfig) c19334510kZ.l1).closeOthers, 4);
    }

    public static final void subscribe$1(C19334510kZ c19334510kZ, InterfaceC2329309At interfaceC2329309At) {
        C612100Nzc.LIZ(C19296410eQ.LIZIZ, c19334510kZ.s0, ((PopupActionsConfig) c19334510kZ.l1).closeOthers, 4);
    }

    public static final void subscribe$2(C19334510kZ c19334510kZ, InterfaceC2329309At interfaceC2329309At) {
        C612100Nzc.LIZ(C19296410eQ.LIZIZ, c19334510kZ.s0, ((PopupActionsConfig) c19334510kZ.l1).closeOthers, 4);
    }

    public C19334510kZ(String str, PopupActionsConfig popupActionsConfig, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = popupActionsConfig;
    }
}
