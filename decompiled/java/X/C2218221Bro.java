package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.vad.VADService;
import com.ss.android.vesdk.VEInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS281S0000000_34;

/* JADX INFO: renamed from: X.1Bro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218221Bro {
    public boolean LIZ;
    public boolean LIZIZ;
    public Function1<? super byte[], Unit> LIZJ = AFwS281S0000000_34.get$arr$(22);
    public final int LIZLLL = 105600;
    public final List<byte[]> LJ = new ArrayList();
    public C0EZE LJFF;
    public final C2218211Brn LJI;
    public final /* synthetic */ VADService LJII;

    public final void LIZ() {
        C0EZE c0eze;
        if (this.LIZ || (c0eze = this.LJFF) == null || c0eze.LIZ || !c0eze.LIZIZ) {
            ((ArrayList) this.LJ).clear();
            this.LIZ = false;
            this.LIZIZ = false;
            this.LIZJ = AFwS281S0000000_34.get$arr$(23);
            C0EZE c0eze2 = this.LJFF;
            if (c0eze2 != null) {
                c0eze2.LIZLLL(C1462900oAi.LIZIZ);
            }
            C0EZE c0eze3 = this.LJFF;
            if (c0eze3 != null) {
                c0eze3.LIZJ.setRecorderListener(null);
            }
            C0EZE c0eze4 = this.LJFF;
            if (c0eze4 == null || c0eze4.LIZIZ) {
                return;
            }
            c0eze4.LIZIZ = true;
            c0eze4.LIZJ.destory();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1Brn] */
    public C2218221Bro(final VADService vADService) {
        this.LJII = vADService;
        this.LJI = new InterfaceC2218151Brh() { // from class: X.1Brn
            public int LIZ;

            @Override // X.InterfaceC2218151Brh
            public final void onError(int i, int i2, String str) {
            }

            @Override // X.InterfaceC2218151Brh
            public final void LIZ(int i, byte[] bArr) {
                C19974213Dg c19974213Dg;
                int i2 = this.LIZ;
                this.LIZ = i2 + 1;
                if (i2 % 100 == 0) {
                    C13E7 c13e7 = new C13E7(bArr);
                    if (bArr.length > 4) {
                        c19974213Dg = new C19974213Dg(c13e7, 0, 4);
                    } else {
                        c19974213Dg = new C19974213Dg(c13e7, 0, bArr.length - 1);
                    }
                    Objects.toString(c19974213Dg);
                }
                if (!this.LIZIZ.LIZIZ) {
                    return;
                }
                if (!vADService.LLJLILLLLZIIL) {
                    C2218221Bro c2218221Bro = this.LIZIZ;
                    int i3 = c2218221Bro.LIZLLL / i;
                    ((ArrayList) c2218221Bro.LJ).add(bArr);
                    while (((ArrayList) this.LIZIZ.LJ).size() > i3) {
                        ListProtector.remove(this.LIZIZ.LJ, 0);
                    }
                } else {
                    if (!((ArrayList) this.LIZIZ.LJ).isEmpty()) {
                        List listLJLJJLL = C13LP.LJLJJLL(this.LIZIZ.LJ);
                        C2218221Bro c2218221Bro2 = this.LIZIZ;
                        Iterator it2 = listLJLJJLL.iterator();
                        while (it2.hasNext()) {
                            c2218221Bro2.LIZJ.invoke(it2.next());
                        }
                        ((ArrayList) this.LIZIZ.LJ).clear();
                    }
                    this.LIZIZ.LIZJ.invoke(bArr);
                }
                vADService.LIZ(2, bArr);
            }

            @Override // X.InterfaceC2218151Brh
            public final void onInfo(int i, int i2, double d, Object obj) {
                if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
                    if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
                        this.LIZIZ.LIZIZ = true;
                    } else {
                        if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP) {
                            return;
                        }
                        this.LIZIZ.LIZIZ = false;
                    }
                }
            }
        };
    }
}
