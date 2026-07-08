package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: X.1BAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200461BAe extends BroadcastReceiver {
    public boolean LIZ;
    public final boolean LIZIZ;
    public final /* synthetic */ C2200591BAr LIZJ;

    /* JADX WARN: Can't wrap try/catch for region: R(8:39|(2:150|40)|(3:42|52|(5:54|55|144|56|59)(1:50))(1:47)|51|55|144|56|59) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ef, code lost:
    
        r1 = new java.lang.StringBuilder("Bundle: ");
        r5 = r9.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab A[Catch: all -> 0x02ca, TryCatch #4 {all -> 0x02ca, blocks: (B:117:0x0275, B:119:0x02ab, B:120:0x02ad, B:121:0x02b1), top: B:140:0x0275, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b1 A[Catch: all -> 0x02ca, TRY_LEAVE, TryCatch #4 {all -> 0x02ca, blocks: (B:117:0x0275, B:119:0x02ab, B:120:0x02ad, B:121:0x02b1), top: B:140:0x0275, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0245 A[EDGE_INSN: B:156:0x0245->B:116:0x0245 BREAK  A[LOOP:1: B:97:0x01dc->B:158:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e2 A[Catch: all -> 0x02d3, TryCatch #1 {all -> 0x02d3, blocks: (B:88:0x01a6, B:91:0x01b0, B:95:0x01ba, B:96:0x01ca, B:97:0x01dc, B:99:0x01e2, B:101:0x01ef, B:102:0x01fe, B:104:0x0204, B:105:0x0212, B:111:0x0221, B:107:0x0218, B:109:0x021d, B:112:0x022a, B:114:0x0236, B:115:0x023b, B:116:0x0245, B:123:0x02cb, B:124:0x02cf, B:117:0x0275, B:119:0x02ab, B:120:0x02ad, B:121:0x02b1), top: B:137:0x01a6, inners: #4, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Intent r17) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2200461BAe.LIZ(android.content.Intent):void");
    }

    public final synchronized void LIZJ(Context context) {
        if (this.LIZ) {
            C786410Ut5.LJJIFFI(context, this);
            this.LIZ = false;
        }
    }

    public C2200461BAe(C2200591BAr c2200591BAr, boolean z) {
        Objects.requireNonNull(c2200591BAr);
        this.LIZJ = c2200591BAr;
        this.LIZIZ = z;
    }

    public final synchronized void LIZIZ(Context context, IntentFilter intentFilter) {
        int i;
        if (this.LIZ) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (true != this.LIZIZ) {
                i = 4;
            } else {
                i = 2;
            }
            C786410Ut5.LJIJJLI(context, this, intentFilter, i);
        } else {
            C786410Ut5.LJIJJ(context, this, intentFilter);
        }
        this.LIZ = true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZ(intent);
        }
    }

    public final void LIZLLL(Bundle bundle, C19885612rG c19885612rG, int i, EnumC2200651BAx enumC2200651BAx, long j, boolean z) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                ((C2200551BAn) this.LIZJ.LIZJ).LIZLLL(C2200661BAy.LJJIFFI(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((C2200551BAn) this.LIZJ.LIZJ).LIZLLL(C2200521BAk.LIZIZ(C1BAX.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i, c19885612rG, null, enumC2200651BAx), j, z);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
