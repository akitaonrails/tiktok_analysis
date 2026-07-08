package X;

import Y.ARunnableS119S0100000_19;
import Y.ARunnableS63S0300000_30;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20023213Wc extends AbstractC20023613Wg implements InterfaceC20023413We {
    public CompletionBlock<InterfaceC20023513Wf> LLILLL;
    public Fragment LLILZ;
    public Context LLILZIL;
    public final AtomicBoolean LLILZLL = new AtomicBoolean(false);

    public static String LJII(File file) {
        Object canonicalPath;
        Object obj = null;
        if (file == null) {
            canonicalPath = null;
        } else {
            try {
                canonicalPath = file.getCanonicalPath();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canonicalPath = new C098200Yq(th);
                C189200o6.m2constructorimpl(canonicalPath);
            }
        }
        C189200o6.m2constructorimpl(canonicalPath);
        if (!C189200o6.m7isFailureimpl(canonicalPath)) {
            obj = canonicalPath;
        }
        return (String) obj;
    }

    public final void LJ(String str) {
        if (!this.LLILZLL.compareAndSet(false, true)) {
            return;
        }
        CompletionBlock<InterfaceC20023513Wf> completionBlock = this.LLILLL;
        if (completionBlock != null) {
            C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
        }
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public static void LIZJ(Context context, File file) {
        Object obj;
        String strLJII = LJII(new C0VSJ(C786410Ut5.w2(context), "open_file_selector"));
        if (strLJII == null) {
            return;
        }
        String strLJII2 = LJII(file);
        try {
            Set setKeySet = C771340UNo.LJ("response").keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : setKeySet) {
                String strLJII3 = LJII(new C0VSJ((String) obj2));
                if (strLJII3 != null && !Intrinsics.LJFF(strLJII3, strLJII2)) {
                    if (!Intrinsics.LJFF(strLJII3, strLJII)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLJII);
                        sbLIZ.append(File.separator);
                        if (u.LJJIIJZLJL(strLJII3, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        }
                    }
                    arrayList.add(obj2);
                }
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        C13BV c13bv = C13BV.INSTANCE;
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj3 = obj;
        if (zM7isFailureimpl) {
            obj3 = c13bv;
        }
        for (String str : (List) obj3) {
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(C08QA.LJIIZILJ(new C0VSJ(str))));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            try {
                C771340UNo.LIZIZ("response", str);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C189200o6.m2constructorimpl(new C098200Yq(th3));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x005c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static kotlin.Pair LJFF(android.content.Context r8, android.net.Uri r9) {
        /*
            r4 = 0
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch: java.lang.Exception -> L69
            X.0WZX r8 = new X.0WZX     // Catch: java.lang.Exception -> L69
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSAUv4UmvRvfF6qbZrPV/QrE8H7TrGJR7dkZ0p4rlBzpsvnlA4w4IOuXAkLBLoo"
            r8.<init>(r0, r4)     // Catch: java.lang.Exception -> L69
            r3 = r9
            r5 = r4
            r6 = r4
            r7 = r4
            android.database.Cursor r3 = X.C2204961BRm.LJJJ(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L69
            if (r3 == 0) goto L67
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L4c
            java.lang.String r0 = "_display_name"
            int r1 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L52
            if (r1 < 0) goto L2f
            boolean r0 = r3.isNull(r1)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L2f
            java.lang.String r2 = r3.getString(r1)     // Catch: java.lang.Throwable -> L52
            goto L30
        L2f:
            r2 = r4
        L30:
            java.lang.String r0 = "_size"
            int r1 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L49
            if (r1 < 0) goto L47
            boolean r0 = r3.isNull(r1)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L47
            long r0 = r3.getLong(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L49
            goto L4e
        L47:
            r1 = r4
            goto L4e
        L49:
            r1 = move-exception
            r5 = r4
            goto L55
        L4c:
            r2 = r4
            r1 = r4
        L4e:
            X.C2107108Nh.LIZ(r3, r4)     // Catch: java.lang.Exception -> L6c
            goto L72
        L52:
            r1 = move-exception
            r2 = r4
            r5 = r4
        L55:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L5c
            throw r1     // Catch: java.lang.Throwable -> L59
        L59:
            r0 = move-exception
            r4 = r1
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5c
            X.C2107108Nh.LIZ(r3, r4)     // Catch: java.lang.Exception -> L64
            throw r0     // Catch: java.lang.Exception -> L64
        L64:
            r0 = move-exception
            r4 = r5
            goto L6e
        L67:
            r1 = r4
            goto L73
        L69:
            r0 = move-exception
            r2 = r4
            goto L6e
        L6c:
            r0 = move-exception
            r4 = r1
        L6e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r4
        L72:
            r4 = r2
        L73:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20023213Wc.LJFF(android.content.Context, android.net.Uri):kotlin.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0VSJ LIZLLL(android.net.Uri r8, java.lang.String r9, android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20023213Wc.LIZLLL(android.net.Uri, java.lang.String, android.content.Context):X.0VSJ");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        this.LLILLL = completionBlock;
        AwS431S0200000_30 awS431S0200000_30 = new AwS431S0200000_30(this, (InterfaceC20023713Wh) xBaseParamModel, 31);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            awS431S0200000_30.invoke();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS119S0100000_19((Object) awS431S0200000_30, 130));
        }
    }

    @Override // X.InterfaceC20023413We
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        if (i != 40104) {
            return;
        }
        if (i2 == -1 && intent != null && (data = intent.getData()) != null) {
            Context context = this.LLILZIL;
            if (context == null) {
                LJ("no host activity available");
                return;
            } else {
                new BPEAThread(new ARunnableS63S0300000_30(this, context, data, 6)).start();
                return;
            }
        }
        LJ("user cancelled");
    }
}
