package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1360205Ua extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLILLJJLI;
    public final /* synthetic */ Function1<EnumC1360305Ub, Unit> LLILLL;
    public final /* synthetic */ InterfaceC497601wk LLILZ;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLILZIL;
    public final /* synthetic */ C1362605Uy LLILZLL;
    public final /* synthetic */ SocMediaResource LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360205Ua(SocMediaResource socMediaResource, C1362605Uy c1362605Uy, Function1 function1, C259800zU c259800zU, C259800zU c259800zU2, InterfaceC497601wk interfaceC497601wk, boolean z, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = function1;
        this.LLILZ = interfaceC497601wk;
        this.LLILZIL = c259800zU2;
        this.LLILZLL = c1362605Uy;
        this.LLIZ = socMediaResource;
        this.LLIZLLLIL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL) {
            if (this.LLILLJJLI.element.LIZLLL().floatValue() < 1.0f) {
                this.LLILLL.invoke(EnumC1360305Ub.IDLE);
                C1671460tb6.LIZLLL(this.LLILZ, this.LLILLJJLI, this.LLILZIL, 1.0f, 0L);
            } else if (this.LLILLJJLI.element.LIZLLL().floatValue() > 1.0f) {
                C23250099c.LIZLLL(this.LLILZ, null, null, new C05UW(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLILZIL, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
