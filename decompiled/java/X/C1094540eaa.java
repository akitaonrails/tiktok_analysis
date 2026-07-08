package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveI18nHotKeysDefaultSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0eaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094540eaa<T> implements InterfaceC300801Eo {
    public static final C1094540eaa<T> LL = new C1094540eaa<>();

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Map<String, String>> interfaceC2329309At) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList<String> arrayList = new ArrayList();
        try {
            arrayList.addAll((Collection) C293501Bt.LIZ().LJIIIIZZ(((Keva) C1124940fNc.LIZJ.getValue()).getString("keva_key_live_i18n_hot_keys", "[]"), new TypeToken<List<? extends String>>() { // from class: X.0eab
            }.getType()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error when fetch hotKeys from keva, err = ");
            sbLIZ.append(e);
            C20441214yg.LJ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
        }
        arrayList.addAll(LiveI18nHotKeysDefaultSetting.INSTANCE.getValue().defaultHotKeys);
        for (String str : arrayList) {
            String string = C1124940fNc.LIZ().getString(str, "");
            if (string != null && string.length() != 0) {
                concurrentHashMap.put(str, string);
            }
        }
        interfaceC2329309At.onSuccess(concurrentHashMap);
    }
}
