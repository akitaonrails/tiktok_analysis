package X;

import Y.AfS177S0100000_8;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Mnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579330Mnr extends AbstractC2255721DQs<InterfaceC576770Mjj> implements InterfaceC576770Mjj, InterfaceC379610EuV {
    public static final C579380Mnw LLJ = new Object() { // from class: X.0Mnw
    };
    public static final int LLJI = 8;
    public final C1DRG LL;
    public boolean LLILZ;
    public LayoutApplyFrom LLILZLL;
    public Runnable LLIZLLLIL;
    public final InterfaceC576770Mjj LLILLJJLI = this;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(311));
    public final MutableLiveData<AbstractC579260Mnk> LLILZIL = new MutableLiveData<>(C579270Mnl.LIZ);
    public final C11NJ LLIZ = new C11NJ();

    @Override // X.InterfaceC576770Mjj
    public void qe() {
        this.LLILZLL = null;
        Z1().LIZIZ(EnumC579350Mnt.LLILLJJLI, null);
    }

    private final C579340Mns<EnumC579360Mnu, EnumC579350Mnt> Z1() {
        return (C579340Mns) this.LLILLL.getValue();
    }

    public final void G2() {
        C579310Mnp c579310Mnp;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (!(value instanceof C579310Mnp) || (c579310Mnp = (C579310Mnp) value) == null) {
            throw new IllegalStateException("CameraLayoutStateComponent layoutType of COMPILING event is null");
        }
        this.LLILZIL.setValue(new C579290Mnn(c579310Mnp.LIZJ, c579310Mnp.LIZIZ));
    }

    @Override // X.InterfaceC576770Mjj
    public AbstractC577050MkB G8() {
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (value instanceof AbstractC579280Mnm) {
            return ((AbstractC579280Mnm) this.LLILZIL.getValue()).LIZIZ();
        }
        if (value instanceof C579250Mnj) {
            return ((C579250Mnj) this.LLILZIL.getValue()).LIZ;
        }
        return null;
    }

    public final void H2() {
        C579300Mno c579300Mno;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (!(value instanceof C579300Mno) || (c579300Mno = (C579300Mno) value) == null) {
            throw new IllegalStateException("CameraLayoutStateComponent last state is not Enabled.Updating but the action is ON_GRID_DELETED");
        }
        this.LLILZIL.setValue(new C579290Mnn(c579300Mno.LIZJ, c579300Mno.LIZLLL));
    }

    @Override // X.InterfaceC576770Mjj
    public boolean PK0() {
        return this.LLILZIL.getValue() instanceof C579290Mnn;
    }

    public final void T2() {
        C579250Mnj c579250Mnj;
        AbstractC577050MkB abstractC577050MkB;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (!(value instanceof C579250Mnj) || (c579250Mnj = (C579250Mnj) value) == null || (abstractC577050MkB = c579250Mnj.LIZ) == null) {
            throw new IllegalStateException("CameraLayoutStateComponent layoutType of INITIATED event is null");
        }
        this.LLILZIL.setValue(new C579290Mnn(abstractC577050MkB, 0));
    }

    public final void W2() {
        C579310Mnp c579310Mnp;
        AbstractC577050MkB abstractC577050MkB;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (!(value instanceof C579310Mnp) || (c579310Mnp = (C579310Mnp) value) == null || (abstractC577050MkB = c579310Mnp.LIZJ) == null) {
            throw new IllegalStateException("CameraLayoutStateComponent layoutType of ON_EDIT event is null");
        }
        this.LLILZIL.setValue(new C579320Mnq(abstractC577050MkB));
    }

    @Override // X.InterfaceC576770Mjj
    public void XX() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        C576730Mjf.LJIIIZ("CameraLayoutStateComponent", "initStateMachine");
        C371780Ehs.LIZ(this.LLIZ, Z1().LIZJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 64)));
    }

    public final void c3() {
        C579320Mnq c579320Mnq;
        AbstractC577050MkB abstractC577050MkB;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (!(value instanceof C579320Mnq) || (c579320Mnq = (C579320Mnq) value) == null || (abstractC577050MkB = c579320Mnq.LIZJ) == null) {
            throw new IllegalStateException("CameraLayoutStateComponent layoutType of ON_EDIT event is null");
        }
        this.LLILZIL.setValue(new C579290Mnn(abstractC577050MkB, abstractC577050MkB.LIZJ));
    }

    public final void i3() {
        C579290Mnn c579290Mnn;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (!(value instanceof C579290Mnn) || (c579290Mnn = (C579290Mnn) value) == null) {
            throw new IllegalStateException("CameraLayoutStateComponent last state is not Enabled.Ready but the current state is ENABLED_LOADING");
        }
        this.LLILZIL.setValue(new C579300Mno(c579290Mnn.LIZJ, c579290Mnn.LIZLLL));
    }

    @Override // X.InterfaceC576770Mjj
    public boolean isEnabled() {
        return !(this.LLILZIL.getValue() instanceof C579270Mnl);
    }

    public final void m3() {
        C579290Mnn c579290Mnn;
        AbstractC577050MkB abstractC577050MkB;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (!(value instanceof C579290Mnn) || (c579290Mnn = (C579290Mnn) value) == null || (abstractC577050MkB = c579290Mnn.LIZJ) == null) {
            throw new IllegalStateException("CameraLayoutStateComponent layoutType of COMPILING event is null");
        }
        this.LLILZIL.setValue(new C579310Mnp(abstractC577050MkB));
    }

    @Override // X.InterfaceC576770Mjj
    public int pw() {
        AbstractC579280Mnm abstractC579280Mnm;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (!(value instanceof AbstractC579280Mnm) || (abstractC579280Mnm = (AbstractC579280Mnm) value) == null) {
            return 0;
        }
        return abstractC579280Mnm.LIZ();
    }

    public final void w2() {
        C579300Mno c579300Mno;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if (!(value instanceof C579300Mno) || (c579300Mno = (C579300Mno) value) == null) {
            throw new IllegalStateException("CameraLayoutStateComponent last state is not Enabled.Updating but try to cancel");
        }
        this.LLILZIL.setValue(new C579290Mnn(c579300Mno.LIZJ, c579300Mno.LIZLLL));
    }

    @Override // X.InterfaceC576770Mjj
    public boolean Ce1() {
        AbstractC577050MkB abstractC577050MkBG8 = G8();
        return abstractC577050MkBG8 != null && pw() == abstractC577050MkBG8.LIZJ;
    }

    @Override // X.InterfaceC576770Mjj
    public void E60() {
        Z1().LIZIZ(EnumC579350Mnt.LLILLL, null);
    }

    @Override // X.InterfaceC576770Mjj
    public void ZN0() {
        Z1().LIZIZ(EnumC579350Mnt.LLJ, null);
    }

    @Override // X.InterfaceC576770Mjj
    public void Zh0() {
        Z1().LIZIZ(EnumC579350Mnt.LLILZ, null);
    }

    @Override // X.InterfaceC576770Mjj
    public void iz1() {
        Z1().LIZIZ(EnumC579350Mnt.LLJI, null);
    }

    @Override // X.InterfaceC576770Mjj
    public void onCompileDone() {
        Z1().LIZIZ(EnumC579350Mnt.LLJIJIL, null);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C576730Mjf.LJIIIZ("CameraLayoutStateComponent", "onCreate");
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLIZ.dispose();
    }

    @Override // X.InterfaceC576770Mjj
    public void tC0() {
        Z1().LIZIZ(EnumC579350Mnt.LLJILJIL, null);
    }

    @Override // X.InterfaceC576770Mjj
    public void ug1() {
        Z1().LIZIZ(EnumC579350Mnt.LLIZLLLIL, null);
    }

    @Override // X.InterfaceC576770Mjj
    public void v71() {
        Z1().LIZIZ(EnumC579350Mnt.LLILZIL, null);
    }

    public InterfaceC576770Mjj W1() {
        return this.LLILLJJLI;
    }

    public MutableLiveData<AbstractC579260Mnk> X1() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC576770Mjj
    public LayoutApplyFrom f60() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC576770Mjj
    public /* bridge */ /* synthetic */ LiveData r6() {
        return this.LLILZIL;
    }

    public C579330Mnr(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void B3(C579370Mnv<EnumC579360Mnu, EnumC579350Mnt> c579370Mnv) {
        AbstractC577050MkB abstractC577050MkB;
        Object obj = c579370Mnv.LIZLLL;
        if ((obj instanceof AbstractC577050MkB) && (abstractC577050MkB = (AbstractC577050MkB) obj) != null) {
            this.LLILZIL.setValue(new C579250Mnj(abstractC577050MkB));
            return;
        }
        throw new IllegalStateException("CameraLayoutStateComponent layoutType of SELECT_LAYOUT event is null");
    }

    @Override // X.InterfaceC576770Mjj
    public void HK1(int i) {
        Z1().LIZIZ(EnumC579350Mnt.LLIZ, Integer.valueOf(i));
    }

    @Override // X.InterfaceC576770Mjj
    public void Ho1(Runnable runnable) {
        this.LLIZLLLIL = runnable;
    }

    @Override // X.InterfaceC576770Mjj
    public void lR(int i) {
        Z1().LIZIZ(EnumC579350Mnt.LLILZLL, Integer.valueOf(i));
    }

    public final void o2(C579370Mnv<EnumC579360Mnu, EnumC579350Mnt> c579370Mnv) {
        Integer num;
        C579300Mno c579300Mno;
        Object obj = c579370Mnv.LIZLLL;
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            int iIntValue = num.intValue();
            AbstractC579260Mnk value = this.LLILZIL.getValue();
            if ((value instanceof C579300Mno) && (c579300Mno = (C579300Mno) value) != null) {
                this.LLILZIL.setValue(new C579290Mnn(c579300Mno.LIZJ, c579300Mno.LIZLLL + iIntValue));
                return;
            }
            throw new IllegalStateException("CameraLayoutStateComponent last state is not Enabled.Updating but medias are appended");
        }
        throw new IllegalStateException("CameraLayoutStateComponent count of ON_GRID_ADDED event is null");
    }

    public final void q3(C579370Mnv<EnumC579360Mnu, EnumC579350Mnt> c579370Mnv) {
        C579290Mnn c579290Mnn;
        Integer num;
        AbstractC579260Mnk value = this.LLILZIL.getValue();
        if ((value instanceof C579290Mnn) && (c579290Mnn = (C579290Mnn) value) != null) {
            Object obj = c579370Mnv.LIZLLL;
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                this.LLILZIL.setValue(new C579300Mno(c579290Mnn.LIZJ, c579290Mnn.LIZLLL - num.intValue()));
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        throw new IllegalStateException("CameraLayoutStateComponent last state is not Enabled.Ready but the action is START_DELETE");
    }

    public final void v3(C579370Mnv<EnumC579360Mnu, EnumC579350Mnt> c579370Mnv) {
        AbstractC577050MkB abstractC577050MkB;
        Object obj = c579370Mnv.LIZLLL;
        if ((obj instanceof AbstractC577050MkB) && (abstractC577050MkB = (AbstractC577050MkB) obj) != null) {
            this.LLILZIL.setValue(new C579300Mno(abstractC577050MkB, 0));
            return;
        }
        throw new IllegalStateException("CameraLayoutStateComponent layoutType of CHANGE_LAYOUT_TYPE event is null");
    }

    @Override // X.InterfaceC576770Mjj
    public void go0(AbstractC577050MkB abstractC577050MkB, LayoutApplyFrom layoutApplyFrom) {
        this.LLILZLL = layoutApplyFrom;
        Z1().LIZIZ(EnumC579350Mnt.LL, abstractC577050MkB);
    }
}
