package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import avg.f;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0cuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1029810cuB extends LinearLayout implements View.OnClickListener, Observer<C0RD4> {
    public LinkData LL;
    public Aweme LLILLJJLI;
    public C424620Gku LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public C435190H4r LLIZLLLIL;

    public final void setOnDislikeCommentAdListener(InterfaceC1029870cuH interfaceC1029870cuH) {
    }

    public final boolean LIZIZ() {
        LinkData linkData = this.LL;
        if (TextUtils.isEmpty(linkData != null ? linkData.downloadUrl : null)) {
            return false;
        }
        LinkData linkData2 = this.LL;
        return TextUtils.equals(linkData2 != null ? linkData2.type : null, "app");
    }

    public final void LIZLLL() {
        C1029850cuF.LIZ.getClass();
        IAdCommentDepend iAdCommentDepend = C1029850cuF.LIZIZ;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.LJIIJ(getContext(), this.LL, this.LLILLJJLI);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public ViewOnClickListenerC1029810cuB(Context context) {
        View.OnClickListener fVar;
        super(context, null, 0);
        View viewSd = C786410Ut5.Sd(R.layout.cv4, C786410Ut5.ne(getContext()), this);
        this.LLILZ = (TuxTextView) viewSd.findViewById(R.id.title);
        this.LLILLL = (C424620Gku) viewSd.findViewById(R.id.bh2);
        this.LLILZIL = (TuxTextView) viewSd.findViewById(R.id.eu1);
        this.LLILZLL = (TuxTextView) viewSd.findViewById(R.id.ms0);
        this.LLIZ = (TuxTextView) viewSd.findViewById(R.id.yhm);
        viewSd.findViewById(R.id.yhk);
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, this);
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, this);
        }
        C424620Gku c424620Gku = this.LLILLL;
        if (c424620Gku != null) {
            C786410Ut5.D9(c424620Gku, this);
        }
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 != null) {
            C786410Ut5.h9(tuxTextView3, this);
        }
        TuxTextView tuxTextView4 = this.LLILZIL;
        if (tuxTextView4 != null) {
            C786410Ut5.h9(tuxTextView4, this);
        }
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C12ES.LIZJ(51.5f, context);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        Aweme aweme;
        LinkData linkData;
        C0RD4 c0rd42 = c0rd4;
        String str = c0rd42.LIZ;
        int iHashCode = str.hashCode();
        Object obj = null;
        if (iHashCode != -2103039046) {
            if (iHashCode == 1823087802 && str.equals("comment_dialog_state")) {
                Object obj2 = c0rd42.LIZIZ;
                if (obj2 == null) {
                    obj2 = Boolean.FALSE;
                }
                if (Intrinsics.LJFF(obj2, 5)) {
                    C435190H4r c435190H4r = this.LLIZLLLIL;
                    if (c435190H4r != null) {
                        c435190H4r.LJJIIJZLJL();
                        return;
                    }
                    return;
                }
                if (Intrinsics.LJFF(obj2, 3)) {
                    C435190H4r c435190H4r2 = this.LLIZLLLIL;
                    if (c435190H4r2 == null) {
                        return;
                    }
                    c435190H4r2.LJJIIJZLJL();
                    return;
                }
                if (Intrinsics.LJFF(obj2, 6)) {
                    C435190H4r c435190H4r3 = this.LLIZLLLIL;
                    if (c435190H4r3 == null) {
                        return;
                    }
                    c435190H4r3.LJJIIJZLJL();
                    return;
                }
                if (Intrinsics.LJFF(obj2, 7)) {
                    LIZIZ();
                    return;
                } else {
                    Intrinsics.LJFF(obj2, 8);
                    return;
                }
            }
            return;
        }
        if (!str.equals("comment_aweme_and_link")) {
            return;
        }
        Object obj3 = c0rd42.LIZIZ;
        if (obj3 == null) {
            obj3 = null;
        }
        Pair pair = (Pair) obj3;
        if (pair == null || (aweme = (Aweme) pair.getFirst()) == null) {
            return;
        }
        this.LLILLJJLI = aweme;
        Object obj4 = c0rd42.LIZIZ;
        if (obj4 != null) {
            obj = obj4;
        }
        Pair pair2 = (Pair) obj;
        if (pair2 == null || (linkData = (LinkData) pair2.getSecond()) == null) {
            return;
        }
        this.LL = linkData;
        LIZ(this.LLILLJJLI, linkData);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long lValueOf;
        String str;
        int id = view.getId();
        if (id == R.id.yhm) {
            LinkData linkData = this.LL;
            String str2 = null;
            if (linkData != null && (str = linkData.creativeId) != null) {
                lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            } else {
                lValueOf = null;
            }
            long jLongValue = lValueOf.longValue();
            if (LIZIZ()) {
                AwemeRawAd awemeRawAd = new AwemeRawAd();
                awemeRawAd.setCreativeId(Long.valueOf(jLongValue));
                LinkData linkData2 = this.LL;
                if (linkData2 != null) {
                    str2 = linkData2.logExtra;
                }
                awemeRawAd.setLogExtra(str2);
                return;
            }
            LIZLLL();
            C435190H4r c435190H4r = this.LLIZLLLIL;
            if (c435190H4r != null) {
                c435190H4r.LJJIIJZLJL();
            }
            LIZJ("click", "button");
            return;
        }
        if (id == R.id.ms0) {
            if (this.LLIZLLLIL == null) {
                this.LLIZLLLIL = new C435190H4r(C2214201BlK.LJFF());
            }
            int iLIZJ = (int) C12ES.LIZJ(104.0f, getContext());
            int iLIZJ2 = (int) C12ES.LIZJ(138.0f, getContext());
            C435190H4r c435190H4r2 = this.LLIZLLLIL;
            if (c435190H4r2 != null) {
                c435190H4r2.LLJILLL = 0L;
                c435190H4r2.LLJJ = 0L;
                c435190H4r2.LLJIJIL = -1L;
            }
            ViewOnClickListenerC1029820cuC viewOnClickListenerC1029820cuC = new ViewOnClickListenerC1029820cuC(getContext());
            if (this.LL.reportEnabled) {
                TextView textView = viewOnClickListenerC1029820cuC.LLILZ;
                if (textView != null) {
                    C786410Ut5.LLIL(textView, 0);
                }
            } else {
                TextView textView2 = viewOnClickListenerC1029820cuC.LLILZ;
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 8);
                }
            }
            viewOnClickListenerC1029820cuC.setInnerClick(new InterfaceC1029860cuG() { // from class: X.0cuD
                @Override // X.InterfaceC1029860cuG
                public final void LIZ() {
                    C435190H4r c435190H4r3 = this.LIZ.LLIZLLLIL;
                    if (c435190H4r3 != null) {
                        c435190H4r3.LJJIIJZLJL();
                    }
                    this.LIZ.getClass();
                }

                @Override // X.InterfaceC1029860cuG
                public final void LIZIZ() {
                    C1029850cuF.LIZ.getClass();
                    IAdCommentDepend iAdCommentDepend = C1029850cuF.LIZIZ;
                    if (iAdCommentDepend != null) {
                        Context context = this.LIZ.getContext();
                        String strLJIJJLI = iAdCommentDepend.LJIJJLI();
                        LinkData linkData3 = this.LIZ.LL;
                        iAdCommentDepend.LJ(context, strLJIJJLI, linkData3 != null ? linkData3.webUrl : null);
                    }
                    this.LIZ.LIZJ("otherclick", "plan");
                }

                @Override // X.InterfaceC1029860cuG
                public final void LIZJ() {
                    C1029850cuF.LIZ.getClass();
                    IAdCommentDepend iAdCommentDepend = C1029850cuF.LIZIZ;
                    if (iAdCommentDepend != null) {
                        Context context = this.LIZ.getContext();
                        Aweme aweme = this.LIZ.LLILLJJLI;
                        iAdCommentDepend.LJIJ(context, aweme != null ? aweme.getAid() : null);
                    }
                }
            });
            C435190H4r c435190H4r3 = this.LLIZLLLIL;
            if (c435190H4r3 != null) {
                int iLIZIZ = C475630Ikz.LIZIZ(R.attr.bx, getContext());
                c435190H4r3.LLJ = iLIZIZ;
                C418600GbC c418600GbC = c435190H4r3.LLILLJJLI;
                if (c418600GbC != null) {
                    c418600GbC.setBgColor(iLIZIZ);
                }
            }
            C435190H4r c435190H4r4 = this.LLIZLLLIL;
            if (c435190H4r4 != null) {
                c435190H4r4.LJJIIZ(viewOnClickListenerC1029820cuC);
            }
            C435190H4r c435190H4r5 = this.LLIZLLLIL;
            if (c435190H4r5 != null) {
                c435190H4r5.LLILZ = iLIZJ;
                c435190H4r5.LLILZIL = iLIZJ2;
                c435190H4r5.setWidth(iLIZJ);
                c435190H4r5.setHeight(iLIZJ2);
                C418600GbC.LLJJJJLIIL = iLIZJ;
                C418600GbC.LLJJL = iLIZJ2;
            }
            C435190H4r c435190H4r6 = this.LLIZLLLIL;
            if (c435190H4r6 != null) {
                int i = c435190H4r6.LLILZ;
                if (i != 0 && c435190H4r6.LLILZIL != 0) {
                    c435190H4r6.getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(c435190H4r6.LLILZIL, 1073741824));
                } else {
                    c435190H4r6.getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
            }
            C435190H4r c435190H4r7 = this.LLIZLLLIL;
            if (c435190H4r7 != null) {
                C435190H4r.LJJIJ(c435190H4r7, this.LLILZLL);
            }
            LIZJ("otherclick", "adtag");
            return;
        }
        if (id == R.id.bh2) {
            LIZJ("click", "photo");
            LIZLLL();
            C435190H4r c435190H4r8 = this.LLIZLLLIL;
            if (c435190H4r8 == null) {
                return;
            }
            c435190H4r8.LJJIIJZLJL();
            return;
        }
        if (id == R.id.eu1) {
            LIZJ("click", "title");
            LIZLLL();
            C435190H4r c435190H4r9 = this.LLIZLLLIL;
            if (c435190H4r9 == null) {
                return;
            }
            c435190H4r9.LJJIIJZLJL();
            return;
        }
        if (id == R.id.title) {
            LIZJ("click", "source");
            LIZLLL();
            C435190H4r c435190H4r10 = this.LLIZLLLIL;
            if (c435190H4r10 == null) {
                return;
            }
            c435190H4r10.LJJIIJZLJL();
            return;
        }
        LIZLLL();
        LIZJ("click", "");
        C435190H4r c435190H4r11 = this.LLIZLLLIL;
        if (c435190H4r11 == null) {
            return;
        }
        c435190H4r11.LJJIIJZLJL();
    }

    public final void setDataCenter(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.yQ2("comment_aweme_and_link", this, true);
            dataCenter.yQ2("comment_dialog_state", this, true);
        }
    }

    public final void LIZ(Aweme aweme, LinkData linkData) {
        UrlModel urlModel;
        String str;
        String str2;
        C1331070kk5 hierarchy;
        C1331100kk8 c1331100kk8;
        C1331070kk5 hierarchy2;
        C1331100kk8 c1331100kk82;
        String str3;
        this.LL = linkData;
        this.LLILLJJLI = aweme;
        TuxTextView tuxTextView = this.LLILZ;
        String str4 = null;
        if (tuxTextView != null) {
            if (linkData != null) {
                str3 = linkData.source;
            } else {
                str3 = null;
            }
            tuxTextView.setText(str3);
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(43);
        }
        C424620Gku c424620Gku = this.LLILLL;
        if (c424620Gku != null && (hierarchy2 = c424620Gku.getHierarchy()) != null && (c1331100kk82 = hierarchy2.LIZJ) != null) {
            c1331100kk82.LJFF(C341940Daq.LIZ(0.5d));
        }
        C424620Gku c424620Gku2 = this.LLILLL;
        if (c424620Gku2 != null && (hierarchy = c424620Gku2.getHierarchy()) != null && (c1331100kk8 = hierarchy.LIZJ) != null) {
            c1331100kk8.LJFF = C475630Ikz.LIZIZ(R.attr.ng, getContext());
        }
        C424620Gku c424620Gku3 = this.LLILLL;
        LinkData linkData2 = this.LL;
        if (linkData2 != null) {
            urlModel = linkData2.avatarIcon;
        } else {
            urlModel = null;
        }
        C1324840ka2.LJFF(c424620Gku3, urlModel);
        TuxTextView tuxTextView3 = this.LLILZIL;
        if (tuxTextView3 != null) {
            LinkData linkData3 = this.LL;
            if (linkData3 != null) {
                str2 = linkData3.title;
            } else {
                str2 = null;
            }
            tuxTextView3.setText(str2);
        }
        TuxTextView tuxTextView4 = this.LLILZLL;
        if (tuxTextView4 != null) {
            LinkData linkData4 = this.LL;
            if (linkData4 != null) {
                str = linkData4.tipsText;
            } else {
                str = null;
            }
            tuxTextView4.setText(str);
        }
        TuxTextView tuxTextView5 = this.LLIZ;
        if (tuxTextView5 != null) {
            LinkData linkData5 = this.LL;
            if (linkData5 != null) {
                str4 = linkData5.buttonText;
            }
            tuxTextView5.setText(str4);
        }
        C10VP.LIZIZ(this.LLIZ);
        LIZIZ();
    }

    public final void LIZJ(String str, String str2) {
        C1029850cuF.LIZ.getClass();
        IAdCommentDepend iAdCommentDepend = C1029850cuF.LIZIZ;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.LJJIIZI(str, getContext(), this.LL, this.LLILLJJLI, str2);
        }
    }
}
