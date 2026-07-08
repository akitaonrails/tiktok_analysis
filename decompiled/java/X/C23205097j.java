package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.port.internal.IMediaCacheService;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.097j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23205097j extends C09AY implements Function0<C23201097f> {
    public C23205097j() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.097f] */
    @Override // kotlin.jvm.functions.Function0
    public final C23201097f invoke() {
        return new IMediaCacheService() { // from class: X.097f
            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final void cacheImageSize(String str) {
                if (str != null && !a0.LJJJIL(str)) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C23199097d(str, null), 3);
                }
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final long getFileSize(String str) {
                long length;
                if (str != null && !a0.LJJJIL(str)) {
                    ConcurrentHashMap<String, Long> concurrentHashMap = C23203097h.LJFF;
                    if (concurrentHashMap.containsKey(str)) {
                        Long l = concurrentHashMap.get(str);
                        if (l != null) {
                            return l.longValue();
                        }
                        return 0L;
                    }
                    if (C2471909mP.LJJIIZI(str)) {
                        length = C570280MYg.LJ(UriProtector.parse(str));
                    } else {
                        length = new C0VSJ(str).length();
                    }
                    concurrentHashMap.put(str, Long.valueOf(length));
                    return length;
                }
                return 0L;
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final Pair<Integer, Integer> getImageColorCache(String str) {
                boolean z;
                if (str != null && !a0.LJJJIL(str)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return null;
                }
                HashMap<String, Pair<Integer, Integer>> map = C23203097h.LIZJ;
                if (map.containsKey(str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getImageColorCache ");
                    sbLIZ.append(str);
                    sbLIZ.append("-->:");
                    sbLIZ.append(map.get(str));
                    C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
                    return map.get(str);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getImageColorCache ");
                sbLIZ2.append(str);
                sbLIZ2.append("-->null");
                C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final int getImageRotateDegree(String str) {
                return C13W4.LIZ(str);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final Pair<Integer, Integer> getImageSizeCache(String str) {
                boolean z;
                if (str != null && !a0.LJJJIL(str)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return null;
                }
                HashMap<String, Pair<Integer, Integer>> map = C23203097h.LIZIZ;
                if (map.containsKey(str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getImageSizeCache ");
                    sbLIZ.append(str);
                    sbLIZ.append("-->:");
                    sbLIZ.append(map.get(str));
                    C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
                    return map.get(str);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getImageSizeCache ");
                sbLIZ2.append(str);
                sbLIZ2.append("-->null");
                C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final Boolean getMediaTypeCache(String str) {
                boolean z;
                if (str != null && !a0.LJJJIL(str)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return null;
                }
                HashMap<String, Boolean> map = C23203097h.LIZ;
                if (map.containsKey(str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("get ");
                    sbLIZ.append(str);
                    sbLIZ.append("-->isImage:");
                    sbLIZ.append(map.get(str));
                    C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
                    return map.get(str);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("get ");
                sbLIZ2.append(str);
                sbLIZ2.append("-->isImage:null");
                C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final HashMap<String, String> getMetaData(String str) {
                return C23203097h.LIZ(str);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final Boolean hasOriginAudioFromCache(String str) {
                return C23203097h.LIZIZ(str);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final void updateFileSize(String str) {
                C23203097h.LIZJ(str);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final void updateMediaTypeCache(String str) {
                if (str != null && !a0.LJJJIL(str)) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C23200097e(str, null), 3);
                }
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final void updateMetaDataCache(String str) {
                C23203097h.LIZLLL(str);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final void updateVideoInfoCache(String str) {
                C23203097h.LJ(str);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final void updateVideoOriginAudioCache(String str) {
                C23203097h.LJFF(str, true);
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final void updateMediaTypeCache(String str, String str2) {
                if (str != null && !a0.LJJJIL(str)) {
                    HashMap<String, Boolean> map = C23203097h.LIZ;
                    Boolean boolValueOf = Boolean.valueOf(C2471909mP.LIZ(str2));
                    boolean zBooleanValue = boolValueOf.booleanValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("set ");
                    sbLIZ.append(str);
                    sbLIZ.append("-->isImage:");
                    sbLIZ.append(zBooleanValue);
                    C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
                    map.put(str, boolValueOf);
                }
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final void cacheImageColor(String str, int i, boolean z) {
                if (str != null && !a0.LJJJIL(str)) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0L05(str, i, z, null), 3);
                }
            }

            @Override // com.ss.android.ugc.aweme.port.internal.IMediaCacheService
            public final void cacheImageSize(String str, int i, int i2, int i3) {
                Pair<Integer, Integer> pair;
                if (str != null && !a0.LJJJIL(str)) {
                    if (i3 != 90 && i3 != 270) {
                        pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
                    } else {
                        pair = new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
                    }
                    if (pair.getFirst().intValue() != 0 && pair.getSecond().intValue() != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("cacheImageSize ");
                        sbLIZ.append(str);
                        sbLIZ.append("-->");
                        sbLIZ.append(pair);
                        C201955140j.LIZIZ("MediaCacheRepository", C2188811AlT.LIZIZ(sbLIZ));
                        C23203097h.LIZIZ.put(str, pair);
                    }
                }
            }
        };
    }
}
