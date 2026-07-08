package X;

import Y.ACListenerS112S0200000_8;
import Y.ARunnableS41S0300000_8;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.ss.android.vesdk.VEMediaParser;
import com.zhiliaoapp.musically.R;
import irm.AkS53S0200000_8;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C529620Kps extends RecyclerView.ViewHolder {
    public final ViewGroup LL;
    public final RoundedFrameLayout LLILLJJLI;
    public final C1322110kVd LLILLL;
    public final View LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxIconView LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final TuxIconView LLJIJIL;
    public final View LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final FrameLayout LLJILLL;
    public final ImageView LLJJ;
    public final View LLJJI;
    public final View LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public final /* synthetic */ AbstractC529520Kpi LLJJIJIL;

    public C529620Kps() {
        throw null;
    }

    public void P5(ViewGroup viewGroup) {
        int i = this.LLJJIJI;
        this.LLJJIJIIJIL = i;
        R5(i, i, viewGroup);
        C786410Ut5.LJZI(8, this.LLJJ);
        C786410Ut5.LJLLLLLL(0, this.LLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529620Kps(AbstractC529520Kpi abstractC529520Kpi, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cz0, viewGroup, false));
        this.LLJJIJIL = abstractC529520Kpi;
        this.LL = viewGroup;
        this.LLILLJJLI = (RoundedFrameLayout) this.itemView.findViewById(R.id.video_cover_layout);
        this.LLILLL = (C1322110kVd) this.itemView.findViewById(R.id.video_cover);
        this.LLILZ = this.itemView.findViewById(R.id.uy1);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.gcl);
        this.LLILZLL = (TuxIconView) this.itemView.findViewById(R.id.g4m);
        this.itemView.findViewById(R.id.ukw);
        View viewFindViewById = this.itemView.findViewById(R.id.fkz);
        this.LLIZ = viewFindViewById;
        this.LLIZLLLIL = this.itemView.findViewById(R.id.ojz);
        View viewFindViewById2 = this.itemView.findViewById(R.id.ukg);
        this.LLJ = viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.fky);
        this.LLJI = viewFindViewById3;
        this.LLJIJIL = (TuxIconView) this.itemView.findViewById(R.id.loe);
        this.LLJILJIL = this.itemView.findViewById(R.id.yb);
        View viewFindViewById4 = this.itemView.findViewById(R.id.ya);
        this.LLJILJILJ = (TuxIconView) this.itemView.findViewById(R.id.n3g);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.tsc);
        this.LLJILLL = frameLayout;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.fkx);
        this.LLJJ = imageView;
        View viewFindViewById5 = this.itemView.findViewById(R.id.rp6);
        this.LLJJI = viewFindViewById5;
        this.LLJJIII = this.itemView.findViewById(R.id.j4o);
        this.LLJJIJI = (int) C11VU.LIZIZ(64.0f, viewGroup.getContext());
        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(abstractC529520Kpi.LLLJ() - 1));
        Drawable drawableLIZLLL = C426580Go4.LIZLLL(0, C960203pA.LIZ(R.attr.zg, viewGroup.getContext()), new float[]{0.0f, 0.0f, fLIZIZ, fLIZIZ, 0.0f, 0.0f, fLIZIZ, fLIZIZ});
        Drawable drawableLIZLLL2 = C426580Go4.LIZLLL(0, C960203pA.LIZ(R.attr.zg, viewGroup.getContext()), new float[]{fLIZIZ, fLIZIZ, 0.0f, 0.0f, fLIZIZ, fLIZIZ, 0.0f, 0.0f});
        if (C1388580mEq.LIZIZ(frameLayout.getContext())) {
            imageView.setBackground(drawableLIZLLL2);
            viewFindViewById3.setBackground(drawableLIZLLL2);
            viewFindViewById4.setBackground(drawableLIZLLL);
        } else {
            imageView.setBackground(drawableLIZLLL);
            viewFindViewById3.setBackground(drawableLIZLLL);
            viewFindViewById4.setBackground(drawableLIZLLL2);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJFF = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
        Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
        viewFindViewById2.setBackground(drawableLIZ);
        viewFindViewById5.setBackground(drawableLIZ);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = (int) C11VU.LIZIZ(36.0f, viewFindViewById.getContext());
        layoutParams.width = (int) C11VU.LIZIZ(36.0f, viewFindViewById.getContext());
        C786410Ut5.W5(this.LLIZ, layoutParams);
    }

    public void L5(TikTokMediaModel tikTokMediaModel, C529620Kps c529620Kps) {
        Uri uriLJIILIIL;
        Uri uri;
        C1331070kk5 hierarchy;
        C1322110kVd c1322110kVd = c529620Kps.LLILLL;
        if (c1322110kVd != null && (hierarchy = c1322110kVd.getHierarchy()) != null) {
            C1331100kk8 c1331100kk8 = new C1331100kk8();
            c1331100kk8.LJII(C418440Gaw.LIZIZ(Float.valueOf(this.LLJJIJIL.LLLJ())));
            hierarchy.LJJIII(c1331100kk8);
        }
        if (tikTokMediaModel.LJIIL()) {
            AbstractC529520Kpi abstractC529520Kpi = this.LLJJIJIL;
            String str = tikTokMediaModel.thumbnailOnlineUrl;
            if (str != null) {
                uri = UriProtector.parse(str);
            } else {
                uri = null;
            }
            abstractC529520Kpi.LLLII(c529620Kps, uri);
        } else {
            Function0<Boolean> function0 = this.LLJJIJIL.LLIZ;
            if (function0 != null && function0.invoke().booleanValue() && tikTokMediaModel.LJIILJJIL() && C527210Klz.LIZIZ(tikTokMediaModel)) {
                VEMediaParser vEMediaParser = new VEMediaParser();
                vEMediaParser.init(tikTokMediaModel.LJFF());
                HandlerHook.viewPost(c529620Kps.itemView, new ARunnableS41S0300000_8(c529620Kps, tikTokMediaModel, vEMediaParser, 0));
            } else {
                if (tikTokMediaModel.loadSource == EnumC538220L8y.PHOTO_PICKER && !TextUtils.isEmpty(tikTokMediaModel.mediaPickerAbsolutePath)) {
                    uriLJIILIIL = Uri.fromFile(new C0VSJ(tikTokMediaModel.mediaPickerAbsolutePath));
                } else if (C530690Krb.LIZIZ(tikTokMediaModel)) {
                    String str2 = tikTokMediaModel.thumbnail;
                    if (str2 == null || (uriLJIILIIL = UriProtector.parse(str2)) == null) {
                        uriLJIILIIL = Uri.EMPTY;
                    }
                } else {
                    uriLJIILIIL = C2471909mP.LJIILIIL(tikTokMediaModel.LJFF());
                }
                this.LLJJIJIL.LLLII(c529620Kps, uriLJIILIIL);
            }
        }
        N5(tikTokMediaModel, c529620Kps);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r5, X.C529620Kps r6) {
        /*
            r4 = this;
            X.0Kpi r0 = r4.LLJJIJIL
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo> r1 = r0.LLJI
            r3 = 0
            if (r1 == 0) goto L4d
            java.lang.String r0 = r5.id
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo r1 = (com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo) r1
        Lf:
            X.0Mmd r0 = X.C578570Mmd.LIZ
            r0.getClass()
            boolean r0 = X.C578570Mmd.LIZ()
            r2 = 0
            if (r0 == 0) goto L4f
            boolean r0 = r5.LJIIJJI()
            if (r0 != 0) goto L23
            if (r1 == 0) goto L4f
        L23:
            com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo r0 = r5.livePhotoInfo
            if (r0 != 0) goto L4b
            if (r1 == 0) goto L2d
        L29:
            java.lang.String r3 = r1.getLivePhotoPreviewMode()
        L2d:
            java.lang.String r0 = "STATIC"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L47
            r1 = 2130774176(0x7f0108a0, float:1.715152E38)
        L38:
            com.bytedance.tux.icon.TuxIconView r0 = r6.LLJILJILJ
            if (r0 == 0) goto L3f
            X.C786410Ut5.LLLLLLZZ(r0, r2)
        L3f:
            com.bytedance.tux.icon.TuxIconView r0 = r6.LLJILJILJ
            if (r0 == 0) goto L46
            r0.setIconRes(r1)
        L46:
            return
        L47:
            r1 = 2130774171(0x7f01089b, float:1.715151E38)
            goto L38
        L4b:
            r1 = r0
            goto L29
        L4d:
            r1 = r3
            goto Lf
        L4f:
            com.bytedance.tux.icon.TuxIconView r1 = r6.LLJILJILJ
            if (r1 == 0) goto L58
            r0 = 8
            X.C786410Ut5.LLLLLLZZ(r1, r0)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C529620Kps.N5(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, X.0Kps):void");
    }

    public final void I5(TikTokMediaModel tikTokMediaModel, C529620Kps c529620Kps, int i) {
        if (tikTokMediaModel != null) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_music_stick_point", true, false) && !C0CHQ.LIZ().getAccountService().LIZ()) {
                P5(this.LL);
            }
            L5(tikTokMediaModel, c529620Kps);
            S5(tikTokMediaModel, c529620Kps, i);
        }
        C786410Ut5.I7(new AkS53S0200000_8(this.LLJJIJIL, tikTokMediaModel, 0), this.LLIZ);
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS112S0200000_8(this.LLJJIJIL, tikTokMediaModel, 0));
        }
    }

    public final void R5(int i, int i2, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        C786410Ut5.W5(this.itemView, layoutParams);
        View view = this.LLJ;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = i2;
        C786410Ut5.W5(view, layoutParams2);
        C1322110kVd c1322110kVd = this.LLILLL;
        if (c1322110kVd != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) c1322110kVd.getLayoutParams();
            layoutParams3.width = i;
            layoutParams3.height = i2;
            C786410Ut5.c7(c1322110kVd, layoutParams3);
        }
        View view2 = this.LLIZ;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        layoutParams4.width = (int) C11VU.LIZIZ(20.0f, viewGroup.getContext());
        layoutParams4.height = (int) C11VU.LIZIZ(20.0f, viewGroup.getContext());
        C786410Ut5.W5(view2, layoutParams4);
        RoundedFrameLayout roundedFrameLayout = this.LLILLJJLI;
        if (roundedFrameLayout != null) {
            roundedFrameLayout.setRadius((int) C418440Gaw.LIZIZ(Float.valueOf(this.LLJJIJIL.LLLJ())));
        }
    }

    public final void S5(TikTokMediaModel tikTokMediaModel, C529620Kps c529620Kps, int i) {
        int i2;
        int i3;
        String strK4;
        if (tikTokMediaModel == null) {
            return;
        }
        int i4 = 8;
        C786410Ut5.LLLLLLZZ(c529620Kps.LLILZLL, 8);
        boolean z = true;
        if (tikTokMediaModel.LJIILJJIL()) {
            Function0<Boolean> function0 = this.LLJJIJIL.LLIZ;
            if (function0 != null && function0.invoke().booleanValue() && C527210Klz.LIZIZ(tikTokMediaModel)) {
                i3 = tikTokMediaModel.endTime - tikTokMediaModel.startTime;
            } else {
                i3 = (int) tikTokMediaModel.duration;
            }
            int iLIZIZ = C814420VxA.LIZIZ((i3 * 1.0f) / LSPassThroughRecordSizeConfig.DEFAULT);
            TuxTextView tuxTextView = this.LLILZIL;
            this.LLJJIJIL.getClass();
            int i5 = iLIZIZ % 60;
            int i6 = iLIZIZ / 60;
            int i7 = i6 / 60;
            int i8 = i6 % 60;
            if (i7 == 0) {
                strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i8), Integer.valueOf(i5)}, 2));
            } else {
                strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i5)}, 3));
            }
            tuxTextView.setText(strK4);
            C786410Ut5.LLLLZLL(this.LLILZIL, 0);
        } else {
            C786410Ut5.LLLLZLL(this.LLILZIL, 8);
        }
        if (this.LLILZLL.getVisibility() != 0 && this.LLILZIL.getVisibility() != 0) {
            z = false;
        }
        View view = this.LLJJIII;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        View view2 = this.LLJJI;
        if (this.LLJJIJIL.LLILZ == i) {
            i4 = 0;
        }
        C786410Ut5.LJLLLLLL(i4, view2);
        this.LLJJIJIL.getClass();
        N5(tikTokMediaModel, c529620Kps);
    }
}
