package X;

import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS7S0011000_21;

/* JADX INFO: renamed from: X.0l8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346500l8y extends C09AY implements Function1<C1346950l9h, Unit> {
    public final /* synthetic */ KeyboardVMV2 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346500l8y(KeyboardVMV2 keyboardVMV2, boolean z, int i) {
        super(1);
        this.LL = keyboardVMV2;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1346950l9h c1346950l9h) {
        Boolean boolValueOf;
        CommentKeyboardModel keyboardModel;
        C1346950l9h c1346950l9h2 = c1346950l9h;
        if (!(c1346950l9h2.LL instanceof C1347070l9t)) {
            CommentContextSource commentContextSourceBQ2 = this.LL.BQ2();
            if (commentContextSourceBQ2 != null && (keyboardModel = commentContextSourceBQ2.getKeyboardModel()) != null) {
                boolValueOf = Boolean.valueOf(keyboardModel.getShieldKeyboardOpen());
            } else {
                boolValueOf = null;
            }
            if (!C1346420l8q.LIZJ(boolValueOf)) {
                C1344030l4z.LIZLLL("KeyboardVM", "updateSoftKeyboardState shieldKeyboardOpen == false ");
                if (!(c1346950l9h2.LL instanceof C1347080l9u)) {
                    this.LL.SQ2(C1347110l9x.LIZ, false);
                }
            }
            this.LL.setState(new AwS7S0011000_21(this.LLILLJJLI, this.LLILLL, 2));
        }
        return Unit.LIZ;
    }
}
