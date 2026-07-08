package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.builtin.AlbumDefaultBottomActionBarConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Kk5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526030Kk5 extends AbstractC1664490tPr<C525750Kjd, C1260004wQ> {
    public final AlbumDefaultBottomActionBarConfig LLJJJIL;
    public final ChooseMediaViewModel LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public C197039127h LLJJJJLIIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        TuxTextView tuxTextView;
        super.onActivityCreated(bundle);
        this.LLJJJJJIL = (TuxTextView) findViewById(R.id.xo);
        this.LLJJJJLIIL = (C197039127h) findViewById(R.id.xp);
        String str = this.LLJJJIL.hintText;
        if (str != null && (tuxTextView = this.LLJJJJJIL) != null) {
            tuxTextView.setText(str);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(this.LLJJJIL.O7().nextBtnColor);
        Drawable drawableLIZ = c384050F3z.LIZ(requireSceneContext());
        Integer numLIZJ = C1308910kAL.LIZJ(this.LLJJJIL.O7().nextBtnTitleColor, requireSceneContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C197039127h c197039127h = this.LLJJJJLIIL;
            if (c197039127h != null) {
                c197039127h.setTextColor(iIntValue);
            }
        }
        C197039127h c197039127h2 = this.LLJJJJLIIL;
        if (c197039127h2 != null) {
            c197039127h2.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(144)));
        }
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0Kjk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C525750Kjd) obj).LIZ);
            }
        }), new AwS374S0200000_8(this, drawableLIZ, 41));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0Kjl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C525750Kjd) obj).LIZIZ);
            }
        }), new AwS587S0100000_8(this, 92));
        C197039127h c197039127h3 = this.LLJJJJLIIL;
        if (c197039127h3 != null) {
            C786410Ut5.I7(new AkS80S0100000_8(this, 4), c197039127h3);
        }
    }

    public C526030Kk5(AlbumDefaultBottomActionBarConfig albumDefaultBottomActionBarConfig, ChooseMediaViewModel chooseMediaViewModel) {
        this.LLJJJIL = albumDefaultBottomActionBarConfig;
        this.LLJJJJ = chooseMediaViewModel;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.emv, viewGroup, false);
    }
}
