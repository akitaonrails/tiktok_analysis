package X;

import Y.ACListenerS139S0100000_4;
import Y.ACListenerS143S0100000_8;
import Y.AObjectS393S0100000_19;
import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.aweme.account.base.SafeHandler;
import com.ss.android.ugc.aweme.favorites.service.IExternalHeaderProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2;
import com.ss.android.ugc.aweme.search.csi.ISearchCSIService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.external.ui.BaseLifecycleViewHolder;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.model.StoryArchDetail;
import com.ss.android.ugc.aweme.theater.common.CameoDraftListTextConfig;
import com.ss.android.ugc.aweme.theater.model.CameoDraftInfo;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.profile.business.profile.tab.appdiff.IAwmeListFragmentAppDiff;
import com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardBaseProtocol;
import com.ss.android.ugc.profile.platform.multiapp.IProfileExService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import irm.AkS76S0100000_4;
import irm.AkS80S0100000_8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0isQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259360isQ extends AbstractC654930PmV {
    public RecyclerView LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public CameoDraftInfo LLILZLL;
    public String LLIZLLLIL;
    public CameoDraftListTextConfig LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final InterfaceC1260110itd LLJJ;
    public final InterfaceC645470PTl LLJJI;
    public C553680Lna LLJJIII;
    public final boolean LLJJIJI;
    public final int LLJJIJIIJIL;
    public final C19EG LLJJJIL;
    public final InterfaceC1259540isi LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJL;
    public MixListResponse LLJLL;
    public BannerDisplayInfo LLJLLIL;
    public InterfaceC1259690isx LLJLLL;
    public C19720512Dr LLJZ;
    public IExternalHeaderProvider LLLIIIL;
    public InterfaceC653650PkR LLLLII;
    public final InterfaceC1259640iss LLLLIIIILLL;
    public InterfaceC1258330iql LLLLLIL;
    public C1258270iqf LLLLLILLIL;
    public final String LLLLLJLJLL;
    public InterfaceC1259560isk LLLLLLJ;
    public String LLIZ = "personal_homepage";
    public final boolean LLJILJIL = true;
    public boolean LLJJIJIL = true;
    public boolean LLJJJ = true;
    public String LLJJJJLIIL = "";
    public final ArrayList<C2313071FgP> LLJJLIIIJLLLLLLLZ = new ArrayList<>();
    public String LLJL = "";
    public boolean LLJLIL = false;
    public int LLJLILLLLZIIL = -1;
    public C12E8 LLJZIJLIL = new C12E8(true, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048574);
    public StoryArchDetail LLL = null;
    public List<Aweme> LLLF = null;
    public boolean LLLFF = false;
    public boolean LLLFFI = false;
    public boolean LLLFZ = false;
    public boolean LLLI = false;
    public boolean LLLII = false;
    public boolean LLLIIII = false;
    public boolean LLLIIIIL = false;
    public boolean LLLIIL = false;
    public boolean LLLIILIL = false;
    public boolean LLLIL = false;
    public boolean LLLILZ = false;
    public boolean LLLILZJ = false;
    public boolean LLLILZLLLI = false;
    public boolean LLLIZZ = false;
    public boolean LLLJ = false;
    public boolean LLLJIL = false;
    public boolean LLLJL = false;
    public int LLLL = 0;
    public int LLLLIIL = 0;
    public boolean LLLLIILL = true;
    public boolean LLLLIILLL = false;
    public boolean LLLLIL = false;
    public final Set<InterfaceC1259660isu> LLLLILI = new HashSet();
    public List<UserProfileGuideDataV2> LLLLJ = null;
    public boolean LLLLJI = false;
    public List<GuideCardBaseProtocol> LLLLL = null;
    public String LLLLLJIL = "";
    public int LLLLLL = 0;
    public boolean LLLLLLIL = false;
    public InterfaceC1259480isc LLLLLLL = null;

    public final void LLLLLL() {
        try {
            this.LLJLLIL = null;
            this.LLLIIL = true;
            if (this.LLLIIII) {
                this.LLLIIII = false;
                notifyDataSetChanged();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
    }

    @Override // X.AbstractC683510QrV
    public final boolean isNestedFlingStopCompat() {
        return true;
    }

    public static Boolean LLLLJ() {
        IAIRemixService.LIZ.getClass();
        return Boolean.valueOf(C563030M6j.LIZ().LJIIJ());
    }

    public final boolean LLLILZ() {
        if (!this.LLJJIJI) {
            return false;
        }
        IAwmeListFragmentAppDiff.LIZ.getClass();
        C1259020irs.LIZ().LIZIZ();
        return this.LLJJIJIIJIL == 14;
    }

    public final boolean LLLILZLLLI() {
        if (!this.LLJJIJI || !C1618440sDa.LIZIZ.LIZ()) {
            return false;
        }
        IAwmeListFragmentAppDiff.LIZ.getClass();
        C1259020irs.LIZ().LIZIZ();
        return this.LLJJIJIIJIL == 14;
    }

    public final int LLLJIL() {
        return ((!this.LLLI || this.LLJJJ) ? 0 : 1) + (("".equals(this.LLLLLJIL) || super.getBasicItemCount() <= 0 || this.LLJJJ || this.LLJJIJIIJIL != 0) ? 0 : 1);
    }

    public final int LLLL() {
        return (this.LLILZ ? 1 : 0) + (this.LLLJ ? 1 : 0);
    }

    public final Boolean LLLLII() {
        AVDraftMigrateService aVDraftMigrateService = (AVDraftMigrateService) PluggableExtentionKt.pluggableSpi(AVDraftMigrateService.class);
        if (aVDraftMigrateService == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!this.LLLLIL && this.LLJJIJI && this.LLJJIJIIJIL == 0 && aVDraftMigrateService.enableM2MigrateDraft());
    }

    public final boolean LLLLIILL() {
        return this.LLLI && LLLILZ();
    }

    public final boolean LLLLIILLL() {
        return this.LLLFFI && LLLILZLLLI();
    }

    public final boolean LLLLJI() {
        if (!this.LLJJIJI) {
            return false;
        }
        IAwmeListFragmentAppDiff.LIZ.getClass();
        C1259020irs.LIZ().LIZIZ();
        return (this.LLJJIJIIJIL != 0 || this.LLLLIL || this.LLLII || this.LLJZ == null || this.LLLILZLLLI || this.LLLILZJ) ? false : true;
    }

    public final boolean LLLLL() {
        if (this.LLLLIL) {
            return false;
        }
        C1252550ihR c1252550ihR = C1252550ihR.LIZ;
        int iLLLL = LLLL() + this.LLJJLIIIJLLLLLLLZ.size() + super.getBasicItemCount();
        boolean z = this.LLJIJIL;
        c1252550ihR.getClass();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean z2 = C036E.LIZ.LIZIZ() && iLLLL <= 0 && !C10EU.LJIIIIZZ() && z && (C1252550ihR.LIZLLL() == 1 || C1252550ihR.LJIIL());
        if (this.LLJJIJI && this.LLJJIJIIJIL == 0) {
            C1252550ihR.LIZ.getClass();
            C1252550ihR.LJ = z2;
        }
        if (!z2 || !this.LLJJIJI) {
            return false;
        }
        IAwmeListFragmentAppDiff.LIZ.getClass();
        C1259020irs.LIZ().LIZIZ();
        return this.LLJJIJIIJIL == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLL() {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1259360isQ.LLLLLLL():void");
    }

    @Override // X.AbstractC683590Qrd
    public final void clearData() {
        this.LLLLLJIL = "";
        super.clearData();
    }

    public final String toString() {
        int i = this.LLJJIJIIJIL;
        String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 17 ? "TYPE_TOOL_MASTER" : "TYPE_GHOST_MUSIC_TAB" : "TYPE_COLLECT_AWEME" : "TYPE_ORIGIN_MUSIC" : "TYPE_STORY_AWEME" : "TYPE_FAVORITE_AWEME" : "TYPE_PUBLISH_AWEME";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("profileListType: ");
        sbLIZ.append(str);
        sbLIZ.append(", itemCount: ");
        sbLIZ.append(getItemCount());
        sbLIZ.append(", baseCount: ");
        sbLIZ.append(getBasicItemCount());
        sbLIZ.append(", mShowDraftBox: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mShowFooter: ");
        sbLIZ.append(this.mShowFooter);
        sbLIZ.append(", isMyProfile: ");
        sbLIZ.append(this.LLJJIJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LLLIL() {
        return LLLLJ().booleanValue() && !this.LLLLIL && this.LLJJIJI && !this.LLILZ && this.LLJJIJIIJIL == 0;
    }

    public final void LLLJ() {
        List<T> list;
        if (C1259950itN.LIZIZ() || this.LLJJIJI) {
            if (C1ELC.LIZJ() || !this.LLJJIJI) {
                String str = this.LLJJJJJIL;
                if (str == null || str.equals(this.LLJJJJLIIL) || (list = this.mmItems) == 0) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("collectUpdateAwemeList mUid: ");
                    sbLIZ.append(this.LLJJJJJIL);
                    sbLIZ.append(" mLastUid: ");
                    sbLIZ.append(this.LLJJJJLIIL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                String str2 = this.LLJJJJJIL;
                this.LLJJJJLIIL = str2;
                Set<String> setLIZ = !this.LLJJIJI ? C1253360iik.LIZ(str2) : C1253360iik.LIZJ;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    setLIZ.add(((Aweme) ListProtector.get(list, i2)).getAid());
                }
            }
        }
    }

    public final int LLLJL() {
        int i = 0;
        int iLLLL = LLLL() + this.LLJJLIIIJLLLLLLLZ.size() + (this.LLLIL ? 1 : 0) + (this.LLLIIII ? 1 : 0) + (this.LLLIIIIL ? 1 : 0) + (this.LLLFF ? 1 : 0) + (this.LLLFFI ? 1 : 0) + (this.LLLFZ ? 1 : 0) + (this.LLLII ? 1 : 0) + ((this.LLLILZJ || this.LLLILZLLLI || this.LLILZIL) ? 1 : 0);
        IExternalHeaderProvider iExternalHeaderProvider = this.LLLIIIL;
        if (iExternalHeaderProvider != null && iExternalHeaderProvider.shouldShow()) {
            i = 1;
        }
        return (this.LLJILJILJ ? 1 : 0) + iLLLL + i;
    }

    public final int LLLLIIL() {
        return super.getBasicItemCount();
    }

    @Override // X.AbstractC683560Qra, X.AbstractC683590Qrd, X.AbstractC438050HFr
    public final int getBasicItemCount() {
        return LLLJL() + super.getBasicItemCount() + ((!this.LLLI || this.LLJJJ) ? 0 : 1) + (("".equals(this.LLLLLJIL) || super.getBasicItemCount() <= 0 || this.LLJJJ || this.LLJJIJIIJIL != 0) ? 0 : 1);
    }

    @Override // X.AbstractC683590Qrd
    public final List<Aweme> getData() {
        return this.mmItems;
    }

    @Override // X.AbstractC654930PmV
    public final boolean LLLIIIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() != 0 && viewHolder.getItemViewType() != 7) {
            return false;
        }
        return true;
    }

    public final Aweme LLLLIIIILLL(int i) {
        int iLLLJL = i - LLLJL();
        List<T> list = this.mmItems;
        if (list == 0 || iLLLJL < 0 || iLLLJL >= list.size()) {
            return null;
        }
        return (Aweme) ListProtector.get(list, iLLLJL);
    }

    public final void LLLLIL(StoryArchDetail storyArchDetail) {
        List<Aweme> list;
        this.LLL = storyArchDetail;
        boolean z = true;
        if (storyArchDetail == null || (list = storyArchDetail.items) == null || list.isEmpty() || !LLLILZLLLI()) {
            z = false;
        }
        this.LLLFFI = z;
    }

    public final void LLLLILI(boolean z) {
        Set<InterfaceC1259660isu> set = this.LLLLILI;
        if (set != null && !((HashSet) set).isEmpty()) {
            for (InterfaceC1259660isu interfaceC1259660isu : (HashSet) this.LLLLILI) {
                if (interfaceC1259660isu != null) {
                    interfaceC1259660isu.Y1(z);
                }
            }
        }
    }

    public final void LLLLLJLJLL(int i) {
        InterfaceC1259640iss interfaceC1259640iss;
        if (this.LLJJIJIIJIL == 0 && i == LLLJL() && super.getBasicItemCount() > 0 && (interfaceC1259640iss = this.LLLLIIIILLL) != null) {
            interfaceC1259640iss.L4();
        }
    }

    public final void LLLLLLLLL(List<Aweme> list) {
        if (this.LLJJIJI && this.LLJJIJIIJIL == 0 && list != null) {
            int size = list.size();
            int awemeCount = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAwemeCount();
            if (size > awemeCount) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(1, "error_type");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(size);
                sbLIZ.append("-");
                sbLIZ.append(awemeCount);
                c2344009Gk.LJIIIIZZ("num_des", C2188811AlT.LIZIZ(sbLIZ));
                C20684815ws.LJIILLIIL("publish_num_check", c2344009Gk.LIZ);
            }
            if (size == 0 && awemeCount == 1) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LIZJ(2, "error_type");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(size);
                sbLIZ2.append("-");
                sbLIZ2.append(awemeCount);
                c2344009Gk2.LJIIIIZZ("num_des", C2188811AlT.LIZIZ(sbLIZ2));
                C20684815ws.LJIILLIIL("publish_num_check", c2344009Gk2.LIZ);
            }
            if (!this.LLJJJ && size != awemeCount) {
                C2344009Gk c2344009Gk3 = new C2344009Gk();
                c2344009Gk3.LIZJ(3, "error_type");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(size);
                sbLIZ3.append("-");
                sbLIZ3.append(awemeCount);
                c2344009Gk3.LJIIIIZZ("num_des", C2188811AlT.LIZIZ(sbLIZ3));
                C20684815ws.LJIILLIIL("publish_num_check", c2344009Gk3.LIZ);
            }
        }
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        int i2;
        boolean z;
        boolean z2;
        C12E8 c12e8;
        int iLLLL;
        if (LLLLIIIILLL(i) != null && AwemeBizExtKt.getPreviewData(LLLLIIIILLL(i)) != null && AwemeBizExtKt.getPreviewData(LLLLIIIILLL(i)).inPublishing) {
            return 18;
        }
        if (this.LLLIIIIL) {
            if (i == 0) {
                return 27;
            }
            i2 = 1;
        } else {
            i2 = 0;
        }
        IExternalHeaderProvider iExternalHeaderProvider = this.LLLIIIL;
        if (iExternalHeaderProvider != null && iExternalHeaderProvider.shouldShow()) {
            if (i == i2) {
                return this.LLLIIIL.getViewType();
            }
            i2++;
        }
        if (this.LLLIIII) {
            if (i == i2) {
                return 19;
            }
            i2++;
        }
        if (this.LLLFF) {
            if (i == i2) {
                return 10;
            }
            i2++;
        }
        if (this.LLLII) {
            if (i == i2) {
                return 13;
            }
            i2++;
        }
        if (this.LLLFFI) {
            if (i == i2) {
                return 11;
            }
            i2++;
        }
        int i3 = this.LLJJIJIIJIL;
        if (i3 != 15) {
            if (this.LLLILZJ) {
                if (i == i2) {
                    return 26;
                }
                i2++;
            }
            if (this.LLLILZLLLI) {
                if (i == i2) {
                    return 25;
                }
                i2++;
            }
            if (this.LLLJ) {
                if (i == i2) {
                    return 32;
                }
                i2++;
            }
            if (this.LLILZ) {
                if (i2 == i) {
                    return 1;
                }
                i2++;
            }
            if (i3 == 24) {
                if (this.LLILZIL && i2 == i) {
                    return 30;
                }
                return 31;
            }
            if (this.LLJJLIIIJLLLLLLLZ.size() > 0 && i >= (iLLLL = LLLL()) && i < iLLLL + this.LLJJLIIIJLLLLLLLZ.size()) {
                return 6;
            }
            Aweme awemeLLLLIIIILLL = LLLLIIIILLL(i);
            if (C1601110rld.LIZ() && C729510SjV.LJJIIZ(awemeLLLLIIIILLL)) {
                return 12;
            }
            if (awemeLLLLIIIILLL != null) {
                if (awemeLLLLIIIILLL.getAwemeType() == 2) {
                    return 2;
                }
                if (!AwemeSaaSExtKt.isForwardAweme(awemeLLLLIIIILLL)) {
                    if (AwemeBizExtKt.isPlaceHolder(awemeLLLLIIIILLL)) {
                        return 29;
                    }
                } else {
                    return 7;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guideDataV2List is not null");
            if (this.LLLLJ != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(String.valueOf(z));
            sbLIZ.append("local check");
            C1252550ihR.LIZ.getClass();
            sbLIZ.append(C1252550ihR.LJIILIIL());
            C2188811AlT.LIZIZ(sbLIZ);
            int iLLLL2 = LLLL() + this.LLJJLIIIJLLLLLLLZ.size() + super.getBasicItemCount();
            if (C1EDI.LIZLLL() && ((i == 0 || ((this.LLLII && i == 1) || ((this.LLLIIII && i == 1) || (this.LLLIIIIL && i == 1)))) && iLLLL2 == 0 && this.LLJJIJI && C1252550ihR.LJIILIIL())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (Boolean.valueOf(z2).booleanValue() && !this.LLLLJI) {
                return 24;
            }
            if ((i == 0 || ((this.LLLII && i == 1) || ((this.LLLIIII && i == 1) || (this.LLLIIIIL && i == 1)))) && this.LLJJIJI && this.LLLIL) {
                if (C0BXN.LIZ() && (c12e8 = this.LLJZIJLIL) != null && !c12e8.LIZIZ) {
                    return 16;
                }
                return 9;
            }
            if (this.LLJJIJI && this.mmItems != null) {
                getBasicItemCount();
            }
            if (this.LLLI && !this.LLJJJ && i == getBasicItemCount() - 1) {
                return 15;
            }
            if (!"".equals(this.LLLLLJIL) && super.getBasicItemCount() > 0 && !this.LLJJJ && this.LLJJIJIIJIL == 0 && i == getBasicItemCount() - 1) {
                return 20;
            }
            if (C1258400iqs.LIZ() && getBasicItemCount() != 0) {
                if (LLLLLIL(this.LLJJIJIIJIL, this.LLJJIJI).booleanValue()) {
                    if (i == i2) {
                        return 22;
                    }
                    i2++;
                }
            }
            if (this.LLJILJILJ && i == i2) {
                return 28;
            }
            return super.getBasicItemViewType(i);
        }
        return 7;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC214823195h abstractC214823195h;
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILLL = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (abstractC214823195h = ((GridLayoutManager) layoutManager).LLIZ) != null) {
            abstractC214823195h.LIZJ = true;
            abstractC214823195h.LIZLLL = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC654930PmV, X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C562830M5p c562830M5p;
        Context context;
        C19EG c19egLIZIZ;
        C0RJP c0rjp;
        InterfaceC1258330iql interfaceC1258330iql;
        InterfaceC645470PTl interfaceC645470PTl;
        super.onViewAttachedToWindow(viewHolder);
        if (this.LLJILLL && LLLIIIIL(viewHolder) && (interfaceC645470PTl = this.LLJJI) != null) {
            interfaceC645470PTl.Tr(viewHolder);
        }
        if (this.LLJILLL) {
            if (viewHolder instanceof C1259410isV) {
                viewHolder.getClass();
                C1259410isV.I5("show");
            } else if (viewHolder instanceof C1259400isU) {
                if (!this.LLLLLLIL) {
                    C735840Sti.LIZ.getClass();
                    C735840Sti.LJIILL("show", "personal_homepage", "private_tab");
                }
                this.LLLLLLIL = true;
            }
        }
        if (viewHolder instanceof C2175981AEa) {
            C2175981AEa c2175981AEa = (C2175981AEa) viewHolder;
            c2175981AEa.LLIZ.isUserProfileFragmentVisible2().observe(c2175981AEa.LL, c2175981AEa);
        }
        if (viewHolder instanceof BaseLifecycleViewHolder) {
            ((BaseLifecycleViewHolder) viewHolder).onViewAttachedFromWindow();
        }
        if ((viewHolder instanceof C683490QrT) && (interfaceC1258330iql = this.LLLLLIL) != null) {
            interfaceC1258330iql.LIZ();
        }
        if ((viewHolder instanceof C1259780it6) && (c0rjp = ((C1259780it6) viewHolder).LLLILZ) != null && !EventBus.LIZLLL().LJIIJ(c0rjp)) {
            EventBus.LIZLLL().LJIJJ(c0rjp);
        }
        if (viewHolder instanceof InterfaceC1259620isq) {
            ((InterfaceC1259620isq) viewHolder).onViewAttachedToWindow();
        }
        if ((viewHolder instanceof C562830M5p) && (context = (c562830M5p = (C562830M5p) viewHolder).LLILZIL) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "draft_box_ai_remix_observe_anr_fix", true, true)) {
                ARunnableS108S0100000_8 aRunnableS108S0100000_8 = c562830M5p.LLJL;
                if (aRunnableS108S0100000_8 != null) {
                    HandlerHook.viewRemoveCallbacks(c562830M5p.itemView, aRunnableS108S0100000_8);
                }
                ARunnableS108S0100000_8 aRunnableS108S0100000_82 = new ARunnableS108S0100000_8(c562830M5p, 124);
                c562830M5p.LLJL = aRunnableS108S0100000_82;
                HandlerHook.viewPost(c562830M5p.itemView, aRunnableS108S0100000_82);
                return;
            }
            InterfaceC562800M5m interfaceC562800M5mLIZIZ = c562830M5p.P5().LIZIZ();
            if (interfaceC562800M5mLIZIZ == null) {
                return;
            }
            interfaceC562800M5mLIZIZ.LIZIZ(c19egLIZIZ, c562830M5p.LLJJLIIIJLLLLLLLZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC654930PmV, X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C0RJP c0rjp;
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C2175981AEa) {
            C2175981AEa c2175981AEa = (C2175981AEa) viewHolder;
            c2175981AEa.LLIZ.isUserProfileFragmentVisible2().removeObserver(c2175981AEa);
        }
        if (viewHolder instanceof BaseLifecycleViewHolder) {
            ((BaseLifecycleViewHolder) viewHolder).onViewDetachedFromWindow();
        }
        if ((viewHolder instanceof C1259780it6) && (c0rjp = ((C1259780it6) viewHolder).LLLILZ) != null) {
            if (EventBus.LIZLLL().LJIIJ(c0rjp)) {
                EventBus.LIZLLL().LJJI(c0rjp);
            }
            if (C299030Bnp.LIZ()) {
                c0rjp.LIZ = null;
            }
        }
        if (viewHolder instanceof InterfaceC1259620isq) {
            ((InterfaceC1259620isq) viewHolder).onViewDetachedFromWindow();
        }
        if (viewHolder instanceof C562830M5p) {
            C562830M5p c562830M5p = (C562830M5p) viewHolder;
            ARunnableS108S0100000_8 aRunnableS108S0100000_8 = c562830M5p.LLJL;
            if (aRunnableS108S0100000_8 != null) {
                HandlerHook.viewRemoveCallbacks(c562830M5p.itemView, aRunnableS108S0100000_8);
                c562830M5p.LLJL = null;
            }
            InterfaceC562800M5m interfaceC562800M5mLIZIZ = c562830M5p.P5().LIZIZ();
            if (interfaceC562800M5mLIZIZ != null) {
                interfaceC562800M5mLIZIZ.LJII(c562830M5p.LLJJLIIIJLLLLLLLZ);
            }
            ViewGroup viewGroup = c562830M5p.LLJJIJIIJIL;
            if (viewGroup != null) {
                viewGroup.setTag(R.id.cb2, null);
            }
        }
    }

    @Override // X.AbstractC683590Qrd
    public final void setData(List<Aweme> list) {
        InterfaceC1259640iss interfaceC1259640iss;
        InterfaceC1259540isi interfaceC1259540isi;
        boolean z = true;
        this.LLJIJIL = true;
        super.setData(list);
        LLLLLLLLL(list);
        if (this.LLJJIJIIJIL == 0 && (interfaceC1259540isi = this.LLJJJJ) != null) {
            if (this.LLLIL) {
                C1252550ihR.LIZ.getClass();
                C1252550ihR.LIZLLL = false;
            } else {
                z = false;
            }
            interfaceC1259540isi.gC(z);
        }
        if (getBasicItemCount() == 0 && (interfaceC1259640iss = this.LLLLIIIILLL) != null) {
            interfaceC1259640iss.rK();
        }
    }

    @Override // X.AbstractC683590Qrd
    public final void setDataAfterLoadMore(List<Aweme> list) {
        super.setDataAfterLoadMore(list);
        LLLLLLLLL(list);
    }

    @Override // X.AbstractC438050HFr
    public final void setShowFooter(boolean z) {
        boolean z2;
        if (z) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.setShowFooter(z2);
    }

    public static Boolean LLLLLIL(int i, boolean z) {
        if (!z) {
            return Boolean.FALSE;
        }
        if (1 == i) {
            C19259110Wf c19259110Wf = C746350TPl.LIZ;
            if (c19259110Wf.LJIIJJI().LIZ().intValue() == 0) {
                return Boolean.FALSE;
            }
            if (C10EU.LJIIIIZZ()) {
                return Boolean.FALSE;
            }
            if (c19259110Wf.LJIIIIZZ().LIZ().booleanValue()) {
                return Boolean.FALSE;
            }
            if (c19259110Wf.LJII().LIZ().booleanValue()) {
                return Boolean.FALSE;
            }
            if (!c19259110Wf.LJIIIZ().LIZ().booleanValue()) {
                return Boolean.FALSE;
            }
            if (PluggableExtentionKt.pluggableSpi(IProfileExService.class) != null) {
                IProfileExService iProfileExService = (IProfileExService) PluggableExtentionKt.pluggableSpi(IProfileExService.class);
                Objects.requireNonNull(iProfileExService);
                if (!iProfileExService.LJJIIJ()) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final void LLLLLLIL(boolean z, MixListResponse mixListResponse) {
        List<MixStruct> mixList;
        if (this.LLJLIL != z) {
            this.LLJLIL = z;
            this.LLJLL = mixListResponse;
            int i = this.LLJLILLLLZIIL;
            if (i != -1 && C2525109uz.LIZ) {
                if (z) {
                    notifyDataSetChanged();
                    return;
                } else {
                    notifyItemRemoved(i);
                    return;
                }
            }
            notifyDataSetChanged();
            return;
        }
        List<MixStruct> mixList2 = null;
        if (mixListResponse == null) {
            mixList = null;
        } else {
            mixList = mixListResponse.getMixList();
        }
        MixListResponse mixListResponse2 = this.LLJLL;
        if (mixListResponse2 != null) {
            mixList2 = mixListResponse2.getMixList();
        }
        if (mixList != null && mixList2 != null && mixList.size() == mixList2.size()) {
            int i2 = 0;
            while (true) {
                boolean z2 = true;
                if (i2 < mixList.size()) {
                    if (!((MixStruct) ListProtector.get(mixList, i2)).mixId.equals(((MixStruct) ListProtector.get(mixList2, i2)).mixId) || !((MixStruct) ListProtector.get(mixList, i2)).getMixName().equals(((MixStruct) ListProtector.get(mixList2, i2)).getMixName())) {
                        break;
                    }
                    MixStatisStruct statis = ((MixStruct) ListProtector.get(mixList, i2)).getStatis();
                    MixStatisStruct statis2 = ((MixStruct) ListProtector.get(mixList2, i2)).getStatis();
                    if (statis == null) {
                        if (statis2 != null) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        if (statis2 != null) {
                            z2 = false;
                        }
                        if (false != z2 || statis.getTotal() != statis2.getTotal()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        this.LLJLL = mixListResponse;
        if (!z && C2525109uz.LIZ) {
            return;
        }
        int i3 = this.LLJLILLLLZIIL;
        if (i3 != -1 && C2525109uz.LIZ) {
            notifyItemChanged(i3);
        } else {
            notifyDataSetChanged();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x047c A[PHI: r15 r16
      0x047c: PHI (r15v20 com.ss.android.ugc.aweme.base.model.UrlModel) = (r15v19 com.ss.android.ugc.aweme.base.model.UrlModel), (r15v21 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:127:0x0416, B:129:0x041c] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r16v5 com.ss.android.ugc.aweme.base.model.UrlModel) = (r16v4 com.ss.android.ugc.aweme.base.model.UrlModel), (r16v6 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:127:0x0416, B:129:0x041c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0cd3  */
    /* JADX WARN: Removed duplicated region for block: B:414:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0isZ] */
    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(final androidx.recyclerview.widget.RecyclerView.ViewHolder r21, final int r22) {
        /*
            Method dump skipped, instruction units count: 3450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1259360isQ.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        InterfaceC1257670iph interfaceC1257670iphT8;
        InterfaceC1257670iph interfaceC1257670iphT82;
        C1259600iso value;
        LifecycleOwner lifecycleOwnerFindSAFExpLifecycleOwner;
        int i2;
        String str;
        View viewLIZLLL;
        switch (i) {
            case 1:
                return new C562830M5p(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ejc, viewGroup, false), viewGroup);
            case 2:
                return new C1259790it7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eel, viewGroup, false), this.LLLLLJLJLL, this.LLJJ);
            case 3:
                return new C2175981AEa(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eev, viewGroup, false), this.LLJJJIL);
            case 4:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case 21:
            case 23:
            default:
                IExternalHeaderProvider iExternalHeaderProvider = this.LLLIIIL;
                if (iExternalHeaderProvider != null && iExternalHeaderProvider.getViewType() == i) {
                    return this.LLLIIIL.onCreateViewHolder(viewGroup);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (((Boolean) C1EJQ.LJI.getValue()).booleanValue() && this.LLJJIJI) {
                    viewLIZLLL = C20673215v0.LIZLLL(R.layout.eeb, this.LLJJJIL, viewGroup, false);
                } else {
                    viewLIZLLL = C20673215v0.LIZLLL(R.layout.eea, this.LLJJJIL, viewGroup, false);
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("inflate cost time: ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C1720106oR.LJI("Profile_AwemeAdapter", C2188811AlT.LIZIZ(sbLIZ));
                this.LLLLIIL++;
                C1259780it6 c1259780it6 = new C1259780it6(viewLIZLLL, this.LLLLLJLJLL, this.LLJJ);
                if (((Boolean) C2277631ECz.LJ.getValue()).booleanValue()) {
                    c1259780it6.v6();
                }
                return c1259780it6;
            case 5:
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eew, viewGroup, false);
                return new RecyclerView.ViewHolder(viewTd) { // from class: X.0itK
                    {
                        super(viewTd);
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
                        c2344009Gk.LJIIIIZZ("action_type", "show");
                        c2344009Gk.LJIIIIZZ("optimize_type", "edit_profile");
                        C20684815ws.LJIILLIIL("optimize_profile", c2344009Gk.LIZ);
                        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0itJ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
                                if (c19egLIZIZ != null) {
                                    c19egLIZIZ.getSupportFragmentManager();
                                }
                                C786410Ut5.LJJJI("show_type", "show_type_profile_post_guide", new Bundle());
                                C2344009Gk c2344009Gk2 = new C2344009Gk();
                                c2344009Gk2.LJIIIIZZ("enter_from", "personal_homepage");
                                c2344009Gk2.LJIIIIZZ("action_type", "click");
                                c2344009Gk2.LJIIIIZZ("optimize_type", "edit_profile");
                                C20684815ws.LJIILLIIL("optimize_profile", c2344009Gk2.LIZ);
                            }
                        }, viewTd.findViewById(R.id.s08));
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("enter_from", "personal_homepage");
                        c2344009Gk2.LJIIIIZZ("action_type", "show");
                        c2344009Gk2.LJIIIIZZ("optimize_type", "find_friends");
                        C20684815ws.LJIILLIIL("optimize_profile", c2344009Gk2.LIZ);
                        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0itL
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C2344009Gk c2344009Gk3 = new C2344009Gk();
                                c2344009Gk3.LJIIIIZZ("enter_from", "personal_homepage");
                                c2344009Gk3.LJIIIIZZ("action_type", "click");
                                c2344009Gk3.LJIIIIZZ("optimize_type", "find_friends");
                                C20684815ws.LJIILLIIL("optimize_profile", c2344009Gk3.LIZ);
                            }
                        }, viewTd.findViewById(R.id.idt));
                        C2344009Gk c2344009Gk3 = new C2344009Gk();
                        c2344009Gk3.LJIIIIZZ("enter_from", "personal_homepage");
                        c2344009Gk3.LJIIIIZZ("action_type", "show");
                        c2344009Gk3.LJIIIIZZ("optimize_type", "shoot");
                        C20684815ws.LJIILLIIL("optimize_profile", c2344009Gk3.LIZ);
                        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0itM
                            @Override // android.view.View.OnClickListener
                            public final void onClick(final View view) {
                                IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
                                if (iExternalService != null) {
                                    if (!iExternalService.publishService().checkIsAlreadyPublished(view.getContext())) {
                                        return;
                                    }
                                    final String string = UUID.randomUUID().toString();
                                    iExternalService.asyncService("PostGuide", new IExternalService.ServiceLoadCallback() { // from class: X.0mPB
                                        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                                        public final void onDismiss() {
                                            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                                        }

                                        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                                        public final void onFailed() {
                                            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                                        }

                                        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                                        public final void onOK() {
                                            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                                        }

                                        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                                        public final void onLoad(AsyncAVService asyncAVService, long j) {
                                            IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
                                            Context context = view.getContext();
                                            RecordConfig.Builder builder = new RecordConfig.Builder();
                                            builder.shootWay("optimize_profile");
                                            builder.creationId(string);
                                            builder.enterFrom("personal_homepage");
                                            iRecordServiceRecordService.startRecord(context, builder.build());
                                        }
                                    });
                                    C2344009Gk c2344009Gk4 = new C2344009Gk();
                                    c2344009Gk4.LJIIIIZZ("enter_from", "personal_homepage");
                                    c2344009Gk4.LJIIIIZZ("shoot_way", "optimize_profile");
                                    c2344009Gk4.LJIIIIZZ("creation_id", string);
                                    C20684815ws.LJIILLIIL("shoot", c2344009Gk4.LIZ);
                                }
                                C2344009Gk c2344009Gk5 = new C2344009Gk();
                                c2344009Gk5.LJIIIIZZ("enter_from", "personal_homepage");
                                c2344009Gk5.LJIIIIZZ("action_type", "click");
                                c2344009Gk5.LJIIIIZZ("optimize_type", "shoot");
                                C20684815ws.LJIILLIIL("optimize_profile", c2344009Gk5.LIZ);
                            }
                        }, viewTd.findViewById(R.id.v62));
                    }
                };
            case 6:
                throw new IllegalArgumentException("not supported in i18n");
            case 7:
                throw new IllegalArgumentException("not supported in i18n");
            case 8:
                LLLLILI(false);
                return new C1259420isW(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eeg, viewGroup, false), this.LLJJJIL);
            case BdTuring.TYPE_ECAF /* 9 */:
                return new C1251890igN(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eej, viewGroup, false), this.LLJJJIL, this.LLJJJJ, this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (this.LLJJIJI) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                return ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJIIIZ(viewGroup, this.LLJJIJI, false, str, null);
            case BdTuring.TYPE_EMAIL /* 11 */:
                C0ROW c0rowLJJ = C1618440sDa.LIZIZ.LJJ();
                Context context = viewGroup.getContext();
                if (C1189504l3.LIZ()) {
                    i2 = R.layout.ef1;
                } else {
                    i2 = R.layout.ef0;
                }
                View viewLIZLLL2 = c0rowLJJ.LIZLLL(context, null, i2, viewGroup, false);
                if (C1189504l3.LIZ()) {
                    return new C1259400isU(viewLIZLLL2, this.LLJJJIL);
                }
                return new C1259410isV(viewLIZLLL2, this.LLJJJIL);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return new C1259680isw(C1618440sDa.LIZIZ.LJJ().LIZLLL(viewGroup.getContext(), null, R.layout.ef2, viewGroup, false), this.LLLLLJLJLL, this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new C1259460isa(viewGroup, this.LLJJJJ, this);
            case 14:
                LLLLILI(true);
                final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eck, viewGroup, false);
                return new RecyclerView.ViewHolder(viewTd2) { // from class: X.0isr
                };
            case 15:
                return new C1259440isY(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eep, viewGroup, false), this.LLJJJIL);
            case 16:
                return new C12E6(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eek, viewGroup, false), this.LLJJJIL, this.LLJJJJ, this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return new C1259830itB(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eji, viewGroup, false), this.LLJJIJIIJIL, this.LLJJJIL, this.LLJJ);
            case 19:
                return new C1260470iuD(this.LLJJJJ, this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ehx, viewGroup, false));
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return new C1259490isd(this.LLJJJIL, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ec3, viewGroup, false), this.LLJJJJJIL, new AObjectS393S0100000_19(this, 23));
            case 22:
                if (C1258400iqs.LIZ()) {
                    View viewLIZJ = C1258410iqt.LIZJ(this.LLJJIJIIJIL, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ccy, viewGroup, false), this.LLJJIJI);
                    if (viewLIZJ != null) {
                        return new C744640TIw(viewLIZJ);
                    }
                }
                return null;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return new C1251900igO(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ee6, viewGroup, false), this.LLLLJ, this.LLLLL, this.LLJJJJ);
            case 25:
                int i4 = C0M7J.LLJ;
                C0M7J c0m7j = new C0M7J(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ejg, viewGroup, false), this.LLJJJIL);
                c0m7j.LLILZIL = (TuxTextView) c0m7j.itemView.findViewById(R.id.title);
                c0m7j.LLILZLL = (C197039127h) c0m7j.itemView.findViewById(R.id.och);
                C786410Ut5.I7(new AkS80S0100000_8(c0m7j, 32), c0m7j.itemView);
                C197039127h c197039127h = c0m7j.LLILZLL;
                if (c197039127h != null) {
                    C786410Ut5.I7(new AkS80S0100000_8(c0m7j, 33), c197039127h);
                }
                return c0m7j;
            case 26:
                int i5 = C0M6J.LLJI;
                C0M6J c0m6j = new C0M6J(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ejh, viewGroup, false), this.LLJJJIL);
                if (c0m6j.itemView.getContext() != null && (lifecycleOwnerFindSAFExpLifecycleOwner = IMainSAFLifecycleKt.findSAFExpLifecycleOwner(viewGroup, (C19EG) null)) != null) {
                    c0m6j.LLILZ = new SafeHandler(lifecycleOwnerFindSAFExpLifecycleOwner);
                }
                c0m6j.LLILZIL = (SmartImageView) c0m6j.itemView.findViewById(R.id.cover);
                c0m6j.LLILZLL = (TuxTextView) c0m6j.itemView.findViewById(R.id.title);
                c0m6j.LLIZ = (TuxTextView) c0m6j.itemView.findViewById(R.id.ocj);
                c0m6j.LLIZLLLIL = c0m6j.itemView.findViewById(R.id.oci);
                c0m6j.LLJ = c0m6j.itemView.findViewById(R.id.och);
                SmartImageView smartImageView = c0m6j.LLILZIL;
                if (smartImageView != null) {
                    C786410Ut5.Q8(smartImageView, new ACListenerS143S0100000_8(c0m6j, 134));
                }
                C786410Ut5.U8((C197039127h) c0m6j.itemView.findViewById(R.id.och), new ACListenerS139S0100000_4(c0m6j, 83));
                AVDraftMigrateService aVDraftMigrateServiceI5 = c0m6j.I5();
                if (aVDraftMigrateServiceI5 != null && aVDraftMigrateServiceI5.isM2MigrateProfileHoverClicked()) {
                    c0m6j.N5(false);
                } else {
                    c0m6j.N5(true);
                }
                View view = c0m6j.LLJ;
                if (view != null) {
                    C786410Ut5.I7(new AkS76S0100000_4(c0m6j, 5), view);
                }
                View view2 = c0m6j.LLIZLLLIL;
                if (view2 != null) {
                    C786410Ut5.I7(new AkS76S0100000_4(c0m6j, 6), view2);
                }
                return c0m6j;
            case 27:
                if (this.LLLLLLL == null) {
                    InterfaceC1259480isc.LIZ.getClass();
                    ISearchCSIService iSearchCSIService = (ISearchCSIService) PluggableExtentionKt.pluggableSpi$default(ISearchCSIService.class, false, false, false, 14, null);
                    if (iSearchCSIService == null || (value = iSearchCSIService.LJI()) == null) {
                        value = C1259500ise.LIZIZ.getValue();
                    }
                    this.LLLLLLL = value;
                }
                return this.LLLLLLL.LIZ(viewGroup, this.LLJLLL);
            case 28:
                return new C1259510isf(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ei2, viewGroup, false));
            case 29:
                final View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eck, viewGroup, false);
                return new RecyclerView.ViewHolder(viewTd3) { // from class: X.0isr
                };
            case 30:
                AITheaterProfileService.LIZ.getClass();
                AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
                if (aITheaterProfileServiceLIZ == null || (interfaceC1257670iphT82 = aITheaterProfileServiceLIZ.T8()) == null) {
                    return null;
                }
                return interfaceC1257670iphT82.LIZJ(viewGroup);
            case 31:
                AITheaterProfileService.LIZ.getClass();
                AITheaterProfileService aITheaterProfileServiceLIZ2 = C563290M7j.LIZ();
                if (aITheaterProfileServiceLIZ2 == null || (interfaceC1257670iphT8 = aITheaterProfileServiceLIZ2.T8()) == null) {
                    return null;
                }
                return interfaceC1257670iphT8.LJIIIIZZ(viewGroup);
            case 32:
                IAIRemixService.LIZ.getClass();
                InterfaceC562850M5r interfaceC562850M5rLJIIJJI = C563030M6j.LIZ().LJIIJJI();
                if (interfaceC562850M5rLJIIJJI == null) {
                    return null;
                }
                return interfaceC562850M5rLJIIJJI.LIZ(viewGroup, this.LLJJJIL);
        }
    }

    @Override // X.AbstractC683510QrV
    public final void showPullUpLoadMore(RecyclerView recyclerView, boolean z) {
        super.showPullUpLoadMore(recyclerView, z);
    }

    public static void LLLLLJIL(Aweme aweme, int i, boolean z) {
        if (i == 4 && z && !C1259520isg.LIZIZ.isDataSetChangedOnStart() && aweme != null) {
            C1259520isg.LIZIZ.onVideoItemActionShow(aweme);
        }
    }

    public C1259360isQ(final C19EG c19eg, InterfaceC1259540isi interfaceC1259540isi, String str, boolean z, int i, InterfaceC1260110itd interfaceC1260110itd, InterfaceC645470PTl interfaceC645470PTl, String str2, String str3, InterfaceC1259640iss interfaceC1259640iss) {
        this.LLJJJIL = c19eg;
        this.LLJJJJ = interfaceC1259540isi;
        this.LLLLLJLJLL = str;
        this.LLJJ = interfaceC1260110itd;
        this.LLJJIJI = z;
        this.LLJJIJIIJIL = i;
        this.LLJJI = interfaceC645470PTl;
        this.LLJJJJJIL = str2;
        this.LLJJL = str3;
        this.LLLLIIIILLL = interfaceC1259640iss;
        registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0isR
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZIZ.LLLLLLL();
                if (C086I.LIZIZ(this.LIZIZ.mmItems)) {
                    return;
                }
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                C19EG c19eg2 = c19eg;
                c1253930ijf.getClass();
                INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
                boolean zLIZLLL = C0XF1.LIZLLL(c19eg2);
                boolean zIsWeakNetwork = iNetworkStateService.isWeakNetwork();
                int effectiveConnectionType = iNetworkStateService.getEffectiveConnectionType();
                if (!zLIZLLL || zIsWeakNetwork) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C0XQ7.LJ();
                    c2344009Gk.LJIIIIZZ("user_id", C0XQ7.LIZ.LJIIJ().getCurUserId());
                    c2344009Gk.LJ(C0XF1.LIZ(c19eg2), "network_type");
                    c2344009Gk.LJIIIIZZ("effective_connection_type", String.valueOf(effectiveConnectionType));
                    c2344009Gk.LJIIIIZZ("scene_type", "profile_works");
                    C20684815ws.LJIILLIIL("profile_poor_network", c2344009Gk.LIZ);
                }
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("current network status connectionType: ");
                sbLIZ.append(effectiveConnectionType);
                sbLIZ.append(" isNetAvailable: ");
                sbLIZ.append(zLIZLLL);
                sbLIZ.append(" isWeakNet: ");
                sbLIZ.append(zIsWeakNetwork);
                C1720106oR.LJI("Profile.ProfileStatics", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i2, int i3) {
                this.LIZIZ.LLLLLLL();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i2, int i3) {
                this.LIZIZ.LLLLLLL();
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i2, int i3) {
                this.LIZIZ.LLLLLLL();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i2, int i3) {
                this.LIZIZ.LLLLLLL();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZJ(int i2, int i3, Object obj) {
                LIZIZ(i2, i3);
                this.LIZIZ.LLLLLLL();
            }
        });
    }
}
