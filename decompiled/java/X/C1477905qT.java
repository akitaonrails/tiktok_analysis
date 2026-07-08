package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.05qT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1477905qT<T> implements InterfaceC1478005qU {
    public final /* synthetic */ ShareUserContent LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ InterfaceC497601wk LIZJ;

    public C1477905qT(ShareUserContent shareUserContent, boolean z, LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = shareUserContent;
        this.LIZIZ = z;
        this.LIZJ = lifecycleCoroutineScope;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C1477705qR> c09aj) {
        AwS368S0200000_2 awS368S0200000_2;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        C09AE c09ae;
        C1C7U.LIZ("UserBindInfoRepository@38de.getInfo$1");
        ShareUserContent shareUserContent = this.LIZ;
        if (shareUserContent == null) {
            c09aj.onNext(new C1477705qR(null, null, null, null, false, C13BV.INSTANCE));
            c09aj.onComplete();
            C1C7U.LIZIZ("UserBindInfoRepository@38de.getInfo$1");
            return;
        }
        if (!this.LIZIZ) {
            awS368S0200000_2 = null;
        } else {
            awS368S0200000_2 = new AwS368S0200000_2((C19482611Ke) c09aj, shareUserContent, 87);
        }
        ShareUserContent shareUserContent2 = this.LIZ;
        InterfaceC497601wk interfaceC497601wk = this.LIZJ;
        if (interfaceC497601wk != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C1474605pw(shareUserContent2, c09aj, awS368S0200000_2, null), 2);
        } else {
            anonymousClass0956LIZLLL = null;
        }
        C01GW c01gw = C1477805qS.LIZ;
        Reference reference = (Reference) ((ConcurrentMap) c01gw.getValue()).get(Integer.valueOf(shareUserContent2.hashCode()));
        if (reference != null && (c09ae = (C09AE) reference.get()) != null) {
            c09ae.LIZIZ(null);
        }
        ((Map) c01gw.getValue()).put(Integer.valueOf(shareUserContent2.hashCode()), new WeakReference(anonymousClass0956LIZLLL));
        C1C7U.LIZIZ("UserBindInfoRepository@38de.getInfo$1");
    }
}
