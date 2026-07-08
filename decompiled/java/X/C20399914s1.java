package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.setting.MultiGuestPlaybookRecommendedListUseIconRevert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20399914s1 extends AbstractC960470b6L<C20390914qZ> {
    public static final String LLJJIII = C497740JfY.LJIJI(2131854077);
    public static final String LLJJIJI = C497740JfY.LJIJI(2131854076);
    public final EnumC992490bvz LL;
    public final InterfaceC20405014sq LLILLJJLI;
    public final boolean LLILLL;
    public final DataChannel LLILZ;
    public C1324720kZq LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public C16FS LLJI;
    public C20743516Fd LLJIJIL;
    public C20743516Fd LLJILJIL;
    public LinearLayout LLJILJILJ;
    public C1324720kZq LLJILLL;
    public C16F5 LLJJ;
    public final boolean LLJJI;

    public final void L5(C20390914qZ c20390914qZ, boolean z) {
        boolean z2;
        if (this.LLILLL && !MultiGuestPlaybookRecommendedListUseIconRevert.INSTANCE.isRevert()) {
            C16FS c16fs = this.LLJI;
            if (c16fs != null) {
                C12ES.LJIILL(0, c16fs);
            }
            Playbook playbook = c20390914qZ.LIZ;
            PlaybookContent playbookContent = playbook.content;
            if (playbookContent != null && (playbookContent.contentStatus == 3 || playbookContent.contentStatus == 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LLJJI && z2 && z) {
                InterfaceC20405014sq interfaceC20405014sq = this.LLILLJJLI;
                if (interfaceC20405014sq != null && playbook.playbookId == interfaceC20405014sq.LLJJ()) {
                    C16FS c16fs2 = this.LLJI;
                    if (c16fs2 != null) {
                        c16fs2.setText(C497740JfY.LJIJI(2131854124));
                    }
                    C16FS c16fs3 = this.LLJI;
                    if (c16fs3 != null) {
                        C500260Jjc.LJLIIIL(500L, c16fs3, new C20401114sD(this, c20390914qZ));
                        return;
                    }
                    return;
                }
                C16FS c16fs4 = this.LLJI;
                if (c16fs4 != null) {
                    c16fs4.setText(C497740JfY.LJIJI(2131854079));
                }
                C16FS c16fs5 = this.LLJI;
                if (c16fs5 == null) {
                    return;
                }
                C500260Jjc.LJLIIIL(500L, c16fs5, new C20402014sM(this, c20390914qZ));
                return;
            }
            C16FS c16fs6 = this.LLJI;
            if (c16fs6 != null) {
                c16fs6.setText(C497740JfY.LJIJI(2131854124));
            }
            C16FS c16fs7 = this.LLJI;
            if (c16fs7 != null) {
                C500260Jjc.LJLIIIL(500L, c16fs7, new C20401014sC(this, c20390914qZ));
                return;
            }
            return;
        }
        C16FS c16fs8 = this.LLJI;
        if (c16fs8 != null) {
            C439101nJ.LJI(c16fs8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b1  */
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
    @Override // X.AbstractC960470b6L
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I5(final X.C20390914qZ r14, int r15) {
        /*
            Method dump skipped, instruction units count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20399914s1.I5(X.14qZ, int):void");
    }

    public C20399914s1(View view, EnumC992490bvz enumC992490bvz, InterfaceC20405014sq interfaceC20405014sq, boolean z, DataChannel dataChannel) {
        boolean zBooleanValue;
        Boolean bool;
        super(view);
        this.LL = enumC992490bvz;
        this.LLILLJJLI = interfaceC20405014sq;
        this.LLILLL = z;
        this.LLILZ = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C956690b0F.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLJJI = zBooleanValue;
    }
}
