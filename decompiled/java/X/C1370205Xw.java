package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1370205Xw extends C09AY implements Function1<C1677830tlN<C1378605aS, C1677270tkT>, Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ C1362605Uy LLILLL;
    public final /* synthetic */ SocMediaResource LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLILZLL;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLIZ;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370205Xw(C238400w2 c238400w2, InterfaceC497601wk interfaceC497601wk, C1362605Uy c1362605Uy, SocMediaResource socMediaResource, boolean z, C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU2, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU3) {
        super(1);
        this.LL = c238400w2;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = c1362605Uy;
        this.LLILZ = socMediaResource;
        this.LLILZIL = z;
        this.LLILZLL = c259800zU;
        this.LLIZ = c259800zU2;
        this.LLIZLLLIL = c259800zU3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1677830tlN<C1378605aS, C1677270tkT> c1677830tlN) {
        C1677830tlN<C1378605aS, C1677270tkT> c1677830tlN2 = c1677830tlN;
        long jLJFF = C1378605aS.LJFF(c1677830tlN2.LIZIZ().LIZ, this.LL.element);
        this.LL.element = c1677830tlN2.LIZIZ().LIZ;
        C1671460tb6.LJFF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, jLJFF);
        return Unit.LIZ;
    }
}
