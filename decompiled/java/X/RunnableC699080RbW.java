package X;

import Y.ARunnableS111S0100000_11;
import Y.ARunnableS16S1100000_11;
import android.os.Looper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC699080RbW implements Runnable {
    public final /* synthetic */ C699060RbU LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    public RunnableC699080RbW(C699060RbU c699060RbU, Aweme aweme) {
        this.LL = c699060RbU;
        this.LLILLJJLI = aweme;
    }

    public final void LIZ() {
        Aweme aweme = this.LL.LLJILLL;
        if (aweme != null) {
            aweme.getAid();
        }
        new C699250Rbn(this.LL);
        C0T6L.LIZLLL();
        C699060RbU c699060RbU = this.LL;
        c699060RbU.LLJILJIL = 1;
        c699060RbU.LLJILLL = this.LLILLJJLI;
        Function0<String> function0 = c699060RbU.LLIZ;
        String strInvoke = function0 != null ? function0.invoke() : null;
        Aweme aweme2 = this.LL.LLJILLL;
        String aid = aweme2 != null ? aweme2.getAid() : null;
        C703900RjI c703900RjILIZ = C703870RjF.LIZ(strInvoke);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c703900RjILIZ.LIZIZ = aid;
            new AwS555S0100000_11(c703900RjILIZ, 1510);
            C0T6L.LIZLLL();
        } else {
            C786410Ut5.LJJZZIII(c703900RjILIZ.LIZ, new ARunnableS16S1100000_11(c703900RjILIZ, aid, 6));
        }
        Function0<String> function02 = this.LL.LLIZ;
        C703900RjI c703900RjILIZ2 = C703870RjF.LIZ(function02 != null ? function02.invoke() : null);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c703900RjILIZ2.LIZJ++;
            new AwS555S0100000_11(c703900RjILIZ2, 1508);
            C0T6L.LIZLLL();
            c703900RjILIZ2.LIZLLL(c703900RjILIZ2.LIZJ, true);
        } else {
            C786410Ut5.LJJZZIII(c703900RjILIZ2.LIZ, new ARunnableS111S0100000_11(c703900RjILIZ2, 134));
        }
        this.LL.LJJIJIIJI();
        C700410Rdf c700410Rdf = C700410Rdf.LIZ;
        Aweme aweme3 = this.LL.LLJILLL;
        c700410Rdf.getClass();
        C700410Rdf.LJ = aweme3;
        C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
        Aweme aweme4 = this.LL.LLJILLL;
        if (aweme4 != null) {
            AwemeExtKt.getGenreType(aweme4);
        }
        c698800Rb4.getClass();
        this.LL.LJJJJ();
        C699060RbU.LJJIJIIJIL(this.LL);
        C699060RbU c699060RbU2 = this.LL;
        if (c699060RbU2.LJJIIZI()) {
            for (C699090RbX<ComponentPriorityProtocol> c699090RbX : c699060RbU2.LJJII()) {
                if (!C13LP.LJJJJ(c699090RbX.LL.H3(), C698800Rb4.LJ)) {
                    c699060RbU2.LJJIII(c699090RbX, null);
                }
            }
            boolean z = (C699060RbU.LJJIIJZLJL(c699060RbU2.LJJI(), c699060RbU2.LLJJJJ) || ((Boolean) C0B8X.LIZ.getValue()).booleanValue()) ? false : true;
            if (!c699060RbU2.LJJI().isEmpty() && !z) {
                Iterator<C699090RbX<ComponentPriorityProtocol>> it2 = c699060RbU2.LJJI().iterator();
                while (it2.hasNext()) {
                    c699060RbU2.LJJIII(it2.next(), null);
                }
                ((ArrayList) c699060RbU2.LLJJJJ).clear();
                ((ArrayList) c699060RbU2.LLJJJJ).addAll(c699060RbU2.LJJI());
            }
        }
        if (C2770015k.LIZ()) {
            this.LL.LJJIJLIJ();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ComponentPriorityMaker@4add.fullTrigger$triggerAction$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ComponentPriorityMaker@4add.fullTrigger$triggerAction$1");
    }
}
