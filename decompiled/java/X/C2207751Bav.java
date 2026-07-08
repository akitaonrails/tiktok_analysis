package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.services.storage.IAVStorageService;
import com.ss.android.ugc.aweme.setting.AvPeriodicCleanStorageSettings;
import com.ss.android.ugc.aweme.storage.impl.AVCreativeCacheStorage;
import com.ss.android.ugc.aweme.storage.impl.AVEffectStorage;
import com.ss.android.ugc.aweme.storage.impl.AVMusicResStorage;
import com.ss.android.ugc.aweme.storage.impl.AVMusicResStorageOpt;
import com.ss.android.ugc.aweme.storage.impl.AVToolsCacheStorage;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.1Bav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207751Bav extends C09AY implements Function0<C13VT> {
    public C2207751Bav() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.13VT] */
    @Override // kotlin.jvm.functions.Function0
    public final C13VT invoke() {
        return new ICacheService() { // from class: X.13VT
            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final void preloadDraftEffectList() {
                EffectPlatform.LJJJJL(false);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String autoCleanMarkDir() {
                return EffectPlatform.LLILZ.getAbsolutePath();
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final void clearCreativeCacheFiles() {
                C1442950neX.LIZ.getClass();
                if (C1442950neX.LIZIZ) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C01GW c01gw = C570500MZc.LIZ;
                if (jCurrentTimeMillis - ((Keva) c01gw.getValue()).getLong("key_last_clean_cache_time", 0L) >= 86400000) {
                    ((Keva) c01gw.getValue()).storeLong("key_last_clean_cache_time", jCurrentTimeMillis);
                    new AVCreativeCacheStorage().LJII(true);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final void clearEffectCache() {
                ((Keva) C1629700sVk.LIZ.getValue()).clear();
                C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIILJJIL("")));
                C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLI("")));
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final void clearFilterCache() {
                o.LJIL.LJJIL().LIZIZ().LJIILIIL();
                o.LJIL.LJJIL().LJFF();
                C1639930smF.LIZ.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final Collection<String> draftAllowList() {
                HashSet hashSet = new HashSet();
                for (AwemeDraft awemeDraft : C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(false, false, null, C0M4F.ALL, null, 119))) {
                    if (awemeDraft != null) {
                        hashSet.addAll(C0CHQ.LIZ().LJI().LJIILJJIL().LJII(awemeDraft));
                    }
                }
                hashSet.addAll(C0CHQ.LIZ().LJI().LJIILJJIL().LJIIIIZZ());
                return hashSet;
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final ArrayList<String> draftMusicList() {
                C0VSJ c0vsj = EffectPlatform.LLILZ;
                if (!C571880Mbq.LIZIZ) {
                    C571880Mbq.LIZ(C571880Mbq.LIZ);
                }
                return C571880Mbq.LJ;
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String effectCacheDir() {
                return EffectPlatform.LLILZ.getAbsolutePath();
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String effectModelDir() {
                return EffectPlatform.LLILZIL.getAbsolutePath();
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean isHasEffectCache() {
                /*
                    r2 = this;
                    X.0VSJ r1 = new X.0VSJ
                    X.0VSJ r0 = com.ss.android.ugc.aweme.effectplatform.EffectPlatform.LLILZ
                    java.lang.String r0 = r0.getAbsolutePath()
                    r1.<init>(r0)
                    java.lang.String[] r0 = r1.list()
                    if (r0 == 0) goto L15
                    int r1 = r0.length
                    r0 = 0
                    if (r1 != 0) goto L16
                L15:
                    r0 = 1
                L16:
                    r0 = r0 ^ 1
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C13VT.isHasEffectCache():boolean");
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final Collection<String> originSoundFile() {
                ArrayList<OriginalSoundUploadTask> arrayListLIZIZ = C1441580ncK.LIZ(o.LIZ).LIZIZ();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLIZIZ, 10));
                Iterator<OriginalSoundUploadTask> it2 = arrayListLIZIZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().originalSoundPath);
                }
                return Arrays.asList(arrayList.toArray(new String[0]));
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final File[] outputFile() {
                return new C0VSJ(C1449640npK.LJIIJ).listFiles(new FileFilter() { // from class: X.13Va
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        if (file == null || !file.exists() || file.getName() == null || !u.LJIIZILJ(file.getName(), "-mix-concat-a", false)) {
                            return false;
                        }
                        return true;
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final File[] rawDuetFile() {
                return new C0VSJ(C1449640npK.LJIIJ).listFiles(new FileFilter() { // from class: X.13VW
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        if (file == null || !file.exists() || file.getName() == null || u.LJJIIJZLJL(file.getName(), "temp_", false) || !u.LJIIZILJ(file.getName(), ".mp4", false)) {
                            return false;
                        }
                        return true;
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final File[] rawVideoFile() {
                return new C0VSJ(C1449640npK.LJIIJ).listFiles(new FileFilter() { // from class: X.13VX
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        if (file == null || !file.exists() || file.getName() == null || !u.LJIIZILJ(file.getName(), "-concat-v", false) || u.LJJIIJZLJL(file.getName(), "synthetise_", false)) {
                            return false;
                        }
                        return true;
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final File[] synthesisFile() {
                return new C0VSJ(C1449640npK.LJIIJ).listFiles(new FileFilter() { // from class: X.13VY
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        if (file == null || !file.exists() || file.getName() == null) {
                            return false;
                        }
                        if (!u.LJJIIJZLJL(file.getName(), "synthetise_", false) && !u.LJIIZILJ(file.getName(), "_synthetise", false)) {
                            return false;
                        }
                        return true;
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final File[] tempDuetFile() {
                return new C0VSJ(C1449640npK.LJIIJ).listFiles(new FileFilter() { // from class: X.13VZ
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        if (file == null || !file.exists() || file.getName() == null || !u.LJJIIJZLJL(file.getName(), "temp_", false)) {
                            return false;
                        }
                        return true;
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final Collection<String> tempVideoFile() {
                HashSet hashSet = new HashSet();
                new C0VSJ(C1449640npK.LIZIZ).getAbsolutePath();
                return hashSet;
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final File[] voiceFile() {
                return new C0VSJ(C1449640npK.LJIIJ).listFiles(new FileFilter() { // from class: X.13Vb
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        if (file == null || !file.exists() || file.getName() == null || !u.LJIIZILJ(file.getName(), "-concat-a", false) || u.LJIIZILJ(file.getName(), "-mix-concat-a", false)) {
                            return false;
                        }
                        return true;
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String aiChatExtractFrameDir() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJJ("");
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final Collection<String> allowList() {
                return ((IAVStorageService) ServiceManager.get().getService(IAVStorageService.class)).getPrefixAllowList();
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final void clearDraftEffectCache() {
                if (C1866300yfM.LIZ()) {
                    new AVToolsCacheStorage().LJIIIZ(true);
                    return;
                }
                if (AvPeriodicCleanStorageSettings.LIZ().isOpen == 1 || AvPeriodicCleanStorageSettings.LIZ().isOpen == 3) {
                    new AVEffectStorage().LJIIIZ(true);
                }
                if (AvPeriodicCleanStorageSettings.LIZ().isOpen == 2 || AvPeriodicCleanStorageSettings.LIZ().isOpen == 3) {
                    if (((Boolean) C0BNA.LIZ.getValue()).booleanValue()) {
                        new AVMusicResStorageOpt().LIZIZ(true);
                    } else {
                        new AVMusicResStorage().LJIIIZ(true);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final void clearExpiredDrafts() {
                C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C0FRX(null), 3);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String duetPublicDir() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJI("");
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String musicDir() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().genMusicPath("");
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String mvRootDir() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C570490MZb.LIZJ(C0CHQ.LIZ.getFilesDir().getAbsolutePath()));
                sbLIZ.append("mvtheme");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String shareDir() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJI("");
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String stitchPublicDir() {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJLL();
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String cacheDir() {
                return C1449640npK.LJIIJ;
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String compatMusDraftDir() {
                return C1449640npK.LJIILLIIL;
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String rootDir() {
                return C1449640npK.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String stickerDir() {
                return C566050MHz.LJIIZILJ;
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String duetCacheDir(String str) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJL(new CreativeInfo(str, 0, null, 6, null));
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String duetCreativeDir(String str) {
                return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LIZIZ(new CreativeInfo(str, 0, null, 6, null), "");
            }

            @Override // com.ss.android.ugc.aweme.services.external.ICacheService
            public final String shareCreativeDir(CreativeInfo creativeInfo) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo));
                sbLIZ.append(File.separator);
                sbLIZ.append("record");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }
}
