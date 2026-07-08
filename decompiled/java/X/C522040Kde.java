package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.liveinteract.match.business.event.MvpDialogVisibleChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Kde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C522040Kde extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (4 - this.$t != 0) {
            super.LJJZZIII(interfaceC1541990qEH, str);
        } else {
            LJJZZIII$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (4 - this.$t != 0) {
            super.LJLIIIL(interfaceC1541990qEH);
        } else {
            LJLIIIL$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (4 - this.$t != 0) {
            super.LJLIIL(interfaceC1541990qEH, str);
        } else {
            LJLIIL$0(this, interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLJLLL(SparkContext sparkContext) {
        switch (this.$t) {
            case 1:
                LJLJLLL$0(this, sparkContext);
                break;
            case 2:
                LJLJLLL$1(this, sparkContext);
                break;
            case 3:
                LJLJLLL$2(this, sparkContext);
                break;
            case 4:
            default:
                super.LJLJLLL(sparkContext);
                break;
            case 5:
                LJLJLLL$3(this, sparkContext);
                break;
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLL(SparkContext sparkContext) {
        switch (this.$t) {
            case 0:
                LJLL$0(this, sparkContext);
                break;
            case 1:
                LJLL$1(this, sparkContext);
                break;
            case 2:
                LJLL$2(this, sparkContext);
                break;
            case 3:
                LJLL$3(this, sparkContext);
                break;
            case 4:
            default:
                super.LJLL(sparkContext);
                break;
            case 5:
                LJLL$4(this, sparkContext);
                break;
        }
    }

    public C522040Kde(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C522040Kde c522040Kde, InterfaceC1541990qEH interfaceC1541990qEH) {
        Long lValueOf;
        Room room = ((C520360Kaw) c522040Kde.l0).LJI;
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        Room room2 = ((C520360Kaw) c522040Kde.l0).LJI;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getOwnerUserId());
        }
        Long lValueOf3 = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
        CustomTab customTab = ((C520360Kaw) c522040Kde.l0).LIZJ;
        C182700n3.LIZ(lValueOf, lValueOf2, lValueOf3, "multi_tab_lynx_item_load_finish", 1, 1, customTab.tabSchema, customTab.tabTitle);
    }

    public static final void LJLJLLL$0(C522040Kde c522040Kde, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) c522040Kde.l0;
        if (dataChannel != null) {
            dataChannel.zW(MvpDialogVisibleChannel.class, Boolean.TRUE);
        }
    }

    public static final void LJLJLLL$1(C522040Kde c522040Kde, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) c522040Kde.l0;
        if (dataChannel != null) {
            dataChannel.zW(PollVisibleChannel.class, Boolean.TRUE);
        }
    }

    public static final void LJLJLLL$2(C522040Kde c522040Kde, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) c522040Kde.l0;
        if (dataChannel != null) {
            dataChannel.zW(MvpDialogVisibleChannel.class, Boolean.TRUE);
        }
    }

    public static final void LJLJLLL$3(C522040Kde c522040Kde, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) c522040Kde.l0;
        if (dataChannel != null) {
            dataChannel.zW(MvpDialogVisibleChannel.class, Boolean.TRUE);
        }
    }

    public static final void LJLL$0(C522040Kde c522040Kde, SparkContext sparkContext) {
        if (((Boolean) C0B6I.LIZ.getValue()).booleanValue()) {
            List<Fragment> listLJJLIIIJL = ((TranslucentActivity) c522040Kde.l0).getSupportFragmentManager().LJJLIIIJL();
            ArrayList arrayList = new ArrayList();
            for (Fragment fragment : listLJJLIIIJL) {
                if (fragment instanceof SparkPopup) {
                    arrayList.add(fragment);
                }
            }
            if (arrayList.isEmpty()) {
                ((TranslucentActivity) c522040Kde.l0).finish();
                return;
            }
            return;
        }
        ((TranslucentActivity) c522040Kde.l0).finish();
    }

    public static final void LJLL$1(C522040Kde c522040Kde, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) c522040Kde.l0;
        if (dataChannel != null) {
            dataChannel.zW(MvpDialogVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void LJLL$2(C522040Kde c522040Kde, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) c522040Kde.l0;
        if (dataChannel != null) {
            dataChannel.zW(PollVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void LJLL$3(C522040Kde c522040Kde, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) c522040Kde.l0;
        if (dataChannel != null) {
            dataChannel.zW(MvpDialogVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void LJLL$4(C522040Kde c522040Kde, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) c522040Kde.l0;
        if (dataChannel != null) {
            dataChannel.zW(MvpDialogVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void LJJZZIII$0(C522040Kde c522040Kde, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        Long lValueOf;
        Room room = ((C520360Kaw) c522040Kde.l0).LJI;
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        Room room2 = ((C520360Kaw) c522040Kde.l0).LJI;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getOwnerUserId());
        }
        Long lValueOf3 = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
        CustomTab customTab = ((C520360Kaw) c522040Kde.l0).LIZJ;
        C182700n3.LIZ(lValueOf, lValueOf2, lValueOf3, "multi_tab_lynx_item_load_failed", 1, 0, customTab.tabSchema, customTab.tabTitle);
    }

    public static final void LJLIIL$0(C522040Kde c522040Kde, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        Long lValueOf;
        Room room = ((C520360Kaw) c522040Kde.l0).LJI;
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        Room room2 = ((C520360Kaw) c522040Kde.l0).LJI;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getOwnerUserId());
        }
        Long lValueOf3 = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
        CustomTab customTab = ((C520360Kaw) c522040Kde.l0).LIZJ;
        C182700n3.LIZ(lValueOf, lValueOf2, lValueOf3, "multi_tab_lynx_item_load_start", 1, 1, customTab.tabSchema, customTab.tabTitle);
    }
}
