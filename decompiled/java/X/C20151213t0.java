package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20151213t0 extends AbstractRunnableC20150813sw<InterfaceC727570SgN<Object, ?>> {
    public static boolean LLJ;
    public static final C01GW LLJI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(224));
    public final IRetrofitFactory LLIZLLLIL;

    @Override // X.AbstractRunnableC20150813sw
    public final Object LIZJ() {
        return ((InterfaceC727570SgN) this.LLILZ).preload2(this.LLILZLL, new AwS609S0100000_30(this, 151));
    }

    public C20151213t0(InterfaceC727570SgN<Object, ?> interfaceC727570SgN, C20152313tB c20152313tB, Bundle bundle, IRetrofitFactory iRetrofitFactory) {
        super(interfaceC727570SgN, c20152313tB, bundle);
        this.LLIZLLLIL = iRetrofitFactory;
    }
}
