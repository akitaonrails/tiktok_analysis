package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524620Kho extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ C1DRG LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ Intent LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C524620Kho(C19EG c19eg, C1DRG c1drg, int i, long j, long j2, int i2, int i3, Intent intent) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = c1drg;
        this.LLILLL = i;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MediaChosenResultProcessFactory.LIZJ().LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL).LIZ(this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
