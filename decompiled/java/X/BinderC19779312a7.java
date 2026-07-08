package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: X.12a7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class BinderC19779312a7 extends AbstractBinderC19779412a8 {
    public final C12Z4 LL;
    public Boolean LLILLJJLI;
    public String LLILLL;

    public BinderC19779312a7(C12Z4 c12z4) {
        C0W3J.LJIIIIZZ(c12z4);
        this.LL = c12z4;
        this.LLILLL = null;
    }

    @Override // X.InterfaceC19802012dm
    public final void B(final zzn zznVar) {
        C0W3J.LJI(zznVar.zza);
        C0W3J.LJIIIIZZ(zznVar.zzt);
        LLILLIZIL(new Runnable(this) { // from class: X.12ZB
            public final /* synthetic */ BinderC19779312a7 LLILLJJLI;

            public final void LIZ() throws Throwable {
                this.LLILLJJLI.LL.LJJJLIIL();
                C12Z4 c12z4 = this.LLILLJJLI.LL;
                zzn zznVar2 = zznVar;
                c12z4.LJIIL().LJ();
                c12z4.LJJJLL();
                C0W3J.LJI(zznVar2.zza);
                if (c12z4.LJJJJ().LJIJI(null, C19817012gC.LJLLI)) {
                    c12z4.LJJJJJ(zznVar2);
                    c12z4.LJJJJI(zznVar2);
                    return;
                }
                C19781912aX c19781912aXLIZLLL = C19781912aX.LIZLLL(zznVar2.zzy, zznVar2.zzt);
                C19781912aX c19781912aXLJJIJIIJI = c12z4.LJJIJIIJI(zznVar2.zza);
                c12z4.LJIILJJIL().LJIILIIL.LIZIZ(zznVar2.zza, "Setting storage consent, package, consent", c19781912aXLIZLLL);
                c12z4.LJJI(zznVar2.zza, c19781912aXLIZLLL);
                C19820612gm.LIZ();
                if (!c12z4.LJJJJ().LJIJI(null, C19817012gC.LLFZ) && c19781912aXLIZLLL.LJIILIIL(c19781912aXLJJIJIIJI)) {
                    c12z4.LJJJIL(zznVar2);
                }
                C19781812aW c19781812aWLIZJ = C19781812aW.LIZJ(zznVar2.zzz);
                if (C19781812aW.LJFF.equals(c19781812aWLIZJ)) {
                    return;
                }
                c12z4.LJIILJJIL().LJIILIIL.LIZIZ(zznVar2.zza, "Setting DMA consent. package, consent", c19781812aWLIZJ);
                c12z4.LJJ(zznVar2.zza, c19781812aWLIZJ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzib@391a.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzib@391a.run");
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    @Override // X.InterfaceC19802012dm
    public final void E(final zzn zznVar) {
        C0W3J.LJI(zznVar.zza);
        C0W3J.LJIIIIZZ(zznVar.zzt);
        LLILLIZIL(new Runnable() { // from class: X.12Zi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzhp@3909.run");
                try {
                    BinderC19779312a7 binderC19779312a7 = this.LL;
                    zzn zznVar2 = zznVar;
                    binderC19779312a7.LL.LJJJLIIL();
                    binderC19779312a7.LL.LJJJJI(zznVar2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzhp@3909.run");
            }
        });
    }

    @Override // X.InterfaceC19802012dm
    public final void F(final zzn zznVar) {
        LLLLII(zznVar);
        x(new Runnable(this) { // from class: X.12ZN
            public final /* synthetic */ BinderC19779312a7 LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzhr@390b.run");
                try {
                    this.LLILLJJLI.LL.LJJJLIIL();
                    C12Z4 c12z4 = this.LLILLJJLI.LL;
                    zzn zznVar2 = zznVar;
                    c12z4.LJIIL().LJ();
                    c12z4.LJJJLL();
                    C0W3J.LJI(zznVar2.zza);
                    c12z4.LJIIIIZZ(zznVar2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzhr@390b.run");
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    @Override // X.InterfaceC19802012dm
    public final void I(final zzn zznVar) {
        LLLLII(zznVar);
        x(new Runnable(this) { // from class: X.12Zf
            public final /* synthetic */ BinderC19779312a7 LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzhu@390e.run");
                try {
                    this.LLILLJJLI.LL.LJJJLIIL();
                    this.LLILLJJLI.LL.LJJJ(zznVar);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzhu@390e.run");
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    @Override // X.InterfaceC19802012dm
    public final void L(final zzn zznVar) {
        C0W3J.LJI(zznVar.zza);
        LLLIIL(zznVar.zza, false);
        x(new Runnable(this) { // from class: X.12Zd
            public final /* synthetic */ BinderC19779312a7 LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzic@391b.run");
                try {
                    this.LLILLJJLI.LL.LJJJLIIL();
                    this.LLILLJJLI.LL.LJJJIL(zznVar);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzic@391b.run");
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    public final void LLILLIZIL(Runnable runnable) {
        if (this.LL.LJIIL().LJIIZILJ()) {
            runnable.run();
        } else {
            this.LL.LJIIL().LJIILLIIL(runnable);
        }
    }

    public final void LLLLII(zzn zznVar) {
        C0W3J.LJIIIIZZ(zznVar);
        C0W3J.LJI(zznVar.zza);
        LLLIIL(zznVar.zza, false);
        this.LL.LJJJJZI().LJJJJJ(zznVar.zzb, zznVar.zzp);
    }

    @Override // X.InterfaceC19802012dm
    public final void R(final zzn zznVar) {
        C0W3J.LJI(zznVar.zza);
        C0W3J.LJIIIIZZ(zznVar.zzt);
        LLILLIZIL(new Runnable() { // from class: X.12Zj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzhq@390a.run");
                try {
                    BinderC19779312a7 binderC19779312a7 = this.LL;
                    zzn zznVar2 = zznVar;
                    binderC19779312a7.LL.LJJJLIIL();
                    binderC19779312a7.LL.LJJJJJ(zznVar2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzhq@390a.run");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // X.InterfaceC19802012dm
    public final zzal h(final zzn zznVar) {
        LLLLII(zznVar);
        C0W3J.LJI(zznVar.zza);
        try {
            return (zzal) this.LL.LJIIL().LJIILIIL(new Callable<zzal>(this) { // from class: X.12aK
                public final /* synthetic */ BinderC19779312a7 LLILLJJLI;

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ zzal call() throws Throwable {
                    C1C7U.LIZ("zzie@391d.call");
                    this.LLILLJJLI.LL.LJJJLIIL();
                    zzal zzalVar = new zzal(this.LLILLJJLI.LL.LJ(zznVar.zza));
                    C1C7U.LIZIZ("zzie@391d.call");
                    return zzalVar;
                }

                {
                    this.LLILLJJLI = this;
                }
            }).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(zznVar.zza), "Failed to get consent. appId", e);
            return new zzal(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // X.InterfaceC19802012dm
    public final String n(final zzn zznVar) {
        LLLLII(zznVar);
        final C12Z4 c12z4 = this.LL;
        try {
            return (String) c12z4.LJIIL().LJIIIZ(new Callable<String>() { // from class: X.12ZQ
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ String call() {
                    C1C7U.LIZ("zzng@39ba.call");
                    C12Z4 c12z42 = c12z4;
                    String str = zznVar.zza;
                    C0W3J.LJIIIIZZ(str);
                    if (c12z42.LJJIJIIJI(str).LJIJI() && C19781912aX.LJIIJ(zznVar.zzt).LJIJI()) {
                        String strLJI = c12z4.LJIIIIZZ(zznVar).LJI();
                        C1C7U.LIZIZ("zzng@39ba.call");
                        return strLJI;
                    }
                    c12z4.LJIILJJIL().LJIILIIL.LIZJ("Analytics storage consent denied. Returning null app instance id");
                    C1C7U.LIZIZ("zzng@39ba.call");
                    return null;
                }
            }).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            TryCatchGuardChecker.doCheck(e);
            c12z4.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(zznVar.zza), "Failed to get app instance id. appId", e);
            return null;
        }
    }

    public final void x(Runnable runnable) {
        if (this.LL.LJIIL().LJIIZILJ()) {
            runnable.run();
        } else {
            this.LL.LJIIL().LJIILL(runnable);
        }
    }

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
    @Override // X.InterfaceC19802012dm
    public final List LJJJIL(final Bundle bundle, final zzn zznVar) {
        LLLLII(zznVar);
        C0W3J.LJIIIIZZ(zznVar.zza);
        try {
            return (List) this.LL.LJIIL().LJIIIZ(new Callable<List<zzmu>>(this) { // from class: X.12Zp
                public final /* synthetic */ BinderC19779312a7 LLILLL;

                @Override // java.util.concurrent.Callable
                public final List<zzmu> call() throws Throwable {
                    List<zzmu> list;
                    C1C7U.LIZ("zzih@3920.call");
                    this.LLILLL.LL.LJJJLIIL();
                    C12Z4 c12z4 = this.LLILLL.LL;
                    zzn zznVar2 = zznVar;
                    Bundle bundle2 = bundle;
                    c12z4.LJIIL().LJ();
                    C19820512gl.LIZ();
                    if (!c12z4.LJJJJ().LJIJI(zznVar2.zza, C19817012gC.LJLIL) || zznVar2.zza == null) {
                        ArrayList arrayList = new ArrayList();
                        C1C7U.LIZIZ("zzih@3920.call");
                        return arrayList;
                    }
                    if (bundle2 != null) {
                        int[] intArray = bundle2.getIntArray("uriSources");
                        long[] longArray = bundle2.getLongArray("uriTimestamps");
                        if (intArray != null) {
                            if (longArray == null || longArray.length != intArray.length) {
                                c12z4.LJIILJJIL().LJFF.LIZJ("Uri sources and timestamps do not match");
                            } else {
                                for (int i = 0; i < intArray.length; i++) {
                                    C12Z6 c12z6 = c12z4.LIZJ;
                                    C12Z4.LJJII(c12z6);
                                    String str = zznVar2.zza;
                                    int i2 = intArray[i];
                                    long j = longArray[i];
                                    C0W3J.LJI(str);
                                    c12z6.LJ();
                                    c12z6.LJIIIIZZ();
                                    try {
                                        int iDelete = c12z6.LJIILIIL().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                        c12z6.LJIILJJIL().LJIILIIL.LIZLLL("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i2), Long.valueOf(j));
                                    } catch (SQLiteException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c12z6.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error pruning trigger URIs. appId", e);
                                    }
                                }
                            }
                        }
                    }
                    C12Z6 c12z62 = c12z4.LIZJ;
                    C12Z4.LJJII(c12z62);
                    String str2 = zznVar2.zza;
                    C0W3J.LJI(str2);
                    c12z62.LJ();
                    c12z62.LJIIIIZZ();
                    ArrayList arrayList2 = new ArrayList();
                    Cursor cursorQuery = null;
                    try {
                        try {
                            cursorQuery = c12z62.LJIILIIL().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                            if (cursorQuery.moveToFirst()) {
                                do {
                                    String string = cursorQuery.getString(0);
                                    if (string == null) {
                                        string = "";
                                    }
                                    arrayList2.add(new zzmu(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                                } while (cursorQuery.moveToNext());
                                cursorQuery.close();
                                list = arrayList2;
                            } else {
                                cursorQuery.close();
                                list = arrayList2;
                            }
                        } catch (SQLiteException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c12z62.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str2), "Error querying trigger uris. appId", e2);
                            List<zzmu> listEmptyList = Collections.emptyList();
                            list = listEmptyList;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                                list = listEmptyList;
                            }
                        }
                        C1C7U.LIZIZ("zzih@3920.call");
                        return list;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                }

                {
                    this.LLILLL = this;
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(zznVar.zza), "Failed to get trigger URIs. appId", e);
            return Collections.emptyList();
        }
    }

    @Override // X.InterfaceC19802012dm
    public final void LLIZ(final zzno zznoVar, final zzn zznVar) {
        C0W3J.LJIIIIZZ(zznoVar);
        LLLLII(zznVar);
        x(new Runnable(this) { // from class: X.12ZW
            public final /* synthetic */ BinderC19779312a7 LLILLL;

            public final void LIZ() throws Throwable {
                this.LLILLL.LL.LJJJLIIL();
                if (zznoVar.zza() == null) {
                    this.LLILLL.LL.LJIL(zznoVar.zza, zznVar);
                } else {
                    this.LLILLL.LL.LJIJ(zznoVar, zznVar);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzii@3921.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzii@3921.run");
            }

            {
                this.LLILLL = this;
            }
        });
    }

    @Override // X.InterfaceC19802012dm
    public final void LLJJJJLIIL(zzac zzacVar, final zzn zznVar) {
        C0W3J.LJIIIIZZ(zzacVar);
        C0W3J.LJIIIIZZ(zzacVar.zzc);
        LLLLII(zznVar);
        final zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zznVar.zza;
        x(new Runnable(this) { // from class: X.12ZT
            public final /* synthetic */ BinderC19779312a7 LLILLL;

            public final void LIZ() throws Throwable {
                this.LLILLL.LL.LJJJLIIL();
                if (zzacVar2.zzc.zza() == null) {
                    this.LLILLL.LL.LJIILL(zzacVar2, zznVar);
                } else {
                    this.LLILLL.LL.LJJIJIIJIL(zzacVar2, zznVar);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzhw@3910.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzhw@3910.run");
            }

            {
                this.LLILLL = this;
            }
        });
    }

    public final void LLLIIL(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.LLILLJJLI == null) {
                        if (!"com.google.android.gms".equals(this.LLILLL) && !C828950WfV.LIZ(this.LL.LJIIJJI.LIZ, Binder.getCallingUid()) && !C828930WfT.LIZ(this.LL.LJIIJJI.LIZ).LIZIZ(Binder.getCallingUid())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        this.LLILLJJLI = Boolean.valueOf(z2);
                    }
                    if (this.LLILLJJLI.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LL.LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Measurement Service called with invalid calling package. appId");
                    throw e;
                }
            }
            if (this.LLILLL == null && C829090Wfj.uidHasPackageName(this.LL.LJIIJJI.LIZ, Binder.getCallingUid(), str)) {
                this.LLILLL = str;
            }
            if (!str.equals(this.LLILLL)) {
                throw new SecurityException(C786410Ut5.j4("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.LL.LJIILJJIL().LJFF.LIZJ("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // X.InterfaceC19802012dm
    public final void LLZZJLIL(final zzbf zzbfVar, final zzn zznVar) {
        C0W3J.LJIIIIZZ(zzbfVar);
        LLLLII(zznVar);
        x(new Runnable(this) { // from class: X.12a9
            public final /* synthetic */ BinderC19779312a7 LLILLL;

            public final void LIZ() throws Throwable {
                C19793312cN c19793312cNLIZJ;
                zzba zzbaVar;
                BinderC19779312a7 binderC19779312a7 = this.LLILLL;
                zzbf zzbfVar2 = zzbfVar;
                binderC19779312a7.getClass();
                if ("_cmp".equals(zzbfVar2.zza) && (zzbaVar = zzbfVar2.zzb) != null && zzbaVar.LJLZ() != 0) {
                    String strLLIILII = zzbfVar2.zzb.LLIILII("_cis");
                    if ("referrer broadcast".equals(strLLIILII) || "referrer API".equals(strLLIILII)) {
                        binderC19779312a7.LL.LJIILJJIL().LJIIJJI.LIZ(zzbfVar2.toString(), "Event has been filtered ");
                        zzbfVar2 = new zzbf("_cmpx", zzbfVar2.zzb, zzbfVar2.zzc, zzbfVar2.zzd);
                    }
                }
                BinderC19779312a7 binderC19779312a72 = this.LLILLL;
                zzn zznVar2 = zznVar;
                C19779612aA c19779612aA = binderC19779312a72.LL.LIZ;
                C12Z4.LJJII(c19779612aA);
                if (!c19779612aA.LJJIIZ(zznVar2.zza)) {
                    binderC19779312a72.m0(zzbfVar2, zznVar2);
                    return;
                }
                binderC19779312a72.LL.LJIILJJIL().LJIILIIL.LIZ(zznVar2.zza, "EES config found for");
                C19779612aA c19779612aA2 = binderC19779312a72.LL.LIZ;
                C12Z4.LJJII(c19779612aA2);
                String str = zznVar2.zza;
                if (TextUtils.isEmpty(str) || (c19793312cNLIZJ = c19779612aA2.LJIIIZ.LIZJ(str)) == null) {
                    binderC19779312a72.LL.LJIILJJIL().LJIILIIL.LIZ(zznVar2.zza, "EES not loaded for");
                    binderC19779312a72.m0(zzbfVar2, zznVar2);
                    return;
                }
                try {
                    C12Z4.LJJII(binderC19779312a72.LL.LJI);
                    Map mapLJJIIJ = C19777312Zn.LJJIIJ(zzbfVar2.zzb.LLIFFJFJJ(), true);
                    String strLIZ = C19785212b4.LIZ(zzbfVar2.zza, C19781212aQ.LIZJ, C19781212aQ.LIZ);
                    if (strLIZ == null) {
                        strLIZ = zzbfVar2.zza;
                    }
                    if (c19793312cNLIZJ.LIZIZ(new C19795812cm(zzbfVar2.zzd, strLIZ, mapLJJIIJ))) {
                        C19780912aN c19780912aN = c19793312cNLIZJ.LIZJ;
                        if (!c19780912aN.LIZIZ.equals(c19780912aN.LIZ)) {
                            binderC19779312a72.LL.LJIILJJIL().LJIILIIL.LIZ(zzbfVar2.zza, "EES edited event");
                            C12Z4.LJJII(binderC19779312a72.LL.LJI);
                            binderC19779312a72.m0(C19777312Zn.LJIL(c19793312cNLIZJ.LIZJ.LIZIZ), zznVar2);
                        } else {
                            binderC19779312a72.m0(zzbfVar2, zznVar2);
                        }
                        if (!((ArrayList) c19793312cNLIZJ.LIZJ.LIZJ).isEmpty()) {
                            for (C19795812cm c19795812cm : (ArrayList) c19793312cNLIZJ.LIZJ.LIZJ) {
                                binderC19779312a72.LL.LJIILJJIL().LJIILIIL.LIZ(c19795812cm.LIZ, "EES logging created event");
                                C12Z4.LJJII(binderC19779312a72.LL.LJI);
                                binderC19779312a72.m0(C19777312Zn.LJIL(c19795812cm), zznVar2);
                            }
                            return;
                        }
                        return;
                    }
                } catch (C19793612cQ e) {
                    TryCatchGuardChecker.doCheck(e);
                    binderC19779312a72.LL.LJIILJJIL().LJFF.LIZIZ(zznVar2.zzb, "EES error. appId, eventName", zzbfVar2.zza);
                }
                binderC19779312a72.LL.LJIILJJIL().LJIILIIL.LIZ(zzbfVar2.zza, "EES was not applied to event");
                binderC19779312a72.m0(zzbfVar2, zznVar2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzid@391c.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzid@391c.run");
            }

            {
                this.LLILLL = this;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // X.InterfaceC19802012dm
    public final byte[] f1(final zzbf zzbfVar, final String str) {
        C0W3J.LJI(str);
        C0W3J.LJIIIIZZ(zzbfVar);
        LLLIIL(str, true);
        this.LL.LJIILJJIL().LJIIL.LIZ(this.LL.LJIIJJI.LJIIL.LIZJ(zzbfVar.zza), "Log and bundle. event");
        this.LL.LIZ().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.LL.LJIIL().LJIILIIL(new Callable<byte[]>(zzbfVar, str) { // from class: X.12aI
                @Override // java.util.concurrent.Callable
                public final byte[] call() throws Throwable {
                    C1C7U.LIZ("zzif@391e.call");
                    this.LL.LL.LJJJLIIL();
                    C19785412b6 c19785412b6 = this.LL.LL.LJII;
                    C12Z4.LJJII(c19785412b6);
                    c19785412b6.LJ();
                    c19785412b6.LIZ.getClass();
                    throw new IllegalStateException("Unexpected call on client side");
                }
            }).get();
            if (bArr == null) {
                this.LL.LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            this.LL.LIZ().getClass();
            this.LL.LJIILJJIL().LJIIL.LIZLLL("Log and bundle processed. event, size, time_ms", this.LL.LJIIJJI.LJIIL.LIZJ(zzbfVar.zza), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LJIILJJIL().LJFF.LIZLLL("Failed to log and bundle. appId, event, error", C19806212eS.LJIIJ(str), this.LL.LJIIJJI.LJIIL.LIZJ(zzbfVar.zza), e);
            return null;
        }
    }

    public final void m0(zzbf zzbfVar, zzn zznVar) throws Throwable {
        this.LL.LJJJLIIL();
        this.LL.LJIILLIIL(zzbfVar, zznVar);
    }

    @Override // X.InterfaceC19802012dm
    /* JADX INFO: renamed from: LJJJIL */
    public final void mo35LJJJIL(final Bundle bundle, zzn zznVar) {
        LLLLII(zznVar);
        final String str = zznVar.zza;
        C0W3J.LJIIIIZZ(str);
        x(new Runnable() { // from class: X.12Z8
            public final void LIZ() {
                BinderC19779312a7 binderC19779312a7 = this.LL;
                String str2 = str;
                Bundle bundle2 = bundle;
                C12Z6 c12z6 = binderC19779312a7.LL.LIZJ;
                C12Z4.LJJII(c12z6);
                c12z6.LJ();
                c12z6.LJIIIIZZ();
                byte[] bArrLJIIJ = c12z6.LJFF().LJIJI(new C12ZA(c12z6.LIZ, "", str2, "dep", 0L, bundle2)).LJIIJ();
                c12z6.LJIILJJIL().LJIILIIL.LIZIZ(c12z6.LIZ.LJIIL.LIZJ(str2), "Saving default event parameters, appId, data size", Integer.valueOf(bArrLJIIJ.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", bArrLJIIJ);
                try {
                    if (c12z6.LJIILIIL().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        c12z6.LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str2), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c12z6.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str2), "Error storing default event parameters. appId", e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzhs@390c.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzhs@390c.run");
            }
        });
    }

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
    @Override // X.InterfaceC19802012dm
    public final List<zzac> LLJLILLLLZIIL(final String str, final String str2, zzn zznVar) {
        LLLLII(zznVar);
        final String str3 = zznVar.zza;
        C0W3J.LJIIIIZZ(str3);
        try {
            return (List) this.LL.LJIIL().LJIIIZ(new Callable<List<zzac>>(this) { // from class: X.12aM
                public final /* synthetic */ BinderC19779312a7 LLILZ;

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ List<zzac> call() throws Throwable {
                    C1C7U.LIZ("zzia@3919.call");
                    this.LLILZ.LL.LJJJLIIL();
                    List<zzac> listLJJI = this.LLILZ.LL.LJJJJIZL().LJJI(str3, str, str2);
                    C1C7U.LIZIZ("zzia@3919.call");
                    return listLJJI;
                }

                {
                    this.LLILZ = this;
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LJIILJJIL().LJFF.LIZ(e, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

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
    @Override // X.InterfaceC19802012dm
    public final List<zzac> g0(final String str, final String str2, final String str3) {
        LLLIIL(str, true);
        try {
            return (List) this.LL.LJIIL().LJIIIZ(new Callable<List<zzac>>(this) { // from class: X.12aL
                public final /* synthetic */ BinderC19779312a7 LLILZ;

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ List<zzac> call() throws Throwable {
                    C1C7U.LIZ("zzhz@3913.call");
                    this.LLILZ.LL.LJJJLIIL();
                    List<zzac> listLJJI = this.LLILZ.LL.LJJJJIZL().LJJI(str, str2, str3);
                    C1C7U.LIZIZ("zzhz@3913.call");
                    return listLJJI;
                }

                {
                    this.LLILZ = this;
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LJIILJJIL().LJFF.LIZ(e, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

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
    @Override // X.InterfaceC19802012dm
    public final List<zzno> LLLLLLLLLL(final String str, final String str2, boolean z, zzn zznVar) {
        LLLLII(zznVar);
        final String str3 = zznVar.zza;
        C0W3J.LJIIIIZZ(str3);
        try {
            List<C19784112at> list = (List) this.LL.LJIIL().LJIIIZ(new Callable<List<C19784112at>>(this) { // from class: X.12a6
                public final /* synthetic */ BinderC19779312a7 LLILZ;

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ List<C19784112at> call() throws Throwable {
                    C1C7U.LIZ("zzhy@3912.call");
                    this.LLILZ.LL.LJJJLIIL();
                    List<C19784112at> listLJJJJIZL = this.LLILZ.LL.LJJJJIZL().LJJJJIZL(str3, str, str2);
                    C1C7U.LIZIZ("zzhy@3912.call");
                    return listLJJJJIZL;
                }

                {
                    this.LLILZ = this;
                }
            }).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C19784112at c19784112at : list) {
                if (z || !C19803112dx.LJJLIL(c19784112at.LIZJ)) {
                    arrayList.add(new zzno(c19784112at));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(zznVar.zza), "Failed to query user properties. appId", e);
            return Collections.emptyList();
        }
    }

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
    @Override // X.InterfaceC19802012dm
    public final List<zzno> LLLZ(final String str, final String str2, final String str3, boolean z) {
        LLLIIL(str, true);
        try {
            List<C19784112at> list = (List) this.LL.LJIIL().LJIIIZ(new Callable<List<C19784112at>>(this) { // from class: X.12a5
                public final /* synthetic */ BinderC19779312a7 LLILZ;

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ List<C19784112at> call() throws Throwable {
                    C1C7U.LIZ("zzhx@3911.call");
                    this.LLILZ.LL.LJJJLIIL();
                    List<C19784112at> listLJJJJIZL = this.LLILZ.LL.LJJJJIZL().LJJJJIZL(str, str2, str3);
                    C1C7U.LIZIZ("zzhx@3911.call");
                    return listLJJJJIZL;
                }

                {
                    this.LLILZ = this;
                }
            }).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C19784112at c19784112at : list) {
                if (z || !C19803112dx.LJJLIL(c19784112at.LIZJ)) {
                    arrayList.add(new zzno(c19784112at));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Failed to get user properties as. appId", e);
            return Collections.emptyList();
        }
    }

    @Override // X.InterfaceC19802012dm
    public final void LLLZLZ(final long j, final String str, final String str2, final String str3) {
        x(new Runnable(this) { // from class: X.12ZU
            public final /* synthetic */ BinderC19779312a7 LLILZIL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzht@390d.run");
                try {
                    String str4 = str2;
                    if (str4 == null) {
                        C12Z4 c12z4 = this.LLILZIL.LL;
                        String str5 = str3;
                        c12z4.LJIIL().LJ();
                        String str6 = c12z4.LJJIIZI;
                        if (str6 == null || str6.equals(str5)) {
                            c12z4.LJJIIZI = str5;
                            c12z4.LJJIIZ = null;
                        }
                    } else {
                        C19811512fJ c19811512fJ = new C19811512fJ(str, str4, j);
                        C12Z4 c12z42 = this.LLILZIL.LL;
                        String str7 = str3;
                        c12z42.LJIIL().LJ();
                        String str8 = c12z42.LJJIIZI;
                        if (str8 != null) {
                            str8.equals(str7);
                        }
                        c12z42.LJJIIZI = str7;
                        c12z42.LJJIIZ = c19811512fJ;
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzht@390d.run");
            }

            {
                this.LLILZIL = this;
            }
        });
    }
}
