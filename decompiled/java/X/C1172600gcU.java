package X;

import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo;
import com.ss.android.ugc.aweme.favorites.experiment.CollaborativeCollectionConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf.a;

/* JADX INFO: renamed from: X.0gcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172600gcU extends ConstraintLayout {
    public static final /* synthetic */ int LLJILJIL = 0;
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public C427660Gpo LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public final List<String> LLILZLL;
    public InterfaceC1172610gcV LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public String LLJIJIL;

    public final String getEnterFrom() {
        return this.LLJI;
    }

    public final String getEnterType() {
        return this.LLJIJIL;
    }

    public final InterfaceC1172610gcV getSelectedUserChangedListener() {
        return this.LLIZ;
    }

    public final List<String> getSelectedUserList() {
        return this.LLILZLL;
    }

    public final void e0(List<CollaborativeUserInfo> list) {
        String str;
        String str2;
        String str3;
        String str4;
        if (list == null) {
            return;
        }
        ((ArrayList) this.LLILZLL).clear();
        if (list.size() == 0) {
            LinearLayout linearLayout = this.LLILLJJLI;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            TuxTextView tuxTextView = this.LL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            InterfaceC1172610gcV interfaceC1172610gcV = this.LLIZ;
            if (interfaceC1172610gcV != null) {
                interfaceC1172610gcV.LIZ(false);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.LLILLJJLI;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(0, linearLayout2);
        }
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        List<String> list2 = this.LLILZLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<CollaborativeUserInfo> it2 = list.iterator();
        while (true) {
            str = "";
            if (!it2.hasNext()) {
                break;
            }
            CollaborativeUserInfo next = it2.next();
            if (next != null && (str4 = next.uid) != null) {
                str = str4;
            }
            arrayList.add(str);
        }
        ((ArrayList) list2).addAll(arrayList);
        InterfaceC1172610gcV interfaceC1172610gcV2 = this.LLIZ;
        if (interfaceC1172610gcV2 != null) {
            interfaceC1172610gcV2.LIZ(true);
        }
        CollaborativeUserInfo collaborativeUserInfo = (CollaborativeUserInfo) C13LP.LJJJLZIJ(0, list);
        C427660Gpo c427660Gpo = this.LLILLL;
        if (c427660Gpo != null) {
            if (collaborativeUserInfo != null) {
                str3 = collaborativeUserInfo.avatarUrl;
            } else {
                str3 = null;
            }
            c427660Gpo.setImageURI(str3);
        }
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 == null) {
            return;
        }
        if (collaborativeUserInfo != null && (str2 = collaborativeUserInfo.name) != null) {
            str = str2;
        }
        tuxTextView3.setText(str);
    }

    public final void setEnableSelect(boolean z) {
        float f;
        this.LLIZLLLIL = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
    }

    public final void setEnterFrom(String str) {
        this.LLJI = str;
    }

    public final void setEnterType(String str) {
        this.LLJIJIL = str;
    }

    public final void setNewTag(boolean z) {
        this.LLJ = z;
    }

    public final void setSelectedUserChangedListener(InterfaceC1172610gcV interfaceC1172610gcV) {
        this.LLIZ = interfaceC1172610gcV;
    }

    public C1172600gcU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1172600gcU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = new ArrayList();
        this.LLIZLLLIL = true;
        ViewGroup.inflate(context, R.layout.c64, this);
        this.LL = (TuxTextView) findViewById(R.id.kz9);
        this.LLILLJJLI = (LinearLayout) findViewById(R.id.ums);
        this.LLILLL = (C427660Gpo) findViewById(R.id.umq);
        this.LLILZ = (TuxTextView) findViewById(R.id.umr);
        this.LLILZIL = (TuxIconView) findViewById(R.id.llw);
        View.OnClickListener aCListenerS153S0100000_18 = new ACListenerS153S0100000_18(this, 28);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS153S0100000_18) : aCListenerS153S0100000_18);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ = C1171750gb7.LIZJ();
        if (collaborativeCollectionConfigLIZJ != null && collaborativeCollectionConfigLIZJ.guideType == 1) {
            C1171870gbJ.LIZ.getClass();
            if (!C1171870gbJ.LIZ().getBoolean("collaborative_red_dot_", false)) {
                TuxIconView tuxIconView = this.LLILZIL;
                if (tuxIconView != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
                    tuxIconView.setBackgroundDrawable(c384050F3z.LIZ(tuxIconView.getContext()));
                    C337180DJs.LIZJ(tuxIconView);
                    this.LLJ = true;
                }
                C1171870gbJ.LIZ().storeBoolean("collaborative_red_dot_", true);
                C1171870gbJ.LIZ().storeBoolean("collaborative_red_tag_", true);
            }
        }
    }
}
