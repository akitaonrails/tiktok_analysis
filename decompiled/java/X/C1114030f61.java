package X;

import android.content.Context;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0f61, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114030f61 {
    public final Context LIZ;
    public final TextView LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(593));
    public Pair<String, ? extends Map<EnumC1110950f13, C20743516Fd>> LIZLLL;

    public C1114030f61(Context context, SimpleLiveTextView simpleLiveTextView) {
        this.LIZ = context;
        this.LIZIZ = simpleLiveTextView;
    }

    public final C1114050f63 LIZ(SpannableStringBuilder spannableStringBuilder, C1114060f64 c1114060f64) {
        C1114050f63 c1114050f63 = new C1114050f63(this.LIZIZ.getContext(), c1114060f64, new AwS383S0200000_17(c1114060f64, this, 114));
        C1114040f62 c1114040f62 = c1114050f63.LLILZLL;
        int length = 0;
        int iLJJJJI = a0.LJJJJI(spannableStringBuilder, String.valueOf(c1114060f64.LJ), 0, 6);
        String str = c1114060f64.LJ;
        if (str != null) {
            length = str.length();
        }
        int i = length + iLJJJJI;
        C786410Ut5.q2(spannableStringBuilder, c1114040f62, iLJJJJI, i, 33);
        C786410Ut5.q2(spannableStringBuilder, c1114050f63, iLJJJJI, i, 33);
        return c1114050f63;
    }

    public final void LIZIZ(InterfaceC1114080f66 interfaceC1114080f66, C1113680f5S c1113680f5S) {
        Pair<String, ? extends Map<EnumC1110950f13, C20743516Fd>> pair;
        Map<EnumC1110950f13, C20743516Fd> second;
        SpannableString spannableString;
        String str = null;
        ((Handler) this.LIZJ.getValue()).removeCallbacksAndMessages(null);
        if (interfaceC1114080f66 == null) {
            CharSequence text = this.LIZIZ.getText();
            if ((text instanceof SpannableString) && (spannableString = (SpannableString) text) != null) {
                C089E c089e = new C089E(spannableString.getSpans(0, spannableString.length(), InterfaceC1114080f66.class));
                while (c089e.hasNext()) {
                    ((InterfaceC1114080f66) c089e.next()).LIZ(this.LIZIZ);
                }
                this.LIZLLL = null;
                return;
            }
            return;
        }
        interfaceC1114080f66.LIZ(this.LIZIZ);
        if (c1113680f5S != null) {
            PublicAreaMessageCommon.OperationState operationState = c1113680f5S.LIZ;
            if (operationState != null) {
                str = operationState.scene;
            }
            EnumC1110950f13 enumC1110950f13 = c1113680f5S.LIZIZ;
            if (str != null && (pair = this.LIZLLL) != null && (second = pair.getSecond()) != null) {
                second.remove(enumC1110950f13);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C1114050f63 r9, long r10, boolean r12, kotlin.jvm.functions.Function0<kotlin.Unit> r13) {
        /*
            r8 = this;
            X.0f64 r5 = r9.LLILLJJLI
            r6 = 0
            if (r12 == 0) goto L54
            long r1 = r5.LJIIJ
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L54
            r3 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L54
            r0 = 200(0xc8, double:9.9E-322)
        L14:
            r5.LJIIIZ = r0
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r4 = 1
            r2 = 0
            r0 = 2
            if (r1 != 0) goto L57
            android.widget.TextView r3 = r8.LIZIZ
            float r1 = X.C13LZ.LIZLLL(r5, r5, r6)
            r9.LLILZ = r1
            float[] r0 = new float[r0]
            r0[r2] = r1
            r0[r4] = r6
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            X.0f64 r0 = r9.LLILLJJLI
            long r0 = r0.LJIIIZ
            r2.setDuration(r0)
            Y.AUListenerS224S0200000_17 r1 = new Y.AUListenerS224S0200000_17
            r0 = 13
            r1.<init>(r9, r3, r0)
            r2.addUpdateListener(r1)
            Y.AAListenerS328S0100000_17 r1 = new Y.AAListenerS328S0100000_17
            r0 = 14
            r1.<init>(r13, r0)
            r2.addListener(r1)
            r2.start()
            r3.requestLayout()
            return
        L54:
            r0 = 0
            goto L14
        L57:
            android.widget.TextView r3 = r8.LIZIZ
            float r1 = X.C13LZ.LIZLLL(r6, r5, r6)
            r9.LLILZ = r1
            float[] r0 = new float[r0]
            r0[r2] = r1
            r0[r4] = r5
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            X.0f64 r0 = r9.LLILLJJLI
            long r0 = r0.LJIIIZ
            r2.setDuration(r0)
            Y.AUListenerS224S0200000_17 r1 = new Y.AUListenerS224S0200000_17
            r0 = 14
            r1.<init>(r9, r3, r0)
            r2.addUpdateListener(r1)
            Y.AAListenerS328S0100000_17 r1 = new Y.AAListenerS328S0100000_17
            r0 = 15
            r1.<init>(r13, r0)
            r2.addListener(r1)
            r2.start()
            r3.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1114030f61.LIZLLL(X.0f63, long, boolean, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(final X.C1114030f61 r32, android.content.Context r33, X.AbstractC1110800f0o r34, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.OperationState r35, X.EnumC1110950f13 r36, boolean r37, boolean r38, kotlin.jvm.internal.AwS172S0400000_17 r39, int r40) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1114030f61.LIZJ(X.0f61, android.content.Context, X.0f0o, com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$OperationState, X.0f13, boolean, boolean, kotlin.jvm.internal.AwS172S0400000_17, int):void");
    }
}
