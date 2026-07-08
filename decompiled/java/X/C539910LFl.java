package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import irm.AkS16S0000000_8;
import irm.AkS80S0100000_8;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539910LFl extends AbstractC1664490tPr<C0LFX, C539920LFm> {
    public final ShortVideoContext LLJJJIL;
    public NLEEditor LLJJJJJIL;
    public SurfaceView LLJJJJLIIL;
    public View LLJJL;
    public List<C539860LFg> LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 340));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 341));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 101));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 102));

    public final C1463670oBx LLLLLJLJLL() {
        return (C1463670oBx) this.LLJL.getValue();
    }

    public C539910LFl(ShortVideoContext shortVideoContext) {
        this.LLJJJIL = shortVideoContext;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LFb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0LFX) obj).LIZ;
            }
        }, new AwS587S0100000_8(this, 236));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LFY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0LFX) obj).LIZIZ;
            }
        }, new AwS587S0100000_8(this, 237));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LFZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0LFX) obj).LIZJ;
            }
        }, new AwS587S0100000_8(this, 238));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0LFa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0LFX) obj).LIZLLL;
            }
        }, new AwS587S0100000_8(this, 239));
        C786410Ut5.I7(new AkS16S0000000_8(1), (View) this.LLJJJJ.getValue());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ad4, viewGroup, false);
        SurfaceView surfaceView = (SurfaceView) viewGroup2.findViewById(R.id.szr);
        C786410Ut5.LLIIII(surfaceView, 0);
        this.LLJJJJLIIL = surfaceView;
        Float fValueOf = Float.valueOf(C11VU.LIZ(20.0f));
        surfaceView.setClipToOutline(true);
        surfaceView.setOutlineProvider(new C0IDB(fValueOf, 4));
        TuxIconView tuxIconView = (TuxIconView) viewGroup2.findViewById(R.id.k3g);
        if (tuxIconView != null) {
            tuxIconView.setImageDrawable((Drawable) this.LLJLILLLLZIIL.getValue());
        }
        TuxIconView tuxIconView2 = (TuxIconView) viewGroup2.findViewById(R.id.k53);
        if (tuxIconView2 != null) {
            tuxIconView2.setImageDrawable((Drawable) this.LLJLIL.getValue());
        }
        View viewFindViewById = viewGroup2.findViewById(R.id.cue);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS80S0100000_8(this, 12), viewFindViewById);
        }
        View viewFindViewById2 = viewGroup2.findViewById(R.id.cwh);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new AkS80S0100000_8(this, 13), viewFindViewById2);
        }
        View viewFindViewById3 = viewGroup2.findViewById(R.id.cwh);
        this.LLJJL = viewFindViewById3;
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        return viewGroup2;
    }

    public static String LLLLLJIL(String str, String str2, String str3, String str4) throws Throwable {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Source file not found: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
        C0VSJ c0vsj2 = new C0VSJ(str2);
        if (!c0vsj2.exists()) {
            c0vsj2.mkdirs();
        }
        String str5 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.getDefault()).format(new Date());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str3);
        sbLIZ2.append('_');
        sbLIZ2.append(str5);
        sbLIZ2.append('_');
        sbLIZ2.append((int) (Math.random() * ((double) LSPassThroughRecordSizeConfig.DEFAULT)));
        sbLIZ2.append(str4);
        C0VSJ c0vsj3 = new C0VSJ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        C2286708xd.LJIIJ(c0vsj.getPath(), c0vsj3.getPath());
        return c0vsj3.getAbsolutePath();
    }
}
