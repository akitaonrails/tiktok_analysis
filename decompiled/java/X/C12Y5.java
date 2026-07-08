package X;

import Y.ACListenerS163S0100000_29;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ogc.news.sticker.consumer.ArticleLinkStickerIABSheet;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;
import org.xml.sax.XMLReader;

/* JADX INFO: renamed from: X.12Y5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Y5 extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12Y5(C420990Gf3 c420990Gf3, int i) {
        super(600L);
        this.$t = i;
        this.l0 = c420990Gf3;
    }

    public static final void LIZ$0(C12Y5 c12y5, View view) {
        if (view != null) {
            C1451970nt5.LIZ(C1451970nt5.LIZ, "brush", "eraser", "click", ((C19679111z3) c12y5.l0).LLLLILI().LIZ.LJIIJJI, false, 16);
            View view2 = ((C19679111z3) c12y5.l0).LLJLL;
            if (view2 != null) {
                C1206770hVb.LIZ(view2);
            }
            C19679111z3 c19679111z3 = (C19679111z3) c12y5.l0;
            EnumC19678411yw enumC19678411yw = EnumC19678411yw.ERASER;
            if (c19679111z3.LLLLLJIL(enumC19678411yw)) {
                ((C19679111z3) c12y5.l0).LLLLIL().LJII.invoke(enumC19678411yw);
            }
        }
    }

    public static final void LIZ$1(C12Y5 c12y5, View view) {
        if (view != null) {
            C1451970nt5.LIZ(C1451970nt5.LIZ, "brush", "marker", "click", ((C19679111z3) c12y5.l0).LLLLILI().LIZ.LJIIJJI, false, 16);
            View view2 = ((C19679111z3) c12y5.l0).LLJLL;
            if (view2 != null) {
                C1206770hVb.LIZ(view2);
            }
            C19679111z3 c19679111z3 = (C19679111z3) c12y5.l0;
            EnumC19678411yw enumC19678411yw = EnumC19678411yw.NORMAL_BRUSH;
            c19679111z3.LLLLLJIL(enumC19678411yw);
            ((C19679111z3) c12y5.l0).LLLLIL().LJII.invoke(enumC19678411yw);
        }
    }

    public static final void LIZ$10(C12Y5 c12y5, View view) {
        if (view != null) {
            ((ArticleLinkStickerIABSheet) c12y5.l0).dismiss();
        }
    }

    public static final void LIZ$11(C12Y5 c12y5, View view) {
        if (!C19419010yC.LIZ(((StickerPropDetailFragment) c12y5.l0).getActivity(), "prop_page", true)) {
            return;
        }
        if (C298200BmU.LIZ()) {
            C0CHQ.LIZ().LJJJJJ().preloadVESoAsync();
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter().setCustomTag("creative_content_user_action", "creative_content_enter_record_page");
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) c12y5.l0;
        stickerPropDetailFragment.uS(view, false, stickerPropDetailFragment.LLLZZ);
    }

    public static final void LIZ$12(C12Y5 c12y5, View view) {
        ((C420990Gf3) c12y5.l0).LL.LLLI(view);
    }

    public static final void LIZ$2(C12Y5 c12y5, View view) {
        if (view != null) {
            C1451970nt5.LIZ(C1451970nt5.LIZ, "brush", null, "cancel", ((C19679111z3) c12y5.l0).LLLLILI().LIZ.LJIIJJI, false, 18);
            ((C19679111z3) c12y5.l0).LLLLIL().LIZIZ.invoke();
            ((C19679111z3) c12y5.l0).exit();
        }
    }

    public static final void LIZ$3(C12Y5 c12y5, View view) {
        if (view != null) {
            C1451970nt5.LIZ(C1451970nt5.LIZ, "brush", null, "confirm", ((C19679111z3) c12y5.l0).LLLLILI().LIZ.LJIIJJI, false, 18);
            ((C19679111z3) c12y5.l0).LLLLIL().LIZJ.invoke();
            ((C19679111z3) c12y5.l0).exit();
        }
    }

    public static final void LIZ$4(C12Y5 c12y5, View view) {
        if (view != null) {
            C1451970nt5.LIZ(C1451970nt5.LIZ, "brush", "redo", "click", ((C19679111z3) c12y5.l0).LLLLILI().LIZ.LJIIJJI, false, 16);
            ((C19679111z3) c12y5.l0).LLLLIL().LJFF.invoke();
        }
    }

    public static final void LIZ$5(C12Y5 c12y5, View view) {
        if (view != null) {
            C1451970nt5.LIZ(C1451970nt5.LIZ, "brush", "undo", "click", ((C19679111z3) c12y5.l0).LLLLILI().LIZ.LJIIJJI, false, 16);
            ((C19679111z3) c12y5.l0).LLLLIL().LJI.invoke();
        }
    }

    public static final void LIZ$6(C12Y5 c12y5, View view) {
        if (view != null) {
            C1451970nt5.LIZ(C1451970nt5.LIZ, "brush", "color", "click", ((C19679111z3) c12y5.l0).LLLLILI().LIZ.LJIIJJI, false, 16);
            final C19679111z3 c19679111z3 = (C19679111z3) c12y5.l0;
            View view2 = c19679111z3.LLJLL;
            if (view2 != null && view2.getVisibility() == 0) {
                View view3 = c19679111z3.LLJLL;
                if (view3 != null) {
                    C1206770hVb.LIZ(view3);
                    return;
                }
                return;
            }
            View view4 = c19679111z3.LLJLL;
            if (view4 != null) {
                C12ES.LJIILL(0, view4);
            }
            C388810FMh c388810FMh = c19679111z3.LLJLLIL;
            if (c388810FMh == null) {
                return;
            }
            c388810FMh.setColorChangeListener(new InterfaceC388860FMm() { // from class: X.11z4
                @Override // X.InterfaceC388860FMm
                public final void LIZ(int i) {
                    c19679111z3.LLLLIL().LIZLLL.invoke(Integer.valueOf(i));
                    C0FNY c0fny = c19679111z3.LLJLILLLLZIIL;
                    if (c0fny != null) {
                        c0fny.LLILZIL = i;
                        Paint paint = c0fny.LL;
                        if (paint != null) {
                            paint.setColor(i);
                        }
                        c0fny.invalidate();
                    }
                }
            });
        }
    }

    public static final void LIZ$7(C12Y5 c12y5, View view) {
        if (view != null) {
            C1451970nt5.LIZ(C1451970nt5.LIZ, "brush", "highlight", "click", ((C19679111z3) c12y5.l0).LLLLILI().LIZ.LJIIJJI, false, 16);
            C19679111z3 c19679111z3 = (C19679111z3) c12y5.l0;
            EnumC19678411yw enumC19678411yw = EnumC19678411yw.HIGHLIGHT_BRUSH;
            c19679111z3.LLLLLJIL(enumC19678411yw);
            View view2 = ((C19679111z3) c12y5.l0).LLJLL;
            if (view2 != null) {
                C1206770hVb.LIZ(view2);
            }
            ((C19679111z3) c12y5.l0).LLLLIL().LJII.invoke(enumC19678411yw);
        }
    }

    public static final void LIZ$8(C12Y5 c12y5, View view) {
        final Context context = ((C19341410lg) c12y5.l0).LIZIZ;
        DialogC1389100mFg dialogC1389100mFg = new DialogC1389100mFg(context) { // from class: X.110g
            public final Context LLJILJIL;

            {
                super(context, R.style.ac2);
                this.LLJILJIL = context;
            }

            @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
            public final void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(R.layout.ftw);
                C786410Ut5.a9((TuxIconView) findViewById(R.id.q96), new ACListenerS163S0100000_29(this, 215));
                findViewById(R.id.q9t).addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC346310Dht(this, 0));
                int iLJIIIIZZ = C12ES.LJIIIIZZ(this.LLJILJIL) - C497820Jfg.LIZJ(getContext());
                Window window = getWindow();
                if (window != null) {
                    if (iLJIIIIZZ == 0) {
                        iLJIIIIZZ = -1;
                    }
                    window.setLayout(-1, iLJIIIIZZ);
                    window.setGravity(80);
                    window.setBackgroundDrawableResource(R.color.dr);
                    View viewQe = C786410Ut5.qe(window, R.id.fpl);
                    if (viewQe != null) {
                        viewQe.setBackgroundDrawable(new ColorDrawable(0));
                    }
                }
                ((TextView) findViewById(R.id.q9_)).setText(Html.fromHtml(u.LJJIFFI(this.LLJILJIL.getString(2131832479), "\n", "<paragraph>", false), null, new Html.TagHandler() { // from class: X.15h3
                    @Override // android.text.Html.TagHandler
                    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
                        if (z && str != null && str.equals("paragraph") && editable != null) {
                            editable.append("\n\n");
                            editable.setSpan(new AbsoluteSizeSpan(7, true), editable.length() - 1, editable.length(), 33);
                        }
                    }
                }));
            }
        };
        dialogC1389100mFg.show();
        C785410UrT.LIZIZ(dialogC1389100mFg);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC1389100mFg);
        C816490W1f.LIZ(dialogC1389100mFg);
    }

    public static final void LIZ$9(C12Y5 c12y5, View view) {
        Dialog dialog;
        if (view != null && (dialog = ((ArticleLinkStickerIABSheet) c12y5.l0).getDialog()) != null) {
            dialog.onBackPressed();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12Y5(C19341410lg c19341410lg, int i) {
        super(500L);
        this.$t = i;
        this.l0 = c19341410lg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12Y5(StickerPropDetailFragment stickerPropDetailFragment, int i) {
        super(800L);
        this.$t = i;
        this.l0 = stickerPropDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12Y5(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }
}
