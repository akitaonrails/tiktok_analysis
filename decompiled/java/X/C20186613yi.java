package X;

import Y.AComparatorS22S0000000_3;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.vesdk.VEDownloaderConfig;
import com.ss.android.vesdk.VEFileDownloader;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S2102001_30;
import kotlin.jvm.internal.AwS24S1110000_30;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20186613yi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AbstractC20187113yn LLILZ;
    public final /* synthetic */ VEFileDownloader LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Set<String> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Long LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ List<String> LLJIJIL;
    public final /* synthetic */ float LLJILJIL;
    public final /* synthetic */ ForwardVideo LLJILJILJ;
    public final /* synthetic */ HashMap<String, String> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20186613yi(String str, String str2, String str3, AbstractC20187113yn abstractC20187113yn, VEFileDownloader vEFileDownloader, String str4, Set<String> set, String str5, Long l, String str6, List<String> list, float f, ForwardVideo forwardVideo, HashMap<String, String> map) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = abstractC20187113yn;
        this.LLILZIL = vEFileDownloader;
        this.LLILZLL = str4;
        this.LLIZ = set;
        this.LLIZLLLIL = str5;
        this.LLJ = l;
        this.LLJI = str6;
        this.LLJIJIL = list;
        this.LLJILJIL = f;
        this.LLJILJILJ = forwardVideo;
        this.LLJILLL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object c098200Yq;
        C20186513yh c20186513yh;
        VEFileDownloader vEFileDownloader;
        Object c098200Yq2;
        Iterable iterableLJJLL;
        C20186213ye.LIZ.getClass();
        try {
            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            List listLJIIJJI = C1697810uHb.LJIIJJI(pathService.LJIIJ(EnumC20227914Cv.STREAM_EDIT_VIDEO, "", true), pathService.LJIIJ(EnumC20227914Cv.REAL_STREAM_EDIT_VIDEO, "", true));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (InterfaceC20186313yf interfaceC20186313yf : ((ConcurrentHashMap) C20186213ye.LIZIZ).values()) {
                if (interfaceC20186313yf instanceof C20186513yh) {
                    linkedHashSet.add(((C20186513yh) interfaceC20186313yf).LIZJ);
                    linkedHashSet.add(((C20186513yh) interfaceC20186313yf).LIZLLL);
                } else if (interfaceC20186313yf instanceof C1877607Xa) {
                    linkedHashSet.add(((C1877607Xa) interfaceC20186313yf).LIZ);
                } else if (!(interfaceC20186313yf instanceof C07XZ)) {
                    throw new C1954807lC();
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                File[] fileArrListFiles = ((File) it2.next()).listFiles();
                if (fileArrListFiles == null || (iterableLJJLL = C13LQ.LJJLL(fileArrListFiles)) == null) {
                    iterableLJJLL = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterableLJJLL, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((File) obj).isFile()) {
                    arrayList2.add(obj);
                }
            }
            List<File> listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(40), arrayList2);
            Iterator it3 = listLJLLLL.iterator();
            long length = 0;
            while (it3.hasNext()) {
                length += ((File) it3.next()).length();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = 0;
            for (File file : listLJLLLL) {
                if (!linkedHashSet.contains(file.getAbsolutePath())) {
                    long jLastModified = jCurrentTimeMillis - file.lastModified();
                    boolean z = jLastModified > 604800000;
                    boolean z2 = length > 268435456 && jLastModified > 43200000;
                    if (!z && !z2) {
                        break;
                    }
                    long length2 = file.length();
                    try {
                        c098200Yq2 = Boolean.valueOf(file.delete());
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = bool;
                    }
                    if (((Boolean) c098200Yq2).booleanValue()) {
                        length -= length2;
                        i++;
                        C201955140j.LIZLLL(C201950140e.LIZIZ, "ShareToStoryVideoStream", "pruneDiskCacheLru: deleted ageMs=" + jLastModified + " len=" + length2 + " path=" + file.getAbsolutePath());
                    }
                }
            }
            if (i > 0 || length > 268435456) {
                C201950140e c201950140e = C201950140e.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pruneDiskCacheLru: deleted=");
                sbLIZ.append(i);
                sbLIZ.append(" remainingBytes=");
                sbLIZ.append(length);
                sbLIZ.append(" protected=");
                sbLIZ.append(linkedHashSet.size());
                C201955140j.LJIJJ(c201950140e, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201950140e c201950140e2 = C201950140e.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pruneDiskCacheLru failed err=");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C201955140j.LJIJJ(c201950140e2, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ2));
        }
        String strLIZIZ = this.LL;
        if (strLIZIZ == null || !(!a0.LJJJIL(strLIZIZ))) {
            C20186213ye c20186213ye = C20186213ye.LIZ;
            ForwardVideo forwardVideo = this.LLJILJILJ;
            float f = this.LLJILJIL;
            c20186213ye.getClass();
            String strLIZJ = C570490MZb.LIZJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.STREAM_EDIT_VIDEO, "", true).getAbsolutePath());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(C20186213ye.LIZ(forwardVideo, f));
            sbLIZ3.append(".mp4");
            Pair pair = new Pair(strLIZJ, C2188811AlT.LIZIZ(sbLIZ3));
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        long length3 = new C0VSJ(strLIZIZ).length();
        final VEDownloaderConfig vEDownloaderConfig = new VEDownloaderConfig(this.LLILLJJLI, this.LLILLL);
        HashMap<String, String> map = this.LLJILLL;
        String str3 = this.LLIZLLLIL;
        List<String> list = this.LLJIJIL;
        Long l = this.LLJ;
        vEDownloaderConfig.maxDownloadCount = C0C64.LJIILLIIL().LJIJ(31744, 3, "edit_page_stream_playback_max_download_count", true);
        vEDownloaderConfig.maxCacheFileCount = C0C64.LJIILLIIL().LJIJ(31744, 50, "edit_page_stream_playback_max_cache_count", true);
        vEDownloaderConfig.needSaveFile = true;
        vEDownloaderConfig.maxNetworkTimeout = C0C64.LJIILLIIL().LJIJ(31744, LivePreCreateNextRoomPlayer.ENABLE, "edit_page_stream_playback_audio_underrun_timeout", true);
        vEDownloaderConfig.headerParams = map;
        vEDownloaderConfig.customSavePath = str3;
        vEDownloaderConfig.urlList = (String[]) list.toArray(new String[0]);
        vEDownloaderConfig.externalPath = strLIZIZ;
        vEDownloaderConfig.externalFirstSegOffset = length3;
        if (l != null) {
            vEDownloaderConfig.externalMediaSize = l.longValue();
        }
        C20186213ye c20186213ye2 = C20186213ye.LIZ;
        final AbstractC20187113yn abstractC20187113yn = this.LLILZ;
        final VEFileDownloader vEFileDownloader2 = this.LLILZIL;
        final String str4 = this.LLILZLL;
        final Set<String> set = this.LLIZ;
        final String str5 = this.LLIZLLLIL;
        Long l2 = this.LLJ;
        final long jLongValue = l2 != null ? l2.longValue() : 0L;
        c20186213ye2.getClass();
        AbstractC20187113yn abstractC20187113yn2 = new AbstractC20187113yn() { // from class: X.13yj
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x01f9  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x02a2  */
            @Override // X.InterfaceC20187013ym
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r21) {
                /*
                    Method dump skipped, instruction units count: 681
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20186713yj.LIZ(java.lang.String):void");
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZJ(String str6) {
                C201950140e c201950140e3 = C201950140e.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("onConnected url=");
                sbLIZ5.append(str6);
                C201955140j.LIZLLL(c201950140e3, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ5));
                AbstractC20187113yn abstractC20187113yn3 = abstractC20187113yn;
                if (abstractC20187113yn3 != null) {
                    abstractC20187113yn3.LIZJ(str6);
                }
            }

            public final boolean LJFF(InterfaceC20186313yf interfaceC20186313yf2) {
                if (interfaceC20186313yf2 != null && !(interfaceC20186313yf2 instanceof C07XZ)) {
                    if (interfaceC20186313yf2 instanceof C20186513yh) {
                        if (((C20186513yh) interfaceC20186313yf2).LIZ != vEFileDownloader2) {
                            return false;
                        }
                    } else {
                        if (!(interfaceC20186313yf2 instanceof C1877607Xa)) {
                            throw new C1954807lC();
                        }
                        return false;
                    }
                }
                return true;
            }

            @Override // X.InterfaceC20187013ym
            public final void LIZLLL(String str6, boolean z3) {
                C201950140e c201950140e3 = C201950140e.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("onOpenResult success=");
                sbLIZ5.append(z3);
                sbLIZ5.append(" url=");
                sbLIZ5.append(str6);
                sbLIZ5.append(' ');
                C201955140j.LIZLLL(c201950140e3, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ5));
                C0CNO.LIZLLL(0L, new AwS24S1110000_30(abstractC20187113yn, str6, z3, 2));
            }

            @Override // X.InterfaceC20187013ym
            public final void LJJJLL(String str6, float f2) {
                C201950140e c201950140e3 = C201950140e.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("onProgress progress=");
                sbLIZ5.append(f2);
                sbLIZ5.append(" url=");
                sbLIZ5.append(str6);
                sbLIZ5.append(' ');
                C201955140j.LIZLLL(c201950140e3, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ5));
                AbstractC20187113yn abstractC20187113yn3 = abstractC20187113yn;
                if (abstractC20187113yn3 != null) {
                    abstractC20187113yn3.LJJJLL(str6, f2);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:60:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // X.InterfaceC20187013ym
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(java.lang.String r16, int r17, int r18, java.lang.String r19) {
                /*
                    Method dump skipped, instruction units count: 407
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20186713yj.LIZIZ(java.lang.String, int, int, java.lang.String):void");
            }

            @Override // X.AbstractC20187113yn
            public final void LJ(String str6, int i2, int i3, float f2, String str7) {
                C201950140e c201950140e3 = C201950140e.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("onInfo type=");
                sbLIZ5.append(i2);
                sbLIZ5.append(" - msg: ");
                sbLIZ5.append(str7);
                C201955140j.LIZLLL(c201950140e3, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ5));
                C0CNO.LIZLLL(0L, new AwS0S2102001_30(i2, abstractC20187113yn, str6, i3, f2, str7, 1));
            }
        };
        VEFileDownloader vEFileDownloader3 = this.LLILZIL;
        String str6 = this.LLJI;
        String str7 = this.LLIZLLLIL;
        Set<String> set2 = this.LLIZ;
        C20186513yh c20186513yh2 = new C20186513yh(vEFileDownloader3, str6, str7, strLIZIZ, set2);
        String str8 = this.LLILZLL;
        Iterator<T> it4 = set2.iterator();
        while (it4.hasNext()) {
            ((ConcurrentHashMap) C20186213ye.LIZJ).put(it4.next(), str8);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C20186213ye.LIZIZ;
        InterfaceC20186313yf interfaceC20186313yf2 = (InterfaceC20186313yf) concurrentHashMap.put(this.LLILZLL, c20186513yh2);
        if ((interfaceC20186313yf2 instanceof C20186513yh) && (c20186513yh = (C20186513yh) interfaceC20186313yf2) != null && (vEFileDownloader = c20186513yh.LIZ) != null) {
            vEFileDownloader.destroyFileDownload();
        }
        if (concurrentHashMap.get(this.LLILZLL) != c20186513yh2) {
            C201950140e c201950140e3 = C201950140e.LIZIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("startPreDownload: entry was cancelled before start, skipping createFileDownload url=");
            sbLIZ5.append(C13LN.LJZL(80, this.LLILLJJLI));
            C201955140j.LJIJJ(c201950140e3, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ5));
        } else {
            C201950140e c201950140e4 = C201950140e.LIZIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("startPreDownload url=");
            sbLIZ6.append(this.LLILLJJLI);
            sbLIZ6.append(" urlCount=");
            sbLIZ6.append(this.LLJIJIL.size());
            sbLIZ6.append(" path=");
            sbLIZ6.append(this.LLIZLLLIL);
            sbLIZ6.append(" externalPath=");
            sbLIZ6.append(strLIZIZ);
            sbLIZ6.append(" externalFirstSegOffset=");
            sbLIZ6.append(length3);
            sbLIZ6.append(" externalMediaSize");
            sbLIZ6.append(this.LLJ);
            sbLIZ6.append("currentVideoBitrate=");
            sbLIZ6.append(this.LLJILJIL);
            C201955140j.LIZLLL(c201950140e4, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ6));
            this.LLILZIL.createFileDownloadWithCustomPath(vEDownloaderConfig, abstractC20187113yn2);
        }
        return Unit.LIZ;
    }
}
