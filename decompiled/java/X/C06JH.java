package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubLoadingBallAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06JH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06JH extends C09AY implements Function2<UIAssem, Boolean, Unit> {
    public final /* synthetic */ SubLoadingBallAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06JH(SubLoadingBallAssem subLoadingBallAssem) {
        super(2);
        this.LL = subLoadingBallAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Boolean bool) {
        C1390410mHn c1390410mHn;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C1390410mHn c1390410mHn2 = this.LL.LLJ;
            if (c1390410mHn2 != null) {
                C500260Jjc.LLFFF(c1390410mHn2);
                c1390410mHn2.LIZJ();
            }
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE) && (c1390410mHn = this.LL.LLJ) != null) {
            C500260Jjc.LJIILIIL(c1390410mHn);
            c1390410mHn.LIZLLL();
        }
        return Unit.LIZ;
    }
}
