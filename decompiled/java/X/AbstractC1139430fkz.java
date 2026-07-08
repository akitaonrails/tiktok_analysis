package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.gift.base.platform.business.effect.model.LiveRoomEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.gift.GiftEffectObserveLiveRoomEventSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS37S0310000_17;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS69S0210000_17;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1139430fkz implements WeakHandler.IHandler {
    public DataChannel LLILLJJLI;
    public volatile boolean LLILLL;
    public volatile C1136560fgM LLILZIL;
    public volatile InterfaceC1138060fim LLILZLL;
    public C1139610flH LLIZ;
    public final WeakHandler LL = new WeakHandler(Looper.getMainLooper(), this);
    public final Object LLILZ = new Object();
    public final C1139520fl8 LLIZLLLIL = new AbstractC1140590fmr() { // from class: X.0fl8
        @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
        public final void LIZIZ(EnumC1138990fkH enumC1138990fkH) {
            this.LIZ.LJIIJ(200);
        }

        @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
        public final void LIZLLL(EnumC1138990fkH enumC1138990fkH) {
            InterfaceC1139780flY interfaceC1139780flYLIZJ;
            InterfaceC1139780flY interfaceC1139780flYLIZJ2;
            C1136560fgM c1136560fgM = this.LIZ.LLILZIL;
            if (c1136560fgM != null && (interfaceC1139780flYLIZJ2 = c1136560fgM.LIZJ()) != null) {
                interfaceC1139780flYLIZJ2.LJII();
            }
            C1136560fgM c1136560fgM2 = this.LIZ.LLILZIL;
            if (c1136560fgM2 != null && (interfaceC1139780flYLIZJ = c1136560fgM2.LIZJ()) != null) {
                interfaceC1139780flYLIZJ.LJIIJ(1);
            }
            this.LIZ.LJ();
            C1141770fol.LIZ(this.LIZ.LLILZIL);
            this.LIZ.LJIIIIZZ();
        }

        @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
        public final void LJIIIIZZ(EnumC1138990fkH enumC1138990fkH) {
            InterfaceC1139780flY interfaceC1139780flYLIZJ;
            C1136560fgM c1136560fgM = this.LIZ.LLILZIL;
            if (c1136560fgM != null && (interfaceC1139780flYLIZJ = c1136560fgM.LIZJ()) != null) {
                interfaceC1139780flYLIZJ.LIZ();
            }
        }

        @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
        public final void LIZ(EnumC1138990fkH enumC1138990fkH, boolean z) {
            InterfaceC1139780flY interfaceC1139780flYLIZJ;
            C1136560fgM c1136560fgM = this.LIZ.LLILZIL;
            if (c1136560fgM != null && (interfaceC1139780flYLIZJ = c1136560fgM.LIZJ()) != null) {
                interfaceC1139780flYLIZJ.LJFF(z);
            }
            C1136560fgM c1136560fgM2 = this.LIZ.LLILZIL;
            if (c1136560fgM2 != null) {
                c1136560fgM2.LJJIJLIJ = true;
            }
            this.LIZ.LJ();
            if (z) {
                C1141770fol.LIZ(this.LIZ.LLILZIL);
            }
        }

        /* JADX WARN: Type inference failed for: r0v14, types: [X.0flH] */
        @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
        public final void LJ(EnumC1138990fkH enumC1138990fkH, Message message) {
            String string;
            Object c098200Yq;
            InterfaceC1139780flY interfaceC1139780flYLIZJ;
            InterfaceC1139780flY interfaceC1139780flYLIZJ2;
            int i = message.what;
            if (i != 57) {
                if (i != 4106) {
                    if (i != 140002) {
                        this.LIZ.LJII(enumC1138990fkH, message);
                        return;
                    }
                    C1136560fgM c1136560fgM = this.LIZ.LLILZIL;
                    if (c1136560fgM == null || (interfaceC1139780flYLIZJ2 = c1136560fgM.LIZJ()) == null) {
                        return;
                    }
                    interfaceC1139780flYLIZJ2.LJIIL();
                    return;
                }
                C1136560fgM c1136560fgM2 = this.LIZ.LLILZIL;
                if (c1136560fgM2 == null || (interfaceC1139780flYLIZJ = c1136560fgM2.LIZJ()) == null) {
                    return;
                }
                interfaceC1139780flYLIZJ.LJIILLIIL(message.arg1, message.arg2);
                return;
            }
            int i2 = message.arg1;
            if (i2 != 100 && i2 != 101) {
                this.LIZ.LJII(enumC1138990fkH, message);
                return;
            }
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj == null || (string = messageObj.toString()) == null) {
                string = "";
            }
            if (!C500260Jjc.LJJIIZ(string)) {
                return;
            }
            final AbstractC1139430fkz abstractC1139430fkz = this.LIZ;
            try {
                List<LiveRoomEvent> list = (List) C2334609Cu.LIZ.LJIIIIZZ(string, new TypeToken<List<? extends LiveRoomEvent>>() { // from class: X.0fmL
                }.getType());
                if (!list.isEmpty()) {
                    if (message.arg1 == 100) {
                        C1139610flH c1139610flH = abstractC1139430fkz.LLIZ;
                        if (c1139610flH != null) {
                            C1139440fl0.LJ(c1139610flH);
                        }
                        ?? r0 = new InterfaceC1140620fmu() { // from class: X.0flH
                            @Override // X.InterfaceC1140620fmu
                            public void onEvent(JSONArray jSONArray) {
                                LiveEffect liveEffect;
                                Long lValueOf;
                                C1136560fgM c1136560fgM3 = abstractC1139430fkz.LLILZIL;
                                String filePath = null;
                                if (c1136560fgM3 != null) {
                                    liveEffect = c1136560fgM3.LJJIJIL;
                                } else {
                                    liveEffect = null;
                                }
                                InterfaceC1268640j7O interfaceC1268640j7OLJ = C1137660fi8.LJ();
                                if (interfaceC1268640j7OLJ != null && liveEffect != null) {
                                    try {
                                        int iSendEffectMsg = interfaceC1268640j7OLJ.sendEffectMsg(57, 102, 0, jSONArray.toString());
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("sendLiveRoomEvent, result=");
                                        sbLIZ.append(iSendEffectMsg);
                                        sbLIZ.append(", effectId=");
                                        sbLIZ.append(liveEffect.getEffectId());
                                        sbLIZ.append(", eventCount=");
                                        sbLIZ.append(jSONArray.length());
                                        C20441214yg.LJIIIZ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ));
                                        C470360IcU.LIZ(new AwS556S0100000_12(jSONArray, 335));
                                        C189200o6.m2constructorimpl(Unit.LIZ);
                                        return;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                        return;
                                    }
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("sendLiveRoomEvent fail, filterManager = ");
                                sbLIZ2.append(interfaceC1268640j7OLJ);
                                sbLIZ2.append(", effectId=");
                                if (liveEffect != null) {
                                    lValueOf = Long.valueOf(liveEffect.getEffectId());
                                } else {
                                    lValueOf = null;
                                }
                                sbLIZ2.append(lValueOf);
                                sbLIZ2.append(", filePath=");
                                if (liveEffect != null) {
                                    filePath = liveEffect.getFilePath();
                                }
                                sbLIZ2.append(filePath);
                                C20441214yg.LJ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        };
                        abstractC1139430fkz.LLIZ = r0;
                        C1139440fl0.LIZLLL(list, r0);
                    } else {
                        abstractC1139430fkz.LJIILLIIL(list);
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            AbstractC1139430fkz abstractC1139430fkz2 = this.LIZ;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return;
            }
            abstractC1139430fkz2.LJI("observe live room event error", thM5exceptionOrNullimpl);
        }

        @Override // X.InterfaceC1140870fnJ
        public final void LJI(EnumC1138990fkH enumC1138990fkH, C1141050fnb c1141050fnb) {
            this.LIZ.LJIIJ(c1141050fnb.LIZ);
        }

        @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
        public final void LJIIIZ(EnumC1138990fkH enumC1138990fkH, C1138610fjf c1138610fjf) {
            InterfaceC1139780flY interfaceC1139780flYLIZJ;
            AbstractC1139430fkz abstractC1139430fkz = this.LIZ;
            abstractC1139430fkz.getClass();
            abstractC1139430fkz.LJIILLIIL(null);
            C1136560fgM c1136560fgM = abstractC1139430fkz.LLILZIL;
            if (c1136560fgM != null && (interfaceC1139780flYLIZJ = c1136560fgM.LIZJ()) != null) {
                interfaceC1139780flYLIZJ.LJIJI();
            }
            abstractC1139430fkz.LIZLLL();
        }
    };

    public abstract InterfaceC1141260fnw LIZIZ();

    public abstract String LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ();

    public void LJII(EnumC1138990fkH enumC1138990fkH, Message message) {
    }

    public void LJIIIIZZ() {
    }

    public abstract void LJIIIZ(C1136560fgM c1136560fgM, AssetsModel assetsModel);

    public abstract void LJIIJJI(C1136560fgM c1136560fgM, AssetsModel assetsModel);

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public final boolean LJFF() {
        return this.LLILZIL != null;
    }

    public final void LJIILJJIL() {
        synchronized (this.LLILZ) {
            try {
                this.LL.removeCallbacksAndMessages(null);
                this.LLILZIL = null;
                this.LLILZLL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJ(int i) {
        InterfaceC1139780flY interfaceC1139780flYLIZJ;
        LJIILLIIL(null);
        C1136560fgM c1136560fgM = this.LLILZIL;
        if (c1136560fgM != null && (interfaceC1139780flYLIZJ = c1136560fgM.LIZJ()) != null) {
            interfaceC1139780flYLIZJ.LJIIJ(i);
        }
        LIZLLL();
    }

    public final void LJIIL(final C1136560fgM c1136560fgM) {
        long id;
        final boolean zLIZ = C1136570fgN.LIZ(c1136560fgM);
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(c1136560fgM.LJFF);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c1136560fgM.LIZLLL());
        arrayList.addAll(c1136560fgM.LJ());
        boolean z = true;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (C1138640fji.LIZLLL(((Number) it2.next()).longValue()) == null) {
                    z = false;
                    break;
                }
            }
        }
        if (assetsModelLIZLLL != null && z) {
            if (!zLIZ) {
                c1136560fgM.LIZJ().LIZLLL();
                InterfaceC1139780flY interfaceC1139780flYLIZJ = c1136560fgM.LIZJ();
                LJ();
                interfaceC1139780flYLIZJ.LIZIZ(true, assetsModelLIZLLL, true, true, false);
            }
            LIZ(c1136560fgM, assetsModelLIZLLL);
            return;
        }
        c1136560fgM.LIZJ().LIZLLL();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        C1138640fji.LJIIIZ(4, id, arrayList, new InterfaceC1133140faq() { // from class: X.0flh
            @Override // X.InterfaceC1133140faq
            public final void onFailed() {
                if (!this.LJFF()) {
                    this.LJI("prepareAssetsModel return due to stop", null);
                    return;
                }
                InterfaceC1139780flY interfaceC1139780flYLIZJ2 = c1136560fgM.LIZJ();
                this.LJ();
                interfaceC1139780flYLIZJ2.LIZIZ(false, null, false, true, zLIZ);
                this.LJIIJ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            }

            @Override // X.InterfaceC1133140faq
            public final void onSuccess() {
                if (!this.LJFF()) {
                    this.LJI("prepareAssetsModel return due to stop", null);
                    return;
                }
                AssetsModel assetsModelLIZLLL2 = C1138640fji.LIZLLL(c1136560fgM.LJFF);
                if (assetsModelLIZLLL2 == null) {
                    onFailed();
                    return;
                }
                InterfaceC1139780flY interfaceC1139780flYLIZJ2 = c1136560fgM.LIZJ();
                this.LJ();
                interfaceC1139780flYLIZJ2.LIZIZ(true, assetsModelLIZLLL2, false, true, zLIZ);
                this.LIZ(c1136560fgM, assetsModelLIZLLL2);
            }
        });
    }

    public final void LJIILLIIL(List<LiveRoomEvent> list) {
        C1139610flH c1139610flH = this.LLIZ;
        if (c1139610flH != null) {
            if (list != null) {
                Map<Integer, Set<C1140490fmh>> map = C1139440fl0.LL;
                if (GiftEffectObserveLiveRoomEventSetting.INSTANCE.enable()) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<LiveRoomEvent> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(it2.next().eventType));
                    }
                    C1139440fl0.LIZ(arrayList, c1139610flH);
                }
            } else {
                C1139440fl0.LJ(c1139610flH);
            }
        }
        this.LLIZ = null;
    }

    public final void LIZ(final C1136560fgM c1136560fgM, final AssetsModel assetsModel) {
        if (c1136560fgM.LJJII == null) {
            c1136560fgM.LJJII = C1136390fg5.LIZ(assetsModel);
        }
        final boolean zLIZ = C1136570fgN.LIZ(c1136560fgM);
        C1138360fjG c1138360fjGLIZLLL = C1140890fnL.LIZLLL();
        long j = c1136560fgM.LJFF;
        c1138360fjGLIZLLL.getClass();
        String strLJIIIIZZ = C1138630fjh.LJIIIIZZ(j, null);
        final boolean z = true;
        if (zLIZ && C1138640fji.LJII(null, Long.valueOf(c1136560fgM.LJFF)) && strLJIIIIZZ != null && strLJIIIIZZ.length() != 0) {
            z = false;
        } else {
            c1136560fgM.LIZJ().LJIIIZ(C1138640fji.LJII(null, Long.valueOf(c1136560fgM.LJFF)));
        }
        final JSONArray jSONArray = new JSONArray();
        final ArrayList arrayList = new ArrayList();
        C1138840fk2 c1138840fk2 = new C1138840fk2() { // from class: X.0flG
            @Override // X.C1138840fk2, X.InterfaceC1138820fk0
            public final void LIZJ(long j2, String str) throws JSONException {
                String str2 = null;
                if (!this.LIZ.LJFF()) {
                    this.LIZ.LJI("downloadStickerAssets new return due to stop", null);
                    return;
                }
                C1136560fgM c1136560fgM2 = c1136560fgM;
                if (j2 == c1136560fgM2.LJFF) {
                    c1136560fgM2.LJII = str;
                    return;
                }
                if (c1136560fgM2.LIZLLL().contains(Long.valueOf(j2))) {
                    C1140890fnL.LIZLLL().getClass();
                    C1138630fjh c1138630fjh = C1138630fjh.LIZ;
                    FaceRecognitionMeta faceRecognitionMetaLJII = C1138630fjh.LJII(j2, 2);
                    if (faceRecognitionMetaLJII != null) {
                        str2 = faceRecognitionMetaLJII.sdkExtra;
                    }
                    JSONArray jSONArray2 = jSONArray;
                    JSONObject jSONObject = new JSONObject();
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put("extra", str2);
                    jSONObject.put("rootPath", str);
                    jSONObject.put("effect_id", j2);
                    jSONArray2.put(jSONObject);
                    return;
                }
                if (!c1136560fgM.LJ().contains(Long.valueOf(j2))) {
                    return;
                }
                arrayList.add(str);
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Long.valueOf(c1136560fgM.LJFF));
        linkedHashMap.put(Long.valueOf(c1136560fgM.LJFF), c1138840fk2);
        linkedHashSet.addAll(c1136560fgM.LJ());
        Iterator<Long> it2 = c1136560fgM.LJ().iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), c1138840fk2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Long l : c1136560fgM.LIZLLL()) {
            linkedHashMap2.put(l, 2);
            linkedHashMap.put(l, c1138840fk2);
        }
        C1140890fnL.LIZLLL();
        C1138360fjG.LIZ(linkedHashSet, linkedHashMap2, linkedHashMap, new C1137740fiG() { // from class: X.0flV
            @Override // X.InterfaceC1138480fjS
            public final void LIZ() {
                if (!this.LIZ.LJFF()) {
                    this.LIZ.LJI("downloadStickerAssets new return due to stop", null);
                    return;
                }
                C1136560fgM c1136560fgM2 = c1136560fgM;
                c1136560fgM2.LJJIZ = jSONArray;
                c1136560fgM2.LJJJI = arrayList;
                if (z) {
                    InterfaceC1139780flY interfaceC1139780flYLIZJ = c1136560fgM2.LIZJ();
                    this.LIZ.LJ();
                    interfaceC1139780flYLIZJ.LJIJ("", true, true, zLIZ);
                }
                this.LIZ.LJIIJJI(c1136560fgM, assetsModel);
            }

            @Override // X.InterfaceC1138480fjS
            public final void onFailed(Throwable th) {
                String message;
                if (!this.LIZ.LJFF()) {
                    this.LIZ.LJI("downloadStickerAssets new return due to stop", null);
                    return;
                }
                this.LIZ.LJI("downloadStickerAssets new onFailed", th);
                if (z) {
                    InterfaceC1139780flY interfaceC1139780flYLIZJ = c1136560fgM.LIZJ();
                    this.LIZ.LJ();
                    boolean z2 = zLIZ;
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "onFailed";
                    }
                    interfaceC1139780flYLIZJ.LJIJ(message, false, true, z2);
                }
                this.LIZ.LJIIJ(301);
            }
        }, C2097608Jq.LJ());
    }

    public void LJI(String str, Throwable th) {
        C20441214yg.LJFF(LIZJ(), str, th);
    }

    public final void LJIILIIL(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        if (!LJFF()) {
            LJI("prepareFacialAlgorithmModel return due to stop", null);
            return;
        }
        boolean zLIZ = C1136570fgN.LIZ(c1136560fgM);
        c1136560fgM.LIZJ().LJIILJJIL();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Long.valueOf(c1136560fgM.LJFF));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Long> it2 = c1136560fgM.LIZLLL().iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), 2);
        }
        C1136430fg9.LIZJ(linkedHashSet, linkedHashMap, new AwS37S0310000_17(zLIZ, c1136560fgM, this, assetsModel, 2), new AwS69S0210000_17(c1136560fgM, this, zLIZ, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(final X.C1136560fgM r12, com.bytedance.android.livesdk.gift.assets.AssetsModel r13, com.bytedance.android.livesdkapi.depend.model.LiveEffect r14) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1139430fkz.LJIILL(X.0fgM, com.bytedance.android.livesdk.gift.assets.AssetsModel, com.bytedance.android.livesdkapi.depend.model.LiveEffect):void");
    }
}
