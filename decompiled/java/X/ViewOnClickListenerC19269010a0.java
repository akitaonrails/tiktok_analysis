package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.10a0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC19269010a0 extends DialogC1239100iLk implements View.OnClickListener, InterfaceC19397910un {
    public C19398110up LLILZ;
    public final String LLILZIL;
    public final C1594000raA LLILZLL;
    public final InterfaceC19269510a5 LLIZ;
    public final ArrayList<String> LLIZLLLIL;
    public long LLJ;

    public final void LJJLJ() {
        if (this.LLJ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILZIL);
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            c2344009Gk.LIZJ(this.LLIZLLLIL.size(), "icon_load");
            Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
            if (numLIZIZ != null) {
                c2344009Gk.LIZJ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
            }
            C20684815ws.LJIILLIIL("popup_duration", c2344009Gk.LIZ);
            this.LLJ = 0L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendDuration=");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append("，iconLoad=");
            sbLIZ.append(this.LLIZLLLIL.size());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.DialogC1239100iLk
    public final void LJJLIIIJLLLLLLLZ() {
        this.LL = (int) C12ES.LIZJ(280.0f, getContext());
        this.LLILLJJLI = (int) (((double) C12ES.LJIIIIZZ(getContext())) * 0.67d);
    }

    public final void LJJLIIJ() {
        ((TextView) findViewById(R.id.cst)).setEnabled(!C086I.LIZIZ(this.LLILZ != null ? r0.LLILZ : null));
        C786410Ut5.B5((TuxTextView) findViewById(R.id.cst), findViewById(R.id.cst).isEnabled() ? 1.0f : 0.5f);
    }

    @Override // X.DialogC1239100iLk, android.app.Dialog
    public final void onStart() {
        super.onStart();
        this.LLJ = System.currentTimeMillis();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        LJJLJ();
    }

    @Override // X.InterfaceC19397910un
    public final void LJJIJIIJIL(String str) {
        if (!TextUtils.isEmpty(str) && !C13LP.LJJJJ(str, this.LLIZLLLIL)) {
            this.LLIZLLLIL.add(str);
        }
    }

    @Override // X.InterfaceC19397910un
    public final void LJJLIIIJJIZ(String str) {
        LJJLIIJ();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList<String> arrayList;
        Integer numValueOf = null;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == R.id.cov) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", this.LLILZIL);
                c2344009Gk.LJIIIIZZ("language_type", "cancel");
                C20684815ws.LJIILLIIL("choose_content_language_popup", c2344009Gk.LIZ);
                dismiss();
                C785410UrT.LIZ(this);
                return;
            }
            if (numValueOf.intValue() != R.id.cst) {
                return;
            }
            C19398110up c19398110up = this.LLILZ;
            if (c19398110up != null && (arrayList = c19398110up.LLILZ) != null && !C086I.LIZIZ(arrayList)) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it2 = arrayList.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    int i2 = i + 1;
                    sb.append(it2.next());
                    if (i != arrayList.size() - 1) {
                        sb.append(",");
                    }
                    i = i2;
                }
                if (C848230XPh.LL.LJI()) {
                    C11NZ<BaseResponse> c11nzLIZ = this.LLIZ.LIZ("content_language", sb.toString(), 1);
                    if (c11nzLIZ != null) {
                        c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336310kr(2));
                    }
                } else {
                    this.LLILZLL.LIZLLL(sb.toString());
                }
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", this.LLILZIL);
                c2344009Gk2.LJIIIIZZ("language_type", sb.toString());
                C20684815ws.LJIILLIIL("choose_content_language_popup", c2344009Gk2.LIZ);
                dismiss();
                C785410UrT.LIZ(this);
                return;
            }
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LJIIIIZZ("enter_from", this.LLILZIL);
            c2344009Gk3.LJIIIIZZ("language_type", "ok");
            c2344009Gk3.LJIIIIZZ("click_type", "null");
            C20684815ws.LJIILLIIL("click_content_language_popup", c2344009Gk3.LIZ);
        }
    }

    public ViewOnClickListenerC19269010a0(Context context, String str) {
        super(context);
        this.LLILZIL = str;
        this.LLILZLL = new C1594000raA();
        this.LLIZ = (InterfaceC19269510a5) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC19269510a5.class);
        this.LLIZLLLIL = new ArrayList<>();
        setContentView(R.layout.bm9);
        setCanceledOnTouchOutside(false);
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.10a1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                String str2;
                C01GW<C19269410a4> c01gw = C19269410a4.LJFF;
                C19269210a2.LIZ().LIZJ();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", this.LL.LLILZIL);
                if (C848230XPh.LL.LJI()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("is_login", str2);
                Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
                if (numLIZIZ != null) {
                    c2344009Gk.LIZJ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
                }
                C19249910Sr.LIZIZ.LIZIZ(new C2344009Gk(), "show_content_language_popup");
            }
        });
        ((TextView) findViewById(R.id.title)).setText(C303790BvV.LIZ().title);
        ((TextView) findViewById(R.id.desc)).setText(C303790BvV.LIZ().text);
        C786410Ut5.h9((TuxTextView) findViewById(R.id.cst), this);
        LJJLIIJ();
        C786410Ut5.a9((TuxIconView) findViewById(R.id.cov), this);
        this.LLILZ = new C19398110up(str, this);
        ((RecyclerView) findViewById(R.id.t0q)).setLayoutManager(new GridLayoutManager(getContext(), 2));
        ((RecyclerView) findViewById(R.id.t0q)).setAdapter(this.LLILZ);
        ((RecyclerView) findViewById(R.id.t0q)).addItemDecoration(new C0DXR() { // from class: X.0DWy
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (((C21681919tJ) view.getLayoutParams()).LL % 2 != 0) {
                    rect.left = C341940Daq.LIZ(4.0d);
                } else {
                    rect.right = C341940Daq.LIZ(4.0d);
                }
                rect.bottom = C341940Daq.LIZ(8.0d);
            }
        });
    }
}
