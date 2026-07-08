package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.zhiliaoapp.musically.R;
import j1d.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698350uIT implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C1634100scq<SocialAvatarStickerStruct, EnumC1641420soe, Integer>> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
        }
    }

    public C1698350uIT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C1698350uIT c1698350uIT, C09AJ c09aj) {
        C1C7U.LIZ("InfoStickerSocialAvatarStateViewModel@bb7a.downloadStickerActual$1");
        c09aj.onNext(new C1634100scq((SocialAvatarStickerStruct) c1698350uIT.l0, EnumC1641420soe.DOWNLOAD_SUCCESS, 100));
        c09aj.onComplete();
        C1C7U.LIZIZ("InfoStickerSocialAvatarStateViewModel@bb7a.downloadStickerActual$1");
    }

    public static final void subscribe$1(C1698350uIT c1698350uIT, C09AJ c09aj) {
        C1C7U.LIZ("DefaultLocalFilterDataFetcher@3c1b.requestActual$1");
        p0 p0Var = (p0) c1698350uIT.l0;
        p0Var.getClass();
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
        effectCategoryResponse.setName("Filter");
        effectCategoryResponse.setKey("Sample");
        effectCategoryResponse.setExtra("{\"ab_group\": \"-1\"}");
        List<C1639670slp> listLIZJ = p0Var.LIZ.LIZJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(effectCategoryResponse, listLIZJ));
        c09aj.onNext(new C1638380sjk(new C1638440sjq(listLIZJ, arrayList, null), false));
        c09aj.onComplete();
        C1C7U.LIZIZ("DefaultLocalFilterDataFetcher@3c1b.requestActual$1");
    }

    public static final void subscribe$2(C1698350uIT c1698350uIT, C09AJ c09aj) {
        C1C7U.LIZ("MultiTabInfoStickerListMetaFetcher@cd4.requestActual$1");
        final ArrayList arrayList = new ArrayList();
        String strInvoke = ((C1634310sdB) c1698350uIT.l0).LIZIZ.invoke();
        EnumC1641350soX enumC1641350soX = EnumC1641350soX.RECOMMEND;
        arrayList.add(new C1634340sdE(strInvoke, enumC1641350soX.getTag(), enumC1641350soX, null, Integer.valueOf(R.raw.icon_sticker_round), null, null, 104));
        arrayList.add(new C1634340sdE(((C1634310sdB) c1698350uIT.l0).LIZJ.invoke(), ((C1634310sdB) c1698350uIT.l0).LIZLLL.invoke(), EnumC1641350soX.EMOJI, null, Integer.valueOf(R.raw.icon_emoji), null, null, 104));
        InterfaceC1635390sev interfaceC1635390sevInvoke = ((C1634310sdB) c1698350uIT.l0).LIZ.invoke();
        String strInvoke2 = ((C1634310sdB) c1698350uIT.l0).LIZIZ.invoke();
        final C1634310sdB c1634310sdB = (C1634310sdB) c1698350uIT.l0;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        C1635120seU.LJI(interfaceC1635390sevInvoke, strInvoke2, false, "", 0, 0, new IFetchPanelInfoListener() { // from class: X.0sdC
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                c19482611Ke.onNext(arrayList);
                c19482611Ke.onComplete();
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                AbstractC1634360sdG next;
                UrlModel icon_selected;
                C1634340sdE c1634340sdE;
                String key;
                String key2;
                String name;
                PanelInfoModel panelInfoModel2 = panelInfoModel;
                if (panelInfoModel2 != null) {
                    List<EffectCategoryModel> categoryList = panelInfoModel2.getCategoryList();
                    C1634310sdB c1634310sdB2 = c1634310sdB;
                    ArrayList arrayList2 = new ArrayList();
                    for (EffectCategoryModel effectCategoryModel : categoryList) {
                        if (c1634310sdB2.LJ.invoke(new EffectCategoryResponse(null, null, effectCategoryModel.getKey(), null, null, null, null, null, null, null, null, false, null, 8187, null)).booleanValue()) {
                            arrayList2.add(effectCategoryModel);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                EffectCategoryModel effectCategoryModel2 = (EffectCategoryModel) ListProtector.get(arrayList2, i);
                                if (Intrinsics.LJFF(effectCategoryModel2.getKey(), "recommended") || Intrinsics.LJFF(effectCategoryModel2.getName(), "Recommended")) {
                                    break;
                                } else {
                                    i++;
                                }
                            } else {
                                i = 0;
                                break;
                            }
                        }
                        EffectCategoryModel effectCategoryModel3 = (EffectCategoryModel) ListProtector.get(arrayList2, i);
                        ArrayList<EffectCategoryModel> arrayList3 = new ArrayList(arrayList2);
                        ListProtector.remove(arrayList3, i);
                        Iterator<AbstractC1634360sdG> it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.LIZIZ, EnumC1641350soX.RECOMMEND.getTag())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        if ((next instanceof C1634340sdE) && (c1634340sdE = (C1634340sdE) next) != null) {
                            c1634340sdE.LJI = effectCategoryModel3;
                            if (effectCategoryModel3 != null) {
                                key = effectCategoryModel3.getKey();
                            } else {
                                key = null;
                            }
                            c1634340sdE.LJII = key;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(c1634340sdE.LIZJ);
                            sbLIZ.append(':');
                            EffectCategoryModel effectCategoryModel4 = c1634340sdE.LJI;
                            if (effectCategoryModel4 == null || (key2 = effectCategoryModel4.getKey()) == null) {
                                key2 = "";
                            }
                            sbLIZ.append(key2);
                            c1634340sdE.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                            EffectCategoryModel effectCategoryModel5 = c1634340sdE.LJI;
                            if (effectCategoryModel5 == null || (name = effectCategoryModel5.getName()) == null) {
                                name = c1634340sdE.LIZIZ;
                            }
                            c1634340sdE.LIZIZ = name;
                        }
                        List<AbstractC1634360sdG> list = arrayList;
                        C1634310sdB c1634310sdB3 = c1634310sdB;
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                        for (EffectCategoryModel effectCategoryModel6 : arrayList3) {
                            String strInvoke3 = c1634310sdB3.LIZIZ.invoke();
                            String name2 = effectCategoryModel6.getName();
                            UrlModel icon_selected2 = effectCategoryModel6.getIcon_selected();
                            if (icon_selected2 != null && icon_selected2.isValid()) {
                                icon_selected = effectCategoryModel6.getIcon_selected();
                            } else {
                                icon_selected = null;
                            }
                            arrayList4.add(new C1634340sdE(strInvoke3, name2, EnumC1641350soX.OTHERS, icon_selected, null, effectCategoryModel6, null, 80));
                        }
                        list.addAll(arrayList4);
                    } else {
                        return;
                    }
                }
                c19482611Ke.onNext(arrayList);
                c19482611Ke.onComplete();
            }
        }, false, false, 0, C2097608Jq.LJ());
        C1C7U.LIZIZ("MultiTabInfoStickerListMetaFetcher@cd4.requestActual$1");
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0se8] */
    public static final void subscribe$3(C1698350uIT c1698350uIT, C09AJ c09aj) {
        C1C7U.LIZ("AbstractEffectPlatformFetcher@7861.requestEffectPlatform$1");
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        final ?? r11 = new InterfaceC1634910se9<Object>() { // from class: X.0se8
            @Override // X.InterfaceC1634910se9
            public final void onFail(ExceptionResult exceptionResult) {
                Exception runtimeException;
                String msg;
                if (exceptionResult != null) {
                    exceptionResult.getException();
                }
                C09AJ<C1641660sp2<Object>> c09aj2 = c19482611Ke;
                if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed on fetch from effect platform, msg : ");
                    Integer numValueOf = null;
                    if (exceptionResult != null) {
                        msg = exceptionResult.getMsg();
                    } else {
                        msg = null;
                    }
                    sbLIZ.append(msg);
                    sbLIZ.append(", code : ");
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append('.');
                    runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
                c09aj2.tryOnError(runtimeException);
                c19482611Ke.onComplete();
            }

            @Override // X.InterfaceC1634910se9
            public final void onSuccess(Object obj) {
                c19482611Ke.onNext(C1641650sp1.LIZ(obj));
                c19482611Ke.onComplete();
            }
        };
        AbstractC1634880se6 abstractC1634880se6 = (AbstractC1634880se6) c1698350uIT.l0;
        Function0<InterfaceC1635390sev> function0 = abstractC1634880se6.LIZ;
        Function0<String> function02 = abstractC1634880se6.LIZIZ;
        C1634050scl c1634050scl = (C1634050scl) abstractC1634880se6;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1635390sev interfaceC1635390sevInvoke = function0.invoke();
        String strInvoke = function02.invoke();
        final C1634020sci c1634020sci = c1634050scl.LIZJ;
        final C1634350sdF c1634350sdF = c1634050scl.LIZLLL;
        IFetchEffectChannelListener iFetchEffectChannelListener = new IFetchEffectChannelListener() { // from class: X.0se7
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                int i;
                int errorCode;
                C1634020sci c1634020sci2 = c1634020sci;
                C1634350sdF c1634350sdF2 = c1634350sdF;
                float fCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis;
                c1634020sci2.getClass();
                if (Collections.singletonList("infostickerv2").contains(c1634350sdF2.LIZJ)) {
                    if (exceptionResult != null && exceptionResult.getErrorCode() == 10004) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (exceptionResult != null) {
                        errorCode = exceptionResult.getErrorCode();
                    } else {
                        errorCode = -1;
                    }
                    C1634920seA.LIZ(i, "", 0, false, "", fCurrentTimeMillis, 0, errorCode);
                }
                r11.onFail(exceptionResult);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                int i;
                List<EffectCategoryResponse> categoryResponseList;
                EffectCategoryResponse effectCategoryResponse;
                boolean z;
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                C1634020sci c1634020sci2 = c1634020sci;
                C1634350sdF c1634350sdF2 = c1634350sdF;
                if (effectChannelResponse2 != null && effectChannelResponse2.isFromCache()) {
                    i = 1;
                } else {
                    i = 0;
                }
                float fCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis;
                c1634020sci2.getClass();
                if (Collections.singletonList("infostickerv2").contains(c1634350sdF2.LIZJ)) {
                    if (effectChannelResponse2 != null && (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) != null && (effectCategoryResponse = (EffectCategoryResponse) C13LP.LJJJLL(categoryResponseList)) != null) {
                        String key = effectCategoryResponse.getKey();
                        StringBuilder sb = new StringBuilder();
                        int size = effectCategoryResponse.getTotalEffects().size();
                        if (size > 30) {
                            size = 30;
                        }
                        String string = "";
                        int i2 = 0;
                        boolean z2 = false;
                        boolean z3 = false;
                        for (int i3 = 0; i3 < size; i3++) {
                            Effect effect = (Effect) ListProtector.get(effectCategoryResponse.getTotalEffects(), i3);
                            if (!C1462570oAB.LJIILIIL(effect) && !C1462570oAB.LJ(effect) && !C1462570oAB.LJIIJ(effect)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i3 > 0) {
                                sb.append(",");
                            }
                            sb.append(effect.getEffectId());
                            if (z) {
                                z3 = true;
                            } else {
                                if (!C1462570oAB.LJ(effect) && !C1462570oAB.LJIIJ(effect)) {
                                    i2++;
                                }
                                if (z3) {
                                    string = sb.toString();
                                    z2 = true;
                                }
                            }
                        }
                        C1634920seA.LIZ(i, key, i2, z2, string, fCurrentTimeMillis, 1, 0);
                    } else {
                        C1634920seA.LIZ(i, "", 0, false, "", fCurrentTimeMillis, 0, 40001);
                    }
                }
                r11.onSuccess(effectChannelResponse2);
            }
        };
        EffectChannelResponse effectChannelResponse = C1635120seU.LIZ;
        AnonymousClass0907 anonymousClass0907 = new AnonymousClass0907(iFetchEffectChannelListener, interfaceC1635390sevInvoke, strInvoke);
        InterfaceC1635390sev.LJJLIIIIJ.getClass();
        interfaceC1635390sevInvoke.LJJIJL(strInvoke, null, 0, null, new AnonymousClass0908(anonymousClass0907, interfaceC1635390sevInvoke, strInvoke));
        C1C7U.LIZIZ("AbstractEffectPlatformFetcher@7861.requestEffectPlatform$1");
    }
}
