package X;

import Y.AObserverS169S0200000_4;
import Y.AObserverS212S0100000_8;
import android.R;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0M11, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M11 implements C0M1L {
    public boolean LIZ;
    public boolean LIZIZ;
    public TuxNavBar LIZJ;
    public DraftBoxPageViewModel LIZLLL;
    public InterfaceC561590M0v LJ;
    public C0M1T LJFF;
    public AwS552S0100000_8 LJI;
    public boolean LJII;

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public final void LIZIZ() {
        DraftBoxPageViewModel draftBoxPageViewModel;
        InterfaceC561350Lzx interfaceC561350LzxVQ2;
        MutableLiveData<Long> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        this.LIZ = !this.LIZ;
        LIZLLL();
        DraftBoxPageViewModel draftBoxPageViewModel2 = this.LIZLLL;
        if (draftBoxPageViewModel2 != null && (mutableLiveData4 = draftBoxPageViewModel2.LLILZLL) != null) {
            AnonymousClass0880.LIZ(mutableLiveData4, Boolean.TRUE);
        }
        DraftBoxPageViewModel draftBoxPageViewModel3 = this.LIZLLL;
        if (draftBoxPageViewModel3 != null && (mutableLiveData3 = draftBoxPageViewModel3.LLIZ) != null) {
            AnonymousClass0880.LIZ(mutableLiveData3, Boolean.valueOf(this.LIZ));
        }
        DraftBoxPageViewModel draftBoxPageViewModel4 = this.LIZLLL;
        if (draftBoxPageViewModel4 != null && (mutableLiveData2 = draftBoxPageViewModel4.LLJ) != null) {
            AnonymousClass0880.LIZ(mutableLiveData2, 0);
        }
        DraftBoxPageViewModel draftBoxPageViewModel5 = this.LIZLLL;
        if (draftBoxPageViewModel5 != null && (mutableLiveData = draftBoxPageViewModel5.LLIZLLLIL) != null) {
            AnonymousClass0880.LIZ(mutableLiveData, 0L);
        }
        if (this.LIZ || (draftBoxPageViewModel = this.LIZLLL) == null || (interfaceC561350LzxVQ2 = draftBoxPageViewModel.vQ2()) == null) {
            return;
        }
        interfaceC561350LzxVQ2.clearAll();
    }

    public final void LIZJ() {
        Context context;
        C19EG c19egLIZIZ;
        try {
            TuxNavBar tuxNavBar = this.LIZJ;
            Unit unit = null;
            if (tuxNavBar != null && (context = tuxNavBar.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                if (c19egLIZIZ.isFinishing()) {
                    return;
                }
                c19egLIZIZ.finish();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZLLL() {
        Context context;
        TuxNavBar tuxNavBar = this.LIZJ;
        if (tuxNavBar == null || (context = tuxNavBar.getContext()) == null) {
            return;
        }
        TuxNavBar tuxNavBar2 = this.LIZJ;
        if (tuxNavBar2 != null) {
            tuxNavBar2.LJJ(new AwS587S0100000_8(this, 783), "back");
        }
        TuxNavBar tuxNavBar3 = this.LIZJ;
        if (tuxNavBar3 != null) {
            tuxNavBar3.LJJ(new AwS374S0200000_8(context, this, 226), "select");
        }
        TuxNavBar tuxNavBar4 = this.LIZJ;
        if (tuxNavBar4 != null) {
            tuxNavBar4.LJJ(new AwS587S0100000_8(this, 784), "select_all");
        }
        TuxNavBar tuxNavBar5 = this.LIZJ;
        if (tuxNavBar5 != null) {
            tuxNavBar5.LJJ(new AwS587S0100000_8(this, 785), "organizer_manage");
        }
        TuxNavBar tuxNavBar6 = this.LIZJ;
        if (tuxNavBar6 != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = (this.LIZ || C0M1K.LIZ()) ? "" : context.getString(2131832435);
            tuxNavBar6.LJIJJ(c1250250idj);
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
    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        TuxNavBar tuxNavBar;
        Context context;
        C19EG c19egLIZIZ;
        AVDraftMigrateService aVDraftMigrateService;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2;
        Context context2;
        CharSequence text;
        if (view instanceof TuxNavBar) {
            tuxNavBar = (TuxNavBar) view;
        } else {
            tuxNavBar = null;
        }
        this.LIZJ = tuxNavBar;
        this.LIZLLL = draftBoxPageViewModel;
        this.LJ = interfaceC561590M0v;
        if (tuxNavBar != null && (context2 = tuxNavBar.getContext()) != null) {
            TuxNavBar tuxNavBar2 = this.LIZJ;
            if (tuxNavBar2 != null) {
                tuxNavBar2.setNavBackground(R.color.transparent);
            }
            TuxNavBar tuxNavBar3 = this.LIZJ;
            if (tuxNavBar3 != null) {
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = com.zhiliaoapp.musically.R.raw.icon_arrow_left_ltr;
                c1251150ifB.LIZIZ = "back";
                c1251150ifB.LIZJ(new AwS552S0100000_8(this, 1142));
                c0om1.LJ(c1251150ifB);
                C1250300ido c1250300ido = new C1250300ido();
                c1250300ido.LIZJ = context2.getString(2131846782);
                EnumC638250P1r enumC638250P1r = EnumC638250P1r.SECONDARY;
                c1250300ido.LIZLLL = enumC638250P1r;
                c1250300ido.LIZIZ = "select_all";
                c1250300ido.LJFF = false;
                c1250300ido.LIZ(new AwS552S0100000_8(this, 1143));
                c0om1.LJ(c1250300ido);
                C1250300ido c1250300ido2 = new C1250300ido();
                c1250300ido2.LIZJ = context2.getString(2131829740);
                c1250300ido2.LIZLLL = enumC638250P1r;
                c1250300ido2.LIZIZ = "organizer_manage";
                c1250300ido2.LJFF = false;
                c1250300ido2.LIZ(new AwS552S0100000_8(this, 1144));
                c0om1.LJ(c1250300ido2);
                C1250250idj c1250250idj = new C1250250idj();
                if (C0M1K.LIZ()) {
                    text = "";
                } else {
                    text = context2.getText(2131832435);
                }
                c1250250idj.LIZJ = text;
                c0om1.LIZJ = c1250250idj;
                C1250300ido c1250300ido3 = new C1250300ido();
                c1250300ido3.LIZJ = context2.getString(2131826970);
                c1250300ido3.LIZLLL = enumC638250P1r;
                c1250300ido3.LIZIZ = "select";
                c1250300ido3.LIZ(new AwS552S0100000_8(this, 1145));
                c0om1.LIZIZ(c1250300ido3);
                c0om1.LIZLLL = true;
                tuxNavBar3.setNavActions(c0om1);
            }
        }
        TuxNavBar tuxNavBar4 = this.LIZJ;
        if (tuxNavBar4 != null && (context = tuxNavBar4.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            DraftBoxPageViewModel draftBoxPageViewModel2 = this.LIZLLL;
            if (draftBoxPageViewModel2 != null && (mutableLiveData2 = draftBoxPageViewModel2.LLILZ) != null) {
                mutableLiveData2.observe(c19egLIZIZ, new AObserverS212S0100000_8(this, 115));
            }
            DraftBoxPageViewModel draftBoxPageViewModel3 = this.LIZLLL;
            if (draftBoxPageViewModel3 != null && (mutableLiveData = draftBoxPageViewModel3.LLILZLL) != null) {
                mutableLiveData.observe(c19egLIZIZ, new AObserverS169S0200000_4(this, c19egLIZIZ, 3));
            }
            AVDraftMigrateService aVDraftMigrateService2 = (AVDraftMigrateService) PluggableExtentionKt.pluggableSpi$default(AVDraftMigrateService.class, false, false, false, 14, null);
            if (aVDraftMigrateService2 != null && aVDraftMigrateService2.enableM1MigrateDraft() && (aVDraftMigrateService = (AVDraftMigrateService) PluggableExtentionKt.pluggableSpi$default(AVDraftMigrateService.class, false, false, false, 14, null)) != null) {
                aVDraftMigrateService.observeMigrateFlowStatus(c19egLIZIZ, new AwS587S0100000_8(this, 786));
            }
        }
    }
}
