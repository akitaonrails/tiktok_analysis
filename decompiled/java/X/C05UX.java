package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05UX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05UX extends C09AY implements InterfaceC1631620sYq<C1378605aS, C1378605aS, Float, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1362605Uy LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ SocMediaResource LLILZLL;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UX(boolean z, C1362605Uy c1362605Uy, InterfaceC497601wk interfaceC497601wk, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU, boolean z2, SocMediaResource socMediaResource, C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU2) {
        super(3);
        this.LL = z;
        this.LLILLJJLI = c1362605Uy;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = c259800zU;
        this.LLILZIL = z2;
        this.LLILZLL = socMediaResource;
        this.LLIZ = c259800zU2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C1378605aS c1378605aS, C1378605aS c1378605aS2, Float f) {
        long j = c1378605aS.LIZ;
        long j2 = c1378605aS2.LIZ;
        float fFloatValue = f.floatValue();
        if (!this.LL) {
            C1362605Uy c1362605Uy = this.LLILLJJLI;
            C1683130ttv c1683130ttv = c1362605Uy.LIZ;
            C23250099c.LIZLLL(this.LLILLL, null, null, new C05US(this.LLILZ, fFloatValue, this.LLILZIL, c1362605Uy.LIZLLL, this.LLILZLL, j, c1683130ttv, j2, this.LLIZ, null), 3);
        }
        return Unit.LIZ;
    }
}
