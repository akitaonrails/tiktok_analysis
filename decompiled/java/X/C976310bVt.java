package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976310bVt extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C975970bVL LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C976310bVt(C975970bVL c975970bVL, long j, long j2) {
        super(1);
        this.LL = c975970bVL;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        EnumC973680bRe enumC973680bRe;
        Room roomInfo;
        User owner;
        Throwable th2 = th;
        C0UVC.LIZIZ(th2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(th2);
        sbLIZ.append(" and currentCohostSize = ");
        sbLIZ.append(C915980Zwa.LJII().LLILZLL(true).size());
        C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        if (C915980Zwa.LJII().LLILZLL(true).size() <= 2) {
            C975970bVL c975970bVL = this.LL;
            long j = this.LLILLJJLI;
            c975970bVL.getClass();
            Boolean boolValueOf = Boolean.valueOf(C976040bVS.LJIIZILJ(j));
            InterfaceC975520bUc interfaceC975520bUc = this.LL.LIZIZ;
            if (interfaceC975520bUc != null && (roomInfo = interfaceC975520bUc.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null && this.LLILLL == owner.getId()) {
                enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
            } else {
                enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
            }
            c975970bVL.LJJJ(boolValueOf, enumC973680bRe);
        }
        return Unit.LIZ;
    }
}
