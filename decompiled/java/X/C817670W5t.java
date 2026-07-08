package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.ArrayMap;
import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817670W5t extends Resources {
    public static Field LJI;
    public static final boolean LJII;
    public static Class<?> LJIIIIZZ;
    public static Method LJIIIZ;
    public static final Object LJIIJ;
    public static Class<?> LJIIL;
    public static Field LJIILIIL;
    public static Field LJIILJJIL;
    public static Field LJIILL;
    public static final HashMap<String, Integer> LJIIZILJ;
    public final Resources LIZ;
    public Locale LIZIZ;
    public final WeakReference<Context> LIZJ;
    public final boolean LIZLLL;
    public Object LJ;
    public int LJFF;
    public static final ReentrantReadWriteLock LJIIJJI = new ReentrantReadWriteLock();
    public static Map<Object, Object> LJIILLIIL = new LinkedHashMap();

    static {
        LJII = true;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 5);
        map.put("one", 6);
        map.put("two", 7);
        map.put("few", 8);
        map.put("many", 9);
        map.put("other", 4);
        LJIIZILJ = map;
        try {
            Class<?> cls = Class.forName("android.app.ResourcesManager");
            LJIIIIZZ = cls;
            LJIIIZ = cls.getDeclaredMethod("getInstance", new Class[0]);
            Class<?> cls2 = LJIIIIZZ;
            if (cls2 == null) {
                cls2 = null;
            }
            Field declaredField = cls2.getDeclaredField("mResourceReferences");
            LJI = declaredField;
            if (declaredField == null) {
                declaredField = null;
            }
            declaredField.setAccessible(true);
            Method method = LJIIIZ;
            if (method == null) {
                method = null;
            }
            method.setAccessible(true);
            Method method2 = LJIIIZ;
            if (method2 == null) {
                method2 = null;
            }
            LJIIJ = C2204961BRm.a0(method2, null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOSwcZrZ0yBXV7YUTzjN+uaxF7i3jBSFejiGgQ==", null));
            LJII = false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_version:", Build.VERSION.SDK_INT);
            jSONObject.put("nxreword error message:", String.valueOf(e.getMessage()));
            C1AF0.LIZJ(C786410Ut5.J3(jSONObject));
        }
    }

    public final void LIZ(Resources resources) throws Throwable {
        Object objA0;
        Object obj;
        Object obj2;
        Reference reference;
        Object obj3;
        Reference reference2;
        ArrayMap arrayMap;
        Object obj4;
        NxResourceUtils nxResourceUtils = NxResourceUtils.INSTANCE;
        Method getImplMethod$NxReword_release = nxResourceUtils.getGetImplMethod$NxReword_release();
        if (getImplMethod$NxReword_release == null) {
            objA0 = null;
        } else {
            objA0 = C2204961BRm.a0(getImplMethod$NxReword_release, resources, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOSwcZrZ0yBXV7YUTzjN+uaxF7i3jBSFejiGgQ==", null));
        }
        this.LJ = objA0;
        Method setImplMethod$NxReword_release = nxResourceUtils.getSetImplMethod$NxReword_release();
        if (setImplMethod$NxReword_release != null) {
            C2204961BRm.a0(setImplMethod$NxReword_release, this, new Object[]{this.LJ}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOSwcZrZ0yBXV7YUTzjN+uaxF7i3jBSFejiGgQ==", null));
        }
        Field field = LJI;
        if (field == null) {
            field = null;
        }
        Object obj5 = LJIIJ;
        Object obj6 = field.get(obj5);
        if (obj6 != null) {
            ((ArrayList) obj6).add(new WeakReference(this));
            if (LJIIL == null) {
                Class<?> cls = Class.forName("android.content.res.ResourcesKey");
                LJIIL = cls;
                LJIILJJIL = cls.getDeclaredField("mOverrideConfiguration");
                Class<?> cls2 = LJIIIIZZ;
                if (cls2 == null) {
                    cls2 = null;
                }
                Field declaredField = cls2.getDeclaredField("mResourceImpls");
                LJIILL = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            }
            Locale locale = this.LIZIZ;
            Field field2 = LJIILL;
            if (field2 == null) {
                obj = null;
            } else {
                obj = field2.get(obj5);
            }
            if ((obj instanceof ArrayMap) && (arrayMap = (ArrayMap) obj) != null) {
                Iterator it2 = arrayMap.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (Intrinsics.LJFF(((Reference) entry.getValue()).get(), this.LJ)) {
                        Object key = entry.getKey();
                        Field field3 = LJIILJJIL;
                        if (field3 == null) {
                            obj4 = null;
                        } else {
                            obj4 = field3.get(key);
                        }
                        Configuration configuration = (Configuration) obj4;
                        if (configuration != null) {
                            configuration.setLocale(locale);
                        } else {
                            Configuration configuration2 = new Configuration();
                            configuration2.setLocale(locale);
                            Field field4 = LJIILJJIL;
                            if (field4 != null) {
                                field4.set(key, configuration2);
                            }
                        }
                    }
                }
            }
            if (this.LIZLLL) {
                Class<?> cls3 = LJIIIIZZ;
                if (cls3 == null) {
                    cls3 = null;
                }
                Field declaredField2 = cls3.getDeclaredField("mActivityResourceReferences");
                declaredField2.setAccessible(true);
                Class<?> cls4 = Class.forName("android.app.ResourcesManager$ActivityResources");
                Field declaredField3 = cls4.getDeclaredField("activityResources");
                declaredField3.setAccessible(true);
                Field declaredField4 = cls4.getDeclaredField("overrideConfig");
                declaredField4.setAccessible(true);
                Object obj7 = declaredField2.get(LJIIJ);
                if (obj7 != null) {
                    WeakHashMap weakHashMap = (WeakHashMap) obj7;
                    if (Build.VERSION.SDK_INT > 30) {
                        Class<?> cls5 = Class.forName("android.app.ResourcesManager$ActivityResource");
                        Field declaredField5 = cls5.getDeclaredField("resources");
                        declaredField5.setAccessible(true);
                        Field declaredField6 = cls5.getDeclaredField("overrideConfig");
                        declaredField6.setAccessible(true);
                        Iterator it3 = weakHashMap.entrySet().iterator();
                        while (it3.hasNext()) {
                            Object value = ((Map.Entry) it3.next()).getValue();
                            Object obj8 = declaredField3.get(value);
                            if (obj8 != null) {
                                Iterator it4 = ((ArrayList) obj8).iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        Object next = it4.next();
                                        Object obj9 = declaredField5.get(next);
                                        if ((obj9 instanceof WeakReference) && (reference2 = (Reference) obj9) != null) {
                                            obj3 = reference2.get();
                                        } else {
                                            obj3 = null;
                                        }
                                        if (Intrinsics.LJFF(obj3, resources)) {
                                            declaredField5.set(next, new WeakReference(this));
                                            Configuration configuration3 = (Configuration) declaredField6.get(next);
                                            if (configuration3 != null) {
                                                configuration3.setLocale(this.LIZIZ);
                                            }
                                            Object obj10 = declaredField4.get(value);
                                            if (obj10 != null) {
                                                ((Configuration) obj10).setLocale(this.LIZIZ);
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type android.content.res.Configuration");
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any> }");
                            }
                        }
                        return;
                    }
                    Iterator it5 = weakHashMap.entrySet().iterator();
                    while (it5.hasNext()) {
                        Object value2 = ((Map.Entry) it5.next()).getValue();
                        Object obj11 = declaredField3.get(value2);
                        if (obj11 != null) {
                            ArrayList arrayList = (ArrayList) obj11;
                            Iterator it6 = arrayList.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    Object next2 = it6.next();
                                    if ((next2 instanceof WeakReference) && (reference = (Reference) next2) != null) {
                                        obj2 = reference.get();
                                    } else {
                                        obj2 = null;
                                    }
                                    if (Intrinsics.LJFF(obj2, resources)) {
                                        arrayList.add(new WeakReference(this));
                                        Configuration configuration4 = (Configuration) declaredField4.get(value2);
                                        if (configuration4 != null) {
                                            configuration4.setLocale(this.LIZIZ);
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any> }");
                        }
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.util.WeakHashMap<kotlin.Any, kotlin.Any>");
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>>{ kotlin.collections.TypeAliasesKt.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>> }");
    }

    public final void LIZIZ(Resources resources) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Object obj;
        ArrayMap arrayMap;
        Object obj2 = null;
        if (LJIIL == null) {
            Class<?> cls = Class.forName("android.content.res.ResourcesKey");
            LJIIL = cls;
            LJIILJJIL = cls.getDeclaredField("mOverrideConfiguration");
            Class<?> cls2 = LJIIIIZZ;
            if (cls2 == null) {
                cls2 = null;
            }
            Field declaredField = cls2.getDeclaredField("mActiveResources");
            LJIILIIL = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
        }
        Locale locale = this.LIZIZ;
        Field field = LJIILIIL;
        if (field == null) {
            obj = null;
        } else {
            obj = field.get(LJIIJ);
        }
        if ((obj instanceof ArrayMap) && (arrayMap = (ArrayMap) obj) != null) {
            for (Map.Entry entry : arrayMap.entrySet()) {
                if (Intrinsics.LJFF(((Reference) entry.getValue()).get(), resources)) {
                    arrayMap.put(entry.getKey(), new WeakReference(this));
                    Field field2 = LJIILJJIL;
                    if (field2 != null) {
                        obj2 = field2.get(entry.getKey());
                    }
                    Configuration configuration = (Configuration) obj2;
                    if (configuration != null) {
                        configuration.setLocale(locale);
                        return;
                    }
                    Configuration configuration2 = new Configuration();
                    configuration2.setLocale(this.LIZIZ);
                    Field field3 = LJIILJJIL;
                    if (field3 == null) {
                        return;
                    }
                    field3.set(entry.getKey(), configuration2);
                    return;
                }
            }
        }
    }

    public final CharSequence LIZLLL(int i) {
        CharSequence charSequenceNativeGetText;
        Object objOpt;
        if (((-16777216) & i) != 2130706432) {
            return super.getText(i);
        }
        SharedPreferences sharedPreferences = C818130W7n.LIZ;
        Context context = null;
        try {
            objOpt = C818130W7n.LIZIZ.opt(String.valueOf(i));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (objOpt instanceof CharSequence) {
            charSequenceNativeGetText = (CharSequence) objOpt;
        } else {
            charSequenceNativeGetText = null;
        }
        if (charSequenceNativeGetText == null) {
            if (NxRewordManager.LIZJ == 0) {
                try {
                    return super.getText(i);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th2.toString();
                    NxRewordManager.LIZ(this.LIZ, false);
                }
            }
            charSequenceNativeGetText = NxResourceUtils.INSTANCE.nativeGetText(NxRewordManager.LIZJ, i);
            if (charSequenceNativeGetText == null) {
                charSequenceNativeGetText = super.getText(i);
                new C817690W5v(this.LIZIZ, i, Intrinsics.LJIIJJI(charSequenceNativeGetText, "super.getText:")).LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this);
                sbLIZ.append(", asset: ");
                sbLIZ.append(getAssets());
                sbLIZ.append(", context : ");
                WeakReference<Context> weakReference = this.LIZJ;
                if (weakReference != null) {
                    context = weakReference.get();
                }
                sbLIZ.append(context);
                sbLIZ.append(" get string from super resource id: ");
                sbLIZ.append(i);
                sbLIZ.append(", value : ");
                sbLIZ.append((Object) charSequenceNativeGetText);
                sbLIZ.append(", locale: ");
                sbLIZ.append(getConfiguration().locale);
                sbLIZ.append('}');
                C2188811AlT.LIZIZ(sbLIZ);
                if (!NxRewordManager.LJIIZILJ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("super.getText, id:");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", value:");
                    sbLIZ2.append((Object) charSequenceNativeGetText);
                    Throwable th3 = new Throwable(C2188811AlT.LIZIZ(sbLIZ2));
                    Map mapLJ = C2097608Jq.LJ();
                    C0OFE.LIZ("locale", this.LIZIZ);
                    Npth.reportBizException("NxResource", th3, "NxResourceGetText", mapLJ);
                }
            }
        }
        return charSequenceNativeGetText;
    }

    @Override // android.content.res.Resources
    public final String getString(int i) {
        try {
            return getText(i).toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            new C817690W5v(this.LIZIZ, i, e.getMessage()).LIZJ();
            return C786410Ut5.j4("%x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        }
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) throws Throwable {
        CharSequence[] textArray = getTextArray(i);
        ArrayList arrayList = new ArrayList(textArray.length);
        for (CharSequence charSequence : textArray) {
            arrayList.add(String.valueOf(charSequence));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4 A[RETURN] */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence getText(int r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r6 = 0
            r4 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = X.C817670W5t.LJIIJJI     // Catch: java.lang.Exception -> L76
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r5.readLock()     // Catch: java.lang.Exception -> L76
            r2.lock()     // Catch: java.lang.Exception -> L76
            java.util.Map<java.lang.Object, java.lang.Object> r1 = X.C817670W5t.LJIILLIIL     // Catch: java.lang.Throwable -> L6e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = r1.get(r0)     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r3 instanceof java.lang.CharSequence     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L1c
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L6e
            goto L1d
        L1c:
            r3 = r4
        L1d:
            if (r3 == 0) goto L23
            r2.unlock()     // Catch: java.lang.Exception -> L6c
            return r3
        L23:
            r2.unlock()     // Catch: java.lang.Exception -> L6c
            java.lang.CharSequence r3 = r7.LIZLLL(r8)     // Catch: java.lang.Exception -> L6c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.writeLock()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            boolean r2 = r0.tryLock()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            if (r2 == 0) goto L40
            java.util.Map<java.lang.Object, java.lang.Object> r1 = X.C817670W5t.LJIILLIIL     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L50
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L50
            r1.put(r0, r3)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L50
            goto L40
        L3e:
            r0 = move-exception
            goto L4c
        L40:
            if (r2 == 0) goto L84
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r5.writeLock()     // Catch: java.lang.Exception -> L79
            goto L68
        L47:
            r1 = move-exception
            r2 = 0
            goto L51
        L4a:
            r0 = move-exception
            r2 = 0
        L4c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L50
            goto L60
        L50:
            r1 = move-exception
        L51:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L5f
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = X.C817670W5t.LJIIJJI     // Catch: java.lang.Exception -> L79
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch: java.lang.Exception -> L79
            r0.unlock()     // Catch: java.lang.Exception -> L79
        L5f:
            throw r1     // Catch: java.lang.Exception -> L79
        L60:
            if (r2 == 0) goto L84
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = X.C817670W5t.LJIIJJI     // Catch: java.lang.Exception -> L79
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()     // Catch: java.lang.Exception -> L79
        L68:
            r0.unlock()     // Catch: java.lang.Exception -> L79
            goto L84
        L6c:
            r0 = move-exception
            goto L7a
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6e
            r2.unlock()     // Catch: java.lang.Exception -> L76
            throw r0     // Catch: java.lang.Exception -> L76
        L76:
            r0 = move-exception
            r3 = r4
            goto L7a
        L79:
            r0 = move-exception
        L7a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.toString()
            java.lang.String r4 = r0.getMessage()
        L84:
            if (r3 != 0) goto La4
            X.0W5v r1 = new X.0W5v
            java.util.Locale r0 = r7.LIZIZ
            r1.<init>(r0, r8, r4)
            r1.LIZJ()
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r6] = r0
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r0 = "%x"
            java.lang.String r0 = X.C786410Ut5.j4(r0, r1)
            return r0
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C817670W5t.getText(int):java.lang.CharSequence");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) throws Throwable {
        CharSequence[] charSequenceArr;
        boolean zTryLock;
        ReentrantReadWriteLock.WriteLock writeLock;
        ReentrantReadWriteLock reentrantReadWriteLock;
        boolean z;
        String str;
        try {
            ?? lock = LJIIJJI.readLock();
            lock.lock();
            try {
                Object obj = LJIILLIIL.get(Integer.valueOf(i));
                CharSequence[] textArray = null;
                if (obj instanceof CharSequence[]) {
                    charSequenceArr = (CharSequence[]) obj;
                } else {
                    charSequenceArr = null;
                }
                if (charSequenceArr != null) {
                    lock.unlock();
                    return charSequenceArr;
                }
                lock.unlock();
                if (((-16777216) & i) == 2130706432) {
                    SharedPreferences sharedPreferences = C818130W7n.LIZ;
                    try {
                        Object objOpt = C818130W7n.LIZIZ.opt(String.valueOf(i));
                        if (objOpt instanceof String) {
                            str = (String) objOpt;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            JSONArray jSONArray = new JSONArray(str);
                            CharSequence[] charSequenceArr2 = new CharSequence[jSONArray.length()];
                            int length = jSONArray.length();
                            lock = 0;
                            while (lock < length) {
                                charSequenceArr2[lock] = JSONArrayProtectorUtils.getString(jSONArray, lock);
                                lock++;
                            }
                            textArray = charSequenceArr2;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                boolean z2 = true;
                if (textArray != null) {
                    if (textArray.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = false;
                    }
                }
                if (z2) {
                    try {
                        textArray = super.getTextArray(i);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        reentrantReadWriteLock = LJIIJJI;
                        zTryLock = reentrantReadWriteLock.writeLock().tryLock();
                        if (zTryLock) {
                            try {
                                LJIILLIIL.put(Integer.valueOf(i), textArray);
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                if (zTryLock) {
                                    writeLock = LJIIJJI.writeLock();
                                    writeLock.unlock();
                                    return textArray;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zTryLock = false;
                    } catch (Throwable th3) {
                        th = th3;
                        lock = 0;
                        TryCatchGuardChecker.doCheck(th);
                        if (lock != 0) {
                            LJIIJJI.writeLock().unlock();
                        }
                        throw th;
                    }
                    if (zTryLock) {
                        writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.unlock();
                        return textArray;
                    }
                }
                return textArray;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                lock.unlock();
                throw th4;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            e3.toString();
            new C817690W5v(this.LIZIZ, i, e3.getMessage()).LIZJ();
            return new CharSequence[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LIZJ(int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C817670W5t.LIZJ(int, int):java.lang.CharSequence");
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2) {
        try {
            return getQuantityText(i, i2).toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            new C817690W5v(this.LIZIZ, i, th.getMessage()).LIZJ();
            return C786410Ut5.j4("%x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        }
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i2) {
        try {
            CharSequence charSequenceLIZJ = LIZJ(i, i2);
            if (charSequenceLIZJ == null) {
                new C817690W5v(this.LIZIZ, i, null).LIZJ();
                return C786410Ut5.j4("%x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            }
            return charSequenceLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            new C817690W5v(this.LIZIZ, i, th.getMessage()).LIZJ();
            return C786410Ut5.j4("%x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        }
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... objArr) {
        try {
            String string = getText(i).toString();
            Locale locale = this.LIZIZ;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            return C786410Ut5.k4(locale, string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            new C817690W5v(this.LIZIZ, i, e.getMessage()).LIZJ();
            return C786410Ut5.j4("%x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        }
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        CharSequence charSequenceLIZLLL;
        ReentrantReadWriteLock reentrantReadWriteLock;
        ReentrantReadWriteLock.ReadLock lock;
        ReentrantReadWriteLock.WriteLock writeLock;
        String message = null;
        try {
            reentrantReadWriteLock = LJIIJJI;
            lock = reentrantReadWriteLock.readLock();
            lock.lock();
        } catch (Exception e) {
            e = e;
            charSequenceLIZLLL = null;
        }
        try {
            Object obj = LJIILLIIL.get(Integer.valueOf(i));
            if (obj instanceof CharSequence) {
                charSequenceLIZLLL = (CharSequence) obj;
            } else {
                charSequenceLIZLLL = null;
            }
            try {
            } catch (Exception e2) {
                e = e2;
            }
            if (charSequenceLIZLLL != null) {
                lock.unlock();
                return charSequenceLIZLLL;
            }
            lock.unlock();
            charSequenceLIZLLL = LIZLLL(i);
            boolean zTryLock = false;
            try {
                try {
                    try {
                        zTryLock = reentrantReadWriteLock.writeLock().tryLock();
                        if (zTryLock) {
                            LJIILLIIL.put(Integer.valueOf(i), charSequenceLIZLLL);
                        }
                    } catch (Exception e3) {
                        if (zTryLock) {
                            writeLock = LJIIJJI.writeLock();
                        }
                    }
                    if (zTryLock) {
                        writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.unlock();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zTryLock) {
                        LJIIJJI.writeLock().unlock();
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
                e.toString();
                message = e.getMessage();
            }
            if (charSequenceLIZLLL == null) {
                new C817690W5v(this.LIZIZ, i, message).LIZJ();
                return charSequence;
            }
            return charSequenceLIZLLL;
        } finally {
            TryCatchGuardChecker.doCheck(e3);
            lock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateConfiguration(android.content.res.Configuration r9, android.util.DisplayMetrics r10) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L7b
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.LIZJ
            if (r0 != 0) goto Lbc
            r0 = r7
        L8:
            java.util.Objects.toString(r0)
            android.content.res.AssetManager r0 = r8.getAssets()
            java.util.Objects.toString(r0)
            boolean r0 = r8.LIZLLL
            if (r0 == 0) goto Lb9
            int r0 = r9.uiMode
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L1c:
            int r1 = r9.uiMode
            int r0 = r8.LJFF
            if (r1 != r0) goto L2c
            java.util.Locale r1 = r9.locale
            java.util.Locale r0 = r8.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L73
        L2c:
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>()
            java.util.Locale r0 = r9.locale
            r2.locale = r0
            if (r3 == 0) goto L3d
            int r0 = r3.intValue()
            r2.uiMode = r0
        L3d:
            boolean r0 = r8.LIZLLL
            if (r0 == 0) goto La8
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.LIZJ
            if (r0 != 0) goto La1
            r1 = r7
        L46:
            boolean r0 = r1 instanceof X.C817700W5w
            if (r0 == 0) goto L73
            X.0W5w r1 = (X.C817700W5w) r1
            if (r1 == 0) goto L73
            android.content.Context r0 = r1.LIZ(r2)
        L52:
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils r6 = com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils.INSTANCE
            java.lang.reflect.Method r3 = r6.getGetImplMethod$NxReword_release()
            java.lang.String r5 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOSwcZrZ0yBXV7YUTzjN+uaxF7i3jBSFejiGgQ=="
            r4 = 0
            if (r3 != 0) goto L91
            r3 = r7
        L60:
            java.lang.reflect.Method r2 = r6.getSetImplMethod$NxReword_release()
            if (r2 == 0) goto L73
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r4] = r3
            X.0WZX r0 = new X.0WZX
            r0.<init>(r5, r7)
            X.C2204961BRm.a0(r2, r8, r1, r0)
        L73:
            java.util.Locale r0 = r9.locale
            r8.LIZIZ = r0
            int r0 = r9.uiMode
            r8.LJFF = r0
        L7b:
            super.updateConfiguration(r9, r10)
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.LIZJ
            if (r0 == 0) goto L86
            java.lang.Object r7 = r0.get()
        L86:
            java.util.Objects.toString(r7)
            android.content.res.AssetManager r0 = r8.getAssets()
            java.util.Objects.toString(r0)
            return
        L91:
            android.content.res.Resources r2 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.0WZX r0 = new X.0WZX
            r0.<init>(r5, r7)
            java.lang.Object r3 = X.C2204961BRm.a0(r3, r2, r1, r0)
            goto L60
        La1:
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            goto L46
        La8:
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.LIZJ
            if (r0 == 0) goto L73
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L73
            android.content.Context r0 = r0.createConfigurationContext(r2)
            goto L52
        Lb9:
            r3 = r7
            goto L1c
        Lbc:
            java.lang.Object r0 = r0.get()
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C817670W5t.updateConfiguration(android.content.res.Configuration, android.util.DisplayMetrics):void");
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2, Object... objArr) {
        try {
            String string = getQuantityText(i, i2).toString();
            Locale locale = this.LIZIZ;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            return C786410Ut5.k4(locale, string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.toString();
            new C817690W5v(this.LIZIZ, i, th.getMessage()).LIZJ();
            return C786410Ut5.j4("%x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        }
    }

    public C817670W5t(Resources resources, Locale locale, WeakReference weakReference, boolean z) throws Throwable {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.LIZ = resources;
        this.LIZIZ = locale;
        this.LIZJ = weakReference;
        this.LIZLLL = z;
        this.LJFF = resources.getConfiguration().uiMode;
        Resources resources2 = this.LIZ;
        try {
            if (!LJII) {
                if (Build.VERSION.SDK_INT >= 24) {
                    LIZ(resources2);
                } else {
                    LIZIZ(resources2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_version:", Build.VERSION.SDK_INT);
            jSONObject.put("error message:", String.valueOf(e.getMessage()));
            C1AF0.LIZJ(C786410Ut5.J3(jSONObject));
        }
    }
}
