package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Q15, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q15 extends C09AY implements Function1<AnchorCommonStruct, Unit> {
    public final /* synthetic */ SmartImageView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Q15(SmartImageView smartImageView) {
        super(1);
        this.LL = smartImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnchorCommonStruct anchorCommonStruct) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(anchorCommonStruct.getIcon()));
        c1331670kl3LJIIIIZZ.LJJ(this.LL);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        return Unit.LIZ;
    }
}
