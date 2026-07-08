package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sOQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625160sOQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1625150sOP LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC1625180sOS<T> LLILZIL;
    public final /* synthetic */ Bundle LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625160sOQ(C1625150sOP c1625150sOP, Effect effect, String str, String str2, InterfaceC1625180sOS interfaceC1625180sOS, Bundle bundle) {
        super(0);
        this.LL = c1625150sOP;
        this.LLILLJJLI = effect;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = interfaceC1625180sOS;
        this.LLILZLL = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1625150sOP c1625150sOP = this.LL;
        InterfaceC1625220sOW interfaceC1625220sOW = c1625150sOP.LIZIZ;
        Effect effect = (Effect) this.LLILLJJLI;
        boolean zLJIIJ = C1625940sPg.LJIIJ(c1625150sOP.LIZ, effect);
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        C1625440sOs c1625440sOs = (C1625440sOs) this.LLILZIL;
        interfaceC1625220sOW.LJIIJ(effect, zLJIIJ, str, str2, "click_main_panel", c1625440sOs.LIZIZ, c1625440sOs.LIZJ == EnumC1448980noG.UI_GALLERY, this.LLILZLL, this.LL.LIZJ.propFromGroupModel);
        return Unit.LIZ;
    }
}
