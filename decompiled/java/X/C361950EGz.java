package X;

import android.view.View;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C361950EGz extends C2217421BqW implements InterfaceC1631620sYq<C361980EHc, Integer, View, Unit> {
    public C361950EGz(C361870EGr c361870EGr) {
        super(3, c361870EGr, C361870EGr.class, "onSmallIconClick", "onSmallIconClick(Lcom/ss/ugc/android/editor/base/bottombar/FunctionItem;ILandroid/view/View;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C361980EHc c361980EHc, Integer num, View view) {
        ((C361870EGr) this.receiver).d6(c361980EHc, num.intValue(), view);
        return Unit.LIZ;
    }
}
