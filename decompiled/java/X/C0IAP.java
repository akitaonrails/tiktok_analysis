package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.SendMessageViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IAP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IAP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SendMessageViewModel LL;
    public final /* synthetic */ CharSequence LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IAP(SendMessageViewModel sendMessageViewModel, CharSequence charSequence, String str, String str2, Map<String, String> map, String str3) {
        super(0);
        this.LL = sendMessageViewModel;
        this.LLILLJJLI = charSequence;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SendMessageViewModel.xQ2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null, this.LLILZLL, 232);
        return Unit.LIZ;
    }
}
