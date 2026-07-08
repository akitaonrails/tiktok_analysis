package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS118S0110000_32;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.190h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214693190h extends C193N<InterfaceC214695190j, C190I, C10J1> implements InterfaceC214695190j {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final Function0<C190I> LLJI;
    public final C10J1 LLJIJIL;
    public final InterfaceC1738600vLO LLJILJIL;
    public final C10J3 LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214693190h.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C214693190h.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C214693190h.class, "permissionOptionApiComponent", "getPermissionOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJ = 8;
    }

    private final C19EG O4() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJILLL[1]);
    }

    private final InterfaceC855150Xgf T4() {
        return (InterfaceC855150Xgf) this.LLJ.getValue(this, LLJILLL[2]);
    }

    @Override // X.C193N
    public AnonymousClass1931<?, C190I, C10J1> F4() {
        return new AnonymousClass1931<C192U, C190I, C10J1>() { // from class: X.190J
            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                return new C192U(C10FP.LIZ(context, viewGroup));
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                C192U c192u = (C192U) abstractC1738640vLS;
                C214743192f.LIZ.getClass();
                C214743192f.LIZ(this, c192u, c193x, c1664690tQB, (C10J1) obj);
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.190L
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C190I) obj2).LIZLLL;
                    }
                }), c192u, Lifecycle.State.STARTED, new AwS601S0100000_22(c192u, 189));
            }
        };
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJILLL[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.19Lj] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.19Lj] */
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
    public final void Z4() {
        String quantityString;
        C214694190i c214694190i = C214694190i.LIZIZ;
        c214694190i.LJFF(T2().LIZJ ? 1 : 0);
        long j = P4().creativeModel.transientPostPageModel.LJJJJZ;
        if (j == 4) {
            C19EG c19egO4 = O4();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder.message(O4().getString(2131828928));
            C1390380mHk.LIZ(c19egO4, 4020, creativeToastBuilder);
            return;
        }
        if (j == 3) {
            C19EG c19egO42 = O4();
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder2.message(O4().getString(2131828929));
            C1390380mHk.LIZ(c19egO42, 4020, creativeToastBuilder2);
            return;
        }
        if (j != 2) {
            if (c214694190i.LJIIIZ()) {
                final int i = 0;
                c214694190i.LIZJ(O4(), new OnActivityResultCallback(this, i) { // from class: X.19Lj
                    public final int $t;
                    public Object l0;

                    @Override // com.bytedance.router.OnActivityResultCallback
                    public final void onActivityResult(int i2, int i3, Intent intent) {
                        switch (this.$t) {
                            case 0:
                                onActivityResult$0(this, i2, i3, intent);
                                break;
                            case 1:
                                onActivityResult$1(this, i2, i3, intent);
                                break;
                        }
                    }

                    {
                        this.$t = i;
                        this.l0 = this;
                    }

                    public static final void onActivityResult$0(C21524119Lj c21524119Lj, int i2, int i3, Intent intent) {
                        ((C214693190h) c21524119Lj.l0).d5(i2, i3, intent);
                    }

                    public static final void onActivityResult$1(C21524119Lj c21524119Lj, int i2, int i3, Intent intent) {
                        ((C214693190h) c21524119Lj.l0).d5(i2, i3, intent);
                    }
                });
                return;
            } else {
                final int i2 = 1;
                c214694190i.LJIIIIZZ(O4(), P4().creativeModel.collabInfoModel.getCollabUserList(), new OnActivityResultCallback(this, i2) { // from class: X.19Lj
                    public final int $t;
                    public Object l0;

                    @Override // com.bytedance.router.OnActivityResultCallback
                    public final void onActivityResult(int i22, int i3, Intent intent) {
                        switch (this.$t) {
                            case 0:
                                onActivityResult$0(this, i22, i3, intent);
                                break;
                            case 1:
                                onActivityResult$1(this, i22, i3, intent);
                                break;
                        }
                    }

                    {
                        this.$t = i2;
                        this.l0 = this;
                    }

                    public static final void onActivityResult$0(C21524119Lj c21524119Lj, int i22, int i3, Intent intent) {
                        ((C214693190h) c21524119Lj.l0).d5(i22, i3, intent);
                    }

                    public static final void onActivityResult$1(C21524119Lj c21524119Lj, int i22, int i3, Intent intent) {
                        ((C214693190h) c21524119Lj.l0).d5(i22, i3, intent);
                    }
                });
                return;
            }
        }
        long jLIZLLL = c214694190i.LIZLLL();
        C19EG c19egO43 = O4();
        CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
        creativeToastBuilder3.isCenterToast(C859340XnQ.LIZIZ());
        Resources resources = O4().getResources();
        if (resources != null) {
            quantityString = resources.getQuantityString(2131755143, (int) (jLIZLLL <= 2147483647L ? jLIZLLL : 2147483647L), Long.valueOf(jLIZLLL));
        } else {
            quantityString = null;
        }
        creativeToastBuilder3.message(quantityString);
        C1390380mHk.LIZ(c19egO43, 4020, creativeToastBuilder3);
    }

    @Override // X.C193O
    public boolean z4() {
        if (C214694190i.LIZIZ.LJI() == -1 || P4().getCreationMode() != 1) {
            return false;
        }
        C548590LfN.LIZ.getClass();
        return C548590LfN.LIZLLL().LJIILIIL(P4().creativeModel);
    }

    @Override // X.C193O
    public void O3() {
        super.O3();
        C1445860njE c1445860njE = C1445860njE.LIZ;
        int iHu0 = T4().hu0();
        c1445860njE.getClass();
        P4().creativeModel.transientPostPageModel.LJJJJZ = C1445860njE.LIZ(iHu0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
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
    @Override // X.C193N, X.C193O
    public void Q3() {
        ?? r2 = P4().creativeModel.transientPostPageModel.LJJJJZ == 1 ? 1 : 0;
        C214694190i.LIZIZ.LJII(r2);
        i3(new AwS118S0110000_32((boolean) r2, this, 3));
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJILJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJILJ;
    }

    public C10J1 K4() {
        return this.LLJIJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190I> o2() {
        return this.LLJI;
    }

    public C214693190h(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJI = AFwS223S0000000_32.get$arr$(86);
        this.LLJIJIL = new C10J1(new AwS611S0100000_32(this, 90), null);
        this.LLJILJIL = EnumC214771193h.COLLAB;
        this.LLJILJILJ = AnonymousClass1938.LIZ;
    }

    @Override // X.InterfaceC214695190j
    public void FR1(int i) {
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && !currentUser.LJIIIZ()) {
            List<User> collabUserList = P4().creativeModel.collabInfoModel.getCollabUserList();
            long j = P4().creativeModel.transientPostPageModel.LJJJJZ;
            boolean z = false;
            if (i != 0) {
                i3(AFwS278S0000000_32.get$arr$(67));
                int i2 = P4().creativeModel.transientPostPageModel.LJJJJZI;
                P4().creativeModel.transientPostPageModel.LJJJJZ = 4L;
                if (collabUserList != null && !collabUserList.isEmpty() && i2 == 0) {
                    C19EG c19egO4 = O4();
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
                    creativeToastBuilder.message(O4().getString(2131828928));
                    C1390380mHk.LIZ(c19egO4, 4020, creativeToastBuilder);
                }
                if (j == 1) {
                    C214694190i.LIZIZ.LJII(0);
                }
            } else {
                C1445860njE.LIZ.getClass();
                long jLIZ = C1445860njE.LIZ(i);
                if (jLIZ == 1) {
                    z = true;
                }
                i3(new AwS118S0110000_32(z, (boolean) collabUserList, (List<? extends User>) 2));
                if (z && j != 1) {
                    C214694190i.LIZIZ.LJII(1);
                }
                P4().creativeModel.transientPostPageModel.LJJJJZ = jLIZ;
            }
            P4().creativeModel.transientPostPageModel.LJJJJZI = i;
        }
    }

    public final void d5(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            P4().creativeModel.collabInfoModel.setCollabUserList((ArrayList) intent.getSerializableExtra("collab_info"));
            i3(new AwS611S0100000_32(this, 91));
        }
    }
}
