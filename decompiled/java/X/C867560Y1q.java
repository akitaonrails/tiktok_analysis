package X;

import Y.ARunnableS47S0300000_14;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Y1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867560Y1q implements InterfaceC868920Y6w {
    public final C0YEM LIZ;

    public C867560Y1q(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    @Override // X.InterfaceC868920Y6w
    public final C0Y7K LIZ(MessageBody messageBody) throws Throwable {
        Map<String, String> mapLIZIZ;
        HashMap map;
        C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "BatchUnmarkUpdater", "BatchUnmarkUpdater", 4);
        C0Y9J c0y9jLIZIZ = this.LIZ.LJIIZILJ().LIZIZ().LIZIZ();
        Map<String, String> map2 = messageBody.ext;
        ArrayList arrayList = new ArrayList();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        if (map2 != null && map2.containsKey("s:mark_message_new_ext") && map2.get("s:mark_message_new_ext") != null) {
            JSONObject jSONObject = new JSONObject(map2.get("s:mark_message_new_ext"));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                long j = CastLongProtector.parseLong(next);
                C869590Y9l c869590Y9lLJJJ = c0y9jLIZIZ.LJI().LJJJ(j);
                if (jSONObject.get(next) instanceof JSONObject) {
                    mapLIZIZ = C09EF.LIZIZ(C786410Ut5.J3((JSONObject) jSONObject.get(next)));
                } else {
                    mapLIZIZ = null;
                }
                if (c869590Y9lLJJJ != null) {
                    if (c869590Y9lLJJJ.getExt() != null) {
                        map3.put(String.valueOf(c869590Y9lLJJJ.getMsgId()), c869590Y9lLJJJ.getExt());
                    }
                    if (mapLIZIZ == null) {
                        map = null;
                    } else {
                        map = new HashMap(mapLIZIZ);
                    }
                    c869590Y9lLJJJ.putExt(map);
                    arrayList.add(c869590Y9lLJJJ);
                    c0y9jLIZIZ.LJI().LJLJL(c869590Y9lLJJJ);
                } else {
                    arrayList2.add(Long.valueOf(j));
                }
            }
        }
        this.LIZ.LJIIZILJ().getDomain().LIZ().LJ(new ARunnableS47S0300000_14(this, arrayList, map3, 4));
        if (!arrayList2.isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("missingIds: ");
            sbLIZ.append(arrayList2);
            c868780Y6iLIZLLL.LJIIIIZZ("BatchUnmarkUpdater", C2188811AlT.LIZIZ(sbLIZ), null);
            EnumC868890Y6t enumC868890Y6t = EnumC868890Y6t.ENTITY_MISSING;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("missingIds: ");
            sbLIZ2.append(arrayList2);
            return new C0Y3A(enumC868890Y6t, C2188811AlT.LIZIZ(sbLIZ2), (Integer) null, 12);
        }
        return new C867580Y1s(null);
    }
}
