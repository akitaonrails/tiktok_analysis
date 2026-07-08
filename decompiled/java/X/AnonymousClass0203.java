package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.business.edm.Data;
import com.ss.android.ugc.aweme.compliance.business.edm.EdmUserPropertiesResponse;

/* JADX INFO: renamed from: X.0203, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class AnonymousClass0203 implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(AnonymousClass0203 anonymousClass0203) {
    }

    public static final void onComplete$1(AnonymousClass0203 anonymousClass0203) {
    }

    public static final void onSubscribe$0(AnonymousClass0203 anonymousClass0203, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(AnonymousClass0203 anonymousClass0203, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
        }
    }

    public AnonymousClass0203(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(AnonymousClass0203 anonymousClass0203, Throwable th) {
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) anonymousClass0203.l0);
        c1389890mGx.LJIIIZ(2131835079);
        c1389890mGx.LJIIJJI();
    }

    public static final void onError$1(AnonymousClass0203 anonymousClass0203, Throwable th) {
        ((InterfaceC251700yB) anonymousClass0203.l0).LIZJ();
    }

    public static final void onNext$1(AnonymousClass0203 anonymousClass0203, Object obj) {
        boolean z;
        InterfaceC251700yB interfaceC251700yB = (InterfaceC251700yB) anonymousClass0203.l0;
        Data data = ((EdmUserPropertiesResponse) obj).getData();
        if (data != null) {
            z = data.showConsentPage;
        } else {
            z = false;
        }
        interfaceC251700yB.LIZIZ(z);
    }

    public static final /* bridge */ /* synthetic */ void onNext$0(AnonymousClass0203 anonymousClass0203, Object obj) {
    }
}
