package X;

import android.content.DialogInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0niS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1445380niS extends C05YF {
    void LLLLZLLLI(LifecycleOwner lifecycleOwner, Function1<? super Lifecycle.Event, Unit> function1);

    void Sm1();

    PostBtnConfigure Wj0();

    void kW0(PostBtnConfigure postBtnConfigure, Function1<? super Integer, Unit> function1, Function0<Unit> function0, DialogInterface.OnDismissListener onDismissListener);
}
