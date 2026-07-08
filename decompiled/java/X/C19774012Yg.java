package X;

import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderGetResp;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12Yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19774012Yg implements InterfaceC19474811He {
    public final int $t;
    public Object l0;

    public static final void onError$0(C19774012Yg c19774012Yg, Throwable th) {
    }

    public static final void onSubscribe$0(C19774012Yg c19774012Yg, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC19474811He
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

    @Override // X.InterfaceC19474811He
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

    @Override // X.InterfaceC19474811He
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
        }
    }

    public C19774012Yg(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$1(C19774012Yg c19774012Yg, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c19774012Yg.l0;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public static final void onSubscribe$1(C19774012Yg c19774012Yg, InterfaceC420801kM interfaceC420801kM) {
        ((InterfaceC20236714Gf) c19774012Yg.l0).LJJII(new AwS608S0100000_29(interfaceC420801kM, 846));
    }

    public static final void onSuccess$0(C19774012Yg c19774012Yg, Object obj) {
        ShoutoutsOrderGetResp shoutoutsOrderGetResp = (ShoutoutsOrderGetResp) obj;
        if (shoutoutsOrderGetResp.statusCode == 0) {
            ((ShoutoutsPlayViewModel) c19774012Yg.l0).LLILZIL.setValue(shoutoutsOrderGetResp.orderStruct);
        }
    }

    public static final void onSuccess$1(C19774012Yg c19774012Yg, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c19774012Yg.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }
}
