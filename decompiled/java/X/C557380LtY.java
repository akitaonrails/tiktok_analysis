package X;

import Y.AObserverS206S0100000_2;
import Y.AObserverS212S0100000_8;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557380LtY implements InterfaceC551280Lji {
    public C553840Lnq LIZ = new C553840Lnq();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 14));

    public final C557410Ltb LIZ() {
        return (C557410Ltb) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData Jj() {
        return LIZ().LLJLIL;
    }

    @Override // X.InterfaceC551280Lji
    public final C11RK<List<InputBlock>> O0() {
        return LIZ().LLJLL;
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData Sv() {
        return LIZ().LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData U8() {
        return LIZ().LLJLLIL;
    }

    @Override // X.InterfaceC551280Lji
    public final void hp() {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.hp();
        }
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData i6() {
        return LIZ().LLJZ;
    }

    @Override // X.InterfaceC551280Lji
    public final void ks() {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.ks();
        }
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData nw() {
        return LIZ().LLLFF;
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData pw() {
        return LIZ().LLLFZ;
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData sw() {
        return LIZ().LLJZIJLIL;
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData tw() {
        return LIZ().LLLFFI;
    }

    @Override // X.InterfaceC551280Lji
    public final List<InputBlock> uk() {
        List<InputBlock> listUk;
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        return (c557370LtX == null || (listUk = c557370LtX.uk()) == null) ? C13BV.INSTANCE : listUk;
    }

    @Override // X.InterfaceC551280Lji
    public final C11RK<String> uo() {
        return LIZ().LLJLLL;
    }

    @Override // X.InterfaceC551280Lji
    public final C555030Lpl uw() {
        return LIZ().LLJJIJI;
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData vw() {
        return LIZ().LLL;
    }

    @Override // X.InterfaceC551280Lji
    public final MutableLiveData wj() {
        return LIZ().LLLF;
    }

    @Override // X.InterfaceC551280Lji
    public final boolean zw() {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            return c557370LtX.uK0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Lte, ge.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC551280Lji
    public final void Ab(boolean z) {
        ?? r0 = LIZ().LLJJIJIL;
        if (r0 != 0) {
            r0.Ab(z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Lte, ge.i] */
    @Override // X.InterfaceC551280Lji
    public final void Ik(MediaModel mediaModel) {
        ?? r0 = LIZ().LLJJIJIL;
        if (r0 != 0) {
            r0.Ik(mediaModel);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void dl(List<InputBlock> list) {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.dl(list);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void ea(C551390Ljt c551390Ljt) {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.ea(c551390Ljt);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Lte, ge.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC551280Lji
    public final void ka(boolean z) {
        ?? r0 = LIZ().LLJJIJIL;
        if (r0 != 0) {
            r0.ka(z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Lte, ge.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC551280Lji
    public final void ko(boolean z) {
        ?? r0 = LIZ().LLJJIJIL;
        if (r0 != 0) {
            r0.ko(z);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void kv(List<MentionDataItem> list) {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.kv(list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Lte, ge.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC551280Lji
    public final void mw(boolean z) {
        ?? r0 = LIZ().LLJJIJIL;
        if (r0 != 0) {
            r0.mw(z);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void ow(Function0<Unit> function0) {
        LiveData liveDataIp1;
        C557410Ltb c557410LtbLIZ = LIZ();
        C557370LtX c557370LtX = c557410LtbLIZ.LLJJIJIIJIL;
        if (c557370LtX != null && (liveDataIp1 = c557370LtX.Ip1()) != null) {
            liveDataIp1.observe(c557410LtbLIZ, new AObserverS206S0100000_2(function0, 0));
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void qw(List list) {
        C555030Lpl c555030Lpl = LIZ().LLJJIJI;
        if (c555030Lpl != null) {
            c555030Lpl.sb2(false, list);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void rn(String str) {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.rn(str);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void rw(List<C557390LtZ> list) {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.th2(list);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void ww(C551290Ljj c551290Ljj) {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.iN0(c551290Ljj);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void xw(Function1<? super Boolean, Unit> function1) {
        LiveData liveDataUF1;
        C557410Ltb c557410LtbLIZ = LIZ();
        C557370LtX c557370LtX = c557410LtbLIZ.LLJJIJIIJIL;
        if (c557370LtX != null && (liveDataUF1 = c557370LtX.UF1()) != null) {
            liveDataUF1.observe(c557410LtbLIZ, new C513601zK(function1, 36));
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void yw(Function1<? super C557390LtZ, Unit> function1) {
        LiveData liveDataGS;
        C557410Ltb c557410LtbLIZ = LIZ();
        C557370LtX c557370LtX = c557410LtbLIZ.LLJJIJIIJIL;
        if (c557370LtX != null && (liveDataGS = c557370LtX.gS()) != null) {
            liveDataGS.observe(c557410LtbLIZ, new AObserverS212S0100000_8(function1, 28));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Lte, ge.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC551280Lji
    public final void zb(boolean z) {
        ?? r0 = LIZ().LLJJIJIL;
        if (r0 != 0) {
            r0.zb(z);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void zq(C551430Ljx c551430Ljx) {
        C557370LtX c557370LtX = LIZ().LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.zq(c551430Ljx);
        }
    }

    @Override // X.InterfaceC551280Lji
    public final void Y1(InterfaceC549270LgT interfaceC549270LgT, MentionDataItem mentionDataItem) {
        C557410Ltb c557410LtbLIZ = LIZ();
        C557370LtX c557370LtX = c557410LtbLIZ.LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.Y1(interfaceC549270LgT, mentionDataItem);
        }
        C555030Lpl c555030Lpl = c557410LtbLIZ.LLJJIJI;
        if (c555030Lpl != null) {
            c555030Lpl.jH(interfaceC549270LgT, mentionDataItem);
        }
    }
}
