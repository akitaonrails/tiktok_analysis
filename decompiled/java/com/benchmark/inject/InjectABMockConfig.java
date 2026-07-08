package com.benchmark.inject;

import X.C09GA;
import X.C212350188e;
import X.C21310118aR;
import X.C2188811AlT;
import X.C806930Vl5;
import com.benchmark.entity.ABMockModel;
import com.benchmark.entity.Group;
import com.benchmark.entity.Language;
import com.benchmark.entity.Scope;
import com.benchmark.serializer.ABMockSerializer;
import com.benchmark.serializer.GroupSerializer;
import com.benchmark.serializer.LanguageSerializer;
import com.benchmark.serializer.ScopeSerializer;
import com.bytedance.ies.abmock.debugtool.mock.IMockComponent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class InjectABMockConfig implements IMockComponent {
    public static StringBuilder abmockModelJsonBuilder = null;
    public static String injectJson = "[]";
    public static int[] repoNameList;
    public Gson mGson;
    public int mHostId = 100001;
    public List<ABMockModel> mMockModels;

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public Map<String, Object> getExtendInfo(String str) {
        return null;
    }

    public String getInjectConfig() {
        StringBuilder sb = abmockModelJsonBuilder;
        if (sb != null) {
            injectJson = sb.toString();
        }
        if (injectJson.length() > 4) {
            List<ABMockModel> listAsList = Arrays.asList((Object[]) GsonProtectorUtils.fromJson(this.mGson, injectJson, ABMockModel[].class));
            this.mMockModels = listAsList;
            for (ABMockModel aBMockModel : listAsList) {
                if (!aBMockModel.filedTypeName.equals("int") && !aBMockModel.filedTypeName.equals("long") && !aBMockModel.filedTypeName.equals("float") && !aBMockModel.filedTypeName.equals("boolean") && !aBMockModel.filedTypeName.equals("java.lang.String")) {
                    try {
                        Object objNewInstance = Class.forName(aBMockModel.filedTypeName).getConstructor(new Class[0]).newInstance(new Object[0]);
                        aBMockModel.groups.get(0).value = this.mGson.LJIJJLI(objNewInstance);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            injectJson = GsonProtectorUtils.toJson(this.mGson, this.mMockModels);
        }
        return injectJson;
    }

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public IMockComponent.HostInfo hostInfo() {
        return new IMockComponent.HostInfo() { // from class: X.09Ek
            @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent.HostInfo
            public final String chineseDesc() {
                return "ByteBench";
            }

            @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent.HostInfo
            public final String englishDesc() {
                return "ByteBench";
            }

            @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent.HostInfo
            public final int hostId() {
                return this.LIZ.mHostId;
            }
        };
    }

    public InjectABMockConfig() {
        C806930Vl5.LIZ("BXInjectABMockConfig");
        e eVar = new e();
        eVar.LIZJ(new ABMockSerializer(), ABMockModel.class);
        eVar.LIZJ(new GroupSerializer(), Group.class);
        eVar.LIZJ(new LanguageSerializer(), Language.class);
        eVar.LIZJ(new ScopeSerializer(), Scope.class);
        this.mGson = eVar.LIZ();
    }

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public String mockInfoListJson() {
        String injectConfig = getInjectConfig();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mockInfoListJson: ");
        sbLIZ.append(injectConfig);
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("BXInjectABMockConfig");
        return injectConfig;
    }

    public int getHostId() {
        return this.mHostId;
    }

    private Object getABMockModelDefaultValue(ABMockModel aBMockModel) {
        if (aBMockModel.filedTypeName.equals("int")) {
            return Integer.valueOf(((Group) ListProtector.get(aBMockModel.groups, 0)).value.LJIIJJI());
        }
        if (aBMockModel.filedTypeName.equals("long")) {
            return Long.valueOf(((Group) ListProtector.get(aBMockModel.groups, 0)).value.LJIIZILJ());
        }
        if (aBMockModel.filedTypeName.equals("float")) {
            return Float.valueOf(((Group) ListProtector.get(aBMockModel.groups, 0)).value.LJIIJ());
        }
        if (aBMockModel.filedTypeName.equals("boolean")) {
            return Boolean.valueOf(((Group) ListProtector.get(aBMockModel.groups, 0)).value.LJ());
        }
        if (aBMockModel.filedTypeName.equals("java.lang.String")) {
            return ((Group) ListProtector.get(aBMockModel.groups, 0)).value.LJIL();
        }
        return null;
    }

    private ABMockModel getMatchModel(String str) {
        List<ABMockModel> list = this.mMockModels;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (ABMockModel aBMockModel : this.mMockModels) {
            if (aBMockModel.key.equals(str)) {
                return aBMockModel;
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public Object get(String str) {
        if (!C21310118aR.LIZ()) {
            C806930Vl5.LIZIZ("BXInjectABMockConfig");
            return null;
        }
        ABMockModel matchModel = getMatchModel(str);
        if (matchModel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can not get matched abmock model: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C806930Vl5.LIZIZ("BXInjectABMockConfig");
            return null;
        }
        for (int i : repoNameList) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get bytebench mock value the repo: ");
            sbLIZ2.append(i);
            sbLIZ2.append(" key: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" mock filedType: ");
            sbLIZ2.append(matchModel.filedTypeName);
            C2188811AlT.LIZIZ(sbLIZ2);
            C806930Vl5.LIZ("BXInjectABMockConfig");
            C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(i);
            if (c09gaLIZIZ.LIZ(str)) {
                try {
                    C806930Vl5.LIZ("BXInjectABMockConfig");
                    if (matchModel.filedTypeName.equals("int")) {
                        return Integer.valueOf(c09gaLIZIZ.LJIIJ(str, matchModel.groups.get(0).value.LJIIJJI()));
                    }
                    if (matchModel.filedTypeName.equals("long")) {
                        return Long.valueOf(c09gaLIZIZ.LJIILLIIL(str, matchModel.groups.get(0).value.LJIIZILJ()));
                    }
                    if (matchModel.filedTypeName.equals("float")) {
                        return Float.valueOf(c09gaLIZIZ.LIZJ(str, matchModel.groups.get(0).value.LJIIJ()));
                    }
                    if (matchModel.filedTypeName.equals("boolean")) {
                        return Boolean.valueOf(c09gaLIZIZ.LJIIJJI(str, matchModel.groups.get(0).value.LJ()));
                    }
                    return c09gaLIZIZ.LJIIIZ(str, matchModel.groups.get(0).value.LJIL());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C806930Vl5.LIZIZ("BXInjectABMockConfig");
        }
        return getABMockModelDefaultValue(matchModel);
    }

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public Class<?> getFiledType(String str) {
        ABMockModel matchModel = getMatchModel(str);
        if (matchModel == null) {
            return null;
        }
        if (matchModel.filedTypeName.equals("int")) {
            return Integer.TYPE;
        }
        if (matchModel.filedTypeName.equals("long")) {
            return Long.TYPE;
        }
        if (matchModel.filedTypeName.equals("float")) {
            return Float.TYPE;
        }
        if (matchModel.filedTypeName.equals("boolean")) {
            return Boolean.TYPE;
        }
        if (matchModel.filedTypeName.equals("java.lang.String")) {
            return String.class;
        }
        try {
            return Class.forName(matchModel.filedTypeName);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
