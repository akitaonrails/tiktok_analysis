package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.MultiGuestTextHeaderMockSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.14vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20424314vx {
    public static final Map<String, TextHeaderBoardTextFontStyleData> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public static final ConcurrentHashMap<String, Typeface> LIZIZ = new ConcurrentHashMap<>();
    public static String LIZJ = "default";

    public static List LIZLLL() {
        String str;
        Map<String, TextHeaderBoardTextFontStyleData> map = LIZ;
        if (map.isEmpty()) {
            return new ArrayList();
        }
        for (TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData : map.values()) {
            if (textHeaderBoardTextFontStyleData != null) {
                if (TextUtils.isEmpty(textHeaderBoardTextFontStyleData.fileName) || LIZIZ.get(textHeaderBoardTextFontStyleData.fileName) == null) {
                    String str2 = textHeaderBoardTextFontStyleData.LIZ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Typeface typefaceLJFF = LJFF(str2);
                    if (typefaceLJFF == null || (str = textHeaderBoardTextFontStyleData.fileName) == null || str.length() <= 0) {
                        textHeaderBoardTextFontStyleData.LIZIZ = 2;
                    } else {
                        String str3 = textHeaderBoardTextFontStyleData.fileName;
                        if (str3 != null) {
                            LIZIZ.put(str3, typefaceLJFF);
                        }
                        textHeaderBoardTextFontStyleData.LIZIZ = 1;
                    }
                } else {
                    textHeaderBoardTextFontStyleData.LIZIZ = 1;
                }
            }
        }
        return new ArrayList(LIZ.values());
    }

    public static AbstractC19484711Kz LIZ(final String str) {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01gW
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [X.01gV] */
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<TextHeaderBoardTextFontStyleData> interfaceC2329309At) {
                TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleDataLIZJ = C20424314vx.LIZJ(str);
                if (textHeaderBoardTextFontStyleDataLIZJ != null) {
                    interfaceC2329309At.onSuccess(textHeaderBoardTextFontStyleDataLIZJ);
                    return;
                }
                InterfaceC397701gd interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
                if (interfaceC397701gdYn2 != 0) {
                    List listSingletonList = Collections.singletonList(str);
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("panel", "text_header"));
                    final String str2 = str;
                    final C11KT c11kt = (C11KT) interfaceC2329309At;
                    interfaceC397701gdYn2.LJIILIIL(listSingletonList, mapLJIIJ, new IFetchEffectListListener() { // from class: X.01gV
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fetchEffectsWithResId resourceId:");
                            sbLIZ.append(str2);
                            sbLIZ.append(" onFail:");
                            sbLIZ.append(exceptionResult);
                            C20441214yg.LIZIZ("TextHeaderFontStyleManager", C2188811AlT.LIZIZ(sbLIZ));
                            c11kt.onError(exceptionResult.getException());
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(List<Effect> list) {
                            List<Effect> list2 = list;
                            ArrayList arrayList = new ArrayList();
                            if (list2 != null) {
                                for (Effect effect : list2) {
                                    if (effect != null) {
                                        arrayList.add(effect);
                                    }
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData = null;
                            while (it2.hasNext()) {
                                TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleDataLJI = C20424314vx.LJI((Effect) it2.next());
                                if (textHeaderBoardTextFontStyleDataLJI != null) {
                                    textHeaderBoardTextFontStyleData = textHeaderBoardTextFontStyleDataLJI;
                                }
                            }
                            if (textHeaderBoardTextFontStyleData != null) {
                                c11kt.onSuccess(textHeaderBoardTextFontStyleData);
                                return;
                            }
                            InterfaceC2329309At<TextHeaderBoardTextFontStyleData> interfaceC2329309At2 = c11kt;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("resourceId:");
                            sbLIZ.append(str2);
                            sbLIZ.append(" value is null!");
                            interfaceC2329309At2.onError(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    });
                }
            }
        }).LJFF(new C0UO0());
    }

    public static List LIZIZ(EffectChannelResponse effectChannelResponse) {
        List<Effect> totalEffects;
        if (effectChannelResponse.getCategoryResponseList().size() <= 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("category not enough ");
            sbLIZ.append(C13LP.LJJLIIIJ(effectChannelResponse.getCategoryResponseList(), null, null, null, 0, null, AFwS276S0000000_31.get$arr$(292), 31));
            C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (MultiGuestTextHeaderMockSetting.INSTANCE.getValue().fontMock) {
            return effectChannelResponse.getAllCategoryEffects();
        }
        List<EffectCategoryResponse> categoryResponseList = effectChannelResponse.getCategoryResponseList();
        String strLIZIZ = C19263510Xx.LIZIZ();
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(293);
        String lowerCase = strLIZIZ.toLowerCase(Locale.ROOT);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(lowerCase);
        sbLIZ2.append("");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("default");
        sbLIZ3.append("");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        EffectCategoryResponse effectCategoryResponse = null;
        EffectCategoryResponse effectCategoryResponse2 = null;
        EffectCategoryResponse effectCategoryResponse3 = null;
        EffectCategoryResponse effectCategoryResponse4 = null;
        EffectCategoryResponse effectCategoryResponse5 = null;
        for (EffectCategoryResponse effectCategoryResponse6 : categoryResponseList) {
            Object objInvoke = aFwS276S0000000_31.invoke(effectCategoryResponse6);
            if (Intrinsics.LJFF(objInvoke, strLIZIZ2)) {
                effectCategoryResponse2 = effectCategoryResponse6;
                if (effectCategoryResponse6 != null) {
                    break;
                }
            } else if (Intrinsics.LJFF(objInvoke, lowerCase)) {
                effectCategoryResponse3 = effectCategoryResponse6;
            } else if (Intrinsics.LJFF(objInvoke, strLIZIZ3)) {
                effectCategoryResponse4 = effectCategoryResponse6;
            } else if (Intrinsics.LJFF(objInvoke, "default")) {
                effectCategoryResponse5 = effectCategoryResponse6;
            }
        }
        if (effectCategoryResponse2 != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("use category with [languageWithSuffix] key=");
            sbLIZ4.append(strLIZIZ2);
            sbLIZ4.append(" languageKey=");
            sbLIZ4.append(lowerCase);
            sbLIZ4.append(" languageSuffix=");
            sbLIZ4.append("");
            sbLIZ4.append(" defaultSuffix=");
            sbLIZ4.append("");
            C20441214yg.LIZIZ("TextHeaderFontStyleManager", C2188811AlT.LIZIZ(sbLIZ4));
            effectCategoryResponse = effectCategoryResponse2;
        } else if (effectCategoryResponse3 != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("use category with [language] key=");
            sbLIZ5.append(lowerCase);
            sbLIZ5.append(" languageKey=");
            sbLIZ5.append(lowerCase);
            sbLIZ5.append(" languageSuffix=");
            sbLIZ5.append("");
            sbLIZ5.append(" defaultSuffix=");
            sbLIZ5.append("");
            C20441214yg.LIZIZ("TextHeaderFontStyleManager", C2188811AlT.LIZIZ(sbLIZ5));
            effectCategoryResponse = effectCategoryResponse3;
        } else if (effectCategoryResponse4 != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("use category with [defaultWithSuffix] key=");
            sbLIZ6.append(strLIZIZ3);
            sbLIZ6.append(" languageKey=");
            sbLIZ6.append(lowerCase);
            sbLIZ6.append(" languageSuffix=");
            sbLIZ6.append("");
            sbLIZ6.append(" defaultSuffix=");
            sbLIZ6.append("");
            C20441214yg.LIZIZ("TextHeaderFontStyleManager", C2188811AlT.LIZIZ(sbLIZ6));
            effectCategoryResponse = effectCategoryResponse4;
        } else if (effectCategoryResponse5 != null) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("use category with [default] key=default languageKey=");
            sbLIZ7.append(lowerCase);
            sbLIZ7.append(" languageSuffix=");
            sbLIZ7.append("");
            sbLIZ7.append(" defaultSuffix=");
            sbLIZ7.append("");
            C20441214yg.LIZIZ("TextHeaderFontStyleManager", C2188811AlT.LIZIZ(sbLIZ7));
            effectCategoryResponse = effectCategoryResponse5;
        }
        EffectCategoryResponse effectCategoryResponse7 = effectCategoryResponse;
        if (effectCategoryResponse7 != null && (totalEffects = effectCategoryResponse7.getTotalEffects()) != null) {
            return totalEffects;
        }
        return C13BV.INSTANCE;
    }

    public static TextHeaderBoardTextFontStyleData LIZJ(String str) {
        Object resourceId;
        Iterator<T> it2 = LIZ.values().iterator();
        while (true) {
            resourceId = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData = (TextHeaderBoardTextFontStyleData) next;
            if (str != null) {
                Effect effect = textHeaderBoardTextFontStyleData.LIZJ;
                if (effect != null) {
                    resourceId = effect.getResourceId();
                }
                if (Intrinsics.LJFF(resourceId, str)) {
                    resourceId = next;
                    break;
                }
            }
        }
        return (TextHeaderBoardTextFontStyleData) resourceId;
    }

    public static Typeface LJ(String str) {
        TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData;
        String str2;
        Typeface typefaceLJFF;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, Typeface> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.size() == 0) {
            return null;
        }
        Typeface typeface = concurrentHashMap.get(str);
        if (typeface == null && (textHeaderBoardTextFontStyleData = LIZ.get(str)) != null && (str2 = textHeaderBoardTextFontStyleData.LIZ) != null && (typefaceLJFF = LJFF(str2)) != null && str != null) {
            concurrentHashMap.put(str, typefaceLJFF);
        }
        return typeface;
    }

    public static Typeface LJFF(String str) {
        if (TextUtils.isEmpty(str) || !new C0VSJ(str).exists()) {
            return null;
        }
        try {
            return C786410Ut5.x4(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static TextHeaderBoardTextFontStyleData LJI(Effect effect) {
        TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData;
        String str;
        Typeface typefaceLJFF;
        Boolean boolValueOf;
        String str2;
        Gson gson;
        try {
            InterfaceC397701gd interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
            if (interfaceC397701gdYn2 != null && (gson = interfaceC397701gdYn2.getGson()) != null) {
                textHeaderBoardTextFontStyleData = (TextHeaderBoardTextFontStyleData) gson.LJII(effect.getExtra(), TextHeaderBoardTextFontStyleData.class);
            } else {
                textHeaderBoardTextFontStyleData = null;
            }
            if (C931810aM7.LIZLLL()) {
                if (textHeaderBoardTextFontStyleData == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(textHeaderBoardTextFontStyleData.isHidden);
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parseTextFontStyleData filter:");
                    if (textHeaderBoardTextFontStyleData == null) {
                        str2 = null;
                    } else {
                        str2 = textHeaderBoardTextFontStyleData.fontIdentifier;
                    }
                    sbLIZ.append(str2);
                    C20441214yg.LJ("TextHeaderFontStyleManager", C2188811AlT.LIZIZ(sbLIZ));
                    return null;
                }
            }
            if (textHeaderBoardTextFontStyleData != null && (str = textHeaderBoardTextFontStyleData.fontIdentifier) != null) {
                Map<String, TextHeaderBoardTextFontStyleData> map = LIZ;
                TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData2 = map.get(str);
                if (textHeaderBoardTextFontStyleData2 == null) {
                    String str3 = textHeaderBoardTextFontStyleData.fontIdentifier;
                    if (str3 == null) {
                        str3 = "";
                    }
                    map.put(str3, textHeaderBoardTextFontStyleData);
                } else {
                    textHeaderBoardTextFontStyleData2.fontIdentifier = textHeaderBoardTextFontStyleData.fontIdentifier;
                    textHeaderBoardTextFontStyleData2.fontDisplayName = textHeaderBoardTextFontStyleData.fontDisplayName;
                    textHeaderBoardTextFontStyleData2.fileName = textHeaderBoardTextFontStyleData.fileName;
                    textHeaderBoardTextFontStyleData2.fontSize = textHeaderBoardTextFontStyleData.fontSize;
                    textHeaderBoardTextFontStyleData = textHeaderBoardTextFontStyleData2;
                }
                textHeaderBoardTextFontStyleData.LIZJ = effect;
                ConcurrentHashMap<String, Typeface> concurrentHashMap = LIZIZ;
                if (concurrentHashMap.get(textHeaderBoardTextFontStyleData.fontIdentifier) == null && !TextUtils.isEmpty(effect.getUnzipPath()) && C2355009Kq.LIZ(effect.getUnzipPath())) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(effect.getUnzipPath());
                    String str4 = File.separator;
                    sbLIZ2.append(str4);
                    sbLIZ2.append(textHeaderBoardTextFontStyleData.fileName);
                    Typeface typefaceLJFF2 = LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                    if (typefaceLJFF2 != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(effect.getUnzipPath());
                        sbLIZ3.append(str4);
                        sbLIZ3.append(textHeaderBoardTextFontStyleData.fileName);
                        textHeaderBoardTextFontStyleData.LIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        textHeaderBoardTextFontStyleData.LIZIZ = 1;
                        String str5 = textHeaderBoardTextFontStyleData.fileName;
                        if (str5 != null) {
                            concurrentHashMap.put(str5, typefaceLJFF2);
                        }
                        return textHeaderBoardTextFontStyleData;
                    }
                    C089E c089e = new C089E(new C0VSJ(effect.getUnzipPath()).listFiles());
                    while (c089e.hasNext()) {
                        File file = (File) c089e.next();
                        if (file.isFile() && !u.LJIIZILJ(file.getAbsolutePath(), ".json", false) && (typefaceLJFF = LJFF(file.getAbsolutePath())) != null) {
                            textHeaderBoardTextFontStyleData.LIZ = file.getAbsolutePath();
                            textHeaderBoardTextFontStyleData.LIZIZ = 1;
                            String str6 = textHeaderBoardTextFontStyleData.fileName;
                            if (str6 != null) {
                                LIZIZ.put(str6, typefaceLJFF);
                            }
                            return textHeaderBoardTextFontStyleData;
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }
}
