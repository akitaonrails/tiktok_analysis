package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.ab.ArtistCertiflowConfig;
import com.ss.android.ugc.aweme.music.ab.MusicNetworkMonitorConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.monitor.MusicTabInterceptor;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632050Oqh {
    public static final String LIZJ(User user) {
        MusicTabClaimInfo musicTabClaimInfo;
        String string;
        if (user.getShowArtistPlaylist() == 1) {
            return ClaimStatus.APPROVED.toString();
        }
        MusicTabInfo musicTabInfo = user.getMusicTabInfo();
        if (musicTabInfo != null && (musicTabClaimInfo = musicTabInfo.musicTabClaimInfo) != null && (string = Integer.valueOf(musicTabClaimInfo.status).toString()) != null) {
            return string;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final boolean LJFF(User user) {
        MusicTabInfo musicTabInfo;
        MusicTabInfo musicTabInfo2;
        MusicTabInfo musicTabInfo3;
        MusicTabClaimInfo musicTabClaimInfo;
        C632210Oqx.LIZ.getClass();
        if (!C632210Oqx.LJIIIZ() || !C632210Oqx.LJII() || user.getShowArtistPlaylist() != 0 || (musicTabInfo = user.getMusicTabInfo()) == null || !musicTabInfo.showGhostMusicTab || (musicTabInfo2 = user.getMusicTabInfo()) == null || musicTabInfo2.musicTabClaimInfo == null || (((musicTabInfo3 = user.getMusicTabInfo()) != null && (musicTabClaimInfo = musicTabInfo3.musicTabClaimInfo) != null && musicTabClaimInfo.status == ClaimStatus.UNCLAIMED.getValue()) || !Keva.getRepo("repo_profile_music").getBoolean("key_show_claim_status_tab", true))) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(User user) {
        boolean zLJIIIZ = LJIIIZ(user);
        boolean zLJFF = LJFF(user);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showGhostMusicTab showUnclaimedStatusGhostMusicTab:");
        sbLIZ.append(zLJIIIZ);
        sbLIZ.append(", showClaimingStatusGhostMusicTab:");
        sbLIZ.append(zLJFF);
        C1720106oR.LJI("music_biz", C2188811AlT.LIZIZ(sbLIZ));
        if (!zLJIIIZ && !zLJFF) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(User user) {
        boolean z;
        int iLIZ = C632070Oqj.LIZ(user.getSecUid());
        C01GW c01gw = C632060Oqi.LIZIZ;
        if (iLIZ < ((ArtistCertiflowConfig) c01gw.getValue()).musicTabBannerShowTimes && !C632070Oqj.LIZIZ().getBoolean("key_music_sound_on_banner_closed", false)) {
            z = true;
        } else {
            z = false;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showMusicTabBanner certBannerShownCount:");
        sbLIZ.append(C632070Oqj.LIZ(user.getSecUid()));
        sbLIZ.append(", musicTabBannerShowTimes:");
        sbLIZ.append(((ArtistCertiflowConfig) c01gw.getValue()).musicTabBannerShowTimes);
        sbLIZ.append(",hasSoundOnBannerClosed:");
        sbLIZ.append(C632070Oqj.LIZIZ().getBoolean("key_music_sound_on_banner_closed", false));
        C1720106oR.LJI("music_biz", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("showUnclaimedStatusMusicTabBanner notChildrenMode:");
        C632210Oqx.LIZ.getClass();
        sbLIZ2.append(C632210Oqx.LJIIIZ());
        sbLIZ2.append(",isLogin:");
        sbLIZ2.append(C632210Oqx.LJII());
        sbLIZ2.append(",isAccuratePrivateAccount:");
        sbLIZ2.append(user.isAccuratePrivateAccount());
        sbLIZ2.append(",MusicArtistCertificationExp:");
        sbLIZ2.append(C613560O4s.LIZ());
        sbLIZ2.append(",showArtistPlaylist:");
        sbLIZ2.append(user.getShowArtistPlaylist());
        sbLIZ2.append(",musicTabInfo:");
        sbLIZ2.append(user.getMusicTabInfo());
        sbLIZ2.append(",MusicArtistCertificationSettings:");
        sbLIZ2.append(C632410OrH.LIZJ());
        C1720106oR.LJI("music_biz", C2188811AlT.LIZIZ(sbLIZ2));
        if (((!C632210Oqx.LJIIIZ() || !C632210Oqx.LJII() || user.isAccuratePrivateAccount() || !C613560O4s.LIZ() || user.getShowArtistPlaylist() != 0) && !LJFF(user)) || !z) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(User user) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showOriginMusicTab showArtistPlaylist:");
        sbLIZ.append(user.getShowArtistPlaylist());
        C1720106oR.LJI("music_biz", C2188811AlT.LIZIZ(sbLIZ));
        if (user.getShowArtistPlaylist() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(User user) {
        MusicTabInfo musicTabInfo;
        MusicTabInfo musicTabInfo2;
        MusicTabClaimInfo musicTabClaimInfo;
        C632210Oqx.LIZ.getClass();
        if (!C632210Oqx.LJIIIZ() || !C632210Oqx.LJII() || user.getShowArtistPlaylist() != 0 || (musicTabInfo = user.getMusicTabInfo()) == null || !musicTabInfo.showGhostMusicTab) {
            return false;
        }
        MusicTabInfo musicTabInfo3 = user.getMusicTabInfo();
        if (musicTabInfo3 != null && musicTabInfo3.musicTabClaimInfo != null && ((musicTabInfo2 = user.getMusicTabInfo()) == null || (musicTabClaimInfo = musicTabInfo2.musicTabClaimInfo) == null || musicTabClaimInfo.status != ClaimStatus.UNCLAIMED.getValue())) {
            return false;
        }
        String secUid = user.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        Keva kevaLIZIZ = C632070Oqj.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_ghost_entrance_closed");
        sbLIZ.append(secUid);
        if (kevaLIZIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false) || C632070Oqj.LIZJ(user.getSecUid()) >= ((ArtistCertiflowConfig) C632060Oqi.LIZIZ.getValue()).ghostEntranceShowTimes) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(MusicGroup musicGroup, String str) {
        String idStr;
        if (str == null) {
            return false;
        }
        Music sourceMusic = musicGroup.getSourceMusic();
        if (sourceMusic != null) {
            idStr = sourceMusic.getIdStr();
        } else {
            idStr = null;
        }
        if (!Intrinsics.LJFF(idStr, str)) {
            List<Music> similarMusics = musicGroup.getSimilarMusics();
            if (similarMusics == null) {
                return false;
            }
            Iterator<Music> it2 = similarMusics.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getIdStr(), str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final MusicGroup LIZIZ(String str, List list) {
        Object idStr;
        Object next;
        Iterator it2 = list.iterator();
        loop0: while (true) {
            idStr = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            MusicGroup musicGroup = (MusicGroup) next;
            Music sourceMusic = musicGroup.getSourceMusic();
            if (sourceMusic != null) {
                idStr = sourceMusic.getIdStr();
            }
            if (Intrinsics.LJFF(idStr, str)) {
                break;
            }
            List<Music> similarMusics = musicGroup.getSimilarMusics();
            if (similarMusics != null) {
                Iterator<Music> it3 = similarMusics.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(it3.next().getIdStr(), str)) {
                        break loop0;
                    }
                }
            }
        }
        idStr = next;
        return (MusicGroup) idStr;
    }

    public static final <D extends InterfaceC613710O5h> InterfaceC346201Wa<C0O7A<D>> LIZLLL(C613960O6g<D> c613960O6g, final String str, final Map<String, String> map) {
        if (!((MusicNetworkMonitorConfig) C632110Oqn.LIZIZ.getValue()).getNetworkLogEnable()) {
            return c613960O6g.LIZIZ();
        }
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis();
        C0O7F.LJI(c613960O6g, new C0O3U() { // from class: X.0O57
            @Override // X.C0O3U
            public final <T> T create(Class<T> cls) {
                C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C458701qT.LIZ);
                c1499850p8JCreateBuilder.LIZ(new MusicTabInterceptor());
                return (T) c1499850p8JCreateBuilder.build().retrofit.LIZ(cls);
            }
        });
        final C2325381G0q c2325381G0q = new C2325381G0q(c613960O6g.LIZIZ(), new C613570O4t(c238400w2, null), 2);
        return (InterfaceC346201Wa<C0O7A<D>>) new InterfaceC346201Wa<C0O7A<D>>() { // from class: X.0ODT
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = c2325381G0q.collect(new C0ODS(interfaceC346701Wf, str, c238400w2, map), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        };
    }

    public static final List<C632090Oql> LJIIJ(MusicGroup musicGroup, Boolean bool, Integer num) {
        boolean z;
        boolean z2;
        boolean zBooleanValue;
        List<Music> similarMusics = musicGroup.getSimilarMusics();
        if (similarMusics == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(similarMusics, 10));
        int i = 0;
        for (Music music : similarMusics) {
            int i2 = i + 1;
            if (i >= 0) {
                MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == similarMusics.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                arrayList.add(new C632090Oql(musicModelConvertToMusicModel, new C631940OqW(EnumC631610Opz.DISABLE_PINNED, false, true, 0, false, z, z2, false, zBooleanValue, Integer.valueOf(i2), num, false, null)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static final C632090Oql LJ(MusicGroup musicGroup, EnumC631610Opz enumC631610Opz, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, List<? extends Aweme> list) {
        boolean zBooleanValue;
        int size;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        EnumC631610Opz enumC631610Opz2 = enumC631610Opz;
        Music sourceMusic = musicGroup.getSourceMusic();
        if (sourceMusic != null) {
            MusicModel musicModelConvertToMusicModel = sourceMusic.convertToMusicModel();
            if (enumC631610Opz2 == null) {
                enumC631610Opz2 = EnumC631610Opz.DISABLE_PINNED;
            }
            boolean zBooleanValue4 = false;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            List<Music> similarMusics = musicGroup.getSimilarMusics();
            if (similarMusics != null) {
                size = similarMusics.size();
            } else {
                size = 0;
            }
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            if (bool3 != null) {
                zBooleanValue3 = bool3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            if (bool4 != null) {
                zBooleanValue4 = bool4.booleanValue();
            }
            return new C632090Oql(musicModelConvertToMusicModel, new C631940OqW(enumC631610Opz2, zBooleanValue, false, size, zBooleanValue2, false, false, zBooleanValue3, false, null, num, zBooleanValue4, list));
        }
        return null;
    }

    public static C632090Oql LJIIL(MusicGroup musicGroup, EnumC631610Opz enumC631610Opz, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, List list, int i) {
        boolean zBooleanValue;
        int size;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        Boolean bool5 = bool3;
        Boolean bool6 = bool2;
        Boolean bool7 = bool;
        List list2 = list;
        Integer num2 = num;
        Boolean bool8 = bool4;
        EnumC631610Opz enumC631610Opz2 = enumC631610Opz;
        C632090Oql c632090Oql = null;
        if ((i & 1) != 0) {
            enumC631610Opz2 = null;
        }
        if ((i & 2) != 0) {
            bool7 = null;
        }
        if ((i & 4) != 0) {
            bool6 = null;
        }
        if ((i & 8) != 0) {
            bool5 = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            bool8 = null;
        }
        if ((i & 64) != 0) {
            list2 = null;
        }
        if (C0BVG.LIZ() && Intrinsics.LJFF(bool8, Boolean.TRUE)) {
            Music sourceMusic = musicGroup.getSourceMusic();
            if (sourceMusic != null) {
                final MusicModel musicModelConvertToMusicModel = sourceMusic.convertToMusicModel();
                if (enumC631610Opz2 == null) {
                    enumC631610Opz2 = EnumC631610Opz.DISABLE_PINNED;
                }
                boolean zBooleanValue4 = false;
                if (bool7 != null) {
                    zBooleanValue = bool7.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                List<Music> similarMusics = musicGroup.getSimilarMusics();
                if (similarMusics != null) {
                    size = similarMusics.size();
                } else {
                    size = 0;
                }
                if (bool6 != null) {
                    zBooleanValue2 = bool6.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                if (bool5 != null) {
                    zBooleanValue3 = bool5.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                if (bool8 != null) {
                    zBooleanValue4 = bool8.booleanValue();
                }
                final C631940OqW c631940OqW = new C631940OqW(enumC631610Opz2, zBooleanValue, false, size, zBooleanValue2, false, false, zBooleanValue3, false, null, num2, zBooleanValue4, list2);
                c632090Oql = new C632090Oql(musicModelConvertToMusicModel, c631940OqW) { // from class: X.0Oqk
                    public static final int $stable = 8;

                    @Override // X.C632090Oql
                    public int hashCode() {
                        return getMusicModel().getMusicId().hashCode();
                    }

                    @Override // X.C632090Oql, X.InterfaceC1891350zJl
                    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        if (interfaceC1891350zJl instanceof C632080Oqk) {
                            C632090Oql c632090Oql2 = (C632090Oql) interfaceC1891350zJl;
                            if (Intrinsics.LJFF(c632090Oql2.getMusicModel().getMusicId(), getMusicModel().getMusicId()) && c632090Oql2.getMusicModel().getCollectionType() == getMusicModel().getCollectionType() && c632090Oql2.getMusicModel().getPinnedVideoStatus() == getMusicModel().getPinnedVideoStatus() && Intrinsics.LJFF(c632090Oql2.getMusicItemModel(), getMusicItemModel()) && Intrinsics.LJFF(c632090Oql2.getMusicModel().getTT2DSPSongInfo(), getMusicModel().getTT2DSPSongInfo())) {
                                return true;
                            }
                            return false;
                        }
                        return super.areContentsTheSame(interfaceC1891350zJl);
                    }

                    @Override // X.C632090Oql, X.InterfaceC1891350zJl
                    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        if (interfaceC1891350zJl instanceof C632080Oqk) {
                            return Intrinsics.LJFF(((C632090Oql) interfaceC1891350zJl).getMusicModel().getMusicId(), getMusicModel().getMusicId());
                        }
                        return super.areItemTheSame(interfaceC1891350zJl);
                    }

                    @Override // X.C632090Oql
                    public boolean equals(Object obj) {
                        if (obj instanceof C632080Oqk) {
                            C632090Oql c632090Oql2 = (C632090Oql) obj;
                            if (Intrinsics.LJFF(c632090Oql2.getMusicModel().getMusicId(), getMusicModel().getMusicId()) && c632090Oql2.getMusicModel().getCollectionType() == getMusicModel().getCollectionType() && c632090Oql2.getMusicModel().getPinnedVideoStatus() == getMusicModel().getPinnedVideoStatus() && Intrinsics.LJFF(c632090Oql2.getMusicItemModel(), getMusicItemModel()) && Intrinsics.LJFF(c632090Oql2.getMusicModel().getTT2DSPSongInfo(), getMusicModel().getTT2DSPSongInfo())) {
                                return true;
                            }
                            return false;
                        }
                        return super.equals(obj);
                    }

                    @Override // X.C632090Oql, X.InterfaceC1891350zJl
                    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        if (interfaceC1891350zJl instanceof C632080Oqk) {
                            C632090Oql c632090Oql2 = (C632090Oql) interfaceC1891350zJl;
                            if (c632090Oql2.getMusicModel().getCollectionType() != getMusicModel().getCollectionType() || c632090Oql2.getMusicModel().getPinnedVideoStatus() != getMusicModel().getPinnedVideoStatus() || !Intrinsics.LJFF(c632090Oql2.getMusicModel().getTT2DSPSongInfo(), getMusicModel().getTT2DSPSongInfo()) || !Intrinsics.LJFF(c632090Oql2.getMusicItemModel(), getMusicItemModel())) {
                                c632090Oql2.getMusicItemModel();
                                getMusicItemModel();
                                c632090Oql2.getMusicModel().getCollectionType();
                                getMusicModel().getCollectionType();
                                c632090Oql2.getMusicModel().getPinnedVideoStatus();
                                getMusicModel().getPinnedVideoStatus();
                                c632090Oql2.getMusicItemModel().isHighlighted();
                                getMusicItemModel().isHighlighted();
                                c632090Oql2.getMusicItemModel();
                                getMusicItemModel();
                                c632090Oql2.getMusicItemModel().isSelected();
                                getMusicItemModel().isSelected();
                                Intrinsics.LJFF(c632090Oql2.getMusicModel().getTT2DSPSongInfo(), getMusicModel().getTT2DSPSongInfo());
                                c632090Oql2.getMusicItemModel().isSpotlighted();
                                getMusicItemModel().isSpotlighted();
                                return new C632100Oqm();
                            }
                        }
                        return super.getChangePayload(interfaceC1891350zJl);
                    }
                };
            }
            return c632090Oql;
        }
        return LJ(musicGroup, enumC631610Opz2, bool7, bool6, bool5, num2, bool8, list2);
    }
}
