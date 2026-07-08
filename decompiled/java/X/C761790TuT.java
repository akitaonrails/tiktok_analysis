package X;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TuT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761790TuT extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C761750TuP LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ LiveEffect LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761790TuT(C761750TuP c761750TuP, int i, LiveEffect liveEffect, boolean z, boolean z2) {
        super(1);
        this.LL = c761750TuP;
        this.LLILLJJLI = i;
        this.LLILLL = liveEffect;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.LLLI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
