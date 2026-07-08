package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.component.option.manager.n;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.193M, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public interface C193M extends C05YF {
    void F02(InterfaceC214777193n interfaceC214777193n, Function1<? super Pair<Integer, C193Z>, Unit> function1);

    int IN(Class<Object> cls, Class<Object> cls2, InterfaceC19223310Il interfaceC19223310Il);

    void JF1(AbstractC1738640vLS abstractC1738640vLS);

    <STATE, ACTION> void KL1(InterfaceC1738600vLO interfaceC1738600vLO, Class<STATE> cls, Class<ACTION> cls2, C1664690tQB<STATE> c1664690tQB, ACTION action, C10J3 c10j3);

    <VIEW_HOLDER extends n, STATE, ACTION> void LW(Class<STATE> cls, Class<ACTION> cls2, AnonymousClass1931<VIEW_HOLDER, STATE, ACTION> anonymousClass1931, InterfaceC19223310Il interfaceC19223310Il);

    void M42(AbstractC1738640vLS abstractC1738640vLS);

    AbstractC1738640vLS TJ2(Class<Object> cls, Class<Object> cls2, InterfaceC19223310Il interfaceC19223310Il, ViewGroup viewGroup);

    AbstractC1738640vLS ke1(int i, ViewGroup viewGroup);

    void q61(LifecycleOwner lifecycleOwner, InterfaceC1738600vLO interfaceC1738600vLO, AbstractC1738640vLS abstractC1738640vLS, C1664690tQB<Object> c1664690tQB, Object obj);

    C385670FAf<List<C193Z>> yg2(InterfaceC214777193n interfaceC214777193n);
}
