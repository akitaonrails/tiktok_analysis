package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HMH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HMH extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ PurePreviewMediaEngine LL;
    public final /* synthetic */ SocMediaResource LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HMH(PurePreviewMediaEngine purePreviewMediaEngine, SocMediaResource socMediaResource, boolean z, int i, boolean z2, int i2) {
        super(2);
        this.LL = purePreviewMediaEngine;
        this.LLILLJJLI = socMediaResource;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = z2;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LIZJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1));
        return Unit.LIZ;
    }
}
