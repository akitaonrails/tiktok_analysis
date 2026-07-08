package X;

import com.bytedance.android.livesdk.guide.model.TaskActionResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210570hbj extends C09AY implements Function2<Integer, Throwable, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ Long LLJ;
    public final /* synthetic */ Long LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, String, TaskActionResponse.Data, Unit> LLJILJIL;
    public final /* synthetic */ Function2<Integer, Throwable, Unit> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1210570hbj(String str, int i, String str2, Long l, int i2, Integer num, String str3, Integer num2, Long l2, Long l3, int i3, InterfaceC1631620sYq<? super Integer, ? super String, ? super TaskActionResponse.Data, Unit> interfaceC1631620sYq, Function2<? super Integer, ? super Throwable, Unit> function2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = l;
        this.LLILZIL = i2;
        this.LLILZLL = num;
        this.LLIZ = str3;
        this.LLIZLLLIL = num2;
        this.LLJ = l2;
        this.LLJI = l3;
        this.LLJIJIL = i3;
        this.LLJILJIL = interfaceC1631620sYq;
        this.LLJILJILJ = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Throwable th) {
        int iIntValue = num.intValue();
        if (iIntValue > 0) {
            C1219670hqP.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL - 1, this.LLJILJIL, this.LLJILJILJ);
        } else {
            this.LLJILJILJ.invoke(Integer.valueOf(iIntValue), th);
        }
        return Unit.LIZ;
    }
}
