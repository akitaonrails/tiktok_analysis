package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.BizAccount;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.TTSeller;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.12Mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19744212Mu {
    public static final C19744212Mu LIZ = new C19744212Mu();

    public static final boolean LIZLLL() {
        InterfaceC19744412Mw interfaceC19744412MwLIZ = C04PP.LIZ();
        User currentUser = interfaceC19744412MwLIZ != null ? interfaceC19744412MwLIZ.getCurrentUser() : null;
        if (currentUser != null && currentUser.getMusicComplianceAccount() > 0) {
            return true;
        }
        BizAccount bizAccountLIZ = C0XEE.LIZ();
        return bizAccountLIZ != null && bizAccountLIZ.getRestrictCommerceMusic();
    }

    public static boolean LJ() {
        InterfaceC19744412Mw interfaceC19744412MwLIZ = C04PP.LIZ();
        String shootWay = interfaceC19744412MwLIZ != null ? interfaceC19744412MwLIZ.getShootWay() : null;
        return TextUtils.equals(shootWay, "l8_import") || TextUtils.equals(shootWay, "l8_music_edit_cml");
    }

    public static final boolean LJII() {
        InterfaceC19744412Mw interfaceC19744412MwLIZ;
        InterfaceC19744412Mw interfaceC19744412MwLIZ2;
        InterfaceC19744412Mw interfaceC19744412MwLIZ3;
        User currentUser;
        SpecialAccount specialAccount;
        TTSeller seller;
        InterfaceC19744412Mw interfaceC19744412MwLIZ4 = C04PP.LIZ();
        if ((interfaceC19744412MwLIZ4 != null && interfaceC19744412MwLIZ4.LIZ()) || ((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) {
            return false;
        }
        LIZ.getClass();
        InterfaceC19744412Mw interfaceC19744412MwLIZ5 = C04PP.LIZ();
        if ((interfaceC19744412MwLIZ5 == null || !interfaceC19744412MwLIZ5.LIZIZ()) && (((interfaceC19744412MwLIZ = C04PP.LIZ()) == null || (currentUser = interfaceC19744412MwLIZ.getCurrentUser()) == null || (specialAccount = currentUser.specialAccount) == null || (seller = specialAccount.getSeller()) == null || seller.getType() != 1) && !LIZLLL())) {
            InterfaceC19744412Mw interfaceC19744412MwLIZ6 = C04PP.LIZ();
            if (TextUtils.equals(interfaceC19744412MwLIZ6 != null ? interfaceC19744412MwLIZ6.getShootWay() : null, "challenge") && (interfaceC19744412MwLIZ3 = C04PP.LIZ()) != null && interfaceC19744412MwLIZ3.isCommerceChallenge()) {
                return true;
            }
            InterfaceC19744412Mw interfaceC19744412MwLIZ7 = C04PP.LIZ();
            if (interfaceC19744412MwLIZ7 != null && interfaceC19744412MwLIZ7.LIZLLL()) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("enable_music_legal_optimize", false)) {
                    return true;
                }
            }
            InterfaceC19744412Mw interfaceC19744412MwLIZ8 = C04PP.LIZ();
            if (!TextUtils.equals(interfaceC19744412MwLIZ8 != null ? interfaceC19744412MwLIZ8.getShootWay() : null, "tcm_upload")) {
                InterfaceC19744412Mw interfaceC19744412MwLIZ9 = C04PP.LIZ();
                if (!TextUtils.equals(interfaceC19744412MwLIZ9 != null ? interfaceC19744412MwLIZ9.getShootWay() : null, "mission")) {
                    C15MA c15ma = C15MA.LL;
                    if (!C15MA.LIZLLL() && (((interfaceC19744412MwLIZ2 = C04PP.LIZ()) == null || !interfaceC19744412MwLIZ2.isSubOnlyVideo()) && !LJ())) {
                        IEcommerceAnchorOuterService iEcommerceAnchorOuterService = (IEcommerceAnchorOuterService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcommerceAnchorOuterService.class));
                        return iEcommerceAnchorOuterService != null && iEcommerceAnchorOuterService.LIZJ();
                    }
                }
            }
        }
        return true;
    }

    public static final C1485060okS LIZJ(MusicModel musicModel) {
        C1485060okS c1485060okS = new C1485060okS();
        c1485060okS.LJFF = musicModel.getMusicId();
        if (musicModel.getMusicType() == 1) {
            c1485060okS.LIZJ = 4;
        }
        c1485060okS.LIZLLL = musicModel.getDuration();
        if (musicModel.isPlayUrlValid()) {
            c1485060okS.LIZIZ = musicModel.getUrl().getUrlList();
        }
        c1485060okS.LJI = true;
        return c1485060okS;
    }

    public static final boolean LJI(Music music) {
        if (((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt() || !LIZLLL() || music == null || !(!music.isCommercialMusic())) {
            return false;
        }
        return true;
    }

    public static C1482560ogQ LJIIIIZZ(Aweme aweme) {
        int i;
        C1482580ogS c1482580ogS = new C1482580ogS();
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c1482580ogS.LIZ = aid;
        C1482580ogS c1482580ogSLIZIZ = LIZIZ(LIZIZ(c1482580ogS, aweme.getVideo().getPlayAddrH264()), aweme.getVideo().getPlayAddrBytevc1());
        List<BitRate> bitRate = aweme.getVideo().getBitRate();
        if (bitRate != null && !bitRate.isEmpty()) {
            for (BitRate bitRate2 : bitRate) {
                UrlModel playAddr = bitRate2.getPlayAddr();
                if (playAddr != null) {
                    c1482580ogSLIZIZ.getClass();
                    C1058540deW c1058540deW = new C1058540deW(c1482580ogSLIZIZ);
                    c1058540deW.LIZIZ = playAddr.getUrlKey();
                    c1058540deW.LJ = playAddr.getSize();
                    if (bitRate2.isBytevc1() == 1) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c1058540deW.LIZJ = i;
                    C1484750ojx c1484750ojx = new C1484750ojx(c1058540deW);
                    c1484750ojx.LIZ = bitRate2.getBitRate();
                    c1484750ojx.LIZJ = bitRate2.getQualityType();
                    c1484750ojx.LIZIZ = bitRate2.getGearName();
                    c1058540deW.LJI = c1484750ojx;
                    c1058540deW.LIZ();
                }
            }
        }
        Video video = aweme.getVideo();
        if (video != null) {
            c1482580ogSLIZIZ.getClass();
            C1351990lHp c1351990lHp = new C1351990lHp(c1482580ogSLIZIZ);
            c1351990lHp.LIZ = video.getVideoModelStr();
            c1351990lHp.LIZIZ = video.getVideoModelMap();
            c1482580ogSLIZIZ.LIZLLL = c1351990lHp;
        }
        C1482570ogR c1482570ogRLIZ = c1482580ogSLIZIZ.LIZ();
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        return new C1484680ojq(c1482580ogS2).LIZ();
    }

    public static C1482580ogS LIZIZ(C1482580ogS c1482580ogS, VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return c1482580ogS;
        }
        c1482580ogS.getClass();
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZIZ = videoUrlModel.getUrlKey();
        c1058540deW.LIZJ = videoUrlModel.isBytevc1() ? 1 : 0;
        c1058540deW.LIZLLL = videoUrlModel.getUrlList();
        c1058540deW.LJ = videoUrlModel.getSize();
        return c1058540deW.LIZ();
    }

    public static void LJFF(RecyclerView recyclerView, C0DXR c0dxr) {
        if (recyclerView.getItemDecorationCount() <= 0) {
            recyclerView.addItemDecoration(c0dxr);
        } else {
            recyclerView.invalidateItemDecorations();
        }
    }

    public static final void LIZ(LinearLayoutManager linearLayoutManager, List<Boolean> list, Function2<? super Integer, ? super Boolean, Unit> function2) {
        boolean z;
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (iFindLastCompletelyVisibleItemPosition >= list.size()) {
            int size = (iFindLastCompletelyVisibleItemPosition - list.size()) + 1;
            boolean[] zArr = new boolean[size];
            for (int i = 0; i < size; i++) {
                zArr[i] = false;
            }
            list.addAll(C13LQ.LJJZ(zArr));
        }
        IntRange intRange = new IntRange(iFindFirstCompletelyVisibleItemPosition, iFindLastCompletelyVisibleItemPosition);
        int i2 = 0;
        for (Boolean bool : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                boolean zBooleanValue = bool.booleanValue();
                int i4 = intRange.LL;
                if (i2 <= intRange.LLILLJJLI && i4 <= i2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!zBooleanValue) {
                    if (z) {
                        function2.invoke(Integer.valueOf(i2), Boolean.TRUE);
                    }
                } else if (!z) {
                    function2.invoke(Integer.valueOf(i2), Boolean.FALSE);
                }
                ListProtector.set(list, i2, Boolean.valueOf(z));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
