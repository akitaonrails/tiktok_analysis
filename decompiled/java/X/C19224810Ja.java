package X;

import com.bytedance.android.livesdk.game.api.GameLiveWatchApi;
import webcast.api.game.GetCategoryListResponse;

/* JADX INFO: renamed from: X.10Ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19224810Ja implements InterfaceC736910SvR<InterfaceC478060Iou> {
    public final C10JZ LL = new InterfaceC478060Iou() { // from class: X.10JZ
        @Override // X.InterfaceC478060Iou
        public final C11ON e0() {
            C480460Ism.LIZ().getClass();
            return ((GameLiveWatchApi) C480460Ism.LIZLLL(GameLiveWatchApi.class)).getGameCategory().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.10Jb
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    GetCategoryListResponse.ResponseData responseData = ((GetCategoryListResponse) obj).data;
                    if (responseData != null) {
                        return responseData.categories;
                    }
                    return null;
                }
            });
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
