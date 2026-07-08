package X;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.19FF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19FF {
    public final Map<Integer, String> LIZ = new LinkedHashMap();
    public final Map<String, Integer> LIZIZ = new LinkedHashMap();
    public final Map<String, C19FK> LIZJ = new LinkedHashMap();
    public final List<String> LIZLLL = new ArrayList();
    public final transient Map<String, C19FJ<?>> LJ = new LinkedHashMap();
    public final Map<String, Object> LJFF = new LinkedHashMap();
    public final Bundle LJI = new Bundle();

    public abstract void LIZIZ(int i, AnonymousClass1433 anonymousClass1433, Object obj);

    public final void LJ(String str) {
        if (((LinkedHashMap) this.LIZIZ).get(str) != null) {
            return;
        }
        final AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(4600);
        Sequence<Number> c13lm = new C13LM(aFwS190S0000000_4, new Function1() { // from class: X.19FL
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return aFwS190S0000000_4.invoke();
            }
        });
        if (!(c13lm instanceof C08F6)) {
            c13lm = new C08F6(c13lm);
        }
        for (Number number : c13lm) {
            if (!this.LIZ.containsKey(Integer.valueOf(number.intValue()))) {
                int iIntValue = number.intValue();
                this.LIZ.put(Integer.valueOf(iIntValue), str);
                this.LIZIZ.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void LJFF(String str) {
        Integer numRemove;
        if (!((ArrayList) this.LIZLLL).contains(str) && (numRemove = this.LIZIZ.remove(str)) != null) {
            this.LIZ.remove(numRemove);
        }
        this.LJ.remove(str);
        if (this.LJFF.containsKey(str)) {
            this.LJFF.remove(str);
        }
        if (this.LJI.containsKey(str)) {
            C475500Ikm.LIZ(this.LJI, str, ActivityResult.class);
            this.LJI.remove(str);
        }
        C19FK c19fk = (C19FK) ((LinkedHashMap) this.LIZJ).get(str);
        if (c19fk != null) {
            Iterator it2 = ((ArrayList) c19fk.LIZIZ).iterator();
            while (it2.hasNext()) {
                c19fk.LIZ.removeObserver((LifecycleObserver) it2.next());
            }
            ((ArrayList) c19fk.LIZIZ).clear();
            this.LIZJ.remove(str);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v14 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final boolean LIZ(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r4.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L12
            r0 = 0
            return r0
        L12:
            java.util.Map<java.lang.String, X.19FJ<?>> r0 = r4.LJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r3)
            X.19FJ r2 = (X.C19FJ) r2
            if (r2 == 0) goto L40
            X.168Q<O> r0 = r2.LIZ
            if (r0 == 0) goto L40
            java.util.List<java.lang.String> r0 = r4.LIZLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L40
            X.168Q<O> r1 = r2.LIZ
            X.1433<?, O> r0 = r2.LIZIZ
            java.lang.Object r0 = r0.LIZJ(r6, r7)
            r1.LIZ(r0)
            java.util.List<java.lang.String> r0 = r4.LIZLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r3)
        L3e:
            r0 = 1
            return r0
        L40:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.LJFF
            r0.remove(r3)
            android.os.Bundle r1 = r4.LJI
            androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
            r0.<init>(r6, r7)
            X.C786410Ut5.LJJIJL(r1, r3, r0)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19FF.LIZ(int, int, android.content.Intent):boolean");
    }

    public final C19FH LIZLLL(String str, AnonymousClass1433 anonymousClass1433, C168Q c168q) {
        LJ(str);
        this.LJ.put(str, new C19FJ<>(anonymousClass1433, c168q));
        if (this.LJFF.containsKey(str)) {
            Object obj = ((LinkedHashMap) this.LJFF).get(str);
            this.LJFF.remove(str);
            c168q.LIZ(obj);
        }
        ActivityResult activityResult = (ActivityResult) C475500Ikm.LIZ(this.LJI, str, ActivityResult.class);
        if (activityResult != null) {
            this.LJI.remove(str);
            c168q.LIZ(anonymousClass1433.LIZJ(activityResult.resultCode, activityResult.data));
        }
        return new C19FH(this, str, anonymousClass1433);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.19FG] */
    public final C19FG LIZJ(final String str, LifecycleOwner lifecycleOwner, final AnonymousClass1433 anonymousClass1433, final C168Q c168q) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            LJ(str);
            C19FK c19fk = (C19FK) ((LinkedHashMap) this.LIZJ).get(str);
            if (c19fk == null) {
                c19fk = new C19FK(lifecycle);
            }
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.19FI
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    C19FF c19ff = this.LL;
                    String str2 = str;
                    C168Q c168q2 = c168q;
                    AnonymousClass1433 anonymousClass14332 = anonymousClass1433;
                    if (Lifecycle.Event.ON_START == event) {
                        c19ff.LJ.put(str2, new C19FJ<>(anonymousClass14332, c168q2));
                        if (c19ff.LJFF.containsKey(str2)) {
                            Object obj = ((LinkedHashMap) c19ff.LJFF).get(str2);
                            c19ff.LJFF.remove(str2);
                            c168q2.LIZ(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) C475500Ikm.LIZ(c19ff.LJI, str2, ActivityResult.class);
                        if (activityResult != null) {
                            c19ff.LJI.remove(str2);
                            c168q2.LIZ(anonymousClass14332.LIZJ(activityResult.resultCode, activityResult.data));
                            return;
                        }
                        return;
                    }
                    if (Lifecycle.Event.ON_STOP == event) {
                        c19ff.LJ.remove(str2);
                    } else {
                        if (Lifecycle.Event.ON_DESTROY != event) {
                            return;
                        }
                        c19ff.LJFF(str2);
                    }
                }
            };
            c19fk.LIZ.addObserver(lifecycleEventObserver);
            ((ArrayList) c19fk.LIZIZ).add(lifecycleEventObserver);
            this.LIZJ.put(str, c19fk);
            return new C19F0<Object>() { // from class: X.19FG
                @Override // X.C19F0
                public final void LIZIZ() {
                    this.LIZ.LJFF(str);
                }

                @Override // X.C19F0
                public final void LIZ(Object obj) throws Exception {
                    Object obj2 = ((LinkedHashMap) this.LIZ.LIZIZ).get(str);
                    AnonymousClass1433<Object, Object> anonymousClass14332 = anonymousClass1433;
                    if (obj2 != null) {
                        int iIntValue = ((Number) obj2).intValue();
                        ((ArrayList) this.LIZ.LIZLLL).add(str);
                        try {
                            this.LIZ.LIZIZ(iIntValue, anonymousClass1433, obj);
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            ((ArrayList) this.LIZ.LIZLLL).remove(str);
                            throw e;
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                    sbLIZ.append(anonymousClass14332);
                    sbLIZ.append(" and input ");
                    sbLIZ.append(obj);
                    sbLIZ.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
            };
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LifecycleOwner ");
        sbLIZ.append(lifecycleOwner);
        sbLIZ.append(" is attempting to register while current state is ");
        sbLIZ.append(lifecycle.getCurrentState());
        sbLIZ.append(". LifecycleOwners must call register before they are STARTED.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
