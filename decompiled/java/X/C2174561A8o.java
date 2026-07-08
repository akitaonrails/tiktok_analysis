package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AccountVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AnalyticsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.MyQrCodeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.OrdersVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.PrivacyVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.ReferralInviteFriendsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.SecurityAndPermissionsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.ShareProfileVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.SignUpVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.TiktokPlusVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.WalletVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.CheckUpdateSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.ClearCacheVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.DataSaverVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.LiteModeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.LocalLiveWallpaperVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.OfflineVideosVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AccessibilitySettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ActivityCenterVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AdsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AudienceControlVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.BackgroundAudioVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.CommercialContentVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContactsAndLocationVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContentPreferenceVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.DisplayVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.FamilyPairingVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.JoinAmplifyVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LiveVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.MusicVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.NotificationVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.PlaybackVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ScreenTimeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ShortcutManagerVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.SwitchInboxModeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.BlockedAccountsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.PrivacyItemVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.AboutCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.AccountDeletionVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.BetaCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.FeedbackCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.OpenDebugCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PolicyUpdateVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PrivacyCenterVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PrivacyCheckupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.SupportCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.WhatsNewCellVM;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174561A8o {
    public static final void LIZJ(Fragment fragment, InterfaceC19211810Ea interfaceC19211810Ea) {
        AssemVMLazy assemVMLazy;
        if (interfaceC19211810Ea != EnumC2174461A8e.SECTION_HEADER) {
            if (interfaceC19211810Ea != EnumC2174461A8e.ANALYTICS_CENTER) {
                if (interfaceC19211810Ea != EnumC2174461A8e.NOTIFICATION_SETTINGS) {
                    if (interfaceC19211810Ea != EnumC2174461A8e.CONTENT_PREFERENCE) {
                        if (interfaceC19211810Ea != EnumC2174461A8e.LIVE_SETTINGS) {
                            if (interfaceC19211810Ea != EnumC2174461A8e.SCREEN_TIME) {
                                if (interfaceC19211810Ea != EnumC2174461A8e.FAMILY_PAIRING) {
                                    if (interfaceC19211810Ea != EnumC2174511A8j.SECTION_HEADER) {
                                        if (interfaceC19211810Ea != EnumC2174511A8j.SIGNUP) {
                                            if (interfaceC19211810Ea != EnumC2174511A8j.ACCOUNT_ITEM) {
                                                if (interfaceC19211810Ea != EnumC2174511A8j.PRIVACY) {
                                                    if (interfaceC19211810Ea != EnumC2174511A8j.SECURITY_AND_PERMISSIONS) {
                                                        if (interfaceC19211810Ea != EnumC2174511A8j.ANALYTICS) {
                                                            if (interfaceC19211810Ea != EnumC2174511A8j.ORDERS) {
                                                                if (interfaceC19211810Ea != EnumC2174511A8j.WALLET) {
                                                                    if (interfaceC19211810Ea != EnumC2174511A8j.QRCODE) {
                                                                        if (interfaceC19211810Ea != EnumC2174511A8j.SHARE_PROFILE) {
                                                                            if (interfaceC19211810Ea != EnumC2174511A8j.TIKTOK_PLUS) {
                                                                                if (interfaceC19211810Ea != EnumC2174511A8j.REFERRAL_INVITE_FRIENDS) {
                                                                                    if (interfaceC19211810Ea != EnumC1672210tcJ.VISIBILITY_SECTION_HEADER && interfaceC19211810Ea != EnumC1671280tao.INTERACTIONS_SECTION_HEADER) {
                                                                                        if (interfaceC19211810Ea != EnumC1672210tcJ.BLOCKED_ACCOUNT) {
                                                                                            if (!(interfaceC19211810Ea instanceof InterfaceC1688870u3B)) {
                                                                                                if (interfaceC19211810Ea != EnumC2174521A8k.SECTION_HEADER) {
                                                                                                    if (interfaceC19211810Ea != EnumC2174521A8k.OFFLINE_VIDEOS) {
                                                                                                        if (interfaceC19211810Ea != EnumC2174521A8k.CLEAR_CACHE) {
                                                                                                            if (interfaceC19211810Ea != EnumC2174521A8k.DATA_SAVER) {
                                                                                                                if (interfaceC19211810Ea != EnumC2174521A8k.LOCAL_LIVE_WALLPAPER) {
                                                                                                                    if (interfaceC19211810Ea != EnumC2174521A8k.CHECK_UPDATE) {
                                                                                                                        if (interfaceC19211810Ea != EnumC2174521A8k.LITE_MODE) {
                                                                                                                            if (interfaceC19211810Ea != EnumC2174471A8f.SECTION_HEADER) {
                                                                                                                                if (interfaceC19211810Ea != EnumC2174471A8f.NOTIFICATION_SETTINGS) {
                                                                                                                                    if (interfaceC19211810Ea != EnumC2174471A8f.LIVE_SETTINGS) {
                                                                                                                                        if (interfaceC19211810Ea != EnumC2174471A8f.MUSIC_SETTINGS) {
                                                                                                                                            if (interfaceC19211810Ea != EnumC2174471A8f.ANALYTICS_CENTER) {
                                                                                                                                                if (interfaceC19211810Ea != EnumC2174471A8f.CONTENT_PREFERENCE) {
                                                                                                                                                    if (interfaceC19211810Ea != EnumC2174471A8f.AUDIENCE_CONTROL) {
                                                                                                                                                        if (interfaceC19211810Ea != EnumC2174471A8f.BACKGROUND_AUDIO) {
                                                                                                                                                            if (interfaceC19211810Ea != EnumC2174471A8f.ADS_SETTINGS) {
                                                                                                                                                                if (interfaceC19211810Ea != EnumC2174471A8f.PLAYBACK_SETTINGS) {
                                                                                                                                                                    if (interfaceC19211810Ea != EnumC2174471A8f.DISPLAY) {
                                                                                                                                                                        if (interfaceC19211810Ea != EnumC2174471A8f.COMMERCIAL_CONTENT) {
                                                                                                                                                                            if (interfaceC19211810Ea != EnumC2174471A8f.LANGUAGE) {
                                                                                                                                                                                if (interfaceC19211810Ea != EnumC2174471A8f.SCREEN_TIME) {
                                                                                                                                                                                    if (interfaceC19211810Ea != EnumC2174471A8f.FAMILY_PAIRING) {
                                                                                                                                                                                        if (interfaceC19211810Ea != EnumC2174471A8f.ACCESSIBILITY) {
                                                                                                                                                                                            if (interfaceC19211810Ea != EnumC2174471A8f.SHORTCUT) {
                                                                                                                                                                                                if (interfaceC19211810Ea != EnumC2174471A8f.JOIN_AMPLIFY) {
                                                                                                                                                                                                    if (interfaceC19211810Ea != EnumC2174471A8f.SWITCH_INBOX_MODE) {
                                                                                                                                                                                                        if (interfaceC19211810Ea != EnumC2174471A8f.CONTACTS_AND_LOCATION) {
                                                                                                                                                                                                            if (interfaceC19211810Ea != EnumC2174421A8a.SECTION_HEADER) {
                                                                                                                                                                                                                if (interfaceC19211810Ea != EnumC2174421A8a.BASE_SETTINGS) {
                                                                                                                                                                                                                    if (interfaceC19211810Ea != EnumC2174421A8a.FEEDBACK) {
                                                                                                                                                                                                                        if (interfaceC19211810Ea != EnumC2174421A8a.SUPPORT) {
                                                                                                                                                                                                                            if (interfaceC19211810Ea != EnumC2174421A8a.ACCOUNT_DELETION) {
                                                                                                                                                                                                                                if (interfaceC19211810Ea != EnumC2174421A8a.PRIVACY_CHECKUP) {
                                                                                                                                                                                                                                    if (interfaceC19211810Ea != EnumC2174421A8a.PRIVACY_CENTER) {
                                                                                                                                                                                                                                        if (interfaceC19211810Ea != EnumC2174421A8a.ABOUT) {
                                                                                                                                                                                                                                            if (interfaceC19211810Ea != EnumC2174421A8a.POLICY_UPDATE) {
                                                                                                                                                                                                                                                if (interfaceC19211810Ea != EnumC2174421A8a.OPEN_DEBUG) {
                                                                                                                                                                                                                                                    if (interfaceC19211810Ea != EnumC2174421A8a.WHATS_NEW) {
                                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(WhatsNewCellVM.class);
                                                                                                                                                                                                                                                    C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 363);
                                                                                                                                                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(314);
                                                                                                                                                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3928), aFwS279S0000000_33, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3932), aFwS279S0000000_33, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OpenDebugCellVM.class);
                                                                                                                                                                                                                                                    C5182020e c5182020e2 = new C5182020e((C13IQ) c19719912DlLIZ2, 405);
                                                                                                                                                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(357);
                                                                                                                                                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), c5182020e2, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4015), aFwS279S0000000_332, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), c5182020e2, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4017), aFwS279S0000000_332, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PolicyUpdateVM.class);
                                                                                                                                                                                                                                                C5182020e c5182020e3 = new C5182020e((C13IQ) c19719912DlLIZ3, 397);
                                                                                                                                                                                                                                                AFwS279S0000000_33 aFwS279S0000000_333 = AFwS279S0000000_33.get$arr$(349);
                                                                                                                                                                                                                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ3), c5182020e3, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3997), aFwS279S0000000_333, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ3), c5182020e3, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3999), aFwS279S0000000_333, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(AboutCellVM.class);
                                                                                                                                                                                                                                            C5182020e c5182020e4 = new C5182020e((C13IQ) c19719912DlLIZ4, 387);
                                                                                                                                                                                                                                            AFwS279S0000000_33 aFwS279S0000000_334 = AFwS279S0000000_33.get$arr$(341);
                                                                                                                                                                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ4), c5182020e4, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3981), aFwS279S0000000_334, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ4), c5182020e4, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3984), aFwS279S0000000_334, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(PrivacyCenterVM.class);
                                                                                                                                                                                                                                        C5182020e c5182020e5 = new C5182020e((C13IQ) c19719912DlLIZ5, 379);
                                                                                                                                                                                                                                        AFwS279S0000000_33 aFwS279S0000000_335 = AFwS279S0000000_33.get$arr$(331);
                                                                                                                                                                                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ5), c5182020e5, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3963), aFwS279S0000000_335, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ5), c5182020e5, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3968), aFwS279S0000000_335, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(PrivacyCheckupVM.class);
                                                                                                                                                                                                                                    C5182020e c5182020e6 = new C5182020e((C13IQ) c19719912DlLIZ6, 370);
                                                                                                                                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_336 = AFwS279S0000000_33.get$arr$(321);
                                                                                                                                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ6), c5182020e6, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3943), aFwS279S0000000_336, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ6), c5182020e6, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3947), aFwS279S0000000_336, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(AccountDeletionVM.class);
                                                                                                                                                                                                                                C5182020e c5182020e7 = new C5182020e((C13IQ) c19719912DlLIZ7, 362);
                                                                                                                                                                                                                                AFwS279S0000000_33 aFwS279S0000000_337 = AFwS279S0000000_33.get$arr$(313);
                                                                                                                                                                                                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ7), c5182020e7, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3927), aFwS279S0000000_337, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ7), c5182020e7, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3931), aFwS279S0000000_337, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(SupportCellVM.class);
                                                                                                                                                                                                                            C5182020e c5182020e8 = new C5182020e((C13IQ) c19719912DlLIZ8, 404);
                                                                                                                                                                                                                            AFwS279S0000000_33 aFwS279S0000000_338 = AFwS279S0000000_33.get$arr$(356);
                                                                                                                                                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ8), c5182020e8, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4014), aFwS279S0000000_338, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ8), c5182020e8, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4016), aFwS279S0000000_338, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(FeedbackCellVM.class);
                                                                                                                                                                                                                        C5182020e c5182020e9 = new C5182020e((C13IQ) c19719912DlLIZ9, 396);
                                                                                                                                                                                                                        AFwS279S0000000_33 aFwS279S0000000_339 = AFwS279S0000000_33.get$arr$(348);
                                                                                                                                                                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ9), c5182020e9, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3996), aFwS279S0000000_339, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ9), c5182020e9, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3998), aFwS279S0000000_339, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    C19719912Dl c19719912DlLIZ10 = C13LE.LIZ(BetaCellVM.class);
                                                                                                                                                                                                                    C5182020e c5182020e10 = new C5182020e((C13IQ) c19719912DlLIZ10, 386);
                                                                                                                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_3310 = AFwS279S0000000_33.get$arr$(339);
                                                                                                                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ10), c5182020e10, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3977), aFwS279S0000000_3310, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ10), c5182020e10, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3980), aFwS279S0000000_3310, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            C19719912Dl c19719912DlLIZ11 = C13LE.LIZ(ContactsAndLocationVM.class);
                                                                                                                                                                                                            C5182020e c5182020e11 = new C5182020e((C13IQ) c19719912DlLIZ11, 378);
                                                                                                                                                                                                            AFwS279S0000000_33 aFwS279S0000000_3311 = AFwS279S0000000_33.get$arr$(330);
                                                                                                                                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ11), c5182020e11, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3961), aFwS279S0000000_3311, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ11), c5182020e11, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3962), aFwS279S0000000_3311, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        C19719912Dl c19719912DlLIZ12 = C13LE.LIZ(SwitchInboxModeVM.class);
                                                                                                                                                                                                        C5182020e c5182020e12 = new C5182020e((C13IQ) c19719912DlLIZ12, 369);
                                                                                                                                                                                                        AFwS279S0000000_33 aFwS279S0000000_3312 = AFwS279S0000000_33.get$arr$(320);
                                                                                                                                                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ12), c5182020e12, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3941), aFwS279S0000000_3312, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ12), c5182020e12, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3942), aFwS279S0000000_3312, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    C19719912Dl c19719912DlLIZ13 = C13LE.LIZ(JoinAmplifyVM.class);
                                                                                                                                                                                                    C5182020e c5182020e13 = new C5182020e((C13IQ) c19719912DlLIZ13, 413);
                                                                                                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_3313 = AFwS279S0000000_33.get$arr$(312);
                                                                                                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ13), c5182020e13, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3925), aFwS279S0000000_3313, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ13), c5182020e13, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3926), aFwS279S0000000_3313, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                C19719912Dl c19719912DlLIZ14 = C13LE.LIZ(ShortcutManagerVM.class);
                                                                                                                                                                                                C5182020e c5182020e14 = new C5182020e((C13IQ) c19719912DlLIZ14, 403);
                                                                                                                                                                                                AFwS279S0000000_33 aFwS279S0000000_3314 = AFwS279S0000000_33.get$arr$(355);
                                                                                                                                                                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ14), c5182020e14, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4010), aFwS279S0000000_3314, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ14), c5182020e14, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4013), aFwS279S0000000_3314, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            C19719912Dl c19719912DlLIZ15 = C13LE.LIZ(AccessibilitySettingsVM.class);
                                                                                                                                                                                            C5182020e c5182020e15 = new C5182020e((C13IQ) c19719912DlLIZ15, 393);
                                                                                                                                                                                            AFwS279S0000000_33 aFwS279S0000000_3315 = AFwS279S0000000_33.get$arr$(347);
                                                                                                                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ15), c5182020e15, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3994), aFwS279S0000000_3315, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                            } else {
                                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ15), c5182020e15, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3995), aFwS279S0000000_3315, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        C19719912Dl c19719912DlLIZ16 = C13LE.LIZ(FamilyPairingVM.class);
                                                                                                                                                                                        C5182020e c5182020e16 = new C5182020e((C13IQ) c19719912DlLIZ16, 384);
                                                                                                                                                                                        AFwS279S0000000_33 aFwS279S0000000_3316 = AFwS279S0000000_33.get$arr$(337);
                                                                                                                                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ16), c5182020e16, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3973), aFwS279S0000000_3316, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                        } else {
                                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ16), c5182020e16, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3976), aFwS279S0000000_3316, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    C19719912Dl c19719912DlLIZ17 = C13LE.LIZ(ScreenTimeVM.class);
                                                                                                                                                                                    C5182020e c5182020e17 = new C5182020e((C13IQ) c19719912DlLIZ17, 377);
                                                                                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_3317 = AFwS279S0000000_33.get$arr$(329);
                                                                                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ17), c5182020e17, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3958), aFwS279S0000000_3317, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                                    } else {
                                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ17), c5182020e17, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3960), aFwS279S0000000_3317, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            C19719912Dl c19719912DlLIZ18 = C13LE.LIZ(CommercialContentVM.class);
                                                                                                                                                                            C5182020e c5182020e18 = new C5182020e((C13IQ) c19719912DlLIZ18, 368);
                                                                                                                                                                            AFwS279S0000000_33 aFwS279S0000000_3318 = AFwS279S0000000_33.get$arr$(319);
                                                                                                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ18), c5182020e18, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3937), aFwS279S0000000_3318, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                            } else {
                                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ18), c5182020e18, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3940), aFwS279S0000000_3318, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        C19719912Dl c19719912DlLIZ19 = C13LE.LIZ(DisplayVM.class);
                                                                                                                                                                        C5182020e c5182020e19 = new C5182020e((C13IQ) c19719912DlLIZ19, 411);
                                                                                                                                                                        AFwS279S0000000_33 aFwS279S0000000_3319 = AFwS279S0000000_33.get$arr$(362);
                                                                                                                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ19), c5182020e19, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3921), aFwS279S0000000_3319, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                        } else {
                                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ19), c5182020e19, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3924), aFwS279S0000000_3319, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    C19719912Dl c19719912DlLIZ20 = C13LE.LIZ(PlaybackVM.class);
                                                                                                                                                                    C5182020e c5182020e20 = new C5182020e((C13IQ) c19719912DlLIZ20, 402);
                                                                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_3320 = AFwS279S0000000_33.get$arr$(354);
                                                                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ20), c5182020e20, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4004), aFwS279S0000000_3320, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                    } else {
                                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ20), c5182020e20, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4009), aFwS279S0000000_3320, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                C19719912Dl c19719912DlLIZ21 = C13LE.LIZ(AdsVM.class);
                                                                                                                                                                C5182020e c5182020e21 = new C5182020e((C13IQ) c19719912DlLIZ21, 392);
                                                                                                                                                                AFwS279S0000000_33 aFwS279S0000000_3321 = AFwS279S0000000_33.get$arr$(346);
                                                                                                                                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ21), c5182020e21, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3988), aFwS279S0000000_3321, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                                } else {
                                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ21), c5182020e21, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3993), aFwS279S0000000_3321, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            C19719912Dl c19719912DlLIZ22 = C13LE.LIZ(BackgroundAudioVM.class);
                                                                                                                                                            C5182020e c5182020e22 = new C5182020e((C13IQ) c19719912DlLIZ22, 383);
                                                                                                                                                            AFwS279S0000000_33 aFwS279S0000000_3322 = AFwS279S0000000_33.get$arr$(336);
                                                                                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ22), c5182020e22, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3967), aFwS279S0000000_3322, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                            } else {
                                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ22), c5182020e22, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3972), aFwS279S0000000_3322, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        C19719912Dl c19719912DlLIZ23 = C13LE.LIZ(AudienceControlVM.class);
                                                                                                                                                        C5182020e c5182020e23 = new C5182020e((C13IQ) c19719912DlLIZ23, 376);
                                                                                                                                                        AFwS279S0000000_33 aFwS279S0000000_3323 = AFwS279S0000000_33.get$arr$(327);
                                                                                                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ23), c5182020e23, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3951), aFwS279S0000000_3323, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                        } else {
                                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ23), c5182020e23, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3957), aFwS279S0000000_3323, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    C19719912Dl c19719912DlLIZ24 = C13LE.LIZ(ContentPreferenceVM.class);
                                                                                                                                                    C5182020e c5182020e24 = new C5182020e((C13IQ) c19719912DlLIZ24, 367);
                                                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_3324 = AFwS279S0000000_33.get$arr$(318);
                                                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ24), c5182020e24, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3936), aFwS279S0000000_3324, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                    } else {
                                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ24), c5182020e24, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3939), aFwS279S0000000_3324, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                C19719912Dl c19719912DlLIZ25 = C13LE.LIZ(ActivityCenterVM.class);
                                                                                                                                                C5182020e c5182020e25 = new C5182020e((C13IQ) c19719912DlLIZ25, 410);
                                                                                                                                                AFwS279S0000000_33 aFwS279S0000000_3325 = AFwS279S0000000_33.get$arr$(361);
                                                                                                                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ25), c5182020e25, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3920), aFwS279S0000000_3325, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                                } else {
                                                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ25), c5182020e25, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3923), aFwS279S0000000_3325, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            C19719912Dl c19719912DlLIZ26 = C13LE.LIZ(MusicVM.class);
                                                                                                                                            C5182020e c5182020e26 = new C5182020e((C13IQ) c19719912DlLIZ26, 401);
                                                                                                                                            AFwS279S0000000_33 aFwS279S0000000_3326 = AFwS279S0000000_33.get$arr$(353);
                                                                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ26), c5182020e26, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4003), aFwS279S0000000_3326, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                            } else {
                                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ26), c5182020e26, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4008), aFwS279S0000000_3326, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        C19719912Dl c19719912DlLIZ27 = C13LE.LIZ(LiveVM.class);
                                                                                                                                        C5182020e c5182020e27 = new C5182020e((C13IQ) c19719912DlLIZ27, 391);
                                                                                                                                        AFwS279S0000000_33 aFwS279S0000000_3327 = AFwS279S0000000_33.get$arr$(345);
                                                                                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ27), c5182020e27, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3987), aFwS279S0000000_3327, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                        } else {
                                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ27), c5182020e27, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3992), aFwS279S0000000_3327, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    C19719912Dl c19719912DlLIZ28 = C13LE.LIZ(NotificationVM.class);
                                                                                                                                    C5182020e c5182020e28 = new C5182020e((C13IQ) c19719912DlLIZ28, 382);
                                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_3328 = AFwS279S0000000_33.get$arr$(335);
                                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ28), c5182020e28, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3966), aFwS279S0000000_3328, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                                    } else {
                                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ28), c5182020e28, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3971), aFwS279S0000000_3328, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            C19719912Dl c19719912DlLIZ29 = C13LE.LIZ(LiteModeVM.class);
                                                                                                                            C5182020e c5182020e29 = new C5182020e((C13IQ) c19719912DlLIZ29, 375);
                                                                                                                            AFwS279S0000000_33 aFwS279S0000000_3329 = AFwS279S0000000_33.get$arr$(326);
                                                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ29), c5182020e29, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3950), aFwS279S0000000_3329, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                            } else {
                                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ29), c5182020e29, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3956), aFwS279S0000000_3329, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        C19719912Dl c19719912DlLIZ30 = C13LE.LIZ(CheckUpdateSettingsVM.class);
                                                                                                                        C5182020e c5182020e30 = new C5182020e((C13IQ) c19719912DlLIZ30, 365);
                                                                                                                        AFwS279S0000000_33 aFwS279S0000000_3330 = AFwS279S0000000_33.get$arr$(316);
                                                                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ30), c5182020e30, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3930), aFwS279S0000000_3330, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                        } else {
                                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ30), c5182020e30, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3935), aFwS279S0000000_3330, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    C19719912Dl c19719912DlLIZ31 = C13LE.LIZ(LocalLiveWallpaperVM.class);
                                                                                                                    C5182020e c5182020e31 = new C5182020e((C13IQ) c19719912DlLIZ31, 409);
                                                                                                                    AFwS279S0000000_33 aFwS279S0000000_3331 = AFwS279S0000000_33.get$arr$(360);
                                                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ31), c5182020e31, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4022), aFwS279S0000000_3331, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                    } else {
                                                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ31), c5182020e31, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3919), aFwS279S0000000_3331, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                C19719912Dl c19719912DlLIZ32 = C13LE.LIZ(DataSaverVM.class);
                                                                                                                C5182020e c5182020e32 = new C5182020e((C13IQ) c19719912DlLIZ32, 400);
                                                                                                                AFwS279S0000000_33 aFwS279S0000000_3332 = AFwS279S0000000_33.get$arr$(352);
                                                                                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ32), c5182020e32, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4002), aFwS279S0000000_3332, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                                } else {
                                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ32), c5182020e32, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4007), aFwS279S0000000_3332, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            C19719912Dl c19719912DlLIZ33 = C13LE.LIZ(ClearCacheVM.class);
                                                                                                            C5182020e c5182020e33 = new C5182020e((C13IQ) c19719912DlLIZ33, 390);
                                                                                                            AFwS279S0000000_33 aFwS279S0000000_3333 = AFwS279S0000000_33.get$arr$(344);
                                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ33), c5182020e33, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3986), aFwS279S0000000_3333, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                            } else {
                                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ33), c5182020e33, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3991), aFwS279S0000000_3333, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        C19719912Dl c19719912DlLIZ34 = C13LE.LIZ(OfflineVideosVM.class);
                                                                                                        C5182020e c5182020e34 = new C5182020e((C13IQ) c19719912DlLIZ34, 385);
                                                                                                        AFwS279S0000000_33 aFwS279S0000000_3334 = AFwS279S0000000_33.get$arr$(338);
                                                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ34), c5182020e34, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3974), aFwS279S0000000_3334, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                        } else {
                                                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ34), c5182020e34, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3978), aFwS279S0000000_3334, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    return;
                                                                                                }
                                                                                            } else {
                                                                                                AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(interfaceC19211810Ea, 843);
                                                                                                AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28(interfaceC19211810Ea, 844);
                                                                                                C19719912Dl c19719912DlLIZ35 = C13LE.LIZ(PrivacyItemVM.class);
                                                                                                AFwS279S0000000_33 aFwS279S0000000_3335 = AFwS279S0000000_33.get$arr$(334);
                                                                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ35), awS572S0100000_28, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), awS572S0100000_282, aFwS279S0000000_3335, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                                } else {
                                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ35), awS572S0100000_28, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), awS572S0100000_282, aFwS279S0000000_3335, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            C19719912Dl c19719912DlLIZ36 = C13LE.LIZ(BlockedAccountsVM.class);
                                                                                            C5182020e c5182020e35 = new C5182020e((C13IQ) c19719912DlLIZ36, 374);
                                                                                            AFwS279S0000000_33 aFwS279S0000000_3336 = AFwS279S0000000_33.get$arr$(325);
                                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ36), c5182020e35, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3949), aFwS279S0000000_3336, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                            } else {
                                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ36), c5182020e35, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3959), aFwS279S0000000_3336, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        return;
                                                                                    }
                                                                                } else {
                                                                                    C19719912Dl c19719912DlLIZ37 = C13LE.LIZ(ReferralInviteFriendsVM.class);
                                                                                    C5182020e c5182020e36 = new C5182020e((C13IQ) c19719912DlLIZ37, 366);
                                                                                    AFwS279S0000000_33 aFwS279S0000000_3337 = AFwS279S0000000_33.get$arr$(317);
                                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ37), c5182020e36, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3934), aFwS279S0000000_3337, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                    } else {
                                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ37), c5182020e36, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3938), aFwS279S0000000_3337, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                C19719912Dl c19719912DlLIZ38 = C13LE.LIZ(TiktokPlusVM.class);
                                                                                C5182020e c5182020e37 = new C5182020e((C13IQ) c19719912DlLIZ38, 407);
                                                                                AFwS279S0000000_33 aFwS279S0000000_3338 = AFwS279S0000000_33.get$arr$(359);
                                                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ38), c5182020e37, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4019), aFwS279S0000000_3338, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                                } else {
                                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ38), c5182020e37, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3922), aFwS279S0000000_3338, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            C19719912Dl c19719912DlLIZ39 = C13LE.LIZ(ShareProfileVM.class);
                                                                            C5182020e c5182020e38 = new C5182020e((C13IQ) c19719912DlLIZ39, 399);
                                                                            AFwS279S0000000_33 aFwS279S0000000_3339 = AFwS279S0000000_33.get$arr$(351);
                                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ39), c5182020e38, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4001), aFwS279S0000000_3339, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                            } else {
                                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ39), c5182020e38, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4006), aFwS279S0000000_3339, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        C19719912Dl c19719912DlLIZ40 = C13LE.LIZ(MyQrCodeVM.class);
                                                                        C5182020e c5182020e39 = new C5182020e((C13IQ) c19719912DlLIZ40, 389);
                                                                        AFwS279S0000000_33 aFwS279S0000000_3340 = AFwS279S0000000_33.get$arr$(343);
                                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ40), c5182020e39, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3983), aFwS279S0000000_3340, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                        } else {
                                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ40), c5182020e39, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3990), aFwS279S0000000_3340, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                        }
                                                                    }
                                                                } else {
                                                                    C19719912Dl c19719912DlLIZ41 = C13LE.LIZ(WalletVM.class);
                                                                    C5182020e c5182020e40 = new C5182020e((C13IQ) c19719912DlLIZ41, 381);
                                                                    AFwS279S0000000_33 aFwS279S0000000_3341 = AFwS279S0000000_33.get$arr$(333);
                                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ41), c5182020e40, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3965), aFwS279S0000000_3341, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                    } else {
                                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ41), c5182020e40, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3970), aFwS279S0000000_3341, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                    }
                                                                }
                                                            } else {
                                                                C19719912Dl c19719912DlLIZ42 = C13LE.LIZ(OrdersVM.class);
                                                                C5182020e c5182020e41 = new C5182020e((C13IQ) c19719912DlLIZ42, 372);
                                                                AFwS279S0000000_33 aFwS279S0000000_3342 = AFwS279S0000000_33.get$arr$(323);
                                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ42), c5182020e41, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3945), aFwS279S0000000_3342, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                                } else {
                                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ42), c5182020e41, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3954), aFwS279S0000000_3342, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                                }
                                                            }
                                                        } else {
                                                            C19719912Dl c19719912DlLIZ43 = C13LE.LIZ(AnalyticsVM.class);
                                                            C5182020e c5182020e42 = new C5182020e((C13IQ) c19719912DlLIZ43, 364);
                                                            AFwS279S0000000_33 aFwS279S0000000_3343 = AFwS279S0000000_33.get$arr$(315);
                                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ43), c5182020e42, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3929), aFwS279S0000000_3343, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                            } else {
                                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ43), c5182020e42, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3933), aFwS279S0000000_3343, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                            }
                                                        }
                                                    } else {
                                                        C19719912Dl c19719912DlLIZ44 = C13LE.LIZ(SecurityAndPermissionsVM.class);
                                                        C5182020e c5182020e43 = new C5182020e((C13IQ) c19719912DlLIZ44, 406);
                                                        AFwS279S0000000_33 aFwS279S0000000_3344 = AFwS279S0000000_33.get$arr$(358);
                                                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ44), c5182020e43, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4018), aFwS279S0000000_3344, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                        } else {
                                                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ44), c5182020e43, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4021), aFwS279S0000000_3344, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                        }
                                                    }
                                                } else {
                                                    C19719912Dl c19719912DlLIZ45 = C13LE.LIZ(PrivacyVM.class);
                                                    C5182020e c5182020e44 = new C5182020e((C13IQ) c19719912DlLIZ45, 398);
                                                    AFwS279S0000000_33 aFwS279S0000000_3345 = AFwS279S0000000_33.get$arr$(350);
                                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ45), c5182020e44, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4000), aFwS279S0000000_3345, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                    } else {
                                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ45), c5182020e44, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4005), aFwS279S0000000_3345, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                    }
                                                }
                                            } else {
                                                C19719912Dl c19719912DlLIZ46 = C13LE.LIZ(AccountVM.class);
                                                C5182020e c5182020e45 = new C5182020e((C13IQ) c19719912DlLIZ46, 388);
                                                AFwS279S0000000_33 aFwS279S0000000_3346 = AFwS279S0000000_33.get$arr$(342);
                                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ46), c5182020e45, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3982), aFwS279S0000000_3346, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                                } else {
                                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ46), c5182020e45, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3989), aFwS279S0000000_3346, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                                }
                                            }
                                        } else {
                                            C19719912Dl c19719912DlLIZ47 = C13LE.LIZ(SignUpVM.class);
                                            C5182020e c5182020e46 = new C5182020e((C13IQ) c19719912DlLIZ47, 380);
                                            AFwS279S0000000_33 aFwS279S0000000_3347 = AFwS279S0000000_33.get$arr$(332);
                                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ47), c5182020e46, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3964), aFwS279S0000000_3347, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                            } else {
                                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ47), c5182020e46, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3969), aFwS279S0000000_3347, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    C19719912Dl c19719912DlLIZ48 = C13LE.LIZ(FamilyPairingVM.class);
                                    C5182020e c5182020e47 = new C5182020e((C13IQ) c19719912DlLIZ48, 371);
                                    AFwS279S0000000_33 aFwS279S0000000_3348 = AFwS279S0000000_33.get$arr$(322);
                                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ48), c5182020e47, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3944), aFwS279S0000000_3348, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                    } else {
                                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ48), c5182020e47, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3953), aFwS279S0000000_3348, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                    }
                                }
                            } else {
                                C19719912Dl c19719912DlLIZ49 = C13LE.LIZ(ScreenTimeVM.class);
                                C5182020e c5182020e48 = new C5182020e((C13IQ) c19719912DlLIZ49, 394);
                                AFwS279S0000000_33 aFwS279S0000000_3349 = AFwS279S0000000_33.get$arr$(363);
                                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ49), c5182020e48, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3952), aFwS279S0000000_3349, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                                } else {
                                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ49), c5182020e48, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4020), aFwS279S0000000_3349, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                                }
                            }
                        } else {
                            C19719912Dl c19719912DlLIZ50 = C13LE.LIZ(LiveVM.class);
                            C5182020e c5182020e49 = new C5182020e((C13IQ) c19719912DlLIZ50, 408);
                            AFwS279S0000000_33 aFwS279S0000000_3350 = AFwS279S0000000_33.get$arr$(324);
                            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ50), c5182020e49, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3979), aFwS279S0000000_3350, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                            } else {
                                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ50), c5182020e49, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3946), aFwS279S0000000_3350, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                            }
                        }
                    } else {
                        C19719912Dl c19719912DlLIZ51 = C13LE.LIZ(ContentPreferenceVM.class);
                        C5182020e c5182020e50 = new C5182020e((C13IQ) c19719912DlLIZ51, 373);
                        AFwS279S0000000_33 aFwS279S0000000_3351 = AFwS279S0000000_33.get$arr$(340);
                        if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ51), c5182020e50, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4012), aFwS279S0000000_3351, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                        } else {
                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ51), c5182020e50, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3975), aFwS279S0000000_3351, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                        }
                    }
                } else {
                    C19719912Dl c19719912DlLIZ52 = C13LE.LIZ(NotificationVM.class);
                    C5182020e c5182020e51 = new C5182020e((C13IQ) c19719912DlLIZ52, 395);
                    AFwS279S0000000_33 aFwS279S0000000_3352 = AFwS279S0000000_33.get$arr$(364);
                    if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ52), c5182020e51, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3955), aFwS279S0000000_3352, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                    } else {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ52), c5182020e51, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4011), aFwS279S0000000_3352, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                    }
                }
            } else {
                C19719912Dl c19719912DlLIZ53 = C13LE.LIZ(ActivityCenterVM.class);
                C5182020e c5182020e52 = new C5182020e((C13IQ) c19719912DlLIZ53, 412);
                AFwS279S0000000_33 aFwS279S0000000_3353 = AFwS279S0000000_33.get$arr$(328);
                if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ53), c5182020e52, C724750Sbp.LIZLLL(), C724750Sbp.LJI(fragment), C724750Sbp.LJIIIIZZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3985), aFwS279S0000000_3353, C724750Sbp.LJ(fragment, true), C724750Sbp.LIZJ(fragment, true), C724750Sbp.LJFF(fragment, true));
                } else {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ53), c5182020e52, C724750Sbp.LIZLLL(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3948), aFwS279S0000000_3353, C724750Sbp.LJ(fragment, false), C724750Sbp.LIZJ(fragment, false), C724750Sbp.LJFF(fragment, false));
                }
            }
            assemVMLazy.getValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZ(X.InterfaceC19211810Ea r3) {
        /*
            boolean r0 = r3 instanceof X.EnumC19320810iM
            r1 = 0
            if (r0 == 0) goto L14
            r2 = -1
            X.07zh r0 = X.EnumC19320810iM.getEntries()
            int r0 = r0.indexOf(r3)
        Le:
            int r1 = r0 + 1
        L10:
            int r0 = r2 * 100
            int r0 = r0 + r1
            return r0
        L14:
            boolean r0 = r3 instanceof X.EnumC2174461A8e
            if (r0 != 0) goto L42
            boolean r0 = r3 instanceof X.EnumC2174511A8j
            if (r0 == 0) goto L2a
            r2 = 1
        L1d:
            boolean r0 = r3 instanceof X.EnumC2174461A8e
            if (r0 == 0) goto L44
            X.07zh r0 = X.EnumC2174461A8e.getEntries()
            int r0 = r0.indexOf(r3)
            goto Le
        L2a:
            boolean r0 = r3 instanceof X.InterfaceC1688870u3B
            if (r0 == 0) goto L30
            r2 = 2
            goto L1d
        L30:
            boolean r0 = r3 instanceof X.EnumC2174471A8f
            if (r0 == 0) goto L36
            r2 = 3
            goto L1d
        L36:
            boolean r0 = r3 instanceof X.EnumC2174521A8k
            if (r0 == 0) goto L3c
            r2 = 4
            goto L1d
        L3c:
            boolean r0 = r3 instanceof X.EnumC2174421A8a
            if (r0 == 0) goto L42
            r2 = 5
            goto L1d
        L42:
            r2 = 0
            goto L1d
        L44:
            boolean r0 = r3 instanceof X.EnumC2174511A8j
            if (r0 == 0) goto L51
            X.07zh r0 = X.EnumC2174511A8j.getEntries()
            int r0 = r0.indexOf(r3)
            goto Le
        L51:
            boolean r0 = r3 instanceof X.EnumC1672210tcJ
            if (r0 == 0) goto L5e
            X.07zh r0 = X.EnumC1672210tcJ.getEntries()
            int r0 = r0.indexOf(r3)
            goto Le
        L5e:
            boolean r0 = r3 instanceof X.EnumC1671280tao
            if (r0 == 0) goto L76
            X.07zh r0 = X.EnumC1672210tcJ.getEntries()
            int r1 = r0.size()
            X.07zh r0 = X.EnumC1671280tao.getEntries()
            int r0 = r0.indexOf(r3)
            int r1 = r1 + r0
            int r1 = r1 + 1
            goto L10
        L76:
            boolean r0 = r3 instanceof X.EnumC2174521A8k
            if (r0 == 0) goto L83
            X.07zh r0 = X.EnumC2174521A8k.getEntries()
            int r0 = r0.indexOf(r3)
            goto Le
        L83:
            boolean r0 = r3 instanceof X.EnumC2174471A8f
            if (r0 == 0) goto L91
            X.07zh r0 = X.EnumC2174471A8f.getEntries()
            int r0 = r0.indexOf(r3)
            goto Le
        L91:
            boolean r0 = r3 instanceof X.EnumC2174421A8a
            if (r0 == 0) goto L10
            X.07zh r0 = X.EnumC2174421A8a.getEntries()
            int r0 = r0.indexOf(r3)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2174561A8o.LIZ(X.10Ea):int");
    }

    public static final boolean LIZIZ(InterfaceC19211810Ea interfaceC19211810Ea) {
        if (interfaceC19211810Ea instanceof EnumC2174461A8e) {
            return ((EnumC2174461A8e) interfaceC19211810Ea).getHeadingItem();
        }
        if (interfaceC19211810Ea instanceof InterfaceC1688870u3B) {
            return interfaceC19211810Ea.getHeadingItem();
        }
        if (interfaceC19211810Ea instanceof EnumC2174511A8j) {
            return ((EnumC2174511A8j) interfaceC19211810Ea).getHeadingItem();
        }
        if (interfaceC19211810Ea instanceof EnumC2174521A8k) {
            return ((EnumC2174521A8k) interfaceC19211810Ea).getHeadingItem();
        }
        return false;
    }
}
