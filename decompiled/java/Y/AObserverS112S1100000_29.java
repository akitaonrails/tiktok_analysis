package Y;

import X.C19591211ks;
import X.C19625211qM;
import X.C1ACD;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C486660J6q;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.HashMap;

/* JADX INFO: loaded from: classes30.dex */
public class AObserverS112S1100000_29 implements Observer {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS112S1100000_29 aObserverS112S1100000_29, Object obj) {
        String string;
        String string2;
        String string3;
        Boolean bool = (Boolean) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selectedObserver observe ");
        sbLIZ.append(bool);
        sbLIZ.append("，owner name = ");
        sbLIZ.append(aObserverS112S1100000_29.s0);
        sbLIZ.append(", roomId = ");
        sbLIZ.append(((C19625211qM) aObserverS112S1100000_29.l1).LLJJIII);
        C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
        if (bool.booleanValue()) {
            ((C19625211qM) aObserverS112S1100000_29.l1).LLJLIL = System.currentTimeMillis();
            C19625211qM c19625211qM = (C19625211qM) aObserverS112S1100000_29.l1;
            boolean z = c19625211qM.LLJJ;
            String str = CardStruct.IStatusCode.DEFAULT;
            if (!z && !c19625211qM.LLJLLL) {
                c19625211qM.LLJLLL = true;
                Long l = c19625211qM.LLJJIII;
                if (l == null || (string3 = l.toString()) == null) {
                    string3 = CardStruct.IStatusCode.DEFAULT;
                }
                boolean z2 = C486660J6q.LIZ;
                HashMap map = new HashMap();
                map.put("room_id", string3);
                C20684815ws.LJIILLIIL("livesdk_multi_story_show", map);
            }
            C19625211qM c19625211qM2 = (C19625211qM) aObserverS112S1100000_29.l1;
            if (c19625211qM2.LLJJLIIIJLLLLLLLZ) {
                Long l2 = c19625211qM2.LLJJIII;
                if (l2 == null || (string = l2.toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                LiveRoomStruct liveRoomStruct = ((C19625211qM) aObserverS112S1100000_29.l1).LLJJJJJIL;
                if (liveRoomStruct != null && (string2 = Long.valueOf(liveRoomStruct.getAnchorId()).toString()) != null) {
                    str = string2;
                }
                c19625211qM2.LJI(System.currentTimeMillis() - ((C19625211qM) aObserverS112S1100000_29.l1).LLJLIL, string, str);
            }
            C1ACD c1acd = ((C19625211qM) aObserverS112S1100000_29.l1).LLJJI;
            if (c1acd != null && !c1acd.LJJII()) {
                C19625211qM c19625211qM3 = (C19625211qM) aObserverS112S1100000_29.l1;
                if (!c19625211qM3.LLJJLIIIJLLLLLLLZ) {
                    LiveRoomStruct liveRoomStruct2 = c19625211qM3.LLJJJJJIL;
                    if (liveRoomStruct2 != null) {
                        c19625211qM3.LJIIIIZZ(null, liveRoomStruct2);
                    } else {
                        C20441214yg.LJ("LiveShareSticker", "selectedObserver true, but netRoomStruct == null");
                    }
                }
            }
            C19625211qM c19625211qM4 = (C19625211qM) aObserverS112S1100000_29.l1;
            if (c19625211qM4.LLJJIJI && !c19625211qM4.LLJJLIIIJLLLLLLLZ) {
                c19625211qM4.LLJL = System.currentTimeMillis();
                return;
            }
            return;
        }
        C1ACD c1acd2 = ((C19625211qM) aObserverS112S1100000_29.l1).LLJJI;
        if (c1acd2 != null && c1acd2.LJJII()) {
            C1ACD c1acd3 = ((C19625211qM) aObserverS112S1100000_29.l1).LLJJI;
            if (c1acd3 != null) {
                c1acd3.LJJJJIZL();
            }
            ((C19625211qM) aObserverS112S1100000_29.l1).LLJJJ = false;
        }
        ((C19625211qM) aObserverS112S1100000_29.l1).LIZLLL();
    }

    public static final void onChanged$1(AObserverS112S1100000_29 aObserverS112S1100000_29, Object obj) {
        Boolean boolValueOf;
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData;
        Integer num = (Integer) obj;
        Long lValueOf = null;
        if (num != null) {
            if (num.intValue() == 2) {
                ((C19625211qM) aObserverS112S1100000_29.l1).LIZLLL();
                C1ACD c1acd = ((C19625211qM) aObserverS112S1100000_29.l1).LLJJI;
                if (c1acd != null && c1acd.LJJII()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ON_PAUSE, pause living, owner name = ");
                    sbLIZ.append(aObserverS112S1100000_29.s0);
                    sbLIZ.append(", roomId = ");
                    LiveRoomStruct liveRoomStruct = ((C19625211qM) aObserverS112S1100000_29.l1).LLJJJJJIL;
                    if (liveRoomStruct != null) {
                        lValueOf = Long.valueOf(liveRoomStruct.id);
                    }
                    sbLIZ.append(lValueOf);
                    C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
                    C1ACD c1acd2 = ((C19625211qM) aObserverS112S1100000_29.l1).LLJJI;
                    if (c1acd2 != null) {
                        c1acd2.LJJJJIZL();
                    }
                    ((C19625211qM) aObserverS112S1100000_29.l1).LLJJJ = false;
                    return;
                }
                return;
            }
            if (num.intValue() != 1) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ON_RESUME, resume living. owner name = ");
            sbLIZ2.append(aObserverS112S1100000_29.s0);
            sbLIZ2.append(", isPlaying = ");
            C1ACD c1acd3 = ((C19625211qM) aObserverS112S1100000_29.l1).LLJJI;
            if (c1acd3 != null) {
                boolValueOf = Boolean.valueOf(c1acd3.LJJII());
            } else {
                boolValueOf = null;
            }
            sbLIZ2.append(boolValueOf);
            sbLIZ2.append(", isSubscribe = ");
            C19591211ks interactStickerContainerCommonParam = ((C19625211qM) aObserverS112S1100000_29.l1).getInteractStickerContainerCommonParam();
            if (interactStickerContainerCommonParam != null && (mutableLiveData = interactStickerContainerCommonParam.LJIILIIL) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            sbLIZ2.append(value);
            C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ2));
            C19625211qM c19625211qM = (C19625211qM) aObserverS112S1100000_29.l1;
            if (c19625211qM.LLJJIJI && !c19625211qM.LLJJLIIIJLLLLLLLZ) {
                c19625211qM.LLJL = System.currentTimeMillis();
            }
            C19625211qM c19625211qM2 = (C19625211qM) aObserverS112S1100000_29.l1;
            if (c19625211qM2.LLJJLIIIJLLLLLLLZ) {
                return;
            }
            LiveRoomStruct liveRoomStruct2 = c19625211qM2.LLJJJJJIL;
            if (liveRoomStruct2 != null) {
                c19625211qM2.LJIIIIZZ(null, liveRoomStruct2);
            } else {
                C20441214yg.LJ("LiveShareSticker", "HolderState resume, but netRoomStruct == null");
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS112S1100000_29(X.C19625211qM r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS112S1100000_29.<init>(X.11qM, java.lang.String, int):void");
    }
}
