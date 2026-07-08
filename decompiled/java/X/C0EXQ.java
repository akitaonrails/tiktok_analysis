package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EXQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXQ implements InterfaceC366210EXj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C0EX2 LLILLJJLI = C0EX2.TOTAL_DURATION;
    public final C1664740tQG LLILLL;
    public final C1664750tQH LLILZ;
    public boolean LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXQ.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EXQ.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
        if (C301670Bs5.LIZ()) {
            this.LLILZIL = true;
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C0EXQ(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455500nym.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return nLETrack.getMainTrack();
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        long duration;
        boolean z = this.LLILZIL;
        this.LLILZIL = false;
        if (z && !((Boolean) C273420Anc.LIZ.getValue()).booleanValue()) {
            NLETrack mainTrack = c0ey3.LIZ.getMainTrack();
            if (mainTrack != null) {
                duration = mainTrack.getDuration();
            } else {
                duration = 0;
            }
            int iLIZ = C352310DrZ.LIZ(duration);
            C1664740tQG c1664740tQG = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
            InterfaceC1455500nym interfaceC1455500nym = (InterfaceC1455500nym) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
            if (interfaceC1455500nym != null) {
                interfaceC1455500nym.LLLL((int) duration);
            }
            InterfaceC1461350o8D interfaceC1461350o8DLIZJ = ((InterfaceC1455850nzL) this.LLILZ.getValue(this, interfaceC2217461BqaArr[1])).TI1().LIZJ();
            if (interfaceC1461350o8DLIZJ != null) {
                interfaceC1461350o8DLIZJ.l0(new Pair<>(Integer.valueOf(iLIZ), Integer.valueOf(iLIZ)));
            }
            InterfaceC1461350o8D interfaceC1461350o8DLIZJ2 = ((InterfaceC1455850nzL) this.LLILZ.getValue(this, interfaceC2217461BqaArr[1])).TI1().LIZJ();
            if (interfaceC1461350o8DLIZJ2 != null) {
                interfaceC1461350o8DLIZJ2.v1(iLIZ, false);
            }
        }
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
        C0EY1 c0ey1 = c0exh.LIZIZ;
        if (c0ey1 == null) {
            return Unit.LIZ;
        }
        C0EY8 c0ey8 = (C0EY8) C13LP.LJJJLL(c0ey1.LIZ);
        if (c0ey8 == null) {
            return Unit.LIZ;
        }
        C01GW c01gw = C273420Anc.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            c0ey8.LIZ.getMeasuredEndTime();
        } else {
            c0ey8.LIZ.getDuration();
        }
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            c0ey8.LIZIZ.getMeasuredEndTime();
        } else {
            c0ey8.LIZIZ.getDuration();
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
