package X;

import Y.ACallableS18S0000100_9;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSettingParentCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P4Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4Z implements OnActivityResultCallback {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.$t) {
            case 0:
                onActivityResult$0(this, i, i2, intent);
                break;
            case 1:
                onActivityResult$1(this, i, i2, intent);
                break;
            case 2:
                onActivityResult$2(this, i, i2, intent);
                break;
            case 3:
                onActivityResult$3(this, i, i2, intent);
                break;
            case 4:
                onActivityResult$4(this, i, i2, intent);
                break;
        }
    }

    public C0P4Z(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onActivityResult$0(C0P4Z c0p4z, int i, int i2, Intent intent) {
        boolean zBooleanValue;
        String stringExtra;
        boolean zBooleanValue2;
        if (i == 10001 && i2 == -1 && intent != null) {
            BulletinProfileViewModel bulletinProfileViewModelI5 = ((BulletinSettingParentCell) c0p4z.l0).I5();
            Boolean bool = ((BulletinSettingParentCell) c0p4z.l0).I5().LLJJI;
            boolean zBooleanValue3 = false;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            bulletinProfileViewModelI5.LLJJI = Boolean.valueOf(intent.getBooleanExtra("live_room_auto_share_enable", zBooleanValue));
            BulletinProfileViewModel bulletinProfileViewModelI52 = ((BulletinSettingParentCell) c0p4z.l0).I5();
            Boolean bool2 = ((BulletinSettingParentCell) c0p4z.l0).I5().LLJJIII;
            if (bool2 != null) {
                zBooleanValue3 = bool2.booleanValue();
            }
            bulletinProfileViewModelI52.LLJJIII = Boolean.valueOf(intent.getBooleanExtra("live_event_auto_share_enable", zBooleanValue3));
            BulletinProfileViewModel bulletinProfileViewModelI53 = ((BulletinSettingParentCell) c0p4z.l0).I5();
            try {
                stringExtra = intent.getStringExtra("comment_enable");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            bulletinProfileViewModelI53.hx2(C619000OPq.LJIIIZ(stringExtra));
            BulletinProfileViewModel bulletinProfileViewModelI54 = ((BulletinSettingParentCell) c0p4z.l0).I5();
            Boolean bool3 = ((BulletinSettingParentCell) c0p4z.l0).I5().LLJJIJIIJIL;
            if (bool3 != null) {
                zBooleanValue2 = bool3.booleanValue();
            } else {
                zBooleanValue2 = true;
            }
            boolean booleanExtra = intent.getBooleanExtra("download_enable", zBooleanValue2);
            bulletinProfileViewModelI54.LLJJIJIIJIL = Boolean.valueOf(booleanExtra);
            bulletinProfileViewModelI54.setState(new AwS24S0010000_9(booleanExtra, 20));
        }
    }

    public static final void onActivityResult$1(C0P4Z c0p4z, int i, int i2, Intent intent) {
        DiscoverAndSearchFragment discoverAndSearchFragment = (DiscoverAndSearchFragment) c0p4z.l0;
        if (discoverAndSearchFragment.LLILZ > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - discoverAndSearchFragment.LLILZ;
            if (jElapsedRealtime > 0) {
                C15O7.LIZIZ(new ACallableS18S0000100_9(jElapsedRealtime, 1), C20684815ws.LJFF(), null);
            }
            discoverAndSearchFragment.LLILZ = -1L;
        }
    }

    public static final void onActivityResult$2(C0P4Z c0p4z, int i, int i2, Intent intent) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        if (i == 10001 && i2 == -1 && intent != null) {
            BulletinProfileViewModel bulletinProfileViewModelVo = ((BulletinBoardPageHybridAssem) c0p4z.l0).Vo();
            Boolean bool = ((BulletinBoardPageHybridAssem) c0p4z.l0).Vo().LLJJI;
            boolean zBooleanValue3 = false;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            bulletinProfileViewModelVo.LLJJI = Boolean.valueOf(intent.getBooleanExtra("live_room_auto_share_enable", zBooleanValue));
            BulletinProfileViewModel bulletinProfileViewModelVo2 = ((BulletinBoardPageHybridAssem) c0p4z.l0).Vo();
            Boolean bool2 = ((BulletinBoardPageHybridAssem) c0p4z.l0).Vo().LLJJIII;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            bulletinProfileViewModelVo2.LLJJIII = Boolean.valueOf(intent.getBooleanExtra("live_event_auto_share_enable", zBooleanValue2));
            BulletinProfileViewModel bulletinProfileViewModelVo3 = ((BulletinBoardPageHybridAssem) c0p4z.l0).Vo();
            Boolean bool3 = ((BulletinBoardPageHybridAssem) c0p4z.l0).Vo().LLJJIJI;
            if (bool3 != null) {
                zBooleanValue3 = bool3.booleanValue();
            }
            bulletinProfileViewModelVo3.hx2(Boolean.valueOf(intent.getBooleanExtra("comment_enable", zBooleanValue3)));
        }
    }

    public static final void onActivityResult$3(C0P4Z c0p4z, int i, int i2, Intent intent) {
        String stringExtra;
        if (intent != null) {
            BulletinPageBarAssem bulletinPageBarAssem = (BulletinPageBarAssem) c0p4z.l0;
            bulletinPageBarAssem.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinPageBarAssem, onActivityResult(), requestCode = ");
            sbLIZ.append(i);
            sbLIZ.append(", resultCode = ");
            sbLIZ.append(i2);
            sbLIZ.append(", data = ");
            sbLIZ.append(intent);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            if (i == 1 && i2 == -1) {
                C1440005kM.LIZ(new C0OKV());
                String stringExtra2 = null;
                try {
                    stringExtra = intent.getStringExtra("settings_event");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                if (!Intrinsics.LJFF(stringExtra, "delete_event")) {
                    try {
                        stringExtra2 = intent.getStringExtra("settings_event");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (!Intrinsics.LJFF(stringExtra2, "quit_event")) {
                        return;
                    }
                }
                C19EG c19egLIZ = C724240Sb0.LIZ(bulletinPageBarAssem);
                if (c19egLIZ != null) {
                    c19egLIZ.finish();
                }
            }
        }
    }

    public static final void onActivityResult$4(C0P4Z c0p4z, int i, int i2, Intent intent) {
        DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment;
        InterfaceC626480Ohi interfaceC626480Ohi;
        if (i2 != -1) {
            if (i2 == 400 && (interfaceC626480Ohi = (designerStickerDetailAwemeListFragment = (DesignerStickerDetailAwemeListFragment) c0p4z.l0).LLLLIL) != null) {
                ((StickerPropDetailFragment) interfaceC626480Ohi).yS(designerStickerDetailAwemeListFragment.getView(), "prop_page");
                return;
            }
            return;
        }
        DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment2 = (DesignerStickerDetailAwemeListFragment) c0p4z.l0;
        Aweme aweme = null;
        obj = null;
        Object obj = null;
        aweme = null;
        aweme = null;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    try {
                        obj = extras.get("extra_related_item");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    aweme = (Aweme) obj;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        designerStickerDetailAwemeListFragment2.LLLILZLLLI = aweme;
        C10EU.LIZ().setIsFeatureVideoChanged(Boolean.TRUE);
        DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment3 = (DesignerStickerDetailAwemeListFragment) c0p4z.l0;
        designerStickerDetailAwemeListFragment3.LLLJL = 1;
        designerStickerDetailAwemeListFragment3.cb(true, false);
    }
}
