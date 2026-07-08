package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0zlo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1908740zlo {
    Context getCtx();

    Function1<C0SY7, Unit> getDataChangeListener();

    Function1<InterfaceC1364105Vn<? super Boolean>, Object> getFollowClickInterceptor();

    Function2<C0SY7, C0SY7, Unit> getFollowClickListener();

    Function2<C0SY7, Boolean, Unit> getRequestListener();

    Function0<InterfaceC898240ZLq> getTracker();

    void setDataChangeListener(Function1<? super C0SY7, Unit> function1);

    void setFollowClickInterceptor(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1);

    void setFollowClickListener(Function2<? super C0SY7, ? super C0SY7, Unit> function2);

    void setRequestListener(Function2<? super C0SY7, ? super Boolean, Unit> function2);

    void setTracker(Function0<? extends InterfaceC898240ZLq> function0);
}
