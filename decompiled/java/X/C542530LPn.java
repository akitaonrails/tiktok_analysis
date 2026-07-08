package X;

import android.app.Dialog;
import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$showLoadingAndRestore$2", f = "DraftRestoreOp.kt", l = {150, 168}, m = "invokeSuspend")
public final class C542530LPn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LBJ>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C542550LPp LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542530LPn(C542550LPp c542550LPp, String str, InterfaceC1364105Vn<? super C542530LPn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c542550LPp;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C542530LPn c542530LPn = new C542530LPn(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c542530LPn.LLILLJJLI = obj;
        return c542530LPn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ProgressDialogC1399790mWv progressDialogC1399790mWvLIZ;
        CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog;
        Dialog dialog;
        C1C7U.LIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Dialog dialog2 = (Dialog) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    dialog = dialog2;
                    C0FNU.LIZ(dialog);
                    C1C7U.LIZIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            C1C7U.LIZIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2");
            return obj;
        }
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        if (C297830Blt.LIZ()) {
            int iLIZIZ = C297830Blt.LIZIZ();
            if (this.LLILLL.LIZ.LIZIZ()) {
                C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                Context context = this.LLILLL.LIZ.getContext();
                CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                creativeLoadingDialogBuilder.showProgress(false);
                creativeLoadingDialogBuilder.backCanCancel(false);
                creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
                creativeLoadingDialogBuilder.loadingMessage(this.LLILLL.LIZ.getContext().getString(R.string.txr));
                creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(context, 1017, creativeLoadingDialogBuilder);
                CreativeDialogWrapper creativeDialogWrapper = (CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog;
                creativeDialogWrapper.show();
                creativeDialogWrapper.updateFakeProgress(iLIZIZ);
            } else {
                creativeLoadingDialogCreateLoadingDialog = null;
            }
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C542510LPl(this.LLILLL, creativeLoadingDialogCreateLoadingDialog, this.LLILZ, null), 3);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2");
                return objLJFF;
            }
            C1C7U.LIZIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2");
            return obj;
        }
        if (this.LLILLL.LIZ.LIZIZ()) {
            progressDialogC1399790mWvLIZ = C576210Mip.LIZ(this.LLILLL.LIZ.getContext(), EnumC1399820mWy.VISIBLE_AFTER_5S, null);
        } else {
            progressDialogC1399790mWvLIZ = null;
        }
        C542610LPv.LIZIZ(C0MVY.SHOW);
        final C099G c099gLIZIZ2 = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C542520LPm(this.LLILLL, progressDialogC1399790mWvLIZ, this.LLILZ, null), 3);
        if (progressDialogC1399790mWvLIZ != null) {
            progressDialogC1399790mWvLIZ.LLIZLLLIL = new InterfaceC1399800mWw() { // from class: X.0LPo
                @Override // X.InterfaceC1399800mWw
                public final void LIZ() {
                    c099gLIZIZ2.LIZIZ(null);
                    C542610LPv.LIZIZ(C0MVY.CLICK_CLOSE);
                }
            };
        }
        this.LLILLJJLI = progressDialogC1399790mWvLIZ;
        this.LL = 2;
        obj = c099gLIZIZ2.LJLIIIL(this);
        dialog = progressDialogC1399790mWvLIZ;
        if (obj == objLJFF) {
            C1C7U.LIZIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2");
            return objLJFF;
        }
        C0FNU.LIZ(dialog);
        C1C7U.LIZIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LBJ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
