package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966130bFT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966130bFT(C966020bFI c966020bFI, int i, Object obj) {
        super(0);
        this.LL = c966020bFI;
        this.LLILLJJLI = i;
        this.LLILLL = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL.LJJIJ.LLILLJJLI) {
            int i = this.LLILLJJLI;
            if (i == 2) {
                this.LL.LJ().changeOnlineUserState(((Integer) this.LLILLL).intValue());
            } else if (i == 3) {
                Integer num = (Integer) this.LLILLL;
                boolean z = true;
                if (num.intValue() != 0) {
                    C966020bFI c966020bFI = this.LL;
                    Object obj = this.LLILLL;
                    num.intValue();
                    C966920bGk c966920bGkLJ = c966020bFI.LJ();
                    int iIntValue = ((Integer) obj).intValue();
                    if (!c966020bFI.LIZIZ && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).N70()) {
                        z = false;
                    }
                    c966920bGkLJ.LJLL(iIntValue, "", z);
                }
            } else if (i == 4) {
                this.LL.LJ().LJLILLLLZI(Intrinsics.LJFF(this.LLILLL, 2));
            }
        }
        return Unit.LIZ;
    }
}
