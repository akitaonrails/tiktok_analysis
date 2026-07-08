package X;

import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H2G, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment$showSocialStatusProgressBanner$1$1", f = "MusProfileEditFragment.kt", l = {628}, m = "invokeSuspend")
public final class C0H2G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusProfileEditFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ FrameLayout LLILZ;
    public final /* synthetic */ TuxSpinner LLILZIL;
    public final /* synthetic */ C427870Gq9 LLILZLL;
    public final /* synthetic */ TuxIconView LLIZ;
    public final /* synthetic */ TuxTextView LLIZLLLIL;
    public final /* synthetic */ TuxTextView LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H2G(MusProfileEditFragment musProfileEditFragment, String str, FrameLayout frameLayout, TuxSpinner tuxSpinner, C427870Gq9 c427870Gq9, TuxIconView tuxIconView, TuxTextView tuxTextView, TuxTextView tuxTextView2, InterfaceC1364105Vn<? super C0H2G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musProfileEditFragment;
        this.LLILLL = str;
        this.LLILZ = frameLayout;
        this.LLILZIL = tuxSpinner;
        this.LLILZLL = c427870Gq9;
        this.LLIZ = tuxIconView;
        this.LLIZLLLIL = tuxTextView;
        this.LLJ = tuxTextView2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H2G(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusProfileEditFragment@fdf.showSocialStatusProgressBanner$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951LIZ = ((ISocialAvatarCreationStatusService) this.LLILLJJLI.LLZLLLL.getValue()).LIZ(this.LLILLL);
            final FrameLayout frameLayout = this.LLILZ;
            final TuxSpinner tuxSpinner = this.LLILZIL;
            final C427870Gq9 c427870Gq9 = this.LLILZLL;
            final TuxIconView tuxIconView = this.LLIZ;
            final TuxTextView tuxTextView = this.LLIZLLLIL;
            final TuxTextView tuxTextView2 = this.LLJ;
            final MusProfileEditFragment musProfileEditFragment = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0HDk
                /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0177  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x0188  */
                @Override // X.InterfaceC346701Wf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r14, X.InterfaceC1364105Vn r15) {
                    /*
                        Method dump skipped, instruction units count: 1168
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C437460HDk.emit(java.lang.Object, X.05Vn):java.lang.Object");
                }
            };
            this.LL = 1;
            if (anonymousClass0951LIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MusProfileEditFragment@fdf.showSocialStatusProgressBanner$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
