package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS289S0000000_6;

/* JADX INFO: renamed from: X.0Hb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444040Hb8 extends AbstractC1335900krs {
    public final Function2<Uri, View, Unit> LL;
    public final InterfaceC1631630sYr<Uri, View, C428600GrK, Animatable, Unit> LLILLJJLI;
    public final InterfaceC1631620sYq<Uri, View, Throwable, Unit> LLILLL;

    public /* synthetic */ C444040Hb8(InterfaceC1631630sYr interfaceC1631630sYr, InterfaceC1631620sYq interfaceC1631620sYq) {
        this(AFwS289S0000000_6.get$arr$(45), interfaceC1631630sYr, interfaceC1631620sYq);
    }

    @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        this.LL.invoke(uri, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C444040Hb8(Function2<? super Uri, ? super View, Unit> function2, InterfaceC1631630sYr<? super Uri, ? super View, ? super C428600GrK, ? super Animatable, Unit> interfaceC1631630sYr, InterfaceC1631620sYq<? super Uri, ? super View, ? super Throwable, Unit> interfaceC1631620sYq) {
        this.LL = function2;
        this.LLILLJJLI = interfaceC1631630sYr;
        this.LLILLL = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        this.LLILLL.invoke(uri, view, th);
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        this.LLILLJJLI.invoke(uri, view, c428600GrK, animatable);
    }
}
