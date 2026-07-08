package X;

import com.bytedance.als.LiveEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ETQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public interface C0ETQ extends InterfaceC373200EkA {
    LiveEvent<Unit> Gs1();

    <I, O> void IZ0(Class<Object> cls, I i, Function1<? super O, Unit> function1);

    LiveEvent<Unit> L72();

    boolean close();

    void fx1(Function0<Boolean> function0);

    boolean onBackPressed();

    LiveEvent<Unit> p70();
}
