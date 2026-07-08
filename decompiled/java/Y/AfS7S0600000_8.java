package Y;

import X.C094D;
import X.C09JN;
import X.C0MKE;
import X.C0MKH;
import X.C0MM5;
import X.C0MMG;
import X.C0MMK;
import X.C0MOA;
import X.C0MOZ;
import X.C0MUO;
import X.C1C7U;
import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.util.Collections;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public class AfS7S0600000_8 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS7S0600000_8 afS7S0600000_8, Object obj) {
        C1C7U.LIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColor$1$1");
        C0MOZ c0moz = (C0MOZ) obj;
        C0MM5.LJIIIIZZ(C0MM5.LIZ, (C094D) afS7S0600000_8.l5, new C0MKE((CreativeInfo) afS7S0600000_8.l0, (ForwardMedia) afS7S0600000_8.l1, (C0MMK) afS7S0600000_8.l2, C0MMG.LIZ((C0MMG) afS7S0600000_8.l3, C0MOA.LIZLLL(c0moz, Collections.singletonList(c0moz.LIZ)).background, null, 13), null, C0MUO.LIZ((Context) afS7S0600000_8.l4), ((ForwardMedia) afS7S0600000_8.l1).originVideoAIGCLabelType, 0, 3, 128));
        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColor$1$1");
    }

    public static final void accept$1(AfS7S0600000_8 afS7S0600000_8, Object obj) {
        C1C7U.LIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColorV2$1$1");
        C0MOZ c0moz = (C0MOZ) obj;
        CanvasVideoData canvasVideoDataLIZLLL = C0MOA.LIZLLL(c0moz, Collections.singletonList(c0moz.LIZ));
        Pair pairLIZ = C0MUO.LIZ((Context) afS7S0600000_8.l0);
        C0MMG c0mmgLIZ = C0MMG.LIZ((C0MMG) afS7S0600000_8.l1, canvasVideoDataLIZLLL.background, null, 13);
        CreativeInfo creativeInfo = (CreativeInfo) afS7S0600000_8.l2;
        ForwardMedia forwardMedia = (ForwardMedia) afS7S0600000_8.l3;
        C0MM5.LJIIIIZZ(C0MM5.LIZ, (C094D) afS7S0600000_8.l5, new C0MKH(creativeInfo, forwardMedia, (C0MMK) afS7S0600000_8.l4, c0mmgLIZ, pairLIZ, forwardMedia.originVideoAIGCLabelType));
        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColorV2$1$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS7S0600000_8(android.content.Context r2, com.ss.android.ugc.aweme.creative.model.CreativeInfo r3, X.C0MMK r4, com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r5, X.C0MMG r6, X.C094D r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            if (r8 == 0) goto L15
            r0 = r1
            r0.l0 = r2
            r0.l1 = r6
            r0.l2 = r3
            r0.l3 = r5
            r0.l4 = r4
            r0.l5 = r7
        L11:
            r0.<init>()
            return
        L15:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r5
            r0.l2 = r4
            r0.l3 = r6
            r0.l4 = r2
            r0.l5 = r7
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS7S0600000_8.<init>(android.content.Context, com.ss.android.ugc.aweme.creative.model.CreativeInfo, X.0MMK, com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia, X.0MMG, X.094D, int):void");
    }
}
