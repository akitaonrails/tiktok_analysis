package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973500bRM implements InterfaceC973480bRK {
    public final /* synthetic */ C974990bTl LIZ;
    public final /* synthetic */ Function2<MultiMatchPrepareResponse, Boolean, Unit> LIZIZ;
    public final /* synthetic */ Function1<Throwable, Unit> LIZJ;

    @Override // X.InterfaceC973480bRK
    public final void LIZ(Throwable th) {
        this.LIZ.LJ = false;
        C974490bSx.LJJIFFI(new C974490bSx(), EnumC973450bRH.PREPARE_FAILED.getReason(), null, null, 14);
        C0UVC.LIZIZ(th);
        this.LIZJ.invoke(th);
    }

    @Override // X.InterfaceC973480bRK
    public final void LIZIZ(MultiMatchPrepareResponse multiMatchPrepareResponse, boolean z) {
        C974990bTl c974990bTl = this.LIZ;
        c974990bTl.LJ = false;
        c974990bTl.LJI = multiMatchPrepareResponse;
        this.LIZIZ.invoke(multiMatchPrepareResponse, Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C973500bRM(C974990bTl c974990bTl, Function2<? super MultiMatchPrepareResponse, ? super Boolean, Unit> function2, Function1<? super Throwable, Unit> function1) {
        this.LIZ = c974990bTl;
        this.LIZIZ = function2;
        this.LIZJ = function1;
    }
}
