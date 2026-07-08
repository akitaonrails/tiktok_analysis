package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bC2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964000bC2 implements InterfaceC964010bC3 {
    public final C11NJ LIZ;

    public C964000bC2(C11NJ c11nj) {
        this.LIZ = c11nj;
    }

    @Override // X.InterfaceC964010bC3
    public final void LIZ(C963990bC1 c963990bC1, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        long j = c963990bC1.LIZ;
        long j2 = c963990bC1.LIZIZ;
        int i = c963990bC1.LIZJ;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        InterfaceC420801kM interfaceC420801kMLJJLL = ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).reject(j, j2, i, 1, 0, 0L, null).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(function0, 127), new AfS184S0100000_15(function1, (Function1<? super C470590Icr<Unit>, Unit>) 128));
        C11NJ c11nj = this.LIZ;
        c930480aJy.getClass();
        c11nj.LIZ(interfaceC420801kMLJJLL);
    }
}
