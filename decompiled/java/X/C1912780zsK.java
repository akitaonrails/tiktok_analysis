package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1912780zsK extends C2217421BqW implements Function1<String, Unit> {
    public C1912780zsK(C101K c101k) {
        super(1, c101k, C101K.class, "onClickWatch", "onClickWatch(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C101K c101k = (C101K) this.receiver;
        c101k.getClass();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("scenario", "general");
        String aid = c101k.LIZIZ.getAid();
        if (aid == null) {
            aid = "";
        }
        pairArr[1] = new Pair("group_id", aid);
        C20684815ws.LJIILLIIL("tns_mask_layer_click_watch", C2097608Jq.LJIIIIZZ(pairArr));
        c101k.LJFF.invoke();
        return Unit.LIZ;
    }
}
