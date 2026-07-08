package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03hD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C910903hD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC911103hF LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C897703f5 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910903hD(InterfaceC911103hF interfaceC911103hF, String str, C897703f5 c897703f5, String str2, String str3, List<String> list, Context context) {
        super(0);
        this.LL = interfaceC911103hF;
        this.LLILLJJLI = str;
        this.LLILLL = c897703f5;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = list;
        this.LLIZ = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C907803gi.LJJIJIIJIL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        InterfaceC911103hF interfaceC911103hF = this.LL;
        if (interfaceC911103hF != null) {
            interfaceC911103hF.LJFF(PayResult.PENDING, null, null, null, null, null);
        }
        return Unit.LIZ;
    }
}
