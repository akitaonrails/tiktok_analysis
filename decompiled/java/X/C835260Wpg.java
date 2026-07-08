package X;

import Y.AComparatorS32S0000000_13;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.account.oneclicklogin.storage.EncryptedLoginMethod;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Wpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835260Wpg {
    public static final Charset LIZIZ = Charsets.UTF_8;
    public final C833970Wnb LIZ;

    public C835260Wpg() {
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        this.LIZ = new C833970Wnb(C0XPY.LIZIZ);
    }

    public static List LIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C13BV.INSTANCE;
        }
        try {
            return (List) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), str, new TypeToken<ArrayList<EncryptedLoginMethod>>() { // from class: X.0WpV
            }.getType());
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public static Pair LIZJ(List list) {
        Integer num = null;
        if (list.isEmpty()) {
            return new Pair("", null);
        }
        StringBuilder sb = new StringBuilder();
        Gson gson = C7740030o.LIZ().getGson();
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String json = GsonProtectorUtils.toJson(gson, it2.next());
            if (sb.length() + json.length() + 2 < 4096) {
                if (sb.length() == 0) {
                    sb.append(e3.e);
                } else {
                    sb.append(",");
                }
                sb.append(json);
            } else {
                num = -2;
                break;
            }
        }
        sb.append(e3.f);
        return new Pair(sb.toString(), num);
    }

    public static void LIZIZ(final C835260Wpg c835260Wpg, List list, final Function2 function2, String str, int i) {
        final Pair pairLIZJ;
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        c835260Wpg.getClass();
        C0XX9.LIZ.getClass();
        if (!C0XX9.LIZ()) {
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, -1);
                return;
            }
            return;
        }
        if (C293990Bfh.LIZ()) {
            pairLIZJ = LIZJ(C13LP.LJLLLL(new AComparatorS32S0000000_13(27), list));
        } else {
            pairLIZJ = LIZJ(list);
        }
        final C835200Wpa c835200Wpa = new C835200Wpa();
        c835200Wpa.LIZ = ((String) pairLIZJ.getFirst()).getBytes(LIZIZ);
        if (str.length() > 0) {
            C0W3J.LJFF("key cannot be null or empty", str);
            c835200Wpa.LIZJ = str;
        }
        c835260Wpg.LIZ.LIZ().LJFF(new InterfaceC835710WqP() { // from class: X.0Wph
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    c835200Wpa.LIZIZ = true;
                }
                AbstractC835450Wpz<Integer> abstractC835450WpzLIZJ = c835260Wpg.LIZ.LIZJ(c835200Wpa.LIZ());
                final Pair<String, Integer> pair = pairLIZJ;
                final Function2<Boolean, Integer, Unit> function22 = function2;
                C835510Wq5 c835510Wq5LJFF = abstractC835450WpzLIZJ.LJFF(new InterfaceC835710WqP() { // from class: X.0TU1
                    @Override // X.InterfaceC835710WqP
                    public final void onSuccess(Object obj2) {
                        Function2<Boolean, Integer, Unit> function23 = function22;
                        if (function23 != null) {
                            function23.invoke(Boolean.TRUE, pair.getSecond());
                        }
                    }
                });
                final Function2<Boolean, Integer, Unit> function23 = function2;
                c835510Wq5LJFF.LIZLLL(new InterfaceC835730WqR() { // from class: X.04xn
                    @Override // X.InterfaceC835730WqR
                    public final void onFailure(Exception exc) {
                        Function2<Boolean, Integer, Unit> function24 = function23;
                        if (function24 != null) {
                            function24.invoke(Boolean.FALSE, -1);
                        }
                    }
                });
            }
        }).LIZLLL(new InterfaceC835730WqR() { // from class: X.04xo
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                Function2<Boolean, Integer, Unit> function22 = function2;
                if (function22 != null) {
                    function22.invoke(Boolean.FALSE, -1);
                }
            }
        });
    }
}
