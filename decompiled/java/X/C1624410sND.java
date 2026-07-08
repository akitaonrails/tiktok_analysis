package X;

import Y.ARunnableS19S1300000_25;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.verify.PlusButtonPinExperiment;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS75S1000000_25;
import kotlin.jvm.internal.AwS88S1300000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lnn.q;

/* JADX INFO: renamed from: X.0sND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624410sND implements InterfaceC1621080sHq, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final Function0<C1624440sNG> LL;
    public final C19GS LLILLJJLI;
    public final q LLILLL;
    public final ShortVideoContext LLILZ;
    public final C565610MGh LLILZIL;
    public final C1DRG LLILZLL;
    public final C1664750tQH LLIZ;
    public final SafeHandler LLIZLLLIL;
    public final InterfaceC1647420syK LLJ;
    public final C560530Lyd<Effect> LLJI = new C560530Lyd<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1624410sND.class, "stickerMob", "getStickerMob()Lcom/ss/android/ugc/aweme/sticker/mob/IStickerMob;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1621080sHq
    public final String LJFF() {
        List<String> list = this.LL.invoke().LIZLLL;
        return (list == null || list.isEmpty()) ? "" : C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
    }

    public final Map<String, String> LJII() {
        HashMap map = new HashMap();
        map.put(Scene.SCENE_SERVICE, LJIIJJI());
        String str = this.LL.invoke().LIZIZ;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("grade_key", str);
        }
        return map;
    }

    public final String LJIIJJI() {
        String str = this.LL.invoke().LIZ;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1621080sHq
    public final LiveEvent<Effect> LJI() {
        return this.LLJI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0sNB] */
    @Override // X.InterfaceC1621080sHq
    public final void LIZ(String str) {
        List<String> listLJJJJI;
        if (str == null) {
            listLJJJJI = C13BV.INSTANCE;
        } else {
            listLJJJJI = C13LP.LJJJJI(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
        }
        if (listLJJJJI.isEmpty()) {
            return;
        }
        final Map<String, String> mapLJII = LJII();
        q qVar = this.LLILLL;
        final C565610MGh c565610MGh = this.LLILZIL;
        final ?? r0 = new IFetchEffectListByIdsListener() { // from class: X.0sNB
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
            public final void onFail(ExceptionResult exceptionResult) {
                int i;
                switch (exceptionResult.getErrorCode()) {
                    case 2002:
                    case 2004:
                        i = 2131833754;
                        break;
                    case 2003:
                        i = 2131830633;
                        break;
                    case 2005:
                    default:
                        i = 2131834347;
                        break;
                    case 2006:
                        i = 2131857911;
                        break;
                }
                C19GS c19gs = this.LIZ.LLILLJJLI;
                if (c19gs != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(i);
                    C1390380mHk.LIZ(c19gs, 3060, creativeToastBuilder);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectListResponse effectListResponse) {
                InterfaceC1625550sP3 interfaceC1625550sP3;
                EffectListResponse effectListResponse2 = effectListResponse;
                this.LIZ.LLILLL.FV().LJII(effectListResponse2.getUrlPrefix());
                List<Effect> data = effectListResponse2.getData();
                if (!C0IKQ.LIZ(data)) {
                    Effect effect = (Effect) ListProtector.get(data, 0);
                    C1624410sND c1624410sND = this.LIZ;
                    q qVar2 = c1624410sND.LLILLL;
                    boolean z = c1624410sND.LLILZ.putPresetStickerAtFirst;
                    if (C1624570sNT.LJIL(effect)) {
                        interfaceC1625550sP3 = null;
                    } else {
                        final C1624410sND c1624410sND2 = this.LIZ;
                        interfaceC1625550sP3 = new InterfaceC1625550sP3() { // from class: X.0sNC
                            @Override // X.InterfaceC1625550sP3
                            public final void LJII(int i, Effect effect2) {
                            }

                            @Override // X.InterfaceC1625550sP3
                            public final void LJIIIIZZ(Effect effect2) {
                            }

                            @Override // X.InterfaceC1625550sP3
                            public final void onSuccess(Effect effect2) {
                            }

                            @Override // X.InterfaceC1625550sP3
                            public final void LJIILLIIL(Effect effect2, ExceptionResult exceptionResult) {
                                exceptionResult.getException();
                                C19GS c19gs = c1624410sND2.LLILLJJLI;
                                if (c19gs != null) {
                                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                    creativeToastBuilder.messageRes(2131848879);
                                    C1390380mHk.LIZ(c19gs, 3060, creativeToastBuilder);
                                }
                                a aVarLIZJ = c1624410sND2.LLJ.pi2().LIZJ();
                                if (aVarLIZJ != null) {
                                    aVarLIZJ.L02(true);
                                }
                            }
                        };
                    }
                    C1624010sMZ.LIZLLL(qVar2, data, z, true, interfaceC1625550sP3, false, null, null, null, 32736);
                    this.LIZ.LJIILIIL(effect);
                }
            }
        };
        c565610MGh.getClass();
        qVar.C0().LIZ(listLJJJJI, mapLJII, new IFetchEffectListByIdsListener() { // from class: X.0sNJ
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
            public final void onFail(ExceptionResult exceptionResult) {
                c565610MGh.getClass();
                r0.onFail(exceptionResult);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectListResponse effectListResponse) {
                c565610MGh.getClass();
                r0.onSuccess(effectListResponse);
            }
        });
    }

    @Override // X.InterfaceC1621080sHq
    public final boolean LIZIZ(Effect effect) {
        if (!TextUtils.equals(LJIIJJI(), "qrcode") && C1624200sMs.LJI(effect) && !C1624170sMp.LIZ(effect)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1621080sHq
    public final boolean LJ(String str) {
        ArrayList<String> arrayListLIZIZ;
        if (str != null && str.length() != 0) {
            arrayListLIZIZ = C1624570sNT.LIZIZ(str);
        } else {
            arrayListLIZIZ = null;
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = this.LL.invoke().LIZLLL;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (arrayListLIZIZ != null) {
            arrayList.addAll(arrayListLIZIZ);
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    public final Bundle LJIIJ(C1624460sNI c1624460sNI) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("is_auto_applied", "1", bundle);
        String strLJIIJJI = LJIIJJI();
        C0MJE c0mje = C0MJE.START_SCAN_FACE_EXTERNAL;
        if (Intrinsics.LJFF(strLJIIJJI, c0mje.toString())) {
            C786410Ut5.LJJIZ(bundle, "start_scan_face_entry", c0mje);
            bundle.putBoolean("start_scan_face_immediately", true);
            bundle.putBoolean("scan_face_entry_white_t_shirt", this.LLILZ.creativeModel.aiSelfScanFaceModel.aiSelfScanFaceEntry);
        }
        if (c1624460sNI != null) {
            c1624460sNI.invoke(bundle);
        }
        return bundle;
    }

    public final void LJIILIIL(Effect effect) {
        if (C1624200sMs.LJI(effect)) {
            C2232308or c2232308orLIZIZ = C2232308or.LIZIZ();
            c2232308orLIZIZ.getClass();
            if (C1624200sMs.LJI(effect)) {
                String effectId = effect.getEffectId();
                if (c2232308orLIZIZ.LIZ() != null && !c2232308orLIZIZ.LIZ().contains(effectId)) {
                    c2232308orLIZIZ.LIZ().add(effectId);
                    C2232308or.LIZLLL.edit().putString("sticker_id_info", GsonProtectorUtils.toJson(c2232308orLIZIZ.LIZIZ, c2232308orLIZIZ.LIZ())).apply();
                }
            }
            this.LLJI.LJIIJ(effect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1621080sHq
    public final void LIZJ(final Effect effect, List list) {
        List<Effect> data;
        Object objLJJJLL;
        List list2 = list;
        String str = this.LLILZ.creativeModel.feedPropPinModel.effectId;
        if (PlusButtonPinExperiment.INSTANCE.getPinOnly() && str.length() > 0) {
            EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(str);
            if (effectListResponseLIZ != null && (data = effectListResponseLIZ.getData()) != null && (objLJJJLL = C13LP.LJJJLL(data)) != null) {
                this.LLILLL.C0().LJJJJI(new C1629220sUy(Collections.singletonList(objLJJJLL), C1625940sPg.LIZLLL(this.LLILLL.C0()), 0, 28));
                return;
            } else {
                this.LLILLL.C0().LJIIL(new C1629230sUz(Collections.singletonList(str), C1625940sPg.LIZLLL(this.LLILLL.C0()), 0, null, false, false), new AwS75S1000000_25(str, 16));
                return;
            }
        }
        if ((list2 != null || (list2 = this.LL.invoke().LIZLLL) != null) && !list2.isEmpty()) {
            final String strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62);
            final Map<String, String> mapLJII = LJII();
            EffectListResponse effectListResponseLIZ2 = C1398060mU8.LIZ((String) ListProtector.get(list2, 0));
            if (effectListResponseLIZ2 != null) {
                if (LJIIIZ(effectListResponseLIZ2, strLJJLIIIJ, effect)) {
                    return;
                }
                this.LLILLL.C0().LJJJJ((Effect) C13LP.LJJJJZI(effectListResponseLIZ2.getData()), new AwS88S1300000_25(this, effectListResponseLIZ2, strLJJLIIIJ, effect, 4), AFwS266S0000000_25.get$arr$(417));
                return;
            }
            this.LLILLL.C0().LIZ(list2, mapLJII, new IFetchEffectListByIdsListener() { // from class: X.0sNE
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    exceptionResult.getException();
                    this.LIZ.LLILLL.n00(null);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    final EffectListResponse effectListResponse2 = effectListResponse;
                    if (!this.LIZ.LJIIIZ(effectListResponse2, strLJJLIIIJ, effect)) {
                        q qVar = this.LIZ.LLILLL;
                        String effectId = ((Effect) C13LP.LJJJJZI(effectListResponse2.getData())).getEffectId();
                        Map<String, String> map = mapLJII;
                        final C1624410sND c1624410sND = this.LIZ;
                        final String str2 = strLJJLIIIJ;
                        final Effect effect2 = effect;
                        qVar.C0().LJFF(Collections.singletonList(effectId), true, map, new IFetchEffectListListener() { // from class: X.0sNH
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                            public final void onFail(ExceptionResult exceptionResult) {
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(List<Effect> list3) {
                                c1624410sND.LJIIL(effectListResponse2, str2, effect2);
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1621080sHq
    public final void LIZLLL(String str, final AwS604S0100000_25 awS604S0100000_25) {
        boolean z;
        ArrayList<String> arrayListLIZIZ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            arrayListLIZIZ = C1624570sNT.LIZIZ(str);
        } else {
            arrayListLIZIZ = null;
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = this.LL.invoke().LIZLLL;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (arrayListLIZIZ != null) {
            arrayList.addAll(arrayListLIZIZ);
        }
        if (arrayList.isEmpty()) {
            awS604S0100000_25.invoke(null);
            return;
        }
        ListProtector.get(arrayList, 0);
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            ListProtector.get(arrayList, i);
        }
        this.LLILLL.C0().LIZ(arrayList, LJII(), new IFetchEffectListByIdsListener() { // from class: X.0sNA
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
            public final void onFail(ExceptionResult exceptionResult) {
                awS604S0100000_25.invoke(null);
                exceptionResult.getException();
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectListResponse effectListResponse) {
                EffectListResponse effectListResponse2 = effectListResponse;
                this.LIZ.LLILLL.FV().LJII(effectListResponse2.getUrlPrefix());
                ArrayList arrayList2 = new ArrayList(effectListResponse2.getData());
                if (!arrayList2.isEmpty() && !TextUtils.equals(this.LIZ.LJIIJJI(), "qrcode") && C1624200sMs.LJI((Effect) C13LP.LJJJJZI(arrayList2)) && !C1624170sMp.LIZ((Effect) C13LP.LJJJJZI(arrayList2))) {
                    ListProtector.remove(arrayList2, 0);
                }
                if (arrayList2.isEmpty()) {
                    awS604S0100000_25.invoke(null);
                    return;
                }
                if (C0IKQ.LIZIZ(effectListResponse2.getCollection())) {
                    C1624010sMZ.LJI(this.LIZ.LLILLL, effectListResponse2.getCollection());
                }
                Iterator it2 = arrayList2.iterator();
                HashSet hashSet = new HashSet();
                while (it2.hasNext()) {
                    String parentId = ((Effect) it2.next()).getParentId();
                    if (!TextUtils.isEmpty(parentId) && !hashSet.add(parentId)) {
                        it2.remove();
                    }
                }
                C1624010sMZ.LIZLLL(this.LIZ.LLILLL, arrayList2, true, false, null, false, null, null, null, 32760);
                Effect effect = (Effect) C13LP.LJJJLL(arrayList2);
                if (effect != null) {
                    this.LIZ.LJIILIIL(effect);
                }
                awS604S0100000_25.invoke((Effect) C13LP.LJJJLL(arrayList2));
            }
        });
    }

    public final void LJIIIIZZ(EffectListResponse effectListResponse, String str, Effect effect) {
        String string;
        boolean z;
        C1624460sNI c1624460sNI;
        boolean z2;
        String unzipPath;
        a aVarLIZJ;
        Effect effect2 = effect;
        this.LLILLL.FV().LJII(effectListResponse.getUrlPrefix());
        if (effect2 == null) {
            effect2 = this.LL.invoke().LIZJ;
        }
        ArrayList arrayList = new ArrayList(effectListResponse.getData());
        if (!arrayList.isEmpty() && !TextUtils.equals(LJIIJJI(), "qrcode") && C1624200sMs.LJI((Effect) C13LP.LJJJJZI(arrayList)) && !C1624170sMp.LIZ((Effect) C13LP.LJJJJZI(arrayList))) {
            ListProtector.remove(arrayList, 0);
        }
        if (arrayList.isEmpty()) {
            effectListResponse.setData(arrayList);
            return;
        }
        if (this.LLILZ.mToLive) {
            return;
        }
        if (C0IKQ.LIZIZ(effectListResponse.getCollection())) {
            C1624010sMZ.LJI(this.LLILLL, effectListResponse.getCollection());
        }
        Iterator it2 = arrayList.iterator();
        HashSet hashSet = new HashSet();
        while (it2.hasNext()) {
            String parentId = ((Effect) it2.next()).getParentId();
            if (!TextUtils.isEmpty(parentId) && !hashSet.add(parentId)) {
                it2.remove();
            }
        }
        Bundle bundleLIZ = C537670L6v.LIZ(this.LLILZLL, this.LLILLJJLI);
        Bundle bundle = null;
        if (bundleLIZ != null) {
            string = bundleLIZ.getString("event_shoot_event_track");
        } else {
            string = null;
        }
        String str2 = "direct_shoot";
        if (!TextUtils.isEmpty(string)) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("prop_id", str);
            c0lab.LJ("creation_id", this.LLILZ.getCreationId());
            c0lab.LJ("shoot_way", "direct_shoot");
            C20684815ws.LJIILLIIL("auto_prop_show", c0lab.LIZ);
        } else {
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("prop_id", str);
            C20684815ws.LJIILLIIL("reuse_prop_release", c0lab2.LIZ);
        }
        Effect effect3 = (Effect) C13LP.LJJJLL(arrayList);
        if (LJIIJJI().equals("draft") || Intrinsics.LJFF(LJIIJJI(), C0MJE.START_SCAN_FACE_EXTERNAL.toString())) {
            effect2 = effect3;
        }
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && this.LLILZ.LJJLL() && C0CHQ.LIZ().getAccountService().isLogin()) {
            this.LLILLL.C0().getStickerRepository().LIZ().LIZ("", arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            effect2 = (Effect) C13LP.LJJJJZI(arrayList);
            ShortVideoContext shortVideoContext = this.LLILZ;
            String effectId = effect2.getEffectId();
            if (effectId != null) {
                CreativeModel creativeModel = shortVideoContext.creativeModel;
                PropFromGroupModel propFromGroupModel = creativeModel.propFromGroupModel;
                creativeModel.propFromGroupModel = new PropFromGroupModel(effectId, propFromGroupModel.fromPropResourceId, propFromGroupModel.fromGroupIdPropList, propFromGroupModel.fromGroupIdPropResourceList);
            } else {
                shortVideoContext.getClass();
            }
            FaceStickerBean.sCurPropSource = "duet";
            this.LLILZ.duetEnterRecordPageWithProps = true;
            if (C1624570sNT.LJIIIIZZ(effect2) && (aVarLIZJ = this.LLJ.pi2().LIZJ()) != null) {
                aVarLIZJ.L02(true);
            }
            if (Intrinsics.LJFF(this.LLILZ.cameraComponentModel.duetContext.duetLayout, "green_screen")) {
                return;
            }
        }
        if (this.LLILZ.showCancelAfterPinProp.booleanValue()) {
            this.LLILLL.NJ(true, true);
            FaceStickerBean.sCurPropSource = "qa_prop";
        }
        PropFromGroupModel propFromGroupModel2 = this.LLILZ.creativeModel.propFromGroupModel;
        if (propFromGroupModel2.fromPropResourceId.length() == 0 && effect3 != null) {
            this.LLILZ.creativeModel.propFromGroupModel = PropFromGroupModel.LIZ(propFromGroupModel2, effect3.getResourceId());
            new C1449240nog(this.LLILZ.creativeModel).LIZ();
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (C1449600npG.LIZIZ((Effect) it3.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        List<String> list = C579450Mo3.LIZ;
        if (C579450Mo3.LIZ(this.LLILZ) && effect3 != null) {
            if (this.LLILZ.creativeModel.feedPropPinModel.effectId.length() <= 0 && (str2 = this.LLILZ.shootWay) == null) {
                str2 = "prop_carousel_trending";
            }
            c1624460sNI = new C1624460sNI(str2);
            this.LLILLL.C0().LJII().LJIIIZ(new C1449000noI(effect3, 0, 1, false, false, true, true, (String) null, "carousel", "carousel", 1170));
            ((InterfaceC1625220sOW) this.LLIZ.getValue(this, LLJIJIL[0])).LJIIJ(effect3, false, "carousel", "carousel", "auto_apply", 1, false, LJIIJ(c1624460sNI), null);
        } else {
            c1624460sNI = null;
        }
        q qVar = this.LLILLL;
        boolean z3 = !z;
        if (effect2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig = this.LLILZ.greenScreenKitConfig;
        if (oPSDK$GreenScreenKitConfig != null) {
            bundle = oPSDK$GreenScreenKitConfig.toBundle();
        }
        C1624010sMZ.LIZLLL(qVar, arrayList, z3, z2, null, true, bundle, LJIIJ(c1624460sNI), EnumC1448980noG.AUTO_APPLY, 10744);
        effectListResponse.setData(arrayList);
        if (effect2 != null && (unzipPath = effect2.getUnzipPath()) != null && (!a0.LJJJIL(unzipPath))) {
            if (effect3 != null) {
                effect3.setUnzipPath(effect2.getUnzipPath());
            } else {
                return;
            }
        } else if (effect3 == null) {
            return;
        }
        LJIILIIL(effect3);
    }

    public final boolean LJIIIZ(EffectListResponse effectListResponse, String str, Effect effect) {
        String string;
        String str2;
        Effect effect2 = (Effect) C13LP.LJJJLL(effectListResponse.getData());
        boolean z = true;
        if (effect2 != null) {
            if (!C1624550sNR.LIZIZ(effect2) && !C1624570sNT.LJIL(effect2) && !C1624600sNW.LIZ(effect2)) {
                z = false;
            }
            if (LJIIJJI().equals("draft")) {
                ShortVideoContext shortVideoContext = this.LLILZ;
                List<Effect> data = effectListResponse.getData();
                String str3 = "";
                if (C580130Mp9.LIZ(data)) {
                    string = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    Iterator<Effect> it2 = data.iterator();
                    while (it2.hasNext()) {
                        String effectId = it2.next().getEffectId();
                        if (!TextUtils.isEmpty(effectId)) {
                            if (sb.length() == 0) {
                                str2 = "";
                            } else {
                                str2 = ",";
                            }
                            sb.append(str2);
                            sb.append(effectId);
                        }
                    }
                    string = sb.toString();
                    if (string != null) {
                    }
                    shortVideoContext.stickersFromDraftVideos = str3;
                }
                str3 = string;
                shortVideoContext.stickersFromDraftVideos = str3;
            }
            if (!z) {
                this.LLILLL.n00(effect2);
                return z;
            }
        }
        LJIIIIZZ(effectListResponse, str, effect);
        return z;
    }

    public final void LJIIL(EffectListResponse effectListResponse, String str, Effect effect) {
        if (!this.LL.invoke().LJ) {
            this.LLIZLLLIL.postDelayed(new ARunnableS19S1300000_25(effectListResponse, this, effect, str, 1), 2000L);
        } else {
            LJIIIIZZ(effectListResponse, str, effect);
        }
    }

    public C1624410sND(Function0 function0, C19GS c19gs, l0 l0Var, ShortVideoContext shortVideoContext, C565610MGh c565610MGh, C1DRG c1drg) {
        this.LL = function0;
        this.LLILLJJLI = c19gs;
        this.LLILLL = l0Var;
        this.LLILZ = shortVideoContext;
        this.LLILZIL = c565610MGh;
        this.LLILZLL = c1drg;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1625220sOW.class, null);
        this.LLIZLLLIL = new SafeHandler((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null));
        this.LLJ = (InterfaceC1647420syK) c1drg.LJII(InterfaceC1647420syK.class, null);
    }
}
