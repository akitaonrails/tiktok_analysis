package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06WS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06WS implements InterfaceC1891350zJl {
    public final UrlModel LL;
    public final int LLILLJJLI;
    public final View.OnClickListener LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C06WS(UrlModel urlModel, int i, View.OnClickListener onClickListener) {
        this.LL = urlModel;
        this.LLILLJJLI = i;
        this.LLILLL = onClickListener;
    }
}
