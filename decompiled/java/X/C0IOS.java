package X;

import Y.ARunnableS13S0100100_7;
import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.feed.LiveOutSourceProviderConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.util.LiveOptDedupRoomExp;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IOS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IOS extends C0IOL implements C0IOX {
    public final Activity LLILZIL;
    public final EnterRoomConfig LLILZLL;
    public boolean LLIZ;
    public final List<EnterRoomConfig> LLIZLLLIL;
    public final C0IOU LLJ;
    public Map<String, ? extends Object> LLJI;
    public long LLJIJIL;
    public int LLJILJIL;
    public String LLJILJILJ;
    public final C0IOT LLJILLL;

    @Override // X.C0IOX
    public final void LJ() {
    }

    @Override // X.C0IOL, X.C0IOG
    public final Room LJIIJJI(int i) {
        return null;
    }

    @Override // X.C0IOL
    public final void LJIIL(C0ISF<Room> c0isf) {
    }

    @Override // X.C0IOL
    public final String LJIILLIIL(int i, long j) {
        return i == 2 ? "from outerSource." : "";
    }

    @Override // X.C0IOL
    public final String LJJI() {
        return "OutSourceRoomListProvider";
    }

    @Override // X.C0IOL
    public final List<Room> LJJ() {
        return new ArrayList();
    }

    @Override // X.C0IOL
    public final boolean LJJIFFI() {
        C0IOU c0iou = this.LLJ;
        return c0iou != null && c0iou.LJIIJJI();
    }

    @Override // X.C0IOG
    public final int size() {
        return ((ArrayList) this.LLIZLLLIL).size();
    }

    @Override // X.C0IOL
    public final void LJJIJL() {
        C0IOU c0iou;
        super.LJJIJL();
        Activity activity = this.LLILZIL;
        if (activity != null && activity.isFinishing() && (c0iou = this.LLJ) != null) {
            c0iou.release();
        }
        ((ArrayList) this.LLIZLLLIL).clear();
    }

    @Override // X.C0IOL
    public final String LJIJI() {
        return this.LLJILJILJ;
    }

    @Override // X.C0IOL
    public final int LJIJJLI() {
        return this.LLJILJIL;
    }

    @Override // X.C0IOL
    public final boolean LJJIIJ() {
        return this.LLIZ;
    }

    @Override // X.C0IOG
    public final EnterRoomConfig LIZIZ(int i) {
        return (EnterRoomConfig) ListProtector.get(this.LLIZLLLIL, i);
    }

    @Override // X.C0IOG
    public final int LJIIIIZZ(EnterRoomConfig enterRoomConfig) {
        int i = 0;
        if (LiveOutSourceProviderConfigSetting.fixGetItemPos()) {
            String strLJIJ = C0IOL.LJIJ(enterRoomConfig);
            int size = ((ArrayList) this.LLIZLLLIL).size();
            while (i < size) {
                Object obj = ListProtector.get(this.LLIZLLLIL, i);
                if (!Intrinsics.LJFF(C0IOL.LJIJ((EnterRoomConfig) obj), strLJIJ) || obj == null) {
                    i++;
                }
            }
            return -1;
        }
        long j = enterRoomConfig.mRoomsData.roomId;
        int size2 = ((ArrayList) this.LLIZLLLIL).size();
        while (i < size2) {
            if (((EnterRoomConfig) ListProtector.get(this.LLIZLLLIL, i)).mRoomsData.roomId != j) {
                i++;
            }
        }
        return -1;
        return i;
    }

    @Override // X.C0IOL
    public final List<Long> LJIILL(int i) {
        if (i < ((ArrayList) this.LLIZLLLIL).size() - 1) {
            List<EnterRoomConfig> list = this.LLIZLLLIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((EnterRoomConfig) it2.next()).mRoomsData.roomId));
            }
            return arrayList.subList(i + 1, ((ArrayList) this.LLIZLLLIL).size());
        }
        return null;
    }

    @Override // X.C0IOL
    public final void LJJIIJZLJL(int i) {
        HashMap map = new HashMap();
        this.LLJI = map;
        map.put("room_count_before_request", Integer.valueOf((size() - i) - 1));
        map.put("request_scene", "OutSourceRoomListProvider");
        map.put("is_landscape", Boolean.FALSE);
        this.LLJIJIL = SystemClock.elapsedRealtime();
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        C0IOU c0iou = this.LLJ;
        if (c0iou != null) {
            c0iou.LJIILL(((ArrayList) this.LLIZLLLIL).size() + i, this.LLJILLL);
        }
    }

    @Override // X.C0IOL
    public final void LJJIL(long j) {
        C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS13S0100100_7(this, j, 11));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0IOT] */
    public C0IOS(C19EG c19eg, EnterRoomConfig enterRoomConfig, C0IOU c0iou) {
        List<EnterRoomConfig> listLJIILJJIL;
        String str;
        this.LLILZIL = c19eg;
        this.LLILZLL = enterRoomConfig;
        ArrayList arrayList = new ArrayList();
        this.LLIZLLLIL = arrayList;
        this.LLJILJILJ = "";
        this.LLJILLL = new C0IOY() { // from class: X.0IOT
            @Override // X.C0IOY
            public final void onFail(int i) {
                HashMap map;
                C0IOS c0ios = this.LIZ;
                c0ios.LLIZ = false;
                Map<String, ? extends Object> map2 = c0ios.LLJI;
                if ((map2 instanceof HashMap) && (map = (HashMap) map2) != null) {
                    map.put("request_time", Long.valueOf(SystemClock.elapsedRealtime() - c0ios.LLJIJIL));
                    map.put("error_code", String.valueOf(i));
                    String str2 = c0ios.LLILZLL.mRoomsData.enterFromMerge;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    map.put("enter_from_merge", str2);
                    String str4 = c0ios.LLILZLL.mRoomsData.enterMethod;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    map.put("enter_method", str3);
                    C0IOL.LJJIZ(map);
                    c0ios.LLJILJILJ = String.valueOf(i);
                    c0ios.LLJI = null;
                    c0ios.LLJIJIL = 0L;
                }
            }

            @Override // X.C0IOY
            public final void onSuccess(List<EnterRoomConfig> list) {
                HashMap map;
                Object obj;
                C0IOS c0ios = this.LIZ;
                c0ios.LLIZ = false;
                Map<String, ? extends Object> map2 = c0ios.LLJI;
                if (map2 instanceof HashMap) {
                    map = (HashMap) map2;
                } else {
                    map = null;
                }
                String str2 = CardStruct.IStatusCode.DEFAULT;
                if (map != null) {
                    map.put("request_time", Long.valueOf(SystemClock.elapsedRealtime() - c0ios.LLJIJIL));
                    if (!(!((ArrayList) list).isEmpty())) {
                        obj = "-123";
                    } else {
                        obj = CardStruct.IStatusCode.DEFAULT;
                    }
                    map.put("error_code", obj);
                    String str3 = c0ios.LLILZLL.mRoomsData.enterFromMerge;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    map.put("enter_from_merge", str3);
                    String str5 = c0ios.LLILZLL.mRoomsData.enterMethod;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    map.put("enter_method", str4);
                    C0IOL.LJJIZ(map);
                    c0ios.LLJI = null;
                    c0ios.LLJIJIL = 0L;
                }
                C0IOS c0ios2 = this.LIZ;
                c0ios2.LLJILJIL++;
                ArrayList arrayList2 = (ArrayList) list;
                if (!(!arrayList2.isEmpty())) {
                    str2 = "-123";
                }
                c0ios2.LLJILJILJ = str2;
                List<EnterRoomConfig> list2 = this.LIZ.LLIZLLLIL;
                if (LiveOptDedupRoomExp.INSTANCE.enable() && !arrayList2.isEmpty() && list2 != null && !((ArrayList) list2).isEmpty()) {
                    try {
                        ArrayList arrayList3 = (ArrayList) list2;
                        HashSet hashSet = new HashSet(arrayList3.size());
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) C13LP.LJJJLZIJ(i, arrayList3);
                            if (enterRoomConfig2 != null) {
                                hashSet.add(Long.valueOf(enterRoomConfig2.mRoomsData.roomId));
                            }
                        }
                        ArrayList arrayList4 = (ArrayList) list;
                        ArrayList arrayList5 = new ArrayList(arrayList4.size());
                        int size2 = arrayList4.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            EnterRoomConfig enterRoomConfig3 = (EnterRoomConfig) C13LP.LJJJLZIJ(i2, list);
                            if (enterRoomConfig3 != null && !hashSet.contains(Long.valueOf(enterRoomConfig3.mRoomsData.roomId))) {
                                arrayList5.add(enterRoomConfig3);
                            }
                        }
                        list = arrayList5;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                ((ArrayList) this.LIZ.LLIZLLLIL).addAll(list);
                this.LIZ.LJIILJJIL();
            }
        };
        this.LLJ = c0iou;
        arrayList.clear();
        if (c0iou != null && (listLJIILJJIL = c0iou.LJIILJJIL()) != null) {
            for (EnterRoomConfig enterRoomConfig2 : listLJIILJJIL) {
                String str2 = enterRoomConfig2.mLogData.requestId;
                if (str2 != null && str2.length() != 0 && (str = enterRoomConfig2.mLogData.requestId) != null && str.length() != 0) {
                    if (LiveOutSourceProviderConfigSetting.fixGetItemPos()) {
                        if (Intrinsics.LJFF(C0IOL.LJIJ(enterRoomConfig2), C0IOL.LJIJ(this.LLILZLL))) {
                            ((ArrayList) this.LLIZLLLIL).add(this.LLILZLL);
                        } else {
                            ((ArrayList) this.LLIZLLLIL).add(enterRoomConfig2);
                        }
                    } else if (enterRoomConfig2.mRoomsData.roomId == this.LLILZLL.mRoomsData.roomId) {
                        ((ArrayList) this.LLIZLLLIL).add(this.LLILZLL);
                    } else {
                        ((ArrayList) this.LLIZLLLIL).add(enterRoomConfig2);
                    }
                } else if (enterRoomConfig2.mRoomsData.roomId == this.LLILZLL.mRoomsData.roomId) {
                    ((ArrayList) this.LLIZLLLIL).add(this.LLILZLL);
                } else {
                    ((ArrayList) this.LLIZLLLIL).add(enterRoomConfig2);
                }
            }
        }
    }
}
