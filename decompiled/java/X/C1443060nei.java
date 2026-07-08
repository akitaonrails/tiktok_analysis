package X;

import Y.ACListenerS156S0100000_22;
import Y.ARunnableS55S0300000_22;
import Y.ARunnableS91S0200000_22;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0nei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443060nei implements InterfaceC1445880njG {
    public final C19EG LL;
    public final C1439050nYF LLILLJJLI;
    public final InterfaceC1442990neb LLILLL;
    public final View LLILZ;
    public final boolean LLILZIL;
    public final PublishFailMsg LLILZLL;
    public ImageView LLIZ;
    public ImageView LLIZLLLIL;
    public TuxTextView LLJ;
    public ImageView LLJI;
    public C1443100nem LLJIJIL;
    public TextView LLJILJIL;
    public View LLJILJILJ;
    public C1439700nZI LLJILLL;
    public final boolean LLJJ;
    public boolean LLJJI;
    public final AwemeDraft LLJJIII;

    public final void LIZJ() {
        String schema = this.LLILLL.getSchema();
        if (C123100dR.LIZ(schema)) {
            this.LLJJI = true;
            InterfaceC1442990neb interfaceC1442990neb = this.LLILLL;
            ((C1445870njF) interfaceC1442990neb).LLJI = true;
            interfaceC1442990neb.LJIILIIL(false, false);
            SmartRouter.buildRoute(this.LL, schema).open();
            return;
        }
        this.LLJJI = true;
        InterfaceC1442990neb interfaceC1442990neb2 = this.LLILLL;
        ((C1445870njF) interfaceC1442990neb2).LLJI = true;
        interfaceC1442990neb2.LJIILIIL(false, false);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", "publish");
        c0lab.LJ("creation_id", this.LLJJIII.LIZ());
        c0lab.LIZ(this.LLJJ ? 1 : 0, "is_new_style");
        c0lab.LJ("enter_from", "toast");
        C20684815ws.LJIILLIIL("publish_retry", c0lab.LIZ);
        if (this.LLJJ) {
            C1439650nZD.LIZJ = true;
            C0CHQ.LIZ().getPublishService().LJIIL().LJFF(this.LL, this.LLJJIII, this.LLILLJJLI.LIZIZ);
            C1439700nZI c1439700nZI = this.LLJILLL;
            if (c1439700nZI != null) {
                c1439700nZI.LIZLLL.execute(new ARunnableS91S0200000_22(c1439700nZI, this.LLILLJJLI.LIZIZ, 48));
                return;
            }
            return;
        }
        C1439650nZD.LJFF = true;
        C0CHQ.LIZ().getPublishService().LJIIL().LJFF(this.LL, this.LLJJIII, this.LLILLJJLI.LIZIZ);
        C1439700nZI c1439700nZI2 = this.LLJILLL;
        if (c1439700nZI2 != null) {
            c1439700nZI2.LIZLLL.execute(new ARunnableS91S0200000_22(c1439700nZI2, this.LLILLJJLI.LIZIZ, 47));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0nem] */
    @Override // X.InterfaceC1445880njG
    public final void LIZ(Bitmap bitmap) {
        String str;
        int size;
        List<SingleImageData> imageList;
        C0MZ9.LJIIIIZZ(this.LLJJIII, null, new IEffectService.OnVideoCoverCallback() { // from class: X.0nen
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i) {
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap2) {
                C1443060nei c1443060nei = this.LIZ;
                ImageView imageView = c1443060nei.LLIZ;
                if (imageView != null) {
                    HandlerHook.viewPost(imageView, new ARunnableS55S0300000_22(imageView, bitmap2, c1443060nei, 15));
                }
            }
        });
        if (this.LLJJIII.LJIIL() && !this.LLJJIII.LJIILL()) {
            if (this.LLJJIII.LJIILL()) {
                ImageAlbumData imageAlbumData = this.LLJJIII.LJJJJIZL.imageAlbumData;
                if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                    size = imageList.size();
                } else {
                    size = 1;
                }
                TextView textView = this.LLJILJIL;
                if (textView != null) {
                    textView.setText(this.LL.getResources().getQuantityString(2131755377, size));
                }
            } else {
                TextView textView2 = this.LLJILJIL;
                if (textView2 != null) {
                    textView2.setText(this.LL.getString(2131829548));
                }
            }
        }
        if (!this.LLJJ) {
            C786410Ut5.Q7(this.LLJI, new ACListenerS156S0100000_22(this, 68));
        }
        this.LLJIJIL = new IDraftListener() { // from class: X.0nem
            @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onDeleted(AwemeDraft awemeDraft) {
                if (TextUtils.equals(awemeDraft.LIZJ(), this.LIZ.LLJJIII.LIZJ())) {
                    this.LIZ.LLILLL.LJIILIIL(false, false);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onUpdated(IDraftListener.UpdateParams updateParams) {
                IDraftListener.DefaultImpls.onUpdated(this, updateParams);
            }
        };
        C0CHQ.LIZ().LJI().LIZ().registerListener(this.LLJIJIL);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LLJJIII.LIZ());
        c0lab.LIZ(this.LLJJ ? 1 : 0, "is_new_style");
        c0lab.LJ("shoot_way", this.LLJJIII.LJJJJIZL.shootWay);
        c0lab.LIZ(this.LLJJIII.LIZ.postPageModel.isDirectPublishByCC ? 1 : 0, "is_cc_direct_post");
        c0lab.LIZ(this.LLJJIII.LIZ.postPageModel.isFromCC, "is_from_cc");
        PublishFailureReason publishFailureReason = this.LLILLJJLI.LIZIZ;
        if (publishFailureReason == null) {
            str = "null_cause";
        } else if (publishFailureReason.isServerException) {
            str = "api_error";
        } else {
            C1434650nR9 c1434650nR9 = publishFailureReason.cause;
            if (c1434650nR9 != null && c1434650nR9.isCauseByNoSpaceLeft()) {
                str = "no_space_left";
            } else {
                C1434650nR9 c1434650nR92 = publishFailureReason.cause;
                if (c1434650nR92 != null && c1434650nR92.isUserNetworkBad()) {
                    str = "user_network_bad";
                } else {
                    str = "default";
                }
            }
        }
        c0lab.LJ("reason", str);
        c0lab.LIZ(this.LLILZLL.ccNotAllowDirectPost ? 1 : 0, "cc_not_allow_direct_post");
        C20684815ws.LJIILLIIL("publish_retry_show", c0lab.LIZ);
    }

    @Override // X.InterfaceC1445880njG
    public final void LIZIZ(boolean z, boolean z2) {
        if (this.LLILLL.isShowing()) {
            if (this.LLILZIL) {
                if (!this.LLJJIII.LJIILL() || this.LLJJI || z2) {
                    C0CHQ.LIZ().getPublishService().LJIIL();
                    C1436830nUf.LJIJI(new C572660Md6(this.LLJJIII));
                }
            } else if (!z) {
                C0CHQ.LIZ().getPublishService().LJIIL().LIZJ();
            }
            if (!this.LLJJI && !z2) {
                C1435600nSg.LJIIIZ(this.LLJJIII.LIZJ());
            }
            C1444780nhU.LIZ();
            C201955140j.LJIIL("Publish | remove recover path by dismiss panel");
        }
        if (this.LLJIJIL != null) {
            C0CHQ.LIZ().LJI().LIZ().unregisterListener(this.LLJIJIL);
            this.LLJIJIL = null;
        }
    }

    @Override // X.InterfaceC1445880njG
    public final void setText(String str, String str2) {
        TextView textView = this.LLJILJIL;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public C1443060nei(C19EG c19eg, C1439050nYF c1439050nYF, InterfaceC1442990neb interfaceC1442990neb, View view, boolean z, PublishFailMsg publishFailMsg) {
        boolean z2;
        TuxTextView tuxTextView;
        this.LL = c19eg;
        this.LLILLJJLI = c1439050nYF;
        this.LLILLL = interfaceC1442990neb;
        this.LLILZ = view;
        this.LLILZIL = z;
        this.LLILZLL = publishFailMsg;
        if ((interfaceC1442990neb instanceof C1445870njF) && ((C1445870njF) interfaceC1442990neb).LJJIIJZLJL()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJJ = z2;
        AwemeDraft awemeDraft = c1439050nYF.LIZ;
        this.LLJJIII = awemeDraft;
        this.LLIZ = (ImageView) view.findViewById(R.id.ld7);
        this.LLIZLLLIL = (ImageView) view.findViewById(R.id.lc0);
        this.LLJILJIL = (TextView) view.findViewById(R.id.tv_tips);
        View viewFindViewById = view.findViewById(R.id.tv_title);
        if (viewFindViewById instanceof TuxTextView) {
            tuxTextView = (TuxTextView) viewFindViewById;
        } else {
            tuxTextView = null;
        }
        this.LLJ = tuxTextView;
        if (C123100dR.LIZ(publishFailMsg.publishFailedString)) {
            TextView textView = this.LLJILJIL;
            if (textView != null) {
                textView.setText(publishFailMsg.publishFailedString);
            }
            TuxTextView tuxTextView2 = this.LLJ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
            TuxTextView tuxTextView3 = this.LLJ;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(view.getContext().getString(2131836204));
            }
        }
        ImageView imageView = this.LLIZLLLIL;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS156S0100000_22(this, 66));
        }
        if (!z2) {
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.k31));
            this.LLJILJILJ = view.findViewById(R.id.xz7);
            C786410Ut5.LLIL((TextView) view.findViewById(R.id.tv_publish_retry), 8);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.lt5);
            this.LLJI = imageView2;
            C786410Ut5.LJZI(0, imageView2);
        }
        view.findViewById(R.id.tv_video_count);
        if (!z) {
            C1439700nZI c1439700nZI = new C1439700nZI(c19eg, awemeDraft.LIZJ());
            this.LLJILLL = c1439700nZI;
            c1439700nZI.LIZJ = c1439700nZI.LIZLLL.submit(CallableC535380KzA.LL);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        C786410Ut5.x3(relativeLayout.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1466720oGs(relativeLayout, this, view, 1));
    }
}
