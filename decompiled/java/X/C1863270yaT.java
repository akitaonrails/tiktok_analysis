package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863270yaT extends C09AY implements Function1<List<? extends ConversationInfo>, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C1863240yaQ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ = false;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863270yaT(AwS571S0100000_27 awS571S0100000_27, C1863240yaQ c1863240yaQ, boolean z, C1863820ybM c1863820ybM) {
        super(1);
        this.LL = awS571S0100000_27;
        this.LLILLJJLI = c1863240yaQ;
        this.LLILLL = z;
        this.LLILZIL = c1863820ybM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends ConversationInfo> list) {
        View view;
        List<? extends ConversationInfo> list2 = list;
        if (list2.isEmpty()) {
            this.LL.invoke();
        } else {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<? extends ConversationInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().conversationId);
            }
            C13LP.LJJJJI(arrayList);
            C1863240yaQ c1863240yaQ = this.LLILLJJLI;
            boolean z = this.LLILLL;
            ((ArrayList) c1863240yaQ.LLJJIJIIJIL).clear();
            ((ArrayList) c1863240yaQ.LLJJIJIL).clear();
            c1863240yaQ.LLJJJIL = 0;
            c1863240yaQ.LLJJ = true;
            Iterator<? extends ConversationInfo> it3 = list2.iterator();
            long j = 0;
            while (it3.hasNext()) {
                j += it3.next().unreadCount;
            }
            IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558360qeg.LJ(c1863240yaQ, null), IMessageAbility.class, null);
            if (iMessageAbility != null) {
                iMessageAbility.yW1(j);
            }
            ((ArrayList) c1863240yaQ.LLJJIJIIJIL).addAll(list2);
            c1863240yaQ.LIZJ();
            c1863240yaQ.LJIIZILJ();
            c1863240yaQ.LJ();
            C1390410mHn c1390410mHn = c1863240yaQ.LLILZIL;
            if (c1390410mHn != null) {
                C0DSB.LIZIZ(c1390410mHn);
            }
            if (z && (view = c1863240yaQ.LLILZLL) != null) {
                C0DSB.LIZJ(view);
            }
            if (this.LLILZ) {
                this.LLILLJJLI.LJIJJ();
            }
        }
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
