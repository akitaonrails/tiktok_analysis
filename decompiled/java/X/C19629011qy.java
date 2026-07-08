package X;

import Y.ARunnableS34S0201000_29;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19629011qy implements InterfaceC19628511qt {
    public final InterfaceC1356670lPN LIZ;
    public final /* synthetic */ ViewGroup LIZIZ;
    public final /* synthetic */ Function1<User, Unit> LIZJ;
    public final /* synthetic */ Function2<Boolean, String, Unit> LIZLLL;

    @Override // X.InterfaceC19628511qt
    public final void LIZ(String str) {
        this.LIZ.Ml(str, null, false);
    }

    @Override // X.InterfaceC19628511qt
    public final void LIZIZ(int i) {
        ViewGroup viewGroup = this.LIZIZ;
        HandlerHook.viewPost(viewGroup, new ARunnableS34S0201000_29(viewGroup, i, this, 5));
    }

    @Override // X.InterfaceC19628511qt
    public final void LLJL(User user) {
        if (user != null && C123100dR.LIZ(user.getUid())) {
            this.LIZ.LLJL(user);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.11qx] */
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
    public C19629011qy(C19EG c19eg, ViewGroup viewGroup, final C19629111qz c19629111qz, final C1466510oGX c1466510oGX, final C1215150hj7 c1215150hj7) {
        this.LIZIZ = viewGroup;
        this.LIZJ = c1466510oGX;
        this.LIZLLL = c1215150hj7;
        C20612915lH c20612915lH = C20612915lH.LIZIZ;
        ?? r2 = new InterfaceC20613315lL() { // from class: X.11qx
            @Override // X.InterfaceC20613315lL
            public final void Af() {
            }

            @Override // X.InterfaceC20613315lL
            public final void M8(String str, String str2, C316530Cax c316530Cax, String str3) {
            }

            @Override // X.InterfaceC20613315lL
            public final void Wj(String str, C316530Cax c316530Cax, String str2) {
            }

            @Override // X.InterfaceC20613315lL
            public final void ld(int i) {
            }

            @Override // X.InterfaceC20613315lL
            public final void qj(User user) {
            }

            @Override // X.InterfaceC20613315lL
            public final void LLJI() {
                this.LIZ.LLJI();
            }

            @Override // X.InterfaceC20613315lL
            public final String getCreationId() {
                return c19629111qz.LIZIZ.getCreationId();
            }

            @Override // X.InterfaceC20613315lL
            public final int lk() {
                return c19629111qz.LIZIZ.creativeModel.storyModel.getPrivateAccountAllowReshareStoryType();
            }

            @Override // X.InterfaceC20613315lL
            public final void r6(int i) {
                c19629111qz.LIZIZ.creativeModel.storyModel.setPrivateAccountAllowReshareStoryType(i);
            }

            @Override // X.InterfaceC20613315lL
            public final void g1(String str, boolean z) {
                Function2<Boolean, String, Unit> function2 = c1215150hj7;
                Boolean boolValueOf = Boolean.valueOf(z);
                if (str == null) {
                    str = "";
                }
                function2.invoke(boolValueOf, str);
            }

            @Override // X.InterfaceC20613315lL
            public final void Mi(User user, boolean z, String str, String str2, int i) {
                c1466510oGX.invoke(user);
            }
        };
        VideoPublishEditModel videoPublishEditModel = c19629111qz.LIZIZ;
        this.LIZ = c20612915lH.LIZ(r2, c19eg, viewGroup, videoPublishEditModel.mShootWay, C1428470nHB.LJIILIIL(videoPublishEditModel), C1428470nHB.LJIILL(c19629111qz.LIZIZ), c19629111qz.LIZJ);
    }
}
