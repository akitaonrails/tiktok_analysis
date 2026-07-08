package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429360GsY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ AbstractC429340GsW LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C429360GsY(int i, AbstractC429340GsW abstractC429340GsW, int i2, View view) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = abstractC429340GsW;
        this.LLILLL = i2;
        this.LLILZ = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        int i = this.LL;
        if (i == 1) {
            if (this.LLILLJJLI.getAvatarLL().getChildCount() > 3 && this.LLILLL == 0) {
                C786410Ut5.LJJJZ(this.LLILZ, this.LLILLJJLI.getAvatarLL());
            }
        } else if (i == 2 && this.LLILLJJLI.getAvatarLL().getChildCount() > 0 && this.LLILLL == this.LLILLJJLI.getAvatarLL().getChildCount() - 1) {
            C786410Ut5.LJJJZ(this.LLILZ, this.LLILLJJLI.getAvatarLL());
        }
        return Unit.LIZ;
    }
}
