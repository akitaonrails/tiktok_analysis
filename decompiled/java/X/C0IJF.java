package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0IJF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJF implements InterfaceC469360Ias {
    public static final /* synthetic */ int LLIZ = 0;
    public C0IOL LL;
    public final long[] LLILLJJLI;
    public final List<Long> LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        int length;
        final ArrayList arrayList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected prevPosition: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", newPosition: ");
        sbLIZ.append(i);
        sbLIZ.append(", hasCommitedRemove: ");
        sbLIZ.append(this.LLILZLL);
        C20441214yg.LIZIZ("CastersNoInterestController", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZLL) {
            return;
        }
        long[] jArr = this.LLILLJJLI;
        if (jArr != null) {
            length = jArr.length;
        } else {
            length = 0;
        }
        if (i > length) {
            this.LLILZLL = true;
            C20441214yg.LIZIZ("CastersNoInterestController", "already entered recommends, disable detect");
        }
        int i2 = this.LLILZIL;
        if (i < i2) {
            this.LLILZ = System.currentTimeMillis();
            this.LLILZIL = i;
            ((ArrayList) this.LLILLL).clear();
            C20441214yg.LIZIZ("CastersNoInterestController", "detected swipe back, cleared latestShowDuration list");
            return;
        }
        if (i > i2) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
            if (jCurrentTimeMillis > LivePreCreateNextRoomPlayer.ENABLE) {
                this.LLILZ = System.currentTimeMillis();
                this.LLILZIL = i;
                ((ArrayList) this.LLILLL).clear();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("detected stay time ");
                sbLIZ2.append(jCurrentTimeMillis);
                sbLIZ2.append("ms, exceed the limit ");
                sbLIZ2.append(LivePreCreateNextRoomPlayer.ENABLE);
                sbLIZ2.append("ms , cleared latestShowDuration list");
                C20441214yg.LIZIZ("CastersNoInterestController", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            ((ArrayList) this.LLILLL).add(Long.valueOf(jCurrentTimeMillis));
            this.LLILZ = System.currentTimeMillis();
            this.LLILZIL = i;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("append a no interest count, its stay time ");
            sbLIZ3.append(jCurrentTimeMillis);
            sbLIZ3.append("ms, list = ");
            sbLIZ3.append(this.LLILLL);
            C20441214yg.LIZIZ("CastersNoInterestController", C2188811AlT.LIZIZ(sbLIZ3));
            if (((ArrayList) this.LLILLL).size() >= 3) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("hit swipeCount limit ");
                sbLIZ4.append(3);
                sbLIZ4.append(", doRemoveUnreadRoom, list = ");
                sbLIZ4.append(this.LLILLL);
                C20441214yg.LIZIZ("CastersNoInterestController", C2188811AlT.LIZIZ(sbLIZ4));
                long[] jArr2 = this.LLILLJJLI;
                if (jArr2 != null) {
                    arrayList = new ArrayList();
                    int length2 = jArr2.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length2) {
                        long j = jArr2[i3];
                        int i5 = i4 + 1;
                        if (i4 > this.LLILZIL) {
                            arrayList.add(Long.valueOf(j));
                        }
                        i3++;
                        i4 = i5;
                    }
                } else {
                    arrayList = null;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("doRemoveUnreadRoom unReadRoomIds = ");
                sbLIZ5.append(arrayList);
                C20441214yg.LIZIZ("CastersNoInterestController", C2188811AlT.LIZIZ(sbLIZ5));
                C0IOL c0iol = this.LL;
                if (c0iol != null) {
                    c0iol.LJIIL(new C0ISF<Room>() { // from class: X.0IJE
                        @Override // X.C0ISF
                        public final boolean LIZ(Room room) {
                            List<Long> list = arrayList;
                            if (list != null && list.contains(Long.valueOf(room.getId()))) {
                                return true;
                            }
                            return false;
                        }
                    });
                }
                this.LLILZLL = true;
            }
        }
    }

    public C0IJF(EnterRoomConfig enterRoomConfig, C0IOL c0iol) {
        long[] jArr;
        this.LL = c0iol;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (roomsData != null) {
            jArr = roomsData.roomIds;
        } else {
            jArr = null;
        }
        this.LLILLJJLI = jArr;
        this.LLILLL = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inited roomIds.length = ");
        sbLIZ.append(jArr != null ? Integer.valueOf(jArr.length) : null);
        C20441214yg.LIZIZ("CastersNoInterestController", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ = System.currentTimeMillis();
        this.LLILZIL = 0;
    }
}
