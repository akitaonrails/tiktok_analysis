package X;

import Y.ACListenerS115S0200000_11;
import Y.ACallableS63S1100000_11;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S11, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC20647615qs("story2_viewer_list_pop_up")
public final class C0S11 extends AbstractC20660015ss<DialogFragment> {
    public static boolean LLJ;
    public final Aweme LL;
    public final String LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public final View LLILZIL;
    public String LLILZLL = "";
    public boolean LLIZ = true;
    public final int LLIZLLLIL = 411;

    @Override // X.InterfaceC20660415sw
    public final /* bridge */ /* synthetic */ C688120Qyw i2() {
        return null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        boolean z;
        String str;
        String str2;
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        Fragment fragmentLIZ = null;
        if (c19egLIZIZ == null) {
            return null;
        }
        if ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getRegisterTime() < 259200) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJIIIIZZ = C729980SkG.LJIIIIZZ(this.LL);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19egLIZIZ), R.layout.fdi, null, false);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.e1y);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS115S0200000_11(this, viewTd, 21));
        }
        TextView textView = (TextView) viewTd.findViewById(R.id.ky9);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.p8g);
        View viewFindViewById = viewTd.findViewById(R.id.pkj);
        View viewFindViewById2 = viewTd.findViewById(R.id.pkk);
        View viewFindViewById3 = viewTd.findViewById(R.id.pkl);
        if (z) {
            if (textView != null) {
                textView.setText(c19egLIZIZ.getString(2131849006));
            }
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
            if (viewFindViewById3 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            }
        } else {
            LJIIL(R.id.kxc, viewTd);
            LJIIL(R.id.kxd, viewTd);
            LJIIL(R.id.kxe, viewTd);
            if (textView != null) {
                textView.setText(c19egLIZIZ.getString(2131849011));
            }
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            if (viewFindViewById3 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            }
        }
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.a24);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS115S0200000_11(this, viewTd, 22));
        }
        if (z) {
            str = "new";
        } else {
            str = "old";
        }
        if (zLJIIIIZZ) {
            str2 = "own";
        } else {
            str2 = "others";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        this.LLILZLL = C2188811AlT.LIZIZ(sbLIZ);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = viewTd;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC738790SyT(this, 2);
        C1391850mK7.LIZIZ(tuxSheet, "440");
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null) {
            fragmentLIZ = iDetailFeedSafService.LIZ(this.LLILZIL);
        }
        if (fragmentLIZ != null) {
            tuxSheet.show(fragmentLIZ.getChildFragmentManager(), "StoryViewerListCompliancePopup");
        } else {
            tuxSheet.show(c19egLIZIZ.getSupportFragmentManager(), "StoryViewerListCompliancePopup");
        }
        LLJ = true;
        Keva.getRepo("tt_story_viewer_list_popup").storeBoolean("key_has_show_viewer_list_popup", true);
        HandlerHook.viewPostDelay(viewTd, new ARunnableS111S0100000_11(this, 104), 20L);
        C15O7.LIZJ(new ACallableS63S1100000_11("show", this, 0));
        return tuxSheet;
    }

    public static void LJIIL(int i, View view) {
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            Context context = view.getContext();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1h);
            viewFindViewById.setBackground(c384050F3z.LIZ(context));
        }
    }

    public C0S11(Aweme aweme, String str, Function0<Unit> function0, Function0<Unit> function02, View view) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = view;
    }
}
