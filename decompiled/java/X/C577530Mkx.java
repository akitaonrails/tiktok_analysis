package X;

import Y.ATListenerS442S0100000_8;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS134S0201000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Mkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577530Mkx extends AbstractC1664490tPr<C577460Mkq, C577470Mkr> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 745));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 746));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 744));
    public final Rect LLJJJJLIIL = new Rect();

    public final C577540Mky LLLLLJIL() {
        return (C577540Mky) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLLJIL().setAdapter(new InterfaceC1657540tEe<AbstractC420130Gdf, C420100Gdc>() { // from class: X.0Gej
            @Override // X.InterfaceC1657540tEe
            public final InterfaceC1657550tEf LIZ(Context context, AbstractC1652980t7I abstractC1652980t7I, int i, int i2, Function1 function1) {
                AbstractC420130Gdf abstractC420130Gdf = (AbstractC420130Gdf) abstractC1652980t7I;
                return new C420100Gdc(this.LIZ.requireSceneContext(), abstractC420130Gdf, new AwS134S0201000_8(i, this.LIZ, abstractC420130Gdf, 7));
            }
        });
        LLLLLJIL().setData((List) this.LLJJJJJIL.getValue());
        ((View) this.LLJJJJ.getValue()).setOnTouchListener(new ATListenerS442S0100000_8(this, 3));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Mkv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C577460Mkq) obj).LIZIZ;
            }
        }, new AwS587S0100000_8(this, 481));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Mkw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C577460Mkq) obj).LIZJ;
            }
        }, new AwS587S0100000_8(this, 484));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Mks
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C577460Mkq) obj).LIZLLL;
            }
        }, new AwS587S0100000_8(this, 488));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ad3, viewGroup, false);
    }
}
