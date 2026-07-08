package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.model.SimpleMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.SmartExtendMusicData;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: X.153w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204594153w {
    public final DataCenter LIZIZ;
    public final Context LIZJ;
    public C20499015Jc LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final ChooseMusicApi.API LIZ = ChooseMusicApi.LIZ;
    public final IAVMobService LIZLLL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService();
    public final IFavoriteService LJ = (IFavoriteService) PluggableExtentionKt.pluggableSpi(IFavoriteService.class);

    public static List LJII(List list) {
        ArrayList arrayList = new ArrayList();
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ() && list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Music music = (Music) it2.next();
                if (music.isCommercialMusic()) {
                    arrayList.add(music);
                }
            }
            return arrayList;
        }
        return list;
    }

    public final List<SmartExtendMusicData> LJI(MusicPickResponse musicPickResponse) {
        if (((Boolean) this.LIZIZ.get("enable_extend_music", Boolean.FALSE)).booleanValue()) {
            return musicPickResponse.smartExtendMusicDataList;
        }
        return null;
    }

    public final void LJIIJ(int i) {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        AnonymousClass1549.LIZ(0, 20, false, "", "panel-hot", LJFF(i, null)).LJ(new C20749016Hg(this, 15), C15O7.LJIIIIZZ, null);
    }

    public final void LJIIJJI(int i) {
        boolean zBooleanValue = ((Boolean) this.LIZIZ.get("more_tab_has_fetched", Boolean.FALSE)).booleanValue();
        int iIntValue = ((Integer) this.LIZIZ.get("more_tab_refresh_status", -1)).intValue();
        if (!zBooleanValue && iIntValue != 2) {
            this.LIZIZ.zQ2(2, "more_tab_refresh_status");
            this.LIZIZ.zQ2(2, "more_tab_music_sheet_refresh_status");
            C15O7<MusicCollection> c15o7LIZIZ = ChooseMusicApi.LIZIZ(0, 12, i, 100);
            C20749016Hg c20749016Hg = new C20749016Hg(this, 12);
            ExecutorC2206508kh executorC2206508kh = C15O7.LJIIIIZZ;
            c15o7LIZIZ.LJ(c20749016Hg, executorC2206508kh, null);
            this.LIZIZ.zQ2(2, "more_tab_collection_feed_refresh_status");
            ChooseMusicApi.LJ(0, 10, i).LJ(new C20748816He(this, C138P.LIZ(), 4), executorC2206508kh, null);
        }
    }

    public C204594153w(Context context, DataCenter dataCenter) {
        this.LIZIZ = dataCenter;
        this.LIZJ = context;
    }

    public static void LJIIIIZZ(List list, boolean z) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        int size = 0;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (list != null) {
            size = list.size();
        }
        c2344009Gk.LIZJ(size, "music_list_count");
        C20684815ws.LJIILLIIL("music_pick_result", c2344009Gk.LIZ);
    }

    public static C15O7 LJIIIZ(C15O7 c15o7, Music music) {
        if (music == null) {
            return c15o7;
        }
        return c15o7.LJ(new C20749016Hg(music, 13), C15O7.LJI, null);
    }

    public final IMusicRequestParam LJFF(int i, Map<String, Object> map) {
        Object obj = this.LIZIZ.get("music_request_param");
        if (obj instanceof IMusicRequestParam) {
            return (IMusicRequestParam) obj;
        }
        String str = (String) this.LIZIZ.get("shoot_way");
        String string = UUID.randomUUID().toString();
        if (str == null) {
            str = "";
        }
        return new SimpleMusicRequestParam(false, 0L, i, string, null, false, null, str, null, null, null, null, null, null, null, null, null, null, null, false, false, 0L, false, 0, map, null, null, null, false, false, 0, false, false, null);
    }

    public final void LJIIL(int i, final boolean z) {
        String str;
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        final C138P c138pLIZ = C138P.LIZ();
        Executor executor = C15O7.LJIIIIZZ;
        if (AnonymousClass1546.LIZ()) {
            executor = C15O7.LJI;
        }
        IFavoriteService iFavoriteService = this.LJ;
        if (iFavoriteService != null && iFavoriteService.LJJIL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ChooseMusicApi.LJIIIIZZ(0, i, str).LJ(new InterfaceC2385309Wh() { // from class: X.14zp
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                int size;
                C204594153w c204594153w = this.LIZ;
                C138P c138p = c138pLIZ;
                boolean z2 = z;
                c204594153w.getClass();
                C1C7U.LIZ("ChooseMusicModel@8dbe.refreshUserCollectedMusicList$1L");
                c204594153w.LJIIIIZZ = false;
                long jLIZIZ = c138p.LIZIZ(TimeUnit.MILLISECONDS);
                if (c15o7.LJIILL()) {
                    c204594153w.LIZIZ.zQ2(1, "refresh_status_user_collected_music");
                    IAVMobService iAVMobService = c204594153w.LIZLLL;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("api_type", "music_list");
                    c2344009Gk.LIZLLL(jLIZIZ, "duration");
                    c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "favorite");
                    c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                    c2344009Gk.LJIIIIZZ("error_domain", C12NI.LIZ);
                    c2344009Gk.LIZJ(-1, "error_code");
                    c2344009Gk.LIZJ(0, "count");
                    iAVMobService.onEventV3("tool_performance_api", c2344009Gk.LIZ);
                } else if (c15o7.LJIILJJIL()) {
                    CollectedMusicList collectedMusicList = (CollectedMusicList) c15o7.LJIIL();
                    IAVMobService iAVMobService2 = c204594153w.LIZLLL;
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("api_type", "music_list");
                    c2344009Gk2.LIZLLL(jLIZIZ, "duration");
                    c2344009Gk2.LJIIIIZZ(Scene.SCENE_SERVICE, "favorite");
                    c2344009Gk2.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                    if (collectedMusicList.getItems() != null) {
                        size = collectedMusicList.getItems().size();
                    } else {
                        size = 0;
                    }
                    c2344009Gk2.LIZJ(size, "count");
                    iAVMobService2.onEventV3("tool_performance_api", c2344009Gk2.LIZ);
                    C20449014zw c20449014zw = new C20449014zw();
                    List<MusicModel> listLIZIZ = C15J0.LIZIZ(collectedMusicList.getItems(), collectedMusicList.extra);
                    c20449014zw.LIZ.put("refresh_status_user_collected_music", (V) 0);
                    c20449014zw.LIZ.put("list_cursor", (V) Integer.valueOf(collectedMusicList.getCursor()));
                    c20449014zw.LIZ.put("list_hasmore", (V) Integer.valueOf(collectedMusicList.getHasMore()));
                    c20449014zw.LIZIZ("action_type", 1);
                    C20448514zr.LIZLLL(c20449014zw, listLIZIZ);
                    if (z2) {
                        C20499015Jc c20499015Jc = c204594153w.LJFF;
                        if (c20499015Jc != null) {
                            c20499015Jc.cancel();
                        }
                        C20499015Jc c20499015Jc2 = new C20499015Jc(10, c204594153w.LIZJ, listLIZIZ);
                        c204594153w.LJFF = c20499015Jc2;
                        c20499015Jc2.load();
                    }
                    c204594153w.LIZIZ.zQ2(c20449014zw, "user_collected_music_list");
                }
                C1C7U.LIZIZ("ChooseMusicModel@8dbe.refreshUserCollectedMusicList$1L");
                return null;
            }
        }, executor, null);
    }

    public static void LIZLLL(Challenge challenge, List list, MusicPickResponse musicPickResponse) {
        List<Music> connectMusics = challenge.getConnectMusics();
        if (!connectMusics.isEmpty()) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(new C20448614zs(904, null, null, new C204596153y(null, null, challenge)));
            ArrayList<MusicModel> arrayList2 = (ArrayList) C15J0.LIZIZ(connectMusics, musicPickResponse.extra);
            int i = 0;
            for (MusicModel musicModel : arrayList2) {
                musicModel.setEventPosition(i);
                musicModel.setIsPropOrChallenge(true);
                i++;
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new C20448614zs(905, (MusicModel) it2.next(), 12));
            }
            arrayList.addAll(arrayList3);
        }
    }

    public final void LIZ(final MusicModel musicModel, final String str, final int i, final int i2, final int i3) {
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIIZI(musicModel, i).LJ(new InterfaceC2385309Wh() { // from class: X.155T
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                boolean z;
                MusicModel.CollectionType collectionType;
                MusicModel.CollectionType collectionType2;
                C204594153w c204594153w = this.LIZ;
                MusicModel musicModel2 = musicModel;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                String str2 = str;
                c204594153w.getClass();
                C1C7U.LIZ("ChooseMusicModel@8dbe.collectMusic$1L");
                if (c15o7.LJIILIIL()) {
                    C1C7U.LIZIZ("ChooseMusicModel@8dbe.collectMusic$1L");
                    return null;
                }
                boolean z2 = true;
                if (c15o7.LJIILL()) {
                    if (i4 == 1) {
                        collectionType2 = MusicModel.CollectionType.NOT_COLLECTED;
                    } else {
                        collectionType2 = MusicModel.CollectionType.COLLECTED;
                    }
                    musicModel2.setCollectionType(collectionType2);
                    c204594153w.LIZIZ.zQ2(new C20493315Gx(1, i4, i5, i6, musicModel2), "music_collect_status");
                } else if (c15o7.LJIILJJIL()) {
                    if (i4 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1440005kM.LIZ(new C155V(musicModel2, z));
                    for (MusicModel musicModel3 : musicModel2.getMergedMusicList()) {
                        if (i4 == 1) {
                            collectionType = MusicModel.CollectionType.COLLECTED;
                        } else {
                            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                        }
                        musicModel3.setCollectionType(collectionType);
                    }
                    C155U c155uLJIJJLI = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJLI();
                    if (c155uLJIJJLI != null) {
                        if (i4 != 1) {
                            z2 = false;
                        }
                        c155uLJIJJLI.LLZIL(str2, z2);
                    }
                    c204594153w.LIZIZ.zQ2(new C20493315Gx(0, i4, i5, i6, musicModel2), "music_collect_status");
                }
                C1C7U.LIZIZ("ChooseMusicModel@8dbe.collectMusic$1L");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public final void LJ(List<Music> list, List<C20448614zs> list2, MusicPickResponse musicPickResponse, boolean z, boolean z2) {
        int i;
        if (!list.isEmpty()) {
            if (((Boolean) this.LIZIZ.get("is_photo_mv_type")).booleanValue()) {
                i = 2131845825;
            } else if (((Boolean) this.LIZIZ.get("mvtheme_music_type")).booleanValue()) {
                i = 2131845817;
            } else if (z) {
                i = 2131839041;
            } else {
                i = 2131848640;
            }
            ArrayList arrayList = (ArrayList) list2;
            arrayList.add(new C20448614zs(902, null, null, new C204596153y(Integer.valueOf(i), (UrlModel) this.LIZIZ.get("effect_icon_url"), null)));
            ArrayList<MusicModel> arrayList2 = (ArrayList) C15J0.LIZJ(list, null, musicPickResponse.extra, musicPickResponse.fromRecommend);
            int i2 = 0;
            for (MusicModel musicModel : arrayList2) {
                musicModel.setEventPosition(i2);
                musicModel.setIsPropOrChallenge(true);
                i2++;
            }
            if (z2) {
                if (list.size() <= 2) {
                    arrayList.addAll(C20448514zr.LJFF(arrayList2));
                    return;
                } else {
                    arrayList.addAll(C20448514zr.LJFF(arrayList2.subList(0, 2)));
                    return;
                }
            }
            arrayList.addAll(C20448514zr.LJFF(arrayList2));
            return;
        }
        this.LIZIZ.zQ2(Boolean.FALSE, "is_busi_sticker");
    }

    public final void LIZIZ(C15O7<MusicPickResponse> c15o7, final String str, final boolean z, final Music music, final boolean z2, boolean z3) {
        InterfaceC2385309Wh interfaceC2385309Wh;
        InterfaceC2385309Wh interfaceC2385309Wh2;
        if (C1911780zqi.LIZJ(z3)) {
            InterfaceC2385309Wh<MusicPickResponse, TContinuationResult> interfaceC2385309Wh3 = new InterfaceC2385309Wh() { // from class: X.153s
                /* JADX WARN: Removed duplicated region for block: B:109:0x0293  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0192  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x022a  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC2385309Wh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object then(X.C15O7 r20) {
                    /*
                        Method dump skipped, instruction units count: 786
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C204590153s.then(X.15O7):java.lang.Object");
                }
            };
            if (C20510015Ni.LIZ.LJ() > 0) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                interfaceC2385309Wh2 = new InterfaceC2385309Wh() { // from class: X.153u
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o72) {
                        C204594153w c204594153w = this.LIZ;
                        long j = jCurrentTimeMillis;
                        c204594153w.getClass();
                        C1C7U.LIZ("ChooseMusicModel@8dbe.doWithMusicPickResponseInNewType$2L");
                        if (c15o72.LJIILL()) {
                            long jLJ = C20510015Ni.LIZ.LJ() - (System.currentTimeMillis() - j);
                            if (jLJ > 0) {
                                C15O7.LJIIIIZZ(jLJ).LJIJJLI();
                                C1627000sRO.LIZIZ(c204594153w.LIZJ, true);
                            }
                        }
                        C1C7U.LIZIZ("ChooseMusicModel@8dbe.doWithMusicPickResponseInNewType$2L");
                        return c15o72;
                    }
                };
            } else {
                interfaceC2385309Wh2 = null;
            }
            if (music == null && Looper.myLooper() == Looper.getMainLooper()) {
                if (interfaceC2385309Wh2 != null) {
                    c15o7.LJII(interfaceC2385309Wh2, C15O7.LJI).LJ(interfaceC2385309Wh3, C15O7.LJIIIIZZ, null);
                    return;
                } else {
                    c15o7.LIZLLL(interfaceC2385309Wh3);
                    return;
                }
            }
            if (interfaceC2385309Wh2 != null) {
                LJIIIZ(c15o7, music).LJII(interfaceC2385309Wh2, C15O7.LJI).LJ(interfaceC2385309Wh3, C15O7.LJIIIIZZ, null);
                return;
            } else {
                LJIIIZ(c15o7, music).LJ(interfaceC2385309Wh3, C15O7.LJIIIIZZ, null);
                return;
            }
        }
        InterfaceC2385309Wh<MusicPickResponse, TContinuationResult> interfaceC2385309Wh4 = new InterfaceC2385309Wh() { // from class: X.153t
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o72) {
                int i;
                List<Music> list;
                C204594153w c204594153w = this.LIZ;
                boolean z4 = z;
                String str2 = str;
                Music music2 = music;
                boolean z5 = z2;
                c204594153w.getClass();
                C1C7U.LIZ("ChooseMusicModel@8dbe.doWithMusicPickResponseTask$1L");
                if (c15o72.LJIILIIL()) {
                    C1C7U.LIZIZ("ChooseMusicModel@8dbe.doWithMusicPickResponseTask$1L");
                    return null;
                }
                if (c15o72.LJIILL()) {
                    if (!z4) {
                        C204594153w.LJIIIIZZ(null, false);
                        c204594153w.LIZIZ.zQ2(1, "pick_status");
                    } else {
                        c204594153w.LIZIZ.zQ2(1, "status_pick_load_more");
                    }
                    if (C20510015Ni.LIZ.LJ() > 0) {
                        C1627000sRO.LIZIZ(c204594153w.LIZJ, true);
                    }
                } else if (c15o72.LJIILJJIL()) {
                    MusicPickResponse musicPickResponse = (MusicPickResponse) c15o72.LJIIL();
                    if (!z4) {
                        C204594153w.LJIIIIZZ(musicPickResponse.musicList, true);
                        if (z5) {
                            C20496415Ic.LIZ.getClass();
                            C20496415Ic.LIZIZ.clear();
                            C20496415Ic.LIZ().erase("music_pick_discover");
                        }
                        ArrayList arrayList = new ArrayList();
                        c204594153w.LIZIZ.zQ2(musicPickResponse.bannerList, "data_banner");
                        MusicCollectionItem musicCollectionItem = new MusicCollectionItem();
                        musicCollectionItem.mcId = "recommend_mc_id";
                        Context context = c204594153w.LIZJ;
                        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ()) {
                            i = 2131837789;
                        } else {
                            i = 2131845823;
                        }
                        musicCollectionItem.mcName = context.getString(i);
                        List<MusicModel> listLIZJ = C15J0.LIZJ(musicPickResponse.musicList, c204594153w.LJI(musicPickResponse), musicPickResponse.extra, musicPickResponse.fromRecommend);
                        if (listLIZJ != null) {
                            Iterator it2 = ((ArrayList) listLIZJ).iterator();
                            while (it2.hasNext()) {
                                ((MusicModel) it2.next()).setNeedRecordConsumption(true);
                            }
                        }
                        arrayList.add(new C20448914zv(listLIZJ, musicCollectionItem, 1));
                        arrayList.add(new C20448714zt(musicPickResponse.musicCollectionList));
                        c204594153w.LIZIZ.zQ2(Integer.valueOf(musicPickResponse.radioCursor), "radio_cursor");
                        c204594153w.LIZIZ.zQ2(Boolean.valueOf(musicPickResponse.LJ()), "show_music_radio");
                        if (str2 != null && (list = musicPickResponse.extraMusicList) != null && list.size() > 0) {
                            if (!C204594153w.LJII(musicPickResponse.extraMusicList).isEmpty()) {
                                c204594153w.LIZIZ.zQ2(Boolean.FALSE, "data_sticker_music_from_video");
                                c204594153w.LIZIZ.zQ2(C204594153w.LJII(musicPickResponse.extraMusicList), "data_sticker");
                            } else {
                                c204594153w.LIZIZ.zQ2(Boolean.FALSE, "is_busi_sticker");
                            }
                        } else if (music2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(music2);
                            if (!C204594153w.LJII(arrayList2).isEmpty()) {
                                c204594153w.LIZIZ.zQ2(Boolean.TRUE, "data_sticker_music_from_video");
                                c204594153w.LIZIZ.zQ2(C204594153w.LJII(arrayList2), "data_sticker");
                            } else {
                                c204594153w.LIZIZ.zQ2(Boolean.FALSE, "is_busi_sticker");
                            }
                        }
                        c204594153w.LIZIZ.zQ2(arrayList, "list");
                        c204594153w.LIZIZ.zQ2(0, "pick_status");
                        c204594153w.LIZIZ.zQ2(music2, "selected_music");
                    } else {
                        c204594153w.LIZIZ.zQ2(C15J0.LIZJ(musicPickResponse.musicList, c204594153w.LJI(musicPickResponse), musicPickResponse.extra, musicPickResponse.fromRecommend), "pick_list_more");
                        c204594153w.LIZIZ.zQ2(Integer.valueOf(musicPickResponse.radioCursor), "radio_cursor");
                    }
                }
                C1C7U.LIZIZ("ChooseMusicModel@8dbe.doWithMusicPickResponseTask$1L");
                return null;
            }
        };
        if (C20510015Ni.LIZ.LJ() > 0) {
            final long jCurrentTimeMillis2 = System.currentTimeMillis();
            interfaceC2385309Wh = new InterfaceC2385309Wh() { // from class: X.153v
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o72) {
                    long j = jCurrentTimeMillis2;
                    C1C7U.LIZ("ChooseMusicModel@8dbe.doWithMusicPickResponseTask$2L");
                    if (c15o72.LJIILL()) {
                        long jLJ = C20510015Ni.LIZ.LJ() - (System.currentTimeMillis() - j);
                        if (jLJ > 0) {
                            C15O7.LJIIIIZZ(jLJ).LJIJJLI();
                        }
                    }
                    C1C7U.LIZIZ("ChooseMusicModel@8dbe.doWithMusicPickResponseTask$2L");
                    return c15o72;
                }
            };
        } else {
            interfaceC2385309Wh = null;
        }
        if (music == null && Looper.myLooper() == Looper.getMainLooper()) {
            if (interfaceC2385309Wh != null) {
                c15o7.LJII(interfaceC2385309Wh, C15O7.LJI).LJ(interfaceC2385309Wh4, C15O7.LJIIIIZZ, null);
                return;
            } else {
                c15o7.LIZLLL(interfaceC2385309Wh4);
                return;
            }
        }
        if (interfaceC2385309Wh != null) {
            LJIIIZ(c15o7, music).LJII(interfaceC2385309Wh, C15O7.LJI).LJ(interfaceC2385309Wh4, C15O7.LJIIIIZZ, null);
        } else {
            LJIIIZ(c15o7, music).LJ(interfaceC2385309Wh4, C15O7.LJIIIIZZ, null);
        }
    }

    public final void LIZJ(boolean z, String str, Music music, boolean z2, int i, boolean z3, Map<String, Object> map) {
        Integer num;
        int iIntValue;
        int iHashCode;
        int iHashCode2;
        Pair pair;
        boolean zLJI = MethodIDManager.LJI(137219);
        Integer num2 = (Integer) this.LIZIZ.get("radio_cursor", 0);
        String strLIZ = C20325814g4.LIZ();
        if (C1911780zqi.LIZJ(z3)) {
            num = 24;
        } else {
            num = null;
        }
        C20496415Ic.LIZ.getClass();
        String string = C20496415Ic.LIZ().getString("music_pick_discover", "");
        if (!ChooseMusicApi.LIZLLL()) {
            if (num2 == null) {
                iIntValue = 0;
            } else {
                iIntValue = num2.intValue();
            }
            IMusicRequestParam iMusicRequestParamLJFF = LJFF(i, map);
            boolean unlimitedOnly = iMusicRequestParamLJFF.getUnlimitedOnly();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("music/pick ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(' ');
            sbLIZ.append(num);
            sbLIZ.append(' ');
            if (str != null) {
                iHashCode = str.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(' ');
            sbLIZ.append(i);
            sbLIZ.append(' ');
            if (strLIZ != null) {
                iHashCode2 = strLIZ.hashCode();
            } else {
                iHashCode2 = 0;
            }
            sbLIZ.append(iHashCode2);
            sbLIZ.append(' ');
            sbLIZ.append(unlimitedOnly);
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!z2 && !iMusicRequestParamLJFF.getDisableCache()) {
                Object objLIZ = AnonymousClass1541.LIZ(strLIZIZ);
                if (objLIZ instanceof MusicPickResponse) {
                    C588310N5p.LIZ.getClass();
                    C588310N5p.LIZ(1, "music_pick");
                    pair = new Pair(C15O7.LJIIJ(objLIZ), Boolean.TRUE);
                    LIZIZ((C15O7) pair.getFirst(), str, z, music, !((Boolean) pair.getSecond()).booleanValue(), z3);
                } else {
                    C588310N5p.LIZ.getClass();
                    C588310N5p.LIZ(0, "music_pick");
                    pair = new Pair(ChooseMusicApi.LJI(Integer.valueOf(iIntValue), num, str, z2, i, strLIZ, string, iMusicRequestParamLJFF).LJI(new InterfaceC2385309Wh() { // from class: X.153x
                        @Override // X.InterfaceC2385309Wh
                        public final Object then(C15O7 c15o7) {
                            C1C7U.LIZ("SoftCacheHooker@dd70.hookMusicPickTask$1");
                            if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null) {
                                AnonymousClass1541.LIZIZ(c15o7.LJIIL(), strLIZIZ);
                            }
                            C1C7U.LIZIZ("SoftCacheHooker@dd70.hookMusicPickTask$1");
                            return c15o7;
                        }
                    }), Boolean.FALSE);
                    LIZIZ((C15O7) pair.getFirst(), str, z, music, !((Boolean) pair.getSecond()).booleanValue(), z3);
                }
            } else {
                pair = new Pair(ChooseMusicApi.LJI(Integer.valueOf(iIntValue), num, str, z2, i, strLIZ, string, iMusicRequestParamLJFF).LJI(new InterfaceC2385309Wh() { // from class: X.153x
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C1C7U.LIZ("SoftCacheHooker@dd70.hookMusicPickTask$1");
                        if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null) {
                            AnonymousClass1541.LIZIZ(c15o7.LJIIL(), strLIZIZ);
                        }
                        C1C7U.LIZIZ("SoftCacheHooker@dd70.hookMusicPickTask$1");
                        return c15o7;
                    }
                }), Boolean.FALSE);
                LIZIZ((C15O7) pair.getFirst(), str, z, music, !((Boolean) pair.getSecond()).booleanValue(), z3);
            }
        } else {
            LIZIZ(ChooseMusicApi.LJI(num2, num, str, z2, i, strLIZ, string, LJFF(i, map)), str, z, music, false, z3);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
