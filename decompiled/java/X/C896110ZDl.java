package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.IMNudgeAndStreakService;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS96S1300000_14;

/* JADX INFO: renamed from: X.0ZDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C896110ZDl extends C2217421BqW implements Function1<Integer, Unit> {
    public C896110ZDl(Object obj) {
        super(1, obj, C896120ZDm.class, "onLightInteractionBtnClick", "onLightInteractionBtnClick(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        List<WeakReference<InterfaceC896180ZDs>> list;
        int iIntValue = num.intValue();
        C896120ZDm c896120ZDm = (C896120ZDm) this.receiver;
        C896130ZDn c896130ZDn = c896120ZDm.LIZIZ;
        if (c896130ZDn != null) {
            String nickname = c896130ZDn.LIZLLL.getNickname();
            EnumC1908380zlE enumC1908380zlE = EnumC1908380zlE.ACTIVITY_NOTIFICATION_PAGE;
            C0ZDA c0zda = new C0ZDA(enumC1908380zlE.getValue(), c896130ZDn.LJFF, null, null, null, null, null, null, null, 508);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("nickName: ");
            sbLIZ.append(nickname);
            sbLIZ.append(", btnStyle: ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", eventData: ");
            sbLIZ.append(c0zda);
            C2188811AlT.LIZIZ(sbLIZ);
            if (iIntValue == 1) {
                IRemindUsersViewHelper.LIZ.getClass();
                IRemindUsersViewHelper iRemindUsersViewHelperLIZ = C069A.LIZ();
                if (iRemindUsersViewHelperLIZ != null) {
                    Context context = c896130ZDn.LIZ;
                    String value = c0zda.LIZ;
                    if (value == null) {
                        value = enumC1908380zlE.getValue();
                    }
                    iRemindUsersViewHelperLIZ.LIZ(context, value, false, new AwS96S1300000_14(c896120ZDm, c896130ZDn, c0zda, nickname, 0));
                }
            } else {
                C896120ZDm.LJII(c896130ZDn);
            }
            IMNudgeAndStreakService.LJFF.getClass();
            C896140ZDo c896140ZDo = (C896140ZDo) IMNudgeAndStreakService.LJII.getValue();
            String str = c896130ZDn.LIZIZ;
            if (c896140ZDo.LIZ.add(str) && (list = c896140ZDo.LIZIZ.get(str)) != null) {
                Iterator<WeakReference<InterfaceC896180ZDs>> it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC896180ZDs interfaceC896180ZDs = it2.next().get();
                    if (interfaceC896180ZDs != null) {
                        interfaceC896180ZDs.LJ(true);
                    }
                }
            }
            Function0<Unit> function0 = c896120ZDm.LIZJ;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }
}
