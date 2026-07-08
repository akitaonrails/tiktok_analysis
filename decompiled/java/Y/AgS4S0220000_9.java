package Y;

import X.C0O78;
import X.C0O79;
import X.C0O7A;
import X.C0O7F;
import X.C0OG8;
import X.C0OGD;
import X.C1401100mZ2;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2286608xc;
import X.C615690OCx;
import X.EnumC614130O6x;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class AgS4S0220000_9 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS4S0220000_9 agS4S0220000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String musicName;
        String idStr;
        Integer numLJ;
        Boolean boolValueOf;
        Music music;
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            C0O79 c0o79 = (C0O79) c0o7a;
            MusicDetail musicDetail = ((C0OG8) c0o79.LJ).LIZ;
            if (musicDetail != null) {
                boolean z = agS4S0220000_9.z2;
                boolean z2 = agS4S0220000_9.z3;
                MusicDetailViewModel musicDetailViewModel = (MusicDetailViewModel) agS4S0220000_9.l0;
                Context context = (Context) agS4S0220000_9.l1;
                if (C0O7F.LIZJ(c0o79.LIZJ) == EnumC614130O6x.Net && (music = musicDetail.music) != null) {
                    if (!z && z2) {
                        Map<Integer, Integer> map = MusicDetailViewModel.LLJJLIIIJLLLLLLLZ;
                        musicDetailViewModel.yQ2(music, context, false);
                    }
                    Music music2 = musicDetail.music;
                    if (music2 != null) {
                        musicDetailViewModel.getClass();
                        MusicDetailViewModel.xQ2(music2);
                        C20684815ws.LJIJI("music_detail_trace", new Pair("music_net_resp", "stage"), new Pair(C2286608xc.LJFF(SystemClock.elapsedRealtime() - musicDetailViewModel.LLJILJIL), "duration"));
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                musicDetail.localCoverUrl = musicDetailViewModel.LLILLJJLI;
                C1401100mZ2 c1401100mZ2 = C1401100mZ2.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request_music_detail-->musicName:");
                Music music3 = musicDetail.music;
                String imprId = null;
                if (music3 != null) {
                    musicName = music3.getMusicName();
                } else {
                    musicName = null;
                }
                sbLIZ.append(musicName);
                sbLIZ.append(" music_id:");
                Music music4 = musicDetail.music;
                if (music4 != null) {
                    idStr = music4.getIdStr();
                } else {
                    idStr = null;
                }
                sbLIZ.append(idStr);
                sbLIZ.append(" music_status:");
                Music music5 = musicDetail.music;
                if (music5 != null) {
                    numLJ = C2286608xc.LJ(music5.getMusicStatus());
                } else {
                    numLJ = null;
                }
                sbLIZ.append(numLJ);
                sbLIZ.append(" available:");
                Music music6 = musicDetail.music;
                if (music6 != null) {
                    boolValueOf = Boolean.valueOf(music6.available());
                } else {
                    boolValueOf = null;
                }
                sbLIZ.append(boolValueOf);
                sbLIZ.append(" logId:");
                LogPbBean logPbBean = musicDetail.logPb;
                if (logPbBean != null) {
                    imprId = logPbBean.getImprId();
                }
                sbLIZ.append(imprId);
                C201955140j.LJIILJJIL(c1401100mZ2, C2188811AlT.LIZIZ(sbLIZ));
                musicDetailViewModel.setState(new AwS588S0100000_9(musicDetail, 339));
            }
        } else if (c0o7a instanceof C0O78) {
            ((MusicDetailViewModel) agS4S0220000_9.l0).setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 340));
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS4S0220000_9 agS4S0220000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String musicName;
        String idStr;
        Integer numLJ;
        Boolean boolValueOf;
        Music music;
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            C0O79 c0o79 = (C0O79) c0o7a;
            MusicDetail musicDetail = ((C0OGD) c0o79.LJ).LIZ;
            if (musicDetail != null) {
                MusicDetailViewModel musicDetailViewModel = (MusicDetailViewModel) agS4S0220000_9.l0;
                boolean z = agS4S0220000_9.z2;
                boolean z2 = agS4S0220000_9.z3;
                Context context = (Context) agS4S0220000_9.l1;
                if (C0O7F.LIZJ(c0o79.LIZJ) == EnumC614130O6x.Net && (music = musicDetail.music) != null) {
                    musicDetailViewModel.getClass();
                    MusicDetailViewModel.xQ2(music);
                    C20684815ws.LJIJI("music_detail_trace", new Pair("music_net_resp", "stage"), new Pair(C2286608xc.LJFF(SystemClock.elapsedRealtime() - musicDetailViewModel.LLJILJIL), "duration"));
                }
                if (!z && z2) {
                    Music music2 = musicDetail.music;
                    Map<Integer, Integer> map = MusicDetailViewModel.LLJJLIIIJLLLLLLLZ;
                    musicDetailViewModel.yQ2(music2, context, false);
                }
                C1401100mZ2 c1401100mZ2 = C1401100mZ2.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request_music_detail-->musicName:");
                Music music3 = musicDetail.music;
                String imprId = null;
                if (music3 != null) {
                    musicName = music3.getMusicName();
                } else {
                    musicName = null;
                }
                sbLIZ.append(musicName);
                sbLIZ.append(" music_id:");
                Music music4 = musicDetail.music;
                if (music4 != null) {
                    idStr = music4.getIdStr();
                } else {
                    idStr = null;
                }
                sbLIZ.append(idStr);
                sbLIZ.append(" music_status:");
                Music music5 = musicDetail.music;
                if (music5 != null) {
                    numLJ = C2286608xc.LJ(music5.getMusicStatus());
                } else {
                    numLJ = null;
                }
                sbLIZ.append(numLJ);
                sbLIZ.append(" available:");
                Music music6 = musicDetail.music;
                if (music6 != null) {
                    boolValueOf = Boolean.valueOf(music6.available());
                } else {
                    boolValueOf = null;
                }
                sbLIZ.append(boolValueOf);
                sbLIZ.append(" logId:");
                LogPbBean logPbBean = musicDetail.logPb;
                if (logPbBean != null) {
                    imprId = logPbBean.getImprId();
                }
                sbLIZ.append(imprId);
                C201955140j.LJIILJJIL(c1401100mZ2, C2188811AlT.LIZIZ(sbLIZ));
                musicDetailViewModel.setState(new AwS588S0100000_9(musicDetail, 583));
            }
        } else if (c0o7a instanceof C0O78) {
            ((MusicDetailViewModel) agS4S0220000_9.l0).setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 584));
        }
        return Unit.LIZ;
    }

    public AgS4S0220000_9(MusicDetailViewModel musicDetailViewModel, boolean z, boolean z2, Context context, int i) {
        this.$t = i;
        this.l0 = musicDetailViewModel;
        this.z2 = z;
        this.z3 = z2;
        this.l1 = context;
    }
}
