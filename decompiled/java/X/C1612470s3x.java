package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.service.ISeriesPlayNextService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612470s3x implements ISeriesPlayNextService {
    public final String LIZ;
    public final LruCache<Long, Pair<CopyOnWriteArrayList<PaidVideoItem>, PaidContentVideoListResponse>> LIZIZ = new LruCache<>(1);

    public C1612470s3x(String str) {
        this.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesPlayNextService
    public final void checkAndRemoveCache(Aweme aweme) {
        Collection arrayList;
        String aid;
        PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
        if (paidContentInfo != null) {
            long paidCollectionId = paidContentInfo.getPaidCollectionId();
            Pair<CopyOnWriteArrayList<PaidVideoItem>, PaidContentVideoListResponse> pair = this.LIZIZ.get(Long.valueOf(paidCollectionId));
            if (pair == null || (arrayList = (CopyOnWriteArrayList) pair.getFirst()) == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Aweme aweme2 = ((PaidVideoItem) it2.next()).aweme;
                    if (aweme2 != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, aweme.getAid())) {
                        return;
                    }
                }
            }
            this.LIZIZ.remove(Long.valueOf(paidCollectionId));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesPlayNextService
    public final void clearVideoListCache(long j) {
        this.LIZIZ.remove(Long.valueOf(j));
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesPlayNextService
    public final PaidVideoItem nextVideo(String str, long j) {
        CopyOnWriteArrayList<PaidVideoItem> first;
        String aid;
        Pair<CopyOnWriteArrayList<PaidVideoItem>, PaidContentVideoListResponse> pair = this.LIZIZ.get(Long.valueOf(j));
        if (pair == null || (first = pair.getFirst()) == null) {
            return null;
        }
        Iterator<PaidVideoItem> it2 = first.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                Aweme aweme = it2.next().aweme;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return (PaidVideoItem) C13LP.LJJJLZIJ(i + 1, first);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02b4 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.service.ISeriesPlayNextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadVideoList(com.ss.android.ugc.aweme.feed.model.Aweme r34, long r35, X.InterfaceC1364105Vn<? super kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1612470s3x.loadVideoList(com.ss.android.ugc.aweme.feed.model.Aweme, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r18, long r20, X.C1612570s47 r22, com.ss.android.ugc.aweme.feed.model.Aweme r23, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends java.util.List<com.ss.android.ugc.aweme.model.PaidVideoItem>, com.ss.android.ugc.aweme.model.PaidContentVideoListResponse>> r24) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1612470s3x.LIZ(long, long, X.0s47, com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }
}
