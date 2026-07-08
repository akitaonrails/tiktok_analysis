package X;

import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotResultComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS337S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901530ZYh implements InterfaceC901580ZYm<C901520ZYg> {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 167));
    public final View LIZIZ;

    @Override // X.InterfaceC901580ZYm
    public final View getView() {
        return this.LIZIZ;
    }

    public final void LIZ(C0ZQ8 c0zq8) {
        ImageComponent imageComponent;
        List<String> listLIZ;
        C901520ZYg c901520ZYg = (C901520ZYg) c0zq8;
        AIGroupShotResultComponent aIGroupShotResultComponent = (AIGroupShotResultComponent) C13LP.LJJJLL(c901520ZYg.LIZ);
        if (aIGroupShotResultComponent != null && (imageComponent = aIGroupShotResultComponent.image) != null && (listLIZ = C2244081CsQ.LIZ(imageComponent)) != null && !listLIZ.isEmpty()) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(listLIZ);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LIZ.getValue());
            C1332130kln.LIZJ(c1331670kl3LJIIIIZZ, C06TB.DEFAULT);
            C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "ai_group_shot_finish_style", new C444040Hb8(new C914210Ztj(c901520ZYg, 0), AFwS337S0000000_14.get$arr$(0)), false, null, null, null, 60);
        }
    }

    public C901530ZYh(Context context, C901500ZYe c901500ZYe) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.csn, c901500ZYe, false);
        C786410Ut5.I7(new ACListenerS149S0100000_14(c901500ZYe, 9), viewTd);
        this.LIZIZ = viewTd;
    }
}
