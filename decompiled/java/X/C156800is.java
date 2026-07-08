package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.linkroom.LiveMatchReapplyPlaybookAfterMatchEndWithoutRematchSetting;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTest;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C156800is implements InterfaceC975810bV5 {
    public List<GiftMode> LIZ;
    public Text LIZIZ;
    public GiftModeMeta LIZJ;
    public GiftModeMetaV2 LIZLLL;
    public GiftMode LJ;
    public final MutableLiveData<GiftMode> LJFF;
    public LiveData<GiftMode> LJI;
    public long LJII;
    public GiftMode LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public GiftMode LJIIJJI;
    public long LJIIL;
    public final MutableLiveData<Integer> LJIILIIL;
    public final MutableLiveData LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public Map<Long, MultiMatchPrepareResponse.MatchGameplayPermission> LJIIZILJ;
    public MatchSettingsInfo LJIJ;
    public int LJIJI;

    @Override // X.InterfaceC975810bV5
    public final void LJIJ() {
        this.LJIIIZ = false;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJIJJLI() {
        this.LJIIIIZZ = null;
    }

    @Override // X.InterfaceC975810bV5
    public final boolean LJ() {
        GiftModeMeta giftModeMeta = this.LIZJ;
        return !(giftModeMeta == null || giftModeMeta.giftId == 0) || C156900it.LJIIIZ(this.LIZLLL);
    }

    @Override // X.InterfaceC975810bV5
    public final void LJIIL() {
        GiftMode giftMode = new GiftMode();
        GiftModeMeta giftModeMeta = this.LIZJ;
        giftMode.giftId = giftModeMeta != null ? giftModeMeta.giftId : 0L;
        giftMode.giftIconImage = giftModeMeta != null ? giftModeMeta.giftIconImage : null;
        C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
        GiftModeMeta giftModeMeta2 = this.LIZJ;
        String str = giftModeMeta2 != null ? giftModeMeta2.giftNameKey : null;
        c1124870fNVLIZJ.getClass();
        giftMode.giftName = C1124870fNV.LIZIZ(str);
        GiftModeMeta giftModeMeta3 = this.LIZJ;
        this.LJIIL = giftModeMeta3 != null ? giftModeMeta3.giftId : 0L;
        this.LJIIJJI = giftMode;
        this.LJIJI = this.LJIILLIIL;
    }

    public C156800is() {
        MutableLiveData<GiftMode> mutableLiveData = new MutableLiveData<>();
        this.LJFF = mutableLiveData;
        this.LJI = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>(0);
        this.LJIILIIL = mutableLiveData2;
        this.LJIILJJIL = mutableLiveData2;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJJI() {
        if (LiveMatchReapplyPlaybookAfterMatchEndWithoutRematchSetting.enable()) {
            this.LJIIIIZZ = null;
            this.LJIIIZ = false;
        }
    }

    @Override // X.InterfaceC975810bV5
    public final boolean LJJIIZ() {
        BattleABTestList battleABTestList;
        List<BattleABTest> list;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        Map mapLIZJ = C973890bRz.LIZJ();
        boolean z = false;
        if (mapLIZJ != null && (battleABTestList = (BattleABTestList) mapLIZJ.get(Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()))) != null && (list = battleABTestList.abTestList) != null) {
            for (BattleABTest battleABTest : list) {
                if (battleABTest.abTestType == 2 && battleABTest.group == 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // X.InterfaceC975810bV5
    public final Text LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC975810bV5
    public final long LIZIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC975810bV5
    public final List<GiftMode> LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC975810bV5
    public final LiveData<GiftMode> LJI() {
        return this.LJI;
    }

    @Override // X.InterfaceC975810bV5
    public final GiftModeMeta LJII() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC975810bV5
    public final long LJIIIZ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC975810bV5
    public final GiftMode LJIIJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC975810bV5
    public final int LJIILIIL() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC975810bV5
    public final long LJIILJJIL() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC975810bV5
    public final MutableLiveData LJIILLIIL() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC975810bV5
    public final GiftMode LJIIZILJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC975810bV5
    public final Map<Long, MultiMatchPrepareResponse.MatchGameplayPermission> LJIJI() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC975810bV5
    public final GiftMode LJIJJ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC975810bV5
    public final int LJIL() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC975810bV5
    public final MatchSettingsInfo LJJ() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC975810bV5
    public final GiftModeMetaV2 LJJII() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC975810bV5
    public final int LJJIJIIJI() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC975810bV5
    public final boolean LJJIJIIJIL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJFF(Text text) {
        this.LIZIZ = text;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJIIIIZZ(MatchSettingsInfo matchSettingsInfo) {
        this.LJIJ = matchSettingsInfo;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJIILL(long j) {
        this.LJIIJ = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentReportedGiftId, Current reported gift Id updated: ");
        sbLIZ.append(this.LJIIJ);
        C20441214yg.LIZIZ("DesignatedGiftRepository", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC975810bV5
    public final GiftMode LJJIFFI(long j) {
        List<GiftMode> list = this.LIZ;
        if (list != null) {
            for (GiftMode giftMode : list) {
                if (giftMode.giftId == j) {
                    return giftMode;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJJIII(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("longTermGameOptionSelection, previous: ");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", current: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("DesignatedGiftRepository", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIILLIIL = i;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJJIIJ(List<GiftMode> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJJIIZI(Map<Long, MultiMatchPrepareResponse.MatchGameplayPermission> map) {
        this.LJIIZILJ = map;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJJIJ(int i) {
        this.LJIILL = i;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJJIJIL(GiftModeMetaV2 giftModeMetaV2) {
        this.LIZLLL = giftModeMetaV2;
    }

    @Override // X.InterfaceC975810bV5
    public final void LJJIJL(GiftModeMeta giftModeMeta) {
        long j;
        this.LIZJ = giftModeMeta;
        if (giftModeMeta != null) {
            j = giftModeMeta.giftId;
        } else {
            j = 0;
        }
        LJIILL(j);
    }

    @Override // X.InterfaceC975810bV5
    public final void LIZJ(Function1<? super List<GiftMode>, Unit> function1, Function1<? super Throwable, Unit> function12) {
        List<GiftMode> list = this.LIZ;
        if (list != null && !list.isEmpty()) {
            Collection collection = this.LIZ;
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
            function1.invoke(collection);
            return;
        }
        C930540aK4.LJIIL();
        C480460Ism.LIZ().getClass();
        ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).getMatchPlaybookInfo(null).LJIILIIL(new C0UO0()).LJJLL(new C515801zg(this, function1, 59), new C516201zk(function12, 290));
    }

    @Override // X.InterfaceC975810bV5
    public final void LJIIJJI(int i, boolean z) {
        this.LJIILIIL.setValue(Integer.valueOf(i));
        if (z) {
            LJJIII(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC975810bV5
    public final void LJJIIJZLJL(GiftMode giftMode, boolean z, boolean z2) {
        Long lValueOf;
        String str;
        long j;
        long j2;
        long j3;
        ImageModel imageModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSelectedGift, new gift ");
        List urls = null;
        if (giftMode != null) {
            lValueOf = Long.valueOf(giftMode.giftId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", ");
        if (giftMode != null) {
            str = giftMode.giftName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", ");
        if (giftMode != null && (imageModel = giftMode.giftIconImage) != null) {
            urls = imageModel.getUrls();
        }
        sbLIZ.append(urls);
        sbLIZ.append(", isUpdateReportedGift: ");
        sbLIZ.append(z2);
        sbLIZ.append(" isInternalChange:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("DesignatedGiftRepository", C2188811AlT.LIZIZ(sbLIZ));
        boolean z3 = true;
        if (!C915980Zwa.LJFF().co0() || C915980Zwa.LJFF().gm1() || z) {
            this.LJ = giftMode;
            this.LJFF.postValue(giftMode);
            if (giftMode != null) {
                j = giftMode.giftId;
            } else {
                j = 0;
            }
            this.LJII = j;
            if (z2) {
                if (giftMode != null) {
                    j3 = giftMode.giftId;
                } else {
                    j3 = 0;
                }
                LJIILL(j3);
            }
            if (giftMode != null) {
                j2 = giftMode.giftId;
            } else {
                j2 = 0;
            }
            if (LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable() || LiveMatchTeamPairSetting.INSTANCE.isEnable() || C163000js.LIZ()) {
                if (j2 == 0) {
                    Integer num = (Integer) this.LJIILJJIL.getValue();
                    if (num != null && num.intValue() == 1) {
                        LJIIJJI(0, z2);
                    }
                } else {
                    LJIIJJI(1, z2);
                }
            }
        }
        if (C915980Zwa.LJFF().co0()) {
            this.LJIIIIZZ = giftMode;
            if (giftMode != null) {
                z3 = false;
            }
            this.LJIIIZ = z3;
        }
    }
}
