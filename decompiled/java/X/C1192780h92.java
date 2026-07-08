package X;

import com.ss.android.ugc.aweme.poi.osp.repo.model.ButtonActionPayload;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ToastContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0h92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192780h92 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ToastContent LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<String, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1192780h92(ToastContent toastContent, AwS562S0100000_18 awS562S0100000_18, AwS562S0100000_18 awS562S0100000_182, AwS419S0200000_18 awS419S0200000_18, AwS597S0100000_18 awS597S0100000_18, AwS562S0100000_18 awS562S0100000_183) {
        super(0);
        this.LL = toastContent;
        this.LLILLJJLI = awS562S0100000_18;
        this.LLILLL = awS562S0100000_182;
        this.LLILZ = awS419S0200000_18;
        this.LLILZIL = awS597S0100000_18;
        this.LLILZLL = awS562S0100000_183;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Integer num = this.LL.postActionType;
        int value = EnumC1192790h93.CLOSE_PAGE.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC1192790h93.CLOSE_AND_REFRESH.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC1192790h93.REFRESH.getValue();
                if (num == null || num.intValue() != value3) {
                    int value4 = EnumC1192790h93.REDIRECT.getValue();
                    if (num == null || num.intValue() != value4) {
                        int value5 = EnumC1192790h93.RESUBMIT_ORDER.getValue();
                        if (num == null || num.intValue() != value5) {
                            EnumC1192790h93.NONE.getValue();
                            if (num != null) {
                                num.intValue();
                            }
                        } else {
                            this.LLILZLL.invoke();
                        }
                    } else {
                        Function1<String, Unit> function1 = this.LLILZIL;
                        ButtonActionPayload buttonActionPayload = this.LL.postActionPayload;
                        function1.invoke(buttonActionPayload != null ? buttonActionPayload.schema : null);
                    }
                } else {
                    this.LLILZ.invoke();
                }
            } else {
                this.LLILLL.invoke();
            }
        } else {
            this.LLILLJJLI.invoke();
        }
        return Unit.LIZ;
    }
}
