package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import java.util.Map;

/* JADX INFO: renamed from: X.1AxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196241AxS extends AbstractC2196261AxU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Map<String, ? extends Object> map;
        String string;
        String string2;
        String string3;
        String string4;
        String str;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Activity activityLIZIZ;
        Activity activityLIZ;
        C508401yU c508401yU;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C06MM.LIZ(activityLIZIZ)) != null && (c508401yU = C508401yU.LJIIJJI) != null) {
            c508401yU.LJI(activityLIZ);
        }
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
        String str3 = null;
        if (schemaParserData == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("minis-ReportEventParamsUploadIDL", "No current schema data available");
            C2382909Vj.LIZ(completionBlock, -1, "No current schema data available", null, 4);
            return;
        }
        TiktokMinisQueryParams tiktokMinisQueryParams = schemaParserData.tiktokMinisParams;
        if (tiktokMinisQueryParams != null) {
            map = tiktokMinisQueryParams.logExtra;
        } else {
            map = null;
        }
        InterfaceC2196251AxT interfaceC2196251AxT = (InterfaceC2196251AxT) C1909107dp.LIZJ(InterfaceC2196251AxT.class, null);
        if (map != null && (obj4 = map.get("is_gip_anchor")) != null) {
            string = obj4.toString();
        } else {
            string = null;
        }
        interfaceC2196251AxT.setGipAnchor(string);
        if (map != null && (obj3 = map.get("gip_task_id")) != null) {
            string2 = obj3.toString();
        } else {
            string2 = null;
        }
        interfaceC2196251AxT.setGipTaskId(string2);
        if (map != null && (obj2 = map.get("gip_task_name")) != null) {
            string3 = obj2.toString();
        } else {
            string3 = null;
        }
        interfaceC2196251AxT.setGipTaskName(string3);
        interfaceC2196251AxT.setVideoId(schemaParserData.LJIIJ());
        if (map != null && (obj = map.get("fyf_card_id")) != null) {
            string4 = obj.toString();
        } else {
            string4 = null;
        }
        interfaceC2196251AxT.setFyfCardId(string4);
        if (minisMetaResp != null) {
            str = minisMetaResp.appVersion;
        } else {
            str = null;
        }
        interfaceC2196251AxT.setMinisVersion(str);
        interfaceC2196251AxT.setTtoclid(schemaParserData.LJIIIZ());
        if (minisMetaResp != null && (str2 = minisMetaResp.name) != null) {
            str3 = str2;
        } else {
            TiktokMinisQueryParams tiktokMinisQueryParams2 = schemaParserData.tiktokMinisParams;
            if (tiktokMinisQueryParams2 != null) {
                str3 = tiktokMinisQueryParams2.minisName;
            }
        }
        interfaceC2196251AxT.setGameName(str3);
        interfaceC2196251AxT.setMinisType(schemaParserData.LJFF());
        completionBlock.onSuccess(interfaceC2196251AxT, "");
    }
}
