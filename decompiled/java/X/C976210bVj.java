package X;

import Y.ARunnableS48S0300000_15;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976210bVj extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C975970bVL LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC976360bVy LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C976210bVj(C975970bVL c975970bVL, int i, long j, long j2, boolean z, InterfaceC976360bVy interfaceC976360bVy) {
        super(1);
        this.LL = c975970bVL;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = z;
        this.LLILZLL = interfaceC976360bVy;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        EnumC964170bCJ enumC964170bCJY2;
        EnumC973680bRe enumC973680bRe;
        Room roomInfo;
        User owner;
        Throwable th2 = th;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finish, throwable, throwable = ");
        sbLIZ.append(th2);
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        C975970bVL c975970bVL = this.LL;
        c975970bVL.LJIIL = false;
        InterfaceC975520bUc interfaceC975520bUc = c975970bVL.LIZIZ;
        if (interfaceC975520bUc != null) {
            enumC964170bCJY2 = interfaceC975520bUc.Y2();
        } else {
            enumC964170bCJY2 = null;
        }
        if (this.LLILLJJLI >= 6) {
            C975970bVL c975970bVL2 = this.LL;
            C975960bVK c975960bVK = c975970bVL2.LJII;
            if (c975960bVK != null) {
                c975960bVK.LJJLJ = null;
            }
            if (enumC964170bCJY2 == EnumC964170bCJ.SETTLE_START) {
                Boolean boolValueOf = Boolean.valueOf(C976040bVS.LJIIZILJ(this.LLILLL));
                InterfaceC975520bUc interfaceC975520bUc2 = this.LL.LIZIZ;
                if (interfaceC975520bUc2 != null && (roomInfo = interfaceC975520bUc2.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null && this.LLILZ == owner.getId()) {
                    enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
                } else {
                    enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
                }
                c975970bVL2.LJJJ(boolValueOf, enumC973680bRe);
                this.LL.LJJIJ("multi_finish_retry", false);
            }
        } else {
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = this.LLILLJJLI + 1;
            if ((th2 instanceof C501520Jle) && ((C501520Jle) th2).getErrorCode() == 4029004) {
                c118300cf.element = 0;
            }
            if (!this.LLILZIL && (enumC964170bCJY2 == EnumC964170bCJ.SETTLE_START || enumC964170bCJY2 == EnumC964170bCJ.MATCH_START)) {
                C975970bVL c975970bVL3 = this.LL;
                C786410Ut5.LJLIIL(1000L, c975970bVL3.LJIIJ, new ARunnableS48S0300000_15(c975970bVL3, this.LLILZLL, c118300cf, 10));
            }
        }
        return Unit.LIZ;
    }
}
