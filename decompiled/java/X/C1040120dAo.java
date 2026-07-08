package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS100S1200000_16;

/* JADX INFO: renamed from: X.0dAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040120dAo {
    public final ConcurrentHashMap<Long, C1039830dAL> LIZ = new ConcurrentHashMap<>();

    public final synchronized void LIZ() {
        if (this.LIZ.size() > 10) {
            Set<Map.Entry<Long, C1039830dAL>> setEntrySet = this.LIZ.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((C1039830dAL) ((Map.Entry) obj).getValue()).LJ) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = C13LP.LL(arrayList, this.LIZ.size() - 10).iterator();
            while (it2.hasNext()) {
                this.LIZ.remove(((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public final synchronized void LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Collection<C1039830dAL> collectionValues = this.LIZ.values();
        ArrayList<C1039830dAL> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            C1039830dAL c1039830dAL = (C1039830dAL) obj;
            if (!c1039830dAL.LJ && jCurrentTimeMillis - c1039830dAL.LJFF > Mp4ScreenVideoLoadTimeout.CONTROL) {
                arrayList.add(obj);
            }
        }
        for (C1039830dAL c1039830dAL2 : arrayList) {
            c1039830dAL2.LJ = true;
            c1039830dAL2.LIZIZ = false;
            c1039830dAL2.LIZJ = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String LIZJ(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.0dAL> r1 = r2.LIZ     // Catch: java.lang.Throwable -> L17
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L17
            X.0dAL r0 = (X.C1039830dAL) r0     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L15
        L13:
            java.lang.String r0 = ""
        L15:
            monitor-exit(r2)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1040120dAo.LIZJ(long):java.lang.String");
    }

    public final synchronized void LIZLLL(long j) {
        C1039830dAL c1039830dAL = this.LIZ.get(Long.valueOf(j));
        if (c1039830dAL != null) {
            c1039830dAL.LJ = true;
            c1039830dAL.LIZIZ = false;
            c1039830dAL.LIZJ = false;
        }
    }

    public final synchronized void LJ(long j) {
        C1039830dAL c1039830dAL = this.LIZ.get(Long.valueOf(j));
        if (c1039830dAL != null) {
            c1039830dAL.LIZJ = false;
        }
    }

    public final synchronized void LJFF(long j) {
        C1039830dAL c1039830dAL = this.LIZ.get(Long.valueOf(j));
        if (c1039830dAL != null) {
            c1039830dAL.LIZIZ = false;
            c1039830dAL.LIZJ = true;
        }
    }

    public final void LJI(C1039830dAL c1039830dAL) {
        String str;
        AwemeRawAd awemeRawAd = c1039830dAL.LIZ.get();
        if (awemeRawAd == null) {
            return;
        }
        if (c1039830dAL.LIZIZ) {
            if (c1039830dAL.LIZJ) {
                str = "data_load,js_inject";
            } else {
                str = "data_load";
            }
        } else if (!c1039830dAL.LIZJ) {
            return;
        } else {
            str = "js_inject";
        }
        final Object[] objArr = new Object[0];
        new AbstractC1023470cjx(objArr) { // from class: X.0dAt
            public final C1023630ckD<?>[] LIZ;

            @Override // X.AbstractC1023380cjo, X.C1023640ckE
            public final C1023630ckD<?>[] getInternalLogics() {
                return this.LIZ;
            }

            {
                super(Arrays.copyOf(objArr, objArr.length));
                C1040160dAs.LIZ.getClass();
                this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1040160dAs.LIZIZ, AFwS252S0000000_16.get$arr$(721)), new C1023630ckD<>(C1040160dAs.LIZJ, AFwS252S0000000_16.get$arr$(722)), new C1023630ckD<>(C1040160dAs.LIZLLL, AFwS252S0000000_16.get$arr$(723))};
            }
        }.logAd(C1040150dAr.LIZ, awemeRawAd, new AwS100S1200000_16(c1039830dAL, str, this, 12));
    }
}
