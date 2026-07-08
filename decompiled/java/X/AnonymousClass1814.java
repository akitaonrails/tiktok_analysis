package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1814, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1814 extends ConstraintLayout {
    public final String LL;
    public final C1743900vTw LLILLJJLI;
    public final AnonymousClass1813 LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxTextView LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final C371510EhR LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public long LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public int LLJILLL;
    public Map<String, Object> LLJJ;
    public final C01GW LLJJI;

    private final ILiveOuterService getLiveOuterService() {
        return (ILiveOuterService) this.LLJJI.getValue();
    }

    public final String getAuthorId() {
        return this.LL;
    }

    public final C1743900vTw getEventParamsHelper() {
        return this.LLILLJJLI;
    }

    public final void e0(Map<String, Object> map) {
        if (getVisibility() == 0) {
            map.put("module_show_type", "expand");
            map.put("stay_time", Long.valueOf(System.currentTimeMillis() - this.LLJI));
            map.put("quit_type", "close");
            C1421105hJ.LIZJ("tiktokec_module_staytime", map);
        }
        this.LLJ = true;
        C03DZ.LIZ(this);
        this.LLILLL.LIZ(false);
        h0(this, false, false, 2);
    }

    public final void i0(Map<String, Object> map) {
        FragmentManager supportFragmentManager;
        map.put("click_for", "close_script");
        C1731680vAE.LIZ(map, false);
        C013C c013c = new C013C();
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131832647);
        c1247510iZJ.LIZ(new AwS218S0300000_9((Map) map, (Map<String, Object>) this, (AnonymousClass1814) c013c, (C013C) 24));
        c1390850mIV.LIZIZ(c1247510iZJ);
        c1390850mIV.LIZ.LLILLJJLI = new C0P4R(map, c013c, 4);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxActionSheetLIZJ.show(supportFragmentManager, "test");
            C1731680vAE.LIZIZ(this.LLILLJJLI.LJ(), true);
        }
    }

    public final void j0(Map<String, Object> map) {
        FrameLayout.LayoutParams layoutParams;
        Boolean value = this.LLIZ.getValue();
        Boolean bool = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(value, bool);
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        if (zLJFF) {
            map.put("module_show_type", "expand");
            map.put("click_for", "less");
            C1731680vAE.LIZ(map, false);
            map.put("stay_time", Long.valueOf(System.currentTimeMillis() - this.LLJI));
            map.put("quit_type", "collapse");
            C1421105hJ.LIZJ("tiktokec_module_staytime", map);
            this.LLIZ.setValue(Boolean.FALSE);
            C03DZ.LIZ(this.LLILZLL);
            h0(this, false, false, 1);
            this.LLJI = System.currentTimeMillis();
            map.put("module_show_type", "collapse");
            C1731680vAE.LIZ(map, true);
            TuxIconView tuxIconView = this.LLILZIL;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_expand_fill;
            c419910GdJ.LJ = numValueOf;
            tuxIconView.setTuxIcon(c419910GdJ);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                layoutParams.gravity = 8388613;
            }
            C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), this);
            return;
        }
        map.put("module_show_type", "collapse");
        map.put("click_for", "more");
        C1731680vAE.LIZ(map, false);
        map.put("stay_time", Long.valueOf(System.currentTimeMillis() - this.LLJI));
        map.put("quit_type", "expand");
        C1421105hJ.LIZJ("tiktokec_module_staytime", map);
        this.LLIZ.setValue(bool);
        C03DZ.LIZJ(this.LLILZLL);
        h0(this, false, true, 1);
        this.LLJI = System.currentTimeMillis();
        map.put("module_show_type", "expand");
        C1731680vAE.LIZ(map, true);
        TuxIconView tuxIconView2 = this.LLILZIL;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_chevron_collapse_fill;
        c419910GdJ2.LJ = numValueOf;
        tuxIconView2.setTuxIcon(c419910GdJ2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams4);
        C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), this);
    }

    public AnonymousClass1814(Context context, String str, C1743900vTw c1743900vTw, AnonymousClass1816 anonymousClass1816) {
        super(context);
        this.LL = str;
        this.LLILLJJLI = c1743900vTw;
        this.LLILLL = anonymousClass1816;
        this.LLIZ = C948503nH.LJIIL(Boolean.TRUE);
        this.LLJ = true;
        this.LLJJ = new LinkedHashMap();
        this.LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(654));
        C786410Ut5.Sd(R.layout.bu6, C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp)), this);
        this.LLILZ = (TuxTextView) findViewById(R.id.u2h);
        this.LLILZIL = (TuxIconView) findViewById(R.id.y5h);
        this.LLILZLL = (TuxTextView) findViewById(R.id.u2g);
        this.LLIZLLLIL = (C371510EhR) findViewById(R.id.gnb);
    }

    public static void h0(AnonymousClass1814 anonymousClass1814, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            if (anonymousClass1814.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if ((i & 2) != 0) {
            Boolean value = anonymousClass1814.LLIZ.getValue();
            if (value != null) {
                z2 = value.booleanValue();
            } else {
                z2 = true;
            }
        }
        ILiveOuterService liveOuterService = anonymousClass1814.getLiveOuterService();
        if (liveOuterService != null) {
            liveOuterService.ed(z, z2);
        }
    }
}
