package X;

import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotUserInfoComponent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1710406ms {
    public static final boolean LIZ(C06OO c06oo, List<? extends C869590Y9l> list) {
        C06AH c06ah;
        String str;
        AIGroupShotCardTemplate aIGroupShotCardTemplate;
        AIGroupShotCardTemplate aIGroupShotCardTemplate2;
        if (!C911570ZpT.LIZ().enableGroupShot || c06oo.LIZ != EnumC1596306Mv.ONGOING_GROUP_SHOT || !(c06oo instanceof C06AH) || (c06ah = (C06AH) c06oo) == null || (str = c06ah.LIZJ.msgContent.extras.get("task_id")) == null) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C869590Y9l c869590Y9l : list) {
                if (Intrinsics.LJFF(C0ZTJ.LIZ(c869590Y9l), str)) {
                    if (c869590Y9l.getMsgType() == 1812 && (aIGroupShotCardTemplate2 = (AIGroupShotCardTemplate) C0Z2Z.LIZ(c869590Y9l, AIGroupShotCardTemplate.class)) != null && aIGroupShotCardTemplate2.status != EnumC2241471CoD.IN_PROGRESS) {
                        return true;
                    }
                    if (c869590Y9l.getMsgType() == 1812 && (aIGroupShotCardTemplate = (AIGroupShotCardTemplate) C0Z2Z.LIZ(c869590Y9l, AIGroupShotCardTemplate.class)) != null) {
                        List<AIGroupShotUserInfoComponent> list2 = aIGroupShotCardTemplate.userInfo;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<AIGroupShotUserInfoComponent> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().userId == C461720I8s.LIZJ()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
