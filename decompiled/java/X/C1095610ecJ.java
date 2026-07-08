package X;

import Y.AfS6S0100100_17;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.level.FansClubPreloadTaskPageSetting;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.jvm.internal.AwS626S0100000_12;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ecJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095610ecJ {
    public final DataChannel LIZ;
    public Pair<Integer, String> LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C1095630ecL LJ;
    public Uri LJFF;
    public final int LJI;
    public InterfaceC1541990qEH LJII;
    public String LJIIIIZZ = "";

    public final void LIZ() {
        Room room;
        User owner;
        String secUid;
        Room room2;
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("prerender", "1");
        linkedHashMap.put("enable_prefetch", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("spark_perf_biz", "JoinFansClubBiz");
        linkedHashMap.put("prerender_exp_group", String.valueOf(this.LJI));
        C1094580eae c1094580eae = C1094580eae.LIZ;
        String str = this.LJIIIIZZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C1094590eaf c1094590eaf = new C1094590eaf(str, true, false, EnumC1095860eci.FANS_CLUB_ANIM_PLUS_TO_ONE_UNKOWN, 0, null, null, null, null, 496);
        c1094580eae.getClass();
        Uri uri = UriProtector.parse(C1094580eae.LJ(c1094590eaf, linkedHashMap));
        this.LJFF = uri;
        final C1095630ecL c1095630ecL = new C1095630ecL(uri);
        this.LJ = c1095630ecL;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = "JoinFansClubBiz";
        c1097680efe.LJIJ = 1;
        c1097680efe.LJIIIIZZ = new AwS626S0100000_12(c1095630ecL, 50);
        c1097680efe.LJIJJ = AFwS326S0000000_1.get$arr$(7);
        c1097680efe.LJ = false;
        c1097680efe.LJJ = true;
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        c1095630ecL.LIZIZ = 0;
        if (uri != null && (string = uri.toString()) != null) {
            str2 = string;
        }
        String strLIZIZ = C1547760qNa.LIZIZ(str2);
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLIZIZ);
        C1537060q6K.LJIIJJI(c1537060q6K, strLIZIZ, "JoinFansClubBiz", sparkContext, new C1537070q6L() { // from class: X.0ecM
            @Override // X.C1537070q6L
            public final void LIZJ(String str3, String str4, C1537080q6M c1537080q6M) {
                c1095630ecL.LIZIZ = 2;
            }

            @Override // X.C1537070q6L
            public final void LIZLLL(String str3, String str4, InterfaceC1105930esx interfaceC1105930esx) {
                C1095630ecL c1095630ecL2 = c1095630ecL;
                c1095630ecL2.LIZ = interfaceC1105930esx;
                c1095630ecL2.LIZIZ = 1;
            }
        }, true, null, 32);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            return;
        }
        DataChannel dataChannel2 = this.LIZ;
        String strValueOf = String.valueOf((dataChannel2 == null || (room2 = (Room) dataChannel2.gg0(RoomChannel.class)) == null) ? 0L : room2.getId());
        long jCurrentTimeMillis = System.currentTimeMillis();
        C480460Ism.LIZ().getClass();
        ((FansClubApi) C480460Ism.LIZLLL(FansClubApi.class)).getJoinFansTaskInfo(secUid, strValueOf, "true").LJIILIIL(new C0UO0()).LJJLL(new AfS6S0100100_17(jCurrentTimeMillis, this, 10), new AfS6S0100100_17(jCurrentTimeMillis, this, 11));
    }

    public final JSONObject LIZIZ() {
        String second;
        Pair<Integer, String> pair = this.LIZIZ;
        if (pair == null || (second = pair.getSecond()) == null) {
            second = "";
        }
        if (TextUtils.isEmpty(second)) {
            return new JSONObject();
        }
        Pair<Integer, String> pair2 = this.LIZIZ;
        return new JSONObject(pair2 != null ? pair2.getSecond() : null);
    }

    public final int LIZJ() {
        Pair<Integer, String> pair = this.LIZIZ;
        if (pair != null) {
            return pair.getFirst().intValue();
        }
        return 0;
    }

    public final void LJ() {
        Object obj;
        LynxView lynxView;
        if (this.LIZJ && this.LIZLLL && (obj = this.LJII) != null) {
            TemplateData templateData = new TemplateData();
            templateData.LJIILIIL("initial_data", LIZIZ());
            C1095630ecL c1095630ecL = this.LJ;
            templateData.LJIILIIL("preload_status", Integer.valueOf(c1095630ecL != null ? c1095630ecL.LIZIZ : 0));
            templateData.LJIILIIL("mock_data_status", Integer.valueOf(LIZJ()));
            templateData.LJIILIIL("data_source_type", "update_data");
            if (!(obj instanceof C1537710q7N) || (lynxView = (LynxView) obj) == null) {
                return;
            }
            lynxView.updateData(templateData);
        }
    }

    public C1095610ecJ(DataChannel dataChannel) {
        int value;
        this.LIZ = dataChannel;
        if (!FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
            value = FansClubPreloadTaskPageSetting.INSTANCE.getValue();
        } else {
            value = 0;
        }
        this.LJI = value;
    }

    public final void LIZLLL(String str, boolean z) {
        int i;
        C1095630ecL c1095630ecL = this.LJ;
        if (c1095630ecL != null) {
            i = c1095630ecL.LIZIZ;
        } else {
            i = -1;
        }
        if (i > -1) {
            return;
        }
        this.LJIIIIZZ = str;
        int i2 = this.LJI;
        if (i2 != 1) {
            if (i2 == 2 && z) {
                LIZ();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        LIZ();
    }
}
