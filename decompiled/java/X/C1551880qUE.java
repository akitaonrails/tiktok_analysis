package X;

import Y.AComparatorS42S0000000_23;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.DeploymentModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551880qUE extends AbstractC1552240qUo<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {
    public boolean LJI;
    public C1551530qTf LJII;
    public Map<String, C1552980qW0> LJIIIIZZ;
    public AbstractC1552040qUU LJIIIZ;
    public InterfaceC1553600qX0 LJIIJ;
    public OptionCheckUpdateParams LJIIJJI;
    public EnumC1552440qV8 LJIIL;
    public C1551800qU6 LJIILIIL;
    public File LJIILJJIL;
    public C1551930qUJ LJIILL;
    public int LJIILLIIL;

    public final boolean LJ() {
        return !this.LJI && this.LJIIJJI.getInnerRequestByUser();
    }

    public final void LJFF() {
        Map<String, C1552980qW0> map;
        if (this.LJI || (map = this.LJIIIIZZ) == null || this.LJIIIZ == null) {
            return;
        }
        for (Map.Entry<String, C1552980qW0> entry : map.entrySet()) {
            String key = entry.getKey();
            DeploymentModel deploymentModel = entry.getValue().LIZIZ;
            if (deploymentModel != null) {
                Iterator<CheckRequestBodyModel.TargetChannel> it2 = deploymentModel.getTargetChannels().iterator();
                while (it2.hasNext()) {
                    String str = it2.next().channelName;
                    Long lLIZLLL = C1550610qSB.LIZLLL(key, str);
                    if (lLIZLLL == null) {
                        return;
                    }
                    String strLJFF = C1550600qSA.LJFF(lLIZLLL.longValue(), key, str);
                    LocalPackageModel localPackageModel = new LocalPackageModel(key, str);
                    localPackageModel.setChannelPath(strLJFF);
                    localPackageModel.setLatestVersion(lLIZLLL.longValue());
                    this.LJIIIZ.LJIILLIIL(localPackageModel);
                }
            }
        }
    }

    @Override // X.AbstractC1552240qUo
    public final void LIZIZ(Object... objArr) {
        boolean z;
        boolean z2 = false;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        this.LJI = zBooleanValue;
        this.LJII = (C1551530qTf) objArr[1];
        this.LJIIIIZZ = (Map) objArr[2];
        this.LJIIIZ = (AbstractC1552040qUU) objArr[3];
        this.LJIIJ = (InterfaceC1553600qX0) objArr[4];
        if (zBooleanValue) {
            this.LJIIL = (EnumC1552440qV8) objArr[5];
        }
        Object pipelineData = this.LJ.getPipelineData("option_params");
        if (pipelineData instanceof OptionCheckUpdateParams) {
            this.LJIIJJI = (OptionCheckUpdateParams) pipelineData;
        } else {
            this.LJIIJJI = new OptionCheckUpdateParams();
        }
        if (this.LJIIJJI.getCheckUpdateData() == null) {
            this.LJIIJJI.setCheckUpdateData(new C1551800qU6());
        }
        this.LJIILIIL = this.LJIIJJI.getCheckUpdateData();
        Object pipelineData2 = this.LJ.getPipelineData("sync_task_id");
        if (pipelineData2 instanceof Integer) {
            this.LJIILIIL.LJIIJ = ((Integer) pipelineData2).intValue();
        }
        String from = this.LJIIJJI.getFrom();
        if (!this.LJIIJJI.getInnerRequestByUser() && TextUtils.isEmpty(from)) {
            from = "self";
        }
        C1551800qU6 c1551800qU6 = this.LJIILIIL;
        c1551800qU6.LJIILJJIL = from;
        c1551800qU6.LJIILL = Integer.valueOf(this.LJIIJJI.getChannelUpdatePriority());
        this.LJIILLIIL = ((Integer) this.LJ.getPipelineData("req_type")).intValue();
        Object pipelineData3 = this.LJ.getPipelineData("original_req_type");
        if (pipelineData3 instanceof Integer) {
            ((Integer) pipelineData3).intValue();
        }
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        this.LJIILJJIL = c1551940qUK.LIZLLL.getRootDirectory();
        TreeMap treeMap = new TreeMap(new AComparatorS42S0000000_23(1));
        for (Map.Entry<String, C1552980qW0> entry : this.LJIIIIZZ.entrySet()) {
            String key = entry.getKey();
            C1552980qW0 value = entry.getValue();
            if (key != null && value != null) {
                treeMap.put(key, value.LIZIZ.getSortString());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str = (String) entry2.getKey();
            String str2 = (String) entry2.getValue();
            if (str != null && str2 != null) {
                sb.append(str);
                sb.append("-");
                sb.append(str2);
            }
        }
        String string = sb.toString();
        C1551930qUJ c1551930qUJ = new C1551930qUJ();
        this.LJIILL = c1551930qUJ;
        c1551930qUJ.LIZIZ = new C1553200qWM(this.LJIILLIIL);
        if (this.LJIILLIIL == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJI || this.LJIIJJI.isEnableRetry()) {
            z2 = true;
        }
        c1551930qUJ.LIZJ = new C1552290qUt(z, z2, string, new C1553070qW9(this.LJII.LIZ(), this.LJ));
        if (LJ()) {
            this.LJIILL.LIZ = new C1552900qVs(this.LJIIJJI.isEnableThrottle(), string, this.LJIIJJI.getThrottleInterval());
        }
    }

    public final String LIZLLL(Map<String, List<Pair<String, Long>>> map) {
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        checkRequestBodyModel.setCommon(c1551940qUK.LIZLLL());
        Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map2 = c1551940qUK.LIZIZ;
        HashMap map3 = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap map4 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                map4.put(pair.first, localChannel);
            }
            map3.put(entry.getKey(), map4);
        }
        checkRequestBodyModel.setLocal(map3);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        for (String str : this.LJIIIIZZ.keySet()) {
            map5.put(str, this.LJIIIIZZ.get(str).LIZIZ);
            HashMap map7 = new HashMap();
            if (map2 != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map2;
                if (concurrentHashMap.get(str) != null) {
                    for (Map.Entry entry2 : ((Map) concurrentHashMap.get(str)).entrySet()) {
                        map7.put(entry2.getKey(), ((OptionCheckUpdateParams.CustomValue) entry2.getValue()).getValue());
                    }
                }
            }
            if (map7.get("business_version") == null) {
                C1551940qUK c1551940qUK2 = C797990VSb.LIZ;
                c1551940qUK2.LIZIZ();
                if (c1551940qUK2.LIZLLL != null) {
                    c1551940qUK2.LIZIZ();
                    map7.put("business_version", c1551940qUK2.LIZLLL.getAppVersion());
                } else {
                    map7.put("business_version", this.LJII.LJIIIIZZ);
                }
            }
            if (this.LJIIIIZZ.get(str).LIZ != null) {
                map7.putAll(this.LJIIIIZZ.get(str).LIZ);
            }
            map6.put(str, map7);
        }
        checkRequestBodyModel.setCustom(map6);
        checkRequestBodyModel.setDeployments(map5);
        this.LJIILIIL.LJIIL = map5;
        CheckRequestBodyModel.RequestMeta requestMeta = new CheckRequestBodyModel.RequestMeta(this.LJIILLIIL);
        EnumC1552440qV8 enumC1552440qV8 = this.LJIIL;
        if (enumC1552440qV8 != null) {
            requestMeta.setCombineLevel(enumC1552440qV8.name());
        }
        checkRequestBodyModel.setRequestMeta(requestMeta);
        return GsonProtectorUtils.toJson(C1551400qTS.LIZIZ.LIZ, checkRequestBodyModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0324  */
    @Override // X.AbstractC1552240qUo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1552320qUw<java.util.List<com.bytedance.geckox.model.UpdatePackage>> r23, java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>> r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551880qUE.LIZJ(X.0qUw, java.lang.Object):java.lang.Object");
    }
}
