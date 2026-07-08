package X;

import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotUserInfoComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.0ZYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901540ZYi implements InterfaceC901580ZYm<C901510ZYf> {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 170));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 169));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 171));
    public final View LIZLLL;
    public final /* synthetic */ Context LJ;
    public final /* synthetic */ C901500ZYe LJFF;

    @Override // X.InterfaceC901580ZYm
    public final View getView() {
        return this.LIZLLL;
    }

    public final void LIZ(C0ZQ8 c0zq8) {
        UrlModel avatarThumb;
        List<String> urlList;
        Object objLJJJLL;
        C901510ZYf c901510ZYf = (C901510ZYf) c0zq8;
        C362700EJw c362700EJw = (C362700EJw) this.LIZ.getValue();
        int size = c901510ZYf.LIZ.size();
        int i = c901510ZYf.LIZIZ;
        if (size > i) {
            c362700EJw.LLIZLLLIL = i;
        } else {
            c362700EJw.LLIZLLLIL = size;
        }
        c362700EJw.LLJ = i;
        TuxTextView tuxTextView = c362700EJw.LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c362700EJw.LLIZLLLIL);
        sbLIZ.append('/');
        sbLIZ.append(c362700EJw.LLJ);
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        c362700EJw.invalidate();
        if (!c901510ZYf.LIZ.isEmpty()) {
            C337180DJs.LIZJ((View) this.LIZIZ.getValue());
            List<AIGroupShotUserInfoComponent> list = c901510ZYf.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<AIGroupShotUserInfoComponent> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().userId));
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = setLLIIJI.iterator();
            while (it3.hasNext()) {
                long jLongValue = ((Number) it3.next()).longValue();
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(jLongValue), null, "im_local_db");
                if (iMUserLJIIL != null && (avatarThumb = iMUserLJIIL.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                    arrayList2.add(objLJJJLL);
                }
            }
            ((C427830Gq5) this.LIZIZ.getValue()).setProgress(arrayList2);
        } else {
            C337180DJs.LIZ((View) this.LIZIZ.getValue());
        }
        int size2 = c901510ZYf.LIZ.size();
        int i2 = c901510ZYf.LIZIZ;
        if (size2 == i2) {
            ((TextView) this.LIZJ.getValue()).setText(this.LJ.getString(2131830882));
            return;
        }
        int size3 = i2 - c901510ZYf.LIZ.size();
        ((TextView) this.LIZJ.getValue()).setText(this.LJFF.getResources().getQuantityString(2131755226, size3, Integer.valueOf(size3)));
        C786410Ut5.I7(new ACListenerS149S0100000_14(this.LJFF, 10), this.LIZLLL.findViewById(R.id.kb0));
        View viewFindViewById = this.LIZLLL.findViewById(R.id.crd);
        C901500ZYe c901500ZYe = this.LJFF;
        C197039127h c197039127h = (C197039127h) viewFindViewById;
        c197039127h.LJJJJL(new AwS580S0100000_1(c197039127h, 350));
        C786410Ut5.U8(c197039127h, new ACListenerS149S0100000_14(c901500ZYe, 11));
    }

    public C901540ZYi(Context context, C901500ZYe c901500ZYe) {
        this.LJ = context;
        this.LJFF = c901500ZYe;
        this.LIZLLL = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.csp, c901500ZYe, false);
    }
}
