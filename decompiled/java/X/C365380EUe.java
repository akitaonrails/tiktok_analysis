package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365380EUe implements InterfaceC360730ECh {
    public final C365770EVr LIZ;
    public InterfaceC365520EUs<C357590E0f> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(10));

    @Override // X.InterfaceC360730ECh
    public final void LJI() {
    }

    @Override // X.InterfaceC360730ECh
    public final ArrayList LJ() {
        return new ArrayList();
    }

    @Override // X.InterfaceC360730ECh
    public final ArrayList LJFF() {
        return new ArrayList();
    }

    public final InterfaceC1635390sev LJIILIIL() {
        return (InterfaceC1635390sev) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC360730ECh
    public final C365770EVr getResourceConfig() {
        return this.LIZ;
    }

    public C365380EUe(C365770EVr c365770EVr) {
        this.LIZ = c365770EVr;
    }

    @Override // X.InterfaceC360730ECh
    public final boolean LIZ(String str) {
        EffectManager effectManagerLLJILJILJ;
        C13OY effectPlatform;
        Effect effectLIZLLL = C365460EUm.LIZLLL(str);
        if (effectLIZLLL == null || (effectManagerLLJILJILJ = LJIILIIL().LLJILJILJ()) == null || (effectPlatform = effectManagerLLJILJILJ.getEffectPlatform()) == null || !effectPlatform.LJIJI(effectLIZLLL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC360730ECh
    public final void LIZIZ(C360720ECg c360720ECg) {
        this.LIZIZ = c360720ECg;
    }

    @Override // X.InterfaceC360730ECh
    public final void LJIIIIZZ(final String str) {
        InterfaceC365520EUs<C357590E0f> interfaceC365520EUs = this.LIZIZ;
        if (interfaceC365520EUs != null) {
            interfaceC365520EUs.onStart();
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C365460EUm.LIZJ;
        if (concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            List list = (List) concurrentHashMap.get(str);
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            InterfaceC365520EUs<C357590E0f> interfaceC365520EUs2 = this.LIZIZ;
            if (interfaceC365520EUs2 != null) {
                C365360EUc.LIZ.getClass();
                interfaceC365520EUs2.LIZIZ(C365360EUc.LIZLLL(list), true);
                return;
            }
            return;
        }
        IFetchEffectChannelListener iFetchEffectChannelListener = new IFetchEffectChannelListener() { // from class: X.0EUk
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                Exception exception;
                int errorCode;
                InterfaceC365520EUs<C357590E0f> interfaceC365520EUs3 = this.LIZIZ;
                if (interfaceC365520EUs3 != null) {
                    if (exceptionResult != null) {
                        exception = exceptionResult.getException();
                        errorCode = exceptionResult.getErrorCode();
                    } else {
                        exception = null;
                        errorCode = -1;
                    }
                    interfaceC365520EUs3.LIZ(new C0EDV(exception, errorCode));
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) throws JSONException {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2 != null) {
                    Object objLJJJLL = C13LP.LJJJLL(effectChannelResponse2.getUrl_prefix());
                    if (objLJJJLL != null) {
                        Iterator<EffectCategoryResponse> it2 = effectChannelResponse2.getCategoryResponseList().iterator();
                        while (it2.hasNext()) {
                            for (Effect effect : (ArrayList) C13LP.LJLIL(effectChannelResponse2.getAllCategoryEffects(), it2.next().getTotalEffects())) {
                                if (effect.getExtra() != null && (!a0.LJJJIL(r0))) {
                                    C1446130njf.LIZ.getClass();
                                    JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
                                    if (jSONObjectLJII != null) {
                                        jSONObjectLJII.put("prefix", objLJJJLL);
                                    } else {
                                        jSONObjectLJII = null;
                                    }
                                    effect.setExtra(String.valueOf(jSONObjectLJII));
                                }
                            }
                        }
                    }
                    List<EffectCategoryResponse> categoryResponseList = effectChannelResponse2.getCategoryResponseList();
                    if (!categoryResponseList.isEmpty()) {
                        C365460EUm.LIZ(str, categoryResponseList);
                        String str2 = str;
                        for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str2);
                            sbLIZ.append(effectCategoryResponse.getKey());
                            C365460EUm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), effectCategoryResponse.getTotalEffects());
                        }
                        InterfaceC365520EUs<C357590E0f> interfaceC365520EUs3 = this.LIZIZ;
                        if (interfaceC365520EUs3 != null) {
                            C365360EUc.LIZ.getClass();
                            interfaceC365520EUs3.LIZIZ(C365360EUc.LIZLLL(categoryResponseList), false);
                            return;
                        }
                        return;
                    }
                    InterfaceC365520EUs<C357590E0f> interfaceC365520EUs4 = this.LIZIZ;
                    if (interfaceC365520EUs4 != null) {
                        interfaceC365520EUs4.LIZIZ(C13BV.INSTANCE, false);
                    }
                }
            }
        };
        if (LJIILIIL() instanceof InterfaceC1635410sex) {
            LJIILIIL().LJJJI(str, iFetchEffectChannelListener);
        } else {
            LJIILIIL().LJI(str, false, iFetchEffectChannelListener);
        }
    }

    public final List<Effect> LJIIL(List<? extends Effect> list) {
        C13OY effectPlatform;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Effect effect : list) {
            if (true ^ effect.getChildEffects().isEmpty()) {
                arrayList2.add(effect);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            for (Effect effect2 : ((Effect) it2.next()).getChildEffects()) {
                EffectManager effectManagerLLJILJILJ = LJIILIIL().LLJILJILJ();
                if (effectManagerLLJILJILJ != null && (effectPlatform = effectManagerLLJILJILJ.getEffectPlatform()) != null && effectPlatform.LJIJI(effect2)) {
                    arrayList.add(effect2);
                }
            }
        }
        arrayList.addAll(list);
        return arrayList;
    }

    @Override // X.InterfaceC360730ECh
    public final void LIZJ(final InterfaceC365420EUi interfaceC365420EUi, final String str) {
        C13OY effectPlatform;
        Effect effectLIZLLL = C365460EUm.LIZLLL(str);
        if (effectLIZLLL == null) {
            interfaceC365420EUi.LIZ(str, new C0EDV(new IllegalStateException("AVEEffectPlatform#fetchEffect, effect is not exist effectListCache."), -1));
            return;
        }
        EffectManager effectManagerLLJILJILJ = LJIILIIL().LLJILJILJ();
        if (effectManagerLLJILJILJ == null || (effectPlatform = effectManagerLLJILJILJ.getEffectPlatform()) == null) {
            return;
        }
        effectPlatform.LJ(effectLIZLLL, new C13NY() { // from class: X.0EUg
            @Override // X.C13NY
            public final void onStart(Effect effect) {
            }

            @Override // X.C13MA
            public final void onSuccess(Effect effect) {
                Effect effect2 = effect;
                if (effect2 != null && effect2.getUnzipPath().length() > 0) {
                    interfaceC365420EUi.LJJI(str, effect2.getUnzipPath());
                } else {
                    interfaceC365420EUi.LIZ(str, new C0EDV(new IllegalStateException("effect is null or effect unzipPath is empty"), -1));
                }
            }

            @Override // X.C13MA
            public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
            }

            @Override // X.C13MA
            public final void onFail(Effect effect, C1662010tLr c1662010tLr) {
                interfaceC365420EUi.LIZ(str, new C0EDV(c1662010tLr.LIZLLL, c1662010tLr.LIZ));
            }

            @Override // X.C13NY
            public final void onProgress(Effect effect, int i, long j) {
                interfaceC365420EUi.onProgress(i);
            }
        });
    }

    @Override // X.InterfaceC360730ECh
    public final void LJIIIZ(String str, String str2, final InterfaceC365520EUs<ResourceItem> interfaceC365520EUs) {
        InterfaceC1635410sex interfaceC1635410sex;
        interfaceC365520EUs.onStart();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C365460EUm.LJI(strLIZIZ)) {
            List listLJFF = C365460EUm.LJFF(strLIZIZ);
            C365360EUc.LIZ.getClass();
            interfaceC365520EUs.LIZIZ(C365360EUc.LIZIZ(listLJFF), true);
            return;
        }
        IFetchCategoryEffectListener iFetchCategoryEffectListener = new IFetchCategoryEffectListener() { // from class: X.0EUq
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                Exception exception;
                int errorCode;
                InterfaceC365520EUs<ResourceItem> interfaceC365520EUs2 = interfaceC365520EUs;
                if (interfaceC365520EUs2 != null) {
                    if (exceptionResult != null) {
                        exception = exceptionResult.getException();
                        errorCode = exceptionResult.getErrorCode();
                    } else {
                        exception = null;
                        errorCode = -1;
                    }
                    interfaceC365520EUs2.LIZ(new C0EDV(exception, errorCode));
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                List<Effect> arrayList;
                CategoryEffectModel category_effects;
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                if (categoryPageModel2 == null || (category_effects = categoryPageModel2.getCategory_effects()) == null || (arrayList = category_effects.getCategory_effects()) == null) {
                    arrayList = new ArrayList<>();
                }
                C365460EUm.LIZIZ(strLIZIZ, arrayList);
                InterfaceC365520EUs<ResourceItem> interfaceC365520EUs2 = interfaceC365520EUs;
                if (interfaceC365520EUs2 != null) {
                    C365360EUc.LIZ.getClass();
                    interfaceC365520EUs2.LIZIZ(C365360EUc.LIZIZ(arrayList), false);
                }
            }
        };
        if (LJIILIIL() instanceof InterfaceC1635410sex) {
            InterfaceC1635390sev interfaceC1635390sevLJIILIIL = LJIILIIL();
            if ((interfaceC1635390sevLJIILIIL instanceof InterfaceC1635410sex) && (interfaceC1635410sex = (InterfaceC1635410sex) interfaceC1635390sevLJIILIIL) != null && interfaceC1635410sex.zg(str, str2)) {
                C1635120seU.LIZ(0, 0, 0, 0, iFetchCategoryEffectListener, LJIILIIL(), str, str2, CardStruct.IStatusCode.DEFAULT, null, false);
                return;
            }
        }
        C1635120seU.LIZLLL(0, 0, 0, 0, iFetchCategoryEffectListener, LJIILIIL(), str, str2, CardStruct.IStatusCode.DEFAULT, null);
    }

    @Override // X.InterfaceC360730ECh
    public final void LIZLLL(int i, String str, String str2, final Function1 function1) {
        LJIILIIL().LJJIJL(str, str2, i, null, new ICheckChannelListener() { // from class: X.08xT
            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelFailed(ExceptionResult exceptionResult) {
                function1.invoke(Boolean.TRUE);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                function1.invoke(Boolean.valueOf(z));
            }
        });
    }

    @Override // X.InterfaceC360730ECh
    public final void LJIIJ(ArrayList<String> arrayList, final String str, final boolean z, final IFetchEffectListListener iFetchEffectListListener) {
        HashMap map = new HashMap();
        map.put("panel", str);
        LJIILIIL().LJJIJIIJI(arrayList, true, map, new IFetchEffectListListener() { // from class: X.0EUo
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                iFetchEffectListListener.onFail(exceptionResult);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list) {
                ArrayList arrayList2;
                final C118300cf c118300cf;
                C13OY effectPlatform;
                final List<Effect> list2 = list;
                String str2 = str;
                for (Effect effect : list2) {
                    C365460EUm.LJII(effect, effect.getEffect_id());
                    ((ConcurrentHashMap) C365460EUm.LIZ).put(C0FGD.LIZ(effect.getResourceId(), str2), effect);
                }
                if (z) {
                    final ArrayList arrayList3 = new ArrayList();
                    C118300cf c118300cf2 = new C118300cf();
                    final ArrayList arrayList4 = new ArrayList();
                    C365380EUe c365380EUe = this;
                    final IFetchEffectListListener iFetchEffectListListener2 = iFetchEffectListListener;
                    int i = 0;
                    for (Effect effect2 : list2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            Effect effect3 = effect2;
                            EffectManager effectManagerLLJILJILJ = c365380EUe.LJIILIIL().LLJILJILJ();
                            if (effectManagerLLJILJILJ != null && (effectPlatform = effectManagerLLJILJILJ.getEffectPlatform()) != null) {
                                arrayList2 = arrayList3;
                                c118300cf = c118300cf2;
                                effectPlatform.LJ(effect3, new C13NY() { // from class: X.0EUp
                                    @Override // X.C13NY
                                    public final void onProgress(Effect effect4, int i3, long j) {
                                    }

                                    @Override // X.C13NY
                                    public final void onStart(Effect effect4) {
                                    }

                                    @Override // X.C13MA
                                    public final void onSuccess(Effect effect4) {
                                        if (effect4 != null) {
                                            arrayList4.add(effect4);
                                        } else {
                                            arrayList3.add(new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null));
                                        }
                                        C118300cf c118300cf3 = c118300cf;
                                        int i3 = c118300cf3.element + 1;
                                        c118300cf3.element = i3;
                                        if (i3 == list2.size()) {
                                            if (!arrayList3.isEmpty()) {
                                                iFetchEffectListListener2.onFail(new ExceptionResult(-2));
                                            } else {
                                                iFetchEffectListListener2.onSuccess(C13LP.LLIIII(arrayList4));
                                            }
                                        }
                                    }

                                    @Override // X.C13MA
                                    public final /* bridge */ /* synthetic */ void preProcess(Effect effect4) {
                                    }

                                    @Override // X.C13MA
                                    public final void onFail(Effect effect4, C1662010tLr c1662010tLr) {
                                        Effect effect5 = effect4;
                                        c118300cf.element++;
                                        List<Effect> list3 = arrayList3;
                                        if (effect5 == null) {
                                            effect5 = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
                                        }
                                        list3.add(effect5);
                                        if (c118300cf.element == list2.size()) {
                                            iFetchEffectListListener2.onFail(new ExceptionResult(new Exception(c1662010tLr.LIZIZ)));
                                        }
                                    }
                                });
                            } else {
                                arrayList2 = arrayList3;
                                c118300cf = c118300cf2;
                            }
                            arrayList3 = arrayList2;
                            i = i2;
                            c118300cf2 = c118300cf;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    return;
                }
                iFetchEffectListListener.onSuccess(list2);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0448  */
    @Override // X.InterfaceC360730ECh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.content.Context r16, java.lang.String r17, java.lang.String r18, X.InterfaceC365520EUs<com.ss.ugc.android.editor.base.resource.ResourceItem> r19) {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365380EUe.LJIIJJI(android.content.Context, java.lang.String, java.lang.String, X.0EUs):void");
    }

    @Override // X.InterfaceC360730ECh
    public final void LJII(final String str, boolean z, final boolean z2, final boolean z3, final InterfaceC365520EUs<ResourceItem> interfaceC365520EUs) {
        boolean z4;
        if (interfaceC365520EUs != null) {
            interfaceC365520EUs.onStart();
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C365460EUm.LIZJ;
        Collection collection = (Collection) concurrentHashMap.get(str);
        if (collection != null && !collection.isEmpty()) {
            List list = (List) concurrentHashMap.get(str);
            if (list != null && interfaceC365520EUs != null) {
                C365360EUc.LIZ.getClass();
                interfaceC365520EUs.LIZIZ(C365360EUc.LJ(C365360EUc.LIZLLL(list)), true);
                return;
            }
            return;
        }
        if (C365460EUm.LJI(str)) {
            List listLJFF = C365460EUm.LJFF(str);
            if (interfaceC365520EUs != null) {
                C365360EUc.LIZ.getClass();
                interfaceC365520EUs.LIZIZ(C365360EUc.LIZIZ(listLJFF), true);
                return;
            }
            return;
        }
        IFetchEffectChannelListener iFetchEffectChannelListener = new IFetchEffectChannelListener() { // from class: X.0EUl
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                Exception exception;
                int errorCode;
                InterfaceC365520EUs<ResourceItem> interfaceC365520EUs2 = interfaceC365520EUs;
                if (interfaceC365520EUs2 != null) {
                    if (exceptionResult != null) {
                        exception = exceptionResult.getException();
                        errorCode = exceptionResult.getErrorCode();
                    } else {
                        exception = null;
                        errorCode = -1;
                    }
                    interfaceC365520EUs2.LIZ(new C0EDV(exception, errorCode));
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) throws JSONException {
                final ArrayList arrayList;
                final String str2;
                final InterfaceC365520EUs<ResourceItem> interfaceC365520EUs2;
                C13OY effectPlatform;
                C13OY effectPlatform2;
                C13OY effectPlatform3;
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2 != null) {
                    Object objLJJJLL = C13LP.LJJJLL(effectChannelResponse2.getUrl_prefix());
                    if (objLJJJLL != null) {
                        Iterator<EffectCategoryResponse> it2 = effectChannelResponse2.getCategoryResponseList().iterator();
                        while (it2.hasNext()) {
                            for (Effect effect : (ArrayList) C13LP.LJLIL(effectChannelResponse2.getAllCategoryEffects(), it2.next().getTotalEffects())) {
                                if (effect.getExtra() != null && (!a0.LJJJIL(r0))) {
                                    C1446130njf.LIZ.getClass();
                                    JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
                                    if (jSONObjectLJII != null) {
                                        jSONObjectLJII.put("prefix", objLJJJLL);
                                    } else {
                                        jSONObjectLJII = null;
                                    }
                                    effect.setExtra(String.valueOf(jSONObjectLJII));
                                }
                            }
                        }
                    }
                    List<EffectCategoryResponse> categoryResponseList = effectChannelResponse2.getCategoryResponseList();
                    int i = 0;
                    if ((!categoryResponseList.isEmpty()) && !z3) {
                        C365460EUm.LIZ(str, categoryResponseList);
                        C365380EUe c365380EUe = this;
                        Iterator<EffectCategoryResponse> it3 = categoryResponseList.iterator();
                        while (it3.hasNext()) {
                            Iterator<Effect> it4 = it3.next().getTotalEffects().iterator();
                            while (it4.hasNext()) {
                                for (Effect effect2 : it4.next().getChildEffects()) {
                                    EffectManager effectManagerLLJILJILJ = c365380EUe.LJIILIIL().LLJILJILJ();
                                    if (effectManagerLLJILJILJ != null && (effectPlatform3 = effectManagerLLJILJILJ.getEffectPlatform()) != null && effectPlatform3.LJIJI(effect2)) {
                                        C365460EUm.LJII(effect2, effect2.getEffectId());
                                    }
                                }
                            }
                        }
                        InterfaceC365520EUs<ResourceItem> interfaceC365520EUs3 = interfaceC365520EUs;
                        if (interfaceC365520EUs3 != null) {
                            C365360EUc.LIZ.getClass();
                            interfaceC365520EUs3.LIZIZ(C365360EUc.LJ(C365360EUc.LIZLLL(categoryResponseList)), false);
                            return;
                        }
                        return;
                    }
                    final List<Effect> allCategoryEffects = effectChannelResponse2.getAllCategoryEffects();
                    if (!allCategoryEffects.isEmpty()) {
                        C365380EUe c365380EUe2 = this;
                        final ArrayList arrayList2 = new ArrayList();
                        for (Effect effect3 : allCategoryEffects) {
                            Effect effect4 = effect3;
                            EffectManager effectManagerLLJILJILJ2 = c365380EUe2.LJIILIIL().LLJILJILJ();
                            if (effectManagerLLJILJILJ2 == null || (effectPlatform2 = effectManagerLLJILJILJ2.getEffectPlatform()) == null || !effectPlatform2.LJIJI(effect4)) {
                                arrayList2.add(effect3);
                            }
                        }
                        if (z2 && (!arrayList2.isEmpty())) {
                            ArrayList arrayList3 = new ArrayList();
                            final C118300cf c118300cf = new C118300cf();
                            final C365380EUe c365380EUe3 = this;
                            InterfaceC365520EUs<ResourceItem> interfaceC365520EUs4 = interfaceC365520EUs;
                            String str3 = str;
                            for (Object obj : arrayList2) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    Effect effect5 = (Effect) obj;
                                    EffectManager effectManagerLLJILJILJ3 = c365380EUe3.LJIILIIL().LLJILJILJ();
                                    if (effectManagerLLJILJILJ3 != null && (effectPlatform = effectManagerLLJILJILJ3.getEffectPlatform()) != null) {
                                        arrayList = arrayList3;
                                        str2 = str3;
                                        interfaceC365520EUs2 = interfaceC365520EUs4;
                                        effectPlatform.LJ(effect5, new C13NY() { // from class: X.0EUn
                                            @Override // X.C13NY
                                            public final void onProgress(Effect effect6, int i3, long j) {
                                            }

                                            @Override // X.C13NY
                                            public final void onStart(Effect effect6) {
                                            }

                                            @Override // X.C13MA
                                            public final void onSuccess(Effect effect6) {
                                                if (effect6 == null) {
                                                    arrayList.add(new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null));
                                                }
                                                C118300cf c118300cf2 = c118300cf;
                                                int i3 = c118300cf2.element + 1;
                                                c118300cf2.element = i3;
                                                if (i3 == arrayList2.size()) {
                                                    if (!arrayList.isEmpty()) {
                                                        InterfaceC365520EUs<ResourceItem> interfaceC365520EUs5 = interfaceC365520EUs2;
                                                        if (interfaceC365520EUs5 != null) {
                                                            interfaceC365520EUs5.LIZ(new C0EDV(null, -2));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    C365460EUm.LIZIZ(str2, c365380EUe3.LJIIL(allCategoryEffects));
                                                    InterfaceC365520EUs<ResourceItem> interfaceC365520EUs6 = interfaceC365520EUs2;
                                                    if (interfaceC365520EUs6 == null) {
                                                        return;
                                                    }
                                                    C365360EUc c365360EUc = C365360EUc.LIZ;
                                                    List listLLIIII = C13LP.LLIIII(allCategoryEffects);
                                                    c365360EUc.getClass();
                                                    interfaceC365520EUs6.LIZIZ(C365360EUc.LIZIZ(listLLIIII), false);
                                                }
                                            }

                                            @Override // X.C13MA
                                            public final /* bridge */ /* synthetic */ void preProcess(Effect effect6) {
                                            }

                                            @Override // X.C13MA
                                            public final void onFail(Effect effect6, C1662010tLr c1662010tLr) {
                                                InterfaceC365520EUs<ResourceItem> interfaceC365520EUs5;
                                                Effect effect7 = effect6;
                                                c118300cf.element++;
                                                List<Effect> list2 = arrayList;
                                                if (effect7 == null) {
                                                    effect7 = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
                                                }
                                                list2.add(effect7);
                                                if (c118300cf.element == arrayList2.size() && (interfaceC365520EUs5 = interfaceC365520EUs2) != null) {
                                                    interfaceC365520EUs5.LIZ(new C0EDV(null, -2));
                                                }
                                            }
                                        });
                                    } else {
                                        arrayList = arrayList3;
                                        str2 = str3;
                                        interfaceC365520EUs2 = interfaceC365520EUs4;
                                    }
                                    i = i2;
                                    arrayList3 = arrayList;
                                    str3 = str2;
                                    interfaceC365520EUs4 = interfaceC365520EUs2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            return;
                        }
                        C365460EUm.LIZIZ(str, this.LJIIL(allCategoryEffects));
                        InterfaceC365520EUs<ResourceItem> interfaceC365520EUs5 = interfaceC365520EUs;
                        if (interfaceC365520EUs5 != null) {
                            C365360EUc.LIZ.getClass();
                            interfaceC365520EUs5.LIZIZ(C365360EUc.LIZIZ(allCategoryEffects), false);
                            return;
                        }
                        return;
                    }
                    InterfaceC365520EUs<ResourceItem> interfaceC365520EUs6 = interfaceC365520EUs;
                    if (interfaceC365520EUs6 != null) {
                        interfaceC365520EUs6.LIZIZ(C13BV.INSTANCE, false);
                    }
                }
            }
        };
        if (Intrinsics.LJFF(str, "editor_pro_retouch")) {
            InterfaceC1635390sev interfaceC1635390sevLJIILIIL = LJIILIIL();
            int iLIZ = C290910Baj.LIZ();
            boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_beauty_api_abgroup_server_filtering", true, false);
            if (!C365390EUf.LIZ() && !C365390EUf.LIZIZ()) {
                IToolsOfflineService iToolsOfflineService = (IToolsOfflineService) PluggableExtentionKt.pluggableSpi$default(IToolsOfflineService.class, false, false, false, 14, null);
                if (iToolsOfflineService != null) {
                    iToolsOfflineService.LIZ();
                }
                z4 = false;
            } else {
                z4 = true;
            }
            C1635120seU.LJIIIIZZ(interfaceC1635390sevLJIILIIL, str, false, iLIZ, zLJIIIZ, z4, iFetchEffectChannelListener);
            return;
        }
        if (z) {
            LJIILIIL().LJJJJI(str, true, z2, iFetchEffectChannelListener);
        } else if (LJIILIIL() instanceof InterfaceC1635410sex) {
            LJIILIIL().LJJJI(str, iFetchEffectChannelListener);
        } else {
            LJIILIIL().LJI(str, false, iFetchEffectChannelListener);
        }
    }
}
