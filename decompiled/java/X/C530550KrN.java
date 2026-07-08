package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0KrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530550KrN extends AbstractC1664490tPr<C530600KrS, C530960Ks2> {
    public final ShortVideoContext LLJJJIL;
    public C530520KrK LLJJJJ;
    public final Keva LLJJJJJIL = Keva.getRepo("template_use_camera_clip");

    public final int LLLLLJIL() {
        C530520KrK c530520KrK = this.LLJJJJ;
        if (c530520KrK != null) {
            return c530520KrK.getSelectedPosition();
        }
        return 0;
    }

    public C530550KrN(ShortVideoContext shortVideoContext) {
        this.LLJJJIL = shortVideoContext;
    }

    public final void bu(String str) {
        Context contextRequireSceneContext = requireSceneContext();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(str);
        C1390380mHk.LIZJ(contextRequireSceneContext, 3009, creativeToastBuilder);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0KrV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C530600KrS) obj).LIZ;
            }
        }, new AwS587S0100000_8(this, 247));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0KrW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C530600KrS) obj).LJII;
            }
        }, new AwS587S0100000_8(this, 222));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0KrO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C530600KrS) obj).LJ;
            }
        }, new AwS587S0100000_8(this, 223));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0KrP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C530600KrS) obj).LJI;
            }
        }, new AwS587S0100000_8(this, 225));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0KrQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C530600KrS) obj).LIZLLL;
            }
        }, new AwS587S0100000_8(this, 243));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0KrR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C530600KrS) obj).LIZIZ;
            }
        }, new AwS587S0100000_8(this, 244));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0KrU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C530600KrS) obj).LIZJ;
            }
        }, new AwS587S0100000_8(this, 246));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.acv, viewGroup, false);
        C530520KrK c530520KrK = (C530520KrK) viewGroup2.findViewById(R.id.xhf);
        this.LLJJJJ = c530520KrK;
        if (c530520KrK != null) {
            c530520KrK.setOnTemplateSelectedListener(new AwS622S0100000_8(this, 18));
        }
        C530520KrK c530520KrK2 = this.LLJJJJ;
        if (c530520KrK2 != null) {
            c530520KrK2.setOnNextClickListener(new AwS552S0100000_8(this, 342));
        }
        C530520KrK c530520KrK3 = this.LLJJJJ;
        if (c530520KrK3 != null) {
            c530520KrK3.setCanDeleteItemPredicate(new AwS587S0100000_8(this, 240));
        }
        C530520KrK c530520KrK4 = this.LLJJJJ;
        if (c530520KrK4 != null) {
            c530520KrK4.setCanClickItemPredicate(new AwS587S0100000_8(this, 241));
        }
        C530520KrK c530520KrK5 = this.LLJJJJ;
        if (c530520KrK5 != null) {
            c530520KrK5.setOnTemplateDeleteListener(new AwS587S0100000_8(this, 242));
        }
        return viewGroup2;
    }
}
