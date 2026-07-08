package X;

import Y.AfS172S0100000_3;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C529590Kpp extends C529620Kps {
    public final /* synthetic */ C529180KpA LLJJJ;

    @Override // X.C529620Kps
    public void P5(ViewGroup viewGroup) {
        int iIntValue;
        super.P5(viewGroup);
        RoundedFrameLayout roundedFrameLayout = this.LLILLJJLI;
        if (roundedFrameLayout != null) {
            roundedFrameLayout.setRadius(C366700EZg.LIZ(6.0d));
        }
        this.LLILZIL.setGravity(17);
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(R.drawable.fhk);
        }
        TuxTextView tuxTextView = this.LLILZIL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, tuxTextView.getContext());
        int iIntValue2 = -1;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        tuxTextView.setTextColor(iIntValue);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, viewGroup.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        this.LLJ.setBackground(C426580Go4.LIZJ(iIntValue2, 0, (int) C11VU.LIZIZ(2.0f, viewGroup.getContext()), (int) C11VU.LIZIZ(6.0f, viewGroup.getContext())));
        C786410Ut5.LJZI(8, this.LLJJ);
        C786410Ut5.LJLLLLLL(0, this.LLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529590Kpp(C529180KpA c529180KpA, ViewGroup viewGroup) {
        super(c529180KpA, viewGroup);
        this.LLJJJ = c529180KpA;
    }

    public final void T5(final TikTokMediaModel tikTokMediaModel, C529590Kpp c529590Kpp, int i) {
        String str;
        long j;
        I5(tikTokMediaModel, c529590Kpp, i);
        int i2 = 8;
        C786410Ut5.LJLLLLLL(8, this.LLJJIII);
        C786410Ut5.LLLLZLL(this.LLILZIL, 0);
        long j2 = 0;
        if (tikTokMediaModel != null) {
            C529180KpA c529180KpA = this.LLJJJ;
            if (!c529180KpA.LLLLLJLJLL(i)) {
                j = 0;
            } else {
                j = ((CutSameVideoImageExtraData) ListProtector.get(c529180KpA.LLILLJJLI, i)).extraDuration;
            }
            tikTokMediaModel.clipDuration = j;
        }
        if (this.LLJJJ.LLLLIIIILLL(tikTokMediaModel)) {
            if (tikTokMediaModel != null) {
                tikTokMediaModel.canClip = false;
            }
            C786410Ut5.LJLLLLLL(8, this.LLIZ);
            C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
            C529180KpA c529180KpA2 = this.LLJJJ;
            if (!c529180KpA2.LLLLLJLJLL(i)) {
                str = null;
            } else {
                str = ((CutSameVideoImageExtraData) ListProtector.get(c529180KpA2.LLILLJJLI, i)).materialType;
            }
            if (Intrinsics.LJFF(str, "video")) {
                this.LLJIJIL.setIconRes(R.raw.icon_video_fill);
                C339190DRl.LIZLLL(this.LLJIJIL);
            } else if (Intrinsics.LJFF(str, "image")) {
                this.LLJIJIL.setIconRes(R.raw.icon_image_alt_1_fill);
                C339190DRl.LIZLLL(this.LLJIJIL);
            } else {
                C339190DRl.LIZIZ(this.LLJIJIL);
            }
            View view = this.LLJ;
            if (i == this.LLJJJ.LLJILJIL) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        } else {
            C786410Ut5.LJLLLLLL(0, this.LLIZ);
            C339190DRl.LIZIZ(this.LLJIJIL);
            if (tikTokMediaModel != null) {
                if (tikTokMediaModel.isFromRecord) {
                    final float f = (tikTokMediaModel.height / tikTokMediaModel.width) * this.LLJJIJIIJIL;
                    AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0Kqk
                        @Override // X.InterfaceC300801Eo
                        public final void subscribe(InterfaceC2329309At<Bitmap> interfaceC2329309At) {
                            final C11KT c11kt = (C11KT) interfaceC2329309At;
                            VEUtils.getVideoFrames(tikTokMediaModel.LJFF(), new int[]{0}, this.LLJJIJIIJIL, (int) f, false, new InterfaceC1286300jZs() { // from class: X.0LC4
                                @Override // X.InterfaceC1286300jZs
                                public final boolean processFrame(ByteBuffer byteBuffer, int i3, int i4, int i5) {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                    bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                                    if (!bitmapCreateBitmap.isRecycled()) {
                                        c11kt.onSuccess(bitmapCreateBitmap);
                                        return false;
                                    }
                                    c11kt.tryOnError(new NullPointerException());
                                    return false;
                                }
                            });
                        }
                    }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS172S0100000_3(this.LLILLL, 15), new C09JN() { // from class: X.00QS
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("UgcTemplateVideoImageMixedAdapter$UgcTemplateVideoImageMixedViewHolder@995a.loadRecordCover$3");
                            C1C7U.LIZIZ("UgcTemplateVideoImageMixedAdapter$UgcTemplateVideoImageMixedViewHolder@995a.loadRecordCover$3");
                        }
                    });
                }
                if (!tikTokMediaModel.LJIIJ() && !tikTokMediaModel.isFromRecord && tikTokMediaModel.duration > tikTokMediaModel.clipDuration) {
                    C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
                    tikTokMediaModel.canClip = true;
                } else {
                    C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
                    tikTokMediaModel.canClip = false;
                }
            } else {
                C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
            }
            C786410Ut5.LJLLLLLL(8, this.LLJ);
        }
        C529180KpA c529180KpA3 = this.LLJJJ;
        if (c529180KpA3.LLLLLJLJLL(i)) {
            j2 = ((CutSameVideoImageExtraData) ListProtector.get(c529180KpA3.LLILLJJLI, i)).extraDuration;
        }
        float fFloatValue = new BigDecimal((j2 * 1.0f) / 1000.0f).setScale(1, 1).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.1f;
        }
        this.LLILZIL.setText(String.valueOf(fFloatValue));
    }
}
