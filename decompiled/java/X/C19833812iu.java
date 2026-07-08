package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: X.12iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19833812iu implements InterfaceC19834212iy {
    public static C19833812iu LIZJ;
    public final Context LIZ;
    public final C19833912iv LIZIZ;

    public static synchronized void LIZ() {
        Context context;
        C19833812iu c19833812iu = LIZJ;
        if (c19833812iu != null && (context = c19833812iu.LIZ) != null && c19833812iu.LIZIZ != null) {
            context.getContentResolver().unregisterContentObserver(LIZJ.LIZIZ);
        }
        LIZJ = null;
    }

    public C19833812iu() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.12iv, android.database.ContentObserver] */
    public C19833812iu(Context context) {
        this.LIZ = context;
        ?? r3 = new ContentObserver() { // from class: X.12iv
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                AbstractC19833712it.LJIIIZ.incrementAndGet();
            }
        };
        this.LIZIZ = r3;
        context.getContentResolver().registerContentObserver(C19823412hE.LIZ, true, r3);
    }

    @Override // X.InterfaceC19834212iy
    public final Object LJIIIIZZ(final String str) {
        boolean z;
        Context context = this.LIZ;
        if (context != null) {
            if (C0W4A.LIZ() && !C0W4A.LIZIZ(context)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    return C836540Wrk.LIZ(new InterfaceC836550Wrl() { // from class: X.12jC
                        /* JADX WARN: Type inference failed for: r0v29, types: [X.12jB] */
                        @Override // X.InterfaceC836550Wrl
                        public final Object zza() throws Throwable {
                            int i;
                            Object obj;
                            C19833812iu c19833812iu = this.LIZ;
                            String str2 = str;
                            ContentResolver contentResolver = c19833812iu.LIZ.getContentResolver();
                            final C19835712jD c19835712jD = (C19835712jD) C19835912jF.LIZ;
                            if (contentResolver == null) {
                                c19835712jD.getClass();
                                throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
                            }
                            synchronized (c19835712jD) {
                                try {
                                    if (c19835712jD.LIZIZ == null) {
                                        c19835712jD.LIZ.set(false);
                                        c19835712jD.LIZIZ = new HashMap<>(16, 1.0f);
                                        c19835712jD.LJI = new Object();
                                        contentResolver.registerContentObserver(C19823412hE.LIZ, true, new ContentObserver() { // from class: X.12jE
                                            {
                                                super(null);
                                            }

                                            @Override // android.database.ContentObserver
                                            public final void onChange(boolean z2) {
                                                c19835712jD.LIZ.set(true);
                                            }
                                        });
                                    } else if (c19835712jD.LIZ.getAndSet(false)) {
                                        c19835712jD.LIZIZ.clear();
                                        c19835712jD.LIZJ.clear();
                                        c19835712jD.LIZLLL.clear();
                                        c19835712jD.LJ.clear();
                                        c19835712jD.LJFF.clear();
                                        c19835712jD.LJI = new Object();
                                        c19835712jD.LJII = false;
                                    }
                                    obj = c19835712jD.LJI;
                                } catch (C19836112jH e) {
                                } finally {
                                }
                                if (c19835712jD.LIZIZ.containsKey(str2)) {
                                    String str3 = c19835712jD.LIZIZ.get(str2);
                                    return str3 != null ? str3 : null;
                                }
                                for (String str4 : c19835712jD.LJIIIIZZ) {
                                    if (str2.startsWith(str4)) {
                                        if (!c19835712jD.LJII) {
                                            HashMap<String, String> map = (HashMap) C19835412jA.LIZIZ(contentResolver, c19835712jD.LJIIIIZZ, new Object() { // from class: X.12jB
                                            });
                                            if (!map.isEmpty()) {
                                                Set<String> setKeySet = map.keySet();
                                                setKeySet.removeAll(c19835712jD.LIZJ.keySet());
                                                setKeySet.removeAll(c19835712jD.LIZLLL.keySet());
                                                setKeySet.removeAll(c19835712jD.LJ.keySet());
                                                setKeySet.removeAll(c19835712jD.LJFF.keySet());
                                            }
                                            if (!map.isEmpty()) {
                                                if (c19835712jD.LIZIZ.isEmpty()) {
                                                    c19835712jD.LIZIZ = map;
                                                } else {
                                                    c19835712jD.LIZIZ.putAll(map);
                                                }
                                            }
                                            c19835712jD.LJII = true;
                                            if (c19835712jD.LIZIZ.containsKey(str2)) {
                                                String str5 = c19835712jD.LIZIZ.get(str2);
                                                return str5 != null ? str5 : null;
                                            }
                                        }
                                        return null;
                                    }
                                }
                                try {
                                    String strLIZ = C19835412jA.LIZ(contentResolver, str2);
                                    if (strLIZ != null && strLIZ.equals(null)) {
                                        strLIZ = null;
                                    }
                                    synchronized (c19835712jD) {
                                        try {
                                            if (obj == c19835712jD.LJI) {
                                                c19835712jD.LIZIZ.put(str2, strLIZ);
                                            }
                                        } finally {
                                        }
                                    }
                                    if (strLIZ != null) {
                                        return strLIZ;
                                    }
                                    return null;
                                } catch (C19836112jH e2) {
                                    return null;
                                }
                            }
                        }
                    });
                } catch (IllegalStateException | NullPointerException | SecurityException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
