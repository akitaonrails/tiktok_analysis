package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.systembigemoji.IStickerResourceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Hk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449580Hk4 implements InterfaceC449620Hk8 {
    public static final Map<String, String> LL;
    public static final Map<String, String> LLILLJJLI;
    public static final C449610Hk7 LLILLL;
    public static final C054G LLILZ;
    public static final List<InterfaceC449620Hk8> LLILZIL;

    static {
        C449580Hk4 c449580Hk4 = new C449580Hk4();
        LL = new ConcurrentHashMap();
        LLILLJJLI = new ConcurrentHashMap();
        LLILLL = new C449610Hk7(0);
        LLILZ = C2296808zG.LIZ(C0PEM.LIZJ);
        LLILZIL = new ArrayList();
        IStickerResourceManager.LJJJJJL.getClass();
        IStickerResourceManager value = C449570Hk3.LIZIZ.getValue();
        if (value != null) {
            value.LIZIZ(c449580Hk4);
        }
    }

    public static List LIZIZ(String str, Map map) {
        String upperCase;
        Collection<List<Emoji>> collectionValues;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
        } else {
            upperCase = null;
        }
        String str2 = (String) ((ConcurrentHashMap) map).get(upperCase);
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6).toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArr) {
            int i = CastIntegerProtector.parseInt(str3);
            LinkedHashMap<Resources, List<Emoji>> linkedHashMap = LLILLL.LIZ;
            if (linkedHashMap != null && (collectionValues = linkedHashMap.values()) != null) {
                Iterator<List<Emoji>> it2 = collectionValues.iterator();
                int size = 0;
                while (true) {
                    if (it2.hasNext()) {
                        List<Emoji> next = it2.next();
                        if (next.size() + size > i) {
                            Object obj = ListProtector.get(next, i - size);
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                        } else {
                            size += next.size();
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC449620Hk8
    public final void LIZ(Resources resources, List<? extends Emoji> list) {
        if (list != null && !list.isEmpty()) {
            LinkedHashMap<Resources, List<Emoji>> linkedHashMap = LLILLL.LIZ;
            if (linkedHashMap != null) {
                linkedHashMap.put(resources, list);
            }
            C23250099c.LIZLLL(LLILZ, null, null, new C449590Hk5(resources, list, null), 3);
            return;
        }
        Iterator it2 = ((ArrayList) LLILZIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC449620Hk8) it2.next()).LIZ(resources, list);
        }
    }
}
