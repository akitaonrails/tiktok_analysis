package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.101X, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C101X extends C2217421BqW implements Function1<String, Unit> {
    public C101X(C101O c101o) {
        super(1, c101o, C101O.class, "onClickSkipAll", "onClickSkipAll(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C101O c101o = (C101O) this.receiver;
        c101o.getClass();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("scenario", "photosensitive");
        String aid = c101o.LIZIZ.getAid();
        if (aid == null) {
            aid = "";
        }
        pairArr[1] = new Pair("group_id", aid);
        C20684815ws.LJIILLIIL("tns_mask_layer_click_skip", C2097608Jq.LJIIIIZZ(pairArr));
        ComplianceServiceProvider.LJI().LJIILLIIL(1, null);
        c101o.LJFF.invoke();
        return Unit.LIZ;
    }
}
