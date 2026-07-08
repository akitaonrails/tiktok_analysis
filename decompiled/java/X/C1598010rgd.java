package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598010rgd extends C09AY implements Function2<Integer, InterfaceC1891350zJl, Unit> {
    public final /* synthetic */ C1598000rgc LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598010rgd(C1598000rgc c1598000rgc, int i) {
        super(2);
        this.LL = c1598000rgc;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, InterfaceC1891350zJl interfaceC1891350zJl) {
        StoryInboxItem storyInboxItem;
        int iIntValue = num.intValue();
        InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
        String nickname = null;
        if ((interfaceC1891350zJl2 instanceof StoryInboxItem) && (storyInboxItem = (StoryInboxItem) interfaceC1891350zJl2) != null && (iIntValue == 0 || 10 == iIntValue)) {
            storyInboxItem.setPriority(3500);
            this.LL.LJIIIIZZ(3500, interfaceC1891350zJl2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("adjustPriority: item = ");
            User author = storyInboxItem.getStoryCollection().getAuthor();
            if (author != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            sbLIZ.append(", hashcode = ");
            sbLIZ.append(storyInboxItem.hashCode());
            sbLIZ.append(", priority = ");
            sbLIZ.append(storyInboxItem.getPriority());
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLILLJJLI == 1 && iIntValue == 0) {
                storyInboxItem.setRankState(1);
            }
        }
        return Unit.LIZ;
    }
}
