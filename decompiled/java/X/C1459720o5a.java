package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS73S0210000_22;

/* JADX INFO: renamed from: X.0o5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459720o5a extends Scene implements InterfaceC379610EuV {
    public static final C1455650nz1 LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1DRG LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 389));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459720o5a.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1459720o5a.class, "titleBarApi", "getTitleBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0)};
        LLJILLL = new C1455650nz1();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1459720o5a(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1457600o2A.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C1EOF c1eof;
        int i;
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.xrc);
        if (viewGroup == null) {
            return;
        }
        if (!C426750GoL.LIZLLL(view.getContext())) {
            viewGroup.setLayoutDirection(1);
        } else {
            viewGroup.setLayoutDirection(0);
        }
        C786410Ut5.LJJJJI(viewGroup);
        C1664750tQH c1664750tQH = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        int iN2 = ((InterfaceC1457610o2B) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1])).n2();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = iN2;
            C786410Ut5.W5(viewGroup, marginLayoutParams);
            ((InterfaceC1457610o2B) this.LLJILJIL.getValue(this, interfaceC2217461BqaArr[1])).In0(this, new AwS382S0200000_16(this, viewGroup, 46));
            C1EOF c1eof2 = C1EOF.PRIVACY_SETTING;
            i3 i3Var = new i3(R.raw.icon_gear, -1, c1eof2, R.attr.a1h, 0, false, false, false, false, null, null, null, 0, null, null, false, false, 0, null, 0, 0.0f, 268435440);
            C1659250tHP c1659250tHP = new C1659250tHP(this, this.LLJI);
            viewGroup.addView(c1659250tHP.LIZIZ(0, viewGroup));
            c1659250tHP.LIZJ(i3Var);
            IMSharePanelApi.LIZ.getClass();
            if (C1599690rjL.LIZ().LIZ().LJII()) {
                c1eof = C1EOF.SEND_TO_DM;
                i = R.raw.icon_arrow_turn_up_right;
            } else {
                c1eof = C1EOF.SAVE_LOCAL;
                i = R.raw.icon_arrow_down_to_line;
            }
            i3 i3Var2 = new i3(i, -1, c1eof, R.attr.a1h, 0, false, false, false, false, null, null, new AwS73S0210000_22(this, new C013C(), C0CHQ.LIZ().getPublishService().LJJIII(), 1), 0, null, null, false, false, 0, null, 0, 0.0f, 268419056);
            C1659250tHP c1659250tHP2 = new C1659250tHP(this, this.LLJI);
            viewGroup.addView(c1659250tHP2.LIZIZ(1, viewGroup));
            c1659250tHP2.LIZJ(i3Var2);
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJIJIL.getValue(this, interfaceC2217461BqaArr[0]);
            LLJILLL.getClass();
            C572240McQ.LJII(videoPublishEditModel, C1455650nz1.LIZ(c1eof2), "style_edit_page");
            C572240McQ.LJII((VideoPublishEditModel) this.LLJIJIL.getValue(this, interfaceC2217461BqaArr[0]), C1455650nz1.LIZ(c1eof), "style_edit_page");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.erz, viewGroup, false);
    }
}
