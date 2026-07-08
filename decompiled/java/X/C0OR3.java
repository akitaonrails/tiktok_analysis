package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OR3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OR3 {
    Context getCtx();

    Function0<Unit> getInviteClickListener();

    Function1<EnumC617010OHz, Unit> getSubscribeChangeListener();

    Function0<C604870Nnx> getTracker();

    void setInviteClickListener(Function0<Unit> function0);

    void setSubscribeChangeListener(Function1<? super EnumC617010OHz, Unit> function1);

    void setTracker(Function0<C604870Nnx> function0);
}
