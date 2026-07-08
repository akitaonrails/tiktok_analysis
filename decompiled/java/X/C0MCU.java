package X;

import Y.AfS177S0100000_8;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MCU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MCU extends AbstractC2255721DQs<C0MC7> implements C0MC7, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final HashMap<String, C11PQ<String>> LLILLL = new HashMap<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MCU.class, "publishModel", "getPublishModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = 8;
    }

    public C0MC7 W1() {
        return this;
    }

    private final VideoPublishEditModel Z1() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILLL.clear();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0MCU(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final String X1(AbstractC1921407fo abstractC1921407fo) {
        if (abstractC1921407fo instanceof C2266008uI) {
            return ((C2266008uI) abstractC1921407fo).LIZ;
        }
        if (abstractC1921407fo instanceof C1921307fn) {
            return (String) C13LP.LJJJLL(((C1921307fn) abstractC1921407fo).LIZ);
        }
        return null;
    }

    private final C11PQ<String> o2(C11NZ<String> c11nz) {
        C11PQ<String> c11pq = new C11PQ<>();
        c11nz.getClass();
        new C19475111Hh(c11nz).LJJIIZ(new AfS177S0100000_8(c11pq, 30), new AfS177S0100000_8(c11pq, 31));
        return c11pq;
    }

    @Override // X.C0MC7
    public void Kd(String str) {
        String strX1;
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uploadImage ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c0l76, "AILiveUploadImageComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (str.length() == 0) {
            return;
        }
        C1458410o3T.LIZ.getClass();
        AbstractC2289508y5 abstractC2289508y5 = C1458410o3T.LJ;
        C11PQ<String> c11pqO2 = null;
        if (abstractC2289508y5 != null) {
            AbstractC1921407fo abstractC1921407fo = abstractC2289508y5.LIZ;
            if (abstractC1921407fo != null) {
                strX1 = X1(abstractC1921407fo);
            } else {
                strX1 = null;
                if (abstractC2289508y5 != null) {
                }
            }
            if (Intrinsics.LJFF(str, strX1)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("existing task ");
                sbLIZ2.append(abstractC2289508y5);
                C201955140j.LIZLLL(c0l76, "AILiveUploadImageComponent", C2188811AlT.LIZIZ(sbLIZ2));
                this.LLILLL.put(str, o2(abstractC2289508y5.LJIILJJIL()));
                return;
            }
        }
        C573450MeN c573450MeN = new C573450MeN(Collections.singletonList(str));
        C573430MeL c573430MeL = C573430MeL.LIZ;
        VideoPublishEditModel videoPublishEditModelZ1 = Z1();
        Boolean bool = Boolean.FALSE;
        c573430MeL.getClass();
        c573450MeN.LIZ = C573430MeL.LIZ(videoPublishEditModelZ1, bool);
        C11NZ<String> c11nzLIZJ = C1457440o1u.LIZJ(c573450MeN, true, null, 4);
        if (c11nzLIZJ != null) {
            c11pqO2 = o2(c11nzLIZJ);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("new task ");
        sbLIZ3.append(c11pqO2);
        C201955140j.LIZLLL(c0l76, "AILiveUploadImageComponent", C2188811AlT.LIZIZ(sbLIZ3));
        if (c11pqO2 != null) {
            this.LLILLL.put(str, c11pqO2);
        }
    }

    @Override // X.C0MC7
    public AbstractC19484711Kz<String> qP2(final String str) {
        C11PQ<String> c11pq = this.LLILLL.get(str);
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getImageTos: existing task ");
        sbLIZ.append(c11pq);
        C201955140j.LIZLLL(c0l76, "AILiveUploadImageComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (c11pq == null) {
            Kd(str);
            c11pq = this.LLILLL.get(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getImageTos: build new task ");
            sbLIZ2.append(c11pq);
            C201955140j.LIZLLL(c0l76, "AILiveUploadImageComponent", C2188811AlT.LIZIZ(sbLIZ2));
            if (c11pq == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("failed to build upload frame task: ");
                sbLIZ3.append(str);
                return AbstractC19484711Kz.LJIILLIIL(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3)));
            }
        }
        return new C19475111Hh(c11pq).LJIILL(new C09JN() { // from class: X.0MC6
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AILiveUploadImageComponent@fffe.getImageTos$1");
                C0L76 c0l762 = C0L76.LIZIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("getImageTos done: path=");
                sbLIZ4.append(str);
                sbLIZ4.append(", tos=");
                sbLIZ4.append((String) obj);
                C201955140j.LIZLLL(c0l762, "AILiveUploadImageComponent", C2188811AlT.LIZIZ(sbLIZ4));
                C1C7U.LIZIZ("AILiveUploadImageComponent@fffe.getImageTos$1");
            }
        });
    }
}
