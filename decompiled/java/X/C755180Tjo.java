package X;

import Y.ARunnableS112S0100000_12;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.List;

/* JADX INFO: renamed from: X.0Tjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755180Tjo implements InterfaceC750520TcI {
    public final AbstractC755190Tjp LIZ;
    public final AbstractC752950TgD LIZIZ;
    public final EnumC755280Tjy LIZJ;
    public View LIZLLL;
    public C16F5 LJ;
    public C16F5 LJFF;
    public C21411818qq LJI;
    public boolean LJII;
    public final C21627319kV LJIIIIZZ = C21627319kV.LIZJ();
    public final BPEAHandler LJIIIZ = new BPEAHandler(Looper.getMainLooper());
    public final C785820Us8 LJIIJ = new C785820Us8(Integer.TYPE, 2);

    @Override // X.InterfaceC750520TcI
    public final boolean LIZ() {
        C21411818qq c21411818qq = this.LJI;
        if (c21411818qq != null) {
            return c21411818qq.isChecked();
        }
        return false;
    }

    @Override // X.InterfaceC750520TcI
    public final void LIZLLL() {
        View view = this.LIZLLL;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
    }

    public final void LJII() {
        C786410Ut5.LJLIIL(500L, this.LJIIIZ, new ARunnableS112S0100000_12(this, 461));
    }

    public final boolean LJIIIIZZ() {
        AbstractC752950TgD abstractC752950TgD;
        List<EnumC755280Tjy> list;
        List<EnumC755280Tjy> list2 = this.LIZ.LJI;
        return (list2 == null || list2.isEmpty() || ((list = this.LIZ.LJI) != null && list.contains(this.LIZJ))) && (abstractC752950TgD = this.LIZIZ) != null && abstractC752950TgD.LJ(this.LIZJ);
    }

    @Override // X.InterfaceC750520TcI
    public final void LIZIZ(boolean z) {
        this.LJII = true;
        C21411818qq c21411818qq = this.LJI;
        if (c21411818qq != null) {
            c21411818qq.setChecked(z);
        }
        this.LJII = false;
    }

    @Override // X.InterfaceC750520TcI
    public final void LIZJ(boolean z) {
        C21411818qq c21411818qq = this.LJI;
        if (c21411818qq != null) {
            c21411818qq.setClickable(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0194, code lost:
    
        if (r3 != null) goto L80;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJ(android.view.ViewGroup r13) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C755180Tjo.LJ(android.view.ViewGroup):android.view.View");
    }

    public final void LJFF(CharSequence charSequence) {
        C16F5 c16f5 = this.LJFF;
        if (c16f5 != null) {
            c16f5.setText(charSequence);
        }
    }

    public final void LJI(CharSequence charSequence) {
        C16F5 c16f5 = this.LJ;
        if (c16f5 != null) {
            c16f5.setText(charSequence);
        }
    }

    public C755180Tjo(AbstractC755190Tjp abstractC755190Tjp, AbstractC752950TgD abstractC752950TgD, EnumC755280Tjy enumC755280Tjy) {
        this.LIZ = abstractC755190Tjp;
        this.LIZIZ = abstractC752950TgD;
        this.LIZJ = enumC755280Tjy;
    }
}
