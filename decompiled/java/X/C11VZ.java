package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11VZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11VZ extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ AnchorPublishStruct LL;
    public final /* synthetic */ C19510811Va LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11VZ(AnchorPublishStruct anchorPublishStruct, C19510811Va c19510811Va, String str, String str2) {
        super(1);
        this.LL = anchorPublishStruct;
        this.LLILLJJLI = c19510811Va;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        String str;
        boolean zBooleanValue = bool.booleanValue();
        AnchorPublishStruct anchorPublishStruct = this.LL;
        if (anchorPublishStruct.isNew) {
            anchorPublishStruct.isNew = false;
            AnchorListManager.LIZ.getClass();
            AnchorListManager.LIZIZ();
            C11G7 c11g7 = this.LLILLJJLI.LLJILLL;
            if (c11g7 != null) {
                c11g7.LJLJJI();
            }
            AnchorListManager.LJIIL(this.LL);
            this.LLILLJJLI.LJJJIL();
        }
        DialogC849000XSg dialogC849000XSg = this.LLILLJJLI.LLJJJJJIL;
        if (dialogC849000XSg != null) {
            dialogC849000XSg.dismiss();
            C785410UrT.LIZ(dialogC849000XSg);
        }
        Fragment fragment = this.LLILLJJLI.LLILLL;
        if (fragment == null) {
            fragment = null;
        }
        Context context = fragment.getContext();
        if (zBooleanValue) {
            str = this.LLILLL;
        } else {
            str = this.LLILZ;
        }
        SmartRouter.buildRoute(context, str).open();
        return Unit.LIZ;
    }
}
