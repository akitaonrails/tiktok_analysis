package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import java.util.Map;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496180Jd2 {
    public final AnonymousClass0957<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> LIZ;
    public final Map<AbstractC495790JcP<?>, AnonymousClass0957<Object>> LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Pair<? extends com.bytedance.android.live.network.response.BaseResponse<webcast.api.room.GetRoomProfileCardResponse.ResponseData, com.bytedance.android.livesdk.model.Extra>, ? extends java.util.Map<X.AbstractC495790JcP<?>, ? extends java.lang.Object>>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C496190Jd3
            if (r0 == 0) goto L90
            r5 = r10
            X.0Jd3 r5 = (X.C496190Jd3) r5
            int r2 = r5.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r5.LLIZLLLIL = r2
        L12:
            java.lang.Object r8 = r5.LLILZLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLIZLLLIL
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L64
            if (r0 == r1) goto L72
            if (r0 != r4) goto L9d
            java.lang.Object r7 = r5.LLILZIL
            java.lang.Object r3 = r5.LLILZ
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r2 = r5.LLILLL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r0 = r5.LLILLJJLI
            java.util.Map r0 = (java.util.Map) r0
            com.bytedance.android.live.network.response.BaseResponse r1 = r5.LL
            X.C155000ia.LIZIZ(r8)
        L35:
            r3.put(r7, r8)
            r3 = r0
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.0957 r0 = (X.AnonymousClass0957) r0
            r5.LL = r1
            r5.LLILLJJLI = r3
            r5.LLILLL = r2
            r5.LLILZ = r3
            r5.LLILZIL = r7
            r5.LLIZLLLIL = r4
            java.lang.Object r8 = r0.LJLIIIL(r5)
            if (r8 != r6) goto L62
            return r6
        L62:
            r0 = r3
            goto L35
        L64:
            X.C155000ia.LIZIZ(r8)
            X.0957<com.bytedance.android.live.network.response.BaseResponse<webcast.api.room.GetRoomProfileCardResponse$ResponseData, com.bytedance.android.livesdk.model.Extra>> r0 = r9.LIZ
            r5.LLIZLLLIL = r1
            java.lang.Object r8 = r0.LJLIIIL(r5)
            if (r8 != r6) goto L75
            return r6
        L72:
            X.C155000ia.LIZIZ(r8)
        L75:
            com.bytedance.android.live.network.response.BaseResponse r8 = (com.bytedance.android.live.network.response.BaseResponse) r8
            java.util.Map<X.0JcP<?>, X.0957<java.lang.Object>> r1 = r9.LIZIZ
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r0 = r1.size()
            int r0 = X.C2097908Jt.LIZIZ(r0)
            r3.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r2 = r0.iterator()
            r1 = r8
            goto L39
        L90:
            X.0Jd3 r5 = new X.0Jd3
            r5.<init>(r9, r10)
            goto L12
        L97:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r3)
            return r0
        L9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496180Jd2.LIZ(X.05Vn):java.lang.Object");
    }

    public C496180Jd2(C099G c099g, Map map) {
        this.LIZ = c099g;
        this.LIZIZ = map;
    }
}
