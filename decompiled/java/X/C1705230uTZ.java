package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.image.brush.download.CommentResCheckFileData;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705230uTZ {
    public final ConcurrentHashMap<EnumC1705190uTV, C1705150uTR> LIZ;
    public final List<EnumC1705190uTV> LIZIZ;
    public final C01GW LIZJ;

    public final Map<EnumC1705190uTV, C1705150uTR> LIZ() {
        ConcurrentHashMap<EnumC1705190uTV, C1705150uTR> concurrentHashMap = this.LIZ;
        if (concurrentHashMap.isEmpty()) {
            return C2097608Jq.LJ();
        }
        ConcurrentHashMap<EnumC1705190uTV, C1705150uTR> concurrentHashMap2 = this.LIZ;
        if (!concurrentHashMap2.isEmpty() && concurrentHashMap2.size() == this.LIZIZ.size()) {
            if (concurrentHashMap2.isEmpty()) {
                return concurrentHashMap;
            }
            for (Map.Entry<EnumC1705190uTV, C1705150uTR> entry : concurrentHashMap2.entrySet()) {
                if (!LIZIZ(entry.getKey()) || !this.LIZIZ.contains(entry.getKey())) {
                }
            }
            return concurrentHashMap;
        }
        return C2097608Jq.LJ();
    }

    public C1705230uTZ() {
        Keva.getRepo("CommentMattingResFetcherImpl");
        this.LIZ = new ConcurrentHashMap<>();
        this.LIZIZ = C1697810uHb.LJIIJJI(EnumC1705190uTV.ERASER, EnumC1705190uTV.PAINTER);
        this.LIZJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS215S0000000_26.get$arr$(414));
    }

    public final boolean LIZIZ(EnumC1705190uTV enumC1705190uTV) {
        List list;
        C1705150uTR c1705150uTR = this.LIZ.get(enumC1705190uTV);
        if (c1705150uTR == null) {
            return false;
        }
        try {
            InterfaceC1705430uTt interfaceC1705430uTtLIZ = C1706380uVQ.LIZ();
            if (interfaceC1705430uTtLIZ == null || !interfaceC1705430uTtLIZ.LIZLLL().isEffectDownloaded(c1705150uTR.LIZ)) {
                return false;
            }
            C1705260uTc c1705260uTc = (C1705260uTc) this.LIZJ.getValue();
            ConcurrentHashMap<EnumC1705190uTV, C1705150uTR> concurrentHashMap = this.LIZ;
            c1705260uTc.getClass();
            C1705150uTR c1705150uTR2 = concurrentHashMap.get(enumC1705190uTV);
            if (c1705150uTR2 != null) {
                CommentResCheckFileData commentResCheckFileData = (CommentResCheckFileData) c1705260uTc.LIZ.getValue();
                commentResCheckFileData.getClass();
                int i = C1705200uTW.LIZ[enumC1705190uTV.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        list = C13BV.INSTANCE;
                    } else {
                        list = commentResCheckFileData.painter;
                    }
                } else {
                    list = commentResCheckFileData.eraser;
                }
                if (!list.isEmpty()) {
                    C0VSJ c0vsj = new C0VSJ(c1705150uTR2.LIZ.getUnzipPath());
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (!new C0VSJ(c0vsj, (String) it2.next()).exists()) {
                            concurrentHashMap.remove(enumC1705190uTV);
                            try {
                                C1706380uVQ.LIZ().LIZLLL().deleteEffect(c1705150uTR2.LIZ);
                                return false;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                return false;
                            }
                        }
                    }
                }
            }
            if (!DownloadableModelSupport.getInstance().isEffectReady(interfaceC1705430uTtLIZ.LIZLLL(), c1705150uTR.LIZ)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super java.util.Map<X.EnumC1705190uTV, X.C1705150uTR>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1705220uTY
            if (r0 == 0) goto L2a
            r5 = r7
            X.0uTY r5 = (X.C1705220uTY) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 == r0) goto L51
            if (r1 == r2) goto L51
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2a:
            X.0uTY r5 = new X.0uTY
            r5.<init>(r6, r7)
            goto L12
        L30:
            X.C155000ia.LIZIZ(r4)
            java.util.Map r1 = r6.LIZ()
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L40
            return r1
        L40:
            r5.LLILLL = r2
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0uTS r1 = new X.0uTS
            r0 = 0
            r1.<init>(r6, r0)
            java.lang.Object r0 = X.C23250099c.LJI(r5, r2, r1)
            if (r0 != r3) goto L54
            return r3
        L51:
            X.C155000ia.LIZIZ(r4)
        L54:
            java.util.concurrent.ConcurrentHashMap<X.0uTV, X.0uTR> r0 = r6.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1705230uTZ.LIZJ(X.05Vn):java.lang.Object");
    }
}
