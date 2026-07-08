package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialgame.impl.api.SocialGameApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialgame.impl.service.SocialGameService$requestEmojiGameNames$2", f = "SocialGameService.kt", l = {141}, m = "invokeSuspend")
public final class C463401rE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<Integer> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<Integer, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C463401rE(String str, List list, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C463401rE(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialGameService@3009.requestEmojiGameNames$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            SocialGameApi.LIZ.getClass();
            SocialGameApi value = C463701rH.LIZIZ.getValue();
            if (value != null) {
                String string = this.LLILLJJLI.toString();
                String str = this.LLILLL;
                this.LL = 1;
                obj = value.getEmojiGameNameById(string, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialGameService@3009.requestEmojiGameNames$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialGameService@3009.requestEmojiGameNames$2");
            return unit;
        }
        SocialGameApi.SocialGameNameResponse socialGameNameResponse = (SocialGameApi.SocialGameNameResponse) obj;
        if (socialGameNameResponse != null) {
            socialGameNameResponse.checkValid();
            Map<String, String> map = socialGameNameResponse.gameNameMap;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                Iterator<T> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) entry.getKey());
                    if (numLJIIJJI != null) {
                        linkedHashMap.put(C2286608xc.LJ(numLJIIJJI.intValue()), entry.getValue());
                    } else {
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("SocialGameService@3009.requestEmojiGameNames$2");
                        return unit2;
                    }
                }
                Map<Integer, String> mapLJ = this.LLILZ;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLJ);
                linkedHashMap2.putAll(linkedHashMap);
                String str2 = this.LLILLL;
                if (!linkedHashMap2.isEmpty()) {
                    C463501rF.LIZ = linkedHashMap2;
                    if (!linkedHashMap2.isEmpty()) {
                        try {
                            C1227904rF.LIZ.getClass();
                            String strLJI = C1227904rF.LJI(linkedHashMap2);
                            Keva kevaLIZ = C1702006lW.LIZ();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("game_name_");
                            sbLIZ.append(str2);
                            kevaLIZ.storeString(C2188811AlT.LIZIZ(sbLIZ), strLJI);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SocialGameService@3009.requestEmojiGameNames$2");
                return unit3;
            }
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("SocialGameService@3009.requestEmojiGameNames$2");
            return unit4;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("SocialGameService@3009.requestEmojiGameNames$2");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
