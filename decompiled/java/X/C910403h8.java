package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C910403h8 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C897703f5 LL;
    public final /* synthetic */ NewPayInfo LLILLJJLI;
    public final /* synthetic */ InterfaceC911103hF LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910403h8(C897703f5 c897703f5, NewPayInfo newPayInfo, InterfaceC911103hF interfaceC911103hF, Context context, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = c897703f5;
        this.LLILLJJLI = newPayInfo;
        this.LLILLL = interfaceC911103hF;
        this.LLILZ = context;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C907803gi c907803gi = C907803gi.LIZ;
            C897703f5 c897703f5 = this.LL;
            c897703f5.LIZLLL = NewPayInfo.LIZ(this.LLILLJJLI, PayResult.DONE);
            c907803gi.LJIJJLI(c897703f5, "pix_via_google_pay", false);
        } else {
            C897703f5 c897703f52 = this.LL;
            Context context = this.LLILZ;
            InterfaceC911103hF interfaceC911103hF = this.LLILLL;
            C907803gi.LJJIIZI(c897703f52, context, interfaceC911103hF, this.LLILZIL, this.LLILLJJLI, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null, null, null, null, null, null, new AwS580S0100000_1(interfaceC911103hF, 169));
        }
        return Unit.LIZ;
    }
}
