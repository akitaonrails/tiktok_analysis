package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851680yHm extends AbstractC1664490tPr<C1851630yHh, C1851730yHr> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1180));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1178));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1176));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1179));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1177));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1175));

    public final InterfaceC1851500yHU LLLLLJIL() {
        return (InterfaceC1851500yHU) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onViewCreated(this.mView, bundle);
        C1654320t9S.LIZIZ(this, AFwS283S0000000_35.get$arr$(165));
        C1664590tQ1.LIZLLL(this, "AIPlaygroundToolsScene", false, AFwS269S0000000_27.get$arr$(394), 2);
        C1664600tQ2.LIZ(this, "AIPlaygroundToolsScene", new AwS395S0200000_29(this, LLLLIL().LIZ.invoke(), 91));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0yHl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851630yHh) obj).LIZ;
            }
        }, new AwS606S0100000_27(this, 407));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0yHn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851630yHh) obj).LIZIZ;
            }
        }, new AwS606S0100000_27(this, 409));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0yHo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851630yHh) obj).LIZJ;
            }
        }, new AwS606S0100000_27(this, 413));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0yHp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851630yHh) obj).LIZLLL;
            }
        }, new AwS606S0100000_27(this, 417));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0yHq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851630yHh) obj).LJ;
            }
        }, new AwS606S0100000_27(this, 399));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0yHj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851630yHh) obj).LJI;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 401));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0yHk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851630yHh) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 404));
        int statusBarHeight = ScreenUtils.getStatusBarHeight(getSceneContext());
        View view = this.mView;
        if (view != null) {
            view.setPadding(0, statusBarHeight, 0, 0);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.n1, viewGroup, false);
    }
}
