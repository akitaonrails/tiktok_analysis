package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ep6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376260Ep6 extends AbstractC364960ESo<C379120Eti, Unit> {
    public AnonymousClass0956 LLJL;
    public AnonymousClass0956 LLJLIL;
    public Integer LLJZIJLIL;
    public boolean LLLF;
    public RunnableC376270Ep7 LLLFFI;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 268));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 267));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 265));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 261));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 269));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 266));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 263));
    public final C01GW LLLFF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(93));
    public final AwS584S0100000_5 LLLFZ = new AwS584S0100000_5(this, 262);

    @Override // X.AbstractC364960ESo
    public final int LLLLIILL() {
        return R.layout.c1l;
    }

    @Override // X.AbstractC364960ESo
    public final Function1<C1DRF, Unit> LLLLILI() {
        return new AwS584S0100000_5(this, 263);
    }

    @Override // X.AbstractC364960ESo
    public final C0EZ4 LLLLJ() {
        return new C0EZ4(null, null, new AwS549S0100000_5(this, 264), null, 11);
    }

    @Override // X.AbstractC364960ESo, com.bytedance.scene.Scene
    public final void onDestroyView() {
        Window window;
        Integer num = this.LLJZIJLIL;
        if (num != null) {
            int iIntValue = num.intValue();
            Activity activity = this.mActivity;
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(iIntValue);
            }
        }
        this.LLJZIJLIL = null;
        RunnableC376270Ep7 runnableC376270Ep7 = this.LLLFFI;
        if (runnableC376270Ep7 != null) {
            ((Handler) this.LLLFF.getValue()).removeCallbacks(runnableC376270Ep7);
        }
        this.LLLFFI = null;
        super.onDestroyView();
    }

    @Override // X.AbstractC364960ESo
    public final Function1<C539960LFq, Unit> LLLLIL() {
        return this.LLLFZ;
    }

    @Override // X.AbstractC364960ESo
    public final C0ESS LLLLJI() {
        return C0ESS.DEFAULT;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[PHI: r5
      0x00f0: PHI (r5v4 int) = (r5v1 int), (r5v6 int) binds: [B:59:0x00ec, B:17:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0Ep7, java.lang.Runnable] */
    @Override // X.AbstractC364960ESo, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376260Ep6.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.AbstractC364960ESo, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG c19eg;
        boolean z;
        VideoPublishEditModel videoPublishEditModel;
        super.onViewCreated(view, bundle);
        Activity activity = this.mActivity;
        if (activity instanceof C19EG) {
            c19eg = (C19EG) activity;
        } else {
            c19eg = null;
        }
        C0EHK.LJIIL(c19eg);
        View viewFindViewById = view.findViewById(R.id.w10);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = ScreenUtils.getStatusBarHeight(requireSceneContext());
            C786410Ut5.W5(viewFindViewById, layoutParams);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        boolean z2 = true;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LLJLIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C2212808li(this, null), 2);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJL;
        if (anonymousClass09562 != null && anonymousClass09562.isActive()) {
            return;
        }
        C379120Eti c379120Eti = (C379120Eti) this.LLJJIJIIJIL;
        if (c379120Eti == null || (videoPublishEditModel = c379120Eti.LLIZLLLIL) == null || !videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            z2 = false;
        }
        this.LLJL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C2212908lj(z2, null), 2);
    }

    public final void LLLLLJIL(int i, int i2, String str) {
        EnumC359320E6w enumC359320E6w;
        String str2;
        C379120Eti c379120Eti = (C379120Eti) this.LLJJIJIIJIL;
        if (c379120Eti == null || c379120Eti.LLJJJ) {
            return;
        }
        c379120Eti.LLJJJ = true;
        RunnableC376270Ep7 runnableC376270Ep7 = this.LLLFFI;
        if (runnableC376270Ep7 != null) {
            ((Handler) this.LLLFF.getValue()).removeCallbacks(runnableC376270Ep7);
        }
        this.LLLFFI = null;
        long jCurrentTimeMillis = System.currentTimeMillis() - c379120Eti.LLJJIJIIJIL;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        C378370EsV c378370EsV = C378370EsV.LIZ;
        VideoPublishEditModel videoPublishEditModel = c379120Eti.LLIZLLLIL;
        if (C0E9X.LIZ[c379120Eti.LLJJIII.ordinal()] == 1) {
            enumC359320E6w = EnumC359320E6w.AI_EXTEND;
        } else {
            enumC359320E6w = EnumC359320E6w.AI_CREATE;
        }
        String value = c379120Eti.LLJJIJIL.getValue();
        AbstractC359300E6u abstractC359300E6u = c379120Eti.LLJILJIL;
        boolean z = c379120Eti.LLJJI;
        boolean z2 = c379120Eti.LLJILJILJ;
        boolean z3 = c379120Eti.LLJJ;
        c378370EsV.getClass();
        if (((Boolean) C284580BDk.LIZ.getValue()).booleanValue() && videoPublishEditModel != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            String creationId = videoPublishEditModel.getCreationId();
            String str3 = "";
            if (creationId == null) {
                creationId = "";
            }
            c2344009Gk.LJIIIIZZ("creation_id", creationId);
            String strLJI = C1403540mcy.LJI(videoPublishEditModel, null);
            if (strLJI != null) {
                str3 = strLJI;
            }
            c2344009Gk.LJIIIIZZ("shoot_way", str3);
            c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c2344009Gk.LJIIIIZZ("scenerio", enumC359320E6w.getScenerio());
            c2344009Gk.LJIIIIZZ("business_type", enumC359320E6w.getScenerio());
            c2344009Gk.LJIIIIZZ("source_tag", value);
            c2344009Gk.LJIIIIZZ("render_kind", str);
            if (abstractC359300E6u == null || (str2 = abstractC359300E6u.LIZ) == null) {
                str2 = "edit_toolbar";
            }
            c2344009Gk.LJIIIIZZ("enter_source", str2);
            c2344009Gk.LJIIIIZZ("is_from_pip", String.valueOf(z));
            c2344009Gk.LIZJ(z2 ? 1 : 0, "is_modify");
            c2344009Gk.LIZJ(z3 ? 1 : 0, "is_edit_prompt");
            c2344009Gk.LJIIIIZZ("first_frame_duration_ms", String.valueOf(jCurrentTimeMillis));
            c2344009Gk.LIZJ(i, "image_count");
            c2344009Gk.LIZJ(i2, "video_count");
            c2344009Gk.LIZJ(i + i2, "total_count");
            C20684815ws.LJIILLIIL("aigc_panel_render_duration", c2344009Gk.LIZ);
        }
    }
}
