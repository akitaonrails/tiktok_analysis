package X;

import Y.AgS197S0200000_6;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.emojibutton.DefaultEmojiBtnAbilityImpl;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarSyncLegoTask;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0IDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462990IDp implements InterfaceC346201Wa {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return collect$0(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 1:
                return collect$1(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 2:
                return collect$2(this, interfaceC346701Wf, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public C462990IDp(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object collect$0(C462990IDp c462990IDp, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC346201Wa[] interfaceC346201WaArr = (InterfaceC346201Wa[]) c462990IDp.l0;
        Object objLIZ = C23039090z.LIZ(interfaceC1364105Vn, new AwS550S0100000_6(interfaceC346201WaArr, 1234), new C0HOU(null, (List) c462990IDp.l1), interfaceC346701Wf, interfaceC346201WaArr);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C462990IDp c462990IDp, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC346201Wa[] interfaceC346201WaArr = (InterfaceC346201Wa[]) c462990IDp.l0;
        Object objLIZ = C23039090z.LIZ(interfaceC1364105Vn, new AwS550S0100000_6(interfaceC346201WaArr, 1443), new C441810HUd(null, (DefaultEmojiBtnAbilityImpl) c462990IDp.l1), interfaceC346701Wf, interfaceC346201WaArr);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    public static final Object collect$2(C462990IDp c462990IDp, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c462990IDp.l0).collect(new AgS197S0200000_6(interfaceC346701Wf, (SocialAvatarSyncLegoTask) c462990IDp.l1, 27), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
