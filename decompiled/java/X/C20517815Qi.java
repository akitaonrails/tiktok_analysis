package X;

import Y.ARunnableS64S0300000_31;
import android.graphics.Bitmap;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS275S0300000_31;

/* JADX INFO: renamed from: X.15Qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20517815Qi {
    public static final C01GW<C603820NmG<String, Integer>> LIZLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(516));
    public static final C01GW<C603820NmG<String, Bitmap>> LJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(515));
    public C20517115Qb LIZ;
    public boolean LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZ() {
        C20517115Qb c20517115Qb = this.LIZ;
        if (c20517115Qb != null && !c20517115Qb.LIZIZ.getAndSet(true)) {
            c20517115Qb.LIZJ.removeCallbacksAndMessages(null);
            InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = c20517115Qb.LIZLLL;
            if (interfaceC1320200kSY != null) {
                interfaceC1320200kSY.close();
            }
            c20517115Qb.LIZLLL = null;
        }
        this.LIZ = null;
        if (this.LIZIZ) {
            this.LIZJ.removeCallbacksAndMessages(null);
        }
        this.LIZIZ = false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.15Qj, java.lang.Object] */
    public final void LIZIZ(final Aweme aweme, final Function1<? super Integer, Unit> function1) {
        String aid;
        Integer numLIZJ;
        LIZ();
        if (aweme != null && (aid = aweme.getAid()) != null && (numLIZJ = LIZLLL.getValue().LIZJ(aid)) != null) {
            function1.invoke(numLIZJ);
            return;
        }
        this.LIZIZ = true;
        C20517115Qb c20517115Qb = new C20517115Qb();
        this.LIZ = c20517115Qb;
        ?? r3 = new InterfaceC20517315Qd() { // from class: X.15Qj
            @Override // X.InterfaceC20517315Qd
            public final void onFail() {
                this.LIZ.LIZIZ = false;
            }

            @Override // X.InterfaceC20517315Qd
            public final void LIZ(int i) {
                this.LIZ.LIZIZ = false;
                String aid2 = aweme.getAid();
                if (aid2 != null) {
                    C20517815Qi.LIZLLL.getValue().LIZLLL(aid2, Integer.valueOf(i));
                }
                Function1<Integer, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Integer.valueOf(i));
                }
            }
        };
        if (!c20517115Qb.LIZ && !c20517115Qb.LIZIZ.get()) {
            c20517115Qb.LIZ = true;
            new RunnableC823120WQs((Runnable) new ARunnableS64S0300000_31(new AwS275S0300000_31(aweme, c20517115Qb, (C20517915Qj) r3, 42), r3, c20517115Qb, 13)).LIZ();
        }
    }
}
