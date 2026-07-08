package X;

import Y.AObserverS209S0100000_5;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0EOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363810EOd extends AbstractC381020Ewm<InterfaceC357820E1c> implements InterfaceC357820E1c, InterfaceC379610EuV, C0ETV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LLILLL;
    public final C372480Ej0 LLILZ;
    public final InterfaceC357820E1c LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final C01GW LLJI;
    public MutableLiveData<C357800E1a> LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C363810EOd.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C363810EOd.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C363810EOd.class, "editorProInfoStickerApi", "getEditorProInfoStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/info/EditorProInfoStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C363810EOd.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJILJILJ = 8;
    }

    private final InterfaceC1465230oET W2() {
        return (InterfaceC1465230oET) this.LLIZ.getValue(this, LLJILJIL[1]);
    }

    private final InterfaceC363820EOe c3() {
        return (InterfaceC363820EOe) this.LLIZLLLIL.getValue(this, LLJILJIL[2]);
    }

    private final C0EOK i3() {
        return (C0EOK) this.LLJ.getValue(this, LLJILJIL[3]);
    }

    private final C1634780sdw m3() {
        return (C1634780sdw) this.LLJI.getValue();
    }

    private final C0E5S q3() {
        return (C0E5S) this.LLILZLL.getValue(this, LLJILJIL[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G2() {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363810EOd.G2():void");
    }

    private final void B3() {
        W2().N8();
        W2().Bt(new InterfaceC1406950miT() { // from class: X.0ES1
            @Override // X.InterfaceC1406950miT
            public final void L0(Effect effect, String str) {
            }

            @Override // X.InterfaceC1406950miT
            public final void Bl() {
                View viewFindViewById = C1664590tQ1.LJII(this.LL).findViewById(R.id.gct);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                }
            }

            @Override // X.InterfaceC1406950miT
            public final void Ho() {
                View viewFindViewById = C1664590tQ1.LJII(this.LL).findViewById(R.id.gct);
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(4, viewFindViewById);
                }
            }

            @Override // X.InterfaceC1406950miT
            public final void Ph(Effect effect, String str) {
                ConcurrentHashMap<String, Object> concurrentHashMapLIZ;
                this.LL.E3(effect, str);
                if (!C1462570oAB.LJ(effect) && !C1635160seY.LIZ(effect)) {
                    if (C1462570oAB.LJIILLIIL(effect)) {
                        this.LL.Z1(effect, "MagnifierSticker");
                        return;
                    } else if (C1462570oAB.LJIIIZ(effect)) {
                        this.LL.Z1(effect, ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIJJI());
                        return;
                    } else {
                        this.LL.Z1(effect, str);
                        return;
                    }
                }
                if (TextUtils.isEmpty(str) || (concurrentHashMapLIZ = C178100mJ.LIZ(str)) == null) {
                    return;
                }
                this.LL.X1((String) concurrentHashMapLIZ.get("stickerId"), (String) concurrentHashMapLIZ.get("path"), CastIntegerProtector.parseInt((String) concurrentHashMapLIZ.get("width")), CastIntegerProtector.parseInt((String) concurrentHashMapLIZ.get("height")), Boolean.parseBoolean((String) concurrentHashMapLIZ.get("cutout")), C2097608Jq.LJIIIIZZ(new Pair("aigc_info", String.valueOf(concurrentHashMapLIZ.get("aigc_info"))), new Pair("sticker_source", "2"), new Pair("info_sticker_subtype", "29")));
            }
        });
    }

    public final void H2() {
        NLETrack nLETrackPt;
        C0E48 c0e48W1;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E55 player;
        C0E48 c0e48W12 = W1();
        if (c0e48W12 == null || (nLETrackPt = c0e48W12.Pt()) == null || (c0e48W1 = W1()) == null || (nLETrackSlotLLLLLLIL = c0e48W1.LLLLLLIL()) == null) {
            return;
        }
        C0E48 c0e48W13 = W1();
        if (c0e48W13 != null && (player = c0e48W13.getPlayer()) != null) {
            player.pause(false);
        }
        InterfaceC363820EOe interfaceC363820EOeC3 = c3();
        String uuid = nLETrackSlotLLLLLLIL.getUUID();
        if (uuid == null) {
            uuid = "";
        }
        interfaceC363820EOeC3.wx1(uuid, false);
        C0E48 c0e48W14 = W1();
        if (c0e48W14 != null) {
            c0e48W14.LLFII().LJJJJI(null, EnumC356070Dxd.COMMIT, null);
            C351510DqH c351510DqH = C351510DqH.LIZ;
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48W14);
            NLETrackType nLETrackType = NLETrackType.STICKER;
            c351510DqH.getClass();
            C351510DqH.LJIIJJI(nLEModelLJI, nLETrackType, "INFO");
            C350870DpF.LIZJ(c0e48W14, C051R.LIZIZ(new C0E1X(C0E1V.DELETE_STICKER.getNameId(), null, null, null, null, 30)));
            c0e48W14.getPlayer().LJJIIZ(null);
            c0e48W14.S7().LIZIZ(new C0EB9(nLETrackPt, nLETrackSlotLLLLLLIL), "delete_slot_event", false);
        }
        if (c3().iF0().isEmpty()) {
            q3().w6(null, false, false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        ArrayList<C0ETV> arrayList;
        super.onCreate();
        C372480Ej0 c372480Ej0 = this.LLILZ;
        if (c372480Ej0 != null && (arrayList = c372480Ej0.LLLILZJ) != null) {
            arrayList.add(this);
        }
        this.LLILZIL.Dx1().observe(this, new AObserverS209S0100000_5(this, 76));
    }

    private final void v3() {
        B3();
    }

    @Override // X.InterfaceC357820E1c
    public MutableLiveData<C357800E1a> Dx1() {
        return this.LLJIJIL;
    }

    public InterfaceC357820E1c T2() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125 A[PHI: r5
      0x0125: PHI (r5v1 float) = (r5v0 float), (r5v3 float), (r5v3 float) binds: [B:54:0x0121, B:13:0x0024, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Pair<java.lang.Float, java.lang.Float> o2(com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel r15) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363810EOd.o2(com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel):kotlin.Pair");
    }

    @Override // X.InterfaceC357820E1c
    public void mE2(MutableLiveData<C357800E1a> mutableLiveData) {
        this.LLJIJIL = mutableLiveData;
    }

    public final void w2(boolean z) {
        C0E48 c0e48W1;
        if (z && (c0e48W1 = W1()) != null && C351220Dpo.LJJJJZI(C350870DpF.LJI(c0e48W1)) >= 30) {
            Activity activityLJII = C1664590tQ1.LJII(this);
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131836170);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activityLJII, 1035, creativeToastBuilder);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        B3();
        C1462460oA0.LIZ(W2(), true, jCurrentTimeMillis, 2);
    }

    public C363810EOd(C1DRG c1drg, C372480Ej0 c372480Ej0) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c372480Ej0;
        this.LLILZIL = this;
        this.LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1465230oET.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC363820EOe.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(186));
        this.LLJIJIL = new MutableLiveData<>();
    }

    public final void E3(Effect effect, String str) {
        C1634780sdw c1634780sdwM3;
        if (effect.getEffectType() != 10 && (c1634780sdwM3 = m3()) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C09AL())), null, null, new C0ES6(c1634780sdwM3, effect, str, null), 3);
        }
    }

    public final void Z1(Effect effect, String str) {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && c0e48W1.LLLLLLIL() != null) {
            c3().hZ(effect, str);
        } else {
            c3().aP0(effect, str);
        }
    }

    @Override // X.C0ETV
    public boolean LLLLLIL(int i, int i2, Intent intent) {
        HashMap<String, String> mapLIZ;
        if (intent != null && i == 10004 && i2 == -1 && intent.hasExtra("custom_sticker") && intent.hasExtra("custom_sticker_image_info")) {
            Effect effect = (Effect) intent.getParcelableExtra("custom_sticker");
            CustomStickerInfo customStickerInfo = (CustomStickerInfo) intent.getParcelableExtra("custom_sticker_image_info");
            if (effect != null) {
                InterfaceC1465230oET interfaceC1465230oETW2 = W2();
                if (customStickerInfo != null) {
                    mapLIZ = customStickerInfo.LIZ();
                } else {
                    mapLIZ = null;
                }
                interfaceC1465230oETW2.Nu(effect, C178100mJ.LIZJ(mapLIZ));
                return true;
            }
            return true;
        }
        return false;
    }

    public final void X1(String str, String str2, int i, int i2, boolean z, Map<String, String> map) {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && c0e48W1.LLLLLLIL() != null) {
            c3().Pz1(str, str2, i, i2, z, map);
        } else {
            c3().m9(str, str2, i, i2, z, map);
        }
    }
}
