package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07o5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1972707o5 {
    public static final C1972807o6 LIZ = new HashSet<String>() { // from class: X.07o6
        {
            add("api.resso.app");
            add("api22.resso.app");
        }
    };
    public static final Set<String> LIZIZ;
    public static final Pattern LIZJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.07o6] */
    static {
        HashSet hashSet = new HashSet();
        LIZIZ = hashSet;
        hashSet.add("\\");
        hashSet.add("^");
        hashSet.add(e3.c);
        hashSet.add("+");
        hashSet.add("*");
        hashSet.add(e3.d);
        hashSet.add("?");
        hashSet.add("!");
        hashSet.add("{");
        hashSet.add("}");
        hashSet.add(e3.h);
        hashSet.add(")");
        hashSet.add(e3.e);
        hashSet.add(e3.f);
        hashSet.add("|");
        LIZJ = PatternProtector.compile("[A-Za-z0-9_./-]+");
    }

    public static boolean LIZ(String str) {
        return !PatternProtector.compile("[A-Za-z0-9-_/]+").matcher(str).matches();
    }
}
