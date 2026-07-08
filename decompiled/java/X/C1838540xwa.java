package X;

import com.bytedance.android.livesdk.model.ColorBackground;
import com.bytedance.android.livesdk.model.EdgeInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838540xwa extends C09AY implements Function1<C1838550xwb, Unit> {
    public final /* synthetic */ ColorBackground LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838540xwa(ColorBackground colorBackground, float f) {
        super(1);
        this.LL = colorBackground;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1838550xwb c1838550xwb) {
        float f;
        float f2;
        float f3;
        C1838550xwb c1838550xwb2 = c1838550xwb;
        c1838550xwb2.LJI = C202500qF.LIZJ(0, this.LL.color);
        ColorBackground colorBackground = this.LL;
        EdgeInsets edgeInsets = colorBackground.padding;
        float f4 = 0.0f;
        if (edgeInsets != null) {
            f = edgeInsets.top;
        } else {
            f = 0.0f;
        }
        c1838550xwb2.LIZ = f / 100.0f;
        if (edgeInsets != null) {
            f2 = edgeInsets.bottom;
        } else {
            f2 = 0.0f;
        }
        c1838550xwb2.LIZIZ = f2 / 100.0f;
        if (edgeInsets != null) {
            f3 = edgeInsets.left;
        } else {
            f3 = 0.0f;
        }
        c1838550xwb2.LIZLLL = f3 / 100.0f;
        if (edgeInsets != null) {
            f4 = edgeInsets.right;
        }
        c1838550xwb2.LJ = f4 / 100.0f;
        c1838550xwb2.LIZJ = colorBackground.radius / 100.0f;
        c1838550xwb2.LJFF = this.LLILLJJLI / 100.0f;
        return Unit.LIZ;
    }
}
