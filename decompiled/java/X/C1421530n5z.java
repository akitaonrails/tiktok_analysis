package X;

import Y.AfS157S0200000_22;
import Y.AfS191S0100000_22;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.recent.apis.RecentMusicListRequest;
import com.ss.android.ugc.aweme.tools.music.music.recent.apis.RecentMusicNetworkAPI;
import com.ss.android.ugc.aweme.tools.music.music.recent.cache.LruCacheMusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421530n5z implements InterfaceC1652740t6u {
    public static final C1421530n5z LL = new C1421530n5z();
    public static final C1411940mqW LLILLJJLI = new C1411940mqW();
    public static final Map<String, MusicModel> LLILLL = new LinkedHashMap();
    public static C1421550n61 LLILZ;
    public static final RecentMusicNetworkAPI LLILZIL;
    public static String LLILZLL;
    public static final Set<String> LLIZ;
    public static final int LLIZLLLIL;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        LLILZIL = (RecentMusicNetworkAPI) C09S2.LIZJ(RecentMusicNetworkAPI.class, C2188811AlT.LIZIZ(sbLIZ));
        LLILZLL = "";
        LLIZ = C13LQ.LJLIIL(new String[]{"profile_photo", "slideshow_rec", "sync_page_recommend", "auto_cut_music_recommend", "mv_default"});
        LLIZLLLIL = 8;
    }

    @Override // X.InterfaceC204613154p
    public C11NZ<List<MusicModel>> Lk() {
        List listLJLJJLL = C13LP.LJLJJLL(LLILLJJLI.LIZ());
        final ArrayList arrayList = new ArrayList();
        for (Object obj : listLJLJJLL) {
            if (((LruCacheMusicModel) obj).musicId != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!LLILLL.containsKey(((LruCacheMusicModel) obj2).musicId)) {
                arrayList2.add(obj2);
            }
        }
        final ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((LruCacheMusicModel) it2.next()).musicId);
        }
        if (!arrayList3.isEmpty()) {
            return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0n2s
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<List<MusicModel>> c09aj) {
                    C1C7U.LIZ("RecentMusicRepository@7dc0.recentMusicList$2");
                    C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    C1421530n5z.LLILZIL.getMusicDetailByIdList(new RecentMusicListRequest((String[]) arrayList3.toArray(new String[0]))).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS157S0200000_22(c19482611Ke, arrayList, 7), new AfS191S0100000_22(c19482611Ke, 37));
                    C1C7U.LIZIZ("RecentMusicRepository@7dc0.recentMusicList$2");
                }
            });
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            MusicModel musicModel = LLILLL.get(((LruCacheMusicModel) it3.next()).musicId);
            if (musicModel != null) {
                arrayList4.add(musicModel);
            }
        }
        return C11NZ.LJJJJZ(arrayList4);
    }

    @Override // X.InterfaceC204613154p
    public boolean VS() {
        List<LruCacheMusicModel> listLIZ = LLILLJJLI.LIZ();
        if (!(listLIZ instanceof Collection) || !listLIZ.isEmpty()) {
            Iterator<LruCacheMusicModel> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                if (!LLILLL.containsKey(it2.next().musicId)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean LIZIZ(String str) {
        return LLIZ.contains(str);
    }

    @Override // X.InterfaceC204613154p
    public String EN(String str) {
        LruCacheMusicModel lruCacheMusicModel = LLILLJJLI.LIZ.get(str);
        if (lruCacheMusicModel != null) {
            return lruCacheMusicModel.originalSelectedFrom;
        }
        return null;
    }

    @Override // X.InterfaceC204613154p
    public void HA0(String str) {
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        if (LLILZ == null) {
            IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
            if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
                curUserId = accountUserServiceLJIIJ.getCurUserId();
            } else {
                curUserId = "";
            }
            LIZJ(curUserId);
        }
        C1411940mqW c1411940mqW = LLILLJJLI;
        c1411940mqW.LIZIZ.remove(str);
        c1411940mqW.LIZ.remove(str);
        C1421550n61 c1421550n61 = LLILZ;
        if (c1421550n61 != null) {
            ((Keva) c1421550n61.LIZIZ.getValue()).storeString("recent_music_objects", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), c1411940mqW.LIZ()));
        }
    }

    public final void LIZJ(String str) {
        List<LruCacheMusicModel> list;
        boolean z;
        if (!Intrinsics.LJFF(str, LLILZLL)) {
            LLILZLL = str;
            C1421550n61 c1421550n61 = new C1421550n61(LLILZLL);
            LLILZ = c1421550n61;
            try {
                list = (List) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), ((Keva) c1421550n61.LIZIZ.getValue()).getString("recent_music_objects", "[]"), new TypeToken<List<? extends LruCacheMusicModel>>() { // from class: X.0n5t
                }.getType());
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                list = C13BV.INSTANCE;
            }
            if (list != null) {
                C1411940mqW c1411940mqW = LLILLJJLI;
                c1411940mqW.LIZ.clear();
                c1411940mqW.LIZIZ.clear();
                int i = 0;
                for (LruCacheMusicModel lruCacheMusicModel : list) {
                    try {
                        CastLongProtector.parseLong(lruCacheMusicModel.musicId);
                        c1411940mqW.LIZ.put(lruCacheMusicModel.musicId, lruCacheMusicModel);
                        if (lruCacheMusicModel.isFromAutoSelection) {
                            if (i < 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            IEnsure iEnsure = C1AF0.LIZ;
                            if (iEnsure != null) {
                                iEnsure.ensureTrue(z, "[RecentMusicLruCache] There are more than 2 auto selected music in list");
                            }
                            c1411940mqW.LIZIZ.add(lruCacheMusicModel.musicId);
                            i++;
                        }
                    } catch (NumberFormatException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC204613154p
    public void Lu0(String str, boolean z) {
        MusicModel.CollectionType collectionType;
        MusicModel musicModel = LLILLL.get(str);
        if (musicModel != null) {
            if (z) {
                collectionType = MusicModel.CollectionType.COLLECTED;
            } else {
                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
            }
            musicModel.setCollectionType(collectionType);
        }
    }

    @Override // X.InterfaceC1453610nvj
    public void ZN(MusicModel musicModel, String str) {
        boolean z;
        String str2;
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        String str3 = "";
        if (LLILZ == null) {
            IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
            if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
                curUserId = "";
            } else {
                curUserId = accountUserServiceLJIIJ.getCurUserId();
            }
            LIZJ(curUserId);
        }
        if (musicModel.isLocalMusic()) {
            return;
        }
        if (Intrinsics.LJFF(str, "edit_page_recent")) {
            LruCacheMusicModel lruCacheMusicModel = LLILLJJLI.LIZ.get(musicModel.getMusicId());
            if (lruCacheMusicModel != null && (str2 = lruCacheMusicModel.originalSelectedFrom) != null) {
                str3 = str2;
            }
        } else {
            str3 = str;
        }
        C1411940mqW c1411940mqW = LLILLJJLI;
        LruCacheMusicModel lruCacheMusicModel2 = new LruCacheMusicModel(musicModel.getMusicId(), LIZIZ(str), str3);
        c1411940mqW.getClass();
        boolean z2 = lruCacheMusicModel2.isFromAutoSelection;
        String str4 = lruCacheMusicModel2.musicId;
        c1411940mqW.LIZIZ.remove(str4);
        c1411940mqW.LIZ.remove(str4);
        if (z2) {
            if (c1411940mqW.LIZIZ.size() >= 2) {
                Object objLJJJJZ = C13LP.LJJJJZ(c1411940mqW.LIZIZ);
                c1411940mqW.LIZIZ.remove(objLJJJJZ);
                if (c1411940mqW.LIZ.remove(objLJJJJZ) != null) {
                    z = true;
                } else {
                    z = false;
                }
                IEnsure iEnsure = C1AF0.LIZ;
                if (iEnsure != null) {
                    iEnsure.ensureTrue(z, "[RecentMusicLruCache]  Evicted auto-selected musicId not exit in main cache");
                }
            }
            c1411940mqW.LIZIZ.add(lruCacheMusicModel2.musicId);
        }
        if (c1411940mqW.LIZ.size() >= 50) {
            LinkedHashMap<String, LruCacheMusicModel> linkedHashMap = c1411940mqW.LIZ;
            linkedHashMap.remove(C13LP.LJJJJZ(linkedHashMap.keySet()));
        }
        LruCacheMusicModel lruCacheMusicModelPut = c1411940mqW.LIZ.put(lruCacheMusicModel2.musicId, lruCacheMusicModel2);
        if (lruCacheMusicModelPut != null) {
            c1411940mqW.LIZIZ.remove(lruCacheMusicModelPut.musicId);
        }
        MusicModel musicModelM317clone = musicModel.m317clone();
        if (musicModelM317clone != null) {
            musicModelM317clone.setMusicItemType(MusicModel.MusicItemType.ORIGIN);
            musicModelM317clone.setRecommendSourceFrom("other_music");
            musicModelM317clone.setSmartExtendMusicList(null);
            musicModelM317clone.setSmartExtended(false);
            LLILLL.put(musicModel.getMusicId(), musicModelM317clone);
        }
        C1421550n61 c1421550n61 = LLILZ;
        if (c1421550n61 != null) {
            ((Keva) c1421550n61.LIZIZ.getValue()).storeString("recent_music_objects", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), c1411940mqW.LIZ()));
        }
    }
}
