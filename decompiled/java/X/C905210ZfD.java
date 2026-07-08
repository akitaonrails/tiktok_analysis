package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C905210ZfD extends C2217421BqW implements Function0<Unit> {
    public C905210ZfD(C21300118Xf c21300118Xf) {
        super(0, c21300118Xf, C21300118Xf.class, "refreshList", "refreshList()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ChatroomEventAbility chatroomEventAbility = (ChatroomEventAbility) C1558520qew.LIZ(C1558360qeg.LJ(((C21300118Xf) this.receiver).LIZ, null), ChatroomEventAbility.class, null);
        if (chatroomEventAbility != null) {
            chatroomEventAbility.QU0(new C06P6(false));
        }
        return Unit.LIZ;
    }
}
