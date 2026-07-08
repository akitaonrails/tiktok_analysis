package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.160G, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160G extends C09AY implements Function1<C160U, Unit> {
    public final /* synthetic */ CLACaptionViewModelV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160G(CLACaptionViewModelV2 cLACaptionViewModelV2) {
        super(1);
        this.LL = cLACaptionViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C160U c160u) {
        C160A c160aWQ2 = this.LL.wQ2();
        c160aWQ2.getClass();
        int i = C1779000wOY.LIZ[c160u.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c160aWQ2.LLIZLLLIL = false;
                if (C0A7T.LIZ()) {
                    c160aWQ2.LLILLL.LIZ(false);
                }
            }
        } else {
            c160aWQ2.LLIZLLLIL = true;
        }
        return Unit.LIZ;
    }
}
