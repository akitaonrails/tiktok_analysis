package X;

import Y.AObserverS224S0100000_21;
import Y.ARunnableS111S0100000_11;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0lPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356960lPq implements C0SEP {
    public final C0SEN LIZIZ;
    public AbstractC1356940lPo LIZJ;
    public C730840Sle LIZLLL;
    public C1356930lPn LJ;
    public final C1356950lPp LJFF;
    public final View LJI;
    public Aweme LJII;
    public boolean LJIIIIZZ;

    @Override // X.C0SEP
    public final void LIZIZ() {
        this.LJFF.setHolderSelected(true);
        C1356950lPp c1356950lPp = this.LJFF;
        if (c1356950lPp.LLJJJIL) {
            c1356950lPp.LJJIJIIJI();
        } else {
            Aweme aweme = this.LJII;
            if (aweme != null) {
                LJIILJJIL(aweme);
            }
        }
        C1356950lPp c1356950lPp2 = this.LJFF;
        c1356950lPp2.getClass();
        HandlerHook.viewPost(c1356950lPp2, new ARunnableS111S0100000_11(c1356950lPp2, 154));
    }

    @Override // X.C0SEP
    public final void LIZJ() {
        this.LJFF.LJJIJIIJIL();
    }

    @Override // X.C0SEP
    public final void LIZLLL() {
        this.LJFF.LJJIII(C1356950lPp.LLJZ);
    }

    @Override // X.C0SEP
    public final int LJ() {
        int i = C1356950lPp.LLJLL;
        return C1356950lPp.LLJLLL;
    }

    @Override // X.C0SEP
    public final int LJI() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        int i = C1356950lPp.LLJLL;
        return iLIZIZ + C1356950lPp.LLJLLIL;
    }

    @Override // X.C0SEP
    public final void LJIIIIZZ() {
        C730840Sle c730840Sle;
        if (this.LIZIZ.LJIIJ) {
            AbstractC1356940lPo abstractC1356940lPo = this.LIZJ;
            if ((abstractC1356940lPo instanceof C730840Sle) && (c730840Sle = (C730840Sle) abstractC1356940lPo) != null) {
                C23250099c.LIZLLL((InterfaceC497601wk) c730840Sle.LLIZ.getValue(), null, null, new C331280Cyk(c730840Sle, null), 3);
                return;
            }
        }
        AbstractC1356940lPo abstractC1356940lPo2 = this.LIZJ;
        if (abstractC1356940lPo2 != null) {
            abstractC1356940lPo2.LJFF();
        }
    }

    @Override // X.C0SEP
    public final int LJIIIZ() {
        int i = C1356950lPp.LLJLL;
        return C1356950lPp.LLL;
    }

    @Override // X.C0SEP
    public final boolean LJIIJJI() {
        return this.LJFF.LLJJJ;
    }

    @Override // X.C0SEP
    public final void LJIIL() {
        this.LJFF.LJJIJIIJI();
    }

    public final void LJIILIIL() {
        C1356930lPn c1356930lPn = this.LJ;
        if (c1356930lPn != null) {
            c1356930lPn.LIZIZ();
        }
        C730840Sle c730840Sle = this.LIZLLL;
        if (c730840Sle != null) {
            c730840Sle.LIZIZ();
        }
        AbstractC1356940lPo abstractC1356940lPo = this.LIZJ;
        if (abstractC1356940lPo != null) {
            abstractC1356940lPo.LIZIZ();
        }
    }

    @Override // X.C0SEP
    public final void LJJIII() {
        this.LJFF.setHolderSelected(false);
        C1356950lPp c1356950lPp = this.LJFF;
        c1356950lPp.LJJIIZI();
        c1356950lPp.LLJLIL = -1;
        c1356950lPp.LLJL = c1356950lPp.getFirstDataPositionInState();
        c1356950lPp.LLJLILLLLZIIL = false;
        c1356950lPp.LLIZ = false;
        C786410Ut5.t(c1356950lPp, 4);
        c1356950lPp.LJJIJIIJIL();
        c1356950lPp.scrollToPosition(0);
        c1356950lPp.LLJJIJIIJIL = null;
        c1356950lPp.LLJ.clear();
        c1356950lPp.LJJIJ();
    }

    @Override // X.C0SEP
    public final void onPause() {
        this.LJFF.LJJIJIIJIL();
    }

    @Override // X.C0SEP
    public final void onResume() {
        AbstractC1356940lPo abstractC1356940lPo;
        if (this.LJFF.LJJII() && (abstractC1356940lPo = this.LIZJ) != null && abstractC1356940lPo.LLILZ) {
            this.LJFF.LJJIJIIJI();
        }
    }

    @Override // X.C0SEP
    public final void LIZ() {
        LJIILIIL();
        this.LIZJ = null;
    }

    @Override // X.C0SEP
    public final C1356950lPp LJIIJ() {
        return this.LJFF;
    }

    @Override // X.C0SEP
    public final void LJJIJIIJIL() {
        LJIILIIL();
    }

    @Override // X.C0SEP
    public final void onDestroy() {
        LJIILIIL();
    }

    public C1356960lPq(C0SEN c0sen) {
        this.LIZIZ = c0sen;
        ViewGroup viewGroup = c0sen.LIZ;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne((viewGroup == null ? null : viewGroup).getContext());
        ViewGroup viewGroup2 = c0sen.LIZ;
        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.a4i, viewGroup2 == null ? null : viewGroup2, true);
        this.LJI = viewTd;
        C1356950lPp c1356950lPp = (C1356950lPp) viewTd.findViewById(R.id.e_x);
        this.LJFF = c1356950lPp;
        if (c0sen.LJIIJ) {
            float f = c0sen.LJII;
            int i = c0sen.LJIIIIZZ;
            float f2 = c0sen.LJIIIZ;
            c1356950lPp.getClass();
            c1356950lPp.LLJJIJI = C814420VxA.LIZIZ((C1356950lPp.LLJLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) * C13LZ.LIZLLL(f, 0.0f, 1.0f));
            int iLIZLLL = (int) (4 * C13LZ.LIZLLL(f2, 0.1f, 100.0f));
            c1356950lPp.LLJJI = iLIZLLL < 1 ? 1 : iLIZLLL;
            C366620EYy c366620EYy = c1356950lPp.LLJJIJIL;
            if (c366620EYy != null) {
                c1356950lPp.removeItemDecoration(c366620EYy);
            }
            c1356950lPp.LLJJIJIL = null;
            if (i > 0) {
                C366620EYy c366620EYy2 = new C366620EYy(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), 1);
                c1356950lPp.addItemDecoration(c366620EYy2);
                c1356950lPp.LLJJIJIL = c366620EYy2;
            }
            c1356950lPp.LJJIJIL(c1356950lPp.LLJJJJLIIL);
        }
    }

    @Override // X.C0SEP
    public final void LJII(int i) {
        C1356950lPp c1356950lPp = this.LJFF;
        C0SEP.LIZ.getClass();
        int i2 = C0SES.LIZIZ;
        if (i < i2) {
            i = i2;
        }
        c1356950lPp.LJJIII(i);
    }

    public final void LJIILJJIL(Aweme aweme) {
        String str;
        AbstractC1356940lPo abstractC1356940lPo = this.LIZJ;
        if (abstractC1356940lPo != null && abstractC1356940lPo.LLILZIL) {
            return;
        }
        if (!TextUtils.isEmpty(aweme.getAid())) {
            LJIILIIL();
            C1356950lPp c1356950lPp = this.LJFF;
            String str2 = this.LIZIZ.LIZJ;
            String groupId = aweme.getGroupId();
            C735840Sti c735840Sti = C735840Sti.LIZ;
            User author = aweme.getAuthor();
            c735840Sti.getClass();
            int iLJIIIIZZ = C735840Sti.LJIIIIZZ(author);
            if (C729510SjV.LJJ(aweme)) {
                str = "story";
            } else {
                str = "post";
            }
            c1356950lPp.setMMobEventParam(new C0SQ1(aweme, str2, groupId, iLJIIIIZZ, str, this.LIZIZ.LIZLLL, new LinkedHashSet(), Boolean.valueOf(this.LJIIIIZZ)));
            AbstractC1356940lPo abstractC1356940lPo2 = this.LIZJ;
            if (abstractC1356940lPo2 != null) {
                abstractC1356940lPo2.LIZ(aweme);
                return;
            }
            return;
        }
        LJIILIIL();
    }

    @Override // X.C0SEP
    public final void setVisibility(int i) {
        if (i == 0) {
            C1351950lHl.LJIJJLI(this.LJI);
        } else {
            C1351950lHl.LJIJJ(this.LJI);
        }
    }

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
    @Override // X.C0SEP
    public final void LJFF(Aweme aweme, boolean z) {
        AbstractC1356940lPo c1356930lPn;
        LifecycleOwner lifecycleOwnerLIZ;
        this.LJFF.setFromStoryToPost(this.LIZIZ.LJI);
        LJIILIIL();
        if (((Boolean) C0A8Z.LIZ.getValue()).booleanValue()) {
            if (this.LIZIZ.LJFF == 1) {
                C730840Sle c730840Sle = this.LIZLLL;
                c1356930lPn = c730840Sle;
                if (c730840Sle == null) {
                    C730840Sle c730840Sle2 = new C730840Sle(this.LJFF);
                    this.LIZLLL = c730840Sle2;
                    c1356930lPn = c730840Sle2;
                }
            } else {
                C1356930lPn c1356930lPn2 = this.LJ;
                c1356930lPn = c1356930lPn2;
                if (c1356930lPn2 == null) {
                    if (aweme != null) {
                        aweme.getAid();
                    }
                    C1356930lPn c1356930lPn3 = new C1356930lPn(this.LIZIZ, this.LJFF);
                    this.LJ = c1356930lPn3;
                    c1356930lPn = c1356930lPn3;
                }
            }
        } else if (this.LIZIZ.LJFF == 1) {
            c1356930lPn = new C730840Sle(this.LJFF);
        } else {
            if (aweme != null) {
                aweme.getAid();
            }
            c1356930lPn = new C1356930lPn(this.LIZIZ, this.LJFF);
        }
        this.LJFF.LJJIJIL(c1356930lPn.LJII());
        this.LIZJ = c1356930lPn;
        this.LJFF.setBubbleListManager(c1356930lPn);
        C698840Rb8.LIZ.getClass();
        if (C698840Rb8.LIZ(aweme, true) && !this.LIZIZ.LJI && (lifecycleOwnerLIZ = C948503nH.LIZ(this.LJFF)) != null) {
            this.LJFF.getState().LIZIZ.observe(lifecycleOwnerLIZ, new AObserverS224S0100000_21(this, 76));
        }
        this.LJIIIIZZ = z;
        this.LJII = aweme;
        ViewGroup viewGroup = this.LIZIZ.LIZ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJLZ(0, viewGroup);
        C786410Ut5.t(this.LJFF, 0);
        if (C04UD.LIZ()) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LIZIZ.LJ;
            if (interfaceC665370Q7z != null) {
                C1196320hEk.LIZIZ(this.LJFF, interfaceC665370Q7z);
            }
            this.LIZIZ.getClass();
        }
        LJIILJJIL(aweme);
    }
}
