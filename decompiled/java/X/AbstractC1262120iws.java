package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1262120iws implements InterfaceC1262230ix3 {
    public final String LL;
    public final Function1<Context, View> LLILLJJLI;
    public final boolean LLILLL;
    public boolean LLILZ;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // X.InterfaceC1262230ix3
    public final String getElementId() {
        return this.LL;
    }

    @Override // X.InterfaceC1262230ix3
    public final boolean isRemoved() {
        return this.LLILZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC1262120iws)) {
            return false;
        }
        return Intrinsics.LJFF(((AbstractC1262120iws) obj).LL, this.LL);
    }

    @Override // X.InterfaceC1262230ix3
    public final void setRemoved(boolean z) {
        this.LLILZ = true;
    }

    public AbstractC1262120iws(String str, AFwS245S0000000_12 aFwS245S0000000_12, boolean z) {
        this.LL = str;
        this.LLILLJJLI = aFwS245S0000000_12;
        this.LLILLL = z;
    }
}
