package X;

import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusFeature;
import com.ss.android.ugc.aweme.creatortools.creatorplus.ModalInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0ktw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class DialogC1337180ktw extends DialogC19728412Gs {
    public static final /* synthetic */ int LLILZ = 0;
    public final C19EG LL;
    public final CreatorPlusFeature LLILLJJLI;
    public final Function0<Unit> LLILLL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.LLILLL.invoke();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        List<String> urlList;
        String str;
        super.onCreate(bundle);
        View viewSd = C786410Ut5.Sd(R.layout.bfy, getLayoutInflater(), null);
        if (viewSd != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0ktx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogC1337180ktw dialogC1337180ktw = this.LL;
                    dialogC1337180ktw.dismiss();
                    C785410UrT.LIZ(dialogC1337180ktw);
                }
            }, viewSd.findViewById(R.id.pk9));
            ModalInfo modalInfo = this.LLILLJJLI.modalInfo;
            if (modalInfo != null) {
                UrlModel urlModel = modalInfo.image;
                if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) viewSd.findViewById(R.id.sav));
                    c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_INSIDE;
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                }
                try {
                    ((TuxTextView) viewSd.findViewById(R.id.sbd)).setText(modalInfo.titleKey);
                    ((TuxTextView) viewSd.findViewById(R.id.sak)).setText(modalInfo.messageKey);
                    ((TuxTextView) viewSd.findViewById(R.id.sal)).setText(this.LL.getString(2131830384));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.getMessage();
                }
            }
        }
        C2204961BRm.LLILZIL(this.LL.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6Zp7a0yCgq2USpQok+S3IZnL0KGA3MMJy9p/luslBUPVSn21bO8qJdIE=", null)).getSize(new Point());
        int iLIZJ = (int) C12ES.LIZJ(310.0f, this.LL);
        int i = (int) (r4.x * 0.8f);
        if (iLIZJ > i) {
            iLIZJ = i;
        }
        setContentView(viewSd, new LinearLayout.LayoutParams(iLIZJ, -2));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "creator_tools");
        c2344009Gk.LJIIIIZZ("enter_method", "click_grey_area");
        String str2 = this.LLILLJJLI.name;
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("feature", str2);
        C20684815ws.LJIILLIIL("show_creator_plus_popup", c2344009Gk.LIZ);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            dismiss();
            C785410UrT.LIZ(this);
            return true;
        }
        return false;
    }

    public DialogC1337180ktw(C19EG c19eg, CreatorPlusFeature creatorPlusFeature, AFwS217S0000000_28 aFwS217S0000000_28) {
        super(c19eg);
        this.LL = c19eg;
        this.LLILLJJLI = creatorPlusFeature;
        this.LLILLL = aFwS217S0000000_28;
    }
}
