package X;

import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS608S0100000_29;
import nv7.c0;

/* JADX INFO: renamed from: X.12DF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12DF extends AbstractC1664490tPr<C12D5, C12DA> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C1DRG LLJJJIL;
    public final C1664750tQH LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C1664750tQH LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C197039127h LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public C19724112Fb LLLF;
    public boolean LLLFF;
    public final C01GW LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12DF.class, "titleBarApi", "getTitleBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12DF.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12DF.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final void LLLLLJIL() {
        View viewFindViewById;
        C201955140j.LJIILL(C201962140q.LIZIZ, "StripMusicPreviewComponent", "update strip music scene layout");
        C1664750tQH c1664750tQH = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        ViewGroup.MarginLayoutParams marginLayoutParamsEj = ((InterfaceC1455860nzM) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1])).ej();
        View view = this.mView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = marginLayoutParamsEj.topMargin;
            C786410Ut5.W5(view, marginLayoutParams);
        }
        View viewFindViewById2 = findViewById(R.id.ji7);
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            int iN2 = ((InterfaceC1457610o2B) this.LLJJJJ.getValue(this, interfaceC2217461BqaArr[0])).n2();
            int i = marginLayoutParamsEj.topMargin;
            if (i < iN2) {
                marginLayoutParams2.topMargin = iN2 - i;
            }
            C786410Ut5.W5(viewFindViewById2, marginLayoutParams2);
        }
        if (C1462920oAk.LIZLLL() && (viewFindViewById = findViewById(R.id.m94)) != null) {
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            marginLayoutParams3.bottomMargin = c1660590tJZ != null ? c1660590tJZ.LIZIZ() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            C786410Ut5.W5(viewFindViewById, marginLayoutParams3);
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.height = marginLayoutParamsEj.height;
            C786410Ut5.W5(view2, marginLayoutParams4);
        }
        C19724112Fb c19724112Fb = this.LLLF;
        if (c19724112Fb != null) {
            ViewGroup.LayoutParams layoutParams5 = c19724112Fb.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C19ME c19me = (C19ME) layoutParams5;
            c19me.bottomToBottom = -1;
            c19me.topToTop = R.id.e0s;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (marginLayoutParamsEj.height - ((c19724112Fb.getClickHotspotHeight() - c19724112Fb.getRailHeight()) / 2)) - c19724112Fb.getRailHeight();
            C786410Ut5.W5(c19724112Fb, c19me);
        }
        View view3 = this.LLJLLL;
        if (view3 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
            view3.setBackground(c384050F3z.LIZ(requireSceneContext()));
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJJIL;
    }

    public C12DF(C1DRG c1drg) {
        this.LLJJJIL = c1drg;
        new LinkedHashMap();
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, InterfaceC1457600o2A.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLLFFI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 703));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C12Y7 c12y7 = new C12Y7(this, 6, 42);
        View viewFindViewById = findViewById(R.id.bmy);
        this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(c12y7, viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.y4q);
        this.LLJJL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(c12y7, viewFindViewById2);
        }
        C1664750tQH c1664750tQH = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        String str = ((VideoPublishEditModel) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).creativeModel.musicBuzModel.musicMuteDetailUrl;
        if (str == null || str.length() == 0) {
            C337180DJs.LIZ(this.LLJJL);
        }
        C197039127h c197039127h = (C197039127h) findViewById(R.id.af3);
        this.LLJL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, c12y7);
        }
        C197039127h c197039127h2 = this.LLJL;
        if (c197039127h2 != null) {
            c197039127h2.LJJJJL(new AwS585S0100000_6(this, 220));
        }
        View viewFindViewById3 = findViewById(R.id.rj2);
        this.LLJLIL = viewFindViewById3;
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(c12y7, viewFindViewById3);
        }
        View viewFindViewById4 = findViewById(R.id.e0s);
        this.LLJLILLLLZIIL = viewFindViewById4;
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(c12y7, viewFindViewById4);
        }
        this.LLJLLL = findViewById(R.id.tdg);
        this.LLJZ = findViewById(R.id.cev);
        this.LLJLL = findViewById(R.id.lr1);
        this.LLLF = (C19724112Fb) findViewById(R.id.ujm);
        this.LLJLLIL = findViewById(R.id.video_timestamp);
        this.LLJZIJLIL = (TuxTextView) findViewById(R.id.fbg);
        this.LLL = (TuxTextView) findViewById(R.id.yg3);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12DH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C12D5) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 423));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12DI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C12D5) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 424));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12DJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C12D5) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 425));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12DE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C12D5) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 426));
        C19724112Fb c19724112Fb = this.LLLF;
        if (c19724112Fb != null) {
            c19724112Fb.setOnSliderListener(new InterfaceC19724212Fc() { // from class: X.12DG
                @Override // X.InterfaceC19724212Fc
                public final void LIZ(C19724112Fb c19724112Fb2) {
                    this.LIZ.LLLLIL().LJFF.invoke(Integer.valueOf((this.LIZ.LLLLILI().LIZ.LIZJ * c19724112Fb2.getIndicator()) / 100), new AwS425S0200000_24(C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C1569610qwp(this.LIZ, null), 3), this.LIZ, 51));
                }

                @Override // X.InterfaceC19724212Fc
                public final void LIZIZ(C19724112Fb c19724112Fb2) {
                    C12DF c12df = this.LIZ;
                    c12df.LLLFF = true;
                    C337180DJs.LIZJ(c12df.LLJLLIL);
                }

                @Override // X.InterfaceC19724212Fc
                public final void LIZJ(int i, boolean z) {
                    int i2 = (this.LIZ.LLLLILI().LIZ.LIZJ * i) / 100;
                    TuxTextView tuxTextView = this.LIZ.LLJZIJLIL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(DateUtils.formatElapsedTime(((long) i2) / 1000));
                    }
                    C12DF c12df = this.LIZ;
                    TuxTextView tuxTextView2 = c12df.LLL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(DateUtils.formatElapsedTime(((long) c12df.LLLLILI().LIZ.LIZJ) / 1000));
                    }
                }
            });
        }
        ((InterfaceC1446740nke) this.LLJJJJJIL.getValue(this, interfaceC2217461BqaArr[1])).Te1().observe(this, new AObserverS231S0100000_29(this, 113));
        ((InterfaceC1457610o2B) this.LLJJJJ.getValue(this, interfaceC2217461BqaArr[0])).In0(this, new AwS608S0100000_29(this, 422));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.err, viewGroup, false);
    }
}
