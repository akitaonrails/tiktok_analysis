package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0mEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388590mEr extends FrameLayout {
    public final View LL;
    public final ImageView LLILLJJLI;
    public final C11FQ LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public InterfaceC1388600mEs LLILZLL;

    public final View getCardView() {
        return this.LL;
    }

    public C1388590mEr(Context context) {
        User curUser;
        String nickname;
        List<String> urlList;
        String str;
        super(context, null, 0);
        this.LLILZ = 1;
        this.LLILZIL = 1;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f8g, this, true);
        this.LL = findViewById(R.id.w_0);
        this.LLILLJJLI = (ImageView) findViewById(R.id.w9z);
        TextView textView = (TextView) findViewById(R.id.w_3);
        TextView textView2 = (TextView) findViewById(R.id.w_1);
        C11FQ c11fq = (C11FQ) findViewById(R.id.w_4);
        this.LLILLL = c11fq;
        ImageView imageView = (ImageView) findViewById(R.id.w_2);
        textView.setTextSize(1, 18.0f);
        textView.setLetterSpacing(0.015f);
        textView2.setTextSize(1, 14.4f);
        textView2.setLetterSpacing(0.00185305f);
        IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
        if (iUgCommonService != null && iUgCommonService.LJIIIZ() != null) {
            C14MJ.LJIIJ(imageView, "img_scan_logo_new", null);
            C14MJ.LJIIIZ(c11fq, "qr_code_default_view");
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser();
        } else {
            curUser = null;
        }
        UrlModel urlModelLIZ = C848410XPz.LIZ(curUser);
        if (urlModelLIZ != null && (urlList = urlModelLIZ.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJIJL(context);
            c1331670kl3LJIIIZ.LJJII(new C1402310maz(this, 0));
        } else {
            this.LLILZ = 3;
        }
        if (curUser != null) {
            nickname = curUser.getNickname();
        } else {
            nickname = null;
        }
        textView.setText(nickname);
        String uniqueId = curUser != null ? curUser.getUniqueId() : null;
        String strLIZIZ = "";
        uniqueId = uniqueId == null ? "" : uniqueId;
        if (uniqueId.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            sbLIZ.append(uniqueId);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        textView2.setText(strLIZIZ);
    }

    public final void setCallback(InterfaceC1388600mEs interfaceC1388600mEs) {
        this.LLILZLL = interfaceC1388600mEs;
    }
}
