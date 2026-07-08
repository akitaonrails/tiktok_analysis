package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.101W, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C101W extends C2217421BqW implements Function1<String, Unit> {
    public C101W(C101O c101o) {
        super(1, c101o, C101O.class, "onClickWatchVideo", "onClickWatchVideo(Ljava/lang/String;)V", 0);
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
        C20684815ws.LJIILLIIL("tns_mask_layer_click_watch", C2097608Jq.LJIIIIZZ(pairArr));
        ComplianceServiceProvider.LJI().LJIILLIIL(2, null);
        c101o.LJ.invoke();
        return Unit.LIZ;
    }
}
