package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645720PUk extends C09AY implements Function0<C645710PUj> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC648030PbN LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C645720PUk(C648330Pbr c648330Pbr, ViewOnAttachStateChangeListenerC648030PbN viewOnAttachStateChangeListenerC648030PbN, Fragment fragment, long j) {
        super(0);
        this.LL = c648330Pbr;
        this.LLILLJJLI = viewOnAttachStateChangeListenerC648030PbN;
        this.LLILLL = fragment;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C645710PUj invoke() {
        C648330Pbr c648330Pbr;
        View view = this.LL;
        if (!(view instanceof C648330Pbr) || (c648330Pbr = (C648330Pbr) view) == null) {
            return null;
        }
        ViewOnAttachStateChangeListenerC648030PbN viewOnAttachStateChangeListenerC648030PbN = this.LLILLJJLI;
        Fragment fragment = this.LLILLL;
        long j = this.LLILZ;
        viewOnAttachStateChangeListenerC648030PbN.LLILLL = new C647830Pb3(fragment, c648330Pbr);
        viewOnAttachStateChangeListenerC648030PbN.P5().LJJI = j;
        viewOnAttachStateChangeListenerC648030PbN.P5().LJIILJJIL = 3;
        return new C645710PUj(viewOnAttachStateChangeListenerC648030PbN.P5());
    }
}
