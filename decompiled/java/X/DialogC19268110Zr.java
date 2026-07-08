package X;

import Y.ACListenerS162S0100000_28;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.10Zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class DialogC19268110Zr extends DialogC1239100iLk {
    public final RecyclerView LLILZ;
    public final BPEAHandler LLILZIL;
    public boolean LLILZLL;
    public final IPlayerManagerService LLIZ;

    @Override // X.DialogC1239100iLk
    public final void LJJLIIIJLLLLLLLZ() {
        C844470XAv.LIZ.getClass();
        this.LL = (int) C12ES.LIZJ(280.0f, C844470XAv.LIZ());
    }

    public final void LJJLIIJ() {
        IPlayerManagerService iPlayerManagerService = this.LLIZ;
        if (iPlayerManagerService == null) {
            return;
        }
        if (!iPlayerManagerService.LIZJ()) {
            C786410Ut5.LJLIIL(1000L, this.LLILZIL, new ARunnableS128S0100000_28(this, 3));
        } else {
            this.LLIZ.LIZ();
            this.LLILZLL = true;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        IPlayerManagerService iPlayerManagerService;
        super.dismiss();
        if (!this.LLILZLL || (iPlayerManagerService = this.LLIZ) == null) {
            return;
        }
        iPlayerManagerService.LJIILLIIL();
        this.LLILZLL = false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            LJJLIIJ();
        }
    }

    public DialogC19268110Zr(Context context, String[] strArr) {
        super(context, R.style.aa1);
        this.LLIZ = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi(IPlayerManagerService.class);
        this.LLIZ = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi(IPlayerManagerService.class);
        setContentView(R.layout.acm);
        this.LLILZ = (RecyclerView) findViewById(R.id.msq);
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 10), findViewById(R.id.db0));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.10Zs
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i == 84;
            }
        });
        ArrayList arrayList = new ArrayList();
        Map<String, InterfaceC1910030znt> map = new HashMap<>();
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            map = i18nServiceApi.LIZ().LJIILIIL();
        }
        HashMap map2 = new HashMap();
        for (InterfaceC1910030znt interfaceC1910030znt : map.values()) {
            map2.put(interfaceC1910030znt.LIZ(), interfaceC1910030znt);
        }
        for (String str : strArr) {
            Object obj = map2.get(str);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        this.LLILZ.setLayoutManager(new WrapLinearLayoutManager(context));
        this.LLILZ.addItemDecoration(new C422410GhL(1, C341940Daq.LIZ(0.5d), ColorProtector.parseColor("#20161823")));
        this.LLILZ.setAdapter(new C345510Dgb(context, arrayList, this));
        this.LLILZIL = new BPEAHandler();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        C20684815ws.LJIILLIIL("show_language_popup", c2344009Gk.LIZ);
    }
}
