package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.0gaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171420gaa<T> implements C09JN {
    public static final C1171420gaa<T> LL = new C1171420gaa<>();

    @Override // X.C09JN
    public final void accept(Object obj) {
        C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$getRecommendCollectionNameList$1");
        C1206780hVc.LIZJ("/tiktok/ls/collection/recommend_name/v1", "net", (BaseResponse) obj);
        C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$getRecommendCollectionNameList$1");
    }
}
