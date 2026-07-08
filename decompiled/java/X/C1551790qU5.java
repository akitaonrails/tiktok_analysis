package X;

import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qU5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551790qU5 extends AbstractC1552240qUo<String, Map<String, List<Pair<String, Long>>>> {
    public OptionCheckUpdateParams LJI;
    public Map<String, C1552980qW0> LJII;

    @Override // X.AbstractC1552240qUo
    public final void LIZIZ(Object... objArr) {
        Object pipelineData = this.LJ.getPipelineData("option_params");
        if (pipelineData instanceof OptionCheckUpdateParams) {
            OptionCheckUpdateParams optionCheckUpdateParams = (OptionCheckUpdateParams) pipelineData;
            this.LJI = optionCheckUpdateParams;
            C1551800qU6 checkUpdateData = optionCheckUpdateParams.getCheckUpdateData();
            if (checkUpdateData != null) {
                checkUpdateData.LJIIIIZZ = this.LJI.isSimplifyLocalInfoInRequest();
                checkUpdateData.LJIILIIL.LIZJ = System.currentTimeMillis();
                checkUpdateData.LJIILIIL.LIZLLL = System.currentTimeMillis();
            }
        }
        if (objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof Map) {
                this.LJII = (Map) obj;
            }
        }
    }

    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Map<String, List<Pair<String, Long>>>> interfaceC1552320qUw, String str) {
        C1550640qSE c1550640qSELJIIJJI;
        Map<String, C1552980qW0> map;
        boolean z;
        C1550640qSE c1550640qSELJIIJJI2;
        C1550640qSE c1550640qSELJIIJJI3;
        C1553130qWF.LIZ("gecko-debug-tag", "get local channel version");
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
        HashMap map2 = new HashMap();
        File[] fileArrListFiles = rootDirectory.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            OptionCheckUpdateParams optionCheckUpdateParams = this.LJI;
            if (((optionCheckUpdateParams != null && optionCheckUpdateParams.isSimplifyLocalInfoInRequest()) || C1957007lY.LIZ.LJIIJ || C1549140qPo.LIZ().enabled) && (map = this.LJII) != null) {
                for (Map.Entry<String, C1552980qW0> entry : map.entrySet()) {
                    List<?> groupName = entry.getValue().LIZIZ.getGroupName();
                    if (groupName != null && !groupName.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String key = entry.getKey();
                    for (File file : fileArrListFiles) {
                        if (file.getName().equals(key)) {
                            ArrayList arrayList = new ArrayList();
                            if (z) {
                                String[] list = file.list();
                                if (list != null) {
                                    for (String str2 : list) {
                                        if (new C0VSJ(file, str2).isDirectory() && (c1550640qSELJIIJJI3 = C1550600qSA.LJIIJJI(file.getName(), str2)) != null) {
                                            if (c1550640qSELJIIJJI3.LIZIZ) {
                                                C1553130qWF.LIZ("gecko-debug-tag", "get local compressed channel version, channelName: %s, version: %s", str2, Long.valueOf(c1550640qSELJIIJJI3.LIZ));
                                            }
                                            arrayList.add(new Pair(str2, Long.valueOf(c1550640qSELJIIJJI3.LIZ)));
                                        }
                                    }
                                }
                                z = true;
                            } else {
                                z = false;
                                Iterator<CheckRequestBodyModel.TargetChannel> it2 = entry.getValue().LIZIZ.getTargetChannels().iterator();
                                while (it2.hasNext()) {
                                    String str3 = it2.next().channelName;
                                    if (new C0VSJ(file, str3).isDirectory() && (c1550640qSELJIIJJI2 = C1550600qSA.LJIIJJI(file.getName(), str3)) != null) {
                                        if (c1550640qSELJIIJJI2.LIZIZ) {
                                            C1553130qWF.LIZ("gecko-debug-tag", "get local compressed channel version, channelName: %s, version: %s", str3, Long.valueOf(c1550640qSELJIIJJI2.LIZ));
                                        }
                                        arrayList.add(new Pair(str3, Long.valueOf(c1550640qSELJIIJJI2.LIZ)));
                                    }
                                }
                            }
                            List list2 = (List) map2.get(key);
                            if (list2 != null) {
                                list2.addAll(arrayList);
                            } else {
                                map2.put(key, arrayList);
                            }
                        }
                    }
                }
                return interfaceC1552320qUw.proceed(map2);
            }
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                String[] list3 = file2.list();
                ArrayList arrayList2 = new ArrayList();
                if (list3 != null) {
                    for (String str4 : list3) {
                        if (new C0VSJ(file2, str4).isDirectory() && (c1550640qSELJIIJJI = C1550600qSA.LJIIJJI(file2.getName(), str4)) != null) {
                            if (c1550640qSELJIIJJI.LIZIZ) {
                                C1553130qWF.LIZ("gecko-debug-tag", "get local compressed channel version, channelName: %s, version: %s", str4, Long.valueOf(c1550640qSELJIIJJI.LIZ));
                            }
                            arrayList2.add(new Pair(str4, Long.valueOf(c1550640qSELJIIJJI.LIZ)));
                        }
                    }
                }
                List list4 = (List) map2.get(name);
                if (list4 != null) {
                    list4.addAll(arrayList2);
                } else {
                    map2.put(name, arrayList2);
                }
            }
        }
        return interfaceC1552320qUw.proceed(map2);
    }
}
