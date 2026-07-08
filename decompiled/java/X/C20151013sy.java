package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20151013sy implements InterfaceC20151113sz {
    public IRetrofitFactory LIZ;

    @Override // X.InterfaceC20151113sz
    public final AbstractRunnableC20150813sw<InterfaceC20153313tL> LIZ(final InterfaceC20153313tL interfaceC20153313tL, final C20152313tB c20152313tB, final Bundle bundle) {
        if (interfaceC20153313tL instanceof InterfaceC727570SgN) {
            if (this.LIZ != null) {
                InterfaceC727570SgN interfaceC727570SgN = (InterfaceC727570SgN) interfaceC20153313tL;
                IRetrofitFactory iRetrofitFactory = this.LIZ;
                if (iRetrofitFactory == null) {
                    Intrinsics.LJIIL();
                }
                return new C20151213t0(interfaceC727570SgN, c20152313tB, bundle, iRetrofitFactory);
            }
            return new AbstractRunnableC20150813sw<InterfaceC20153313tL>(interfaceC20153313tL, c20152313tB, bundle) { // from class: X.13sx
                @Override // X.AbstractRunnableC20150813sw
                public final Object LIZJ() {
                    return null;
                }
            };
        }
        if (interfaceC20153313tL instanceof InterfaceC20150713sv) {
            return new C20150513st((InterfaceC20150713sv) interfaceC20153313tL, c20152313tB, bundle);
        }
        return new AbstractRunnableC20150813sw<InterfaceC20153313tL>(interfaceC20153313tL, c20152313tB, bundle) { // from class: X.13sx
            @Override // X.AbstractRunnableC20150813sw
            public final Object LIZJ() {
                return null;
            }
        };
    }
}
