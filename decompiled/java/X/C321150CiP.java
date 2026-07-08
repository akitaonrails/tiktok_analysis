package X;

import Y.ARunnableS104S0100000_4;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageChunkResult;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0CiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321150CiP {
    public final InterfaceC497601wk LIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public BPEAHandler LJ;
    public int LJFF;
    public final List<C321170CiR> LIZIZ = new ArrayList();
    public final EnumC321290Cid LJI = EnumC321290Cid.FIXED;
    public final long LJII = 50;
    public int LJIIIIZZ = -1;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 3));
    public final Gson LJIIJ = C321270Cib.LIZ();
    public final Type LJIIJJI = new TypeToken<CommerceAgentMixFeed>() { // from class: X.0CiU
    }.getType();

    public final void LIZ() {
        this.LIZLLL = null;
        this.LIZJ = false;
        ((ArrayList) this.LIZIZ).clear();
    }

    public final void LIZIZ() {
        ((ArrayList) this.LIZIZ).clear();
        this.LJFF = 0;
        LIZ();
        C05KQ c05kq = (C05KQ) this.LJIIIZ.getValue();
        AnonymousClass0956 anonymousClass0956 = c05kq.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c05kq.LIZLLL = null;
    }

    public final void LJ() {
        if (this.LJFF >= ((ArrayList) this.LIZIZ).size()) {
            LIZIZ();
            return;
        }
        C321170CiR c321170CiR = (C321170CiR) ListProtector.get(this.LIZIZ, this.LJFF);
        int i = c321170CiR.LIZ.event;
        if (i != 4 && i == 5) {
            LJFF(c321170CiR);
            LIZIZ();
            return;
        }
        LJFF(c321170CiR);
        int i2 = this.LJFF + 1;
        this.LJFF = i2;
        if (i2 >= ((ArrayList) this.LIZIZ).size()) {
            LIZIZ();
            return;
        }
        BPEAHandler bPEAHandler = this.LJ;
        if (bPEAHandler != null) {
            C786410Ut5.LJLIIL(this.LJII, bPEAHandler, new ARunnableS104S0100000_4(this, 0));
        }
    }

    public C321150CiP(C054G c054g) {
        this.LIZ = c054g;
    }

    public final void LIZLLL(C321170CiR c321170CiR) {
        if (this.LJIIIIZZ == -1) {
            this.LJIIIIZZ = c321170CiR.LIZJ - 1;
        }
        this.LJIIIIZZ = c321170CiR.LIZJ;
        c321170CiR.LIZIZ.invoke();
    }

    public final void LJFF(C321170CiR c321170CiR) {
        int i;
        C321170CiR c321170CiR2 = (C321170CiR) C13LP.LJJLIIIJL(this.LIZIZ);
        if (c321170CiR2 != null) {
            i = c321170CiR2.LIZJ;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (c321170CiR.LIZJ > i) {
            Iterator<C321170CiR> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                LIZLLL(it2.next());
            }
            ((ArrayList) this.LIZIZ).clear();
            return;
        }
        LIZLLL(c321170CiR);
    }

    public final void LIZJ(MessageChunkResult messageChunkResult, Message message, Function0<Unit> function0) {
        boolean z;
        String str;
        if (!C320920Ci2.LIZ().typewriterEnabled) {
            function0.invoke();
            return;
        }
        System.currentTimeMillis();
        int i = messageChunkResult.chunkIndex;
        int i2 = messageChunkResult.event;
        if (i2 > 4) {
            z = true;
        } else {
            z = false;
        }
        C321170CiR c321170CiR = new C321170CiR(messageChunkResult, function0, i, z);
        if (i2 > 4) {
            if (message != null) {
                str = message.uuid;
            } else {
                str = null;
            }
            C321220CiW c321220CiWLIZ = C321740CjM.LIZ(str);
            if (c321220CiWLIZ != null) {
                C321220CiW c321220CiWLIZ2 = C321220CiW.LIZ(c321220CiWLIZ, false, true, 0, 0, 27);
                if (str != null) {
                    C321740CjM.LIZ.LIZLLL(str, c321220CiWLIZ2);
                }
            }
        }
        if (this.LIZJ) {
            ((ArrayList) this.LIZIZ).add(c321170CiR);
        } else {
            LIZLLL(c321170CiR);
            LIZ();
        }
    }
}
