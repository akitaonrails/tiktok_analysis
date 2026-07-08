package X;

import android.content.DialogInterface;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ellipsis.EcSearchBarEllipsisAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.SearchTop1CardToolbarAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.label.ui.SearchTop1CardLabelAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui.SearchBarEllipsisAssem;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.tabs.generaltab.ability.IVisualSearchAutoPlayAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videoenhanced.TakoEnhancedVideoAssem;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R4A, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4A implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
        }
    }

    public C0R4A(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(C0R4A c0r4a, DialogInterface dialogInterface) {
        SearchBarEllipsisAssem searchBarEllipsisAssem = (SearchBarEllipsisAssem) c0r4a.l0;
        searchBarEllipsisAssem.LLJIJIL = false;
        searchBarEllipsisAssem.Go().LLILLJJLI = false;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((SearchBarEllipsisAssem) c0r4a.l0).LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.getState().LJFF(null);
        SearchBarEllipsisAssem searchBarEllipsisAssem2 = (SearchBarEllipsisAssem) c0r4a.l0;
        searchBarEllipsisAssem2.getClass();
        searchBarEllipsisAssem2.Ho(Lifecycle.State.RESUMED);
        ((SearchBarEllipsisAssem) c0r4a.l0).getClass();
    }

    public static final void onDismiss$1(C0R4A c0r4a, DialogInterface dialogInterface) {
        ((C19EG) c0r4a.l0).finish();
    }

    public static final void onDismiss$2(C0R4A c0r4a, DialogInterface dialogInterface) {
        ((C19EG) c0r4a.l0).finish();
    }

    public static final void onDismiss$3(C0R4A c0r4a, DialogInterface dialogInterface) {
        Function0<Unit> function0;
        C665230Q7l c665230Q7lSp = ((SearchTop1CardToolbarAssem) c0r4a.l0).sp();
        if (c665230Q7lSp != null && (function0 = c665230Q7lSp.LLILZLL) != null) {
            function0.invoke();
        }
        ((C658000PrS) ((SearchTop1CardToolbarAssem) c0r4a.l0).LLJZ.getValue()).LIZJ(false);
    }

    public static final void onDismiss$4(C0R4A c0r4a, DialogInterface dialogInterface) {
        ((C20656615sK) c0r4a.l0).LIZ();
    }

    public static final void onDismiss$5(C0R4A c0r4a, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
        Function1 function1 = (Function1) c0r4a.l0;
        if (function1 != null) {
            function1.invoke(abstractC343940De4LJIIJ);
        }
    }

    public static final void onDismiss$6(C0R4A c0r4a, DialogInterface dialogInterface) {
        ((SearchStateViewModel) c0r4a.l0).setShowingFilters(false);
    }

    public static final void onDismiss$7(C0R4A c0r4a, DialogInterface dialogInterface) {
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(((TakoEnhancedVideoAssem) c0r4a.l0).LLL);
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - ((TakoEnhancedVideoAssem) c0r4a.l0).LLJZ);
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        linkedHashMap.put("duration", String.valueOf(lValueOf));
        c20235014FoLIZ.LIZ("tikbot_video_panel_stay_duration", linkedHashMap);
        ((TakoEnhancedVideoAssem) c0r4a.l0).LLJZ = 0L;
    }

    public static final void onDismiss$8(C0R4A c0r4a, DialogInterface dialogInterface) {
        C20600815jK<InterfaceC1891350zJl> state;
        EcSearchBarEllipsisAssem ecSearchBarEllipsisAssem = (EcSearchBarEllipsisAssem) c0r4a.l0;
        ecSearchBarEllipsisAssem.LLJI = false;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ecSearchBarEllipsisAssem.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJFF(null);
        }
        EcSearchBarEllipsisAssem ecSearchBarEllipsisAssem2 = (EcSearchBarEllipsisAssem) c0r4a.l0;
        ecSearchBarEllipsisAssem2.getClass();
        ecSearchBarEllipsisAssem2.Go(Lifecycle.State.RESUMED);
        ((EcSearchBarEllipsisAssem) c0r4a.l0).getClass();
    }

    public static final void onDismiss$9(C0R4A c0r4a, DialogInterface dialogInterface) {
        Function0<Unit> function0;
        C657980PrQ c657980PrQSp = ((SearchTop1CardLabelAssem) c0r4a.l0).sp();
        if (c657980PrQSp != null && (function0 = c657980PrQSp.LLJILLL) != null) {
            function0.invoke();
        }
        ((SearchTop1CardLabelAssem) c0r4a.l0).tp().LIZJ(false);
        IVisualSearchAutoPlayAbility iVisualSearchAutoPlayAbility = (IVisualSearchAutoPlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchTop1CardLabelAssem) c0r4a.l0), IVisualSearchAutoPlayAbility.class, null);
        if (iVisualSearchAutoPlayAbility != null) {
            iVisualSearchAutoPlayAbility.Gy2(EnumC055400Ie.CLOSE_FEEDBACK);
        }
    }
}
