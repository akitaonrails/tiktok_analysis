package X;

import Y.AfS103S0300000_7;
import Y.AfS143S0200000_7;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.setting.LiveDrawListBackupSetting;
import com.bytedance.android.livesdk.setting.LoadMoreRetrySetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ISZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ISZ {
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public AnonymousClass0956 LIZLLL;
    public C11JF LJ;
    public final List<Long> LJFF = new ArrayList();
    public final List<Room> LJI = new ArrayList();
    public String LJII = "";
    public EnumC466740ISa LJIIIIZZ;
    public long LJIIIZ;

    public C0ISZ(String str) {
        this.LIZ = str;
    }

    public final void LIZLLL(Function2<? super List<? extends FeedItem>, ? super FeedExtra, Unit> function2) {
        if (this.LJ != null) {
            return;
        }
        this.LJIIIZ = System.currentTimeMillis();
        C238400w2 c238400w2 = new C238400w2();
        HashMap map = new HashMap();
        map.put("content_type", "8");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_simple");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long jRequestDelay = LiveDrawListBackupSetting.INSTANCE.requestDelay();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tryLoadMore: start delayMs=");
        sbLIZ2.append(jRequestDelay);
        C20441214yg.LIZIZ("BackupDataManager", C2188811AlT.LIZIZ(sbLIZ2));
        C480460Ism.LIZ().getClass();
        this.LJ = (C11JF) new C19500311Qz(((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed("/webcast/feed/", 0L, strLIZIZ, map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIL(new AfS143S0200000_7((Object) this, (EmoteModel) c238400w2, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 28)), C11NZ.LJLJL(jRequestDelay, TimeUnit.MILLISECONDS, C11S5.LIZIZ)).LJJLL(new AfS103S0300000_7(c238400w2, this, function2, 20), new AfS143S0200000_7((Object) this, (EmoteModel) c238400w2, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 29));
    }

    public final void LIZIZ(Integer num, Function2<? super List<? extends Room>, ? super String, Unit> function2) {
        if ((LiveDrawListBackupSetting.INSTANCE.enable(this.LIZ) || LoadMoreRetrySetting.INSTANCE.useBackupData()) && num != null && num.intValue() == 0 && (!((ArrayList) this.LJI).isEmpty())) {
            function2.invoke(this.LJI, this.LJII);
            ((ArrayList) this.LJI).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r22, kotlin.jvm.functions.Function2 r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ISZ.LJ(java.lang.String, kotlin.jvm.functions.Function2, boolean):void");
    }

    public final int LIZ(EnumC466740ISa enumC466740ISa, List<? extends FeedItem> list, FeedExtra feedExtra, Function2<? super List<? extends FeedItem>, ? super FeedExtra, Unit> function2) {
        if (!list.isEmpty()) {
            List<Room> list2 = this.LJI;
            ArrayList arrayList = new ArrayList();
            Iterator<? extends FeedItem> it2 = list.iterator();
            while (it2.hasNext()) {
                Room room = it2.next().getRoom();
                if (room != null) {
                    arrayList.add(room);
                }
            }
            ((ArrayList) list2).addAll(arrayList);
            String str = feedExtra.unreadExtra;
            if (str == null) {
                str = "";
            }
            this.LJII = str;
            this.LJIIIIZZ = enumC466740ISa;
            function2.invoke(list, feedExtra);
        }
        return list.size();
    }

    public final void LIZJ(int i, String str, long j, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_api_status");
        c474500IjALIZ.LJJII(this.LIZ, "entry_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "leaves_count");
        c474500IjALIZ.LJJII(str, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(str2, "exception");
        c474500IjALIZ.LIZ();
    }
}
