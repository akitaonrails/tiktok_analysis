package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.experiment.StoryNoticeTakedownBannerFixSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS20S0600000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Syr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C739030Syr extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C739030Syr(InterfaceC725050ScJ interfaceC725050ScJ, InterfaceC725050ScJ<? extends RECEIVER> interfaceC725050ScJ2, InterfaceC1685420txc<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        super(4);
        this.$t = interfaceC1685420txc;
        this.l0 = interfaceC725050ScJ;
        this.l1 = interfaceC725050ScJ2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C739030Syr(ReusedAssem reusedAssem, T t, Function0<Unit> function0) {
        super(4);
        this.$t = function0;
        this.l0 = reusedAssem;
        this.l1 = t;
    }

    public static final Object invoke$0(C739030Syr c739030Syr, Object obj, Object obj2, Object obj3, Object obj4) {
        C03H5 actualReceiver = ((InterfaceC725050ScJ) c739030Syr.l0).getActualReceiver();
        if (actualReceiver != null) {
            C723830SaL.LIZIZ(actualReceiver, new AwS20S0600000_11((InterfaceC1685420txc) c739030Syr.l1, (InterfaceC1685420txc<C03H5, Object, Object, Object, Object, Unit>) actualReceiver, (C03H5) obj, obj2, obj3, obj4, (Object) 1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(C739030Syr c739030Syr, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        C291001Au c291001Au = (C291001Au) obj2;
        C291001Au c291001Au2 = (C291001Au) obj4;
        String aid = ((VideoItemParams) C631370Opb.LIZ((ReusedAssem) c739030Syr.l0)).getAweme().getAid();
        if (c291001Au != null && Intrinsics.LJFF(c291001Au.LIZ, aid)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C590030NCf c590030NCf = C0BXE.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("container ");
            sbLIZ.append(obj.getClass().getSimpleName());
            sbLIZ.append(" --decisionToMake ===> AwemeId= ");
            sbLIZ.append(aid);
            c590030NCf.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            C0RUC.LJFF((InterfaceC691660RBc) ((ReusedAssem) c739030Syr.l0), new AwS555S0100000_11((Function0) c739030Syr.l1, (Function0<Unit>) 1528));
        } else {
            C693070RGn c693070RGn = null;
            if (obj3 != null) {
                C0RJN c0rjnLIZIZ = ((InterfaceC691660RBc) ((ReusedAssem) c739030Syr.l0)).jm().LIZIZ();
                if (c0rjnLIZIZ != null && c0rjnLIZIZ.LJFF) {
                    C590030NCf c590030NCf2 = C0BXE.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("container ");
                    sbLIZ2.append(obj.getClass().getSimpleName());
                    sbLIZ2.append(" ---reject---holderSelectEv ===> AwemeId= ");
                    sbLIZ2.append(aid);
                    c590030NCf2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    C590030NCf c590030NCf3 = C0BXE.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("container ");
                    sbLIZ3.append(obj.getClass().getSimpleName());
                    sbLIZ3.append(" --normal holderSelectEv decision ===> AwemeId= ");
                    sbLIZ3.append(aid);
                    c590030NCf3.LIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
                    C0RUC.LJFF((InterfaceC691660RBc) ((ReusedAssem) c739030Syr.l0), new AwS555S0100000_11((Function0) c739030Syr.l1, (Function0<Unit>) 1529));
                }
            } else if ((c291001Au2 != null && (c693070RGn = (C693070RGn) c291001Au2.LIZ) != null && c693070RGn.LJ) || (StoryNoticeTakedownBannerFixSetting.isEnabled() && c693070RGn != null && Intrinsics.LJFF(c693070RGn.LJII, Boolean.TRUE))) {
                C0RUC.LJFF((InterfaceC691660RBc) ((ReusedAssem) c739030Syr.l0), new AwS555S0100000_11((Function0) c739030Syr.l1, (Function0<Unit>) 1530));
            }
        }
        return Unit.LIZ;
    }
}
