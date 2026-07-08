package X;

import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.livesdk.hashtag.HashTagApiV2;

/* JADX INFO: renamed from: X.00vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C237800vw implements InterfaceC736910SvR<InterfaceC237900vx> {
    public final HashTagApiV2 LL;
    public final C237700vv LLILLJJLI;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.00vv] */
    public C237800vw() {
        C480460Ism.LIZ().getClass();
        this.LL = (HashTagApiV2) C480460Ism.LIZLLL(HashTagApiV2.class);
        this.LLILLJJLI = new InterfaceC237900vx() { // from class: X.00vv
            @Override // X.InterfaceC237900vx
            public final Object l(InterfaceC1364105Vn<? super C470590Icr<HashtagResponse>> interfaceC1364105Vn) {
                return this.LL.LL.fetchHashtagList(interfaceC1364105Vn);
            }

            @Override // X.InterfaceC237900vx
            public final Object LLLLJ(String str, String str2, C773630UWj c773630UWj) {
                return this.LL.LL.searchGameTag(str, str2, 0, 50, 4L, "game_tag", c773630UWj);
            }
        };
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}
