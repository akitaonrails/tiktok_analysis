package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06SD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C06SD extends C2217421BqW implements Function1<InterfaceC904740ZeS, Unit> {
    public C06SD(Object obj) {
        super(1, obj, IMReactionListSheet.class, "onMessageEvent", "onMessageEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/MessageEvent;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[PHI: r5
      0x0098: PHI (r5v7 X.0Y9l) = (r5v2 X.0Y9l), (r5v8 X.0Y9l) binds: [B:35:0x0082, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC904740ZeS r7) {
        /*
            r6 = this;
            X.0ZeS r7 = (X.InterfaceC904740ZeS) r7
            java.lang.Object r4 = r6.receiver
            com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet r4 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet) r4
            r4.getClass()
            boolean r0 = r7 instanceof X.C06SB
            r3 = 0
            if (r0 == 0) goto L2c
            X.06SB r7 = (X.C06SB) r7
            X.0Y9l r0 = r7.LIZIZ
            java.lang.String r1 = r0.getUuid()
            X.0Y9l r0 = r4.LLIZ
            if (r0 != 0) goto L1b
            r0 = r3
        L1b:
            java.lang.String r0 = r0.getUuid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L29
            X.0Y9l r5 = r7.LIZIZ
        L27:
            if (r5 != 0) goto L98
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            boolean r0 = r7 instanceof X.C06S8
            if (r0 == 0) goto L5d
            X.06S8 r7 = (X.C06S8) r7
            java.util.List<X.0Y9l> r0 = r7.LIZIZ
            java.util.Iterator r2 = r0.iterator()
        L38:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r5 = r2.next()
            r0 = r5
            X.0Y9l r0 = (X.C869590Y9l) r0
            java.lang.String r1 = r0.getUuid()
            X.0Y9l r0 = r4.LLIZ
            if (r0 != 0) goto L4e
            r0 = r3
        L4e:
            java.lang.String r0 = r0.getUuid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L38
        L58:
            X.0Y9l r5 = (X.C869590Y9l) r5
            goto L27
        L5b:
            r5 = r3
            goto L58
        L5d:
            boolean r0 = r7 instanceof X.C06SC
            if (r0 == 0) goto L29
            X.06SC r7 = (X.C06SC) r7
            X.0YA6 r0 = r7.LIZJ
            java.lang.String r1 = r0.getClientMessageId()
            X.0Y9l r0 = r4.LLIZ
            if (r0 != 0) goto L6e
            r0 = r3
        L6e:
            java.lang.String r0 = r0.getUuid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L29
            kotlin.jvm.functions.Function0<? extends X.0Y9l> r0 = r4.LLJILJILJ
            if (r0 == 0) goto L84
            java.lang.Object r5 = r0.invoke()
            X.0Y9l r5 = (X.C869590Y9l) r5
            if (r5 != 0) goto L98
        L84:
            X.0YNY r0 = X.InterfaceC874680YTa.LIZ
            X.0YTa r1 = X.C0YNY.LIZ(r0)
            X.0Y9l r0 = r4.LLIZ
            if (r0 != 0) goto L8f
            r0 = r3
        L8f:
            java.lang.String r0 = r0.getUuid()
            X.0Y9l r5 = r1.LIZLLL(r0)
            goto L27
        L98:
            boolean r0 = r4.isAdded()
            if (r0 == 0) goto L29
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            X.0YUx r1 = new X.0YUx
            r1.<init>(r4, r5, r3)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06SD.invoke(java.lang.Object):java.lang.Object");
    }
}
