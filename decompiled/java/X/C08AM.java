package X;

import Y.ARunnableS72S0200000_3;
import android.content.SharedPreferences;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08AM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08AM implements SharedPreferences.Editor {
    public final Object LIZ = new Object();
    public final Map<String, Object> LIZIZ = new HashMap();
    public boolean LIZJ = false;
    public final /* synthetic */ C08AP LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:16:0x0046, B:18:0x004a, B:20:0x0054, B:22:0x005e, B:23:0x0061, B:24:0x006d, B:26:0x0073, B:29:0x0087, B:31:0x0091, B:33:0x009b, B:36:0x00a2, B:41:0x00bd, B:37:0x00aa, B:39:0x00b4, B:43:0x00c2, B:45:0x00cb, B:46:0x00d4, B:47:0x00d8), top: B:59:0x0046, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C08AO LIZ() {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08AM.LIZ():X.08AO");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.08AK] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.08AL, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v1 java.lang.Runnable
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        /*
            r5 = this;
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Le
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.LIZIZ     // Catch: java.lang.Exception -> Le
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> Le
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Exception -> Le
            r4.<init>(r0)     // Catch: java.lang.Exception -> Le
            goto L16
        Le:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.List r4 = java.util.Collections.emptyList()
        L16:
            X.08AO r3 = r5.LIZ()
            X.08AL r2 = new X.08AL
            r2.<init>()
            java.lang.Object r1 = com.ss.android.ugc.aweme.sp.QueuedWork.LIZ
            monitor-enter(r1)
            java.util.LinkedList<java.lang.Runnable> r0 = com.ss.android.ugc.aweme.sp.QueuedWork.LIZJ     // Catch: java.lang.Throwable -> L36
            r0.add(r2)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            X.08AK r1 = new X.08AK
            r1.<init>()
            X.08AP r0 = r5.LIZLLL
            r0.LIZJ(r3, r1, r4)
            r5.LIZIZ(r3)
            return
        L36:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08AM.apply():void");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        synchronized (this.LIZ) {
            try {
                this.LIZJ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        C08AO c08aoLIZ = LIZ();
        this.LIZLLL.LIZJ(c08aoLIZ, null, null);
        try {
            try {
                c08aoLIZ.LJ.await();
                LIZIZ(c08aoLIZ);
                return c08aoLIZ.LJFF;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public C08AM(C08AP c08ap) {
        this.LIZLLL = c08ap;
    }

    public final void LIZIZ(C08AO c08ao) {
        List<String> list;
        if (c08ao.LIZJ != null && (list = c08ao.LIZIZ) != null && list.size() != 0) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                for (int size = c08ao.LIZIZ.size() - 1; size >= 0; size--) {
                    String str = (String) ListProtector.get(c08ao.LIZIZ, size);
                    for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : c08ao.LIZJ) {
                        if (onSharedPreferenceChangeListener != null) {
                            onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.LIZLLL, str);
                        }
                    }
                }
                return;
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS72S0200000_3(c08ao, this, 57));
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        synchronized (this.LIZ) {
            try {
                ((HashMap) this.LIZIZ).put(str, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.LIZ) {
            try {
                ((HashMap) this.LIZIZ).put(str, Boolean.valueOf(z));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.LIZ) {
            try {
                ((HashMap) this.LIZIZ).put(str, Float.valueOf(f));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.LIZ) {
            try {
                ((HashMap) this.LIZIZ).put(str, Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.LIZ) {
            try {
                ((HashMap) this.LIZIZ).put(str, Long.valueOf(j));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.LIZ) {
            try {
                ((HashMap) this.LIZIZ).put(str, str2);
                if (str2 != null && str2.length() > 500) {
                    String str3 = this.LIZLLL.LIZIZ;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sp_value_size", str2.length());
                        jSONObject.put("sp_file_name", str3);
                        jSONObject.put("sp_key", str);
                        C794240VDq.LIZIZ("sp_put_big_size_value", "sp_put_big_size_value", jSONObject);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        HashSet hashSet;
        synchronized (this.LIZ) {
            try {
                Map<String, Object> map = this.LIZIZ;
                if (set == null) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet(set);
                }
                ((HashMap) map).put(str, hashSet);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }
}
