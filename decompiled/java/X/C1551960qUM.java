package X;

import android.text.TextUtils;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestParamModel;
import com.bytedance.geckox.model.DeploymentModelV4;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qUM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551960qUM {
    public static List<C1552500qVE> LJFF() {
        ArrayList arrayList = new ArrayList();
        C1552860qVo c1552860qVo = new C1552860qVo();
        c1552860qVo.LIZ = C1551730qTz.class;
        c1552860qVo.LIZIZ = C1552210qUl.LIZ(C1551730qTz.class);
        arrayList.add(new C1552500qVE(c1552860qVo));
        return arrayList;
    }

    public static List<C1552500qVE> LIZIZ(C1551530qTf c1551530qTf, OptionCheckUpdateParams optionCheckUpdateParams) {
        if (optionCheckUpdateParams == null) {
            optionCheckUpdateParams = new OptionCheckUpdateParams();
        }
        if (optionCheckUpdateParams.getCheckUpdateData() == null) {
            optionCheckUpdateParams.setCheckUpdateData(new C1551800qU6());
        }
        AbstractC1552040qUU listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        C1552860qVo c1552860qVo = new C1552860qVo();
        c1552860qVo.LIZ = C1551760qU2.class;
        c1552860qVo.LIZJ = new Object[]{c1551530qTf.LIZIZ, optionCheckUpdateParams};
        arrayList.add(new C1552500qVE(c1552860qVo));
        C1552860qVo c1552860qVo2 = new C1552860qVo();
        c1552860qVo2.LIZ = C1551150qT3.class;
        c1552860qVo2.LIZJ = new Object[]{listener};
        arrayList.add(new C1552500qVE(c1552860qVo2));
        C1552110qUb c1552110qUb = new C1552110qUb();
        c1552110qUb.LIZIZ = new C1552220qUm(new C1552020qUS(listener), C1552210qUl.LIZ(C1553440qWk.class));
        C1552830qVl c1552830qVlLIZIZ = c1552110qUb.LIZIZ("branch_zip");
        c1552830qVlLIZIZ.LIZ(LIZJ(c1551530qTf, optionCheckUpdateParams, 0));
        C1552860qVo c1552860qVo3 = new C1552860qVo();
        c1552860qVo3.LIZ = C1553430qWj.class;
        c1552830qVlLIZIZ.LIZ(new C1552500qVE(c1552860qVo3));
        C1552830qVl c1552830qVlLIZIZ2 = c1552110qUb.LIZIZ("branch_single_file");
        c1552830qVlLIZIZ2.LIZ(LIZJ(c1551530qTf, optionCheckUpdateParams, 1));
        C1552860qVo c1552860qVo4 = new C1552860qVo();
        c1552860qVo4.LIZ = C1553430qWj.class;
        c1552830qVlLIZIZ2.LIZ(new C1552500qVE(c1552860qVo4));
        C1552830qVl c1552830qVlLIZIZ3 = c1552110qUb.LIZIZ("branch_zstd");
        C1552110qUb c1552110qUb2 = new C1552110qUb();
        ((ArrayList) c1552110qUb2.LIZIZ("patch").LIZ).addAll(LJ(c1551530qTf, optionCheckUpdateParams, true));
        ((ArrayList) c1552110qUb2.LIZIZ("full").LIZ).addAll(LJ(c1551530qTf, optionCheckUpdateParams, false));
        c1552830qVlLIZIZ3.LIZ(c1552110qUb2.LIZ(C1552310qUv.class));
        C1552860qVo c1552860qVo5 = new C1552860qVo();
        c1552860qVo5.LIZ = C1553430qWj.class;
        c1552830qVlLIZIZ3.LIZ(new C1552500qVE(c1552860qVo5));
        arrayList.add(c1552110qUb.LIZ(C1553440qWk.class));
        C1552860qVo c1552860qVo6 = new C1552860qVo();
        c1552860qVo6.LIZ = C1551370qTP.class;
        arrayList.add(new C1552500qVE(c1552860qVo6));
        C1552860qVo c1552860qVo7 = new C1552860qVo();
        c1552860qVo7.LIZ = C1550780qSS.class;
        c1552860qVo7.LIZIZ = new C1552220qUm(new C1552770qVf(listener), C1552210qUl.LIZ(C1550780qSS.class));
        arrayList.add(new C1552500qVE(c1552860qVo7));
        C1552860qVo c1552860qVo8 = new C1552860qVo();
        c1552860qVo8.LIZ = C1551010qSp.class;
        c1552860qVo8.LIZIZ = new C1552220qUm(new C1552380qV2(listener), C1552210qUl.LIZ(C1551010qSp.class));
        arrayList.add(new C1552500qVE(c1552860qVo8));
        return arrayList;
    }

    public static C1552230qUn LJIIIIZZ(C1551530qTf c1551530qTf, OptionCheckUpdateParams optionCheckUpdateParams) {
        List<C1552500qVE> listLJFF = LJFF();
        ((ArrayList) listLJFF).addAll(LIZIZ(c1551530qTf, optionCheckUpdateParams));
        return C1552390qV3.LIZ(listLJFF);
    }

    public static void LIZ(OptionCheckUpdateParams optionCheckUpdateParams, Map map, Map map2) {
        Pair pair;
        if (map2 != null && !map2.isEmpty()) {
            Map<String, Map<String, Object>> customParam = optionCheckUpdateParams.getCustomParam();
            if (customParam == null) {
                customParam = new HashMap<>();
            }
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                CheckRequestParamModel checkRequestParamModel = (CheckRequestParamModel) entry.getValue();
                Map<String, Object> map3 = customParam.get(str);
                HashMap map4 = new HashMap();
                C1552980qW0 c1552980qW0 = new C1552980qW0(map4, new DeploymentModelV4());
                if (map3 != null) {
                    map4.putAll(map3);
                }
                ((ConcurrentHashMap) map).put(str, c1552980qW0);
                List<CheckRequestBodyModel.TargetChannel> targetChannels = checkRequestParamModel.getTargetChannels();
                List<CheckRequestBodyModel.TargetChannel> targetChannels2 = c1552980qW0.LIZIZ.getTargetChannels();
                if (targetChannels != null && !targetChannels.isEmpty()) {
                    for (CheckRequestBodyModel.TargetChannel targetChannel : targetChannels) {
                        C179500mX.LIZ.getClass();
                        Map<String, C1550570qS7> map5 = C179500mX.LIZIZ.get(str);
                        if (map5 != null) {
                            for (Map.Entry<String, C1550570qS7> entry2 : map5.entrySet()) {
                                if (Intrinsics.LJFF(entry2.getValue().LIZIZ, targetChannel.channelName)) {
                                    Long l = entry2.getValue().LIZJ;
                                    if (l != null) {
                                        targetChannel.targetVersion = Long.valueOf(l.longValue());
                                        Boolean bool = Boolean.TRUE;
                                        pair = new Pair(bool, bool);
                                    } else {
                                        pair = new Pair(Boolean.TRUE, Boolean.FALSE);
                                    }
                                }
                            }
                            Boolean bool2 = Boolean.FALSE;
                            pair = new Pair(bool2, bool2);
                        } else {
                            Boolean bool22 = Boolean.FALSE;
                            pair = new Pair(bool22, bool22);
                        }
                        if (!((Boolean) pair.getSecond()).booleanValue() && ((Boolean) pair.getFirst()).booleanValue()) {
                            C1551810qU7 c1551810qU7 = new C1551810qU7();
                            UpdatePackage updatePackage = new UpdatePackage();
                            updatePackage.setChannel(targetChannel.channelName);
                            updatePackage.setAccessKey(str);
                            updatePackage.setCallFrom((String) ListProtector.get(targetChannel.from, 0));
                            updatePackage.setFrom(targetChannel.from);
                            c1551810qU7.LIZLLL = false;
                            C1552790qVh c1552790qVhLIZIZ = c1551810qU7.LIZIZ(updatePackage, true);
                            c1552790qVhLIZIZ.LIZLLL = "The specified channel has no version";
                            c1552790qVhLIZIZ.LIZJ = 2006;
                            C1551780qU4.LJIIL(updatePackage);
                        } else {
                            Iterator<CheckRequestBodyModel.TargetChannel> it2 = targetChannels2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (it2.next().channelName.equals(targetChannel.channelName)) {
                                        break;
                                    }
                                } else {
                                    targetChannels2.add(targetChannel);
                                    break;
                                }
                            }
                        }
                    }
                }
                List<?> groupName = c1552980qW0.LIZIZ.getGroupName();
                if (targetChannels2.isEmpty()) {
                    String group = checkRequestParamModel.getGroup();
                    if (!TextUtils.isEmpty(group) && !"default".equals(group)) {
                        Iterator<?> it3 = groupName.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((DeploymentModelV4.V4Group) it3.next()).name.equals(group)) {
                                    break;
                                }
                            } else {
                                c1552980qW0.LIZIZ.addToGroupName(new DeploymentModelV4.V4Group(group));
                                break;
                            }
                        }
                    }
                    if (groupName.isEmpty()) {
                        throw new RuntimeException("group can not be default or empty!");
                    }
                }
            }
        }
    }

    public static C1552500qVE LIZJ(C1551530qTf c1551530qTf, OptionCheckUpdateParams optionCheckUpdateParams, int i) {
        C1552110qUb c1552110qUb = new C1552110qUb();
        C1552830qVl c1552830qVlLIZIZ = c1552110qUb.LIZIZ("patch");
        ((ArrayList) c1552830qVlLIZIZ.LIZ).addAll(LIZLLL(c1551530qTf, i, optionCheckUpdateParams, true));
        C1552830qVl c1552830qVlLIZIZ2 = c1552110qUb.LIZIZ("full");
        ((ArrayList) c1552830qVlLIZIZ2.LIZ).addAll(LIZLLL(c1551530qTf, i, optionCheckUpdateParams, false));
        return c1552110qUb.LIZ(C1552310qUv.class);
    }

    public static List<C1552500qVE> LJ(C1551530qTf c1551530qTf, OptionCheckUpdateParams optionCheckUpdateParams, boolean z) {
        C1550930qSh c1550930qSh;
        AbstractC1552040qUU listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        if (z) {
            c1550930qSh = new C1550930qSh();
        } else {
            c1550930qSh = null;
        }
        C1552860qVo c1552860qVo = new C1552860qVo();
        c1552860qVo.LIZ = C1550790qST.class;
        c1552860qVo.LIZJ = new Object[]{c1550930qSh};
        arrayList.add(new C1552500qVE(c1552860qVo));
        C1552080qUY.LIZ(c1550930qSh, c1551530qTf, optionCheckUpdateParams, arrayList, listener);
        C1552860qVo c1552860qVo2 = new C1552860qVo();
        c1552860qVo2.LIZ = C1550920qSg.class;
        c1552860qVo2.LIZJ = new Object[]{c1550930qSh};
        c1552860qVo2.LIZIZ = new C1552220qUm(new C1552510qVF(listener), C1552210qUl.LIZ(C1550920qSg.class));
        arrayList.add(new C1552500qVE(c1552860qVo2));
        C1552860qVo c1552860qVo3 = new C1552860qVo();
        c1552860qVo3.LIZ = C1550910qSf.class;
        c1552860qVo3.LIZJ = new Object[]{c1551530qTf, c1550930qSh};
        c1552860qVo3.LIZIZ = new C1552220qUm(new C1552450qV9(listener), C1552210qUl.LIZ(C1550910qSf.class));
        arrayList.add(new C1552500qVE(c1552860qVo3));
        if (z) {
            C1552860qVo c1552860qVo4 = new C1552860qVo();
            c1552860qVo4.LIZ = C1550970qSl.class;
            c1552860qVo4.LIZJ = new Object[]{c1550930qSh};
            c1552860qVo4.LIZIZ = new C1552220qUm(new C1552450qV9(listener), C1552210qUl.LIZ(C1550970qSl.class));
            arrayList.add(new C1552500qVE(c1552860qVo4));
        } else {
            C1552860qVo c1552860qVo5 = new C1552860qVo();
            c1552860qVo5.LIZ = C1550900qSe.class;
            c1552860qVo5.LIZIZ = new C1552220qUm(new C1552450qV9(listener), C1552210qUl.LIZ(C1550900qSe.class));
            arrayList.add(new C1552500qVE(c1552860qVo5));
        }
        C1552860qVo c1552860qVo6 = new C1552860qVo();
        c1552860qVo6.LIZ = C1551700qTw.class;
        c1552860qVo6.LIZIZ = new C1552220qUm(new C1552450qV9(listener), C1552210qUl.LIZ(C1551700qTw.class));
        arrayList.add(new C1552500qVE(c1552860qVo6));
        C1552860qVo c1552860qVo7 = new C1552860qVo();
        c1552860qVo7.LIZ = C1550850qSZ.class;
        c1552860qVo7.LIZIZ = new C1552220qUm(new C1552820qVk(listener), C1552210qUl.LIZ(C1550850qSZ.class));
        arrayList.add(new C1552500qVE(c1552860qVo7));
        return arrayList;
    }

    public static C1552230qUn LJI(C1551530qTf c1551530qTf, Map map, OptionCheckUpdateParams optionCheckUpdateParams) {
        if (optionCheckUpdateParams.getCheckUpdateData() == null) {
            optionCheckUpdateParams.setCheckUpdateData(new C1551800qU6());
        }
        HashMap map2 = new HashMap();
        if (map.isEmpty()) {
            return null;
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            map2.put(entry.getKey(), new CheckRequestParamModel("default", (List) entry.getValue()));
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        LIZ(optionCheckUpdateParams, concurrentHashMap, map2);
        AbstractC1552040qUU listener = optionCheckUpdateParams.getListener();
        List<C1552500qVE> listLJFF = LJFF();
        C1552860qVo c1552860qVo = new C1552860qVo();
        c1552860qVo.LIZ = C1551790qU5.class;
        c1552860qVo.LIZJ = new Object[]{concurrentHashMap};
        ArrayList arrayList = (ArrayList) listLJFF;
        arrayList.add(new C1552500qVE(c1552860qVo));
        C1552860qVo c1552860qVo2 = new C1552860qVo();
        c1552860qVo2.LIZ = C1551880qUE.class;
        c1552860qVo2.LIZJ = new Object[]{Boolean.FALSE, c1551530qTf, concurrentHashMap, listener, null, optionCheckUpdateParams};
        c1552860qVo2.LIZIZ = new C1552220qUm(new C1551870qUD(listener, optionCheckUpdateParams, true), C1552210qUl.LIZ(C1551880qUE.class));
        arrayList.add(new C1552500qVE(c1552860qVo2));
        C1552230qUn c1552230qUnLIZ = C1552390qV3.LIZ(listLJFF);
        c1552230qUnLIZ.setPipelineData("option_params", optionCheckUpdateParams);
        c1552230qUnLIZ.setPipelineData("req_type", 10);
        return c1552230qUnLIZ;
    }

    public static List<C1552500qVE> LIZLLL(C1551530qTf c1551530qTf, int i, OptionCheckUpdateParams optionCheckUpdateParams, boolean z) {
        C1550930qSh c1550930qSh;
        AbstractC1552040qUU listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        if (z) {
            c1550930qSh = new C1550930qSh();
        } else {
            c1550930qSh = null;
        }
        C1552860qVo c1552860qVo = new C1552860qVo();
        c1552860qVo.LIZ = C1550790qST.class;
        c1552860qVo.LIZJ = new Object[]{c1550930qSh};
        arrayList.add(new C1552500qVE(c1552860qVo));
        C1552080qUY.LIZ(null, c1551530qTf, optionCheckUpdateParams, arrayList, listener);
        C1552860qVo c1552860qVo2 = new C1552860qVo();
        c1552860qVo2.LIZ = C1550920qSg.class;
        c1552860qVo2.LIZJ = new Object[]{c1550930qSh};
        c1552860qVo2.LIZIZ = new C1552220qUm(new C1552510qVF(listener), C1552210qUl.LIZ(C1550920qSg.class));
        arrayList.add(new C1552500qVE(c1552860qVo2));
        if (z) {
            C1552860qVo c1552860qVo3 = new C1552860qVo();
            c1552860qVo3.LIZ = C1550960qSk.class;
            c1552860qVo3.LIZJ = new Object[]{c1551530qTf, c1550930qSh};
            c1552860qVo3.LIZIZ = new C1552220qUm(new C1552450qV9(listener), C1552210qUl.LIZ(C1550960qSk.class));
            arrayList.add(new C1552500qVE(c1552860qVo3));
        }
        if (i == 0) {
            C1552860qVo c1552860qVo4 = new C1552860qVo();
            c1552860qVo4.LIZ = C1550900qSe.class;
            c1552860qVo4.LIZIZ = new C1552220qUm(new C1552450qV9(listener), C1552210qUl.LIZ(C1550900qSe.class));
            arrayList.add(new C1552500qVE(c1552860qVo4));
        }
        C1552860qVo c1552860qVo5 = new C1552860qVo();
        c1552860qVo5.LIZ = C1551700qTw.class;
        c1552860qVo5.LIZIZ = new C1552220qUm(new C1552450qV9(listener), C1552210qUl.LIZ(C1551700qTw.class));
        arrayList.add(new C1552500qVE(c1552860qVo5));
        C1552860qVo c1552860qVo6 = new C1552860qVo();
        c1552860qVo6.LIZ = C1550850qSZ.class;
        c1552860qVo6.LIZIZ = new C1552220qUm(new C1552820qVk(listener), C1552210qUl.LIZ(C1550850qSZ.class));
        arrayList.add(new C1552500qVE(c1552860qVo6));
        return arrayList;
    }

    public static C1552230qUn LJIIJ(C1551530qTf c1551530qTf, List list, OptionCheckUpdateParams optionCheckUpdateParams, C1552070qUX c1552070qUX) {
        List<?> arrayList;
        List<CheckRequestBodyModel.TargetChannel> arrayList2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            GlobalConfigSettings.SyncItem syncItem = (GlobalConfigSettings.SyncItem) it2.next();
            String accessKey = syncItem.getAccessKey();
            if (concurrentHashMap.containsKey(accessKey)) {
                arrayList = ((C1552980qW0) concurrentHashMap.get(accessKey)).LIZIZ.getGroupName();
                arrayList2 = ((C1552980qW0) concurrentHashMap.get(accessKey)).LIZIZ.getTargetChannels();
            } else {
                arrayList = new ArrayList<>();
                arrayList2 = new ArrayList<>();
            }
            if (syncItem.getGroup() != null) {
                Iterator<String> it3 = syncItem.getGroup().iterator();
                while (it3.hasNext()) {
                    arrayList.add(new DeploymentModelV4.V4Group(it3.next()));
                }
            }
            if (syncItem.getTarget() != null) {
                Iterator<String> it4 = syncItem.getTarget().iterator();
                while (it4.hasNext()) {
                    arrayList2.add(new CheckRequestBodyModel.TargetChannel(it4.next()));
                }
            }
            concurrentHashMap.put(accessKey, new C1552980qW0(new HashMap(), new DeploymentModelV4(arrayList, arrayList2)));
        }
        return LJIIJJI(c1551530qTf, concurrentHashMap, optionCheckUpdateParams, c1552070qUX);
    }

    public static C1552230qUn LJIIJJI(C1551530qTf c1551530qTf, Map map, OptionCheckUpdateParams optionCheckUpdateParams, C1552070qUX c1552070qUX) {
        if (optionCheckUpdateParams == null) {
            optionCheckUpdateParams = new OptionCheckUpdateParams();
        }
        if (optionCheckUpdateParams.getCheckUpdateData() == null) {
            optionCheckUpdateParams.setCheckUpdateData(new C1551800qU6());
        }
        AbstractC1552040qUU listener = optionCheckUpdateParams.getListener();
        List<C1552500qVE> listLJFF = LJFF();
        C1552860qVo c1552860qVo = new C1552860qVo();
        c1552860qVo.LIZ = C1551790qU5.class;
        c1552860qVo.LIZJ = new Object[]{map};
        ArrayList arrayList = (ArrayList) listLJFF;
        arrayList.add(new C1552500qVE(c1552860qVo));
        C1552860qVo c1552860qVo2 = new C1552860qVo();
        c1552860qVo2.LIZ = C1551880qUE.class;
        c1552860qVo2.LIZJ = new Object[]{Boolean.FALSE, c1551530qTf, map, listener, c1552070qUX, optionCheckUpdateParams};
        c1552860qVo2.LIZIZ = new C1552220qUm(new C1551870qUD(listener, optionCheckUpdateParams, false), C1552210qUl.LIZ(C1551880qUE.class));
        arrayList.add(new C1552500qVE(c1552860qVo2));
        C1552860qVo c1552860qVo3 = new C1552860qVo();
        c1552860qVo3.LIZ = C1551160qT4.class;
        arrayList.add(new C1552500qVE(c1552860qVo3));
        arrayList.addAll(LIZIZ(c1551530qTf, optionCheckUpdateParams));
        C1552230qUn c1552230qUnLIZ = C1552390qV3.LIZ(listLJFF);
        c1552230qUnLIZ.setPipelineData("option_params", optionCheckUpdateParams);
        return c1552230qUnLIZ;
    }

    public static C1552230qUn LJII(C1551530qTf c1551530qTf, Map map, EnumC1552440qV8 enumC1552440qV8, OptionCheckUpdateParams optionCheckUpdateParams, C1552070qUX c1552070qUX) {
        List<C1552500qVE> listLJFF = LJFF();
        C1552860qVo c1552860qVo = new C1552860qVo();
        c1552860qVo.LIZ = C1551790qU5.class;
        c1552860qVo.LIZJ = new Object[]{map};
        ArrayList arrayList = (ArrayList) listLJFF;
        arrayList.add(new C1552500qVE(c1552860qVo));
        C1552860qVo c1552860qVo2 = new C1552860qVo();
        c1552860qVo2.LIZ = C1551880qUE.class;
        c1552860qVo2.LIZJ = new Object[]{Boolean.TRUE, c1551530qTf, map, null, c1552070qUX, enumC1552440qV8};
        c1552860qVo2.LIZIZ = new C1552220qUm(new C1551870qUD(null, optionCheckUpdateParams, false), C1552210qUl.LIZ(C1551880qUE.class));
        arrayList.add(new C1552500qVE(c1552860qVo2));
        C1552860qVo c1552860qVo3 = new C1552860qVo();
        c1552860qVo3.LIZ = C1551160qT4.class;
        arrayList.add(new C1552500qVE(c1552860qVo3));
        arrayList.addAll(LIZIZ(c1551530qTf, optionCheckUpdateParams));
        C1552230qUn c1552230qUnLIZ = C1552390qV3.LIZ(listLJFF);
        c1552230qUnLIZ.setPipelineData("option_params", optionCheckUpdateParams);
        return c1552230qUnLIZ;
    }

    public static C1552230qUn LJIIIZ(C1551530qTf c1551530qTf, Map map, String str, OptionCheckUpdateParams optionCheckUpdateParams, C1552070qUX c1552070qUX) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put(entry.getKey(), new CheckRequestParamModel(str, (List) entry.getValue()));
            }
        } else {
            Iterator<String> it2 = c1551530qTf.LJ.iterator();
            while (it2.hasNext()) {
                map2.put(it2.next(), new CheckRequestParamModel(str));
            }
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        LIZ(optionCheckUpdateParams, concurrentHashMap, map2);
        return LJIIJJI(c1551530qTf, concurrentHashMap, optionCheckUpdateParams, c1552070qUX);
    }
}
