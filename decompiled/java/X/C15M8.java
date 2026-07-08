package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15M8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC1294060jmO
public final class C15M8 extends AbstractC1050620dRk {
    public List<? extends MusicModel> LIZJ;
    public boolean LIZLLL;

    public C15M8() {
        super(0);
    }

    public final boolean LJIIJ() {
        return this.LIZLLL || ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1050620dRk
    public final Object LIZLLL(String str) {
        ArrayList arrayList;
        Boolean boolValueOf = null;
        switch (str.hashCode()) {
            case -1695837426:
                if (str.equals("banner_id")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    C15MA.LL.getClass();
                    C15M9 c15m9 = C15MA.LLILZLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
                    return c15m9.LIZ;
                }
                break;
            case -1087240833:
                if (str.equals("is_commercial")) {
                    return Integer.valueOf(LJIIJ() ? 1 : 0);
                }
                break;
            case -995502843:
                if (str.equals("is_promote_pa")) {
                    C15MA.LL.getClass();
                    C15M9 c15m92 = C15MA.LLJILLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C15MA.LLILLJJLI;
                    return Integer.valueOf(((Boolean) c15m92.LIZ).booleanValue() ? 1 : 0);
                }
                break;
            case -626204936:
                if (str.equals("commercial_banner_type")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    C15MA.LL.getClass();
                    C15M9 c15m93 = C15MA.LLIZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = C15MA.LLILLJJLI;
                    return c15m93.LIZ;
                }
                break;
            case -138948533:
                if (str.equals("meta_song_id")) {
                    Object obj = LJ().get(MusicModel.class);
                    if (obj != null) {
                        return ((MusicModel) obj).getMatchedSongInfo().getId();
                    }
                    throw new C1050650dRn(MusicModel.class);
                }
                break;
            case 3433103:
                if (str.equals("page")) {
                    C15MA c15ma = C15MA.LL;
                    c15ma.getClass();
                    if (C15MA.LIZIZ() instanceof C15MH) {
                        return "search";
                    }
                    if (C15MA.LIZJ()) {
                        return "UID recommendation playlist";
                    }
                    if (C15MA.LIZIZ() instanceof C15MI) {
                        return "music aggregation page";
                    }
                    C15MF c15mfLIZIZ = C15MA.LIZIZ();
                    if (c15mfLIZIZ instanceof C15ME) {
                        boolValueOf = Boolean.valueOf(((C15ME) c15mfLIZIZ).LIZ);
                    }
                    if (boolValueOf != null && boolValueOf.booleanValue()) {
                        return "vertical playlist";
                    }
                    C15MF c15mfLIZIZ2 = C15MA.LIZIZ();
                    if (c15mfLIZIZ2 != null && (c15mfLIZIZ2 instanceof C15MG) && c15ma.getInCommercialSoundPage()) {
                        return "CSP";
                    }
                    return "others";
                }
                break;
            case 280942408:
                if (str.equals("action_originated_from")) {
                    C15MA c15ma2 = C15MA.LL;
                    return C15MA.LIZ();
                }
                break;
            case 324669229:
                if (str.equals("commercial_music_category_id")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    C15MA.LL.getClass();
                    C15M9 c15m94 = C15MA.LLJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = C15MA.LLILLJJLI;
                    return c15m94.LIZ;
                }
                break;
            case 718205887:
                if (str.equals("rec_candidate_clip_id")) {
                    List<? extends MusicModel> list = this.LIZJ;
                    if (list != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<? extends MusicModel> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(it2.next().getId()));
                        }
                    } else {
                        Object obj2 = LJ().get(MusicDetail.class);
                        if (obj2 != null) {
                            List<Music> list2 = ((MusicDetail) obj2).recommendMusicList;
                            if (list2 == null) {
                                return null;
                            }
                            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            Iterator<Music> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(Long.valueOf(it3.next().getId()));
                            }
                        } else {
                            throw new C1050650dRn(MusicDetail.class);
                        }
                    }
                    return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                }
                break;
            case 860900458:
                if (str.equals("clip_id")) {
                    Object obj3 = LJ().get(MusicModel.class);
                    if (obj3 != null) {
                        return Long.valueOf(((MusicModel) obj3).getId());
                    }
                    throw new C1050650dRn(MusicModel.class);
                }
                break;
            case 1182307367:
                if (str.equals("commercial_music_suggestion_id")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    C15MA.LL.getClass();
                    C15M9 c15m95 = C15MA.LLIZLLLIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr5 = C15MA.LLILLJJLI;
                    return c15m95.LIZ;
                }
                break;
            case 1886538192:
                if (str.equals("commercial_music_playlist_order")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    C15MA.LL.getClass();
                    C15M9 c15m96 = C15MA.LLJIJIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr6 = C15MA.LLILLJJLI;
                    return c15m96.LIZ;
                }
                break;
        }
        throw new C1050630dRl(str);
    }

    public final void LJIIJJI(long j) {
        C15MA c15ma = C15MA.LL;
        c15ma.getClass();
        if ((C15MA.LIZIZ() instanceof C15MI) || c15ma.getInCommercialSoundPage()) {
            LJI("commercial_music_play_load_time", new Pair<>("page", C1839150xxZ.LIZ), new Pair<>("commercial_music_load_time", Long.valueOf(j)));
        }
    }
}
