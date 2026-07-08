package X;

import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OS7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OS7 implements C0OT0 {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final BulletinListViewModel LIZ;
    public final boolean LIZIZ;
    public final BulletinInteractionAbility LIZJ;
    public final BulletinCommonAbility LIZLLL;
    public final View LJ;
    public final TuxTextView LJFF;
    public C11JF LJI;
    public String LJII;
    public List<String> LJIIIIZZ;
    public Boolean LJIIIZ;
    public Boolean LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public final C01GW LJIILIIL;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C0OOP r15, java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OS7.LIZLLL(X.0OOP, java.lang.String, boolean):void");
    }

    public final void LJFF(C0OOP c0oop, String str, C0OVA c0ova, boolean z) {
        BulletinStyleTextModel bulletinStyleTextModel;
        Integer numLIZIZ;
        if (c0oop == null || c0ova == null) {
            return;
        }
        if (z) {
            BulletinStyleStruct bulletinStyleStruct = c0oop.LLJILLL;
            if (bulletinStyleStruct != null && (bulletinStyleTextModel = bulletinStyleStruct.textModel) != null) {
                if (C296740Bk8.LIZ()) {
                    C0OS8.LIZ.getClass();
                    Integer num = C0OS8.LJII().enableTextConfigOpt;
                    if (num != null && num.intValue() == 1 && Intrinsics.LJFF(this.LJIIJ, Boolean.TRUE) && Intrinsics.LJFF(this.LJIIJJI, bulletinStyleTextModel.font) && Intrinsics.LJFF(this.LJIIL, bulletinStyleTextModel.color)) {
                        LIZLLL(c0oop, str, true);
                        return;
                    }
                }
                this.LJIIJ = Boolean.TRUE;
                String str2 = bulletinStyleTextModel.font;
                this.LJIIJJI = str2;
                this.LJIIL = bulletinStyleTextModel.color;
                TuxTextView tuxTextView = this.LJFF;
                if (str2 != null && (numLIZIZ = C2248361CzK.LIZIZ(str2)) != null) {
                    tuxTextView.setTuxFont(numLIZIZ.intValue());
                }
                C624550Oeb.LIZLLL(this.LJFF, bulletinStyleTextModel.color);
                LIZLLL(c0oop, str, true);
                return;
            }
            return;
        }
        if (C296740Bk8.LIZ()) {
            C0OS8.LIZ.getClass();
            Integer num2 = C0OS8.LJII().enableTextConfigOpt;
            if (num2 != null && num2.intValue() == 1 && Intrinsics.LJFF(this.LJIIJ, Boolean.FALSE)) {
                return;
            }
        }
        this.LJIIJ = Boolean.FALSE;
        this.LJIIJJI = null;
        this.LJIIL = null;
        if (this.LIZIZ) {
            this.LJFF.setTextColorRes(R.attr.zi);
        } else {
            this.LJFF.setTextColorRes(R.attr.a1h);
        }
        this.LJFF.setTuxFont(101);
        HandlerHook.viewPost(this.LJ, new ARunnableS109S0100000_9(this, 161));
    }

    public C0OS7(ViewStub viewStub, BulletinListViewModel bulletinListViewModel, boolean z, BulletinInteractionAbility bulletinInteractionAbility, BulletinCommonAbility bulletinCommonAbility) {
        View viewLJLLLL;
        ViewGroup viewGroup;
        this.LIZ = bulletinListViewModel;
        this.LIZIZ = z;
        this.LIZJ = bulletinInteractionAbility;
        this.LIZLLL = bulletinCommonAbility;
        if (C0OS8.LJI()) {
            ViewParent parent = viewStub.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                C786410Ut5.LJJLJLI(viewStub, viewGroup);
                Context context = viewStub.getContext();
                C636510Oxt c636510Oxt = new C636510Oxt(context, null, 6);
                c636510Oxt.setId(R.id.d0c);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c636510Oxt);
                c636510Oxt.setLayoutParams(layoutParams);
                c636510Oxt.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                c636510Oxt.setClickable(true);
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setId(R.id.d0a);
                C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-2, -2));
                tuxTextView.setTuxFont(101);
                c636510Oxt.addView(tuxTextView);
                viewGroup.addView(c636510Oxt, iIndexOfChild);
                viewLJLLLL = c636510Oxt;
            } else {
                viewStub.setLayoutResource(R.layout.a6r);
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            }
        } else {
            viewStub.setLayoutResource(R.layout.a6r);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        }
        this.LJ = viewLJLLLL;
        TuxTextView tuxTextView2 = (TuxTextView) viewLJLLLL.findViewById(R.id.d0a);
        if (z) {
            tuxTextView2.setTextColorRes(R.attr.zi);
        } else {
            tuxTextView2.setTextColorRes(R.attr.a1h);
        }
        this.LJFF = tuxTextView2;
        this.LJIILIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1730));
    }
}
