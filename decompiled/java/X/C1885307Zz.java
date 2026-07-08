package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.pumbaa.entry.service.PathMatchRule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07Zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1885307Zz {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C1885407a0 LIZ(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PathMatchRule pathMatchRule = (PathMatchRule) it2.next();
            String str = pathMatchRule.pattern;
            if (str.length() != 0) {
                String lowerCase = a0.LJLIIIL(pathMatchRule.type).toString().toLowerCase(Locale.ROOT);
                switch (lowerCase.hashCode()) {
                    case -980110702:
                        if (lowerCase.equals("prefix")) {
                            arrayList.add(str);
                        }
                        break;
                    case -891422895:
                        if (lowerCase.equals("suffix")) {
                            arrayList2.add(str);
                        }
                        break;
                    case 96946943:
                        if (lowerCase.equals("exact")) {
                            hashSet.add(str);
                        }
                        break;
                    case 108392519:
                        if (lowerCase.equals("regex")) {
                            try {
                                arrayList3.add(PatternProtector.compile(str));
                            } catch (PatternSyntaxException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        break;
                }
            }
        }
        return new C1885407a0(hashSet, arrayList, arrayList2, arrayList3);
    }
}
