package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0saZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632690saZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1632680saY LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Bundle LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1632690saZ(C1632680saY c1632680saY, Effect effect, String str, String str2, int i, Bundle bundle) {
        super(0);
        this.LL = c1632680saY;
        this.LLILLJJLI = effect;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1632680saY c1632680saY = this.LL;
        InterfaceC1625220sOW interfaceC1625220sOW = c1632680saY.LIZIZ;
        Effect effect = this.LLILLJJLI;
        String str = this.LLILLL;
        if (str == null) {
            str = "";
        }
        String str2 = this.LLILZ;
        int i = this.LLILZIL;
        Bundle bundle = this.LLILZLL;
        CreativeModel creativeModel = c1632680saY.LIZJ;
        interfaceC1625220sOW.LJII(i, bundle, creativeModel != null ? creativeModel.propFromGroupModel : null, effect, str, str2, "click_main_panel", "main_panel");
        return Unit.LIZ;
    }
}
